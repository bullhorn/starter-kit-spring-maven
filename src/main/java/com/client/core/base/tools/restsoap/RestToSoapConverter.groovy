package com.client.core.base.tools.restsoap

import com.bullhorn.entity.appointment.AppointmentAttendeeDto
import com.bullhorn.entity.appointment.AppointmentDto
import com.bullhorn.entity.candidate.*
import com.bullhorn.entity.cert.CertificationDto
import com.bullhorn.entity.client.ClientContactDto
import com.bullhorn.entity.client.ClientCorporationDto
import com.bullhorn.entity.corp.CorporationDepartmentDto
import com.bullhorn.entity.job.*
import com.bullhorn.entity.lists.*
import com.bullhorn.entity.note.NoteDto
import com.bullhorn.entity.note.NoteEntityDto
import com.bullhorn.entity.task.TaskDto
import com.bullhorn.entity.user.CorporateUserDto
import com.bullhornsdk.data.model.entity.core.standard.*

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
