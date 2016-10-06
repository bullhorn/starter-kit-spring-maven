package com.client.core.scheduledtasks.model.helper;

import com.bullhorn.entity.user.UserTypeDto;
import com.bullhornsdk.data.api.BullhornData;
import com.bullhornsdk.data.model.entity.core.standard.*;
import com.bullhornsdk.data.model.entity.core.type.UpdateEntity;
import com.client.core.AppContext;
import com.client.core.base.tools.copy.KryoObjectCopyHelper;
import com.client.core.soap.model.SubscriptionEvent;
import com.client.core.soap.service.BullhornAPI;
import com.google.common.collect.Sets;
import org.apache.log4j.Logger;

import java.util.*;

public abstract class AbstractScheduledTaskHelper implements ScheduledTaskHelper {

	private final BullhornData bullhornData;
	private final BullhornAPI bullhornApiSoap;
	private final StandardEvent event;
	private final Map<String, UpdateEntity> allEntitiesToSaveBackToBH;

	private CorporateUser updatingUser;
	private final Logger log = Logger.getLogger(AbstractScheduledTaskHelper.class);

	public AbstractScheduledTaskHelper(StandardEvent event) {
		super();
		this.bullhornData = AppContext.getApplicationContext().getBean("bullhornData", BullhornData.class);
		this.bullhornApiSoap = AppContext.getApplicationContext().getBean("bullhornapi", BullhornAPI.class);
		this.event = event;
		this.allEntitiesToSaveBackToBH = new HashMap<String, UpdateEntity>();
	}

	public AbstractScheduledTaskHelper(StandardEvent event, BullhornData bullhornData) {
		this.bullhornData = bullhornData;
		this.bullhornApiSoap = AppContext.getApplicationContext().getBean("bullhornapi", BullhornAPI.class);
		this.event = event;
		this.allEntitiesToSaveBackToBH = new HashMap<String, UpdateEntity>();
	}

	@Override
	public <T extends UpdateEntity> T getOneEntityToSave(T entity) {

		@SuppressWarnings("unchecked")
		T entityToSave = (T) allEntitiesToSaveBackToBH.get(entity.getClass().getSimpleName() + entity.getId());

		if (entityToSave == null) {

			entityToSave = KryoObjectCopyHelper.copy(entity);
			allEntitiesToSaveBackToBH.put(entity.getClass().getSimpleName() + entity.getId(), entityToSave);

		}

		return entityToSave;
	}

	@Override
	public boolean fieldWasUpdated(String... fieldsToCheck) {
		List<String> updatedProperties = event.getUpdatedProperties();

		if (updatedProperties == null || updatedProperties.size() < 1) {
			return false;
		}

		if (fieldsToCheck == null || fieldsToCheck.length < 1) {
			return false;
		}

		Set<String> updatedPropertiesAsSet = Sets.newHashSet(updatedProperties);

		for (String field : Arrays.asList(fieldsToCheck)) {
			if (updatedPropertiesAsSet.contains(field)) {
				return true;
			}
		}

		return false;

	}

	/**
	 * Gets the CorporateUserDto for the person who saved the entity, if updatingUser == null then makes api call, otherwise returns
	 * updatingUser instance variable.
	 * 
	 * @return the CorporateUserDto of the updating user
	 */
	public CorporateUser getUpdatingUser() {
		if (updatingUser == null) {
			setUpdatingUser(findCorporateUser(Integer.parseInt(event.getEventMetadata().get("userID"))));
		}
		return updatingUser;
	}

	public void setUpdatingUser(CorporateUser updatingUser) {
		this.updatingUser = updatingUser;
	}

	@Override
	public Map<String, ? extends UpdateEntity> getAllEntitiesToSave() {
		return allEntitiesToSaveBackToBH;
	}

	public BullhornData getBullhornData() {
		return bullhornData;
	}

	@Override
	public StandardEvent getEvent() {
		return event;
	}

	/**
	 * Makes api call to bullhorn.
	 *
	 * throws IllegalArgumentException if an error occured with the api call or if no entity with passed in id exists.
	 * 
	 * @param id
	 * @return the dto
	 */
	public Appointment findAppointment(Integer id) {
		if (id == null) {
			return handleNullId(Appointment.class, id);
		}

		Appointment appointment = null;
		try {
			appointment = bullhornData.findEntity(Appointment.class, id);
		} catch (Exception e) {
			handleBhApiError("appointment", id, e);
		}

		if (appointment == null) {
			handleBhApiError("appointment", id, null);
		}
		return appointment;
	}

