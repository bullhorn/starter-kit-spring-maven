package com.client.core.base.model.helper.impl;


import com.bullhornsdk.data.api.BullhornData;
import com.bullhornsdk.data.model.entity.core.standard.ClientContact;
import com.bullhornsdk.data.model.entity.core.standard.ClientCorporation;
import com.bullhornsdk.data.model.entity.core.standard.CorporateUser;
import com.bullhornsdk.data.model.entity.core.standard.Opportunity;
import com.client.core.base.model.helper.AbstractTriggerHelper;

/**
 * Holds and keeps data needed for validations to minimize the number of API calls.
 * 
 * BullhornAPI, formJobOrderDto and updatingUserID are required and therefore set to final.
 * 
 * @author magnus.palm
 * 
 */
public abstract class OpportunityTriggerHelper extends AbstractTriggerHelper<Opportunity> {

	private CorporateUser owner;
	private ClientCorporation clientCorporation;
	private ClientContact clientContact;

	public OpportunityTriggerHelper(Integer updatingUserID, BullhornData bullhornData) {
		super(updatingUserID, bullhornData);
	}

	@Override
	public Integer getUpdatingUserID() {
		return updatingUserID;
	}

	@Override
	public void setNewEntity(Opportunity newDto) {
		this.newEntity = newDto;
	}

	@Override
	public Opportunity getOldEntity() {
		if (oldEntity == null) {
			setOldEntity(super.findOpportunity(getNewEntity().getId()));
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
	public CorporateUser getOwner() {
		if (owner == null) {
			setOwner(findCorporateUser(getNewEntity().getOwner().getId()));
		}

		return owner;
	}

	public void setOwner(CorporateUser owner) {
		this.owner = owner;
	}

	/**
	 * Gets the client corporation connected to the job
	 * 
	 * @return a ClientCorporationDto
	 */
	public ClientCorporation getClientCorporation() {
		if (clientCorporation == null) {
			setClientCorporation(findClientCorporation(getNewEntity().getClientCorporation().getId()));
		}

		return clientCorporation;
	}

	public void setClientCorporation(ClientCorporation clientCorporation) {
		this.clientCorporation = clientCorporation;
	}
	/**
	 * Gets the client corporation connected to the job
	 * 
	 * @return a ClientCorporationDto
	 */
	public ClientContact getClientContact() {
		if (clientContact == null) {
			setClientContact(findClientContact(getNewEntity().getClientContact().getId()));
		}

		return clientContact;
	}

	public void setClientContact(ClientContact clientContact) {
		this.clientContact = clientContact;
	}

}
