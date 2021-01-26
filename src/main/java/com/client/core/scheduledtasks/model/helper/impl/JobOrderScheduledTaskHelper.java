package com.client.core.scheduledtasks.model.helper.impl;

import com.bullhornsdk.data.model.entity.core.standard.ClientContact;
import com.bullhornsdk.data.model.entity.core.standard.ClientCorporation;
import com.bullhornsdk.data.model.entity.core.standard.CorporateUser;
import com.bullhornsdk.data.model.entity.core.standard.JobOrder;
import com.client.core.base.model.relatedentity.BullhornRelatedEntity;
import com.client.core.base.model.relatedentity.JobOrderRelatedEntity;
import com.client.core.scheduledtasks.model.helper.AbstractScheduledTaskHelper;
import com.client.core.scheduledtasks.model.helper.CustomSubscriptionEvent;

import java.util.Map;
import java.util.Set;

public class JobOrderScheduledTaskHelper extends AbstractScheduledTaskHelper<JobOrder> {

	private ClientCorporation clientCorporation;
	private ClientContact clientContact;
	private CorporateUser jobOwner;

	public JobOrderScheduledTaskHelper(CustomSubscriptionEvent event, Map<? extends BullhornRelatedEntity, Set<String>> relatedEntityFields) {
		super(event, JobOrder.class, JobOrderRelatedEntity.JOB_ORDER, relatedEntityFields);
	}

	public JobOrder getJobOrder() {
        return getEntity();
    }

	public ClientCorporation getClientCorporation() {
		if (clientCorporation == null) {
			this.clientCorporation = findClientCorporation(getJobOrder().getClientCorporation().getId(), JobOrderRelatedEntity.CLIENT_CORPORATION);
		}

		return clientCorporation;
	}

	public ClientContact getClientContact() {
		if (clientContact == null) {
			this.clientContact = findClientContact(getJobOrder().getClientContact().getId(), JobOrderRelatedEntity.CLIENT_CONTACT);
		}

		return clientContact;
	}

	public CorporateUser getJobOwner() {
		if (jobOwner == null) {
			this.jobOwner = findCorporateUser(getJobOrder().getOwner().getId(), JobOrderRelatedEntity.JOB_OWNER);
		}

		return jobOwner;
	}

}
