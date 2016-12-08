package com.client.core.scheduledtasks.model.helper.impl;

import com.bullhornsdk.data.api.BullhornData;
import com.bullhornsdk.data.model.entity.core.standard.Candidate;
import com.bullhornsdk.data.model.entity.core.standard.CorporateUser;
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
public class CandidateScheduledTaskHelper extends AbstractScheduledTaskHelper<Candidate> {

	private CorporateUser candidateOwner;

	public CandidateScheduledTaskHelper(CustomSubscriptionEvent event) {
		super(event, Candidate.class);
	}

	public CandidateScheduledTaskHelper(CustomSubscriptionEvent event, BullhornData bullhornData) {
		super(event, Candidate.class, bullhornData);
	}

	/**
	 * Gets the Candidate for the event, if candidate == null then makes api call, otherwise returns candidate
	 * instance variable.
	 * 
	 * @return the Candidate connected to the event
	 */
	public Candidate getCandidate() {
        return getEntity();
    }

	/**
	 * Gets the CorporateUser candidate owner for the Candidate , if candidateOwner == null then makes api call,
	 * otherwise returns candidateOwner instance variable.
	 * 
	 * @return the CorporateUser connected to the candidate.
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
        return new StringBuilder("CandidateScheduledTaskHelper {")
                .append("\n\t\"candidateOwner\": ")
                .append(candidateOwner)
                .append('}')
                .toString();
    }
}
