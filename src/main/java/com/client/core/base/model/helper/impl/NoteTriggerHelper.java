package com.client.core.base.model.helper.impl;

import com.bullhornsdk.data.api.BullhornData;
import com.bullhornsdk.data.model.entity.core.standard.Note;
import com.client.core.base.model.helper.AbstractTriggerHelper;

/**
 * Holds and keeps data needed for validations to minimize the number of API calls.
 * 
 * BullhornAPI, formJobOrderDto and updatingUserID are required and therefore set to final.
 * 
 * @author magnus.palm
 * 
 */
public abstract class NoteTriggerHelper extends AbstractTriggerHelper<Note> {

	public NoteTriggerHelper(Integer updatingUserID, BullhornData bullhornData) {
		super(updatingUserID, bullhornData);
	}

	@Override
	public Integer getUpdatingUserID() {
		return updatingUserID;
	}

	@Override
	public void setNewEntity(Note newEntity) {
		this.newEntity = newEntity;
	}

	@Override
	public Note getOldEntity() {
		if (oldEntity == null) {
			setOldEntity(findNote(getNewEntity().getId()));
		}

		return oldEntity;
	}

	@Override
	public void setOldEntity(Note oldEntity) {
		this.oldEntity = oldEntity;
	}

}