	/**
	 * Makes api call to bullhorn.
	 * 
	 * throws IllegalArgumentException if an error occured with the api call or if no entity with passed in id exists.
	 * 
	 * @param id
	 * @return the dto
	 */
	public CorporateUser findCorporateUser(Integer id) {
		if (id == null) {
			return handleNullId(CorporateUser.class, id);
		}

		CorporateUser corporateUser = null;
		try {
			corporateUser = bullhornData.findEntity(CorporateUser.class, id);
		} catch (Exception e) {
			handleBhApiError("corporate user", id, e);
		}

		if (corporateUser == null) {
			handleBhApiError("corporate user", id, null);
		}
		return corporateUser;
	}

	/**
	 * Makes api call to bullhorn.
	 * 
	 * throws IllegalArgumentException if an error occured with the api call or if no entity with passed in id exists.
	 * 
	 * @param id
	 * @return the dto
	 */
	public Candidate findCandidate(Integer id) {
		if (id == null) {
			return handleNullId(Candidate.class, id);
		}

		Candidate candidate = null;
		try {
			candidate = bullhornData.findEntity(Candidate.class, id);
		} catch (Exception e) {
			handleBhApiError("candidate", id, e);
		}

		if (candidate == null) {
			handleBhApiError("candidate", id, null);
		}

		return candidate;

	}

	/**
	 * Makes api call to bullhorn.
	 * 
	 * throws IllegalArgumentException if an error occured with the api call or if no entity with passed in id exists.
	 * 
	 * @param id
	 * @return the dto
	 */
	public CandidateEducation findCandidateEducation(Integer id) {
		if (id == null) {
			return handleNullId(CandidateEducation.class, id);
		}

		CandidateEducation candidateEducation = null;
		try {
			candidateEducation = bullhornData.findEntity(CandidateEducation.class, id);
		} catch (Exception e) {
			handleBhApiError("candidate education", id, e);
		}

		if (candidateEducation == null) {
			handleBhApiError("candidate education", id, null);
		}

		return candidateEducation;

	}

	/**
	 * Makes api call to bullhorn.
	 * 
	 * throws IllegalArgumentException if an error occured with the api call or if no entity with passed in id exists.
	 * 
	 * @param id
	 * @return the dto
	 */
	public CandidateReference findCandidateReference(Integer id) {
		if (id == null) {
			return handleNullId(CandidateReference.class, id);
		}

		CandidateReference candidateReference = null;
		try {
			candidateReference = bullhornData.findEntity(CandidateReference.class, id);
		} catch (Exception e) {
			handleBhApiError("candidate reference", id, e);
		}

		if (candidateReference == null) {
			handleBhApiError("candidate reference", id, null);
		}

		return candidateReference;

	}

	/**
	 * Makes api call to bullhorn.
	 *
	 * throws IllegalArgumentException if an error occured with the api call or if no entity with passed in id exists.
	 * 
	 * @param id
	 * @return the dto
	 */
	public CandidateWorkHistory findCandidateWorkHistory(Integer id) {
		if (id == null) {
			return handleNullId(CandidateWorkHistory.class, id);
		}

		CandidateWorkHistory candidateWorkHistory = null;
		try {
			candidateWorkHistory = bullhornData.findEntity(CandidateWorkHistory.class, id);
		} catch (Exception e) {
			handleBhApiError("candidate work history", id, e);
		}

		if (candidateWorkHistory == null) {
			handleBhApiError("candidate work history", id, null);
		}

		return candidateWorkHistory;
	}

	/**
	 * Makes api call to bullhorn.
	 *
	 * throws IllegalArgumentException if an error occured with the api call or if no entity with passed in id exists.
	 * 
	 * @param id
	 * @return the dto
	 */
	public ClientCorporation findClientCorporation(Integer id) {
		if (id == null) {
			return handleNullId(ClientCorporation.class, id);
		}

		ClientCorporation clientCorporation = null;
		try {
			clientCorporation = bullhornData.findEntity(ClientCorporation.class, id);

		} catch (Exception e) {
			handleBhApiError("client corporation", id, e);
		}

		if (clientCorporation == null) {
			handleBhApiError("client corporation", id, null);
		}
		return clientCorporation;
	}

