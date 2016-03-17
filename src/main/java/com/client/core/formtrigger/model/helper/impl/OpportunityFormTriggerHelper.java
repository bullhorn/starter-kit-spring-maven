package com.client.core.formtrigger.model.helper.impl;


import com.bullhornsdk.data.api.BullhornData;
import com.bullhornsdk.data.model.entity.core.standard.ClientContact;
import com.bullhornsdk.data.model.entity.core.standard.ClientCorporation;
import com.bullhornsdk.data.model.entity.core.standard.CorporateUser;
import com.bullhornsdk.data.model.entity.core.standard.Opportunity;
import com.client.core.formtrigger.model.form.impl.FormOpportunityDto;
import com.client.core.formtrigger.model.helper.AbstractFormTriggerHelper;

/**
 * Holds and keeps data needed for validations to minimize the number of API calls.
 * 
 * BullhornAPI, formJobOrderDto and updatingUserID are required and therefore set to final.
 * 
 * @author magnus.palm
 * 
 */
public class OpportunityFormTriggerHelper extends AbstractFormTriggerHelper<FormOpportunityDto, Opportunity> {

	private CorporateUser jobOwner;
	private ClientCorporation clientCorpration;
	private ClientContact clientContact;

	public OpportunityFormTriggerHelper(FormOpportunityDto formOpportunityDto, Integer updatingUserID, BullhornData bullhornData) {
		super(formOpportunityDto, updatingUserID, bullhornData);
	}

	public OpportunityFormTriggerHelper(Opportunity opportunity, Integer updatingUserID, BullhornData bullhornData) {
		super(FormOpportunityDto.instantiateFromOpportunity(opportunity), updatingUserID, bullhornData);
		this.newEntity = opportunity;
	}


	@Override
	public Integer getUpdatingUserID() {
		return updatingUserID;
	}

	@Override
	public Opportunity getNewEntity() {
		if (newEntity == null) {
			setNewEntity(getFormValues().instantiateEntity());
		}
		return newEntity;
	}

	@Override
	public void setNewEntity(Opportunity newDto) {
		this.newEntity = newDto;
	}

	@Override
	public Opportunity getOldEntity() {
		if (oldEntity == null) {
			setOldEntity(super.findOpportunity(getFormValues().getJobPostingID()));
		}

		return oldEntity;
	}

	@Override
	public void setOldEntity(Opportunity oldDto) {
		this.oldEntity = oldDto;
	}

	/**
	 * Gets the owner of the job
	 * 
	 * @return a CorporateUserDto
	 */
	public CorporateUser getJobOwner() {
		if (jobOwner == null) {
			setJobOwner(findCorporateUser(getFormValues().getUserID()));
		}

		return jobOwner;
	}

	public void setJobOwner(CorporateUser jobOwner) {
		this.jobOwner = jobOwner;
	}

	/**
	 * Gets the client corporation connected to the job
	 * 
	 * @return a ClientCorporationDto
	 */
	public ClientCorporation getClientCorpration() {
		if (clientCorpration == null) {
			setClientCorpration(findClientCorporation(getFormValues().getClientCorporationID()));
		}

		return clientCorpration;
	}

	public void setClientCorpration(ClientCorporation clientCorpration) {
		this.clientCorpration = clientCorpration;
	}
	/**
	 * Gets the client corporation connected to the job
	 * 
	 * @return a ClientCorporationDto
	 */
	public ClientContact getClientContact() {
		if (clientContact == null) {
			setClientContact(findClientContact(getFormValues().getClientUserID()));
		}

		return clientContact;
	}

	public void setClientContact(ClientContact clientContact) {
		this.clientContact = clientContact;
	}

}
