package com.client.core.soap.tools.property.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

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
import com.client.core.soap.tools.property.DtoFieldChangeFactory;
import com.client.core.soap.tools.property.getdtofields.DtoFieldGetService;
import com.client.core.soap.tools.property.setdtofields.DtoFieldSetService;


@Service("dtoFieldChangeFactory")
public class StandardDtoFieldChangeFactory implements DtoFieldChangeFactory {
	private final DtoFieldGetService<AppointmentDto> appointmentGetService;
	private final DtoFieldGetService<CandidateDto> candidateGetService;
	private final DtoFieldGetService<CandidateEducationDto> candidateEducationGetService;
	private final DtoFieldGetService<CandidateReferenceDto> candidateReferenceGetService;
	private final DtoFieldGetService<CandidateWorkHistoryDto> candidateWorkHistoryGetService;
	private final DtoFieldGetService<ClientContactDto> clientContactGetService;
	private final DtoFieldGetService<ClientCorporationDto> clientCorporationGetService;
	private final DtoFieldGetService<CorporateUserDto> corporateUserGetService;
	private final DtoFieldGetService<JobOrderDto> jobOrderGetService;
	private final DtoFieldGetService<JobSubmissionDto> jobSubmissionGetService;
	private final DtoFieldGetService<NoteDto> noteGetService;
	private final DtoFieldGetService<PlacementChangeRequestDto> placementChangeRequestGetService;
	private final DtoFieldGetService<PlacementCommissionDto> placementCommissionGetService;
	private final DtoFieldGetService<PlacementDto> placementGetService;
	private final DtoFieldGetService<SendoutDto> sendoutGetService;
	private final DtoFieldGetService<TaskDto> taskGetService;
	private final DtoFieldGetService<UserTypeDto> userTypeGetService;
	private final DtoFieldGetService<UserWorkDto> userWorkGetService;

	private final DtoFieldSetService<AppointmentDto> appointmentSetService;
	private final DtoFieldSetService<CandidateDto> candidateSetService;
	private final DtoFieldSetService<CandidateEducationDto> candidateEducationSetService;
	private final DtoFieldSetService<CandidateReferenceDto> candidateReferenceSetService;
	private final DtoFieldSetService<CandidateWorkHistoryDto> candidateWorkHistorySetService;
	private final DtoFieldSetService<ClientContactDto> clientContactSetService;
	private final DtoFieldSetService<ClientCorporationDto> clientCorporationSetService;
	private final DtoFieldSetService<CorporateUserDto> corporateUserSetService;
	private final DtoFieldSetService<JobOrderDto> jobOrderSetService;
	private final DtoFieldSetService<JobSubmissionDto> jobSubmissionSetService;
	private final DtoFieldSetService<NoteDto> noteSetService;
	private final DtoFieldSetService<PlacementChangeRequestDto> placementChangeRequestSetService;
	private final DtoFieldSetService<PlacementCommissionDto> placementCommissionSetService;
	private final DtoFieldSetService<PlacementDto> placementSetService;
	private final DtoFieldSetService<SendoutDto> sendoutSetService;
	private final DtoFieldSetService<TaskDto> taskSetService;
	private final DtoFieldSetService<UserTypeDto> userTypeSetService;
	private final DtoFieldSetService<UserWorkDto> userWorkSetService;
	
