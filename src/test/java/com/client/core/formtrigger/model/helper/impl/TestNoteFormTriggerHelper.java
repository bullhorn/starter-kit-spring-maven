package com.client.core.formtrigger.model.helper.impl;

import com.bullhornsdk.data.model.entity.core.standard.Note;
import com.client.core.formtrigger.model.form.impl.FormNoteDto;

public class TestNoteFormTriggerHelper extends TestFormTriggerHelper<NoteFormTriggerHelper, FormNoteDto, Note> {

	@Override
	public void scaffoldThis() {
		this.helper = testUtil.getNoteValidationTraverser().getFormTriggerHelper();
	}

}