	/**
	 * Makes api call to bullhorn.
	 *
	 * throws IllegalArgumentException if an error occured with the api call or if no entity with passed in id exists.
	 * 
	 * @param id
	 * @return the dto
	 */
	public ClientContact findClientContact(Integer id) {
		if (id == null) {
			return handleNullId(ClientContact.class, id);
		}

		ClientContact clientContact = null;
		try {
			clientContact = bullhornData.findEntity(ClientContact.class, id);

		} catch (Exception e) {
			handleBhApiError("client contact", id, e);
		}

		if (clientContact == null) {
			handleBhApiError("client contact", id, null);
		}
		return clientContact;
	}

	/**
	 * Makes api call to bullhorn.
	 *
	 * throws IllegalArgumentException if an error occured with the api call or if no entity with passed in id exists.
	 * 
	 * @param id
	 * @return the dto
	 */
	public JobSubmission findJobSubmission(Integer id) {
		if (id == null) {
			return handleNullId(JobSubmission.class, id);
		}
		JobSubmission jobSubmission = null;

		try {
			jobSubmission = bullhornData.findEntity(JobSubmission.class, id);
		} catch (Exception e) {
			handleBhApiError("job submission", id, e);
		}

		if (jobSubmission == null) {
			handleBhApiError("job submission", id, null);
		}
		return jobSubmission;
	}

	/**
	 * Makes api call to bullhorn.
	 * 
	 * throws IllegalArgumentException if an error occured with the api call or if no entity with passed in id exists.
	 * 
	 * @param id
	 * @return the dto
	 */
	public JobOrder findJobOrder(Integer id) {

		if (id == null) {
			return handleNullId(JobOrder.class, id);
		}

		JobOrder jobOrder = null;

		try {
			jobOrder = bullhornData.findEntity(JobOrder.class, id);
		} catch (Exception e) {
			handleBhApiError("job", id, e);
		}

		if (jobOrder == null) {
			handleBhApiError("job", id, null);
		}
		return jobOrder;
	}

    /**
     * Makes api call to bullhorn.
     *
     * throws BullhornApiErrorException if an error occured with the api call or if no entity with passed in id exists.
     *
     * @param id
     * @return the dto
     */
    public Opportunity findOpportunity(Integer id) {

        if (id == null) {
            return handleNullId(Opportunity.class, id);
        }

        Opportunity opportunity = null;

        try {
            opportunity = bullhornData.findEntity(Opportunity.class, id);
        } catch (Exception e) {
            handleBhApiError("opportunity", id, e);
        }

        if (opportunity == null) {
            handleBhApiError("opportunity", id, null);
        }
        return opportunity;
    }

	/**
	 * Makes api call to bullhorn.
	 * 
	 * throws IllegalArgumentException if an error occured with the api call or if no entity with passed in id exists.
	 * 
	 * @param id
	 * @return the dto
	 */
	public Note findNote(Integer id) {
		if (id == null) {
			return handleNullId(Note.class, id);
		}
		Note note = null;

		try {
			note = bullhornData.findEntity(Note.class, id);
		} catch (Exception e) {
			handleBhApiError("note", id, e);
		}

		if (note == null) {
			handleBhApiError("note", id, null);
		}
		return note;
	}

	/**
	 * Makes api call to bullhorn.
	 * 
	 * throws IllegalArgumentException if an error occured with the api call or if no entity with passed in id exists.
	 * 
	 * @param id
	 * @return the dto
	 */
	public Placement findPlacement(Integer id) {
		if (id == null) {
			return handleNullId(Placement.class, id);
		}
		Placement placement = null;

		try {
			placement = bullhornData.findEntity(Placement.class, id);
		} catch (Exception e) {
			handleBhApiError("placement", id, e);
		}

		if (placement == null) {
			handleBhApiError("placement", id, null);
		}
		return placement;
	}

