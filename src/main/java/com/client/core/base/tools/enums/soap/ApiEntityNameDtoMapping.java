package com.client.core.base.tools.enums.soap;

import org.apache.commons.lang.StringUtils;

import com.bullhorn.entity.AbstractDto;
import com.bullhorn.entity.ApiEntityName;
import com.bullhorn.entity.appointment.AppointmentAttendeeDto;
import com.bullhorn.entity.appointment.AppointmentDto;
import com.bullhorn.entity.appointment.RecurringAppointmentDeleteDto;
import com.bullhorn.entity.candidate.CandidateAssessmentDto;
import com.bullhorn.entity.candidate.CandidateAssessmentSystemDto;
import com.bullhorn.entity.candidate.CandidateCertificationDto;
import com.bullhorn.entity.candidate.CandidateDto;
import com.bullhorn.entity.candidate.CandidateEducationDto;
import com.bullhorn.entity.candidate.CandidateReferenceDto;
import com.bullhorn.entity.candidate.CandidateReferenceQuestionDto;
import com.bullhorn.entity.candidate.CandidateReferenceResponseDto;
import com.bullhorn.entity.candidate.CandidateSourceDto;
import com.bullhorn.entity.candidate.CandidateWorkHistoryDto;
import com.bullhorn.entity.candidate.SendoutDto;
import com.bullhorn.entity.cert.CertificationDto;
import com.bullhorn.entity.client.ClientContactDto;
import com.bullhorn.entity.client.ClientCorporationCertificationDto;
import com.bullhorn.entity.client.ClientCorporationDto;
import com.bullhorn.entity.client.ClientCorporationInvoiceGroupDto;
import com.bullhorn.entity.corp.CorporationDepartmentDto;
import com.bullhorn.entity.corp.CostCenterDto;
import com.bullhorn.entity.distlist.DistributionListDto;
import com.bullhorn.entity.housing.HousingComplexAmenityDto;
import com.bullhorn.entity.housing.HousingComplexDto;
import com.bullhorn.entity.housing.HousingComplexFurnitureDeliveryDto;
import com.bullhorn.entity.housing.HousingComplexUnitDto;
import com.bullhorn.entity.housing.HousingComplexUtilityAccountDto;
import com.bullhorn.entity.invoice.InvoiceDto;
import com.bullhorn.entity.invoice.InvoiceGroupDto;
import com.bullhorn.entity.invoice.InvoiceItemDto;
import com.bullhorn.entity.job.JobOrderDto;
import com.bullhorn.entity.job.JobSubmissionDto;
import com.bullhorn.entity.job.PlacementChangeRequestDto;
import com.bullhorn.entity.job.PlacementCommissionDto;
import com.bullhorn.entity.job.PlacementDto;
import com.bullhorn.entity.job.WorkersCompensationDto;
import com.bullhorn.entity.job.WorkersCompensationRateDto;
import com.bullhorn.entity.lists.BusinessSectorDto;
import com.bullhorn.entity.lists.CategoryDto;
import com.bullhorn.entity.lists.CountryDto;
import com.bullhorn.entity.lists.SkillDto;
import com.bullhorn.entity.lists.SpecialtyDto;
import com.bullhorn.entity.lists.StateDto;
import com.bullhorn.entity.lists.TimeUnitDto;
import com.bullhorn.entity.note.NoteDto;
import com.bullhorn.entity.note.NoteEntityDto;
import com.bullhorn.entity.privatelabel.PrivateLabelDto;
import com.bullhorn.entity.ratecard.RateCardDto;
import com.bullhorn.entity.report.ReportCategoryDto;
import com.bullhorn.entity.report.ReportCriteriaDto;
import com.bullhorn.entity.report.ReportDto;
import com.bullhorn.entity.report.ReportOutputDto;
import com.bullhorn.entity.survey.SurveyDto;
import com.bullhorn.entity.survey.SurveyQuestionDto;
import com.bullhorn.entity.survey.SurveyTemplateDto;
import com.bullhorn.entity.task.TaskDto;
import com.bullhorn.entity.tearsheet.TearsheetDto;
import com.bullhorn.entity.template.client.ClientCorporationTemplateAttributeDto;
import com.bullhorn.entity.template.client.ClientCorporationTemplateDto;
import com.bullhorn.entity.template.job.JobOrderTemplateAttributeDto;
import com.bullhorn.entity.template.job.JobOrderTemplateDto;
import com.bullhorn.entity.template.user.UserTemplateAttributeDto;
import com.bullhorn.entity.template.user.UserTemplateDto;
import com.bullhorn.entity.test.TestCategoryDto;
import com.bullhorn.entity.test.TestJobDto;
import com.bullhorn.entity.test.TestOwnerDto;
import com.bullhorn.entity.timecard.TimecardBatchDto;
import com.bullhorn.entity.timecard.TimecardDto;
import com.bullhorn.entity.timecard.TimecardExpenseDto;
import com.bullhorn.entity.timecard.TimecardPayClassDto;
import com.bullhorn.entity.timecard.TimecardTimeDto;
import com.bullhorn.entity.user.CorporateUserDto;
import com.bullhorn.entity.user.PersonDto;
import com.bullhorn.entity.user.UserTypeDto;
import com.bullhorn.entity.userwork.UserWorkDto;

