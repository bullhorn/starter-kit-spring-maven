package com.client.core.resttrigger.model.helper.impl;

import com.bullhornsdk.data.model.entity.core.standard.Note;
import com.bullhornsdk.data.model.entity.embedded.OneToMany;
import com.client.core.base.model.helper.impl.NoteTriggerHelper;
import com.client.core.base.model.relatedentity.BullhornRelatedEntity;
import com.client.core.base.model.relatedentity.NoteRelatedEntity;
import com.client.core.base.util.TriggerUtil;
import com.client.core.resttrigger.model.enums.NoteReferenceFields;
import com.client.core.resttrigger.model.helper.RestTriggerHelper;
import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

@Slf4j
public class NoteRestTriggerHelper extends NoteTriggerHelper implements RestTriggerHelper<Note> {

	private final Integer entityID;
	private final Map<String, Object> valuesChanged;

	public NoteRestTriggerHelper(Integer entityID, Map<String, Object> valuesChanged, Integer updatingUserID,
								 Map<? extends BullhornRelatedEntity, Set<String>> relatedEntityFields) {
		super(updatingUserID, relatedEntityFields);
		this.entityID = entityID;
		this.valuesChanged = valuesChanged;
	}

	@Override
	public Set<String> getPopulatedFields() {
		return valuesChanged.keySet();
	}

	@Override
	public Integer getEntityID() {
		return entityID;
	}

	@Override
	public Map<String, Object> getValuesChanged() {
		return valuesChanged;
	}

	@Override
	protected Note instantiateNewEntity() {
		Note newEntity = TriggerUtil.populateEntity(entityID, Note.class, valuesChanged, Note::new, getFields(NoteRelatedEntity.NOTE));

		applySpecialFieldRules(newEntity);

		return newEntity;
	}

	private void applySpecialFieldRules(Note note){
		Arrays.asList(NoteReferenceFields.values()).parallelStream().forEach(referenceField -> {
			try {
				if (valuesChanged.get(referenceField.getFieldName()) != null) {
					OneToMany<?> references;

					if (entityID > 0) {
						references = TriggerUtil.convertReplaceAllToEntityOneToMany((Map<String, List<Integer>>) valuesChanged.get(referenceField.getFieldName()), referenceField.getConstructor());
					} else {
						references = TriggerUtil.convertIdListToEntityOneToMany((List<Map<String, Integer>>) valuesChanged.get(referenceField.getFieldName()), referenceField.getConstructor());
					}

					referenceField.getSetReference().accept(note, references);
				}
			} catch(Exception e) {
				log.error("Error applying special field rules for note.  Error on field '" + referenceField.getFieldName() + "', data was: \n" + valuesChanged.get(referenceField.getFieldName()));
			}
		});
	}
}