	@Autowired
	public StandardDtoFieldChangeFactory(
			@Qualifier("appointmentGetService") DtoFieldGetService<AppointmentDto> appointmentGetService,
			@Qualifier("candidateGetService") DtoFieldGetService<CandidateDto> candidateGetService,
			@Qualifier("candidateEducationGetService") DtoFieldGetService<CandidateEducationDto> candidateEducationGetService,
			@Qualifier("candidateReferenceGetService") DtoFieldGetService<CandidateReferenceDto> candidateReferenceGetService,
			@Qualifier("candidateWorkHistoryGetService") DtoFieldGetService<CandidateWorkHistoryDto> candidateWorkHistoryGetService,
			@Qualifier("clientContactGetService") DtoFieldGetService<ClientContactDto> clientContactGetService,
			@Qualifier("clientCorporationGetService") DtoFieldGetService<ClientCorporationDto> clientCorporationGetService,
			@Qualifier("corporateUserGetService") DtoFieldGetService<CorporateUserDto> corporateUserGetService,
			@Qualifier("jobOrderGetService") DtoFieldGetService<JobOrderDto> jobOrderGetService,
			@Qualifier("jobSubmissionGetService") DtoFieldGetService<JobSubmissionDto> jobSubmissionGetService,
			@Qualifier("noteGetService") DtoFieldGetService<NoteDto> noteGetService,
			@Qualifier("placementChangeRequestGetService") DtoFieldGetService<PlacementChangeRequestDto> placementChangeRequestGetService,
			@Qualifier("placementCommissionGetService") DtoFieldGetService<PlacementCommissionDto> placementCommissionGetService,
			@Qualifier("placementGetService") DtoFieldGetService<PlacementDto> placementGetService,
			@Qualifier("sendoutGetService") DtoFieldGetService<SendoutDto> sendoutGetService,
			@Qualifier("taskGetService") DtoFieldGetService<TaskDto> taskGetService,
			@Qualifier("userTypeGetService") DtoFieldGetService<UserTypeDto> userTypeGetService,
			@Qualifier("userWorkGetService") DtoFieldGetService<UserWorkDto> userWorkGetService,

			@Qualifier("appointmentSetService") DtoFieldSetService<AppointmentDto> appointmentSetService,
			@Qualifier("candidateSetService") DtoFieldSetService<CandidateDto> candidateSetService,
			@Qualifier("candidateEducationSetService") DtoFieldSetService<CandidateEducationDto> candidateEducationSetService,
			@Qualifier("candidateReferenceSetService") DtoFieldSetService<CandidateReferenceDto> candidateReferenceSetService,
			@Qualifier("candidateWorkHistorySetService") DtoFieldSetService<CandidateWorkHistoryDto> candidateWorkHistorySetService,
			@Qualifier("clientContactSetService") DtoFieldSetService<ClientContactDto> clientContactSetService,
			@Qualifier("clientCorporationSetService") DtoFieldSetService<ClientCorporationDto> clientCorporationSetService,
			@Qualifier("corporateUserSetService") DtoFieldSetService<CorporateUserDto> corporateUserSetService,
			@Qualifier("jobOrderSetService") DtoFieldSetService<JobOrderDto> jobOrderSetService,
			@Qualifier("jobSubmissionSetService") DtoFieldSetService<JobSubmissionDto> jobSubmissionSetService,
			@Qualifier("noteSetService") DtoFieldSetService<NoteDto> noteSetService,
			@Qualifier("placementChangeRequestSetService") DtoFieldSetService<PlacementChangeRequestDto> placementChangeRequestSetService,
			@Qualifier("placementCommissionSetService") DtoFieldSetService<PlacementCommissionDto> placementCommissionSetService,
			@Qualifier("placementSetService") DtoFieldSetService<PlacementDto> placementSetService,
			@Qualifier("sendoutSetService") DtoFieldSetService<SendoutDto> sendoutSetService,
			@Qualifier("taskSetService") DtoFieldSetService<TaskDto> taskSetService,
			@Qualifier("userTypeSetService") DtoFieldSetService<UserTypeDto> userTypeSetService,
			@Qualifier("userWorkSetService") DtoFieldSetService<UserWorkDto> userWorkSetService) {
		super();
		
		this.appointmentGetService=appointmentGetService;
		this.candidateGetService=candidateGetService;
		this.candidateEducationGetService=candidateEducationGetService;
		this.candidateReferenceGetService=candidateReferenceGetService;
		this.candidateWorkHistoryGetService=candidateWorkHistoryGetService;
		this.clientContactGetService=clientContactGetService;
		this.clientCorporationGetService=clientCorporationGetService;
		this.corporateUserGetService=corporateUserGetService;
		this.jobOrderGetService=jobOrderGetService;
		this.jobSubmissionGetService=jobSubmissionGetService;
		this.noteGetService=noteGetService;
		this.placementChangeRequestGetService=placementChangeRequestGetService;
		this.placementCommissionGetService=placementCommissionGetService;
		this.placementGetService=placementGetService;
		this.sendoutGetService=sendoutGetService;
		this.taskGetService=taskGetService;
		this.userTypeGetService=userTypeGetService;
		this.userWorkGetService=userWorkGetService;
		
		this.appointmentSetService=appointmentSetService;
		this.candidateSetService=candidateSetService;
		this.candidateEducationSetService=candidateEducationSetService;
		this.candidateReferenceSetService=candidateReferenceSetService;
		this.candidateWorkHistorySetService=candidateWorkHistorySetService;
		this.clientContactSetService=clientContactSetService;
		this.clientCorporationSetService=clientCorporationSetService;
		this.corporateUserSetService=corporateUserSetService;
		this.jobOrderSetService=jobOrderSetService;
		this.jobSubmissionSetService=jobSubmissionSetService;
		this.noteSetService=noteSetService;
		this.placementChangeRequestSetService=placementChangeRequestSetService;
		this.placementCommissionSetService=placementCommissionSetService;
		this.placementSetService=placementSetService;
		this.sendoutSetService=sendoutSetService;
		this.taskSetService=taskSetService;
		this.userTypeSetService=userTypeSetService;
		this.userWorkSetService=userWorkSetService;
	}
	
