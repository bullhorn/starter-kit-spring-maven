
package com.bullhorn.entity.job;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for placementChangeRequestApiProperty.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="placementChangeRequestApiProperty">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="placementChangeRequestID"/>
 *     &lt;enumeration value="approvingUserID"/>
 *     &lt;enumeration value="billingClientContactID"/>
 *     &lt;enumeration value="billingFrequency"/>
 *     &lt;enumeration value="bonusPackage"/>
 *     &lt;enumeration value="clientBillRate"/>
 *     &lt;enumeration value="clientOvertimeRate"/>
 *     &lt;enumeration value="comments"/>
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
 *     &lt;enumeration value="customBillRate1"/>
 *     &lt;enumeration value="customBillRate10"/>
 *     &lt;enumeration value="customBillRate2"/>
 *     &lt;enumeration value="customBillRate3"/>
 *     &lt;enumeration value="customBillRate4"/>
 *     &lt;enumeration value="customBillRate5"/>
 *     &lt;enumeration value="customBillRate6"/>
 *     &lt;enumeration value="customBillRate7"/>
 *     &lt;enumeration value="customBillRate8"/>
 *     &lt;enumeration value="customBillRate9"/>
 *     &lt;enumeration value="customDate1"/>
 *     &lt;enumeration value="customDate2"/>
 *     &lt;enumeration value="customDate3"/>
 *     &lt;enumeration value="customFloat1"/>
 *     &lt;enumeration value="customFloat2"/>
 *     &lt;enumeration value="customFloat3"/>
 *     &lt;enumeration value="customInt1"/>
 *     &lt;enumeration value="customInt2"/>
 *     &lt;enumeration value="customInt3"/>
 *     &lt;enumeration value="customPayRate1"/>
 *     &lt;enumeration value="customPayRate10"/>
 *     &lt;enumeration value="customPayRate2"/>
 *     &lt;enumeration value="customPayRate3"/>
 *     &lt;enumeration value="customPayRate4"/>
 *     &lt;enumeration value="customPayRate5"/>
 *     &lt;enumeration value="customPayRate6"/>
 *     &lt;enumeration value="customPayRate7"/>
 *     &lt;enumeration value="customPayRate8"/>
 *     &lt;enumeration value="customPayRate9"/>
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
 *     &lt;enumeration value="customText21"/>
 *     &lt;enumeration value="customText22"/>
 *     &lt;enumeration value="customText23"/>
 *     &lt;enumeration value="customText24"/>
 *     &lt;enumeration value="customText25"/>
 *     &lt;enumeration value="customText26"/>
 *     &lt;enumeration value="customText27"/>
 *     &lt;enumeration value="customText28"/>
 *     &lt;enumeration value="customText29"/>
 *     &lt;enumeration value="customText3"/>
 *     &lt;enumeration value="customText30"/>
 *     &lt;enumeration value="customText31"/>
 *     &lt;enumeration value="customText32"/>
 *     &lt;enumeration value="customText33"/>
 *     &lt;enumeration value="customText34"/>
 *     &lt;enumeration value="customText35"/>
 *     &lt;enumeration value="customText36"/>
 *     &lt;enumeration value="customText37"/>
 *     &lt;enumeration value="customText38"/>
 *     &lt;enumeration value="customText39"/>
 *     &lt;enumeration value="customText4"/>
 *     &lt;enumeration value="customText40"/>
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
 *     &lt;enumeration value="dateApproved"/>
 *     &lt;enumeration value="dateBegin"/>
 *     &lt;enumeration value="dateClientEffective"/>
 *     &lt;enumeration value="dateEffective"/>
 *     &lt;enumeration value="dateEnd"/>
 *     &lt;enumeration value="daysGuaranteed"/>
 *     &lt;enumeration value="daysProRated"/>
 *     &lt;enumeration value="durationWeeks"/>
 *     &lt;enumeration value="employeeType"/>
 *     &lt;enumeration value="employmentType"/>
 *     &lt;enumeration value="fee"/>
 *     &lt;enumeration value="hoursOfOperation"/>
 *     &lt;enumeration value="hoursPerDay"/>
 *     &lt;enumeration value="housingManagerID"/>
 *     &lt;enumeration value="housingStatus"/>
 *     &lt;enumeration value="migrateGUID"/>
 *     &lt;enumeration value="optionsPackage"/>
 *     &lt;enumeration value="otExemption"/>
 *     &lt;enumeration value="otherHourlyFee"/>
 *     &lt;enumeration value="otherHourlyFeeComments"/>
 *     &lt;enumeration value="overtimeRate"/>
 *     &lt;enumeration value="payRate"/>
 *     &lt;enumeration value="placementID"/>
 *     &lt;enumeration value="recruitingManagerPercentGrossMargin"/>
 *     &lt;enumeration value="referralFee"/>
 *     &lt;enumeration value="referralFeeType"/>
 *     &lt;enumeration value="reportTo"/>
 *     &lt;enumeration value="requestCustomDate1"/>
 *     &lt;enumeration value="requestCustomDate2"/>
 *     &lt;enumeration value="requestCustomDate3"/>
 *     &lt;enumeration value="requestCustomFloat1"/>
 *     &lt;enumeration value="requestCustomFloat2"/>
 *     &lt;enumeration value="requestCustomFloat3"/>
 *     &lt;enumeration value="requestCustomInt1"/>
 *     &lt;enumeration value="requestCustomInt2"/>
 *     &lt;enumeration value="requestCustomInt3"/>
 *     &lt;enumeration value="requestCustomText1"/>
 *     &lt;enumeration value="requestCustomText10"/>
 *     &lt;enumeration value="requestCustomText11"/>
 *     &lt;enumeration value="requestCustomText12"/>
 *     &lt;enumeration value="requestCustomText13"/>
 *     &lt;enumeration value="requestCustomText14"/>
 *     &lt;enumeration value="requestCustomText15"/>
 *     &lt;enumeration value="requestCustomText16"/>
 *     &lt;enumeration value="requestCustomText17"/>
 *     &lt;enumeration value="requestCustomText18"/>
 *     &lt;enumeration value="requestCustomText19"/>
 *     &lt;enumeration value="requestCustomText2"/>
 *     &lt;enumeration value="requestCustomText20"/>
 *     &lt;enumeration value="requestCustomText3"/>
 *     &lt;enumeration value="requestCustomText4"/>
 *     &lt;enumeration value="requestCustomText5"/>
 *     &lt;enumeration value="requestCustomText6"/>
 *     &lt;enumeration value="requestCustomText7"/>
 *     &lt;enumeration value="requestCustomText8"/>
 *     &lt;enumeration value="requestCustomText9"/>
 *     &lt;enumeration value="requestCustomTextBlock1"/>
 *     &lt;enumeration value="requestCustomTextBlock2"/>
 *     &lt;enumeration value="requestCustomTextBlock3"/>
 *     &lt;enumeration value="requestCustomTextBlock4"/>
 *     &lt;enumeration value="requestCustomTextBlock5"/>
 *     &lt;enumeration value="requestStatus"/>
 *     &lt;enumeration value="requestType"/>
 *     &lt;enumeration value="requestingUserID"/>
 *     &lt;enumeration value="salary"/>
 *     &lt;enumeration value="salaryUnit"/>
 *     &lt;enumeration value="salesManagerPercentGrossMargin"/>
 *     &lt;enumeration value="statementClientContactID"/>
 *     &lt;enumeration value="status"/>
 *     &lt;enumeration value="terminationReason"/>
 *     &lt;enumeration value="vendorClientCorporationID"/>
 *     &lt;enumeration value="workWeekStart"/>
 *     &lt;enumeration value="workersCompRateID"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "placementChangeRequestApiProperty")
