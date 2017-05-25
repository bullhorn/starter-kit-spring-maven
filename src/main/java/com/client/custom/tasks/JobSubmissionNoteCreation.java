package com.client.custom.tasks;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import org.apache.log4j.Logger;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bullhornsdk.data.api.BullhornData;
import com.bullhornsdk.data.exception.RestApiException;
import com.bullhornsdk.data.model.entity.core.standard.JobOrder;
import com.bullhornsdk.data.model.entity.core.standard.JobSubmission;
import com.bullhornsdk.data.model.entity.core.standard.JobSubmissionHistory;
import com.bullhornsdk.data.model.entity.core.standard.Note;
import com.bullhornsdk.data.model.entity.core.standard.NoteEntity;
import com.bullhornsdk.data.model.entity.core.standard.Person;
import com.bullhornsdk.data.model.parameter.QueryParams;
import com.bullhornsdk.data.model.parameter.SearchParams;
import com.bullhornsdk.data.model.parameter.standard.ParamFactory;
import com.bullhornsdk.data.model.response.crud.CreateResponse;
import com.bullhornsdk.data.model.response.event.Event;
import com.bullhornsdk.data.model.response.event.GetEventsResponse;
import com.client.core.ApplicationSettings;
import com.client.core.base.util.Utility;
import com.client.core.scheduledtasks.model.helper.CustomSubscriptionEvent;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;

/**
 * Created by john.sullivan on 9/5/2017.
 */
@Service
public class JobSubmissionNoteCreation implements Runnable {

    private final Logger log = Logger.getLogger(getClass());

    private final ApplicationSettings applicationSettings;
    private final BullhornData bullhornData;

    @Autowired
    public JobSubmissionNoteCreation(ApplicationSettings applicationSettings, BullhornData bullhornData) {
        this.applicationSettings = applicationSettings;
        this.bullhornData = bullhornData;
    }

    private static final Set<String> JOB_SUBMISSION_FIELDS = Sets.newHashSet("candidate(id)", "jobOrder(id)");

    @Override
    public void run() {
        getJobSubmissionsModified().forEach((jobSubmissionID, eventTimestamp) -> {
            JobSubmission jobSubmission = bullhornData.findEntity(JobSubmission.class, jobSubmissionID, JOB_SUBMISSION_FIELDS);

            List<JobSubmissionHistory> statusChangesSinceEvent = getStatusChangesSinceTime(jobSubmissionID, eventTimestamp);

            if(!statusChangesSinceEvent.isEmpty()) {
                List<Note> notesSinceEvent = getNotesWithStatusesSinceTime(jobSubmission, statusChangesSinceEvent, eventTimestamp);

                Map<String, List<JobSubmissionHistory>> numberOfChangesPerStatus = statusChangesSinceEvent.parallelStream().collect(Collectors.groupingBy(JobSubmissionHistory::getStatus));
                Map<String, List<Note>> numberOfNotesPerStatus = notesSinceEvent.parallelStream().collect(Collectors.groupingBy(Note::getAction));

                numberOfChangesPerStatus.forEach((status, histories) -> {
                    List<Note> notes = Optional.ofNullable(numberOfNotesPerStatus.get(status)).orElse(Lists.newArrayList());

                    if (notes.size() < histories.size()) {
                        createMissingNotes(jobSubmission, notes, histories);
                    }
                });
            }
        });
    }

    private void createMissingNotes(JobSubmission jobSubmission, List<Note> notes, List<JobSubmissionHistory> histories) {
        Map<Integer, List<Note>> notesByCommenter = notes.parallelStream().collect(Collectors.groupingBy( note -> {
        	return note.getCommentingPerson().getId();
        }));

        Map<Integer, List<JobSubmissionHistory>> submissionCreators = histories.parallelStream().collect(Collectors.groupingBy( history -> {
        	return history.getModifyingUser().getId();
        }));

        submissionCreators.forEach( (corporateUserID, historiesForOwner) -> {
            List<Note> notesForOwner = Optional.ofNullable(notesByCommenter.get(corporateUserID)).orElse(Lists.newArrayList());

            if(notesForOwner.size() < historiesForOwner.size()) {
	            IntStream.range(0, historiesForOwner.size() - notesForOwner.size()).parallel().forEach( index -> {
	            	createNote(
	            			historiesForOwner.get(index).getStatus(),
				            corporateUserID,
				            jobSubmission.getCandidate().getId(),
				            jobSubmission.getJobOrder().getId(),
				            historiesForOwner.get(index).getDateAdded()
		            );
	            });
            }
        });
    }

    private void createNote(String status, Integer owner, Integer candidateID, Integer jobOrderID, DateTime dateAdded) {
    	Note note = new Note();

    	note.setAction(status);
    	note.setCommentingPerson(new Person(owner));
    	note.setPersonReference(new Person(candidateID));
    	note.setComments(status);
    	note.setJobOrder(new JobOrder(jobOrderID));
    	note.setDateAdded(dateAdded);

    	insertNote(note, "Error creating note for status '" + status + "' candidate #" + candidateID + " job #" + jobOrderID);
    }

