package com.client.core.resttrigger.workflow.traversing;

import com.bullhornsdk.data.model.entity.core.standard.Note;
import com.client.core.base.model.relatedentity.BullhornRelatedEntity;
import com.client.core.base.workflow.traversing.AbstractTriggerTraverser;
import com.client.core.resttrigger.model.helper.impl.NoteRestTriggerHelper;

import java.util.Map;
import java.util.Set;

public class NoteRestTriggerTraverser extends AbstractTriggerTraverser<Note, NoteRestTriggerHelper> {

	public NoteRestTriggerTraverser(Integer entityID, Map<String, Object> valuesChanged, Integer updatingUserID, boolean edit,
									Map<? extends BullhornRelatedEntity, Set<String>> relatedEntityFields) {
		super(new NoteRestTriggerHelper(entityID, valuesChanged, updatingUserID, relatedEntityFields), edit);
	}

}
