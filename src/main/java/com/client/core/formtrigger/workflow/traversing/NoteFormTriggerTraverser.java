package com.client.core.formtrigger.workflow.traversing;

import com.bullhornsdk.data.model.entity.core.standard.Note;
import com.client.core.base.model.relatedentity.BullhornRelatedEntity;
import com.client.core.base.workflow.traversing.AbstractTriggerTraverser;
import com.client.core.formtrigger.model.form.impl.FormNoteDto;
import com.client.core.formtrigger.model.helper.impl.NoteFormTriggerHelper;

import java.util.Map;
import java.util.Set;

public class NoteFormTriggerTraverser extends AbstractTriggerTraverser<Note, NoteFormTriggerHelper> {

	public NoteFormTriggerTraverser(FormNoteDto formNoteDto, Integer updatingUserID, boolean edit,
									Map<? extends BullhornRelatedEntity, Set<String>> relatedEntityFields) {
		super(new NoteFormTriggerHelper(formNoteDto, updatingUserID, relatedEntityFields), edit);
	}

}
