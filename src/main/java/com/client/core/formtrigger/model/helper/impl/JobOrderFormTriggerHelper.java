package com.client.core.formtrigger.model.helper.impl;

import com.bullhornsdk.data.api.BullhornData;
import com.bullhornsdk.data.model.entity.core.standard.ClientCorporation;
import com.bullhornsdk.data.model.entity.core.standard.CorporateUser;
import com.bullhornsdk.data.model.entity.core.standard.JobOrder;
import com.client.core.formtrigger.model.helper.AbstractFormTriggerHelper;
import com.client.core.formtrigger.model.form.impl.FormJobOrderDto;

/**
 * Holds and keeps data needed for validations to minimize the number of API calls.
 * 
 * BullhornAPI, formJobOrderDto and updatingUserID are required and therefore set to final.
 * 
 * @author magnus.palm
 * 
 */
public class JobOrderFormTriggerHelper extends AbstractFormTriggerHelper<FormJobOrderDto, JobOrder> {

	private CorporateUser jobOwner;
	private ClientCorporation clientCorpration;

	public JobOrderFormTriggerHelper(FormJobOrderDto formJobOrderDto, Integer updatingUserID, BullhornData bullhornData) {
		super(formJobOrderDto, updatingUserID, bullhornData);
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

}
