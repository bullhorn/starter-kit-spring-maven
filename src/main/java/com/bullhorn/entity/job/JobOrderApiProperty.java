
package com.bullhorn.entity.job;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for jobOrderApiProperty.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="jobOrderApiProperty">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="jobOrderID"/>
 *     &lt;enumeration value="address"/>
 *     &lt;enumeration value="benefits"/>
 *     &lt;enumeration value="billRateCategoryID"/>
 *     &lt;enumeration value="bonusPackage"/>
 *     &lt;enumeration value="branchCode"/>
 *     &lt;enumeration value="certificationList"/>
 *     &lt;enumeration value="clientBillRate"/>
 *     &lt;enumeration value="clientContactID"/>
 *     &lt;enumeration value="clientCorporationID"/>
 *     &lt;enumeration value="correlatedCustomDate1"/>
 *     &lt;enumeration value="correlatedCustomDate2"/>
 *     &lt;enumeration value="correlatedCustomDate3"/>
 *     &lt;enumeration value="correlatedCustomFloat1"/>
 *     &lt;enumeration value="correlatedCustomFloat2"/>
 *     &lt;enumeration value="correlatedCustomFloat3"/>
 *     &lt;enumeration value="correlatedCustomInt1"/>
 *     &lt;enumeration value="correlatedCustomInt2"/>
 *     &lt;enumeration value="correlatedCustomInt3"/>
 *     &lt;enumeration value="correlatedCustomText1"/>
 *     &lt;enumeration value="correlatedCustomText10"/>
 *     &lt;enumeration value="correlatedCustomText2"/>
 *     &lt;enumeration value="correlatedCustomText3"/>
 *     &lt;enumeration value="correlatedCustomText4"/>
 *     &lt;enumeration value="correlatedCustomText5"/>
 *     &lt;enumeration value="correlatedCustomText6"/>
 *     &lt;enumeration value="correlatedCustomText7"/>
 *     &lt;enumeration value="correlatedCustomText8"/>
 *     &lt;enumeration value="correlatedCustomText9"/>
 *     &lt;enumeration value="correlatedCustomTextBlock1"/>
 *     &lt;enumeration value="correlatedCustomTextBlock2"/>
 *     &lt;enumeration value="correlatedCustomTextBlock3"/>
 *     &lt;enumeration value="costCenter"/>
 *     &lt;enumeration value="customDate1"/>
 *     &lt;enumeration value="customDate2"/>
 *     &lt;enumeration value="customDate3"/>
 *     &lt;enumeration value="customFloat1"/>
 *     &lt;enumeration value="customFloat2"/>
 *     &lt;enumeration value="customFloat3"/>
 *     &lt;enumeration value="customInt1"/>
 *     &lt;enumeration value="customInt2"/>
 *     &lt;enumeration value="customInt3"/>
 *     &lt;enumeration value="customText1"/>
 *     &lt;enumeration value="customText10"/>
 *     &lt;enumeration value="customText11"/>
 *     &lt;enumeration value="customText12"/>
 *     &lt;enumeration value="customText13"/>
 *     &lt;enumeration value="customText14"/>
 *     &lt;enumeration value="customText15"/>
 *     &lt;enumeration value="customText16"/>
 *     &lt;enumeration value="customText17"/>
 *     &lt;enumeration value="customText18"/>
 *     &lt;enumeration value="customText19"/>
 *     &lt;enumeration value="customText2"/>
 *     &lt;enumeration value="customText20"/>
 *     &lt;enumeration value="customText3"/>
 *     &lt;enumeration value="customText4"/>
 *     &lt;enumeration value="customText5"/>
 *     &lt;enumeration value="customText6"/>
 *     &lt;enumeration value="customText7"/>
 *     &lt;enumeration value="customText8"/>
 *     &lt;enumeration value="customText9"/>
 *     &lt;enumeration value="customTextBlock1"/>
 *     &lt;enumeration value="customTextBlock2"/>
 *     &lt;enumeration value="customTextBlock3"/>
 *     &lt;enumeration value="customTextBlock4"/>
 *     &lt;enumeration value="customTextBlock5"/>
 *     &lt;enumeration value="dateAdded"/>
 *     &lt;enumeration value="dateClosed"/>
 *     &lt;enumeration value="dateEnd"/>
 *     &lt;enumeration value="dateLastExported"/>
 *     &lt;enumeration value="degreeList"/>
 *     &lt;enumeration value="description"/>
 *     &lt;enumeration value="durationWeeks"/>
 *     &lt;enumeration value="educationDegree"/>
 *     &lt;enumeration value="employmentType"/>
 *     &lt;enumeration value="externalCategoryID"/>
 *     &lt;enumeration value="externalID"/>
 *     &lt;enumeration value="feeArrangement"/>
 *     &lt;enumeration value="hoursOfOperation"/>
 *     &lt;enumeration value="hoursPerWeek"/>
 *     &lt;enumeration value="isClientEditable"/>
 *     &lt;enumeration value="isDeleted"/>
 *     &lt;enumeration value="isInterviewRequired"/>
 *     &lt;enumeration value="isJobcastPublished"/>
 *     &lt;enumeration value="isOpen"/>
 *     &lt;enumeration value="isPublic"/>
 *     &lt;enumeration value="jobBoardList"/>
 *     &lt;enumeration value="numOpenings"/>
 *     &lt;enumeration value="onSite"/>
 *     &lt;enumeration value="optionsPackage"/>
 *     &lt;enumeration value="ownerID"/>
 *     &lt;enumeration value="payRate"/>
 *     &lt;enumeration value="publicDescription"/>
 *     &lt;enumeration value="publishedZip"/>
 *     &lt;enumeration value="reasonClosed"/>
 *     &lt;enumeration value="reportTo"/>
 *     &lt;enumeration value="reportToClientContactID"/>
 *     &lt;enumeration value="responseUserID"/>
 *     &lt;enumeration value="salary"/>
 *     &lt;enumeration value="salaryUnit"/>
 *     &lt;enumeration value="shiftID"/>
 *     &lt;enumeration value="skillList"/>
 *     &lt;enumeration value="source"/>
 *     &lt;enumeration value="startDate"/>
 *     &lt;enumeration value="status"/>
 *     &lt;enumeration value="taxRate"/>
 *     &lt;enumeration value="taxStatus"/>
 *     &lt;enumeration value="title"/>
 *     &lt;enumeration value="travelRequirements"/>
 *     &lt;enumeration value="type"/>
 *     &lt;enumeration value="willRelocate"/>
 *     &lt;enumeration value="willSponsor"/>
 *     &lt;enumeration value="workersCompRateID"/>
 *     &lt;enumeration value="yearsRequired"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "jobOrderApiProperty")
