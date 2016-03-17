package com.client.core.formtrigger.model.helper;

import java.util.List;
import java.util.Set;

import org.apache.log4j.Logger;

import com.bullhornsdk.data.api.BullhornData;
import com.bullhornsdk.data.model.entity.core.standard.Candidate;
import com.bullhornsdk.data.model.entity.core.standard.ClientContact;
import com.bullhornsdk.data.model.entity.core.standard.ClientCorporation;
import com.bullhornsdk.data.model.entity.core.standard.CorporateUser;
import com.bullhornsdk.data.model.entity.core.standard.JobOrder;
import com.bullhornsdk.data.model.entity.core.standard.JobSubmission;
import com.bullhornsdk.data.model.entity.core.standard.Note;
import com.bullhornsdk.data.model.entity.core.standard.Placement;
import com.bullhornsdk.data.model.entity.core.standard.PlacementChangeRequest;
import com.bullhornsdk.data.model.entity.core.standard.PlacementCommission;
import com.bullhornsdk.data.model.entity.core.type.BullhornEntity;
import com.bullhornsdk.data.model.entity.core.type.UpdateEntity;
import com.bullhornsdk.data.model.entity.embedded.UserType;
import com.bullhornsdk.data.model.parameter.QueryParams;
import com.bullhornsdk.data.model.parameter.standard.ParamFactory;
import com.bullhornsdk.data.model.response.crud.CrudResponse;
import com.client.core.formtrigger.model.form.AbstractFormDto;
import com.google.common.collect.Sets;

/**
 * Abstract implementation of FormTriggerHelper.  Provides basic functionality common to all FormTriggerHelpers.
 *
 * @param <T> The AbstractFormDto from the bullhorn form
 * @param <E> Bullhorn entity corresponding to the T
 */
public abstract class AbstractFormTriggerHelper<T extends AbstractFormDto<E>, E extends BullhornEntity> implements FormTriggerHelper<T, E> {

	private final BullhornData bullhornData;
	protected final Integer updatingUserID;
    protected T formValues;
	protected E newEntity;
	protected E oldEntity;
	protected CorporateUser updatingUser;
	protected UserType updatingUserUserType;
	protected final Logger log = Logger.getLogger(AbstractFormTriggerHelper.class);

	public AbstractFormTriggerHelper(T formValues, Integer updatingUserID, BullhornData bullhornData) {
		super();
        this.formValues = formValues;
		this.bullhornData = bullhornData;
		this.updatingUserID = updatingUserID;
	}

    /**
     * {@inheritDoc}
     */
	@Override
	public T getFormValues() {
        return this.formValues;
    }

    /**
     * {@inheritDoc}
     */
	@Override
	public E getNewEntity() {
        if(this.newEntity == null) {
            this.setNewEntity(this.formValues.instantiateEntity());
        }

        return this.newEntity;
    }


    /**
     * {@inheritDoc}
     */
	@Override
	public void setNewEntity(E newEntity) {
        this.newEntity = newEntity;
    }

    /**
     * {@inheritDoc}
     */
	@Override
	public E getOldEntity() {
        if(this.oldEntity == null) {
            E newEntity = this.getNewEntity();

            if(newEntity.getId() != null && newEntity.getId() > 0) {
                Class<E> newEntityClass = (Class<E>) newEntity.getClass();

                this.setOldEntity(this.findEntity(newEntityClass, newEntity.getId()));
            }
        }

        return this.oldEntity;
    }

    /**
     * {@inheritDoc}
     */
	@Override
	public void setOldEntity(E oldEntity) {
        this.oldEntity = oldEntity;
    }

    /**
     * {@inheritDoc}
     */
	@Override
	public Integer getUpdatingUserID() {
		return updatingUserID;
	}

    /**
     * {@inheritDoc}
     */
	@Override
	public CorporateUser getUpdatingUser() {
		if (updatingUser == null) {
			setUpdatingUser(findCorporateUser(updatingUserID));
		}

		return updatingUser;
	}

    /**
     * {@inheritDoc}
     */
	@Override
	public void setUpdatingUser(CorporateUser updatingUser) {
		this.updatingUser = updatingUser;
	}

	private final Set<String> userTypeFields = Sets.newHashSet("id","userType(id,name,description,enabled,isHidden,dateAdded)");

    /**
     * {@inheritDoc}
     */
	@Override
	public UserType getUpdatingUserUserType() {
		if (updatingUserUserType == null) {
			CorporateUser withUserType = findEntity(CorporateUser.class, getUpdatingUserID(), userTypeFields);

			setUpdatingUserUserType(withUserType.getUserType());
		}

		return updatingUserUserType;
	}

    /**
     * {@inheritDoc}
     */
	@Override
	public void setUpdatingUserUserType(UserType updatingUserUserType) {
		this.updatingUserUserType = updatingUserUserType;
	}