public enum ApiEntityNameDtoMapping {
	APPOINTMENT(ApiEntityName.APPOINTMENT, AppointmentDto.class),
	APPOINTMENT_ATTENDEE(ApiEntityName.APPOINTMENT_ATTENDEE, AppointmentAttendeeDto.class),
	BUSINESS_SECTOR(ApiEntityName.BUSINESS_SECTOR, BusinessSectorDto.class),
	CANDIDATE(ApiEntityName.CANDIDATE, CandidateDto.class),
	CANDIDATE_ASSESSMENT(ApiEntityName.CANDIDATE_ASSESSMENT, CandidateAssessmentDto.class),
	CANDIDATE_ASSESSMENT_SYSTEM(ApiEntityName.CANDIDATE_ASSESSMENT_SYSTEM, CandidateAssessmentSystemDto.class),
	CANDIDATE_CERTIFICATION(ApiEntityName.CANDIDATE_CERTIFICATION, CandidateCertificationDto.class),
	CANDIDATE_EDUCATION(ApiEntityName.CANDIDATE_EDUCATION, CandidateEducationDto.class),
	CANDIDATE_REFERENCE(ApiEntityName.CANDIDATE_REFERENCE, CandidateReferenceDto.class),
	CANDIDATE_REFERENCE_QUESTION(ApiEntityName.CANDIDATE_REFERENCE_QUESTION, CandidateReferenceQuestionDto.class),
	CANDIDATE_REFERENCE_RESPONSE(ApiEntityName.CANDIDATE_REFERENCE_RESPONSE, CandidateReferenceResponseDto.class),
	CANDIDATE_SOURCE(ApiEntityName.CANDIDATE_SOURCE, CandidateSourceDto.class),
	CANDIDATE_WORK_HISTORY(ApiEntityName.CANDIDATE_WORK_HISTORY, CandidateWorkHistoryDto.class),
	CATEGORY(ApiEntityName.CATEGORY, CategoryDto.class),
	CERTIFICATION(ApiEntityName.CERTIFICATION, CertificationDto.class),
	CLIENT_CONTACT(ApiEntityName.CLIENT_CONTACT, ClientContactDto.class),
	CLIENT_CORPORATION(ApiEntityName.CLIENT_CORPORATION, ClientCorporationDto.class),
	CLIENT_CORPORATION_CERTIFICATION(ApiEntityName.CLIENT_CORPORATION_CERTIFICATION, ClientCorporationCertificationDto.class),
	CLIENT_CORPORATION_INVOICE_GROUP(ApiEntityName.CLIENT_CORPORATION_INVOICE_GROUP, ClientCorporationInvoiceGroupDto.class),
	CLIENT_CORPORATION_TEMPLATE(ApiEntityName.CLIENT_CORPORATION_TEMPLATE, ClientCorporationTemplateDto.class),
	CLIENT_CORPORATION_TEMPLATE_ATTRIBUTE(ApiEntityName.CLIENT_CORPORATION_TEMPLATE_ATTRIBUTE, ClientCorporationTemplateAttributeDto.class),
	CORPORATE_USER(ApiEntityName.CORPORATE_USER, CorporateUserDto.class),
	CORPORATION_DEPARTMENT(ApiEntityName.CORPORATION_DEPARTMENT, CorporationDepartmentDto.class),
	COST_CENTER(ApiEntityName.COST_CENTER, CostCenterDto.class),
	COUNTRY(ApiEntityName.COUNTRY, CountryDto.class),
	DISTRIBUTION_LIST(ApiEntityName.DISTRIBUTION_LIST, DistributionListDto.class),
	HOUSING_COMPLEX(ApiEntityName.HOUSING_COMPLEX, HousingComplexDto.class),
	HOUSING_COMPLEX_AMENITY(ApiEntityName.HOUSING_COMPLEX_AMENITY, HousingComplexAmenityDto.class),
	HOUSING_COMPLEX_FURNITURE_DELIVERY(ApiEntityName.HOUSING_COMPLEX_FURNITURE_DELIVERY, HousingComplexFurnitureDeliveryDto.class),
	HOUSING_COMPLEX_UNIT(ApiEntityName.HOUSING_COMPLEX_UNIT, HousingComplexUnitDto.class),
	HOUSING_COMPLEX_UTILITY_ACCOUNT(ApiEntityName.HOUSING_COMPLEX_UTILITY_ACCOUNT, HousingComplexUtilityAccountDto.class),
	INVOICE(ApiEntityName.INVOICE, InvoiceDto.class),
	INVOICE_GROUP(ApiEntityName.INVOICE_GROUP, InvoiceGroupDto.class),
	INVOICE_ITEM(ApiEntityName.INVOICE_ITEM, InvoiceItemDto.class),
	JOB_ORDER(ApiEntityName.JOB_ORDER, JobOrderDto.class),
	JOB_ORDER_TEMPLATE(ApiEntityName.JOB_ORDER_TEMPLATE, JobOrderTemplateDto.class),
	JOB_ORDER_TEMPLATE_ATTRIBUTE(ApiEntityName.JOB_ORDER_TEMPLATE_ATTRIBUTE, JobOrderTemplateAttributeDto.class),
	JOB_SUBMISSION(ApiEntityName.JOB_SUBMISSION, JobSubmissionDto.class),
	NOTE(ApiEntityName.NOTE, NoteDto.class),
	NOTE_ENTITY(ApiEntityName.NOTE_ENTITY, NoteEntityDto.class),
	PERSON(ApiEntityName.PERSON, PersonDto.class),
	PLACEMENT(ApiEntityName.PLACEMENT, PlacementDto.class),
	PLACEMENT_CHANGE_REQUEST(ApiEntityName.PLACEMENT_CHANGE_REQUEST, PlacementChangeRequestDto.class),
	PLACEMENT_COMMISSION(ApiEntityName.PLACEMENT_COMMISSION, PlacementCommissionDto.class),
	PRIVATE_LABEL(ApiEntityName.PRIVATE_LABEL, PrivateLabelDto.class),
	RATE_CARD(ApiEntityName.RATE_CARD, RateCardDto.class),
	RECURRING_APPOINTMENT_DELETE(ApiEntityName.RECURRING_APPOINTMENT_DELETE, RecurringAppointmentDeleteDto.class),
	REPORT(ApiEntityName.REPORT, ReportDto.class),
	REPORT_CATEGORY(ApiEntityName.REPORT_CATEGORY, ReportCategoryDto.class),
	REPORT_CRITERIA(ApiEntityName.REPORT_CRITERIA, ReportCriteriaDto.class),
	REPORT_OUTPUT(ApiEntityName.REPORT_OUTPUT, ReportOutputDto.class),
	SENDOUT(ApiEntityName.SENDOUT, SendoutDto.class),
	SKILL(ApiEntityName.SKILL, SkillDto.class),
	SPECIALTY(ApiEntityName.SPECIALTY, SpecialtyDto.class),
	STATE(ApiEntityName.STATE, StateDto.class),
	SURVEY(ApiEntityName.SURVEY, SurveyDto.class),
	SURVEY_QUESTION(ApiEntityName.SURVEY_QUESTION, SurveyQuestionDto.class),
	SURVEY_TEMPLATE(ApiEntityName.SURVEY_TEMPLATE, SurveyTemplateDto.class),
	TASK(ApiEntityName.TASK, TaskDto.class),
	TEARSHEET(ApiEntityName.TEARSHEET, TearsheetDto.class),
	TEST_CATEGORY(ApiEntityName.TEST_CATEGORY, TestCategoryDto.class),
	TEST_JOB(ApiEntityName.TEST_JOB, TestJobDto.class),
	TEST_OWNER(ApiEntityName.TEST_OWNER, TestOwnerDto.class),
	TIME_UNIT(ApiEntityName.TIME_UNIT, TimeUnitDto.class),
	TIMECARD(ApiEntityName.TIMECARD, TimecardDto.class),
	TIMECARD_BATCH(ApiEntityName.TIMECARD_BATCH, TimecardBatchDto.class),
	TIMECARD_EXPENSE(ApiEntityName.TIMECARD_EXPENSE, TimecardExpenseDto.class),
	TIMECARD_PAY_CLASS(ApiEntityName.TIMECARD_PAY_CLASS, TimecardPayClassDto.class),
	TIMECARD_TIME(ApiEntityName.TIMECARD_TIME, TimecardTimeDto.class),
	USER_TEMPLATE(ApiEntityName.USER_TEMPLATE, UserTemplateDto.class),
	USER_TEMPLATE_ATTRIBUTE(ApiEntityName.USER_TEMPLATE_ATTRIBUTE, UserTemplateAttributeDto.class),
	USER_TYPE(ApiEntityName.USER_TYPE, UserTypeDto.class),
	USER_WORK(ApiEntityName.USER_WORK, UserWorkDto.class),
	WORKERS_COMPENSATION(ApiEntityName.WORKERS_COMPENSATION, WorkersCompensationDto.class),
	WORKERS_COMPENSATION_RATE(ApiEntityName.WORKERS_COMPENSATION_RATE, WorkersCompensationRateDto.class)
	;
	
