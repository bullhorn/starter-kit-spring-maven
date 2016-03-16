package com.client.core.formtrigger.workflow.traversing.impl;

import com.bullhornsdk.data.api.BullhornData;
import com.client.core.formtrigger.model.helper.impl.NoteFormTriggerHelper;
import com.client.core.formtrigger.workflow.traversing.AbstractValidationTraverser;
import com.client.core.formtrigger.model.form.impl.FormNoteDto;

/**
 * A Traverser is passed through a Node work flow and it's instance variables are set for future Event handling.
 * 
 * @author magnus.palm
 * 
 */

public class NoteValidationTraverser extends AbstractValidationTraverser<NoteFormTriggerHelper> {

	public NoteValidationTraverser(FormNoteDto formNoteDto, Integer updatingUserID, Integer corporationID, boolean edit,
			BullhornData bullhornData) {
		super(new NoteFormTriggerHelper(formNoteDto, updatingUserID, bullhornData), corporationID, edit);
	}

}
