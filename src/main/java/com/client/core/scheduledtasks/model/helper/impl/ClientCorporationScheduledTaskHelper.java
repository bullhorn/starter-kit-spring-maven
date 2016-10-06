package com.client.core.scheduledtasks.model.helper.impl;

import com.bullhornsdk.data.model.entity.core.standard.ClientCorporation;
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
public class ClientCorporationScheduledTaskHelper extends AbstractScheduledTaskHelper {

	private ClientCorporation clientCorporation;

	public ClientCorporationScheduledTaskHelper(CustomSubscriptionEvent event) {
		super(event);

	}

	/**
	 * Gets the ClientCorporation for the event, if ClientCorporation == null then makes api call, otherwise
	 * returns ClientCorporation instance variable.
	 * 
	 * @return the ClientCorporation connected to the event
	 */
	public ClientCorporation getClientCorporation() {
		if (clientCorporation == null) {
			setClientCorporation(findClientCorporation(getEvent().getEntityId()));
		}
		return clientCorporation;
	}

	public void setClientCorporation(ClientCorporation clientCorporation) {
		this.clientCorporation = clientCorporation;
	}

	@Override
	public String toString() {
		StringBuilder result = new StringBuilder();
		String NEW_LINE = System.getProperty("line.separator");
		result.append(this.getClass().getName() + " Object {" + NEW_LINE);
		result.append(" clientCorporation: " + clientCorporation + NEW_LINE);
		result.append("}");
		return result.toString();

	}

}
