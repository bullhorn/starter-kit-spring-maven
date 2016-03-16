package com.client.core.soap.tools.property;

import com.bullhorn.entity.AbstractDto;
import com.bullhorn.entity.appointment.AppointmentDto;
import com.bullhorn.entity.candidate.CandidateDto;
import com.bullhorn.entity.candidate.CandidateEducationDto;
import com.bullhorn.entity.candidate.CandidateReferenceDto;
import com.bullhorn.entity.candidate.CandidateWorkHistoryDto;
import com.bullhorn.entity.candidate.SendoutDto;
import com.bullhorn.entity.client.ClientContactDto;
import com.bullhorn.entity.client.ClientCorporationDto;
import com.bullhorn.entity.job.JobOrderDto;
import com.bullhorn.entity.job.JobSubmissionDto;
import com.bullhorn.entity.job.PlacementChangeRequestDto;
import com.bullhorn.entity.job.PlacementCommissionDto;
import com.bullhorn.entity.job.PlacementDto;
import com.bullhorn.entity.note.NoteDto;
import com.bullhorn.entity.task.TaskDto;
import com.bullhorn.entity.user.CorporateUserDto;
import com.bullhorn.entity.user.UserTypeDto;
import com.bullhorn.entity.userwork.UserWorkDto;
import com.client.core.soap.tools.property.getdtofields.DtoFieldGetService;
import com.client.core.soap.tools.property.setdtofields.DtoFieldSetService;

public interface DtoFieldChangeFactory {
	
	public DtoFieldGetService<AppointmentDto> getAppointmentGetService();

	public DtoFieldGetService<CandidateDto> getCandidateGetService();
	
	public DtoFieldGetService<CandidateEducationDto> getCandidateEducationGetService();
	
	public DtoFieldGetService<CandidateReferenceDto> getCandidateReferenceGetService();
	
	public DtoFieldGetService<CandidateWorkHistoryDto> getCandidateWorkHistoryGetService();
	
	public DtoFieldGetService<ClientContactDto> getClientContactGetService();
	
	public DtoFieldGetService<ClientCorporationDto> getClientCorporationGetService();
	
	public DtoFieldGetService<CorporateUserDto> getCorporateUserGetService();
	
	public DtoFieldGetService<JobOrderDto> getJobOrderGetService();
	
	public DtoFieldGetService<JobSubmissionDto> getJobSubmissionGetService();
	
	public DtoFieldGetService<NoteDto> getNoteGetService();
	
	public DtoFieldGetService<PlacementChangeRequestDto> getPlacementChangeRequestGetService();
	
	public DtoFieldGetService<PlacementCommissionDto> getPlacementCommissionGetService();
	
	public DtoFieldGetService<PlacementDto> getPlacementGetService();
	
	public DtoFieldGetService<SendoutDto> getSendoutGetService();

	public DtoFieldGetService<TaskDto> getTaskGetService();
	
	public DtoFieldGetService<UserTypeDto> getUserTypeGetService();
	
	public DtoFieldGetService<UserWorkDto> getUserWorkGetService();
	
	public DtoFieldSetService<AppointmentDto> getAppointmentSetService();
	
	public DtoFieldSetService<CandidateDto> getCandidateSetService();
	
	public DtoFieldSetService<CandidateEducationDto> getCandidateEducationSetService();
	
	public DtoFieldSetService<CandidateReferenceDto> getCandidateReferenceSetService();
	
	public DtoFieldSetService<CandidateWorkHistoryDto> getCandidateWorkHistorySetService();
	
	public DtoFieldSetService<ClientContactDto> getClientContactSetService();
	
	public DtoFieldSetService<ClientCorporationDto> getClientCorporationSetService();
	
	public DtoFieldSetService<CorporateUserDto> getCorporateUserSetService();
	
	public DtoFieldSetService<JobOrderDto> getJobOrderSetService();
	
	public DtoFieldSetService<JobSubmissionDto> getJobSubmissionSetService();
	
	public DtoFieldSetService<NoteDto> getNoteSetService();
	
	public DtoFieldSetService<PlacementChangeRequestDto> getPlacementChangeRequestSetService();
	
	public DtoFieldSetService<PlacementCommissionDto> getPlacementCommissionSetService();
	
	public DtoFieldSetService<PlacementDto> getPlacementSetService();
	
	public DtoFieldSetService<SendoutDto> getSendoutSetService();

	public DtoFieldSetService<TaskDto> getTaskSetService();
	
	public DtoFieldSetService<UserWorkDto> getUserWorkSetService();
	
	public DtoFieldSetService<UserTypeDto> getUserTypeSetService();
	
	public <E extends AbstractDto> DtoFieldGetService<E> getServiceByClass(Class<E> dtoClass);
	
	public <E extends AbstractDto> DtoFieldSetService<E> setServiceByClass(Class<E> dtoClass);
	
	
	
}