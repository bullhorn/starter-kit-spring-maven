package com.client.core.base.model.helper.impl;

import com.bullhornsdk.data.api.BullhornData;
import com.bullhornsdk.data.model.entity.core.standard.ClientCorporation;
import com.bullhornsdk.data.model.entity.core.standard.CorporateUser;
import com.bullhornsdk.data.model.entity.core.standard.JobOrder;
import com.client.core.base.model.helper.AbstractTriggerHelper;

/**
 * Holds and keeps data needed for validations to minimize the number of API calls.
 * 
 * BullhornAPI, formJobOrderDto and updatingUserID are required and therefore set to final.
 * 
 * @author magnus.palm
 * 
 */
public abstract class JobOrderTriggerHelper extends AbstractTriggerHelper<JobOrder> {

	private CorporateUser jobOwner;
	private ClientCorporation clientCorpration;

	public JobOrderTriggerHelper(Integer updatingUserID, BullhornData bullhornData) {
		super(updatingUserID, bullhornData);
	}

	@Override
	public Integer getUpdatingUserID() {
		return updatingUserID;
	}

	@Override
	public void setNewEntity(JobOrder newEntity) {
		this.newEntity = newEntity;

	}

	@Override
	public JobOrder getOldEntity() {
		if (oldEntity == null) {

			setOldEntity(super.findJobOrder(getNewEntity().getId()));
		}
		return oldEntity;
	}

	@Override
	public void setOldEntity(JobOrder oldEntity) {
		this.oldEntity = oldEntity;

	}

	/**
	 * Gets the owner of the job
	 * 
	 * @return a CorporateUserDto
	 */
	public CorporateUser getJobOwner() {
		if (jobOwner == null) {
			setJobOwner(findCorporateUser(getNewEntity().getOwner().getId()));
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
			setClientCorpration(findClientCorporation(getNewEntity().getClientCorporation().getId()));
		}

		return clientCorpration;
	}

	public void setClientCorpration(ClientCorporation clientCorpration) {
		this.clientCorpration = clientCorpration;
	}

}
