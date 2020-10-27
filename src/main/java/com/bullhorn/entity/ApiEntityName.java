
package com.bullhorn.entity;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for apiEntityName.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="apiEntityName">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Appointment"/>
 *     &lt;enumeration value="AppointmentAttendee"/>
 *     &lt;enumeration value="BusinessSector"/>
 *     &lt;enumeration value="Candidate"/>
 *     &lt;enumeration value="CandidateAssessment"/>
 *     &lt;enumeration value="CandidateAssessmentSystem"/>
 *     &lt;enumeration value="CandidateCertification"/>
 *     &lt;enumeration value="CandidateEducation"/>
 *     &lt;enumeration value="CandidateReference"/>
 *     &lt;enumeration value="CandidateReferenceQuestion"/>
 *     &lt;enumeration value="CandidateReferenceResponse"/>
 *     &lt;enumeration value="CandidateSource"/>
 *     &lt;enumeration value="CandidateWorkHistory"/>
 *     &lt;enumeration value="Category"/>
 *     &lt;enumeration value="Certification"/>
 *     &lt;enumeration value="ClientContact"/>
 *     &lt;enumeration value="ClientCorporation"/>
 *     &lt;enumeration value="ClientCorporationCertification"/>
 *     &lt;enumeration value="ClientCorporationInvoiceGroup"/>
 *     &lt;enumeration value="ClientCorporationTemplate"/>
 *     &lt;enumeration value="ClientCorporationTemplateAttribute"/>
 *     &lt;enumeration value="CorporateUser"/>
 *     &lt;enumeration value="CorporationDepartment"/>
 *     &lt;enumeration value="CostCenter"/>
 *     &lt;enumeration value="Country"/>
 *     &lt;enumeration value="DistributionList"/>
 *     &lt;enumeration value="HousingComplex"/>
 *     &lt;enumeration value="HousingComplexAmenity"/>
 *     &lt;enumeration value="HousingComplexFurnitureDelivery"/>
 *     &lt;enumeration value="HousingComplexUnit"/>
 *     &lt;enumeration value="HousingComplexUtilityAccount"/>
 *     &lt;enumeration value="Invoice"/>
 *     &lt;enumeration value="InvoiceGroup"/>
 *     &lt;enumeration value="InvoiceItem"/>
 *     &lt;enumeration value="JobOrder"/>
 *     &lt;enumeration value="JobOrderTemplate"/>
 *     &lt;enumeration value="JobOrderTemplateAttribute"/>
 *     &lt;enumeration value="JobSubmission"/>
 *     &lt;enumeration value="Note"/>
 *     &lt;enumeration value="NoteEntity"/>
 *     &lt;enumeration value="Person"/>
 *     &lt;enumeration value="Placement"/>
 *     &lt;enumeration value="PlacementChangeRequest"/>
 *     &lt;enumeration value="PlacementCommission"/>
 *     &lt;enumeration value="PrivateLabel"/>
 *     &lt;enumeration value="RateCard"/>
 *     &lt;enumeration value="RecurringAppointmentDelete"/>
 *     &lt;enumeration value="Report"/>
 *     &lt;enumeration value="ReportCategory"/>
 *     &lt;enumeration value="ReportCriteria"/>
 *     &lt;enumeration value="ReportOutput"/>
 *     &lt;enumeration value="Sendout"/>
 *     &lt;enumeration value="Skill"/>
 *     &lt;enumeration value="Specialty"/>
 *     &lt;enumeration value="State"/>
 *     &lt;enumeration value="Survey"/>
 *     &lt;enumeration value="SurveyQuestion"/>
 *     &lt;enumeration value="SurveyTemplate"/>
 *     &lt;enumeration value="Task"/>
 *     &lt;enumeration value="Tearsheet"/>
 *     &lt;enumeration value="TestCategory"/>
 *     &lt;enumeration value="TestJob"/>
 *     &lt;enumeration value="TestOwner"/>
 *     &lt;enumeration value="TimeUnit"/>
 *     &lt;enumeration value="Timecard"/>
 *     &lt;enumeration value="TimecardBatch"/>
 *     &lt;enumeration value="TimecardExpense"/>
 *     &lt;enumeration value="TimecardPayClass"/>
 *     &lt;enumeration value="TimecardTime"/>
 *     &lt;enumeration value="UserTemplate"/>
 *     &lt;enumeration value="UserTemplateAttribute"/>
 *     &lt;enumeration value="UserType"/>
 *     &lt;enumeration value="UserWork"/>
 *     &lt;enumeration value="WorkersCompensation"/>
 *     &lt;enumeration value="WorkersCompensationRate"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 */