@XmlEnum
public enum JobOrderApiProperty {

    @XmlEnumValue("jobOrderID")
    JOB_ORDER_ID("jobOrderID"),
    @XmlEnumValue("address")
    ADDRESS("address"),
    @XmlEnumValue("benefits")
    BENEFITS("benefits"),
    @XmlEnumValue("billRateCategoryID")
    BILL_RATE_CATEGORY_ID("billRateCategoryID"),
    @XmlEnumValue("bonusPackage")
    BONUS_PACKAGE("bonusPackage"),
    @XmlEnumValue("branchCode")
    BRANCH_CODE("branchCode"),
    @XmlEnumValue("certificationList")
    CERTIFICATION_LIST("certificationList"),
    @XmlEnumValue("clientBillRate")
    CLIENT_BILL_RATE("clientBillRate"),
    @XmlEnumValue("clientContactID")
    CLIENT_CONTACT_ID("clientContactID"),
    @XmlEnumValue("clientCorporationID")
    CLIENT_CORPORATION_ID("clientCorporationID"),
    @XmlEnumValue("correlatedCustomDate1")
    CORRELATED_CUSTOM_DATE_1("correlatedCustomDate1"),
    @XmlEnumValue("correlatedCustomDate2")
    CORRELATED_CUSTOM_DATE_2("correlatedCustomDate2"),
    @XmlEnumValue("correlatedCustomDate3")
    CORRELATED_CUSTOM_DATE_3("correlatedCustomDate3"),
    @XmlEnumValue("correlatedCustomFloat1")
    CORRELATED_CUSTOM_FLOAT_1("correlatedCustomFloat1"),
    @XmlEnumValue("correlatedCustomFloat2")
    CORRELATED_CUSTOM_FLOAT_2("correlatedCustomFloat2"),
    @XmlEnumValue("correlatedCustomFloat3")
    CORRELATED_CUSTOM_FLOAT_3("correlatedCustomFloat3"),
    @XmlEnumValue("correlatedCustomInt1")
    CORRELATED_CUSTOM_INT_1("correlatedCustomInt1"),
    @XmlEnumValue("correlatedCustomInt2")
    CORRELATED_CUSTOM_INT_2("correlatedCustomInt2"),
    @XmlEnumValue("correlatedCustomInt3")
    CORRELATED_CUSTOM_INT_3("correlatedCustomInt3"),
    @XmlEnumValue("correlatedCustomText1")
    CORRELATED_CUSTOM_TEXT_1("correlatedCustomText1"),
    @XmlEnumValue("correlatedCustomText10")
    CORRELATED_CUSTOM_TEXT_10("correlatedCustomText10"),
    @XmlEnumValue("correlatedCustomText2")
    CORRELATED_CUSTOM_TEXT_2("correlatedCustomText2"),
    @XmlEnumValue("correlatedCustomText3")
    CORRELATED_CUSTOM_TEXT_3("correlatedCustomText3"),
    @XmlEnumValue("correlatedCustomText4")
    CORRELATED_CUSTOM_TEXT_4("correlatedCustomText4"),
    @XmlEnumValue("correlatedCustomText5")
    CORRELATED_CUSTOM_TEXT_5("correlatedCustomText5"),
    @XmlEnumValue("correlatedCustomText6")
    CORRELATED_CUSTOM_TEXT_6("correlatedCustomText6"),
    @XmlEnumValue("correlatedCustomText7")
    CORRELATED_CUSTOM_TEXT_7("correlatedCustomText7"),
    @XmlEnumValue("correlatedCustomText8")
    CORRELATED_CUSTOM_TEXT_8("correlatedCustomText8"),
    @XmlEnumValue("correlatedCustomText9")
    CORRELATED_CUSTOM_TEXT_9("correlatedCustomText9"),
    @XmlEnumValue("correlatedCustomTextBlock1")
    CORRELATED_CUSTOM_TEXT_BLOCK_1("correlatedCustomTextBlock1"),
    @XmlEnumValue("correlatedCustomTextBlock2")
    CORRELATED_CUSTOM_TEXT_BLOCK_2("correlatedCustomTextBlock2"),
    @XmlEnumValue("correlatedCustomTextBlock3")
    CORRELATED_CUSTOM_TEXT_BLOCK_3("correlatedCustomTextBlock3"),
    @XmlEnumValue("costCenter")
    COST_CENTER("costCenter"),
    @XmlEnumValue("customDate1")
    CUSTOM_DATE_1("customDate1"),
    @XmlEnumValue("customDate2")
    CUSTOM_DATE_2("customDate2"),
    @XmlEnumValue("customDate3")
    CUSTOM_DATE_3("customDate3"),
    @XmlEnumValue("customFloat1")
    CUSTOM_FLOAT_1("customFloat1"),
    @XmlEnumValue("customFloat2")
    CUSTOM_FLOAT_2("customFloat2"),
    @XmlEnumValue("customFloat3")
    CUSTOM_FLOAT_3("customFloat3"),
    @XmlEnumValue("customInt1")
    CUSTOM_INT_1("customInt1"),
    @XmlEnumValue("customInt2")
    CUSTOM_INT_2("customInt2"),
    @XmlEnumValue("customInt3")
    CUSTOM_INT_3("customInt3"),
    @XmlEnumValue("customText1")
    CUSTOM_TEXT_1("customText1"),
    @XmlEnumValue("customText10")
    CUSTOM_TEXT_10("customText10"),
    @XmlEnumValue("customText11")
    CUSTOM_TEXT_11("customText11"),
    @XmlEnumValue("customText12")
    CUSTOM_TEXT_12("customText12"),
    @XmlEnumValue("customText13")
    CUSTOM_TEXT_13("customText13"),
    @XmlEnumValue("customText14")
    CUSTOM_TEXT_14("customText14"),
    @XmlEnumValue("customText15")
    CUSTOM_TEXT_15("customText15"),
    @XmlEnumValue("customText16")
    CUSTOM_TEXT_16("customText16"),
    @XmlEnumValue("customText17")
    CUSTOM_TEXT_17("customText17"),
    @XmlEnumValue("customText18")
    CUSTOM_TEXT_18("customText18"),
    @XmlEnumValue("customText19")
    CUSTOM_TEXT_19("customText19"),
    @XmlEnumValue("customText2")
    CUSTOM_TEXT_2("customText2"),
    @XmlEnumValue("customText20")
    CUSTOM_TEXT_20("customText20"),
    @XmlEnumValue("customText3")
    CUSTOM_TEXT_3("customText3"),
    @XmlEnumValue("customText4")
    CUSTOM_TEXT_4("customText4"),
    @XmlEnumValue("customText5")
    CUSTOM_TEXT_5("customText5"),
    @XmlEnumValue("customText6")
    CUSTOM_TEXT_6("customText6"),
    @XmlEnumValue("customText7")
    CUSTOM_TEXT_7("customText7"),
    @XmlEnumValue("customText8")
    CUSTOM_TEXT_8("customText8"),
    @XmlEnumValue("customText9")
    CUSTOM_TEXT_9("customText9"),
    @XmlEnumValue("customTextBlock1")
    CUSTOM_TEXT_BLOCK_1("customTextBlock1"),
    @XmlEnumValue("customTextBlock2")
    CUSTOM_TEXT_BLOCK_2("customTextBlock2"),
    @XmlEnumValue("customTextBlock3")
    CUSTOM_TEXT_BLOCK_3("customTextBlock3"),
    @XmlEnumValue("customTextBlock4")
    CUSTOM_TEXT_BLOCK_4("customTextBlock4"),
    @XmlEnumValue("customTextBlock5")
    CUSTOM_TEXT_BLOCK_5("customTextBlock5"),
    @XmlEnumValue("dateAdded")
    DATE_ADDED("dateAdded"),
    @XmlEnumValue("dateClosed")
    DATE_CLOSED("dateClosed"),
    @XmlEnumValue("dateEnd")
    DATE_END("dateEnd"),
    @XmlEnumValue("dateLastExported")
    DATE_LAST_EXPORTED("dateLastExported"),
    @XmlEnumValue("degreeList")
    DEGREE_LIST("degreeList"),
    @XmlEnumValue("description")
    DESCRIPTION("description"),
    @XmlEnumValue("durationWeeks")
    DURATION_WEEKS("durationWeeks"),
    @XmlEnumValue("educationDegree")
    EDUCATION_DEGREE("educationDegree"),
    @XmlEnumValue("employmentType")
    EMPLOYMENT_TYPE("employmentType"),
    @XmlEnumValue("externalCategoryID")
    EXTERNAL_CATEGORY_ID("externalCategoryID"),
    @XmlEnumValue("externalID")
    EXTERNAL_ID("externalID"),
    @XmlEnumValue("feeArrangement")
    FEE_ARRANGEMENT("feeArrangement"),
    @XmlEnumValue("hoursOfOperation")
    HOURS_OF_OPERATION("hoursOfOperation"),
    @XmlEnumValue("hoursPerWeek")
    HOURS_PER_WEEK("hoursPerWeek"),
    @XmlEnumValue("isClientEditable")
    IS_CLIENT_EDITABLE("isClientEditable"),
    @XmlEnumValue("isDeleted")
    IS_DELETED("isDeleted"),
    @XmlEnumValue("isInterviewRequired")
    IS_INTERVIEW_REQUIRED("isInterviewRequired"),
    @XmlEnumValue("isJobcastPublished")
    IS_JOBCAST_PUBLISHED("isJobcastPublished"),
    @XmlEnumValue("isOpen")
    IS_OPEN("isOpen"),
    @XmlEnumValue("isPublic")
    IS_PUBLIC("isPublic"),
    @XmlEnumValue("jobBoardList")
    JOB_BOARD_LIST("jobBoardList"),
    @XmlEnumValue("numOpenings")
    NUM_OPENINGS("numOpenings"),
    @XmlEnumValue("onSite")
    ON_SITE("onSite"),
    @XmlEnumValue("optionsPackage")
    OPTIONS_PACKAGE("optionsPackage"),
    @XmlEnumValue("ownerID")
    OWNER_ID("ownerID"),
    @XmlEnumValue("payRate")
    PAY_RATE("payRate"),
    @XmlEnumValue("publicDescription")
    PUBLIC_DESCRIPTION("publicDescription"),
    @XmlEnumValue("publishedZip")
    PUBLISHED_ZIP("publishedZip"),
    @XmlEnumValue("reasonClosed")
    REASON_CLOSED("reasonClosed"),
    @XmlEnumValue("reportTo")
    REPORT_TO("reportTo"),
    @XmlEnumValue("reportToClientContactID")
    REPORT_TO_CLIENT_CONTACT_ID("reportToClientContactID"),
    @XmlEnumValue("responseUserID")
    RESPONSE_USER_ID("responseUserID"),
    @XmlEnumValue("salary")
    SALARY("salary"),
    @XmlEnumValue("salaryUnit")
    SALARY_UNIT("salaryUnit"),
    @XmlEnumValue("shiftID")
    SHIFT_ID("shiftID"),
    @XmlEnumValue("skillList")
    SKILL_LIST("skillList"),
    @XmlEnumValue("source")
    SOURCE("source"),
    @XmlEnumValue("startDate")
    START_DATE("startDate"),
    @XmlEnumValue("status")
    STATUS("status"),
    @XmlEnumValue("taxRate")
    TAX_RATE("taxRate"),
    @XmlEnumValue("taxStatus")
    TAX_STATUS("taxStatus"),
    @XmlEnumValue("title")
    TITLE("title"),
    @XmlEnumValue("travelRequirements")
    TRAVEL_REQUIREMENTS("travelRequirements"),
    @XmlEnumValue("type")
    TYPE("type"),
    @XmlEnumValue("willRelocate")
    WILL_RELOCATE("willRelocate"),
    @XmlEnumValue("willSponsor")
    WILL_SPONSOR("willSponsor"),
    @XmlEnumValue("workersCompRateID")
    WORKERS_COMP_RATE_ID("workersCompRateID"),
    @XmlEnumValue("yearsRequired")
    YEARS_REQUIRED("yearsRequired");
    private final String value;

    JobOrderApiProperty(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static JobOrderApiProperty fromValue(String v) {
        for (JobOrderApiProperty c: JobOrderApiProperty.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