	@Override
	public DtoFieldGetService<AppointmentDto> getAppointmentGetService() {
		return appointmentGetService;
	}

	@Override
	public DtoFieldGetService<CandidateDto> getCandidateGetService() {
		return candidateGetService;
	}

	@Override
	public DtoFieldGetService<CandidateEducationDto> getCandidateEducationGetService() {
		return candidateEducationGetService;
	}

	@Override
	public DtoFieldGetService<CandidateReferenceDto> getCandidateReferenceGetService() {
		return candidateReferenceGetService;
	}

	@Override
	public DtoFieldGetService<CandidateWorkHistoryDto> getCandidateWorkHistoryGetService() {
		return candidateWorkHistoryGetService;
	}

	@Override
	public DtoFieldGetService<ClientContactDto> getClientContactGetService() {
		return clientContactGetService;
	}

	@Override
	public DtoFieldGetService<ClientCorporationDto> getClientCorporationGetService() {
		return clientCorporationGetService;
	}

	@Override
	public DtoFieldGetService<CorporateUserDto> getCorporateUserGetService() {
		return corporateUserGetService;
	}

	@Override
	public DtoFieldGetService<JobOrderDto> getJobOrderGetService() {
		return jobOrderGetService;
	}

	@Override
	public DtoFieldGetService<JobSubmissionDto> getJobSubmissionGetService() {
		return jobSubmissionGetService;
	}

	@Override
	public DtoFieldGetService<NoteDto> getNoteGetService() {
		return noteGetService;
	}

	@Override
	public DtoFieldGetService<PlacementChangeRequestDto> getPlacementChangeRequestGetService() {
		return placementChangeRequestGetService;
	}

	@Override
	public DtoFieldGetService<PlacementCommissionDto> getPlacementCommissionGetService() {
		return placementCommissionGetService;
	}

	@Override
	public DtoFieldGetService<PlacementDto> getPlacementGetService() {
		return placementGetService;
	}

	@Override
	public DtoFieldGetService<SendoutDto> getSendoutGetService() {
		return sendoutGetService;
	}

	@Override
	public DtoFieldGetService<TaskDto> getTaskGetService() {
		return taskGetService;
	}

	@Override
	public DtoFieldGetService<UserTypeDto> getUserTypeGetService() {
		return userTypeGetService;
	}

	@Override
	public DtoFieldGetService<UserWorkDto> getUserWorkGetService() {
		return userWorkGetService;
	}
	

