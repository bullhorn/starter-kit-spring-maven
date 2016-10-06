package com.client.core.scheduledtasks.model.helper.impl;

import com.bullhornsdk.data.api.BullhornData;
import com.bullhornsdk.data.model.entity.core.standard.ClientContact;
import com.bullhornsdk.data.model.entity.core.standard.ClientCorporation;
import com.bullhornsdk.data.model.entity.core.standard.Opportunity;
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
 * @param <T>
 */
public class OpportunityScheduledTaskHelper extends AbstractScheduledTaskHelper {

	private Opportunity opportunity;
	private ClientCorporation clientCorporation;
	private ClientContact clientContact;

	public OpportunityScheduledTaskHelper(CustomSubscriptionEvent event) {
		super(event);

	}

	public OpportunityScheduledTaskHelper(CustomSubscriptionEvent event, BullhornData bullhornData) {
		super(event,bullhornData);
	}

	/**
	 * Gets the JoOrder for the event, if job == null then makes api call, otherwise returns job instance
	 * variable.
	 * 
	 * @return the JobOrder connected to the event
	 */
	public Opportunity getOpportunity() {
		if (opportunity == null) {
			setOpportunity(findOpportunity(getEvent().getEntityId()));
		}
		return opportunity;
	}

	public void setOpportunity(Opportunity opportunity) {
		this.opportunity = opportunity;
	}

	/**
	 * Gets the ClientCorporation for the job, if ClientCorporation == null then makes api call, otherwise
	 * returns ClientCorporation instance variable.
	 * 
	 * @return the ClientCorporation connected to the job
	 */
	public ClientCorporation getClientCorporation() {
		if (clientCorporation == null) {
			setClientCorporation(findClientCorporation(getOpportunity().getClientCorporation().getId()));
		}
		return clientCorporation;
	}

	public void setClientCorporation(ClientCorporation clientCorporation) {
		this.clientCorporation = clientCorporation;
	}

	/**
	 * Gets the ClientContact for the job, if ClientContact == null then makes api call, otherwise returns
	 * ClientContact instance variable.
	 * 
	 * @return the ClientContact connected to the job 
	 */
	public ClientContact getClientContact() {
		if (clientContact == null) {
			setClientContact(findClientContact(getOpportunity().getClientContact().getId()));
		}
		return clientContact;
	}

	public void setClientContact(ClientContact clientContact) {
		this.clientContact = clientContact;
	}

	@Override
	public String toString() {
		StringBuilder result = new StringBuilder();
		String NEW_LINE = System.getProperty("line.separator");
		result.append(this.getClass().getName() + " Object {" + NEW_LINE);
		result.append(" opportunity: " + opportunity + NEW_LINE);
		result.append(" clientCorporation: " + clientCorporation + NEW_LINE);
		result.append(" clientContact: " + clientContact + NEW_LINE);
		result.append("}");
		return result.toString();

	}

}
