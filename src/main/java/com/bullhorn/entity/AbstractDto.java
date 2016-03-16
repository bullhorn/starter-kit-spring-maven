
package com.bullhorn.entity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.bullhorn.entity.appointment.AppointmentAttendeeDtoBase;
import com.bullhorn.entity.appointment.AppointmentDtoBase;
import com.bullhorn.entity.appointment.RecurringAppointmentDeleteDtoBase;
import com.bullhorn.entity.candidate.CandidateAssessmentDtoBase;
import com.bullhorn.entity.candidate.CandidateAssessmentSystemDtoBase;
import com.bullhorn.entity.candidate.CandidateCertificationDtoBase;
import com.bullhorn.entity.candidate.CandidateEducationDtoBase;
import com.bullhorn.entity.candidate.CandidateReferenceDtoBase;
import com.bullhorn.entity.candidate.CandidateReferenceQuestionDtoBase;
import com.bullhorn.entity.candidate.CandidateReferenceResponseDtoBase;
import com.bullhorn.entity.candidate.CandidateSourceDtoBase;
import com.bullhorn.entity.candidate.CandidateWorkHistoryDtoBase;
import com.bullhorn.entity.candidate.SendoutDtoBase;
import com.bullhorn.entity.cert.CertificationDtoBase;
import com.bullhorn.entity.client.ClientCorporationCertificationDtoBase;
import com.bullhorn.entity.client.ClientCorporationDtoBase;
import com.bullhorn.entity.client.ClientCorporationInvoiceGroupDtoBase;
import com.bullhorn.entity.corp.CorporationDepartmentDtoBase;
import com.bullhorn.entity.corp.CostCenterDtoBase;
import com.bullhorn.entity.distlist.DistributionListDtoBase;
import com.bullhorn.entity.housing.HousingComplexAmenityDtoBase;
import com.bullhorn.entity.housing.HousingComplexDtoBase;
import com.bullhorn.entity.housing.HousingComplexFurnitureDeliveryDtoBase;
import com.bullhorn.entity.housing.HousingComplexUnitDtoBase;
import com.bullhorn.entity.housing.HousingComplexUtilityAccountDtoBase;
import com.bullhorn.entity.invoice.InvoiceDtoBase;
import com.bullhorn.entity.invoice.InvoiceGroupDtoBase;
import com.bullhorn.entity.invoice.InvoiceItemDtoBase;
import com.bullhorn.entity.job.JobOrderDtoBase;
import com.bullhorn.entity.job.JobSubmissionDtoBase;
import com.bullhorn.entity.job.PlacementChangeRequestDtoBase;
import com.bullhorn.entity.job.PlacementCommissionDtoBase;
import com.bullhorn.entity.job.PlacementDtoBase;
import com.bullhorn.entity.job.WorkersCompensationDtoBase;
import com.bullhorn.entity.job.WorkersCompensationRateDtoBase;
import com.bullhorn.entity.lists.BusinessSectorDtoBase;
import com.bullhorn.entity.lists.CategoryDtoBase;
import com.bullhorn.entity.lists.CountryDtoBase;
import com.bullhorn.entity.lists.SkillDtoBase;
import com.bullhorn.entity.lists.SpecialtyDtoBase;
import com.bullhorn.entity.lists.StateDtoBase;
import com.bullhorn.entity.lists.TimeUnitDtoBase;
import com.bullhorn.entity.note.NoteDtoBase;
import com.bullhorn.entity.note.NoteEntityDtoBase;
import com.bullhorn.entity.privatelabel.PrivateLabelDtoBase;
import com.bullhorn.entity.ratecard.RateCardDtoBase;
import com.bullhorn.entity.report.ReportCategoryDtoBase;
import com.bullhorn.entity.report.ReportCriteriaDtoBase;
import com.bullhorn.entity.report.ReportDtoBase;
import com.bullhorn.entity.report.ReportOutputDtoBase;
import com.bullhorn.entity.survey.SurveyDtoBase;
import com.bullhorn.entity.survey.SurveyQuestionDtoBase;
import com.bullhorn.entity.survey.SurveyTemplateDtoBase;
import com.bullhorn.entity.task.TaskDtoBase;
import com.bullhorn.entity.tearsheet.TearsheetDtoBase;
import com.bullhorn.entity.template.EntityTemplateAttributeDto;
import com.bullhorn.entity.template.EntityTemplateDto;
import com.bullhorn.entity.test.TestCategoryDtoBase;
import com.bullhorn.entity.test.TestJobDtoBase;
import com.bullhorn.entity.test.TestOwnerDtoBase;
import com.bullhorn.entity.timecard.TimecardBatchDtoBase;
import com.bullhorn.entity.timecard.TimecardDtoBase;
import com.bullhorn.entity.timecard.TimecardExpenseDtoBase;
import com.bullhorn.entity.timecard.TimecardPayClassDtoBase;
import com.bullhorn.entity.timecard.TimecardTimeDtoBase;
import com.bullhorn.entity.user.PersonDtoBase;
import com.bullhorn.entity.user.UserTypeDtoBase;
import com.bullhorn.entity.userwork.UserWorkDtoBase;


