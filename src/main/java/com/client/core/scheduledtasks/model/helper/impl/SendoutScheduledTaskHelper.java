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
public class SendoutScheduledTaskHelper extends AbstractScheduledTaskHelper {
	
	private Sendout sendout;
	private Candidate candidate;
	private ClientContact clientContact;
	private ClientCorporation clientCorporation;
	private JobOrder jobOrder;
	private CorporateUser sendingUser;

	public SendoutScheduledTaskHelper(CustomSubscriptionEvent event) {
		super(event);
	}

	public SendoutScheduledTaskHelper(CustomSubscriptionEvent event, BullhornData bullhornData) {
		super(event,bullhornData);
	}

	/**
	 * Gets the Sendout for the event, if sendout == null then makes api call, otherwise returns
	 * sendout instance variable.
	 * 
	 * @return the Sendout connected to the event
	 */
	public Sendout getSendout() {
		if (sendout == null) {
			setSendout(findSendout(getEvent().getEntityId()));
		}
		return sendout;
	}

	public void setSendout(Sendout sendout) {
		this.sendout = sendout;
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
		StringBuilder result = new StringBuilder();
		String NEW_LINE = System.getProperty("line.separator");
		result.append(this.getClass().getName() + " Object {" + NEW_LINE);
		result.append(" sendout: " + sendout + NEW_LINE);
		result.append(" candidate: " + candidate + NEW_LINE);
		result.append(" clientContact: " + clientContact + NEW_LINE);
		result.append(" clientCorporation: " + clientCorporation + NEW_LINE);
		result.append(" jobOrder: " + jobOrder + NEW_LINE);
		result.append(" sendingUser: " + sendingUser + NEW_LINE);
		result.append("}");
		return result.toString();

	}

}
