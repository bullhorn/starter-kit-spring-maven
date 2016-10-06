package com.client.core.scheduledtasks.model.helper.impl;

import com.bullhornsdk.data.model.entity.core.standard.Candidate;
import com.bullhornsdk.data.model.entity.core.standard.CandidateReference;
import com.bullhornsdk.data.model.entity.core.standard.CorporateUser;
import com.client.core.scheduledtasks.model.helper.AbstractScheduledTaskHelper;
import com.client.core.scheduledtasks.model.helper.StandardEvent;

/**
 * Contains all the data needed to handle scheduled tasks automation. Once a Dto has been fetched using the BH api it
 * will be stored in this Traverser for subsequent automation work.
 * 
 * The allDtosToSaveBackToBH map will contain deep copies of relevant dtos that should be saved back to BH. The copies
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
public class CandidateReferenceScheduledTaskHelper extends AbstractScheduledTaskHelper {

	private CandidateReference candidateReference;
	private Candidate candidate;
	private CorporateUser candidateOwner;

	public CandidateReferenceScheduledTaskHelper(StandardEvent event) {
		super(event);

	}

	
	/**
	 * Gets the CandidateReference for the event, if candidateReference == null then makes api call, otherwise returns
	 * candidate instance variable.
	 * 
	 * @return the CandidateEducation connected to the event
	 */
	public CandidateReference getCandidateReference() {
		if (candidateReference == null) {
			setCandidateReference(findCandidateReference(getEvent().getEntityId()));
		}
		return candidateReference;
	}

	public void setCandidateReference(CandidateReference candidateReference) {
		this.candidateReference = candidateReference;
	}
	
	/**
	 * Gets the Candidate  for the Candidate reference , if candidate == null then makes api call, otherwise
	 * returns candidate instance variable.
	 * 
	 * @return the Candidate connected to the candidate reference.
	 */
	public Candidate getCandidate() {
		if (candidate == null) {
			setCandidate(findCandidate(getCandidateReference().getCandidate().getId()));
		}
		return candidate;
	}

	public void setCandidate(Candidate candidate) {
		this.candidate = candidate;
	}

	/**
	 * Gets the CorporateUser candidate owner for the Candidate , if candidateOwner == null then makes api call,
	 * otherwise returns candidateOwner instance variable.
	 * 
	 * @return the CorporateUser connected to the candidate connected to the candidate reference.
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
		result.append(" candidate: " + candidate + NEW_LINE);
		result.append(" candidateOwner: " + candidateOwner + NEW_LINE);
		result.append("}");
		return result.toString();

	}

}
