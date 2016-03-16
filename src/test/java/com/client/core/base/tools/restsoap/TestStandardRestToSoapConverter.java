package com.client.core.base.tools.restsoap;

import org.junit.Ignore;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.bullhorn.entity.appointment.AppointmentAttendeeDto;
import com.bullhorn.entity.appointment.AppointmentDto;
import com.bullhorn.entity.candidate.CandidateDto;
import com.bullhorn.entity.candidate.CandidateEducationDto;
import com.bullhorn.entity.candidate.CandidateReferenceDto;
import com.bullhorn.entity.candidate.CandidateWorkHistoryDto;
import com.bullhorn.entity.candidate.SendoutDto;
import com.bullhorn.entity.cert.CertificationDto;
import com.bullhorn.entity.client.ClientContactDto;
import com.bullhorn.entity.client.ClientCorporationDto;
import com.bullhorn.entity.corp.CorporationDepartmentDto;
import com.bullhorn.entity.job.JobOrderDto;
import com.bullhorn.entity.job.JobSubmissionDto;
import com.bullhorn.entity.job.PlacementChangeRequestDto;
import com.bullhorn.entity.job.PlacementCommissionDto;
import com.bullhorn.entity.job.PlacementDto;
import com.bullhorn.entity.lists.BusinessSectorDto;
import com.bullhorn.entity.lists.CategoryDto;
import com.bullhorn.entity.lists.CountryDto;
import com.bullhorn.entity.lists.SkillDto;
import com.bullhorn.entity.lists.SpecialtyDto;
import com.bullhorn.entity.lists.StateDto;
import com.bullhorn.entity.lists.TimeUnitDto;
import com.bullhorn.entity.note.NoteDto;
import com.bullhorn.entity.note.NoteEntityDto;
import com.bullhorn.entity.task.TaskDto;
import com.bullhorn.entity.user.CorporateUserDto;
import com.bullhornsdk.data.api.BullhornData;
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
import com.client.BaseTest;

@Ignore
public class TestStandardRestToSoapConverter extends BaseTest {

	@Autowired
	private RestToSoapConverter restToSoapConverter;

	@Autowired
	private BullhornData bullhornData;

	@Test
	public void testConvertAppointment() {
		Appointment entity = bullhornData.findEntity(Appointment.class, getTestEntities().getAppointmentId());

		AppointmentDto convertedEntity = restToSoapConverter.convert(entity);

		assert convertedEntity != null;
		assert entity.getId() == convertedEntity.getAppointmentID();
	}

	@Test
	public void testConvertAppointmentAttendee() {
		AppointmentAttendee entity = bullhornData.findEntity(AppointmentAttendee.class, getTestEntities().getAppointmentAttendeeId());

		AppointmentAttendeeDto convertedEntity = restToSoapConverter.convert(entity);

		assert convertedEntity != null;
		assert entity.getId() == convertedEntity.getAppointmentAttendeeID();
	}

	@Test
	public void testConvertBusinessSector() {
		BusinessSector entity = bullhornData.findEntity(BusinessSector.class, getTestEntities().getBusinessSectorId());

		BusinessSectorDto convertedEntity = restToSoapConverter.convert(entity);

		assert convertedEntity != null;
		assert entity.getId() == convertedEntity.getBusinessSectorID();
	}

	@Test
	public void testConvertCandidate() {
		Candidate entity = bullhornData.findEntity(Candidate.class, getTestEntities().getCandidateId());

		CandidateDto convertedEntity = restToSoapConverter.convert(entity);

		assert convertedEntity != null;
		assert entity.getId() == convertedEntity.getUserID();
	}

	@Test
	public void testConvertCandidateEducation() {
		CandidateEducation entity = bullhornData.findEntity(CandidateEducation.class, getTestEntities().getCandidateEducationId());

		CandidateEducationDto convertedEntity = restToSoapConverter.convert(entity);

		assert convertedEntity != null;
		assert entity.getId() == convertedEntity.getCandidateEducationID();
	}

