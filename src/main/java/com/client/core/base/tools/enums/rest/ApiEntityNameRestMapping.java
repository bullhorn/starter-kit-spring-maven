package com.client.core.base.tools.enums.rest;


import com.bullhorn.entity.ApiEntityName;
import com.bullhornsdk.data.model.entity.core.standard.Appointment;
import com.bullhornsdk.data.model.entity.core.standard.AppointmentAttendee;
import com.bullhornsdk.data.model.entity.core.standard.BusinessSector;
import com.bullhornsdk.data.model.entity.core.standard.Candidate;
import com.bullhornsdk.data.model.entity.core.standard.CandidateEducation;
import com.bullhornsdk.data.model.entity.core.standard.CandidateReference;
import com.bullhornsdk.data.model.entity.core.standard.CandidateWorkHistory;
import com.bullhornsdk.data.model.entity.core.standard.Category;
import com.bullhornsdk.data.model.entity.core.standard.Certification;
import com.bullhornsdk.data.model.entity.core.standard.ClientContact;
import com.bullhornsdk.data.model.entity.core.standard.ClientCorporation;
import com.bullhornsdk.data.model.entity.core.standard.CorporateUser;
import com.bullhornsdk.data.model.entity.core.standard.CorporationDepartment;
import com.bullhornsdk.data.model.entity.core.standard.Country;
import com.bullhornsdk.data.model.entity.core.standard.HousingComplex;
import com.bullhornsdk.data.model.entity.core.standard.JobOrder;
import com.bullhornsdk.data.model.entity.core.standard.JobSubmission;
import com.bullhornsdk.data.model.entity.core.standard.Note;
import com.bullhornsdk.data.model.entity.core.standard.NoteEntity;
import com.bullhornsdk.data.model.entity.core.standard.Placement;
import com.bullhornsdk.data.model.entity.core.standard.PlacementChangeRequest;
import com.bullhornsdk.data.model.entity.core.standard.PlacementCommission;
import com.bullhornsdk.data.model.entity.core.standard.Sendout;
import com.bullhornsdk.data.model.entity.core.standard.Skill;
import com.bullhornsdk.data.model.entity.core.standard.Specialty;
import com.bullhornsdk.data.model.entity.core.standard.State;
import com.bullhornsdk.data.model.entity.core.standard.Task;
import com.bullhornsdk.data.model.entity.core.standard.TimeUnit;
import com.bullhornsdk.data.model.entity.core.type.BullhornEntity;

public enum ApiEntityNameRestMapping {
	APPOINTMENT(ApiEntityName.APPOINTMENT, Appointment.class),
	APPOINTMENT_ATTENDEE(ApiEntityName.APPOINTMENT_ATTENDEE, AppointmentAttendee.class),
	BUSINESS_SECTOR(ApiEntityName.BUSINESS_SECTOR, BusinessSector.class),
	CANDIDATE(ApiEntityName.CANDIDATE, Candidate.class),
	CANDIDATE_EDUCATION(ApiEntityName.CANDIDATE_EDUCATION, CandidateEducation.class),
	CANDIDATE_REFERENCE(ApiEntityName.CANDIDATE_REFERENCE, CandidateReference.class),
	CANDIDATE_WORK_HISTORY(ApiEntityName.CANDIDATE_WORK_HISTORY, CandidateWorkHistory.class),
	CATEGORY(ApiEntityName.CATEGORY, Category.class),
	CERTIFICATION(ApiEntityName.CERTIFICATION, Certification.class),
	CLIENT_CONTACT(ApiEntityName.CLIENT_CONTACT, ClientContact.class),
	CLIENT_CORPORATION(ApiEntityName.CLIENT_CORPORATION, ClientCorporation.class),
	CORPORATE_USER(ApiEntityName.CORPORATE_USER, CorporateUser.class),
	CORPORATION_DEPARTMENT(ApiEntityName.CORPORATION_DEPARTMENT, CorporationDepartment.class),
	COUNTRY(ApiEntityName.COUNTRY, Country.class),
	HOUSING_COMPLEX(ApiEntityName.HOUSING_COMPLEX, HousingComplex.class),
	JOB_ORDER(ApiEntityName.JOB_ORDER, JobOrder.class),
	JOB_SUBMISSION(ApiEntityName.JOB_SUBMISSION, JobSubmission.class),
	NOTE(ApiEntityName.NOTE, Note.class),
	NOTE_ENTITY(ApiEntityName.NOTE_ENTITY, NoteEntity.class),
	PLACEMENT(ApiEntityName.PLACEMENT, Placement.class),
	PLACEMENT_CHANGE_REQUEST(ApiEntityName.PLACEMENT_CHANGE_REQUEST, PlacementChangeRequest.class),
	PLACEMENT_COMMISSION(ApiEntityName.PLACEMENT_COMMISSION, PlacementCommission.class),
	SENDOUT(ApiEntityName.SENDOUT, Sendout.class),
	SKILL(ApiEntityName.SKILL, Skill.class),
	SPECIALTY(ApiEntityName.SPECIALTY, Specialty.class),
	STATE(ApiEntityName.STATE, State.class),
	TASK(ApiEntityName.TASK, Task.class),
	TIME_UNIT(ApiEntityName.TIME_UNIT, TimeUnit.class),
	;
	
	private final ApiEntityName apiEntityName;
	private final Class<? extends BullhornEntity> restClass;

	private ApiEntityNameRestMapping(ApiEntityName apiEntityName, Class<? extends BullhornEntity> restClass) {
		this.apiEntityName = apiEntityName;
		this.restClass = restClass;
	}

	public ApiEntityName getApiEntityName() {
		return apiEntityName;
	}

	public Class<? extends BullhornEntity> getRestClass() {
		return restClass;
	}
	
	public static ApiEntityNameRestMapping fromApiEntityName(ApiEntityName entityName) {
		for(ApiEntityNameRestMapping mapping : ApiEntityNameRestMapping.values()) {
			if(mapping.getApiEntityName().equals(entityName)) {
				return mapping;
			}
		}
		
		throw new IllegalArgumentException("Not a valid ApiEntityName: "+entityName);
	}
	
	public static ApiEntityNameRestMapping fromDisplayName(String displayName) {
		for(ApiEntityNameRestMapping mapping : ApiEntityNameRestMapping.values()) {
			if(mapping.getApiEntityName().value().equals(displayName)) {
				return mapping;
			}
		}
		
		throw new IllegalArgumentException("Not a valid displayName: "+displayName);
	}
	
	public static ApiEntityNameRestMapping fromEntityClass(Class<? extends BullhornEntity> entityClass) {
		for(ApiEntityNameRestMapping mapping : ApiEntityNameRestMapping.values()) {
			if(mapping.getRestClass().equals(entityClass)) {
				return mapping;
			}
		}
		
		throw new IllegalArgumentException("Not a valid entityClass: "+entityClass);
	}

}