/**
 * <p>Java class for abstractDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="abstractDto">
 *   &lt;complexContent>
 *     &lt;extension base="{http://entity.bullhorn.com/}abstractDtoBase">
 *       &lt;sequence>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "abstractDto")
@XmlSeeAlso({
    TaskDtoBase.class,
    RateCardDtoBase.class,
    ReportOutputDtoBase.class,
    ReportDtoBase.class,
    ReportCriteriaDtoBase.class,
    ReportCategoryDtoBase.class,
    UserTypeDtoBase.class,
    EntityTemplateAttributeDto.class,
    EntityTemplateDto.class,
    SurveyTemplateDtoBase.class,
    SurveyDtoBase.class,
    SurveyQuestionDtoBase.class,
    PrivateLabelDtoBase.class,
    InvoiceDtoBase.class,
    InvoiceItemDtoBase.class,
    InvoiceGroupDtoBase.class,
    HousingComplexDtoBase.class,
    HousingComplexUnitDtoBase.class,
    HousingComplexAmenityDtoBase.class,
    HousingComplexFurnitureDeliveryDtoBase.class,
    HousingComplexUtilityAccountDtoBase.class,
    JobOrderDtoBase.class,
    PlacementCommissionDtoBase.class,
    PlacementDtoBase.class,
    PlacementChangeRequestDtoBase.class,
    WorkersCompensationDtoBase.class,
    WorkersCompensationRateDtoBase.class,
    JobSubmissionDtoBase.class,
    SkillDtoBase.class,
    CategoryDtoBase.class,
    TimeUnitDtoBase.class,
    StateDtoBase.class,
    BusinessSectorDtoBase.class,
    CountryDtoBase.class,
    SpecialtyDtoBase.class,
    NoteEntityDtoBase.class,
    NoteDtoBase.class,
    CandidateAssessmentDtoBase.class,
    CandidateWorkHistoryDtoBase.class,
    CandidateCertificationDtoBase.class,
    CandidateReferenceResponseDtoBase.class,
    CandidateReferenceQuestionDtoBase.class,
    CandidateAssessmentSystemDtoBase.class,
    CandidateSourceDtoBase.class,
    CandidateEducationDtoBase.class,
    SendoutDtoBase.class,
    CandidateReferenceDtoBase.class,
    RecurringAppointmentDeleteDtoBase.class,
    AppointmentAttendeeDtoBase.class,
    AppointmentDtoBase.class,
    CostCenterDtoBase.class,
    CorporationDepartmentDtoBase.class,
    ClientCorporationDtoBase.class,
    ClientCorporationInvoiceGroupDtoBase.class,
    ClientCorporationCertificationDtoBase.class,
    PersonDtoBase.class,
    CertificationDtoBase.class,
    TearsheetDtoBase.class,
    TestCategoryDtoBase.class,
    TestJobDtoBase.class,
    TestOwnerDtoBase.class,
    DistributionListDtoBase.class,
    TimecardDtoBase.class,
    TimecardTimeDtoBase.class,
    TimecardPayClassDtoBase.class,
    TimecardExpenseDtoBase.class,
    TimecardBatchDtoBase.class,
    UserWorkDtoBase.class
})
public abstract class AbstractDto
    extends AbstractDtoBase
{


}
