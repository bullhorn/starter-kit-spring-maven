package com.client.core.soap.tools.property.getdtofields.impl;

import org.springframework.stereotype.Service;

import com.bullhorn.entity.note.NoteDto;
import com.client.core.soap.tools.property.getdtofields.DtoFieldGetService;

@Service("noteGetService")
public class NoteDtoFieldGetService extends DtoFieldGetService<NoteDto> {

	public NoteDtoFieldGetService() {
		super();
	}

	@Override
	public Object retrieveField(String field, NoteDto note, Boolean isDotPrefixed) throws NoSuchMethodException {
		Object value = null;

		if(isDotPrefixed) {
			field = removeDotPrefix(field);
		}
		
		if (field.equalsIgnoreCase(ACTION)) {
			value = note.getAction();
		}
		else if (field.equalsIgnoreCase(BHTIMESTAMP)) {
			value = note.getBhTimeStamp();
		}
		else if (field.equalsIgnoreCase(COMMENTINGPERSONID)) {
			value = note.getCommentingPersonID();
		}
		else if (field.equalsIgnoreCase(COMMENTS)) {
			value = note.getComments();
		}
		else if (field.equalsIgnoreCase(DATEADDED)) {
			value = note.getDateAdded();
		}
		else if (field.equalsIgnoreCase(ISDELETED)) {
			value = note.isIsDeleted();
		}
		else if (field.equalsIgnoreCase(JOBORDERID)) {
			value = note.getJobOrderID();
		}
		else if (field.equalsIgnoreCase(MIGRATEGUID)) {
			value = note.getMigrateGUID();
		}
		else if (field.equalsIgnoreCase(MINUTESSPENT)) {
			value = note.getMinutesSpent();
		}
		else if (field.equalsIgnoreCase(NOTEID)) {
			value = note.getNoteID();
		}
		else if (field.equalsIgnoreCase(PERSONREFERENCEID)) {
			value = note.getPersonReferenceID();
		}
		else {
			throw new NoSuchMethodException();
		}

		return value;
	}

	private String ACTION="action";
	private String BHTIMESTAMP="bhTimeStamp";
	private String COMMENTINGPERSONID="commentingPersonID";
	private String COMMENTS="comments";
	private String DATEADDED="dateAdded";
	private String ISDELETED="isDeleted";
	private String JOBORDERID="jobOrderID";
	private String MIGRATEGUID="migrateGUID";
	private String MINUTESSPENT="minutesSpent";
	private String NOTEID="noteID";
	private String PERSONREFERENCEID="personReferenceID";

}
