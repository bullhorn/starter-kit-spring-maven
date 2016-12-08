package com.client.core.scheduledtasks.model.helper.impl;

import com.bullhornsdk.data.api.BullhornData;
import com.bullhornsdk.data.model.entity.core.standard.*;
import com.client.core.scheduledtasks.model.helper.AbstractScheduledTaskHelper;
import com.client.core.scheduledtasks.model.helper.CustomSubscriptionEvent;

/**
 * Contains all the data needed to handle scheduled tasks automation. Once a  has been fetched using the BH api it will be
 * stored in this Traverser for subsequent automation work.
 * 
 * The allsToSaveBackToBH map will contain deep copies of relevant dtos that should be saved back to BH. The copies will be
 * updated according to task logic, while the original dtos will NOT be updated so that subsequent logic will still be made on
 * original values.
 * 
 * Once all automation work has been done the dtos that need saving will be saved only once. In this way keeping the api calls to
 * a minimum by saving each dto only once, even though multiple tasks might have updated different fields on the same dto.
 * 
 * @author johnsully
 * 
 */
public class SendoutScheduledTaskHelper extends AbstractScheduledTaskHelper<Sendout> {

	private Candidate candidate;
	private ClientContact clientContact;
	private ClientCorporation clientCorporation;
	private JobOrder jobOrder;
	private CorporateUser sendingUser;

	public SendoutScheduledTaskHelper(CustomSubscriptionEvent event) {
		super(event, Sendout.class);
	}

	public SendoutScheduledTaskHelper(CustomSubscriptionEvent event, BullhornData bullhornData) {
		super(event, Sendout.class, bullhornData);
	}

	/**
	 * Gets the Sendout for the event, if sendout == null then makes api call, otherwise returns
	 * sendout instance variable.
	 * 
	 * @return the Sendout connected to the event
	 */
	public Sendout getSendout() {
        return getEntity();
    }

	/**
	 * Gets the Candidate  for the sendout, if candidate == null then makes api call, otherwise
	 * returns candidate instance variable.
	 * 
	 * @return the Candidate connected to the sendout.
	 */
	public Candidate getCandidate() {
		if (candidate == null) {
			setCandidate(findCandidate(getSendout().getCandidate().getId()));
		}
		return candidate;
	}
	
	public void setCandidate(Candidate candidate) {
		this.candidate = candidate;
	}

	/**
	 * Gets the ClientContact  for the sendout, if clientContact == null then makes api call, otherwise
	 * returns clientContact instance variable.
	 * 
	 * @return the ClientContact connected to the sendout.
	 */
	public ClientContact getClientContact() {
		if (clientContact == null) {
			setClientContact(findClientContact(getSendout().getClientContact().getId()));
		}
		return clientContact;
	}

	public void setClientContact(ClientContact clientContact) {
		this.clientContact = clientContact;
	}

	/**
	 * Gets the ClientCorporation  for the sendout, if clientCorporation == null then makes api call, otherwise
	 * returns clientCorporation instance variable.
	 * 
	 * @return the ClientCorporation connected to the sendout.
	 */
	public ClientCorporation getClientCorporation() {
		if (clientCorporation == null) {
			setClientCorporation(findClientCorporation(getSendout().getClientCorporation().getId()));
		}
		return clientCorporation;
	}

	public void setClientCorporation(ClientCorporation clientCorporation) {
		this.clientCorporation = clientCorporation;
	}

	/**
	 * Gets the JobOrder  for the sendout, if jobOrder == null then makes api call, otherwise
	 * returns jobOrder instance variable.
	 * 
	 * @return the JobOrder connected to the sendout.
	 */
	public JobOrder getJobOrder() {
		if (jobOrder == null) {
			setJobOrder(findJobOrder(getSendout().getJobOrder().getId()));
		}
		return jobOrder;
	}

	public void setJobOrder(JobOrder jobOrder) {
		this.jobOrder = jobOrder;
	}

	/**
	 * Gets the CorporateUser  for the sendout, if sendingUser == null then makes api call, otherwise
	 * returns sendingUser instance variable.
	 * 
	 * @return the CorporateUser connected to the sendout.
	 */
	public CorporateUser getSendingUser() {
		if (sendingUser == null) {
			setSendingUser(findCorporateUser(getSendout().getUser().getId()));
		}
		return sendingUser;
	}

	public void setSendingUser(CorporateUser sendingUser) {
		this.sendingUser = sendingUser;
	}

    @Override
    public String toString() {
        return new StringBuilder("SendoutScheduledTaskHelper {")
                .append("\n\t\"candidate\": ")
                .append(candidate)
                .append(",\n\t\"clientContact\": ")
                .append(clientContact)
                .append(",\n\t\"clientCorporation\": ")
                .append(clientCorporation)
                .append(",\n\t\"jobOrder\": ")
                .append(jobOrder)
                .append(",\n\t\"sendingUser\": ")
                .append(sendingUser)
                .append('}')
                .toString();
    }
}
