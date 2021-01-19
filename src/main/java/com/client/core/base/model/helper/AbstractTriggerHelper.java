package com.client.core.base.model.helper;

import java.util.List;
import java.util.Map;
import java.util.Set;

import com.client.core.base.model.fields.RelatedTriggerEntity;
import com.client.core.base.model.fields.StandardTriggerEntity;
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

public abstract class AbstractTriggerHelper<E extends BullhornEntity> implements TriggerHelper<E> {

	protected final Logger log = Logger.getLogger(getClass());

	private final BullhornData bullhornData;
	private final Map<? extends RelatedTriggerEntity, Set<String>> triggerEntityFields;

	protected final Integer updatingUserID;
	protected E newEntity;
	protected E oldEntity;
	protected CorporateUser updatingUser;
	protected UserType updatingUserUserType;

	public AbstractTriggerHelper(Integer updatingUserID, BullhornData bullhornData, Map<? extends RelatedTriggerEntity, Set<String>> triggerEntityFields) {
		super();
		this.bullhornData = bullhornData;
		this.updatingUserID = updatingUserID;
		this.triggerEntityFields = triggerEntityFields;
	}

	@Override
	public abstract E getNewEntity();

	protected void setNewEntity(E newEntity) {
		this.newEntity = newEntity;
	}

	@Override
	public abstract E getOldEntity();

	protected void setOldEntity(E oldEntity) {
		this.oldEntity = oldEntity;
	}

	@Override
	public Integer getUpdatingUserID() {
		return updatingUserID;
	}

	public CorporateUser getUpdatingUser() {
		if (updatingUser == null) {
			this.updatingUser = findCorporateUser(updatingUserID, StandardTriggerEntity.UPDATING_USER);
		}

		return updatingUser;
	}

	@Override
	public UserType getUpdatingUserUserType() {
		if (updatingUserUserType == null) {
			UserType userType = findEntity(UserType.class, getUpdatingUser().getUserType().getId(), StandardTriggerEntity.UPDATING_USER_USERTYPE);

			this.updatingUserUserType = userType;
		}

		return updatingUserUserType;
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

	private <RE extends BullhornEntity> RE findEntity(Class<RE> type, Integer id, RelatedTriggerEntity entity) {
		return findEntity(type, id, triggerEntityFields.getOrDefault(entity, entity.getStandardFields()));
	}

	@Override
	public <RE extends BullhornEntity> RE findEntity(Class<RE> type, Integer id, Set<String> fields) {
		if (id == null || id <= 0) {
            throw new IllegalArgumentException("Must pass in a non-null id to findEntity");
		} else if (fields == null || fields.contains("*") || fields.isEmpty()) {
			throw new IllegalArgumentException("Must pass in a non-null, non-empty field set that does not contain '*'");
		}

		return bullhornData.findEntity(type, id, fields);
	}

	@Override
	public CorporateUser findCorporateUser(Integer id, Set<String> fields) {
		return findEntity(CorporateUser.class, id, fields);
	}

	@Override
	public Candidate findCandidate(Integer id, Set<String> fields) {
		return findEntity(Candidate.class, id, fields);
	}

	@Override
	public ClientCorporation findClientCorporation(Integer id, Set<String> fields) {
		return findEntity(ClientCorporation.class, id, fields);
	}

	@Override
	public ClientContact findClientContact(Integer id, Set<String> fields) {
		return findEntity(ClientContact.class, id, fields);
	}

	@Override
	public Placement findPlacement(Integer id, Set<String> fields) {
		return findEntity(Placement.class, id, fields);
	}

	@Override
	public JobSubmission findJobSubmission(Integer id, Set<String> fields) {
		return findEntity(JobSubmission.class, id, fields);
	}

	@Override
	public JobOrder findJobOrder(Integer id, Set<String> fields) {
		return findEntity(JobOrder.class, id, fields);
	}

	@Override
	public Note findNote(Integer id, Set<String> fields) {
		return findEntity(Note.class, id, fields);
	}

	@Override
	public PlacementChangeRequest findPlacementChangeRequest(Integer id, Set<String> fields) {
		return findEntity(PlacementChangeRequest.class, id, fields);
	}

	@Override
	public Opportunity findOpportunity(Integer id, Set<String> fields) {
		return findEntity(Opportunity.class, id, fields);
	}

	@Override
	public Lead findLead(Integer id, Set<String> fields) {
		return findEntity(Lead.class, id, fields);
	}

	@Override
	public List<PlacementCommission> getCommissions(Integer placementId, Set<String> fields) {
		QueryParams params = ParamFactory.queryParams();
		params.setCount(50);

		return bullhornData.queryForList(PlacementCommission.class, "placement.id=" + placementId + " AND user.id IS NOT NULL", fields, params);
	}

	protected CorporateUser findCorporateUser(Integer id, RelatedTriggerEntity entity) {
		return findEntity(CorporateUser.class, id, entity);
	}

	protected Candidate findCandidate(Integer id, RelatedTriggerEntity entity) {
		return findEntity(Candidate.class, id, entity);
	}

	protected ClientCorporation findClientCorporation(Integer id, RelatedTriggerEntity entity) {
		return findEntity(ClientCorporation.class, id, entity);
	}

	protected ClientContact findClientContact(Integer id, RelatedTriggerEntity entity) {
		return findEntity(ClientContact.class, id, entity);
	}

	protected Placement findPlacement(Integer id, RelatedTriggerEntity entity) {
		return findEntity(Placement.class, id, entity);
	}

	protected JobSubmission findJobSubmission(Integer id, RelatedTriggerEntity entity) {
		return findEntity(JobSubmission.class, id, entity);
	}

	protected JobOrder findJobOrder(Integer id, RelatedTriggerEntity entity) {
		return findEntity(JobOrder.class, id, entity);
	}

	protected Note findNote(Integer id, RelatedTriggerEntity entity) {
		return findEntity(Note.class, id, entity);
	}

	protected PlacementChangeRequest findPlacementChangeRequest(Integer id, RelatedTriggerEntity entity) {
		return findEntity(PlacementChangeRequest.class, id, entity);
	}

	protected Opportunity findOpportunity(Integer id, RelatedTriggerEntity entity){
        return findEntity(Opportunity.class, id, entity);
    }

    protected Lead findLead(Integer id, RelatedTriggerEntity entity) {
        return findEntity(Lead.class, id, entity);
    }

	protected List<PlacementCommission> getCommissions(Integer placementId, RelatedTriggerEntity entity) {
		return getCommissions(placementId, triggerEntityFields.get(entity));
	}

	@Override
	public BullhornData getBullhornData() {
		return bullhornData;
	}

}
