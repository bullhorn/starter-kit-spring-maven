package com.client.core.scheduledtasks.model.helper.impl;

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
 * @author magnus.palm
 * 
 */
public class PlacementCommissionScheduledTaskHelper extends AbstractScheduledTaskHelper {

	private PlacementCommission placementCommission;
	private Placement placement;
	private JobOrder job;
	private Candidate candidate;
	private ClientCorporation clientCorporation;
	private ClientContact clientContact;
	private CorporateUser candidateOwner;

	public PlacementCommissionScheduledTaskHelper(CustomSubscriptionEvent event) {
		super(event);

	}

	public PlacementCommission getPlacementCommission() {
		if (placementCommission == null) {
			setPlacementCommission(findPlacementCommission(getEvent().getEntityId()));
		}
		return placementCommission;
	}

	public void setPlacementCommission(PlacementCommission placementCommission) {
		this.placementCommission = placementCommission;
	}

	/**
	 * Gets the Placement based on the SubscriptionEvent.entityID, if placement == null then makes api call, otherwise returns
	 * placement instance variable.
	 * 
	 * @return the Placement
	 */
	public Placement getPlacement() {
		if (placement == null) {
			setPlacement(findPlacement(getPlacementCommission().getPlacement().getId()));
		}
		return placement;
	}

	public void setPlacement(Placement placement) {
		this.placement = placement;
	}

	/**
	 * Gets the JoOrder for the Placement, if job == null then makes api call, otherwise returns job instance variable.
	 * 
	 * @return the JobOrder connected to the placement
	 */
	public JobOrder getJob() {
		if (job == null) {
			setJob(findJobOrder(getPlacement().getJobOrder().getId()));
		}
		return job;
	}

	public void setJob(JobOrder job) {
		this.job = job;
	}

	/**
	 * Gets the Candidate for the Placement, if candidate == null then makes api call, otherwise returns candidate instance
	 * variable.
	 * 
	 * @return the Candidate connected to the placement
	 */
	public Candidate getCandidate() {
		if (candidate == null) {
			setCandidate(findCandidate(getPlacement().getCandidate().getId()));
		}
		return candidate;
	}

	public void setCandidate(Candidate candidate) {
		this.candidate = candidate;
	}

	/**
	 * Gets the ClientCorporation for the Placement, if ClientCorporation == null then makes api call, otherwise returns
	 * ClientCorporation instance variable.
	 * 
	 * @return the ClientCorporation connected to the job connected to the placement
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
	 * Gets the ClientContact for the Placement, if ClientContact == null then makes api call, otherwise returns
	 * ClientContact instance variable.
	 * 
	 * @return the ClientContact connected to the job connected to the placement
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

	/**
	 * Gets the CorporateUser candidate owner for the Candidate for the Placement, if candidateOwner == null then makes api
	 * call, otherwise returns candidateOwner instance variable.
	 * 
	 * @return the CorporateUser connected to the candidate connected to the placement
	 */
	public CorporateUser getCandidateOwner() {
		if (candidateOwner == null) {
			setCandidateOwner(findCorporateUser(getCandidate().getOwner().getId()));
		}
		return candidateOwner;
	}

	public void setCandidateOwner(CorporateUser candidateOwner) {
		this.candidateOwner = candidateOwner;
	}

	@Override
	public String toString() {
		StringBuilder result = new StringBuilder();
		String NEW_LINE = System.getProperty("line.separator");
		result.append(this.getClass().getName() + " Object {" + NEW_LINE);
		result.append(" placement: " + placement + NEW_LINE);
		result.append(" job: " + job + NEW_LINE);
		result.append(" candidate: " + candidate + NEW_LINE);
		result.append(" clientCorporation: " + clientCorporation + NEW_LINE);
		result.append(" clientContact: " + clientContact + NEW_LINE);
		result.append("}");
		return result.toString();

	}

}
