package com.client.core.base.model.helper;

import com.bullhornsdk.data.api.BullhornData;
import com.bullhornsdk.data.model.entity.core.standard.*;
import com.bullhornsdk.data.model.entity.core.type.BullhornEntity;
import com.bullhornsdk.data.model.entity.core.type.UpdateEntity;
import com.bullhornsdk.data.model.entity.embedded.UserType;

import java.util.List;
import java.util.Set;

public interface Helper<E extends BullhornEntity> {

    /**
     * The id of the corporate user saving the form in Bullhorn.
     *
     * @return the user id
     */
    Integer getUpdatingUserID();

    /**
     * The user who made the update
     *
     * @return
     */
    CorporateUser getUpdatingUser();

    /**
     * The user type of the user who made the update.
     *
     * @return
     */
    UserType getUpdatingUserUserType();

    /**
     * Save the entity to bullhorn
     *
     * @param entity
     *            any implementation of {@link UpdateEntity}
     */
    <U extends UpdateEntity> void saveDto(U entity);

    <RE extends BullhornEntity> RE findEntity(Class<RE> type, Integer id, Set<String> fields);

    CorporateUser findCorporateUser(Integer id, Set<String> fields);

    Candidate findCandidate(Integer id, Set<String> fields);

    ClientCorporation findClientCorporation(Integer id, Set<String> fields);

    ClientContact findClientContact(Integer id, Set<String> fields);

    Placement findPlacement(Integer id, Set<String> fields);
    JobSubmission findJobSubmission(Integer id, Set<String> fields);

    JobOrder findJobOrder(Integer id, Set<String> fields);

    Note findNote(Integer id, Set<String> fields);

    PlacementChangeRequest findPlacementChangeRequest(Integer id, Set<String> fields);

    Opportunity findOpportunity(Integer id, Set<String> fields);

    Lead findLead(Integer id, Set<String> fields);

    List<PlacementCommission> getCommissions(Integer placementID, Set<String> fields);

    BullhornData getBullhornData();

}
