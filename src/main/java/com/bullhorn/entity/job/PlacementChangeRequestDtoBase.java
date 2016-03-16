
package com.bullhorn.entity.job;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.bullhorn.entity.AbstractDto;


/**
 * <p>Java class for placementChangeRequestDtoBase complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="placementChangeRequestDtoBase">
 *   &lt;complexContent>
 *     &lt;extension base="{http://entity.bullhorn.com/}abstractDto">
 *       &lt;sequence>
 *         &lt;element name="approvingUserID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="billingClientContactID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="billingFrequency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bonusPackage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="clientBillRate" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="clientOvertimeRate" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="comments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="correlatedCustomDate1" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="correlatedCustomDate2" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="correlatedCustomDate3" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="correlatedCustomFloat1" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="correlatedCustomFloat2" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="correlatedCustomFloat3" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="correlatedCustomInt1" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="correlatedCustomInt2" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="correlatedCustomInt3" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="correlatedCustomText1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="correlatedCustomText10" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="correlatedCustomText2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="correlatedCustomText3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="correlatedCustomText4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="correlatedCustomText5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="correlatedCustomText6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="correlatedCustomText7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="correlatedCustomText8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="correlatedCustomText9" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="correlatedCustomTextBlock1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="correlatedCustomTextBlock2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="correlatedCustomTextBlock3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="costCenter" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customBillRate1" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="customBillRate10" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="customBillRate2" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="customBillRate3" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="customBillRate4" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="customBillRate5" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="customBillRate6" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="customBillRate7" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="customBillRate8" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="customBillRate9" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="customDate1" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="customDate2" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="customDate3" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="customFloat1" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="customFloat2" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="customFloat3" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="customInt1" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="customInt2" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="customInt3" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="customPayRate1" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="customPayRate10" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="customPayRate2" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="customPayRate3" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="customPayRate4" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="customPayRate5" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="customPayRate6" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="customPayRate7" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="customPayRate8" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="customPayRate9" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="customText1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customText10" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customText11" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customText12" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customText13" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customText14" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customText15" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customText16" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customText17" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customText18" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customText19" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customText2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customText20" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customText21" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customText22" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customText23" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customText24" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customText25" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customText26" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customText27" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customText28" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customText29" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customText3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customText30" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customText31" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customText32" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customText33" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customText34" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customText35" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customText36" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customText37" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customText38" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customText39" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customText4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customText40" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customText5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customText6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customText7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customText8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customText9" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customTextBlock1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customTextBlock2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customTextBlock3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customTextBlock4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customTextBlock5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dateAdded" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="dateApproved" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="dateBegin" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="dateClientEffective" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="dateEffective" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="dateEnd" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="daysGuaranteed" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="daysProRated" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="durationWeeks" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="employeeType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="employmentType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fee" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="hoursOfOperation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="hoursPerDay" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="housingManagerID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="housingStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="migrateGUID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="optionsPackage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="otExemption" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="otherHourlyFee" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="otherHourlyFeeComments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="overtimeRate" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="payRate" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="placementChangeRequestID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="placementID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="recruitingManagerPercentGrossMargin" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="referralFee" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="referralFeeType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="reportTo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="requestCustomDate1" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="requestCustomDate2" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="requestCustomDate3" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="requestCustomFloat1" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="requestCustomFloat2" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="requestCustomFloat3" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="requestCustomInt1" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="requestCustomInt2" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="requestCustomInt3" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="requestCustomText1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="requestCustomText10" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="requestCustomText11" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="requestCustomText12" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="requestCustomText13" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="requestCustomText14" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="requestCustomText15" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="requestCustomText16" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="requestCustomText17" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="requestCustomText18" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="requestCustomText19" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="requestCustomText2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="requestCustomText20" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="requestCustomText3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="requestCustomText4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="requestCustomText5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="requestCustomText6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="requestCustomText7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="requestCustomText8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="requestCustomText9" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="requestCustomTextBlock1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="requestCustomTextBlock2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="requestCustomTextBlock3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="requestCustomTextBlock4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="requestCustomTextBlock5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="requestStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="requestType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="requestingUserID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="salary" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="salaryUnit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="salesManagerPercentGrossMargin" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="statementClientContactID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="terminationReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="vendorClientCorporationID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="workWeekStart" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="workersCompRateID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "placementChangeRequestDtoBase", propOrder = {
    "approvingUserID",
    "billingClientContactID",
    "billingFrequency",
    "bonusPackage",
    "clientBillRate",
    "clientOvertimeRate",
    "comments",
    "correlatedCustomDate1",
    "correlatedCustomDate2",
    "correlatedCustomDate3",
    "correlatedCustomFloat1",
    "correlatedCustomFloat2",
    "correlatedCustomFloat3",
    "correlatedCustomInt1",
    "correlatedCustomInt2",
    "correlatedCustomInt3",
    "correlatedCustomText1",
    "correlatedCustomText10",
    "correlatedCustomText2",
    "correlatedCustomText3",
    "correlatedCustomText4",
    "correlatedCustomText5",
    "correlatedCustomText6",
    "correlatedCustomText7",
    "correlatedCustomText8",
    "correlatedCustomText9",
    "correlatedCustomTextBlock1",
    "correlatedCustomTextBlock2",
    "correlatedCustomTextBlock3",
    "costCenter",
    "customBillRate1",
    "customBillRate10",
    "customBillRate2",
    "customBillRate3",
    "customBillRate4",
    "customBillRate5",
    "customBillRate6",
    "customBillRate7",
    "customBillRate8",
    "customBillRate9",
    "customDate1",
    "customDate2",
    "customDate3",
    "customFloat1",
    "customFloat2",
    "customFloat3",
    "customInt1",
    "customInt2",
    "customInt3",
    "customPayRate1",
    "customPayRate10",
    "customPayRate2",
    "customPayRate3",
    "customPayRate4",
    "customPayRate5",
    "customPayRate6",
    "customPayRate7",
    "customPayRate8",
    "customPayRate9",
    "customText1",
    "customText10",
    "customText11",
    "customText12",
    "customText13",
    "customText14",
    "customText15",
    "customText16",
    "customText17",
    "customText18",
    "customText19",
    "customText2",
    "customText20",
    "customText21",
    "customText22",
    "customText23",
    "customText24",
    "customText25",
    "customText26",
    "customText27",
    "customText28",
    "customText29",
    "customText3",
    "customText30",
    "customText31",
    "customText32",
    "customText33",
    "customText34",
    "customText35",
    "customText36",
    "customText37",
    "customText38",
    "customText39",
    "customText4",
    "customText40",
    "customText5",
    "customText6",
    "customText7",
    "customText8",
    "customText9",
    "customTextBlock1",
    "customTextBlock2",
    "customTextBlock3",
    "customTextBlock4",
    "customTextBlock5",
    "dateAdded",
    "dateApproved",
    "dateBegin",
    "dateClientEffective",
    "dateEffective",
    "dateEnd",
    "daysGuaranteed",
    "daysProRated",
    "durationWeeks",
    "employeeType",
    "employmentType",
    "fee",
    "hoursOfOperation",
    "hoursPerDay",
    "housingManagerID",
    "housingStatus",
    "migrateGUID",
    "optionsPackage",
    "otExemption",
    "otherHourlyFee",
    "otherHourlyFeeComments",
    "overtimeRate",
    "payRate",
    "placementChangeRequestID",
    "placementID",
    "recruitingManagerPercentGrossMargin",
    "referralFee",
    "referralFeeType",
    "reportTo",
    "requestCustomDate1",
    "requestCustomDate2",
    "requestCustomDate3",
    "requestCustomFloat1",
    "requestCustomFloat2",
    "requestCustomFloat3",
    "requestCustomInt1",
    "requestCustomInt2",
    "requestCustomInt3",
    "requestCustomText1",
    "requestCustomText10",
    "requestCustomText11",
    "requestCustomText12",
    "requestCustomText13",
    "requestCustomText14",
    "requestCustomText15",
    "requestCustomText16",
    "requestCustomText17",
    "requestCustomText18",
    "requestCustomText19",
    "requestCustomText2",
    "requestCustomText20",
    "requestCustomText3",
    "requestCustomText4",
    "requestCustomText5",
    "requestCustomText6",
    "requestCustomText7",
    "requestCustomText8",
    "requestCustomText9",
    "requestCustomTextBlock1",
    "requestCustomTextBlock2",
    "requestCustomTextBlock3",
    "requestCustomTextBlock4",
    "requestCustomTextBlock5",
    "requestStatus",
    "requestType",
    "requestingUserID",
    "salary",
    "salaryUnit",
    "salesManagerPercentGrossMargin",
    "statementClientContactID",
    "status",
    "terminationReason",
    "vendorClientCorporationID",
    "workWeekStart",
    "workersCompRateID"
})
@XmlSeeAlso({
    PlacementChangeRequestDto.class
})
public abstract class PlacementChangeRequestDtoBase
    extends AbstractDto
{

    protected Integer approvingUserID;
    protected Integer billingClientContactID;
    protected String billingFrequency;
    protected String bonusPackage;
    protected Double clientBillRate;
    protected Double clientOvertimeRate;
    protected String comments;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar correlatedCustomDate1;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar correlatedCustomDate2;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar correlatedCustomDate3;
    protected Double correlatedCustomFloat1;
    protected Double correlatedCustomFloat2;
    protected Double correlatedCustomFloat3;
    protected Integer correlatedCustomInt1;
    protected Integer correlatedCustomInt2;
    protected Integer correlatedCustomInt3;
    protected String correlatedCustomText1;
    protected String correlatedCustomText10;
    protected String correlatedCustomText2;
    protected String correlatedCustomText3;
    protected String correlatedCustomText4;
    protected String correlatedCustomText5;
    protected String correlatedCustomText6;
    protected String correlatedCustomText7;
    protected String correlatedCustomText8;
    protected String correlatedCustomText9;
    protected String correlatedCustomTextBlock1;
    protected String correlatedCustomTextBlock2;
    protected String correlatedCustomTextBlock3;
    protected String costCenter;
    protected BigDecimal customBillRate1;
    protected BigDecimal customBillRate10;
    protected BigDecimal customBillRate2;
    protected BigDecimal customBillRate3;
    protected BigDecimal customBillRate4;
    protected BigDecimal customBillRate5;
    protected BigDecimal customBillRate6;
    protected BigDecimal customBillRate7;
    protected BigDecimal customBillRate8;
    protected BigDecimal customBillRate9;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar customDate1;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar customDate2;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar customDate3;
    protected Double customFloat1;
    protected Double customFloat2;
    protected Double customFloat3;
    protected Integer customInt1;
    protected Integer customInt2;
    protected Integer customInt3;
    protected BigDecimal customPayRate1;
    protected BigDecimal customPayRate10;
    protected BigDecimal customPayRate2;
    protected BigDecimal customPayRate3;
    protected BigDecimal customPayRate4;
    protected BigDecimal customPayRate5;
    protected BigDecimal customPayRate6;
    protected BigDecimal customPayRate7;
    protected BigDecimal customPayRate8;
    protected BigDecimal customPayRate9;
    protected String customText1;
    protected String customText10;
    protected String customText11;
    protected String customText12;
    protected String customText13;
    protected String customText14;
    protected String customText15;
    protected String customText16;
    protected String customText17;
    protected String customText18;
    protected String customText19;
    protected String customText2;
    protected String customText20;
    protected String customText21;
    protected String customText22;
    protected String customText23;
    protected String customText24;
    protected String customText25;
    protected String customText26;
    protected String customText27;
    protected String customText28;
    protected String customText29;
    protected String customText3;
    protected String customText30;
    protected String customText31;
    protected String customText32;
    protected String customText33;
    protected String customText34;
    protected String customText35;
    protected String customText36;
    protected String customText37;
    protected String customText38;
    protected String customText39;
    protected String customText4;
    protected String customText40;
    protected String customText5;
    protected String customText6;
    protected String customText7;
    protected String customText8;
    protected String customText9;
    protected String customTextBlock1;
    protected String customTextBlock2;
    protected String customTextBlock3;
    protected String customTextBlock4;
    protected String customTextBlock5;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateAdded;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateApproved;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateBegin;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateClientEffective;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateEffective;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateEnd;
    protected Integer daysGuaranteed;
    protected Integer daysProRated;
    protected Double durationWeeks;
    protected String employeeType;
    protected String employmentType;
    protected Double fee;
    protected String hoursOfOperation;
    protected Double hoursPerDay;
    protected Integer housingManagerID;
    protected String housingStatus;
    protected String migrateGUID;
    protected String optionsPackage;
    protected Integer otExemption;
    protected Double otherHourlyFee;
    protected String otherHourlyFeeComments;
    protected Double overtimeRate;
    protected BigDecimal payRate;
    protected Integer placementChangeRequestID;
    protected Integer placementID;
    protected Double recruitingManagerPercentGrossMargin;
    protected BigDecimal referralFee;
    protected String referralFeeType;
    protected String reportTo;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar requestCustomDate1;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar requestCustomDate2;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar requestCustomDate3;
    protected Double requestCustomFloat1;
    protected Double requestCustomFloat2;
    protected Double requestCustomFloat3;
    protected Integer requestCustomInt1;
    protected Integer requestCustomInt2;
    protected Integer requestCustomInt3;
    protected String requestCustomText1;
    protected String requestCustomText10;
    protected String requestCustomText11;
    protected String requestCustomText12;
    protected String requestCustomText13;
    protected String requestCustomText14;
    protected String requestCustomText15;
    protected String requestCustomText16;
    protected String requestCustomText17;
    protected String requestCustomText18;
    protected String requestCustomText19;
    protected String requestCustomText2;
    protected String requestCustomText20;
    protected String requestCustomText3;
    protected String requestCustomText4;
    protected String requestCustomText5;
    protected String requestCustomText6;
    protected String requestCustomText7;
    protected String requestCustomText8;
    protected String requestCustomText9;
    protected String requestCustomTextBlock1;
    protected String requestCustomTextBlock2;
    protected String requestCustomTextBlock3;
    protected String requestCustomTextBlock4;
    protected String requestCustomTextBlock5;
    protected String requestStatus;
    protected String requestType;
    protected Integer requestingUserID;
    protected BigDecimal salary;
    protected String salaryUnit;
    protected Double salesManagerPercentGrossMargin;
    protected Integer statementClientContactID;
    protected String status;
    protected String terminationReason;
    protected Integer vendorClientCorporationID;
    protected Integer workWeekStart;
    protected Integer workersCompRateID;

    /**
     * Gets the value of the approvingUserID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getApprovingUserID() {
        return approvingUserID;
    }

    /**
     * Sets the value of the approvingUserID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setApprovingUserID(Integer value) {
        this.approvingUserID = value;
    }

    /**
     * Gets the value of the billingClientContactID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBillingClientContactID() {
        return billingClientContactID;
    }

    /**
     * Sets the value of the billingClientContactID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBillingClientContactID(Integer value) {
        this.billingClientContactID = value;
    }

    /**
     * Gets the value of the billingFrequency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillingFrequency() {
        return billingFrequency;
    }

    /**
     * Sets the value of the billingFrequency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillingFrequency(String value) {
        this.billingFrequency = value;
    }

    /**
     * Gets the value of the bonusPackage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBonusPackage() {
        return bonusPackage;
    }

    /**
     * Sets the value of the bonusPackage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBonusPackage(String value) {
        this.bonusPackage = value;
    }

    /**
     * Gets the value of the clientBillRate property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getClientBillRate() {
        return clientBillRate;
    }

    /**
     * Sets the value of the clientBillRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setClientBillRate(Double value) {
        this.clientBillRate = value;
    }

    /**
     * Gets the value of the clientOvertimeRate property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getClientOvertimeRate() {
        return clientOvertimeRate;
    }

    /**
     * Sets the value of the clientOvertimeRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setClientOvertimeRate(Double value) {
        this.clientOvertimeRate = value;
    }

    /**
     * Gets the value of the comments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComments() {
        return comments;
    }

    /**
     * Sets the value of the comments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComments(String value) {
        this.comments = value;
    }

    /**
     * Gets the value of the correlatedCustomDate1 property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCorrelatedCustomDate1() {
        return correlatedCustomDate1;
    }

    /**
     * Sets the value of the correlatedCustomDate1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCorrelatedCustomDate1(XMLGregorianCalendar value) {
        this.correlatedCustomDate1 = value;
    }

    /**
     * Gets the value of the correlatedCustomDate2 property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCorrelatedCustomDate2() {
        return correlatedCustomDate2;
    }

    /**
     * Sets the value of the correlatedCustomDate2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCorrelatedCustomDate2(XMLGregorianCalendar value) {
        this.correlatedCustomDate2 = value;
    }

    /**
     * Gets the value of the correlatedCustomDate3 property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCorrelatedCustomDate3() {
        return correlatedCustomDate3;
    }

    /**
     * Sets the value of the correlatedCustomDate3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCorrelatedCustomDate3(XMLGregorianCalendar value) {
        this.correlatedCustomDate3 = value;
    }

    /**
     * Gets the value of the correlatedCustomFloat1 property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCorrelatedCustomFloat1() {
        return correlatedCustomFloat1;
    }

    /**
     * Sets the value of the correlatedCustomFloat1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCorrelatedCustomFloat1(Double value) {
        this.correlatedCustomFloat1 = value;
    }

    /**
     * Gets the value of the correlatedCustomFloat2 property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCorrelatedCustomFloat2() {
        return correlatedCustomFloat2;
    }

    /**
     * Sets the value of the correlatedCustomFloat2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCorrelatedCustomFloat2(Double value) {
        this.correlatedCustomFloat2 = value;
    }

    /**
     * Gets the value of the correlatedCustomFloat3 property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCorrelatedCustomFloat3() {
        return correlatedCustomFloat3;
    }

    /**
     * Sets the value of the correlatedCustomFloat3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCorrelatedCustomFloat3(Double value) {
        this.correlatedCustomFloat3 = value;
    }

    /**
     * Gets the value of the correlatedCustomInt1 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCorrelatedCustomInt1() {
        return correlatedCustomInt1;
    }

    /**
     * Sets the value of the correlatedCustomInt1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCorrelatedCustomInt1(Integer value) {
        this.correlatedCustomInt1 = value;
    }

    /**
     * Gets the value of the correlatedCustomInt2 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCorrelatedCustomInt2() {
        return correlatedCustomInt2;
    }

    /**
     * Sets the value of the correlatedCustomInt2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCorrelatedCustomInt2(Integer value) {
        this.correlatedCustomInt2 = value;
    }

    /**
     * Gets the value of the correlatedCustomInt3 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCorrelatedCustomInt3() {
        return correlatedCustomInt3;
    }

    /**
     * Sets the value of the correlatedCustomInt3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCorrelatedCustomInt3(Integer value) {
        this.correlatedCustomInt3 = value;
    }

    /**
     * Gets the value of the correlatedCustomText1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorrelatedCustomText1() {
        return correlatedCustomText1;
    }

    /**
     * Sets the value of the correlatedCustomText1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorrelatedCustomText1(String value) {
        this.correlatedCustomText1 = value;
    }

    /**
     * Gets the value of the correlatedCustomText10 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorrelatedCustomText10() {
        return correlatedCustomText10;
    }

    /**
     * Sets the value of the correlatedCustomText10 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorrelatedCustomText10(String value) {
        this.correlatedCustomText10 = value;
    }

    /**
     * Gets the value of the correlatedCustomText2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorrelatedCustomText2() {
        return correlatedCustomText2;
    }

    /**
     * Sets the value of the correlatedCustomText2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorrelatedCustomText2(String value) {
        this.correlatedCustomText2 = value;
    }

    /**
     * Gets the value of the correlatedCustomText3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorrelatedCustomText3() {
        return correlatedCustomText3;
    }

    /**
     * Sets the value of the correlatedCustomText3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorrelatedCustomText3(String value) {
        this.correlatedCustomText3 = value;
    }

    /**
     * Gets the value of the correlatedCustomText4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorrelatedCustomText4() {
        return correlatedCustomText4;
    }

    /**
     * Sets the value of the correlatedCustomText4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorrelatedCustomText4(String value) {
        this.correlatedCustomText4 = value;
    }

    /**
     * Gets the value of the correlatedCustomText5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorrelatedCustomText5() {
        return correlatedCustomText5;
    }

    /**
     * Sets the value of the correlatedCustomText5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorrelatedCustomText5(String value) {
        this.correlatedCustomText5 = value;
    }

    /**
     * Gets the value of the correlatedCustomText6 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorrelatedCustomText6() {
        return correlatedCustomText6;
    }

    /**
     * Sets the value of the correlatedCustomText6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorrelatedCustomText6(String value) {
        this.correlatedCustomText6 = value;
    }

    /**
     * Gets the value of the correlatedCustomText7 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorrelatedCustomText7() {
        return correlatedCustomText7;
    }

    /**
     * Sets the value of the correlatedCustomText7 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorrelatedCustomText7(String value) {
        this.correlatedCustomText7 = value;
    }

    /**
     * Gets the value of the correlatedCustomText8 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorrelatedCustomText8() {
        return correlatedCustomText8;
    }

    /**
     * Sets the value of the correlatedCustomText8 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorrelatedCustomText8(String value) {
        this.correlatedCustomText8 = value;
    }

    /**
     * Gets the value of the correlatedCustomText9 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorrelatedCustomText9() {
        return correlatedCustomText9;
    }

    /**
     * Sets the value of the correlatedCustomText9 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorrelatedCustomText9(String value) {
        this.correlatedCustomText9 = value;
    }

    /**
     * Gets the value of the correlatedCustomTextBlock1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorrelatedCustomTextBlock1() {
        return correlatedCustomTextBlock1;
    }

    /**
     * Sets the value of the correlatedCustomTextBlock1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorrelatedCustomTextBlock1(String value) {
        this.correlatedCustomTextBlock1 = value;
    }

    /**
     * Gets the value of the correlatedCustomTextBlock2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorrelatedCustomTextBlock2() {
        return correlatedCustomTextBlock2;
    }

    /**
     * Sets the value of the correlatedCustomTextBlock2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorrelatedCustomTextBlock2(String value) {
        this.correlatedCustomTextBlock2 = value;
    }

    /**
     * Gets the value of the correlatedCustomTextBlock3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorrelatedCustomTextBlock3() {
        return correlatedCustomTextBlock3;
    }

    /**
     * Sets the value of the correlatedCustomTextBlock3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorrelatedCustomTextBlock3(String value) {
        this.correlatedCustomTextBlock3 = value;
    }

    /**
     * Gets the value of the costCenter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCostCenter() {
        return costCenter;
    }

    /**
     * Sets the value of the costCenter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCostCenter(String value) {
        this.costCenter = value;
    }

    /**
     * Gets the value of the customBillRate1 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCustomBillRate1() {
        return customBillRate1;
    }

    /**
     * Sets the value of the customBillRate1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCustomBillRate1(BigDecimal value) {
        this.customBillRate1 = value;
    }

    /**
     * Gets the value of the customBillRate10 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCustomBillRate10() {
        return customBillRate10;
    }

    /**
     * Sets the value of the customBillRate10 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCustomBillRate10(BigDecimal value) {
        this.customBillRate10 = value;
    }

    /**
     * Gets the value of the customBillRate2 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCustomBillRate2() {
        return customBillRate2;
    }

    /**
     * Sets the value of the customBillRate2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCustomBillRate2(BigDecimal value) {
        this.customBillRate2 = value;
    }

    /**
     * Gets the value of the customBillRate3 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCustomBillRate3() {
        return customBillRate3;
    }

    /**
     * Sets the value of the customBillRate3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCustomBillRate3(BigDecimal value) {
        this.customBillRate3 = value;
    }

    /**
     * Gets the value of the customBillRate4 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCustomBillRate4() {
        return customBillRate4;
    }

    /**
     * Sets the value of the customBillRate4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCustomBillRate4(BigDecimal value) {
        this.customBillRate4 = value;
    }

    /**
     * Gets the value of the customBillRate5 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCustomBillRate5() {
        return customBillRate5;
    }

    /**
     * Sets the value of the customBillRate5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCustomBillRate5(BigDecimal value) {
        this.customBillRate5 = value;
    }

    /**
     * Gets the value of the customBillRate6 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCustomBillRate6() {
        return customBillRate6;
    }

    /**
     * Sets the value of the customBillRate6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCustomBillRate6(BigDecimal value) {
        this.customBillRate6 = value;
    }

    /**
     * Gets the value of the customBillRate7 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCustomBillRate7() {
        return customBillRate7;
    }

    /**
     * Sets the value of the customBillRate7 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCustomBillRate7(BigDecimal value) {
        this.customBillRate7 = value;
    }

    /**
     * Gets the value of the customBillRate8 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCustomBillRate8() {
        return customBillRate8;
    }

    /**
     * Sets the value of the customBillRate8 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCustomBillRate8(BigDecimal value) {
        this.customBillRate8 = value;
    }

    /**
     * Gets the value of the customBillRate9 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCustomBillRate9() {
        return customBillRate9;
    }

    /**
     * Sets the value of the customBillRate9 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCustomBillRate9(BigDecimal value) {
        this.customBillRate9 = value;
    }

    /**
     * Gets the value of the customDate1 property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCustomDate1() {
        return customDate1;
    }

    /**
     * Sets the value of the customDate1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCustomDate1(XMLGregorianCalendar value) {
        this.customDate1 = value;
    }

    /**
     * Gets the value of the customDate2 property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCustomDate2() {
        return customDate2;
    }

    /**
     * Sets the value of the customDate2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCustomDate2(XMLGregorianCalendar value) {
        this.customDate2 = value;
    }

    /**
     * Gets the value of the customDate3 property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCustomDate3() {
        return customDate3;
    }

    /**
     * Sets the value of the customDate3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCustomDate3(XMLGregorianCalendar value) {
        this.customDate3 = value;
    }

    /**
     * Gets the value of the customFloat1 property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCustomFloat1() {
        return customFloat1;
    }

    /**
     * Sets the value of the customFloat1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCustomFloat1(Double value) {
        this.customFloat1 = value;
    }

    /**
     * Gets the value of the customFloat2 property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCustomFloat2() {
        return customFloat2;
    }

    /**
     * Sets the value of the customFloat2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCustomFloat2(Double value) {
        this.customFloat2 = value;
    }

    /**
     * Gets the value of the customFloat3 property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCustomFloat3() {
        return customFloat3;
    }

    /**
     * Sets the value of the customFloat3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCustomFloat3(Double value) {
        this.customFloat3 = value;
    }

    /**
     * Gets the value of the customInt1 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCustomInt1() {
        return customInt1;
    }

    /**
     * Sets the value of the customInt1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCustomInt1(Integer value) {
        this.customInt1 = value;
    }

    /**
     * Gets the value of the customInt2 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCustomInt2() {
        return customInt2;
    }

    /**
     * Sets the value of the customInt2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCustomInt2(Integer value) {
        this.customInt2 = value;
    }

    /**
     * Gets the value of the customInt3 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCustomInt3() {
        return customInt3;
    }

    /**
     * Sets the value of the customInt3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCustomInt3(Integer value) {
        this.customInt3 = value;
    }

    /**
     * Gets the value of the customPayRate1 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCustomPayRate1() {
        return customPayRate1;
    }

    /**
     * Sets the value of the customPayRate1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCustomPayRate1(BigDecimal value) {
        this.customPayRate1 = value;
    }

    /**
     * Gets the value of the customPayRate10 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCustomPayRate10() {
        return customPayRate10;
    }

    /**
     * Sets the value of the customPayRate10 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCustomPayRate10(BigDecimal value) {
        this.customPayRate10 = value;
    }

    /**
     * Gets the value of the customPayRate2 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCustomPayRate2() {
        return customPayRate2;
    }

    /**
     * Sets the value of the customPayRate2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCustomPayRate2(BigDecimal value) {
        this.customPayRate2 = value;
    }

    /**
     * Gets the value of the customPayRate3 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCustomPayRate3() {
        return customPayRate3;
    }

    /**
     * Sets the value of the customPayRate3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCustomPayRate3(BigDecimal value) {
        this.customPayRate3 = value;
    }

    /**
     * Gets the value of the customPayRate4 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCustomPayRate4() {
        return customPayRate4;
    }

    /**
     * Sets the value of the customPayRate4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCustomPayRate4(BigDecimal value) {
        this.customPayRate4 = value;
    }

    /**
     * Gets the value of the customPayRate5 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCustomPayRate5() {
        return customPayRate5;
    }

    /**
     * Sets the value of the customPayRate5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCustomPayRate5(BigDecimal value) {
        this.customPayRate5 = value;
    }

    /**
     * Gets the value of the customPayRate6 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCustomPayRate6() {
        return customPayRate6;
    }

    /**
     * Sets the value of the customPayRate6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCustomPayRate6(BigDecimal value) {
        this.customPayRate6 = value;
    }

    /**
     * Gets the value of the customPayRate7 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCustomPayRate7() {
        return customPayRate7;
    }

    /**
     * Sets the value of the customPayRate7 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCustomPayRate7(BigDecimal value) {
        this.customPayRate7 = value;
    }

    /**
     * Gets the value of the customPayRate8 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCustomPayRate8() {
        return customPayRate8;
    }

    /**
     * Sets the value of the customPayRate8 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCustomPayRate8(BigDecimal value) {
        this.customPayRate8 = value;
    }

    /**
     * Gets the value of the customPayRate9 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCustomPayRate9() {
        return customPayRate9;
    }

    /**
     * Sets the value of the customPayRate9 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCustomPayRate9(BigDecimal value) {
        this.customPayRate9 = value;
    }

    /**
     * Gets the value of the customText1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomText1() {
        return customText1;
    }

    /**
     * Sets the value of the customText1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomText1(String value) {
        this.customText1 = value;
    }

    /**
     * Gets the value of the customText10 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomText10() {
        return customText10;
    }

    /**
     * Sets the value of the customText10 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomText10(String value) {
        this.customText10 = value;
    }

    /**
     * Gets the value of the customText11 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomText11() {
        return customText11;
    }

    /**
     * Sets the value of the customText11 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomText11(String value) {
        this.customText11 = value;
    }

    /**
     * Gets the value of the customText12 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomText12() {
        return customText12;
    }

    /**
     * Sets the value of the customText12 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomText12(String value) {
        this.customText12 = value;
    }

    /**
     * Gets the value of the customText13 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomText13() {
        return customText13;
    }

    /**
     * Sets the value of the customText13 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomText13(String value) {
        this.customText13 = value;
    }

    /**
     * Gets the value of the customText14 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomText14() {
        return customText14;
    }

    /**
     * Sets the value of the customText14 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomText14(String value) {
        this.customText14 = value;
    }

    /**
     * Gets the value of the customText15 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomText15() {
        return customText15;
    }

    /**
     * Sets the value of the customText15 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomText15(String value) {
        this.customText15 = value;
    }

    /**
     * Gets the value of the customText16 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomText16() {
        return customText16;
    }

    /**
     * Sets the value of the customText16 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomText16(String value) {
        this.customText16 = value;
    }

    /**
     * Gets the value of the customText17 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomText17() {
        return customText17;
    }

    /**
     * Sets the value of the customText17 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomText17(String value) {
        this.customText17 = value;
    }

    /**
     * Gets the value of the customText18 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomText18() {
        return customText18;
    }

    /**
     * Sets the value of the customText18 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomText18(String value) {
        this.customText18 = value;
    }

    /**
     * Gets the value of the customText19 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomText19() {
        return customText19;
    }

    /**
     * Sets the value of the customText19 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomText19(String value) {
        this.customText19 = value;
    }

    /**
     * Gets the value of the customText2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomText2() {
        return customText2;
    }

    /**
     * Sets the value of the customText2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomText2(String value) {
        this.customText2 = value;
    }

    /**
     * Gets the value of the customText20 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomText20() {
        return customText20;
    }

    /**
     * Sets the value of the customText20 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomText20(String value) {
        this.customText20 = value;
    }

    /**
     * Gets the value of the customText21 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomText21() {
        return customText21;
    }

    /**
     * Sets the value of the customText21 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomText21(String value) {
        this.customText21 = value;
    }

    /**
     * Gets the value of the customText22 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomText22() {
        return customText22;
    }

    /**
     * Sets the value of the customText22 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomText22(String value) {
        this.customText22 = value;
    }

    /**
     * Gets the value of the customText23 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomText23() {
        return customText23;
    }

    /**
     * Sets the value of the customText23 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomText23(String value) {
        this.customText23 = value;
    }

    /**
     * Gets the value of the customText24 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomText24() {
        return customText24;
    }

    /**
     * Sets the value of the customText24 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomText24(String value) {
        this.customText24 = value;
    }

    /**
     * Gets the value of the customText25 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomText25() {
        return customText25;
    }

    /**
     * Sets the value of the customText25 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomText25(String value) {
        this.customText25 = value;
    }

    /**
     * Gets the value of the customText26 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomText26() {
        return customText26;
    }

    /**
     * Sets the value of the customText26 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomText26(String value) {
        this.customText26 = value;
    }

    /**
     * Gets the value of the customText27 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomText27() {
        return customText27;
    }

    /**
     * Sets the value of the customText27 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomText27(String value) {
        this.customText27 = value;
    }

    /**
     * Gets the value of the customText28 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomText28() {
        return customText28;
    }

    /**
     * Sets the value of the customText28 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomText28(String value) {
        this.customText28 = value;
    }

    /**
     * Gets the value of the customText29 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomText29() {
        return customText29;
    }

    /**
     * Sets the value of the customText29 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomText29(String value) {
        this.customText29 = value;
    }

    /**
     * Gets the value of the customText3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomText3() {
        return customText3;
    }

    /**
     * Sets the value of the customText3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomText3(String value) {
        this.customText3 = value;
    }

    /**
     * Gets the value of the customText30 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomText30() {
        return customText30;
    }

    /**
     * Sets the value of the customText30 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomText30(String value) {
        this.customText30 = value;
    }

    /**
     * Gets the value of the customText31 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomText31() {
        return customText31;
    }

    /**
     * Sets the value of the customText31 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomText31(String value) {
        this.customText31 = value;
    }

    /**
     * Gets the value of the customText32 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomText32() {
        return customText32;
    }

    /**
     * Sets the value of the customText32 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomText32(String value) {
        this.customText32 = value;
    }

    /**
     * Gets the value of the customText33 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomText33() {
        return customText33;
    }

    /**
     * Sets the value of the customText33 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomText33(String value) {
        this.customText33 = value;
    }

    /**
     * Gets the value of the customText34 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomText34() {
        return customText34;
    }

    /**
     * Sets the value of the customText34 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomText34(String value) {
        this.customText34 = value;
    }

    /**
     * Gets the value of the customText35 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomText35() {
        return customText35;
    }

    /**
     * Sets the value of the customText35 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomText35(String value) {
        this.customText35 = value;
    }

    /**
     * Gets the value of the customText36 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomText36() {
        return customText36;
    }

    /**
     * Sets the value of the customText36 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomText36(String value) {
        this.customText36 = value;
    }

    /**
     * Gets the value of the customText37 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomText37() {
        return customText37;
    }

    /**
     * Sets the value of the customText37 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomText37(String value) {
        this.customText37 = value;
    }

    /**
     * Gets the value of the customText38 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomText38() {
        return customText38;
    }

    /**
     * Sets the value of the customText38 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomText38(String value) {
        this.customText38 = value;
    }

    /**
     * Gets the value of the customText39 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomText39() {
        return customText39;
    }

    /**
     * Sets the value of the customText39 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomText39(String value) {
        this.customText39 = value;
    }

    /**
     * Gets the value of the customText4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomText4() {
        return customText4;
    }

    /**
     * Sets the value of the customText4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomText4(String value) {
        this.customText4 = value;
    }

    /**
     * Gets the value of the customText40 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomText40() {
        return customText40;
    }

    /**
     * Sets the value of the customText40 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomText40(String value) {
        this.customText40 = value;
    }

    /**
     * Gets the value of the customText5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomText5() {
        return customText5;
    }

    /**
     * Sets the value of the customText5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomText5(String value) {
        this.customText5 = value;
    }

    /**
     * Gets the value of the customText6 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomText6() {
        return customText6;
    }

    /**
     * Sets the value of the customText6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomText6(String value) {
        this.customText6 = value;
    }

    /**
     * Gets the value of the customText7 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomText7() {
        return customText7;
    }

    /**
     * Sets the value of the customText7 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomText7(String value) {
        this.customText7 = value;
    }

    /**
     * Gets the value of the customText8 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomText8() {
        return customText8;
    }

    /**
     * Sets the value of the customText8 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomText8(String value) {
        this.customText8 = value;
    }

    /**
     * Gets the value of the customText9 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomText9() {
        return customText9;
    }

    /**
     * Sets the value of the customText9 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomText9(String value) {
        this.customText9 = value;
    }

    /**
     * Gets the value of the customTextBlock1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomTextBlock1() {
        return customTextBlock1;
    }

    /**
     * Sets the value of the customTextBlock1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomTextBlock1(String value) {
        this.customTextBlock1 = value;
    }

    /**
     * Gets the value of the customTextBlock2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomTextBlock2() {
        return customTextBlock2;
    }

    /**
     * Sets the value of the customTextBlock2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomTextBlock2(String value) {
        this.customTextBlock2 = value;
    }

    /**
     * Gets the value of the customTextBlock3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomTextBlock3() {
        return customTextBlock3;
    }

    /**
     * Sets the value of the customTextBlock3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomTextBlock3(String value) {
        this.customTextBlock3 = value;
    }

    /**
     * Gets the value of the customTextBlock4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomTextBlock4() {
        return customTextBlock4;
    }

    /**
     * Sets the value of the customTextBlock4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomTextBlock4(String value) {
        this.customTextBlock4 = value;
    }

    /**
     * Gets the value of the customTextBlock5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomTextBlock5() {
        return customTextBlock5;
    }

    /**
     * Sets the value of the customTextBlock5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomTextBlock5(String value) {
        this.customTextBlock5 = value;
    }

    /**
     * Gets the value of the dateAdded property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateAdded() {
        return dateAdded;
    }

    /**
     * Sets the value of the dateAdded property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateAdded(XMLGregorianCalendar value) {
        this.dateAdded = value;
    }

    /**
     * Gets the value of the dateApproved property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateApproved() {
        return dateApproved;
    }

    /**
     * Sets the value of the dateApproved property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateApproved(XMLGregorianCalendar value) {
        this.dateApproved = value;
    }

    /**
     * Gets the value of the dateBegin property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateBegin() {
        return dateBegin;
    }

    /**
     * Sets the value of the dateBegin property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateBegin(XMLGregorianCalendar value) {
        this.dateBegin = value;
    }

    /**
     * Gets the value of the dateClientEffective property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateClientEffective() {
        return dateClientEffective;
    }

    /**
     * Sets the value of the dateClientEffective property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateClientEffective(XMLGregorianCalendar value) {
        this.dateClientEffective = value;
    }

    /**
     * Gets the value of the dateEffective property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateEffective() {
        return dateEffective;
    }

    /**
     * Sets the value of the dateEffective property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateEffective(XMLGregorianCalendar value) {
        this.dateEffective = value;
    }

    /**
     * Gets the value of the dateEnd property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateEnd() {
        return dateEnd;
    }

    /**
     * Sets the value of the dateEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateEnd(XMLGregorianCalendar value) {
        this.dateEnd = value;
    }

    /**
     * Gets the value of the daysGuaranteed property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDaysGuaranteed() {
        return daysGuaranteed;
    }

    /**
     * Sets the value of the daysGuaranteed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDaysGuaranteed(Integer value) {
        this.daysGuaranteed = value;
    }

    /**
     * Gets the value of the daysProRated property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDaysProRated() {
        return daysProRated;
    }

    /**
     * Sets the value of the daysProRated property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDaysProRated(Integer value) {
        this.daysProRated = value;
    }

    /**
     * Gets the value of the durationWeeks property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getDurationWeeks() {
        return durationWeeks;
    }

    /**
     * Sets the value of the durationWeeks property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setDurationWeeks(Double value) {
        this.durationWeeks = value;
    }

    /**
     * Gets the value of the employeeType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmployeeType() {
        return employeeType;
    }

    /**
     * Sets the value of the employeeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmployeeType(String value) {
        this.employeeType = value;
    }

    /**
     * Gets the value of the employmentType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmploymentType() {
        return employmentType;
    }

    /**
     * Sets the value of the employmentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmploymentType(String value) {
        this.employmentType = value;
    }

    /**
     * Gets the value of the fee property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getFee() {
        return fee;
    }

    /**
     * Sets the value of the fee property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setFee(Double value) {
        this.fee = value;
    }

    /**
     * Gets the value of the hoursOfOperation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHoursOfOperation() {
        return hoursOfOperation;
    }

    /**
     * Sets the value of the hoursOfOperation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHoursOfOperation(String value) {
        this.hoursOfOperation = value;
    }

    /**
     * Gets the value of the hoursPerDay property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getHoursPerDay() {
        return hoursPerDay;
    }

    /**
     * Sets the value of the hoursPerDay property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setHoursPerDay(Double value) {
        this.hoursPerDay = value;
    }

    /**
     * Gets the value of the housingManagerID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getHousingManagerID() {
        return housingManagerID;
    }

    /**
     * Sets the value of the housingManagerID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setHousingManagerID(Integer value) {
        this.housingManagerID = value;
    }

    /**
     * Gets the value of the housingStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHousingStatus() {
        return housingStatus;
    }

    /**
     * Sets the value of the housingStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHousingStatus(String value) {
        this.housingStatus = value;
    }

    /**
     * Gets the value of the migrateGUID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMigrateGUID() {
        return migrateGUID;
    }

    /**
     * Sets the value of the migrateGUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMigrateGUID(String value) {
        this.migrateGUID = value;
    }

    /**
     * Gets the value of the optionsPackage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOptionsPackage() {
        return optionsPackage;
    }

    /**
     * Sets the value of the optionsPackage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOptionsPackage(String value) {
        this.optionsPackage = value;
    }

    /**
     * Gets the value of the otExemption property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOtExemption() {
        return otExemption;
    }

    /**
     * Sets the value of the otExemption property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOtExemption(Integer value) {
        this.otExemption = value;
    }

    /**
     * Gets the value of the otherHourlyFee property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getOtherHourlyFee() {
        return otherHourlyFee;
    }

    /**
     * Sets the value of the otherHourlyFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setOtherHourlyFee(Double value) {
        this.otherHourlyFee = value;
    }

    /**
     * Gets the value of the otherHourlyFeeComments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtherHourlyFeeComments() {
        return otherHourlyFeeComments;
    }

    /**
     * Sets the value of the otherHourlyFeeComments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtherHourlyFeeComments(String value) {
        this.otherHourlyFeeComments = value;
    }

    /**
     * Gets the value of the overtimeRate property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getOvertimeRate() {
        return overtimeRate;
    }

    /**
     * Sets the value of the overtimeRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setOvertimeRate(Double value) {
        this.overtimeRate = value;
    }

    /**
     * Gets the value of the payRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPayRate() {
        return payRate;
    }

    /**
     * Sets the value of the payRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPayRate(BigDecimal value) {
        this.payRate = value;
    }

    /**
     * Gets the value of the placementChangeRequestID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPlacementChangeRequestID() {
        return placementChangeRequestID;
    }

    /**
     * Sets the value of the placementChangeRequestID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPlacementChangeRequestID(Integer value) {
        this.placementChangeRequestID = value;
    }

    /**
     * Gets the value of the placementID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPlacementID() {
        return placementID;
    }

    /**
     * Sets the value of the placementID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPlacementID(Integer value) {
        this.placementID = value;
    }

    /**
     * Gets the value of the recruitingManagerPercentGrossMargin property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getRecruitingManagerPercentGrossMargin() {
        return recruitingManagerPercentGrossMargin;
    }

    /**
     * Sets the value of the recruitingManagerPercentGrossMargin property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setRecruitingManagerPercentGrossMargin(Double value) {
        this.recruitingManagerPercentGrossMargin = value;
    }

    /**
     * Gets the value of the referralFee property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getReferralFee() {
        return referralFee;
    }

    /**
     * Sets the value of the referralFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setReferralFee(BigDecimal value) {
        this.referralFee = value;
    }

    /**
     * Gets the value of the referralFeeType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferralFeeType() {
        return referralFeeType;
    }

    /**
     * Sets the value of the referralFeeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferralFeeType(String value) {
        this.referralFeeType = value;
    }

    /**
     * Gets the value of the reportTo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReportTo() {
        return reportTo;
    }

    /**
     * Sets the value of the reportTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReportTo(String value) {
        this.reportTo = value;
    }

    /**
     * Gets the value of the requestCustomDate1 property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRequestCustomDate1() {
        return requestCustomDate1;
    }

    /**
     * Sets the value of the requestCustomDate1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRequestCustomDate1(XMLGregorianCalendar value) {
        this.requestCustomDate1 = value;
    }

    /**
     * Gets the value of the requestCustomDate2 property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRequestCustomDate2() {
        return requestCustomDate2;
    }

    /**
     * Sets the value of the requestCustomDate2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRequestCustomDate2(XMLGregorianCalendar value) {
        this.requestCustomDate2 = value;
    }

    /**
     * Gets the value of the requestCustomDate3 property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRequestCustomDate3() {
        return requestCustomDate3;
    }

    /**
     * Sets the value of the requestCustomDate3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRequestCustomDate3(XMLGregorianCalendar value) {
        this.requestCustomDate3 = value;
    }

    /**
     * Gets the value of the requestCustomFloat1 property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getRequestCustomFloat1() {
        return requestCustomFloat1;
    }

    /**
     * Sets the value of the requestCustomFloat1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setRequestCustomFloat1(Double value) {
        this.requestCustomFloat1 = value;
    }

    /**
     * Gets the value of the requestCustomFloat2 property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getRequestCustomFloat2() {
        return requestCustomFloat2;
    }

    /**
     * Sets the value of the requestCustomFloat2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setRequestCustomFloat2(Double value) {
        this.requestCustomFloat2 = value;
    }

    /**
     * Gets the value of the requestCustomFloat3 property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getRequestCustomFloat3() {
        return requestCustomFloat3;
    }

    /**
     * Sets the value of the requestCustomFloat3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setRequestCustomFloat3(Double value) {
        this.requestCustomFloat3 = value;
    }

    /**
     * Gets the value of the requestCustomInt1 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRequestCustomInt1() {
        return requestCustomInt1;
    }

    /**
     * Sets the value of the requestCustomInt1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRequestCustomInt1(Integer value) {
        this.requestCustomInt1 = value;
    }

    /**
     * Gets the value of the requestCustomInt2 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRequestCustomInt2() {
        return requestCustomInt2;
    }

    /**
     * Sets the value of the requestCustomInt2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRequestCustomInt2(Integer value) {
        this.requestCustomInt2 = value;
    }

    /**
     * Gets the value of the requestCustomInt3 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRequestCustomInt3() {
        return requestCustomInt3;
    }

    /**
     * Sets the value of the requestCustomInt3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRequestCustomInt3(Integer value) {
        this.requestCustomInt3 = value;
    }

    /**
     * Gets the value of the requestCustomText1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestCustomText1() {
        return requestCustomText1;
    }

    /**
     * Sets the value of the requestCustomText1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestCustomText1(String value) {
        this.requestCustomText1 = value;
    }

    /**
     * Gets the value of the requestCustomText10 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestCustomText10() {
        return requestCustomText10;
    }

    /**
     * Sets the value of the requestCustomText10 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestCustomText10(String value) {
        this.requestCustomText10 = value;
    }

    /**
     * Gets the value of the requestCustomText11 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestCustomText11() {
        return requestCustomText11;
    }

    /**
     * Sets the value of the requestCustomText11 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestCustomText11(String value) {
        this.requestCustomText11 = value;
    }

    /**
     * Gets the value of the requestCustomText12 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestCustomText12() {
        return requestCustomText12;
    }

    /**
     * Sets the value of the requestCustomText12 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestCustomText12(String value) {
        this.requestCustomText12 = value;
    }

    /**
     * Gets the value of the requestCustomText13 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestCustomText13() {
        return requestCustomText13;
    }

    /**
     * Sets the value of the requestCustomText13 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestCustomText13(String value) {
        this.requestCustomText13 = value;
    }

    /**
     * Gets the value of the requestCustomText14 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestCustomText14() {
        return requestCustomText14;
    }

    /**
     * Sets the value of the requestCustomText14 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestCustomText14(String value) {
        this.requestCustomText14 = value;
    }

    /**
     * Gets the value of the requestCustomText15 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestCustomText15() {
        return requestCustomText15;
    }

    /**
     * Sets the value of the requestCustomText15 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestCustomText15(String value) {
        this.requestCustomText15 = value;
    }

    /**
     * Gets the value of the requestCustomText16 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestCustomText16() {
        return requestCustomText16;
    }

    /**
     * Sets the value of the requestCustomText16 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestCustomText16(String value) {
        this.requestCustomText16 = value;
    }

    /**
     * Gets the value of the requestCustomText17 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestCustomText17() {
        return requestCustomText17;
    }

    /**
     * Sets the value of the requestCustomText17 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestCustomText17(String value) {
        this.requestCustomText17 = value;
    }

    /**
     * Gets the value of the requestCustomText18 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestCustomText18() {
        return requestCustomText18;
    }

    /**
     * Sets the value of the requestCustomText18 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestCustomText18(String value) {
        this.requestCustomText18 = value;
    }

    /**
     * Gets the value of the requestCustomText19 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestCustomText19() {
        return requestCustomText19;
    }

    /**
     * Sets the value of the requestCustomText19 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestCustomText19(String value) {
        this.requestCustomText19 = value;
    }

    /**
     * Gets the value of the requestCustomText2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestCustomText2() {
        return requestCustomText2;
    }

    /**
     * Sets the value of the requestCustomText2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestCustomText2(String value) {
        this.requestCustomText2 = value;
    }

    /**
     * Gets the value of the requestCustomText20 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestCustomText20() {
        return requestCustomText20;
    }

    /**
     * Sets the value of the requestCustomText20 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestCustomText20(String value) {
        this.requestCustomText20 = value;
    }

    /**
     * Gets the value of the requestCustomText3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestCustomText3() {
        return requestCustomText3;
    }

    /**
     * Sets the value of the requestCustomText3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestCustomText3(String value) {
        this.requestCustomText3 = value;
    }

    /**
     * Gets the value of the requestCustomText4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestCustomText4() {
        return requestCustomText4;
    }

    /**
     * Sets the value of the requestCustomText4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestCustomText4(String value) {
        this.requestCustomText4 = value;
    }

    /**
     * Gets the value of the requestCustomText5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestCustomText5() {
        return requestCustomText5;
    }

    /**
     * Sets the value of the requestCustomText5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestCustomText5(String value) {
        this.requestCustomText5 = value;
    }

    /**
     * Gets the value of the requestCustomText6 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestCustomText6() {
        return requestCustomText6;
    }

    /**
     * Sets the value of the requestCustomText6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestCustomText6(String value) {
        this.requestCustomText6 = value;
    }

    /**
     * Gets the value of the requestCustomText7 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestCustomText7() {
        return requestCustomText7;
    }

    /**
     * Sets the value of the requestCustomText7 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestCustomText7(String value) {
        this.requestCustomText7 = value;
    }

    /**
     * Gets the value of the requestCustomText8 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestCustomText8() {
        return requestCustomText8;
    }

    /**
     * Sets the value of the requestCustomText8 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestCustomText8(String value) {
        this.requestCustomText8 = value;
    }

    /**
     * Gets the value of the requestCustomText9 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestCustomText9() {
        return requestCustomText9;
    }

    /**
     * Sets the value of the requestCustomText9 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestCustomText9(String value) {
        this.requestCustomText9 = value;
    }

    /**
     * Gets the value of the requestCustomTextBlock1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestCustomTextBlock1() {
        return requestCustomTextBlock1;
    }

    /**
     * Sets the value of the requestCustomTextBlock1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestCustomTextBlock1(String value) {
        this.requestCustomTextBlock1 = value;
    }

    /**
     * Gets the value of the requestCustomTextBlock2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestCustomTextBlock2() {
        return requestCustomTextBlock2;
    }

    /**
     * Sets the value of the requestCustomTextBlock2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestCustomTextBlock2(String value) {
        this.requestCustomTextBlock2 = value;
    }

    /**
     * Gets the value of the requestCustomTextBlock3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestCustomTextBlock3() {
        return requestCustomTextBlock3;
    }

    /**
     * Sets the value of the requestCustomTextBlock3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestCustomTextBlock3(String value) {
        this.requestCustomTextBlock3 = value;
    }

    /**
     * Gets the value of the requestCustomTextBlock4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestCustomTextBlock4() {
        return requestCustomTextBlock4;
    }

    /**
     * Sets the value of the requestCustomTextBlock4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestCustomTextBlock4(String value) {
        this.requestCustomTextBlock4 = value;
    }

    /**
     * Gets the value of the requestCustomTextBlock5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestCustomTextBlock5() {
        return requestCustomTextBlock5;
    }

    /**
     * Sets the value of the requestCustomTextBlock5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestCustomTextBlock5(String value) {
        this.requestCustomTextBlock5 = value;
    }

    /**
     * Gets the value of the requestStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestStatus() {
        return requestStatus;
    }

    /**
     * Sets the value of the requestStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestStatus(String value) {
        this.requestStatus = value;
    }

    /**
     * Gets the value of the requestType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestType() {
        return requestType;
    }

    /**
     * Sets the value of the requestType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestType(String value) {
        this.requestType = value;
    }

    /**
     * Gets the value of the requestingUserID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRequestingUserID() {
        return requestingUserID;
    }

    /**
     * Sets the value of the requestingUserID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRequestingUserID(Integer value) {
        this.requestingUserID = value;
    }

    /**
     * Gets the value of the salary property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSalary() {
        return salary;
    }

    /**
     * Sets the value of the salary property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSalary(BigDecimal value) {
        this.salary = value;
    }

    /**
     * Gets the value of the salaryUnit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalaryUnit() {
        return salaryUnit;
    }

    /**
     * Sets the value of the salaryUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalaryUnit(String value) {
        this.salaryUnit = value;
    }

    /**
     * Gets the value of the salesManagerPercentGrossMargin property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getSalesManagerPercentGrossMargin() {
        return salesManagerPercentGrossMargin;
    }

    /**
     * Sets the value of the salesManagerPercentGrossMargin property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setSalesManagerPercentGrossMargin(Double value) {
        this.salesManagerPercentGrossMargin = value;
    }

    /**
     * Gets the value of the statementClientContactID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getStatementClientContactID() {
        return statementClientContactID;
    }

    /**
     * Sets the value of the statementClientContactID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setStatementClientContactID(Integer value) {
        this.statementClientContactID = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the terminationReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTerminationReason() {
        return terminationReason;
    }

    /**
     * Sets the value of the terminationReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTerminationReason(String value) {
        this.terminationReason = value;
    }

    /**
     * Gets the value of the vendorClientCorporationID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getVendorClientCorporationID() {
        return vendorClientCorporationID;
    }

    /**
     * Sets the value of the vendorClientCorporationID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setVendorClientCorporationID(Integer value) {
        this.vendorClientCorporationID = value;
    }

    /**
     * Gets the value of the workWeekStart property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getWorkWeekStart() {
        return workWeekStart;
    }

    /**
     * Sets the value of the workWeekStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setWorkWeekStart(Integer value) {
        this.workWeekStart = value;
    }

    /**
     * Gets the value of the workersCompRateID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getWorkersCompRateID() {
        return workersCompRateID;
    }

    /**
     * Sets the value of the workersCompRateID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setWorkersCompRateID(Integer value) {
        this.workersCompRateID = value;
    }

}
