package com.client.core.base.tools.restsoap;

import com.bullhorn.entity.appointment.AppointmentAttendeeDto
import com.bullhorn.entity.appointment.AppointmentDto
import com.bullhorn.entity.candidate.CandidateDto
import com.bullhorn.entity.candidate.CandidateEducationDto
import com.bullhorn.entity.candidate.CandidateReferenceDto
import com.bullhorn.entity.candidate.CandidateWorkHistoryDto
import com.bullhorn.entity.candidate.SendoutDto
import com.bullhorn.entity.cert.CertificationDto
import com.bullhorn.entity.client.ClientContactDto
import com.bullhorn.entity.client.ClientCorporationDto
import com.bullhorn.entity.corp.CorporationDepartmentDto
import com.bullhorn.entity.job.JobOrderDto
import com.bullhorn.entity.job.JobSubmissionDto
import com.bullhorn.entity.job.PlacementChangeRequestDto
import com.bullhorn.entity.job.PlacementCommissionDto
import com.bullhorn.entity.job.PlacementDto
import com.bullhorn.entity.lists.BusinessSectorDto
import com.bullhorn.entity.lists.CategoryDto
import com.bullhorn.entity.lists.CountryDto
import com.bullhorn.entity.lists.SkillDto
import com.bullhorn.entity.lists.SpecialtyDto
import com.bullhorn.entity.lists.StateDto
import com.bullhorn.entity.lists.TimeUnitDto
import com.bullhorn.entity.note.NoteDto
import com.bullhorn.entity.note.NoteEntityDto
import com.bullhorn.entity.task.TaskDto
import com.bullhorn.entity.user.CorporateUserDto
import com.bullhornsdk.data.model.entity.core.standard.Appointment
import com.bullhornsdk.data.model.entity.core.standard.AppointmentAttendee
import com.bullhornsdk.data.model.entity.core.standard.BusinessSector
import com.bullhornsdk.data.model.entity.core.standard.Candidate
import com.bullhornsdk.data.model.entity.core.standard.Category
import com.bullhornsdk.data.model.entity.core.standard.CandidateEducation
import com.bullhornsdk.data.model.entity.core.standard.CandidateReference
import com.bullhornsdk.data.model.entity.core.standard.CandidateWorkHistory
import com.bullhornsdk.data.model.entity.core.standard.Certification
import com.bullhornsdk.data.model.entity.core.standard.ClientContact
import com.bullhornsdk.data.model.entity.core.standard.ClientCorporation
import com.bullhornsdk.data.model.entity.core.standard.CorporateUser
import com.bullhornsdk.data.model.entity.core.standard.CorporationDepartment
import com.bullhornsdk.data.model.entity.core.standard.Country
import com.bullhornsdk.data.model.entity.core.standard.JobOrder
import com.bullhornsdk.data.model.entity.core.standard.JobSubmission
import com.bullhornsdk.data.model.entity.core.standard.Note
import com.bullhornsdk.data.model.entity.core.standard.NoteEntity
import com.bullhornsdk.data.model.entity.core.standard.Placement
import com.bullhornsdk.data.model.entity.core.standard.PlacementChangeRequest
import com.bullhornsdk.data.model.entity.core.standard.PlacementCommission
import com.bullhornsdk.data.model.entity.core.standard.Sendout
import com.bullhornsdk.data.model.entity.core.standard.Skill
import com.bullhornsdk.data.model.entity.core.standard.Specialty
import com.bullhornsdk.data.model.entity.core.standard.State
import com.bullhornsdk.data.model.entity.core.standard.Task
import com.bullhornsdk.data.model.entity.core.standard.TimeUnit

public interface RestToSoapConverter {

	public AppointmentDto convert(Appointment entity);

	public AppointmentAttendeeDto convert(AppointmentAttendee entity);

	public BusinessSectorDto convert(BusinessSector entity);

	public CandidateDto convert(Candidate entity);

	public CandidateEducationDto convert(CandidateEducation entity);

	public CandidateReferenceDto convert(CandidateReference entity);

	public CandidateWorkHistoryDto convert(CandidateWorkHistory entity);

	public CategoryDto convert(Category entity);

	public CertificationDto convert(Certification entity);

	public ClientContactDto convert(ClientContact entity);

	public ClientCorporationDto convert(ClientCorporation entity);

	public CorporateUserDto convert(CorporateUser entity);

	public CorporationDepartmentDto convert(CorporationDepartment entity);

	public CountryDto convert(Country entity);

	public JobOrderDto convert(JobOrder entity);

	public JobSubmissionDto convert(JobSubmission entity);

	public NoteDto convert(Note entity);

	public NoteEntityDto convert(NoteEntity entity);

	public PlacementDto convert(Placement entity);

	public PlacementChangeRequestDto convert(PlacementChangeRequest entity);

	public PlacementCommissionDto convert(PlacementCommission entity);

	public SendoutDto convert(Sendout entity);

	public SkillDto convert(Skill entity);

	public SpecialtyDto convert(Specialty entity);

	public StateDto convert(State entity);

	public TaskDto convert(Task entity);

	public TimeUnitDto convert(TimeUnit entity);

}
