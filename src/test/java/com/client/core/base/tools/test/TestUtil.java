package com.client.core.base.tools.test;

import java.text.DateFormat;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.bullhorn.apiservice.query.DtoQuery;
import com.bullhorn.entity.AbstractDto;
import com.bullhorn.entity.ApiEntityName;
import com.bullhorn.entity.candidate.CandidateEducationDto;
import com.bullhorn.entity.candidate.CandidateReferenceDto;
import com.bullhorn.entity.candidate.CandidateWorkHistoryDto;
import com.bullhorn.entity.job.JobOrderDto;
import com.bullhornsdk.data.api.BullhornData;
import com.client.core.ApplicationSettings;
import com.client.core.formtrigger.model.form.impl.FormCandidateDto;
import com.client.core.formtrigger.model.form.impl.FormClientContactDto;
import com.client.core.formtrigger.model.form.impl.FormClientCorporationDto;
import com.client.core.formtrigger.model.form.impl.FormJobOrderDto;
import com.client.core.formtrigger.model.form.impl.FormJobSubmissionDto;
import com.client.core.formtrigger.model.form.impl.FormNoteDto;
import com.client.core.formtrigger.model.form.impl.FormPlacementChangeRequestDto;
import com.client.core.formtrigger.model.form.impl.FormPlacementDto;
import com.client.core.formtrigger.workflow.traversing.CandidateFormTriggerTraverser;
import com.client.core.formtrigger.workflow.traversing.ClientContactFormTriggerTraverser;
import com.client.core.formtrigger.workflow.traversing.ClientCorporationFormTriggerTraverser;
import com.client.core.formtrigger.workflow.traversing.JobOrderFormTriggerTraverser;
import com.client.core.formtrigger.workflow.traversing.JobSubmissionFormTriggerTraverser;
import com.client.core.formtrigger.workflow.traversing.NoteFormTriggerTraverser;
import com.client.core.formtrigger.workflow.traversing.PlacementChangeRequestFormTriggerTraverser;
import com.client.core.formtrigger.workflow.traversing.PlacementFormTriggerTraverser;
import com.client.core.scheduledtasks.model.helper.CustomSubscriptionEvent;
import com.client.core.scheduledtasks.tools.enumeration.EventType;
import com.client.core.scheduledtasks.workflow.traversing.impl.CandidateEventTraverser;
import com.client.core.scheduledtasks.workflow.traversing.impl.ClientContactEventTraverser;
import com.client.core.scheduledtasks.workflow.traversing.impl.JobOrderEventTraverser;
import com.client.core.scheduledtasks.workflow.traversing.impl.JobSubmissionEventTraverser;
import com.client.core.scheduledtasks.workflow.traversing.impl.PlacementChangeRequestEventTraverser;
import com.client.core.scheduledtasks.workflow.traversing.impl.PlacementEventTraverser;
import com.client.core.scheduledtasks.workflow.traversing.impl.SendoutEventTraverser;
import com.client.core.soap.service.BullhornAPI;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.joda.JodaModule;
import com.google.common.collect.Sets;

public class TestUtil {

	@Autowired
	private TestEntities testEntities;

	@Autowired
	private BullhornAPI bullhornApi;

	@Autowired
	private BullhornData bullhornData;

	@Autowired
	@Qualifier("appSettings")
	private ApplicationSettings appSettings;

	public TestUtil() {
		super();
	}

	public static CustomSubscriptionEvent event(Integer entityID, ApiEntityName entityName, EventType eventType, String[] updatedProperties,
												Integer updatingUserID) {
		CustomSubscriptionEvent event = new CustomSubscriptionEvent();
		event.setEntityId(entityID);
		event.setEntityName(entityName.value());
		event.setEventType(eventType.value());
		event.setUpdatingUserId(updatingUserID);

		if(updatedProperties != null) {
			event.setUpdatedProperties(Sets.newHashSet(updatedProperties));
		}

		return event;
	}

	public JobSubmissionEventTraverser jobSubmissionEventTraverser(EventType eventType, String[] updatedProperties) {
		CustomSubscriptionEvent event = TestUtil.event(getTestEntities().getJobSubmissionId(), ApiEntityName.JOB_SUBMISSION, eventType,
				updatedProperties, getTestEntities().getCorporateUserId());
		return jobSubmissionEventTraverser(event);
	}

	public SendoutEventTraverser sendoutEventTraverser(EventType eventType, String[] updatedProperties) {
		CustomSubscriptionEvent event = TestUtil.event(getTestEntities().getSendoutId(), ApiEntityName.SENDOUT, eventType, updatedProperties,
				getTestEntities().getCorporateUserId());
		return sendoutEventTraverser(event);
	}

	public PlacementEventTraverser placementEventTraverser(EventType eventType, String[] updatedProperties) {
		CustomSubscriptionEvent event = TestUtil.event(getTestEntities().getPlacementId(), ApiEntityName.PLACEMENT, eventType, updatedProperties,
				getTestEntities().getCorporateUserId());
		return placementEventTraverser(event);
	}

