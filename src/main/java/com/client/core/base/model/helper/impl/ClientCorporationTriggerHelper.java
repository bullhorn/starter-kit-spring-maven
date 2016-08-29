package com.client.core.base.model.helper.impl;

import com.bullhornsdk.data.api.BullhornData;
import com.bullhornsdk.data.model.entity.core.standard.ClientCorporation;
import com.client.core.base.model.helper.AbstractTriggerHelper;

/**
 * Holds and keeps data needed for validations to minimize the number of API calls.
 * 
 * BullhornAPI, formClientCorporationDto and updatingUserID are required and therefore set to final.
 * 
 * @author magnus.palm
 * 
 */
public abstract class ClientCorporationTriggerHelper extends AbstractTriggerHelper<ClientCorporation> {

	public ClientCorporationTriggerHelper(Integer updatingUserID, BullhornData bullhornData) {
		super(updatingUserID, bullhornData);
	}

	@Override
	public Integer getUpdatingUserID() {
		return updatingUserID;
	}

	@Override
	public void setNewEntity(ClientCorporation newDto) {
		this.newEntity = newDto;

	}

	@Override
	public ClientCorporation getOldEntity() {
		if (oldEntity == null) {
			setOldEntity(findClientCorporation(getNewEntity().getId()));
		}
		return oldEntity;
	}

	@Override
	public void setOldEntity(ClientCorporation oldDto) {
		this.oldEntity = oldDto;

	}
}