	private final ApiEntityName entityName;
	private final String displayName;
	private final Class<? extends AbstractDto> entityClass;
	
	private ApiEntityNameDtoMapping(ApiEntityName entityName, Class<? extends AbstractDto> entityClass) {
		this.entityName = entityName;
		this.displayName = StringUtils.join(entityName.value().split("(?=\\p{Upper})"), " ");
		this.entityClass = entityClass;
	}

	public ApiEntityName getEntityName() {
		return entityName;
	}
	
	public String getDisplayName() {
		return displayName;
	}

	public Class<? extends AbstractDto> getEntityClass() {
		return entityClass;
	}
	
	public static ApiEntityNameDtoMapping fromApiEntityName(ApiEntityName entityName) {
		for(ApiEntityNameDtoMapping mapping : ApiEntityNameDtoMapping.values()) {
			if(mapping.getEntityName().equals(entityName)) {
				return mapping;
			}
		}
		
		throw new IllegalArgumentException("Not a valid ApiEntityName: "+entityName);
	}
	
	public static ApiEntityNameDtoMapping fromDisplayName(String displayName) {
		for(ApiEntityNameDtoMapping mapping : ApiEntityNameDtoMapping.values()) {
			if(mapping.getDisplayName().equals(displayName)) {
				return mapping;
			}
		}
		
		throw new IllegalArgumentException("Not a valid displayName: "+displayName);
	}
	
	public static ApiEntityNameDtoMapping fromEntityClass(Class<? extends AbstractDto> entityClass) {
		for(ApiEntityNameDtoMapping mapping : ApiEntityNameDtoMapping.values()) {
			if(mapping.getEntityClass().equals(entityClass)) {
				return mapping;
			}
		}
		
		throw new IllegalArgumentException("Not a valid entityClass: "+entityClass);
	}

}