	@Override
	public DtoFieldSetService<AppointmentDto> getAppointmentSetService() {
		return appointmentSetService;
	}

	@Override
	public DtoFieldSetService<CandidateDto> getCandidateSetService() {
		return candidateSetService;
	}

	@Override
	public DtoFieldSetService<CandidateEducationDto> getCandidateEducationSetService() {
		return candidateEducationSetService;
	}

	@Override
	public DtoFieldSetService<CandidateReferenceDto> getCandidateReferenceSetService() {
		return candidateReferenceSetService;
	}

	@Override
	public DtoFieldSetService<CandidateWorkHistoryDto> getCandidateWorkHistorySetService() {
		return candidateWorkHistorySetService;
	}

	@Override
	public DtoFieldSetService<ClientContactDto> getClientContactSetService() {
		return clientContactSetService;
	}

	@Override
	public DtoFieldSetService<ClientCorporationDto> getClientCorporationSetService() {
		return clientCorporationSetService;
	}

	@Override
	public DtoFieldSetService<CorporateUserDto> getCorporateUserSetService() {
		return corporateUserSetService;
	}

	@Override
	public DtoFieldSetService<JobOrderDto> getJobOrderSetService() {
		return jobOrderSetService;
	}

	@Override
	public DtoFieldSetService<JobSubmissionDto> getJobSubmissionSetService() {
		return jobSubmissionSetService;
	}

	@Override
	public DtoFieldSetService<NoteDto> getNoteSetService() {
		return noteSetService;
	}

	@Override
	public DtoFieldSetService<PlacementChangeRequestDto> getPlacementChangeRequestSetService() {
		return placementChangeRequestSetService;
	}

	@Override
	public DtoFieldSetService<PlacementCommissionDto> getPlacementCommissionSetService() {
		return placementCommissionSetService;
	}

	@Override
	public DtoFieldSetService<PlacementDto> getPlacementSetService() {
		return placementSetService;
	}

	@Override
	public DtoFieldSetService<SendoutDto> getSendoutSetService() {
		return sendoutSetService;
	}

	@Override
	public DtoFieldSetService<TaskDto> getTaskSetService() {
		return taskSetService;
	}

	@Override
	public DtoFieldSetService<UserTypeDto> getUserTypeSetService() {
		return userTypeSetService;
	}

	@Override
	public DtoFieldSetService<UserWorkDto> getUserWorkSetService() {
		return userWorkSetService;
	}

	@SuppressWarnings("unchecked")
	@Override
	public <E extends AbstractDto> DtoFieldGetService<E> getServiceByClass(Class<E> dtoClass) {
		if(dtoClass.equals(AppointmentDto.class)) {
			return (DtoFieldGetService<E>) getAppointmentGetService();
		} else if(dtoClass.equals(CandidateDto.class)) {
			return (DtoFieldGetService<E>) getCandidateGetService();
		} else if(dtoClass.equals(CandidateEducationDto.class)) {
			return (DtoFieldGetService<E>) getCandidateEducationGetService();
		} else if(dtoClass.equals(CandidateReferenceDto.class)) {
			return (DtoFieldGetService<E>) getCandidateReferenceGetService();
		} else if(dtoClass.equals(CandidateWorkHistoryDto.class)) {
			return (DtoFieldGetService<E>) getCandidateWorkHistoryGetService();
		} else if(dtoClass.equals(ClientContactDto.class)) {
			return (DtoFieldGetService<E>) getClientContactGetService();
		} else if(dtoClass.equals(ClientCorporationDto.class)) {
			return (DtoFieldGetService<E>) getClientCorporationGetService();
		} else if(dtoClass.equals(CorporateUserDto.class)) {
			return (DtoFieldGetService<E>) getCorporateUserGetService();
		} else if(dtoClass.equals(JobOrderDto.class)) {
			return (DtoFieldGetService<E>) getJobOrderGetService();
		} else if(dtoClass.equals(JobSubmissionDto.class)) {
			return (DtoFieldGetService<E>) getJobSubmissionGetService();
		} else if(dtoClass.equals(NoteDto.class)) {
			return (DtoFieldGetService<E>) getNoteGetService();
		} else if(dtoClass.equals(PlacementChangeRequestDto.class)) {
			return (DtoFieldGetService<E>) getPlacementChangeRequestGetService();
		} else if(dtoClass.equals(PlacementCommissionDto.class)) {
			return (DtoFieldGetService<E>) getPlacementCommissionGetService();
		} else if(dtoClass.equals(PlacementDto.class)) {
			return (DtoFieldGetService<E>) getPlacementGetService();
		} else if(dtoClass.equals(SendoutDto.class)) {
			return (DtoFieldGetService<E>) getSendoutGetService();
		} else if(dtoClass.equals(TaskDto.class)) {
			return (DtoFieldGetService<E>) getTaskGetService();
		} else if(dtoClass.equals(UserTypeDto.class)) {
			return (DtoFieldGetService<E>) getUserTypeGetService();
		} else if(dtoClass.equals(UserWorkDto.class)) {
			return (DtoFieldGetService<E>) getUserWorkGetService();
		}
		
		return null;
	}

