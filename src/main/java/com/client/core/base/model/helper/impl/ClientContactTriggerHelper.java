package com.client.core.base.model.helper.impl;

import com.bullhornsdk.data.api.BullhornData;
import com.bullhornsdk.data.model.entity.core.standard.ClientContact;
import com.bullhornsdk.data.model.entity.core.standard.ClientCorporation;
import com.client.core.base.model.helper.AbstractTriggerHelper;

/**
 * Holds and keeps data needed for validations to minimize the number of API calls.
 * 
 * BullhornAPI, FormClientContactDto and updatingUserID are required and therefore set to final.
 * 
 * @author magnus.palm
 * 
 */
public abstract class ClientContactTriggerHelper extends AbstractTriggerHelper<ClientContact> {

	private ClientCorporation clientCorporation;

	public ClientContactTriggerHelper(Integer updatingUserID, BullhornData bullhornData) {
		super(updatingUserID, bullhornData);
	}

	public ClientCorporation getClientCorporation() {
		if (clientCorporation == null) {
			setClientCorporation(findClientCorporation(getNewEntity().getClientCorporation().getId()));
		}

		return clientCorporation;
	}

	public void setClientCorporation(ClientCorporation clientCorporation) {
		this.clientCorporation = clientCorporation;
	}

	@Override
	public Integer getUpdatingUserID() {
		return updatingUserID;
	}

	@Override
	public void setNewEntity(ClientContact newEntity) {
		this.newEntity = newEntity;
	}

	@Override
	public ClientContact getOldEntity() {
		if (oldEntity == null) {
			setOldEntity(findClientContact(getNewEntity().getId()));
		}

		return oldEntity;
	}

	@Override
	public void setOldEntity(ClientContact oldEntity) {
		this.oldEntity = oldEntity;
	}

}
