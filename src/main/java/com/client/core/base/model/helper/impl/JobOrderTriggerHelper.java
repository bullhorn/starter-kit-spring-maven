package com.client.core.base.model.helper.impl;

import com.bullhornsdk.data.model.entity.core.standard.ClientContact;
import com.bullhornsdk.data.model.entity.core.standard.ClientCorporation;
import com.bullhornsdk.data.model.entity.core.standard.CorporateUser;
import com.bullhornsdk.data.model.entity.core.standard.JobOrder;
import com.client.core.base.model.helper.AbstractTriggerHelper;
import com.client.core.base.model.relatedentity.BullhornRelatedEntity;
import com.client.core.base.model.relatedentity.JobOrderRelatedEntity;

import java.util.Map;
import java.util.Set;

public abstract class JobOrderTriggerHelper extends AbstractTriggerHelper<JobOrder> {

	private CorporateUser jobOwner;
	private ClientContact clientContact;
	private ClientCorporation clientCorporation;

	public JobOrderTriggerHelper(Integer updatingUserID, Map<? extends BullhornRelatedEntity, Set<String>> relatedEntityFields) {
		super(updatingUserID, JobOrder.class, JobOrderRelatedEntity.JOB_ORDER, relatedEntityFields);
	}

	public CorporateUser getJobOwner() {
		if (jobOwner == null) {
			this.jobOwner = findCorporateUser(getNewEntity().getOwner().getId(), JobOrderRelatedEntity.JOB_OWNER);
		}

		return jobOwner;
	}

	public ClientContact getClientContact() {
		if (clientContact == null) {
			this.clientContact = findClientContact(getNewEntity().getClientContact().getId(), JobOrderRelatedEntity.CLIENT_CONTACT);
		}

		return clientContact;
	}

	public ClientCorporation getClientCorporation() {
		if (clientCorporation == null) {
			this.clientCorporation = findClientCorporation(getNewEntity().getClientCorporation().getId(), JobOrderRelatedEntity.CLIENT_CORPORATION);
		}

		return clientCorporation;
	}

}