@XmlEnum
public enum PlacementChangeRequestApiProperty {

    @XmlEnumValue("placementChangeRequestID")
    PLACEMENT_CHANGE_REQUEST_ID("placementChangeRequestID"),
    @XmlEnumValue("approvingUserID")
    APPROVING_USER_ID("approvingUserID"),
    @XmlEnumValue("billingClientContactID")
    BILLING_CLIENT_CONTACT_ID("billingClientContactID"),
    @XmlEnumValue("billingFrequency")
    BILLING_FREQUENCY("billingFrequency"),
    @XmlEnumValue("bonusPackage")
    BONUS_PACKAGE("bonusPackage"),
    @XmlEnumValue("clientBillRate")
    CLIENT_BILL_RATE("clientBillRate"),
    @XmlEnumValue("clientOvertimeRate")
    CLIENT_OVERTIME_RATE("clientOvertimeRate"),
    @XmlEnumValue("comments")
    COMMENTS("comments"),
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
    @XmlEnumValue("customBillRate1")
    CUSTOM_BILL_RATE_1("customBillRate1"),
    @XmlEnumValue("customBillRate10")
    CUSTOM_BILL_RATE_10("customBillRate10"),
    @XmlEnumValue("customBillRate2")
    CUSTOM_BILL_RATE_2("customBillRate2"),
    @XmlEnumValue("customBillRate3")
    CUSTOM_BILL_RATE_3("customBillRate3"),
    @XmlEnumValue("customBillRate4")
    CUSTOM_BILL_RATE_4("customBillRate4"),
    @XmlEnumValue("customBillRate5")
    CUSTOM_BILL_RATE_5("customBillRate5"),
    @XmlEnumValue("customBillRate6")
    CUSTOM_BILL_RATE_6("customBillRate6"),
    @XmlEnumValue("customBillRate7")
    CUSTOM_BILL_RATE_7("customBillRate7"),
    @XmlEnumValue("customBillRate8")
    CUSTOM_BILL_RATE_8("customBillRate8"),
    @XmlEnumValue("customBillRate9")
    CUSTOM_BILL_RATE_9("customBillRate9"),
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
    @XmlEnumValue("customPayRate1")
    CUSTOM_PAY_RATE_1("customPayRate1"),
    @XmlEnumValue("customPayRate10")
    CUSTOM_PAY_RATE_10("customPayRate10"),
    @XmlEnumValue("customPayRate2")
    CUSTOM_PAY_RATE_2("customPayRate2"),
    @XmlEnumValue("customPayRate3")
    CUSTOM_PAY_RATE_3("customPayRate3"),
    @XmlEnumValue("customPayRate4")
    CUSTOM_PAY_RATE_4("customPayRate4"),
    @XmlEnumValue("customPayRate5")
    CUSTOM_PAY_RATE_5("customPayRate5"),
    @XmlEnumValue("customPayRate6")
    CUSTOM_PAY_RATE_6("customPayRate6"),
    @XmlEnumValue("customPayRate7")
    CUSTOM_PAY_RATE_7("customPayRate7"),
    @XmlEnumValue("customPayRate8")
    CUSTOM_PAY_RATE_8("customPayRate8"),
    @XmlEnumValue("customPayRate9")
    CUSTOM_PAY_RATE_9("customPayRate9"),
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
    @XmlEnumValue("customText21")
    CUSTOM_TEXT_21("customText21"),
    @XmlEnumValue("customText22")
    CUSTOM_TEXT_22("customText22"),
    @XmlEnumValue("customText23")
    CUSTOM_TEXT_23("customText23"),
    @XmlEnumValue("customText24")
    CUSTOM_TEXT_24("customText24"),
    @XmlEnumValue("customText25")
    CUSTOM_TEXT_25("customText25"),
    @XmlEnumValue("customText26")
    CUSTOM_TEXT_26("customText26"),
    @XmlEnumValue("customText27")
    CUSTOM_TEXT_27("customText27"),
    @XmlEnumValue("customText28")
    CUSTOM_TEXT_28("customText28"),
    @XmlEnumValue("customText29")
    CUSTOM_TEXT_29("customText29"),
    @XmlEnumValue("customText3")
    CUSTOM_TEXT_3("customText3"),
    @XmlEnumValue("customText30")
    CUSTOM_TEXT_30("customText30"),
    @XmlEnumValue("customText31")
    CUSTOM_TEXT_31("customText31"),
    @XmlEnumValue("customText32")
    CUSTOM_TEXT_32("customText32"),
    @XmlEnumValue("customText33")
    CUSTOM_TEXT_33("customText33"),
    @XmlEnumValue("customText34")
    CUSTOM_TEXT_34("customText34"),
    @XmlEnumValue("customText35")
    CUSTOM_TEXT_35("customText35"),
    @XmlEnumValue("customText36")
    CUSTOM_TEXT_36("customText36"),
    @XmlEnumValue("customText37")
    CUSTOM_TEXT_37("customText37"),
    @XmlEnumValue("customText38")
    CUSTOM_TEXT_38("customText38"),
    @XmlEnumValue("customText39")
    CUSTOM_TEXT_39("customText39"),
    @XmlEnumValue("customText4")
    CUSTOM_TEXT_4("customText4"),
    @XmlEnumValue("customText40")
    CUSTOM_TEXT_40("customText40"),
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
    @XmlEnumValue("dateApproved")
    DATE_APPROVED("dateApproved"),
    @XmlEnumValue("dateBegin")
    DATE_BEGIN("dateBegin"),
    @XmlEnumValue("dateClientEffective")
    DATE_CLIENT_EFFECTIVE("dateClientEffective"),
    @XmlEnumValue("dateEffective")
    DATE_EFFECTIVE("dateEffective"),
    @XmlEnumValue("dateEnd")
    DATE_END("dateEnd"),
    @XmlEnumValue("daysGuaranteed")
    DAYS_GUARANTEED("daysGuaranteed"),
    @XmlEnumValue("daysProRated")
    DAYS_PRO_RATED("daysProRated"),
    @XmlEnumValue("durationWeeks")
    DURATION_WEEKS("durationWeeks"),
    @XmlEnumValue("employeeType")
    EMPLOYEE_TYPE("employeeType"),
    @XmlEnumValue("employmentType")
    EMPLOYMENT_TYPE("employmentType"),
    @XmlEnumValue("fee")
    FEE("fee"),
    @XmlEnumValue("hoursOfOperation")
    HOURS_OF_OPERATION("hoursOfOperation"),
    @XmlEnumValue("hoursPerDay")
    HOURS_PER_DAY("hoursPerDay"),
    @XmlEnumValue("housingManagerID")
    HOUSING_MANAGER_ID("housingManagerID"),
    @XmlEnumValue("housingStatus")
    HOUSING_STATUS("housingStatus"),
    @XmlEnumValue("migrateGUID")
    MIGRATE_GUID("migrateGUID"),
    @XmlEnumValue("optionsPackage")
    OPTIONS_PACKAGE("optionsPackage"),
    @XmlEnumValue("otExemption")
    OT_EXEMPTION("otExemption"),
    @XmlEnumValue("otherHourlyFee")
    OTHER_HOURLY_FEE("otherHourlyFee"),
    @XmlEnumValue("otherHourlyFeeComments")
    OTHER_HOURLY_FEE_COMMENTS("otherHourlyFeeComments"),
    @XmlEnumValue("overtimeRate")
    OVERTIME_RATE("overtimeRate"),
    @XmlEnumValue("payRate")
    PAY_RATE("payRate"),
    @XmlEnumValue("placementID")
    PLACEMENT_ID("placementID"),
    @XmlEnumValue("recruitingManagerPercentGrossMargin")
    RECRUITING_MANAGER_PERCENT_GROSS_MARGIN("recruitingManagerPercentGrossMargin"),
    @XmlEnumValue("referralFee")
    REFERRAL_FEE("referralFee"),
    @XmlEnumValue("referralFeeType")
    REFERRAL_FEE_TYPE("referralFeeType"),
    @XmlEnumValue("reportTo")
    REPORT_TO("reportTo"),
    @XmlEnumValue("requestCustomDate1")
    REQUEST_CUSTOM_DATE_1("requestCustomDate1"),
    @XmlEnumValue("requestCustomDate2")
    REQUEST_CUSTOM_DATE_2("requestCustomDate2"),
    @XmlEnumValue("requestCustomDate3")
    REQUEST_CUSTOM_DATE_3("requestCustomDate3"),
    @XmlEnumValue("requestCustomFloat1")
    REQUEST_CUSTOM_FLOAT_1("requestCustomFloat1"),
    @XmlEnumValue("requestCustomFloat2")
    REQUEST_CUSTOM_FLOAT_2("requestCustomFloat2"),
    @XmlEnumValue("requestCustomFloat3")
    REQUEST_CUSTOM_FLOAT_3("requestCustomFloat3"),
    @XmlEnumValue("requestCustomInt1")
    REQUEST_CUSTOM_INT_1("requestCustomInt1"),
    @XmlEnumValue("requestCustomInt2")
    REQUEST_CUSTOM_INT_2("requestCustomInt2"),
    @XmlEnumValue("requestCustomInt3")
    REQUEST_CUSTOM_INT_3("requestCustomInt3"),
    @XmlEnumValue("requestCustomText1")
    REQUEST_CUSTOM_TEXT_1("requestCustomText1"),
    @XmlEnumValue("requestCustomText10")
    REQUEST_CUSTOM_TEXT_10("requestCustomText10"),
    @XmlEnumValue("requestCustomText11")
    REQUEST_CUSTOM_TEXT_11("requestCustomText11"),
    @XmlEnumValue("requestCustomText12")
    REQUEST_CUSTOM_TEXT_12("requestCustomText12"),
    @XmlEnumValue("requestCustomText13")
    REQUEST_CUSTOM_TEXT_13("requestCustomText13"),
    @XmlEnumValue("requestCustomText14")
    REQUEST_CUSTOM_TEXT_14("requestCustomText14"),
    @XmlEnumValue("requestCustomText15")
    REQUEST_CUSTOM_TEXT_15("requestCustomText15"),
    @XmlEnumValue("requestCustomText16")
    REQUEST_CUSTOM_TEXT_16("requestCustomText16"),
    @XmlEnumValue("requestCustomText17")
    REQUEST_CUSTOM_TEXT_17("requestCustomText17"),
    @XmlEnumValue("requestCustomText18")
    REQUEST_CUSTOM_TEXT_18("requestCustomText18"),
    @XmlEnumValue("requestCustomText19")
    REQUEST_CUSTOM_TEXT_19("requestCustomText19"),
    @XmlEnumValue("requestCustomText2")
    REQUEST_CUSTOM_TEXT_2("requestCustomText2"),
    @XmlEnumValue("requestCustomText20")
    REQUEST_CUSTOM_TEXT_20("requestCustomText20"),
    @XmlEnumValue("requestCustomText3")
    REQUEST_CUSTOM_TEXT_3("requestCustomText3"),
    @XmlEnumValue("requestCustomText4")
    REQUEST_CUSTOM_TEXT_4("requestCustomText4"),
    @XmlEnumValue("requestCustomText5")
    REQUEST_CUSTOM_TEXT_5("requestCustomText5"),
    @XmlEnumValue("requestCustomText6")
    REQUEST_CUSTOM_TEXT_6("requestCustomText6"),
    @XmlEnumValue("requestCustomText7")
    REQUEST_CUSTOM_TEXT_7("requestCustomText7"),
    @XmlEnumValue("requestCustomText8")
    REQUEST_CUSTOM_TEXT_8("requestCustomText8"),
    @XmlEnumValue("requestCustomText9")
    REQUEST_CUSTOM_TEXT_9("requestCustomText9"),
    @XmlEnumValue("requestCustomTextBlock1")
    REQUEST_CUSTOM_TEXT_BLOCK_1("requestCustomTextBlock1"),
    @XmlEnumValue("requestCustomTextBlock2")
    REQUEST_CUSTOM_TEXT_BLOCK_2("requestCustomTextBlock2"),
    @XmlEnumValue("requestCustomTextBlock3")
    REQUEST_CUSTOM_TEXT_BLOCK_3("requestCustomTextBlock3"),
    @XmlEnumValue("requestCustomTextBlock4")
    REQUEST_CUSTOM_TEXT_BLOCK_4("requestCustomTextBlock4"),
    @XmlEnumValue("requestCustomTextBlock5")
    REQUEST_CUSTOM_TEXT_BLOCK_5("requestCustomTextBlock5"),
    @XmlEnumValue("requestStatus")
    REQUEST_STATUS("requestStatus"),
    @XmlEnumValue("requestType")
    REQUEST_TYPE("requestType"),
    @XmlEnumValue("requestingUserID")
    REQUESTING_USER_ID("requestingUserID"),
    @XmlEnumValue("salary")
    SALARY("salary"),
    @XmlEnumValue("salaryUnit")
    SALARY_UNIT("salaryUnit"),
    @XmlEnumValue("salesManagerPercentGrossMargin")
    SALES_MANAGER_PERCENT_GROSS_MARGIN("salesManagerPercentGrossMargin"),
    @XmlEnumValue("statementClientContactID")
    STATEMENT_CLIENT_CONTACT_ID("statementClientContactID"),
    @XmlEnumValue("status")
    STATUS("status"),
    @XmlEnumValue("terminationReason")
    TERMINATION_REASON("terminationReason"),
    @XmlEnumValue("vendorClientCorporationID")
    VENDOR_CLIENT_CORPORATION_ID("vendorClientCorporationID"),
    @XmlEnumValue("workWeekStart")
    WORK_WEEK_START("workWeekStart"),
    @XmlEnumValue("workersCompRateID")
    WORKERS_COMP_RATE_ID("workersCompRateID");
    private final String value;

    PlacementChangeRequestApiProperty(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PlacementChangeRequestApiProperty fromValue(String v) {
        for (PlacementChangeRequestApiProperty c: PlacementChangeRequestApiProperty.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
