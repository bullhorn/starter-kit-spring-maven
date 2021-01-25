package com.client.core.formtrigger.model.helper.impl;

import com.bullhornsdk.data.model.entity.core.standard.Note;
import com.client.core.base.model.helper.impl.NoteTriggerHelper;
import com.client.core.base.model.relatedentity.BullhornRelatedEntity;
import com.client.core.formtrigger.model.form.impl.FormNoteDto;
import com.client.core.formtrigger.model.helper.FormTriggerHelper;

import java.util.Map;
import java.util.Set;

public class NoteFormTriggerHelper extends NoteTriggerHelper implements FormTriggerHelper<FormNoteDto, Note> {

	private final FormNoteDto formNoteDto;

	public NoteFormTriggerHelper(FormNoteDto formNoteDto, Integer updatingUserID,
								 Map<? extends BullhornRelatedEntity, Set<String>> relatedEntityFields) {
		super(updatingUserID, relatedEntityFields);
		this.formNoteDto = formNoteDto;
		this.formNoteDto.setCommentingUserID(updatingUserID);
	}

	@Override
	public FormNoteDto getFormValues() {
		return formNoteDto;
	}

	@Override
	protected Note instantiateNewEntity() {
		return formNoteDto.instantiateEntity();
	}
}