    private void insertNote(Note entity, String error) {
        try {
            CreateResponse response = bullhornData.insertEntity(entity);

            if (response.hasWarnings() || response.hasValidationErrors() || response.isError()) {
                log.error(error);
                log.error(response);
            }

            NoteEntity noteEntity = new NoteEntity();
            noteEntity.setNote(new Note(response.getChangedEntityId()));
            noteEntity.setTargetEntityID(entity.getJobOrder().getId());
            noteEntity.setTargetEntityName(JobOrder.class.getSimpleName());

            response = bullhornData.insertEntity(noteEntity);

            if (response.hasWarnings() || response.hasValidationErrors() || response.isError()) {
                log.error(error);
                log.error(response);
            }
        } catch(RestApiException e) {
            log.error(error, e);
        }
    }

    private static final Set<String> HISTORY_FIELDS = Sets.newHashSet("status", "dateAdded", "modifyingUser(id)");

    private List<JobSubmissionHistory> getStatusChangesSinceTime(Integer jobSubmissionID, DateTime time) {
        String where = new StringBuilder("jobSubmission.id = ").append(jobSubmissionID)
                .append(" AND dateAdded > ").append(time.minusSeconds(5).getMillis()).toString();

        QueryParams params = ParamFactory.queryParams();
        params.setCount(500);

        return bullhornData.queryForList(JobSubmissionHistory.class, where, HISTORY_FIELDS, params);
    }

    private static final Set<String> NOTE_FIELDS = Sets.newHashSet("action", "commentingPerson(id)");

    private List<Note> getNotesWithStatusesSinceTime(JobSubmission jobSubmission, List<JobSubmissionHistory> statusChanges, DateTime time) {
        String statusesOrSeparated = statusChanges.parallelStream().map(JobSubmissionHistory::getStatus)
                .map(Utility::escapeWhitespaceForSearch).map(value -> value + "*").collect(Collectors.joining(" OR "));

        String query = new StringBuilder("candidateUserID:").append(jobSubmission.getCandidate().getId())
                .append(" AND jobOrderID:").append(jobSubmission.getJobOrder().getId())
                .append(" AND dateAdded:[").append(Utility.formatDateForSearch(time.minusSeconds(5))).append(" TO *]")
                .append(" AND action:(")
                .append(statusesOrSeparated).append(")").toString();

        SearchParams params = ParamFactory.searchParams();
        params.setCount(500);

        return bullhornData.searchForList(Note.class, query, NOTE_FIELDS, params);
    }

    private static final int BATCH_SIZE = 500;

    private static final GetEventsResponse DEFAULT_RESPONSE = new GetEventsResponse() {
		@Override
		public Integer getRequestId() {
			return -1;
		}

		@Override
		public List getEvents() {
			return Lists.newArrayList();
		}
	};

    private Map<Integer, DateTime> getJobSubmissionsModified() {
        Map<Integer, DateTime> result = Maps.newLinkedHashMap();
        Boolean hasMore = true;

        while(hasMore) {
            GetEventsResponse eventResponse = bullhornData.getEvents(applicationSettings.getStandardSubscriptionName(), BATCH_SIZE);

            if(eventResponse == null) {
	            eventResponse = DEFAULT_RESPONSE;
            }

            log.info("Running JobSubmissionNoteCreation, got "+eventResponse.getEvents().size()+" events.");

            Map<Integer, DateTime> batch = filterAndConvert(eventResponse).stream().collect(
                    Collectors.groupingBy(
                            CustomSubscriptionEvent::getEntityId,
                            Collectors.reducing(
                                    BinaryOperator.minBy(
                                            Comparator.comparing(CustomSubscriptionEvent::getEventTimestamp)
                                    )
                            )
                    )
            ).entrySet().parallelStream().filter( entry -> entry.getValue().isPresent()).collect(
                    Collectors.toMap(
                            Map.Entry::getKey,
                            entry -> entry.getValue().get().getEventTimestamp().withZone(DateTimeZone.forID("EST5EDT"))
                    )
            );

            result.putAll(batch);

            hasMore = BATCH_SIZE == eventResponse.getEvents().size();
        }

        return result;
    }

    private <T extends Event> List<CustomSubscriptionEvent> filterAndConvert(GetEventsResponse eventResponse) {
        List<T> events = eventResponse.getEvents();

        return events.parallelStream().map( event -> {
            return CustomSubscriptionEvent.instantiateFromEvent(event, applicationSettings.getStandardSubscriptionName(), eventResponse.getRequestId(), false);
        }).filter( event -> {
            return applicationSettings.getApiUserID() != event.getUpdatingUserId();
        }).collect(Collectors.toList());
    }


}
