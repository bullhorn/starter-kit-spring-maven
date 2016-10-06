package com.client.core.scheduledtasks.model.helper.impl;

import com.bullhornsdk.data.api.BullhornData;
import com.bullhornsdk.data.model.entity.core.standard.ClientContact;
import com.bullhornsdk.data.model.entity.core.standard.ClientCorporation;
import com.bullhornsdk.data.model.entity.core.standard.CorporateUser;
import com.client.core.scheduledtasks.model.helper.AbstractScheduledTaskHelper;
import com.client.core.scheduledtasks.model.helper.StandardEvent;

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
public class ClientContactScheduledTaskHelper extends AbstractScheduledTaskHelper {

	private ClientCorporation clientCorporation;
	private ClientContact clientContact;
	private CorporateUser clientContactOwner;

	public ClientContactScheduledTaskHelper(StandardEvent event) {
		super(event);

	}
	
	public ClientContactScheduledTaskHelper(StandardEvent event, BullhornData bullhornData) {
		super(event);

	}

	/**
	 * Gets the ClientCorporation for the Placement, if ClientCorporation == null then makes api call, otherwise
	 * returns ClientCorporation instance variable.
	 * 
	 * @return the ClientCorporation connected to the job connected to the placement
	 */
	public ClientCorporation getClientCorporation() {
		if (clientCorporation == null) {
			setClientCorporation(findClientCorporation(getClientContact().getClientCorporation().getId()));
		}
		return clientCorporation;
	}

	public void setClientCorporation(ClientCorporation clientCorporation) {
		this.clientCorporation = clientCorporation;
	}

	/**
	 * Gets the ClientContact for the Placement, if ClientContact == null then makes api call, otherwise returns
	 * ClientContact instance variable.
	 * 
	 * @return the ClientContact connected to the job connected to the placement
	 */
	public ClientContact getClientContact() {
		if (clientContact == null) {
			setClientContact(findClientContact(getEvent().getEntityId()));
		}
		return clientContact;
	}

	public void setClientContact(ClientContact clientContact) {
		this.clientContact = clientContact;
	}

	/**
	 * Gets the CorporateUser client contact owner, if candidateOwner == null then makes api call, otherwise returns
	 * candidateOwner instance variable.
	 * 
	 * @return the CorporateUser connected to the client contact
	 */
	public CorporateUser getClientContactOwner() {
		if (clientContactOwner == null) {
			setClientContactOwner(findCorporateUser(getClientContact().getOwner().getId()));
		}
		return clientContactOwner;
	}

	public void setClientContactOwner(CorporateUser clientContactOwner) {
		this.clientContactOwner = clientContactOwner;
	}

	@Override
	public String toString() {
		StringBuilder result = new StringBuilder();
		String NEW_LINE = System.getProperty("line.separator");
		result.append(this.getClass().getName() + " Object {" + NEW_LINE);

		result.append(" clientCorporation: " + clientCorporation + NEW_LINE);
		result.append(" clientContact: " + clientContact + NEW_LINE);
		result.append(" clientContactOwner: " + clientContactOwner + NEW_LINE);
		result.append("}");
		return result.toString();

	}

}
