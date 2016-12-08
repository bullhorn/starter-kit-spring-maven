package com.client.core.scheduledtasks.model.helper.impl;

import com.bullhornsdk.data.api.BullhornData;
import com.bullhornsdk.data.model.entity.core.standard.ClientContact;
import com.bullhornsdk.data.model.entity.core.standard.ClientCorporation;
import com.bullhornsdk.data.model.entity.core.standard.JobOrder;
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
public class JobOrderScheduledTaskHelper extends AbstractScheduledTaskHelper<JobOrder> {

	private ClientCorporation clientCorporation;
	private ClientContact clientContact;

	public JobOrderScheduledTaskHelper(CustomSubscriptionEvent event) {
		super(event, JobOrder.class);
	}

	public JobOrderScheduledTaskHelper(CustomSubscriptionEvent event, BullhornData bullhornData) {
		super(event, JobOrder.class, bullhornData);
	}

	/**
	 * Gets the JoOrder for the event, if job == null then makes api call, otherwise returns job instance
	 * variable.
	 * 
	 * @return the JobOrder connected to the event
	 */
	public JobOrder getJob() {
        return getEntity();
    }

	/**
	 * Gets the ClientCorporation for the job, if ClientCorporation == null then makes api call, otherwise
	 * returns ClientCorporation instance variable.
	 * 
	 * @return the ClientCorporation connected to the job
	 */
	public ClientCorporation getClientCorporation() {
		if (clientCorporation == null) {
			setClientCorporation(findClientCorporation(getJob().getClientCorporation().getId()));
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
			setClientContact(findClientContact(getJob().getClientContact().getId()));
		}
		return clientContact;
	}

	public void setClientContact(ClientContact clientContact) {
		this.clientContact = clientContact;
	}

    @Override
    public String toString() {
        return new StringBuilder("JobOrderScheduledTaskHelper {")
                .append("\n\t\"clientCorporation\": ")
                .append(clientCorporation)
                .append(",\n\t\"clientContact\": ")
                .append(clientContact)
                .append('}')
                .toString();
    }
}
