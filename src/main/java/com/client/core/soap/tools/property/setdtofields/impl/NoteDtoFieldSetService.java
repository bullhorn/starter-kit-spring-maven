package com.client.core.soap.tools.property.setdtofields.impl;

import java.util.Map;

import org.springframework.stereotype.Service;

import com.bullhorn.entity.note.NoteDto;
import com.client.core.soap.tools.property.setdtofields.DtoFieldSetService;
import com.client.core.base.util.Utility;

@Service("noteSetService")
public class NoteDtoFieldSetService extends DtoFieldSetService<NoteDto> {

	public NoteDtoFieldSetService() {
		super();
	}

	@Override
	public NoteDto changeDto(NoteDto note, Map<String, String> fieldValues, String dateFormat, Boolean isDotPrefixed) {
		for(String initialField : fieldValues.keySet()) {
			String value = fieldValues.get(initialField);

			String field = initialField;
			if(isDotPrefixed) {
				field = removeDotPrefix(initialField);
			}

			if(field.equalsIgnoreCase(ACTION)) {

				note.setAction(value);

			} else if(field.equalsIgnoreCase(BHTIMESTAMP)) {

				note.setBhTimeStamp(value.getBytes());

			} else if(field.equalsIgnoreCase(COMMENTINGPERSONID)) {

				note.setCommentingPersonID(Utility.forceParseInteger(value));

			} else if(field.equalsIgnoreCase(COMMENTS)) {

				note.setComments(value);

			} else if(field.equalsIgnoreCase(DATEADDED)) {

				note.setDateAdded(Utility.forceParseStringToXMLGregorianCalendar(value, dateFormat));

			} else if(field.equalsIgnoreCase(ISDELETED)) {

				note.setIsDeleted(Utility.parseBoolean(value));

			} else if(field.equalsIgnoreCase(JOBORDERID)) {

				note.setJobOrderID(Utility.forceParseInteger(value));

			} else if(field.equalsIgnoreCase(MIGRATEGUID)) {

				note.setMigrateGUID(value);

			} else if(field.equalsIgnoreCase(MINUTESSPENT)) {

				note.setMinutesSpent(Utility.forceParseInteger(value));

			} else if(field.equalsIgnoreCase(NOTEID)) {

				note.setNoteID(Utility.forceParseInteger(value));

			} else if(field.equalsIgnoreCase(PERSONREFERENCEID)) {

				note.setPersonReferenceID(Utility.forceParseInteger(value));

			}

		}
		
		return note;
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
