package com.client.core.base.model.helper;

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
import com.bullhornsdk.data.model.entity.core.standard.Lead;
import com.bullhornsdk.data.model.entity.core.standard.Note;
import com.bullhornsdk.data.model.entity.core.standard.Opportunity;
import com.bullhornsdk.data.model.entity.core.standard.Placement;
import com.bullhornsdk.data.model.entity.core.standard.PlacementChangeRequest;
import com.bullhornsdk.data.model.entity.core.standard.PlacementCommission;
import com.bullhornsdk.data.model.entity.core.type.BullhornEntity;
import com.bullhornsdk.data.model.entity.core.type.UpdateEntity;
import com.bullhornsdk.data.model.entity.embedded.UserType;
import com.bullhornsdk.data.model.parameter.QueryParams;
import com.bullhornsdk.data.model.parameter.standard.ParamFactory;
import com.bullhornsdk.data.model.response.crud.CrudResponse;
import com.google.common.collect.Sets;

public abstract class AbstractTriggerHelper<E extends BullhornEntity> implements TriggerHelper<E> {

	private final BullhornData bullhornData;
	protected final Integer updatingUserID;
	protected E newEntity;
	protected E oldEntity;
	protected CorporateUser updatingUser;
	protected UserType updatingUserUserType;
	protected final Logger log = Logger.getLogger(getClass());

	public AbstractTriggerHelper(Integer updatingUserID, BullhornData bullhornData) {
		super();
		this.bullhornData = bullhornData;
		this.updatingUserID = updatingUserID;
	}

	@Override
	public abstract E getNewEntity();

	@Override
	public abstract void setNewEntity(E newDto);

	@Override
	public abstract E getOldEntity();

	@Override
	public abstract void setOldEntity(E oldDto);

	@Override
	public Integer getUpdatingUserID() {
		return updatingUserID;
	}

	@Override
	public CorporateUser getUpdatingUser() {
		if (updatingUser == null) {
			setUpdatingUser(findCorporateUser(updatingUserID));
		}
		return updatingUser;
	}

	@Override
	public void setUpdatingUser(CorporateUser updatingUser) {
		this.updatingUser = updatingUser;
	}

	private final Set<String> userTypeFields = Sets.newHashSet("id","userType(id,name,description,enabled,isHidden,dateAdded)");

	@Override
	public UserType getUpdatingUserUserType() {
		if (updatingUserUserType == null) {
			CorporateUser withUserType = findEntity(CorporateUser.class, getUpdatingUserID(), userTypeFields);
			setUpdatingUserUserType(withUserType.getUserType());
		}
		return updatingUserUserType;
	}

	@Override
	public void setUpdatingUserUserType(UserType updatingUserUserType) {
		this.updatingUserUserType = updatingUserUserType;
	}

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

	@Override
	public UserType findUserType() {
		return getUpdatingUser().getUserType();
	}

	@Override
	public CorporateUser findCorporateUser(Integer id) {
		return findEntity(CorporateUser.class, id);
	}

	@Override
	public <RE extends BullhornEntity> RE findEntity(Class<RE> type, Integer id) {
		return findEntity(type, id, null);
	}

	@Override
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

	@Override
	public Candidate findCandidate(Integer id) {
		return findEntity(Candidate.class, id);
	}

	@Override
	public ClientCorporation findClientCorporation(Integer id) {
		return findEntity(ClientCorporation.class, id);
	}

	@Override
	public ClientContact findClientContact(Integer id) {
		return findEntity(ClientContact.class, id);
	}

	@Override
	public Placement findPlacement(Integer id) {
		return findEntity(Placement.class, id);
	}

	@Override
	public JobSubmission findJobSubmission(Integer id) {
		return findEntity(JobSubmission.class, id);
	}

	@Override
	public JobOrder findJobOrder(Integer id) {
		return findEntity(JobOrder.class, id);
	}

	@Override
	public Note findNote(Integer id) {
		return findEntity(Note.class, id);
	}

	@Override
	public PlacementChangeRequest findPlacementChangeRequest(Integer id) {
		return findEntity(PlacementChangeRequest.class, id);
	}

	@Override
    public Opportunity findOpportunity(Integer id){
        return findEntity(Opportunity.class, id);
    }

	@Override
    public Lead findLead(Integer id){
        return findEntity(Lead.class, id);
    }

	/**
	 * Returns all {@link PlacementCommission} for the passed in placementID
	 * 
	 * @param placementID
	 * @return a list of {@link PlacementCommission}
	 */
	@Override
	public List<PlacementCommission> getCommissions(Integer placementID) {

		QueryParams params = ParamFactory.queryParams();
		params.setCount(50);
		;
		return bullhornData.queryForList(PlacementCommission.class, "placement.id=" + placementID + " AND user.id IS NOT NULL", null,
				params);

	}

	@Override
	public BullhornData getBullhornData() {
		return bullhornData;
	}

}
