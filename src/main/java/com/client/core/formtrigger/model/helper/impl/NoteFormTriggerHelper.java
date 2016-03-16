package com.client.core.formtrigger.model.helper.impl;

import com.bullhornsdk.data.api.BullhornData;
import com.bullhornsdk.data.model.entity.core.standard.Note;
import com.client.core.formtrigger.model.helper.AbstractFormTriggerHelper;
import com.client.core.formtrigger.model.form.impl.FormNoteDto;

/**
 * Holds and keeps data needed for validations to minimize the number of API calls.
 * 
 * BullhornAPI, formJobOrderDto and updatingUserID are required and therefore set to final.
 * 
 * @author magnus.palm
 */
public class NoteFormTriggerHelper extends AbstractFormTriggerHelper<FormNoteDto, Note> {


	public NoteFormTriggerHelper(FormNoteDto formNoteDto, Integer updatingUserID, BullhornData bullhornData) {
		super(formNoteDto, updatingUserID, bullhornData);

		this.getFormValues().setCommentingUserID(updatingUserID);
	}

}