    /**
     * {@inheritDoc}
     */
	@Override
	public <U extends UpdateEntity> void saveDto(U entity) {
		CrudResponse response = bullhornData.updateEntity(entity);
		if (response.isError()) {
			if (entity == null) {
				log.error("Error saving entity because entity is null");
			} else {
				log.error("Error saving entity: " + entity.getClass().getSimpleName() + " " + entity.getId());
			}

		}
	}

    /**
     * Finds a CorporateUser given it's ID
     *
     * @param id the primary key id of the CorporateUser
     * @return the CorporateUser with the primary key if it exists, a new instance of the class otherwise
     */
	public CorporateUser findCorporateUser(Integer id) {
		return findEntity(CorporateUser.class, id);
	}

    /**
     * Finds a Candidate given it's ID
     *
     * @param id the primary key id of the Candidate
     * @return the Candidate with the primary key if it exists, a new instance of the class otherwise
     */
    public Candidate findCandidate(Integer id) {
        return findEntity(Candidate.class, id);
    }

    /**
     * Finds a ClientCorporation given it's ID
     *
     * @param id the primary key id of the ClientCorporation
     * @return the ClientCorporation with the primary key if it exists, a new instance of the class otherwise
     */
    public ClientCorporation findClientCorporation(Integer id) {
        return findEntity(ClientCorporation.class, id);
    }

    /**
     * Finds a ClientContact given it's ID
     *
     * @param id the primary key id of the ClientContact
     * @return the ClientContact with the primary key if it exists, a new instance of the class otherwise
     */
    public ClientContact findClientContact(Integer id) {
        return findEntity(ClientContact.class, id);
    }

    /**
     * Finds a Placement given it's ID
     *
     * @param id the primary key id of the Placement
     * @return the Placement with the primary key if it exists, a new instance of the class otherwise
     */
    public Placement findPlacement(Integer id) {
        return findEntity(Placement.class, id);
    }

    /**
     * Finds a JobSubmission given it's ID
     *
     * @param id the primary key id of the JobSubmission
     * @return the JobSubmission with the primary key if it exists, a new instance of the class otherwise
     */
    public JobSubmission findJobSubmission(Integer id) {
        return findEntity(JobSubmission.class, id);
    }

    /**
     * Finds a JobOrder given it's ID
     *
     * @param id the primary key id of the JobOrder
     * @return the JobOrder with the primary key if it exists, a new instance of the class otherwise
     */
    public JobOrder findJobOrder(Integer id) {
        return findEntity(JobOrder.class, id);
    }

    /**
     * Finds a Note given it's ID
     *
     * @param id the primary key id of the Note
     * @return the Note with the primary key if it exists, a new instance of the class otherwise
     */
    public Note findNote(Integer id) {
        return findEntity(Note.class, id);
    }

    /**
     * Finds a PlacementChangeRequest given it's ID
     *
     * @param id the primary key id of the PlacementChangeRequest
     * @return the PlacementChangeRequest with the primary key if it exists, a new instance of the class otherwise
     */
    public PlacementChangeRequest findPlacementChangeRequest(Integer id) {
        return findEntity(PlacementChangeRequest.class, id);
    }

    /**
     * Finds a Bullhorn Entity given it's ID and type
     *
     * @param type the type of entity to find
     * @param id the primary key id of the Bullhorn Entity
     * @return the entity with the primary key if it exists, a new instance of the class otherwise
     */
    public <RE extends BullhornEntity> RE findEntity(Class<RE> type, Integer id) {
        return findEntity(type, id, null);
    }

    /**
     * Finds a Bullhorn Entity given it's ID and type, populated with the fields passed in.
     * If the fields passed in are null or empty, we pull all fields by default
     *
     * @param type the type of entity to find
     * @param id the primary key id of the Bullhorn Entity
     * @param fields the fields to pass to the REST call to be populated on the entity.  Default is all fields
     * @return the entity with the primary key if it exists, a new instance of the class otherwise
     */
	public <RE extends BullhornEntity> RE findEntity(Class<RE> type, Integer id, Set<String> fields) {
		if (id == null || id <= 0) {
			return getBlankEntity(type);
		}

		RE entity = bullhornData.findEntity(type, id, fields);

		if (entity == null) {
			log.error("Error making BH api call. Error getting " + type.getSimpleName() + " with id : " + id);
			return getBlankEntity(type);
		}

		return entity;
	}

	private <RE extends BullhornEntity> RE getBlankEntity(Class<RE> type) {
		try {
			return type.newInstance();
		} catch (Exception e) {
			log.error("Error instantiating entity of type: " + type, e);
			throw new IllegalStateException(e);
		}
	}

	/**
	 * Returns all {@link PlacementCommission} for the passed in placementID
	 * 
	 * @param placementID the id of the placement we want commissions for
	 * @return a list of {@link PlacementCommission}
	 */
	public List<PlacementCommission> getCommissions(Integer placementID) {
		QueryParams params = ParamFactory.queryParams();
		params.setCount(50);

		return bullhornData.queryForList(PlacementCommission.class, "placement.id=" + placementID + " AND user.id IS NOT NULL", null, params);
	}

	public BullhornData getBullhornData() {
		return bullhornData;
	}

}