	@Test
	public void testConvertCandidateReference() {
		CandidateReference entity = bullhornData.findEntity(CandidateReference.class, getTestEntities().getCandidateReferenceId());

		CandidateReferenceDto convertedEntity = restToSoapConverter.convert(entity);

		assert convertedEntity != null;
		assert entity.getId() == convertedEntity.getCandidateReferenceID();
	}

	@Test
	public void testConvertCandidateWorkHistory() {
		CandidateWorkHistory entity = bullhornData.findEntity(CandidateWorkHistory.class, getTestEntities().getCandidateWorkHistoryId());

		CandidateWorkHistoryDto convertedEntity = restToSoapConverter.convert(entity);

		assert convertedEntity != null;
		assert entity.getId() == convertedEntity.getCandidateWorkHistoryID();
	}

	@Test
	public void testConvertCategory() {
		Category entity = bullhornData.findEntity(Category.class, getTestEntities().getCategoryId());

		CategoryDto convertedEntity = restToSoapConverter.convert(entity);

		assert convertedEntity != null;
		assert entity.getId() == convertedEntity.getCategoryID();
	}

	@Test
	public void testConvertCertification() {
		Certification entity = bullhornData.findEntity(Certification.class, getTestEntities().getCertificationId());

		CertificationDto convertedEntity = restToSoapConverter.convert(entity);

		assert convertedEntity != null;
		assert entity.getId() == convertedEntity.getCertificationID();
	}

	@Test
	public void testConvertClientContact() {
		ClientContact entity = bullhornData.findEntity(ClientContact.class, getTestEntities().getClientContactId());

		ClientContactDto convertedEntity = restToSoapConverter.convert(entity);

		assert convertedEntity != null;
		assert entity.getId() == convertedEntity.getUserID();
	}

	@Test
	public void testConvertClientCorporation() {
		ClientCorporation entity = bullhornData.findEntity(ClientCorporation.class, getTestEntities().getClientCorporationId());

		ClientCorporationDto convertedEntity = restToSoapConverter.convert(entity);

		assert convertedEntity != null;
		assert entity.getId() == convertedEntity.getClientCorporationID();
	}

	@Test
	public void testConvertCorporateUser() {
		CorporateUser entity = bullhornData.findEntity(CorporateUser.class, getTestEntities().getCorporateUserId());

		CorporateUserDto convertedEntity = restToSoapConverter.convert(entity);

		assert convertedEntity != null;
		assert entity.getId() == convertedEntity.getUserID();
	}

	@Test
	public void testConvertCorporationDepartment() {
		CorporationDepartment entity = bullhornData.findEntity(CorporationDepartment.class, getTestEntities()
				.getCorporationDepartmentId());

		CorporationDepartmentDto convertedEntity = restToSoapConverter.convert(entity);

		assert convertedEntity != null;
		assert entity.getId() == convertedEntity.getDepartmentID();
	}

	@Test
	public void testConvertCountry() {
		Country entity = bullhornData.findEntity(Country.class, getTestEntities().getCountryId());

		CountryDto convertedEntity = restToSoapConverter.convert(entity);

		assert convertedEntity != null;
		assert entity.getId() == convertedEntity.getCountryID();
	}

	@Test
	public void testConvertJobOrder() {
		JobOrder entity = bullhornData.findEntity(JobOrder.class, getTestEntities().getJobOrderId());

		JobOrderDto convertedEntity = restToSoapConverter.convert(entity);

		assert convertedEntity != null;
		assert entity.getId() == convertedEntity.getJobOrderID();
	}

	@Test
	public void testConvertJobSubmission() {
		JobSubmission entity = bullhornData.findEntity(JobSubmission.class, getTestEntities().getJobSubmissionId());

		JobSubmissionDto convertedEntity = restToSoapConverter.convert(entity);

		assert convertedEntity != null;
		assert entity.getId() == convertedEntity.getJobSubmissionID();
	}

