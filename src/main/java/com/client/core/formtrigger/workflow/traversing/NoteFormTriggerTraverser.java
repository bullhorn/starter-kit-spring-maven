package com.client.core.formtrigger.workflow.traversing;

import com.bullhornsdk.data.api.BullhornData;
import com.bullhornsdk.data.model.entity.core.standard.Note;
import com.client.core.base.workflow.traversing.AbstractTriggerTraverser;
import com.client.core.formtrigger.model.form.impl.FormNoteDto;
import com.client.core.formtrigger.model.helper.impl.NoteFormTriggerHelper;

/**
 * A Traverser is passed through a Node work flow and it's instance variables are set for future Event handling.
 * 
 * @author magnus.palm
 * 
 */

public class NoteFormTriggerTraverser extends AbstractTriggerTraverser<Note, NoteFormTriggerHelper> {

	public NoteFormTriggerTraverser(FormNoteDto formNoteDto, Integer updatingUserID, boolean edit,
                                    BullhornData bullhornData) {
		super(new NoteFormTriggerHelper(formNoteDto, updatingUserID, bullhornData), edit);
	}

}