	public JobOrderEventTraverser jobEventTraverser(EventType eventType, String[] updatedProperties) {
		CustomSubscriptionEvent event = TestUtil.event(getTestEntities().getJobOrderId(), ApiEntityName.JOB_ORDER, eventType, updatedProperties,
				getTestEntities().getCorporateUserId());
		return jobEventTraverser(event);
	}

	public JobSubmissionEventTraverser jobSubmissionEventTraverser(CustomSubscriptionEvent event) {
		return new JobSubmissionEventTraverser(event, bullhornData);
	}

	public PlacementEventTraverser placementEventTraverser(CustomSubscriptionEvent event) {
		return new PlacementEventTraverser(event, bullhornData);
	}

	public PlacementChangeRequestEventTraverser placementChangeRequestEventTraverser(CustomSubscriptionEvent event) {
		return new PlacementChangeRequestEventTraverser(event, bullhornData);
	}

	public CandidateEventTraverser candidateEventTraverser(CustomSubscriptionEvent event) {
		return new CandidateEventTraverser(event, bullhornData);
	}

	public ClientContactEventTraverser clientContactEventTraverser(CustomSubscriptionEvent event) {
		return new ClientContactEventTraverser(event, bullhornData);
	}

	public SendoutEventTraverser sendoutEventTraverser(CustomSubscriptionEvent event) {
		return new SendoutEventTraverser(event, bullhornData);
	}

	public JobOrderEventTraverser jobEventTraverser(CustomSubscriptionEvent event) {
		return new JobOrderEventTraverser(event, bullhornData);
	}

	public JobSubmissionFormTriggerTraverser getJobSubmissionFormTriggerTraverser(String status, int candidateID) {
		FormJobSubmissionDto dto = new FormJobSubmissionDto();
		dto.setComments("Comments on submission");
		dto.setJobPostingID(getTestEntities().getJobOrderId().toString());
		dto.setJobResponseID(getTestEntities().getJobSubmissionId());
		dto.setSendingUserID(2);
        dto.setUserID(candidateID+"");
		dto.setStatus(status);
		JobSubmissionFormTriggerTraverser traverser = new JobSubmissionFormTriggerTraverser(dto, getTestEntities().getCorporateUserId(),
				true, bullhornData);

		return traverser;
	}

	public PlacementFormTriggerTraverser getPlacementFormTriggerTraverser(String status) {
		FormPlacementDto dto = new FormPlacementDto();
		dto.setJobPostingID(getTestEntities().getJobOrderId());
		dto.setUserID(getTestEntities().getCandidateId());
		dto.setPlacementID(getTestEntities().getPlacementId());
		dto.setStatus(status);
		PlacementFormTriggerTraverser traverser = new PlacementFormTriggerTraverser(dto, getTestEntities().getCorporateUserId(),
				true, bullhornData);

		return traverser;
	}

	public PlacementChangeRequestFormTriggerTraverser getPlacementChangeRequestFormTriggerTraverser(String status) {
		FormPlacementChangeRequestDto dto = new FormPlacementChangeRequestDto();

        dto.setPlacementChangeRequestID(getTestEntities().getPlacementChangeRequestId());
		dto.setPlacementID(getTestEntities().getPlacementId());
		dto.setStatus(status);

		PlacementChangeRequestFormTriggerTraverser traverser = new PlacementChangeRequestFormTriggerTraverser(dto, getTestEntities()
				.getCorporateUserId(), true, bullhornData);

		return traverser;
	}

	public JobOrderFormTriggerTraverser getJobFormTriggerTraverser() {
		FormJobOrderDto dto = new FormJobOrderDto();
		dto.setJobPostingID(getTestEntities().getJobOrderId());
		dto.setClientUserID(getTestEntities().getClientContactId());
		dto.setClientCorporationID(getTestEntities().getClientCorporationId());
		dto.setUserID(testEntities.getCorporateUserId());
		
		JobOrderFormTriggerTraverser traverser = new JobOrderFormTriggerTraverser(dto, getTestEntities().getCorporateUserId(),
				true, bullhornData);

		return traverser;
	}

	public CandidateFormTriggerTraverser getCandidateFormTriggerTraverser() {
		FormCandidateDto dto = new FormCandidateDto();
		dto.setUserID(getTestEntities().getCandidateId().toString());
		dto.setRecruiterUserID(getTestEntities().getCorporateUserId().toString());

		CandidateFormTriggerTraverser traverser = new CandidateFormTriggerTraverser(dto, getTestEntities().getCorporateUserId(),
				true, bullhornData);
		return traverser;
	}