	@Test
	public void testConvertNote() {
		Note entity = bullhornData.findEntity(Note.class, getTestEntities().getNoteId());

		NoteDto convertedEntity = restToSoapConverter.convert(entity);

		assert convertedEntity != null;
		assert entity.getId() == convertedEntity.getNoteID();
	}

	@Test
	public void testConvertNoteEntity() {
		NoteEntity entity = bullhornData.findEntity(NoteEntity.class, getTestEntities().getNoteEntityId());

		NoteEntityDto convertedEntity = restToSoapConverter.convert(entity);

		assert convertedEntity != null;
		assert entity.getId() == convertedEntity.getNoteEntityID();
	}

	@Test
	public void testConvertPlacement() {
		Placement entity = bullhornData.findEntity(Placement.class, getTestEntities().getPlacementId());

		PlacementDto convertedEntity = restToSoapConverter.convert(entity);

		assert convertedEntity != null;
		assert entity.getId() == convertedEntity.getPlacementID();
	}

	@Test
	public void testConvertPlacementChangeRequest() {
		PlacementChangeRequest entity = bullhornData.findEntity(PlacementChangeRequest.class, getTestEntities()
				.getPlacementChangeRequestId());

		PlacementChangeRequestDto convertedEntity = restToSoapConverter.convert(entity);

		assert convertedEntity != null;
		assert entity.getId() == convertedEntity.getPlacementChangeRequestID();
	}

	@Test
	public void testConvertPlacementCommission() {
		PlacementCommission entity = bullhornData.findEntity(PlacementCommission.class, getTestEntities().getPlacementCommissionId());

		PlacementCommissionDto convertedEntity = restToSoapConverter.convert(entity);

		assert convertedEntity != null;
		assert entity.getId() == convertedEntity.getCommissionID();
	}

	@Test
	public void testConvertSendout() {
		Sendout entity = bullhornData.findEntity(Sendout.class, getTestEntities().getSendoutId());

		SendoutDto convertedEntity = restToSoapConverter.convert(entity);

		assert convertedEntity != null;
		assert entity.getId() == convertedEntity.getSendoutID();
	}

	@Test
	public void testConvertSkill() {
		Skill entity = bullhornData.findEntity(Skill.class, getTestEntities().getSkillId());

		SkillDto convertedEntity = restToSoapConverter.convert(entity);

		assert convertedEntity != null;
		assert entity.getId() == convertedEntity.getSkillID();
	}

	@Test
	public void testConvertSpecialty() {
		Specialty entity = bullhornData.findEntity(Specialty.class, getTestEntities().getSpecialtyId());

		SpecialtyDto convertedEntity = restToSoapConverter.convert(entity);

		assert convertedEntity != null;
		assert entity.getId() == convertedEntity.getSpecialtyID();
	}

	@Test
	public void testConvertState() {
		State entity = bullhornData.findEntity(State.class, getTestEntities().getStateId());

		StateDto convertedEntity = restToSoapConverter.convert(entity);

		assert convertedEntity != null;
		assert entity.getId() == convertedEntity.getStateID();
	}

	@Test
	public void testConvertTask() {
		Task entity = bullhornData.findEntity(Task.class, getTestEntities().getTaskId());

		TaskDto convertedEntity = restToSoapConverter.convert(entity);

		assert convertedEntity != null;
		assert entity.getId() == convertedEntity.getTaskID();
	}

	@Test
	public void testConvertTimeUnit() {
		TimeUnit entity = bullhornData.findEntity(TimeUnit.class, getTestEntities().getTimeUnitId());

		TimeUnitDto convertedEntity = restToSoapConverter.convert(entity);

		assert convertedEntity != null;
		assert entity.getId() == convertedEntity.getTimeUnitID();
	}

}