	/**
	 * Makes api call to bullhorn.
	 * 
	 * throws IllegalArgumentException if an error occured with the api call or if no entity with passed in id exists.
	 * 
	 * @param id
	 * @return the dto
	 */
	public PlacementChangeRequest findPlacementChangeRequest(Integer id) {
		if (id == null) {
			return handleNullId(PlacementChangeRequest.class, id);
		}
		PlacementChangeRequest placementChangeRequest = null;

		try {
			placementChangeRequest = bullhornData.findEntity(PlacementChangeRequest.class, id);
		} catch (Exception e) {
			handleBhApiError("placement change request", id, e);
		}

		if (placementChangeRequest == null) {
			handleBhApiError("placement change request", id, null);
		}
		return placementChangeRequest;
	}

	/**
	 * Makes api call to bullhorn.
	 * 
	 * throws IllegalArgumentException if an error occured with the api call or if no entity with passed in id exists.
	 * 
	 * @param id
	 * @return the dto
	 */
	public PlacementCommission findPlacementCommission(Integer id) {
		if (id == null) {
			return handleNullId(PlacementCommission.class, id);
		}
		PlacementCommission placementCommission = null;

		try {
			placementCommission = bullhornData.findEntity(PlacementCommission.class, id);
		} catch (Exception e) {
			handleBhApiError("placement commission", id, e);
		}

		if (placementCommission == null) {
			handleBhApiError("placement commission", id, null);
		}
		return placementCommission;
	}

	/**
	 * Makes api call to bullhorn.
	 * 
	 * throws IllegalArgumentException if an error occured with the api call or if no entity with passed in id exists.
	 * 
	 * @param id
	 * @return the dto
	 */
	public Task findTask(Integer id) {
		if (id == null) {
			return handleNullId(Task.class, id);
		}
		Task task = null;

		try {
			task = bullhornData.findEntity(Task.class, id);
		} catch (Exception e) {
			handleBhApiError("task", id, e);
		}

		if (task == null) {
			handleBhApiError("task", id, null);
		}
		return task;
	}

	/**
	 * Makes api call to bullhorn.
	 * 
	 * throws IllegalArgumentException if an error occured with the api call or if no entity with passed in id exists.
	 * 
	 * @param id
	 * @return the dto
	 */
	public UserTypeDto findUserType(Integer id) {
		if (id == null) {
			return handleNullId(UserTypeDto.class, id);
		}
		UserTypeDto userType = bullhornApiSoap.findUserType(id);

		try {
			userType = bullhornApiSoap.findUserType(id);
		} catch (Exception e) {
			handleBhApiError("user type", id, e);
		}

		if (userType == null) {
			handleBhApiError("user type", id, null);
		}

		return userType;
	}

	/**
	 * Makes api call to bullhorn.
	 * 
	 * throws IllegalArgumentException if an error occured with the api call or if no entity with passed in id exists.
	 * 
	 * @param id
	 * @return the dto
	 */
	public Sendout findSendout(Integer id) {
		if (id == null) {
			return handleNullId(Sendout.class, id);
		}

		Sendout sendout = null;

		try {
			sendout = bullhornData.findEntity(Sendout.class, id);
		} catch (Exception e) {
			handleBhApiError("sendout", id, e);
		}

		if (sendout == null) {
			handleBhApiError("sendout", id, null);
		}

		return sendout;
	}

	/**
	 * Handles the issue with a null id passed in.
	 * 
	 * @param type
	 *            class of entity
	 * @param id
	 *            id of entity
	 * @return currently returning null, could easily be switched to return a blank instance of T
	 */
	private <T> T handleNullId(Class<T> type, Integer id) {
		T entity = null;
		try {
			entity = type.newInstance();
		} catch (InstantiationException e) {
			log.error("Error instantiating class", e);
		} catch (IllegalAccessException e) {
			log.error("Error instantiating class", e);
		}

		return entity;
	}

	private void handleBhApiError(String entityName, Integer id, Exception e) {
		e.printStackTrace();
		throw new IllegalArgumentException("Error making BH api call while getting " + entityName + " :" + id, e);
	}

	@Override
	public String toString() {
		String NEW_LINE = System.getProperty("line.separator");

		return new StringBuilder().append(this.getClass().getName() + " Object {" + NEW_LINE)
		    .append(" event: " + event + NEW_LINE)
		    .append(" allEntitiesToSaveBackToBH: " + allEntitiesToSaveBackToBH + NEW_LINE)
		    .append("}").toString();
	}

}
