package com.client.core.scheduledtasks.model.helper.impl;

import com.bullhornsdk.data.api.BullhornData;
import com.bullhornsdk.data.model.entity.core.standard.ClientCorporation;
import com.bullhornsdk.data.model.entity.core.standard.CorporateUser;
import com.bullhornsdk.data.model.entity.core.standard.Lead;
import com.client.core.scheduledtasks.model.helper.AbstractScheduledTaskHelper;
import com.client.core.scheduledtasks.model.helper.CustomSubscriptionEvent;

/**
 * Contains all the data needed to handle scheduled tasks automation. Once a  has been fetched using the BH api it
 * will be stored in this Traverser for subsequent automation work.
 * 
 * The allsToSaveBackToBH map will contain deep copies of relevant dtos that should be saved back to BH. The copies
 * will be updated according to task logic, while the original dtos will NOT be updated so that subsequent logic will
 * still be made on original values.
 * 
 * Once all automation work has been done the dtos that need saving will be saved only once. In this way keeping the api
 * calls to a minimum by saving each dto only once, even though multiple tasks might have updated different fields on
 * the same dto.
 * 
 * @author magnus.palm
 * 
 */
public class LeadScheduledTaskHelper extends AbstractScheduledTaskHelper<Lead> {

	private ClientCorporation clientCorporation;
	private CorporateUser clientContactOwner;

	public LeadScheduledTaskHelper(CustomSubscriptionEvent event) {
		super(event, Lead.class);
	}

	public LeadScheduledTaskHelper(CustomSubscriptionEvent event, BullhornData bullhornData) {
		super(event, Lead.class, bullhornData);
	}

    /**
     * Gets the ClientContact for the Placement, if ClientContact == null then makes api call, otherwise returns
     * ClientContact instance variable.
     *
     * @return the ClientContact connected to the job connected to the placement
     */
    public Lead getLead() {
        return getEntity();
    }

	/**
	 * Gets the ClientCorporation for the Placement, if ClientCorporation == null then makes api call, otherwise
	 * returns ClientCorporation instance variable.
	 * 
	 * @return the ClientCorporation connected to the job connected to the placement
	 */
	public ClientCorporation getClientCorporation() {
		if (clientCorporation == null) {
			setClientCorporation(findClientCorporation(getLead().getClientCorporation().getId()));
		}
		return clientCorporation;
	}

	public void setClientCorporation(ClientCorporation clientCorporation) {
		this.clientCorporation = clientCorporation;
	}

	/**
	 * Gets the CorporateUser client contact owner, if candidateOwner == null then makes api call, otherwise returns
	 * candidateOwner instance variable.
	 * 
	 * @return the CorporateUser connected to the client contact
	 */
	public CorporateUser getLeadOwner() {
		if (clientContactOwner == null) {
			setClientContactOwner(findCorporateUser(getLead().getOwner().getId()));
		}

		return clientContactOwner;
	}

	public void setClientContactOwner(CorporateUser clientContactOwner) {
		this.clientContactOwner = clientContactOwner;
	}

    @Override
    public String toString() {
        return new StringBuilder("LeadScheduledTaskHelper {")
                .append("\n\t\"clientCorporation\": ")
                .append(clientCorporation)
                .append(",\n\t\"clientContactOwner\": ")
                .append(clientContactOwner)
                .append('}')
                .toString();
    }
}
