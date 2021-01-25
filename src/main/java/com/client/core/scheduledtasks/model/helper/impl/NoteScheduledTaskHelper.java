package com.client.core.scheduledtasks.model.helper.impl;

import com.bullhornsdk.data.model.entity.core.standard.JobOrder;
import com.bullhornsdk.data.model.entity.core.standard.Note;
import com.bullhornsdk.data.model.entity.core.standard.Person;
import com.client.core.base.model.relatedentity.BullhornRelatedEntity;
import com.client.core.base.model.relatedentity.NoteRelatedEntity;
import com.client.core.scheduledtasks.model.helper.AbstractScheduledTaskHelper;
import com.client.core.scheduledtasks.model.helper.CustomSubscriptionEvent;

import java.util.Map;
import java.util.Optional;
import java.util.Set;

public class NoteScheduledTaskHelper extends AbstractScheduledTaskHelper<Note> {

	private Person personReference;
	private Person commentingPerson;
	private JobOrder jobOrder;

	public NoteScheduledTaskHelper(CustomSubscriptionEvent event, Map<? extends BullhornRelatedEntity, Set<String>> relatedEntityFields) {
		super(event, Note.class, NoteRelatedEntity.NOTE, relatedEntityFields);
	}

	public Note getNote() {
        return getEntity();
    }

	public Person getPersonReference() {
		if (personReference == null) {
			this.personReference = findPerson(getNote().getPersonReference().getId(), NoteRelatedEntity.PERSON_REFERENCE);
		}

		return personReference;
	}

	public Person getCommentingPerson() {
		if (commentingPerson == null) {
			this.commentingPerson = findPerson(getNote().getPersonReference().getId(), NoteRelatedEntity.COMMENTING_PERSON);
		}

		return commentingPerson;
	}

	public Optional<JobOrder> getJobOrder() {
		if (jobOrder == null && isPopulated(getNote().getJobOrder())) {
			this.jobOrder = findJobOrder(getNote().getJobOrder().getId(), NoteRelatedEntity.JOB_ORDER);
		}

		return Optional.ofNullable(jobOrder);
	}
	
}