	public ClientContactFormTriggerTraverser getClientContactFormTriggerTraverser() {
		FormClientContactDto dto = new FormClientContactDto();
		dto.setUserID(getTestEntities().getCandidateId());
		dto.setRecruiterUserID(getTestEntities().getCorporateUserId().toString());
		dto.setClientCorporationID(getTestEntities().getClientCorporationId());

		ClientContactFormTriggerTraverser traverser = new ClientContactFormTriggerTraverser(dto, getTestEntities().getCorporateUserId(),
				true, bullhornData);
		return traverser;
	}

	public ClientCorporationFormTriggerTraverser getClientCorporationFormTriggerTraverser() {
		FormClientCorporationDto dto = new FormClientCorporationDto();
		dto.setClientCorporationID(getTestEntities().getClientCorporationId());

		ClientCorporationFormTriggerTraverser traverser = new ClientCorporationFormTriggerTraverser(dto, getTestEntities()
				.getCorporateUserId(), true, bullhornData);
		return traverser;
	}

	public NoteFormTriggerTraverser getNoteFormTriggerTraverser() {
		FormNoteDto dto = new FormNoteDto();

        dto.setUserCommentID(getTestEntities().getNoteId());
		dto.setCommentingUserID(getTestEntities().getCorporateUserId());

		NoteFormTriggerTraverser traverser = new NoteFormTriggerTraverser(dto, getTestEntities().getCorporateUserId(),
				true, bullhornData);
		return traverser;
	}

	/**
	 * Returns a valid CandidateWorkHistoryDto
	 * 
	 * @return
	 */
	public CandidateWorkHistoryDto validWorkHistory() {

		CandidateWorkHistoryDto entity = findCandidateInfo(ApiEntityName.CANDIDATE_WORK_HISTORY);

		return entity;
	}

	/**
	 * Returns a valid CandidateEducationDto
	 * 
	 * @return
	 */
	public CandidateEducationDto validEducation() {

		CandidateEducationDto entity = findCandidateInfo(ApiEntityName.CANDIDATE_EDUCATION);

		return entity;
	}

	/**
	 * Returns a valid CandidateReferenceDto
	 * 
	 * @return
	 */
	public CandidateReferenceDto validReference() {

		CandidateReferenceDto entity = findCandidateInfo(ApiEntityName.CANDIDATE_REFERENCE);

		return entity;
	}

	/**
	 * Returns a valid JobOrderDto
	 * 
	 * @return
	 */
	public JobOrderDto validJob() {

		JobOrderDto entity = bullhornApi.findEntity(ApiEntityName.JOB_ORDER.value(), testEntities.getJobOrderId());

		return entity;
	}

	public <T extends AbstractDto> T findCandidateInfo(ApiEntityName entityName) {

		String whereClause = "userID = " + testEntities.getCandidateId() + " and isDeleted = 0";
		DtoQuery dtoQuery = new DtoQuery();
		dtoQuery.setEntityName(entityName.value());
		dtoQuery.setMaxResults(1);

		if (whereClause != null && whereClause.trim().length() > 0) {
			dtoQuery.setWhere(whereClause);
		}

		List<T> queryResult = bullhornApi.getQueryResults(entityName.value(), dtoQuery);

		return queryResult.get(0);

	}

	public static byte[] convertObjectToFormUrlEncodedBytes(Object object) {

		return convertObjectToFormUrlParameters(object).getBytes();
	}

	public static String convertObjectToFormUrlParameters(Object object) {
		ObjectMapper mapper = new ObjectMapper();
		mapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
		mapper.registerModule(new JodaModule());

		Map<String, Object> propertyValues = mapper.convertValue(object, Map.class);

		Set<String> propertyNames = propertyValues.keySet();
		Iterator<String> nameIter = propertyNames.iterator();

		StringBuilder formUrlEncoded = new StringBuilder();

		for (int index = 0; index < propertyNames.size(); index++) {
			String currentKey = nameIter.next();
			Object currentValue = propertyValues.get(currentKey);

			formUrlEncoded.append(currentKey);
			formUrlEncoded.append("=");
			formUrlEncoded.append(currentValue);

			if (nameIter.hasNext()) {
				formUrlEncoded.append("&");
			}
		}

		return formUrlEncoded.toString();
	}

	public static Map<String, ?> getPropertyValues(Object object, DateFormat dateFormat) {
		ObjectMapper mapper = new ObjectMapper();
		mapper.setDateFormat(dateFormat);
		mapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
		mapper.registerModule(new JodaModule());

		TypeReference<HashMap<String, ?>> typeRef = new TypeReference<HashMap<String, ?>>() {
		};

		Map<String, ?> returnValues = mapper.convertValue(object, typeRef);

		return returnValues;

	}

	public TestEntities getTestEntities() {
		return testEntities;
	}

	public void setTestEntities(TestEntities testEntities) {
		this.testEntities = testEntities;
	}

	public BullhornAPI getBullhornApi() {
		return bullhornApi;
	}

	public void setBullhornApi(BullhornAPI bullhornApi) {
		this.bullhornApi = bullhornApi;
	}

}