@XmlType(name = "apiEntityName")
@XmlEnum
public enum ApiEntityName {

    @XmlEnumValue("Appointment")
    APPOINTMENT("Appointment"),
    @XmlEnumValue("AppointmentAttendee")
    APPOINTMENT_ATTENDEE("AppointmentAttendee"),
    @XmlEnumValue("BusinessSector")
    BUSINESS_SECTOR("BusinessSector"),
    @XmlEnumValue("Candidate")
    CANDIDATE("Candidate"),
    @XmlEnumValue("CandidateAssessment")
    CANDIDATE_ASSESSMENT("CandidateAssessment"),
    @XmlEnumValue("CandidateAssessmentSystem")
    CANDIDATE_ASSESSMENT_SYSTEM("CandidateAssessmentSystem"),
    @XmlEnumValue("CandidateCertification")
    CANDIDATE_CERTIFICATION("CandidateCertification"),
    @XmlEnumValue("CandidateCertificationRequirement")
    CANDIDATE_CERTIFICATION_REQUIREMENT("CandidateCertificationRequirement"),
    @XmlEnumValue("CandidateEducation")
    CANDIDATE_EDUCATION("CandidateEducation"),
    @XmlEnumValue("CandidateReference")
    CANDIDATE_REFERENCE("CandidateReference"),
    @XmlEnumValue("CandidateReferenceQuestion")
    CANDIDATE_REFERENCE_QUESTION("CandidateReferenceQuestion"),
    @XmlEnumValue("CandidateReferenceResponse")
    CANDIDATE_REFERENCE_RESPONSE("CandidateReferenceResponse"),
    @XmlEnumValue("CandidateSource")
    CANDIDATE_SOURCE("CandidateSource"),
    @XmlEnumValue("CandidateWorkHistory")
    CANDIDATE_WORK_HISTORY("CandidateWorkHistory"),
    @XmlEnumValue("Category")
    CATEGORY("Category"),
    @XmlEnumValue("Certification")
    CERTIFICATION("Certification"),
    @XmlEnumValue("ClientContact")
    CLIENT_CONTACT("ClientContact"),
    @XmlEnumValue("ClientCorporation")
    CLIENT_CORPORATION("ClientCorporation"),
    @XmlEnumValue("ClientCorporationCertification")
    CLIENT_CORPORATION_CERTIFICATION("ClientCorporationCertification"),
    @XmlEnumValue("ClientCorporationInvoiceGroup")
    CLIENT_CORPORATION_INVOICE_GROUP("ClientCorporationInvoiceGroup"),
    @XmlEnumValue("ClientCorporationTemplate")
    CLIENT_CORPORATION_TEMPLATE("ClientCorporationTemplate"),
    @XmlEnumValue("ClientCorporationTemplateAttribute")
    CLIENT_CORPORATION_TEMPLATE_ATTRIBUTE("ClientCorporationTemplateAttribute"),
    @XmlEnumValue("CorporateUser")
    CORPORATE_USER("CorporateUser"),
    @XmlEnumValue("CorporationDepartment")
    CORPORATION_DEPARTMENT("CorporationDepartment"),
    @XmlEnumValue("CostCenter")
    COST_CENTER("CostCenter"),
    @XmlEnumValue("Country")
    COUNTRY("Country"),
    @XmlEnumValue("DistributionList")
    DISTRIBUTION_LIST("DistributionList"),
    @XmlEnumValue("HousingComplex")
    HOUSING_COMPLEX("HousingComplex"),
    @XmlEnumValue("HousingComplexAmenity")
    HOUSING_COMPLEX_AMENITY("HousingComplexAmenity"),
    @XmlEnumValue("HousingComplexFurnitureDelivery")
    HOUSING_COMPLEX_FURNITURE_DELIVERY("HousingComplexFurnitureDelivery"),
    @XmlEnumValue("HousingComplexUnit")
    HOUSING_COMPLEX_UNIT("HousingComplexUnit"),
    @XmlEnumValue("HousingComplexUtilityAccount")
    HOUSING_COMPLEX_UTILITY_ACCOUNT("HousingComplexUtilityAccount"),
    @XmlEnumValue("Invoice")
    INVOICE("Invoice"),
    @XmlEnumValue("InvoiceGroup")
    INVOICE_GROUP("InvoiceGroup"),
    @XmlEnumValue("InvoiceItem")
    INVOICE_ITEM("InvoiceItem"),
    @XmlEnumValue("JobOrder")
    JOB_ORDER("JobOrder"),
    @XmlEnumValue("JobOrderTemplate")
    JOB_ORDER_TEMPLATE("JobOrderTemplate"),
    @XmlEnumValue("JobOrderTemplateAttribute")
    JOB_ORDER_TEMPLATE_ATTRIBUTE("JobOrderTemplateAttribute"),
    @XmlEnumValue("JobSubmission")
    JOB_SUBMISSION("JobSubmission"),
    @XmlEnumValue("JobSubmissionCertificationRequirement")
    JOB_SUBMISSION_CERTIFICATION_REQUIREMENT("JobSubmissionCertificationRequirement"),
    @XmlEnumValue("Note")
    NOTE("Note"),
    @XmlEnumValue("NoteEntity")
    NOTE_ENTITY("NoteEntity"),
    @XmlEnumValue("Person")
    PERSON("Person"),
    @XmlEnumValue("Placement")
    PLACEMENT("Placement"),
    @XmlEnumValue("PlacementCertification")
    PLACEMENT_CERTIFICATION("PlacementCertification"),
    @XmlEnumValue("PlacementChangeRequest")
    PLACEMENT_CHANGE_REQUEST("PlacementChangeRequest"),
    @XmlEnumValue("PlacementCommission")
    PLACEMENT_COMMISSION("PlacementCommission"),
    @XmlEnumValue("PrivateLabel")
    PRIVATE_LABEL("PrivateLabel"),
    @XmlEnumValue("RateCard")
    RATE_CARD("RateCard"),
    @XmlEnumValue("RecurringAppointmentDelete")
    RECURRING_APPOINTMENT_DELETE("RecurringAppointmentDelete"),
    @XmlEnumValue("Report")
    REPORT("Report"),
    @XmlEnumValue("ReportCategory")
    REPORT_CATEGORY("ReportCategory"),
    @XmlEnumValue("ReportCriteria")
    REPORT_CRITERIA("ReportCriteria"),
    @XmlEnumValue("ReportOutput")
    REPORT_OUTPUT("ReportOutput"),
    @XmlEnumValue("Sendout")
    SENDOUT("Sendout"),
    @XmlEnumValue("Skill")
    SKILL("Skill"),
    @XmlEnumValue("Specialty")
    SPECIALTY("Specialty"),
    @XmlEnumValue("State")
    STATE("State"),
    @XmlEnumValue("Survey")
    SURVEY("Survey"),
    @XmlEnumValue("SurveyQuestion")
    SURVEY_QUESTION("SurveyQuestion"),
    @XmlEnumValue("SurveyTemplate")
    SURVEY_TEMPLATE("SurveyTemplate"),
    @XmlEnumValue("Task")
    TASK("Task"),
    @XmlEnumValue("Tearsheet")
    TEARSHEET("Tearsheet"),
    @XmlEnumValue("TestCategory")
    TEST_CATEGORY("TestCategory"),
    @XmlEnumValue("TestJob")
    TEST_JOB("TestJob"),
    @XmlEnumValue("TestOwner")
    TEST_OWNER("TestOwner"),
    @XmlEnumValue("TimeUnit")
    TIME_UNIT("TimeUnit"),
    @XmlEnumValue("Timecard")
    TIMECARD("Timecard"),
    @XmlEnumValue("TimecardBatch")
    TIMECARD_BATCH("TimecardBatch"),
    @XmlEnumValue("TimecardExpense")
    TIMECARD_EXPENSE("TimecardExpense"),
    @XmlEnumValue("TimecardPayClass")
    TIMECARD_PAY_CLASS("TimecardPayClass"),
    @XmlEnumValue("TimecardTime")
    TIMECARD_TIME("TimecardTime"),
    @XmlEnumValue("UserTemplate")
    USER_TEMPLATE("UserTemplate"),
    @XmlEnumValue("UserTemplateAttribute")
    USER_TEMPLATE_ATTRIBUTE("UserTemplateAttribute"),
    @XmlEnumValue("UserType")
    USER_TYPE("UserType"),
    @XmlEnumValue("UserWork")
    USER_WORK("UserWork"),
    @XmlEnumValue("WorkersCompensation")
    WORKERS_COMPENSATION("WorkersCompensation"),
    @XmlEnumValue("WorkersCompensationRate")
    WORKERS_COMPENSATION_RATE("WorkersCompensationRate");
    private final String value;

    ApiEntityName(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ApiEntityName fromValue(String v) {
        for (ApiEntityName c : ApiEntityName.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
