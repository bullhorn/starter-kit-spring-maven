package com.client.core.base.model.helper;

import com.bullhornsdk.data.api.BullhornData;
import com.bullhornsdk.data.model.entity.core.standard.*;
import com.bullhornsdk.data.model.entity.core.type.BullhornEntity;
import com.bullhornsdk.data.model.entity.core.type.UpdateEntity;
import com.bullhornsdk.data.model.entity.embedded.UserType;
import com.bullhornsdk.data.model.parameter.QueryParams;
import com.bullhornsdk.data.model.parameter.standard.ParamFactory;
import com.bullhornsdk.data.model.response.crud.CrudResponse;
import com.client.ApplicationContextProvider;
import com.client.core.base.model.relatedentity.BullhornRelatedEntity;
import com.client.core.base.model.relatedentity.StandardRelatedEntity;
import com.client.core.base.util.Utility;
import lombok.extern.log4j.Log4j2;

import java.util.List;
import java.util.Map;
import java.util.Set;

@Log4j2
public abstract class AbstractHelper<T extends BullhornEntity> implements Helper<T> {

    private final BullhornData bullhornData;
    private final Map<? extends BullhornRelatedEntity, Set<String>> relatedEntityFields;

    private final Integer updatingUserID;
    private CorporateUser updatingUser;
    private UserType updatingUserUserType;

    public AbstractHelper(Integer updatingUserID, Map<? extends BullhornRelatedEntity, Set<String>> relatedEntityFields) {
        super();
        this.updatingUserID = updatingUserID;
        this.relatedEntityFields = relatedEntityFields;
        bullhornData = ApplicationContextProvider.getApplicationContext().getBean(BullhornData.class);
    }

    @Override
    public Integer getUpdatingUserID() {
        return updatingUserID;
    }

    @Override
    public CorporateUser getUpdatingUser() {
        if (updatingUser == null) {
            this.updatingUser = findCorporateUser(getUpdatingUserID(), StandardRelatedEntity.UPDATING_USER);
        }

        return updatingUser;
    }

    @Override
    public UserType getUpdatingUserUserType() {
        if (updatingUserUserType == null) {
            UserType userType = findEntity(UserType.class, getUpdatingUser().getUserType().getId(), StandardRelatedEntity.UPDATING_USER_USERTYPE);

            this.updatingUserUserType = userType;
        }

        return updatingUserUserType;
    }

    @Override
    public <U extends UpdateEntity> void saveDto(U entity) {
        if (entity != null) {
            CrudResponse response = getBullhornData().updateEntity(entity);

            if (response.isError() || response.hasValidationErrors() || response.hasWarnings()) {
                log.error("Error saving entity: " + entity.getClass().getSimpleName() + " #" + entity.getId());
                response.getMessages().parallelStream().forEach(message -> log.error(message.toString()));
            }
        } else {
            log.error("Not saving entity because it was null.");
        }
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

    protected CandidateCertification findCandidateCertification(Integer id, Set<String> fields) {
        return findEntity(CandidateCertification.class, id, fields);
    }

    protected Certification findCertification(Integer id, Set<String> fields) {
        return findEntity(Certification.class, id, fields);
    }

    @Override
    public List<PlacementCommission> getCommissions(Integer placementId, Set<String> fields) {
        QueryParams params = ParamFactory.queryParams();
        params.setCount(50);

        return bullhornData.queryForList(PlacementCommission.class, "placement.id=" + placementId + " AND user.id IS NOT NULL", fields, params);
    }

    @Override
    public BullhornData getBullhornData() {
        return bullhornData;
    }

    protected  <RE extends BullhornEntity> RE findEntity(Class<RE> type, Integer id, BullhornRelatedEntity entity) {
        return findEntity(type, id, getFields(entity));
    }

    protected Person findPerson(Integer id, BullhornRelatedEntity entity) {
        return findEntity(Person.class, id, entity);
    }

    protected CorporateUser findCorporateUser(Integer id, BullhornRelatedEntity entity) {
        return findEntity(CorporateUser.class, id, entity);
    }

    protected Candidate findCandidate(Integer id, BullhornRelatedEntity entity) {
        return findEntity(Candidate.class, id, entity);
    }

    protected ClientCorporation findClientCorporation(Integer id, BullhornRelatedEntity entity) {
        return findEntity(ClientCorporation.class, id, entity);
    }

    protected ClientContact findClientContact(Integer id, BullhornRelatedEntity entity) {
        return findEntity(ClientContact.class, id, entity);
    }

    protected Placement findPlacement(Integer id, BullhornRelatedEntity entity) {
        return findEntity(Placement.class, id, entity);
    }

    protected JobSubmission findJobSubmission(Integer id, BullhornRelatedEntity entity) {
        return findEntity(JobSubmission.class, id, entity);
    }

    protected JobOrder findJobOrder(Integer id, BullhornRelatedEntity entity) {
        return findEntity(JobOrder.class, id, entity);
    }

    protected Note findNote(Integer id, BullhornRelatedEntity entity) {
        return findEntity(Note.class, id, entity);
    }

    protected PlacementChangeRequest findPlacementChangeRequest(Integer id, BullhornRelatedEntity entity) {
        return findEntity(PlacementChangeRequest.class, id, entity);
    }

    protected Opportunity findOpportunity(Integer id, BullhornRelatedEntity entity){
        return findEntity(Opportunity.class, id, entity);
    }

    protected Lead findLead(Integer id, BullhornRelatedEntity entity) {
        return findEntity(Lead.class, id, entity);
    }

    protected CandidateCertification findCandidateCertification(Integer id, BullhornRelatedEntity entity) {
        return findEntity(CandidateCertification.class, id, entity);
    }

    protected Certification findCertification(Integer id, BullhornRelatedEntity entity) {
        return findEntity(Certification.class, id, entity);
    }

    protected List<PlacementCommission> getCommissions(Integer placementId, BullhornRelatedEntity entity) {
        return getCommissions(placementId, getFields(entity));
    }

    protected Set<String> getFields(BullhornRelatedEntity relatedEntity) {
        return relatedEntityFields.get(relatedEntity);
    }

    protected <E extends BullhornEntity> boolean isPopulated(E entity) {
        return entity != null && Utility.isPositive(entity.getId());
    }

}
