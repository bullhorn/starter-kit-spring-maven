package com.client.core.formtrigger.model.helper.impl;

import com.bullhornsdk.data.api.BullhornData;
import com.bullhornsdk.data.model.entity.core.standard.Note;
import com.client.core.base.model.helper.impl.NoteTriggerHelper;
import com.client.core.formtrigger.model.form.impl.FormNoteDto;
import com.client.core.formtrigger.model.helper.FormTriggerHelper;

/**
 * Holds and keeps data needed for validations to minimize the number of API calls.
 * 
 * BullhornAPI, formJobOrderDto and updatingUserID are required and therefore set to final.
 * 
 * @author magnus.palm
 * 
 */
public class NoteFormTriggerHelper extends NoteTriggerHelper implements FormTriggerHelper<FormNoteDto, Note> {

	private final FormNoteDto formNoteDto;

	public NoteFormTriggerHelper(FormNoteDto formNoteDto, Integer updatingUserID, BullhornData bullhornData) {
		super(updatingUserID, bullhornData);
		this.formNoteDto = formNoteDto;
		this.formNoteDto.setCommentingUserID(updatingUserID);
	}

	@Override
	public Note getNewEntity() {
		if (newEntity == null) {
			setNewEntity(formNoteDto.instantiateEntity());
		}

		return newEntity;
	}

	@Override
	public FormNoteDto getFormValues() {
		return formNoteDto;
	}

}
