package com.client.core.base.model.helper.impl;

import com.bullhornsdk.data.model.entity.core.standard.JobOrder;
import com.bullhornsdk.data.model.entity.core.standard.Note;
import com.bullhornsdk.data.model.entity.core.standard.Person;
import com.client.core.base.model.helper.AbstractTriggerHelper;
import com.client.core.base.model.relatedentity.BullhornRelatedEntity;
import com.client.core.base.model.relatedentity.NoteRelatedEntity;

import java.util.Map;
import java.util.Optional;
import java.util.Set;

public abstract class NoteTriggerHelper extends AbstractTriggerHelper<Note> {

	private Person personReference;
	private Person commentingPerson;
	private JobOrder jobOrder;

	public NoteTriggerHelper(Integer updatingUserID, Map<? extends BullhornRelatedEntity, Set<String>> relatedEntityFields) {
		super(updatingUserID, Note.class, NoteRelatedEntity.NOTE, relatedEntityFields);
	}

	public Person getPersonReference() {
		if (personReference == null) {
			this.personReference = findPerson(getNewEntity().getPersonReference().getId(), NoteRelatedEntity.PERSON_REFERENCE);
		}

		return personReference;
	}

	public Person getCommentingPerson() {
		if (commentingPerson == null) {
			this.commentingPerson = findPerson(getNewEntity().getPersonReference().getId(), NoteRelatedEntity.COMMENTING_PERSON);
		}

		return commentingPerson;
	}

	public Optional<JobOrder> getJobOrder() {
		if (jobOrder == null && isPopulated(getNewEntity().getJobOrder())) {
			this.jobOrder = findJobOrder(getNewEntity().getJobOrder().getId(), NoteRelatedEntity.JOB_ORDER);
		}

		return Optional.ofNullable(jobOrder);
	}

}
