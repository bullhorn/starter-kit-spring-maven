package com.client.core.scheduledtasks.model.helper;

import java.util.Arrays;
import java.util.Map;
import java.util.Set;

import org.apache.log4j.Logger;

import com.bullhornsdk.data.api.BullhornData;
import com.bullhornsdk.data.model.entity.core.standard.Appointment;
import com.bullhornsdk.data.model.entity.core.standard.Candidate;
import com.bullhornsdk.data.model.entity.core.standard.CandidateEducation;
import com.bullhornsdk.data.model.entity.core.standard.CandidateReference;
import com.bullhornsdk.data.model.entity.core.standard.CandidateWorkHistory;
import com.bullhornsdk.data.model.entity.core.standard.ClientContact;
import com.bullhornsdk.data.model.entity.core.standard.ClientCorporation;
import com.bullhornsdk.data.model.entity.core.standard.CorporateUser;
import com.bullhornsdk.data.model.entity.core.standard.JobOrder;
import com.bullhornsdk.data.model.entity.core.standard.JobSubmission;
import com.bullhornsdk.data.model.entity.core.standard.Note;
import com.bullhornsdk.data.model.entity.core.standard.Opportunity;
import com.bullhornsdk.data.model.entity.core.standard.Placement;
import com.bullhornsdk.data.model.entity.core.standard.PlacementChangeRequest;
import com.bullhornsdk.data.model.entity.core.standard.PlacementCommission;
import com.bullhornsdk.data.model.entity.core.standard.Sendout;
import com.bullhornsdk.data.model.entity.core.standard.Task;
import com.bullhornsdk.data.model.entity.core.type.BullhornEntity;
import com.bullhornsdk.data.model.entity.core.type.UpdateEntity;
import com.bullhornsdk.data.model.entity.embedded.UserType;
import com.client.core.AppContext;
import com.client.core.base.tools.copy.KryoObjectCopyHelper;
import com.google.common.collect.Maps;

public abstract class AbstractScheduledTaskHelper<E extends BullhornEntity> implements ScheduledTaskHelper<E> {

    private final Logger log = Logger.getLogger(getClass());

	private final BullhornData bullhornData;
	private final CustomSubscriptionEvent event;

	private final Map<String, UpdateEntity> allEntitiesToSaveBackToBH;

    private final Class<E> type;

    private E entity;
	private CorporateUser updatingUser;
    private UserType updatingUserUserType;

	public AbstractScheduledTaskHelper(CustomSubscriptionEvent event, Class<E> type) {
		super();
		this.bullhornData = AppContext.getApplicationContext().getBean("bullhornData", BullhornData.class);
		this.event = event;
        this.type = type;
		this.allEntitiesToSaveBackToBH = Maps.newHashMap();
	}

	public AbstractScheduledTaskHelper(CustomSubscriptionEvent event, Class<E> type, BullhornData bullhornData) {
		this.bullhornData = bullhornData;
		this.event = event;
        this.type = type;
        this.allEntitiesToSaveBackToBH = Maps.newHashMap();
	}

    @Override
    public E getEntity() {
        if(entity == null) {
            entity = bullhornData.findEntity(type, getEvent().getEntityId());
        }

        return entity;
    }
    @Override
    public CustomSubscriptionEvent getEvent() {
        return event;
    }

    @Override
    public boolean fieldWasUpdated(String... fieldsToCheck) {
        Set<String> updatedProperties = event.getUpdatedProperties();

        if (updatedProperties == null || updatedProperties.size() < 1) {
            return false;
        }

        if (fieldsToCheck == null || fieldsToCheck.length < 1) {
            return false;
        }

        for (String field : Arrays.asList(fieldsToCheck)) {
            if (updatedProperties.contains(field)) {
                return true;
            }
        }

        return false;
    }

    @Override
    public Map<String, ? extends UpdateEntity> getAllEntitiesToSave() {
        return allEntitiesToSaveBackToBH;
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
    public BullhornData getBullhornData() {
        return bullhornData;
    }

    /**
	 * Gets the CorporateUserDto for the person who saved the entity, if updatingUser == null then makes api call, otherwise returns
	 * updatingUser instance variable.
	 * 
	 * @return the CorporateUserDto of the updating user
	 */
	public CorporateUser getUpdatingUser() {
		if (updatingUser == null) {
			setUpdatingUser(findCorporateUser(event.getUpdatingUserId()));
		}

		return updatingUser;
	}

	public void setUpdatingUser(CorporateUser updatingUser) {
		this.updatingUser = updatingUser;
	}

    public UserType getUpdatingUserUserType() {
        if (updatingUserUserType == null) {
            UserType userType = findEntity(UserType.class, getUpdatingUser().getUserType().getId());

            setUpdatingUserUserType(userType);
        }

        return updatingUserUserType;
    }

    public void setUpdatingUserUserType(UserType updatingUserUserType) {
        this.updatingUserUserType = updatingUserUserType;
    }

    public <T extends BullhornEntity> T findEntity(Class<T> type, Integer id) {
        if (id == null) {
            throw new IllegalArgumentException("Must pass in a non-null id to findEntity");
        }

        return bullhornData.findEntity(type, id);
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
		return findEntity(Appointment.class, id);
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
        return findEntity(CorporateUser.class, id);
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
        return findEntity(Candidate.class, id);
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
        return findEntity(CandidateEducation.class, id);
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
        return findEntity(CandidateReference.class, id);
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
        return findEntity(CandidateWorkHistory.class, id);
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
        return findEntity(ClientCorporation.class, id);
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
        return findEntity(ClientContact.class, id);
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
        return findEntity(JobSubmission.class, id);
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
        return findEntity(JobOrder.class, id);
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
        return findEntity(Opportunity.class, id);
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
        return findEntity(Note.class, id);
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
        return findEntity(Placement.class, id);
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
        return findEntity(PlacementChangeRequest.class, id);
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
        return findEntity(PlacementCommission.class, id);
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
        return findEntity(Task.class, id);
	}

	/**
	 * Makes api call to bullhorn.
	 * 
	 * throws IllegalArgumentException if an error occured with the api call or if no entity with passed in id exists.
	 * 
	 * @param id
	 * @return the dto
	 */
	public UserType findUserType(Integer id) {
        return findEntity(UserType.class, id);
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
        return findEntity(Sendout.class, id);
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