	@SuppressWarnings("unchecked")
	@Override
	public <E extends AbstractDto> DtoFieldSetService<E> setServiceByClass(Class<E> dtoClass) {
		if(dtoClass.equals(AppointmentDto.class)) {
			return (DtoFieldSetService<E>) getAppointmentSetService();
		} else if(dtoClass.equals(CandidateDto.class)) {
			return (DtoFieldSetService<E>) getCandidateSetService();
		} else if(dtoClass.equals(CandidateEducationDto.class)) {
			return (DtoFieldSetService<E>) getCandidateEducationSetService();
		} else if(dtoClass.equals(CandidateReferenceDto.class)) {
			return (DtoFieldSetService<E>) getCandidateReferenceSetService();
		} else if(dtoClass.equals(CandidateWorkHistoryDto.class)) {
			return (DtoFieldSetService<E>) getCandidateWorkHistorySetService();
		} else if(dtoClass.equals(ClientContactDto.class)) {
			return (DtoFieldSetService<E>) getClientContactSetService();
		} else if(dtoClass.equals(ClientCorporationDto.class)) {
			return (DtoFieldSetService<E>) getClientCorporationSetService();
		} else if(dtoClass.equals(CorporateUserDto.class)) {
			return (DtoFieldSetService<E>) getCorporateUserSetService();
		} else if(dtoClass.equals(JobOrderDto.class)) {
			return (DtoFieldSetService<E>) getJobOrderSetService();
		} else if(dtoClass.equals(JobSubmissionDto.class)) {
			return (DtoFieldSetService<E>) getJobSubmissionSetService();
		} else if(dtoClass.equals(NoteDto.class)) {
			return (DtoFieldSetService<E>) getNoteSetService();
		} else if(dtoClass.equals(PlacementDto.class)) {
			return (DtoFieldSetService<E>) getPlacementSetService();
		} else if(dtoClass.equals(PlacementChangeRequestDto.class)) {
			return (DtoFieldSetService<E>) getPlacementChangeRequestSetService();
		} else if(dtoClass.equals(PlacementCommissionDto.class)) {
			return (DtoFieldSetService<E>) getPlacementCommissionSetService();
		} else if(dtoClass.equals(PlacementDto.class)) {
			return (DtoFieldSetService<E>) getPlacementSetService();
		} else if(dtoClass.equals(SendoutDto.class)) {
			return (DtoFieldSetService<E>) getSendoutSetService();
		} else if(dtoClass.equals(TaskDto.class)) {
			return (DtoFieldSetService<E>) getTaskSetService();
		} else if(dtoClass.equals(UserTypeDto.class)) {
			return (DtoFieldSetService<E>) getUserTypeSetService();
		} else if(dtoClass.equals(UserWorkDto.class)) {
			return (DtoFieldSetService<E>) getUserWorkSetService();
		}
		
		return null;
	}

}
