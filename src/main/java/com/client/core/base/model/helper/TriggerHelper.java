package com.client.core.base.model.helper;

import java.util.List;
import java.util.Set;

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

/**
 * Created by johnsully83 on 25/08/2016.
 */
public interface TriggerHelper<E extends BullhornEntity> {

	/**
	 * The id of the corporate user saving the form in Bullhorn.
	 *
	 * @return the user id
	 */
	Integer getUpdatingUserID();

	/**
	 * Returns the new entity instantiated from the T form values.
	 *
	 * Example: a FormJobOrderDto will instantiate a JobOrder.
	 *
	 * @return The bullhorn {@link BullhornEntity} based on the form just saved
	 */
	E getNewEntity();

	void setNewEntity(E newEntity);

	/**
	 * The currently stored data for this entity that is saved in bullhorn.
	 *
	 * @return The currently stored data from bullhorn
	 */
	E getOldEntity();

	void setOldEntity(E oldDto);

	/**
	 * The user who made the update
	 *
	 * @return
	 */
	CorporateUser getUpdatingUser();

	void setUpdatingUser(CorporateUser updatingUser);

	/**
	 * The user type of the user who made the update.
	 *
	 * @return
	 */
	UserType getUpdatingUserUserType();

	void setUpdatingUserUserType(UserType updatingUserUserType);

	/**
	 * Save the entity to bullhorn
	 *
	 * @param entity
	 *            any implementation of {@link UpdateEntity}
	 */
	<U extends UpdateEntity> void saveDto(U entity);

	CorporateUser findCorporateUser(Integer id);

	<RE extends BullhornEntity> RE findEntity(Class<RE> type, Integer id);

	<RE extends BullhornEntity> RE findEntity(Class<RE> type, Integer id, Set<String> fields);

	Candidate findCandidate(Integer id);

	ClientCorporation findClientCorporation(Integer id);

	ClientContact findClientContact(Integer id);

	Placement findPlacement(Integer id);

	JobSubmission findJobSubmission(Integer id);

	JobOrder findJobOrder(Integer id);

	Note findNote(Integer id);

	PlacementChangeRequest findPlacementChangeRequest(Integer id);

	Opportunity findOpportunity(Integer id);

	Lead findLead(Integer id);

	List<PlacementCommission> getCommissions(Integer placementID);

	BullhornData getBullhornData();


}
