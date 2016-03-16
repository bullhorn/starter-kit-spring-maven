package com.client.core.soap.tools.property.setdtofields.impl;

import java.util.Map;

import org.springframework.stereotype.Service;

import com.bullhorn.entity.job.PlacementChangeRequestDto;
import com.client.core.soap.tools.property.setdtofields.DtoFieldSetService;
import com.client.core.base.util.Utility;

@Service("placementChangeRequestSetService")
public class PlacementChangeRequestDtoFieldSetService extends DtoFieldSetService<PlacementChangeRequestDto> {
	
	public PlacementChangeRequestDtoFieldSetService() {
		super();
	}

	@Override
	public PlacementChangeRequestDto changeDto(PlacementChangeRequestDto placementChangeRequest, Map<String, String> fieldValues, 
			String dateFormat, Boolean isDotPrefixed) {
		for(String initialField : fieldValues.keySet()) {
			String value = fieldValues.get(initialField);

			String field = initialField;
			if(isDotPrefixed) {
				field = removeDotPrefix(initialField);
			}

			if(field.equalsIgnoreCase(APPROVINGUSERID)) {

				placementChangeRequest.setApprovingUserID(Utility.forceParseInteger(value));

			} else if(field.equalsIgnoreCase(BILLINGCLIENTCONTACTID)) {

				placementChangeRequest.setBillingClientContactID(Utility.forceParseInteger(value));

			} else if(field.equalsIgnoreCase(BILLINGFREQUENCY)) {

				placementChangeRequest.setBillingFrequency(value);

			} else if(field.equalsIgnoreCase(BONUSPACKAGE)) {

				placementChangeRequest.setBonusPackage(value);

			} else if(field.equalsIgnoreCase(CLIENTBILLRATE)) {

				placementChangeRequest.setClientBillRate(Utility.forceParseDouble(value));

			} else if(field.equalsIgnoreCase(CLIENTOVERTIMERATE)) {

				placementChangeRequest.setClientOvertimeRate(Utility.forceParseDouble(value));

			} else if(field.equalsIgnoreCase(COMMENTS)) {

				placementChangeRequest.setComments(value);

			} else if(field.equalsIgnoreCase(CORRELATEDCUSTOMDATE1)) {

				placementChangeRequest.setCorrelatedCustomDate1(Utility.forceParseStringToXMLGregorianCalendar(value, dateFormat));

			} else if(field.equalsIgnoreCase(CORRELATEDCUSTOMDATE2)) {

				placementChangeRequest.setCorrelatedCustomDate2(Utility.forceParseStringToXMLGregorianCalendar(value, dateFormat));

			} else if(field.equalsIgnoreCase(CORRELATEDCUSTOMDATE3)) {

				placementChangeRequest.setCorrelatedCustomDate3(Utility.forceParseStringToXMLGregorianCalendar(value, dateFormat));

			} else if(field.equalsIgnoreCase(CORRELATEDCUSTOMFLOAT1)) {

				placementChangeRequest.setCorrelatedCustomFloat1(Utility.forceParseDouble(value));

			} else if(field.equalsIgnoreCase(CORRELATEDCUSTOMFLOAT2)) {

				placementChangeRequest.setCorrelatedCustomFloat2(Utility.forceParseDouble(value));

			} else if(field.equalsIgnoreCase(CORRELATEDCUSTOMFLOAT3)) {

				placementChangeRequest.setCorrelatedCustomFloat3(Utility.forceParseDouble(value));

			} else if(field.equalsIgnoreCase(CORRELATEDCUSTOMINT1)) {

				placementChangeRequest.setCorrelatedCustomInt1(Utility.forceParseInteger(value));

			} else if(field.equalsIgnoreCase(CORRELATEDCUSTOMINT2)) {

				placementChangeRequest.setCorrelatedCustomInt2(Utility.forceParseInteger(value));

			} else if(field.equalsIgnoreCase(CORRELATEDCUSTOMINT3)) {

				placementChangeRequest.setCorrelatedCustomInt3(Utility.forceParseInteger(value));

			} else if(field.equalsIgnoreCase(CORRELATEDCUSTOMTEXT1)) {

				placementChangeRequest.setCorrelatedCustomText1(value);

			} else if(field.equalsIgnoreCase(CORRELATEDCUSTOMTEXT10)) {

				placementChangeRequest.setCorrelatedCustomText10(value);

			} else if(field.equalsIgnoreCase(CORRELATEDCUSTOMTEXT2)) {

				placementChangeRequest.setCorrelatedCustomText2(value);

			} else if(field.equalsIgnoreCase(CORRELATEDCUSTOMTEXT3)) {

				placementChangeRequest.setCorrelatedCustomText3(value);

			} else if(field.equalsIgnoreCase(CORRELATEDCUSTOMTEXT4)) {

				placementChangeRequest.setCorrelatedCustomText4(value);

			} else if(field.equalsIgnoreCase(CORRELATEDCUSTOMTEXT5)) {

				placementChangeRequest.setCorrelatedCustomText5(value);

			} else if(field.equalsIgnoreCase(CORRELATEDCUSTOMTEXT6)) {

				placementChangeRequest.setCorrelatedCustomText6(value);

			} else if(field.equalsIgnoreCase(CORRELATEDCUSTOMTEXT7)) {

				placementChangeRequest.setCorrelatedCustomText7(value);

			} else if(field.equalsIgnoreCase(CORRELATEDCUSTOMTEXT8)) {

				placementChangeRequest.setCorrelatedCustomText8(value);

			} else if(field.equalsIgnoreCase(CORRELATEDCUSTOMTEXT9)) {

				placementChangeRequest.setCorrelatedCustomText9(value);

			} else if(field.equalsIgnoreCase(CORRELATEDCUSTOMTEXTBLOCK1)) {

				placementChangeRequest.setCorrelatedCustomTextBlock1(value);

			} else if(field.equalsIgnoreCase(CORRELATEDCUSTOMTEXTBLOCK2)) {

				placementChangeRequest.setCorrelatedCustomTextBlock2(value);

			} else if(field.equalsIgnoreCase(CORRELATEDCUSTOMTEXTBLOCK3)) {

				placementChangeRequest.setCorrelatedCustomTextBlock3(value);

			} else if(field.equalsIgnoreCase(COSTCENTER)) {

				placementChangeRequest.setCostCenter(value);

			} else if(field.equalsIgnoreCase(CUSTOMBILLRATE1)) {

				placementChangeRequest.setCustomBillRate1(Utility.forceParseBigDecimal(value));

			} else if(field.equalsIgnoreCase(CUSTOMBILLRATE10)) {

				placementChangeRequest.setCustomBillRate10(Utility.forceParseBigDecimal(value));

			} else if(field.equalsIgnoreCase(CUSTOMBILLRATE2)) {

				placementChangeRequest.setCustomBillRate2(Utility.forceParseBigDecimal(value));

			} else if(field.equalsIgnoreCase(CUSTOMBILLRATE3)) {

				placementChangeRequest.setCustomBillRate3(Utility.forceParseBigDecimal(value));

			} else if(field.equalsIgnoreCase(CUSTOMBILLRATE4)) {

				placementChangeRequest.setCustomBillRate4(Utility.forceParseBigDecimal(value));

			} else if(field.equalsIgnoreCase(CUSTOMBILLRATE5)) {

				placementChangeRequest.setCustomBillRate5(Utility.forceParseBigDecimal(value));

			} else if(field.equalsIgnoreCase(CUSTOMBILLRATE6)) {

				placementChangeRequest.setCustomBillRate6(Utility.forceParseBigDecimal(value));

			} else if(field.equalsIgnoreCase(CUSTOMBILLRATE7)) {

				placementChangeRequest.setCustomBillRate7(Utility.forceParseBigDecimal(value));

			} else if(field.equalsIgnoreCase(CUSTOMBILLRATE8)) {

				placementChangeRequest.setCustomBillRate8(Utility.forceParseBigDecimal(value));

			} else if(field.equalsIgnoreCase(CUSTOMBILLRATE9)) {

				placementChangeRequest.setCustomBillRate9(Utility.forceParseBigDecimal(value));

			} else if(field.equalsIgnoreCase(CUSTOMDATE1)) {

				placementChangeRequest.setCustomDate1(Utility.forceParseStringToXMLGregorianCalendar(value, dateFormat));

			} else if(field.equalsIgnoreCase(CUSTOMDATE2)) {

				placementChangeRequest.setCustomDate2(Utility.forceParseStringToXMLGregorianCalendar(value, dateFormat));

			} else if(field.equalsIgnoreCase(CUSTOMDATE3)) {

				placementChangeRequest.setCustomDate3(Utility.forceParseStringToXMLGregorianCalendar(value, dateFormat));

			} else if(field.equalsIgnoreCase(CUSTOMFLOAT1)) {

				placementChangeRequest.setCustomFloat1(Utility.forceParseDouble(value));

			} else if(field.equalsIgnoreCase(CUSTOMFLOAT2)) {

				placementChangeRequest.setCustomFloat2(Utility.forceParseDouble(value));

			} else if(field.equalsIgnoreCase(CUSTOMFLOAT3)) {

				placementChangeRequest.setCustomFloat3(Utility.forceParseDouble(value));

			} else if(field.equalsIgnoreCase(CUSTOMINT1)) {

				placementChangeRequest.setCustomInt1(Utility.forceParseInteger(value));

			} else if(field.equalsIgnoreCase(CUSTOMINT2)) {

				placementChangeRequest.setCustomInt2(Utility.forceParseInteger(value));

			} else if(field.equalsIgnoreCase(CUSTOMINT3)) {

				placementChangeRequest.setCustomInt3(Utility.forceParseInteger(value));

			} else if(field.equalsIgnoreCase(CUSTOMPAYRATE1)) {

				placementChangeRequest.setCustomPayRate1(Utility.forceParseBigDecimal(value));

			} else if(field.equalsIgnoreCase(CUSTOMPAYRATE10)) {

				placementChangeRequest.setCustomPayRate10(Utility.forceParseBigDecimal(value));

			} else if(field.equalsIgnoreCase(CUSTOMPAYRATE2)) {

				placementChangeRequest.setCustomPayRate2(Utility.forceParseBigDecimal(value));

			} else if(field.equalsIgnoreCase(CUSTOMPAYRATE3)) {

				placementChangeRequest.setCustomPayRate3(Utility.forceParseBigDecimal(value));

			} else if(field.equalsIgnoreCase(CUSTOMPAYRATE4)) {

				placementChangeRequest.setCustomPayRate4(Utility.forceParseBigDecimal(value));

			} else if(field.equalsIgnoreCase(CUSTOMPAYRATE5)) {

				placementChangeRequest.setCustomPayRate5(Utility.forceParseBigDecimal(value));

			} else if(field.equalsIgnoreCase(CUSTOMPAYRATE6)) {

				placementChangeRequest.setCustomPayRate6(Utility.forceParseBigDecimal(value));

			} else if(field.equalsIgnoreCase(CUSTOMPAYRATE7)) {

				placementChangeRequest.setCustomPayRate7(Utility.forceParseBigDecimal(value));

			} else if(field.equalsIgnoreCase(CUSTOMPAYRATE8)) {

				placementChangeRequest.setCustomPayRate8(Utility.forceParseBigDecimal(value));

			} else if(field.equalsIgnoreCase(CUSTOMPAYRATE9)) {

				placementChangeRequest.setCustomPayRate9(Utility.forceParseBigDecimal(value));

			} else if(field.equalsIgnoreCase(CUSTOMTEXT1)) {

				placementChangeRequest.setCustomText1(value);

			} else if(field.equalsIgnoreCase(CUSTOMTEXT10)) {

				placementChangeRequest.setCustomText10(value);

			} else if(field.equalsIgnoreCase(CUSTOMTEXT11)) {

				placementChangeRequest.setCustomText11(value);

			} else if(field.equalsIgnoreCase(CUSTOMTEXT12)) {

				placementChangeRequest.setCustomText12(value);

			} else if(field.equalsIgnoreCase(CUSTOMTEXT13)) {

				placementChangeRequest.setCustomText13(value);

			} else if(field.equalsIgnoreCase(CUSTOMTEXT14)) {

				placementChangeRequest.setCustomText14(value);

			} else if(field.equalsIgnoreCase(CUSTOMTEXT15)) {

				placementChangeRequest.setCustomText15(value);

			} else if(field.equalsIgnoreCase(CUSTOMTEXT16)) {

				placementChangeRequest.setCustomText16(value);

			} else if(field.equalsIgnoreCase(CUSTOMTEXT17)) {

				placementChangeRequest.setCustomText17(value);

			} else if(field.equalsIgnoreCase(CUSTOMTEXT18)) {

				placementChangeRequest.setCustomText18(value);

			} else if(field.equalsIgnoreCase(CUSTOMTEXT19)) {

				placementChangeRequest.setCustomText19(value);

			} else if(field.equalsIgnoreCase(CUSTOMTEXT2)) {

				placementChangeRequest.setCustomText2(value);

			} else if(field.equalsIgnoreCase(CUSTOMTEXT20)) {

				placementChangeRequest.setCustomText20(value);

			} else if(field.equalsIgnoreCase(CUSTOMTEXT21)) {

				placementChangeRequest.setCustomText21(value);

			} else if(field.equalsIgnoreCase(CUSTOMTEXT22)) {

				placementChangeRequest.setCustomText22(value);

			} else if(field.equalsIgnoreCase(CUSTOMTEXT23)) {

				placementChangeRequest.setCustomText23(value);

			} else if(field.equalsIgnoreCase(CUSTOMTEXT24)) {

				placementChangeRequest.setCustomText24(value);

			} else if(field.equalsIgnoreCase(CUSTOMTEXT25)) {

				placementChangeRequest.setCustomText25(value);

			} else if(field.equalsIgnoreCase(CUSTOMTEXT26)) {

				placementChangeRequest.setCustomText26(value);

			} else if(field.equalsIgnoreCase(CUSTOMTEXT27)) {

				placementChangeRequest.setCustomText27(value);

			} else if(field.equalsIgnoreCase(CUSTOMTEXT28)) {

				placementChangeRequest.setCustomText28(value);

			} else if(field.equalsIgnoreCase(CUSTOMTEXT29)) {

				placementChangeRequest.setCustomText29(value);

			} else if(field.equalsIgnoreCase(CUSTOMTEXT3)) {

				placementChangeRequest.setCustomText3(value);

			} else if(field.equalsIgnoreCase(CUSTOMTEXT30)) {

				placementChangeRequest.setCustomText30(value);

			} else if(field.equalsIgnoreCase(CUSTOMTEXT31)) {

				placementChangeRequest.setCustomText31(value);

			} else if(field.equalsIgnoreCase(CUSTOMTEXT32)) {

				placementChangeRequest.setCustomText32(value);

			} else if(field.equalsIgnoreCase(CUSTOMTEXT33)) {

				placementChangeRequest.setCustomText33(value);

			} else if(field.equalsIgnoreCase(CUSTOMTEXT34)) {

				placementChangeRequest.setCustomText34(value);

			} else if(field.equalsIgnoreCase(CUSTOMTEXT35)) {

				placementChangeRequest.setCustomText35(value);

			} else if(field.equalsIgnoreCase(CUSTOMTEXT36)) {

				placementChangeRequest.setCustomText36(value);

			} else if(field.equalsIgnoreCase(CUSTOMTEXT37)) {

				placementChangeRequest.setCustomText37(value);

			} else if(field.equalsIgnoreCase(CUSTOMTEXT38)) {

				placementChangeRequest.setCustomText38(value);

			} else if(field.equalsIgnoreCase(CUSTOMTEXT39)) {

				placementChangeRequest.setCustomText39(value);

			} else if(field.equalsIgnoreCase(CUSTOMTEXT4)) {

				placementChangeRequest.setCustomText4(value);

			} else if(field.equalsIgnoreCase(CUSTOMTEXT40)) {

				placementChangeRequest.setCustomText40(value);

			} else if(field.equalsIgnoreCase(CUSTOMTEXT5)) {

				placementChangeRequest.setCustomText5(value);

			} else if(field.equalsIgnoreCase(CUSTOMTEXT6)) {

				placementChangeRequest.setCustomText6(value);

			} else if(field.equalsIgnoreCase(CUSTOMTEXT7)) {

				placementChangeRequest.setCustomText7(value);

			} else if(field.equalsIgnoreCase(CUSTOMTEXT8)) {

				placementChangeRequest.setCustomText8(value);

			} else if(field.equalsIgnoreCase(CUSTOMTEXT9)) {

				placementChangeRequest.setCustomText9(value);

			} else if(field.equalsIgnoreCase(CUSTOMTEXTBLOCK1)) {

				placementChangeRequest.setCustomTextBlock1(value);

			} else if(field.equalsIgnoreCase(CUSTOMTEXTBLOCK2)) {

				placementChangeRequest.setCustomTextBlock2(value);

			} else if(field.equalsIgnoreCase(CUSTOMTEXTBLOCK3)) {

				placementChangeRequest.setCustomTextBlock3(value);

			} else if(field.equalsIgnoreCase(CUSTOMTEXTBLOCK4)) {

				placementChangeRequest.setCustomTextBlock4(value);

			} else if(field.equalsIgnoreCase(CUSTOMTEXTBLOCK5)) {

				placementChangeRequest.setCustomTextBlock5(value);

			} else if(field.equalsIgnoreCase(DATEADDED)) {

				placementChangeRequest.setDateAdded(Utility.forceParseStringToXMLGregorianCalendar(value, dateFormat));

			} else if(field.equalsIgnoreCase(DATEAPPROVED)) {

				placementChangeRequest.setDateApproved(Utility.forceParseStringToXMLGregorianCalendar(value, dateFormat));

			} else if(field.equalsIgnoreCase(DATEBEGIN)) {

				placementChangeRequest.setDateBegin(Utility.forceParseStringToXMLGregorianCalendar(value, dateFormat));

			} else if(field.equalsIgnoreCase(DATECLIENTEFFECTIVE)) {

				placementChangeRequest.setDateClientEffective(Utility.forceParseStringToXMLGregorianCalendar(value, dateFormat));

			} else if(field.equalsIgnoreCase(DATEEFFECTIVE)) {

				placementChangeRequest.setDateEffective(Utility.forceParseStringToXMLGregorianCalendar(value, dateFormat));

			} else if(field.equalsIgnoreCase(DATEEND)) {

				placementChangeRequest.setDateEnd(Utility.forceParseStringToXMLGregorianCalendar(value, dateFormat));

			} else if(field.equalsIgnoreCase(DAYSGUARANTEED)) {

				placementChangeRequest.setDaysGuaranteed(Utility.forceParseInteger(value));

			} else if(field.equalsIgnoreCase(DAYSPRORATED)) {

				placementChangeRequest.setDaysProRated(Utility.forceParseInteger(value));

			} else if(field.equalsIgnoreCase(DURATIONWEEKS)) {

				placementChangeRequest.setDurationWeeks(Utility.forceParseDouble(value));

			} else if(field.equalsIgnoreCase(EMPLOYEETYPE)) {

				placementChangeRequest.setEmployeeType(value);

			} else if(field.equalsIgnoreCase(EMPLOYMENTTYPE)) {

				placementChangeRequest.setEmploymentType(value);

			} else if(field.equalsIgnoreCase(FEE)) {

				placementChangeRequest.setFee(Utility.forceParseDouble(value));

			} else if(field.equalsIgnoreCase(HOURSOFOPERATION)) {

				placementChangeRequest.setHoursOfOperation(value);

			} else if(field.equalsIgnoreCase(HOURSPERDAY)) {

				placementChangeRequest.setHoursPerDay(Utility.forceParseDouble(value));

			} else if(field.equalsIgnoreCase(HOUSINGMANAGERID)) {

				placementChangeRequest.setHousingManagerID(Utility.forceParseInteger(value));

			} else if(field.equalsIgnoreCase(HOUSINGSTATUS)) {

				placementChangeRequest.setHousingStatus(value);

			} else if(field.equalsIgnoreCase(MIGRATEGUID)) {

				placementChangeRequest.setMigrateGUID(value);

			} else if(field.equalsIgnoreCase(OPTIONSPACKAGE)) {

				placementChangeRequest.setOptionsPackage(value);

			} else if(field.equalsIgnoreCase(OTEXEMPTION)) {

				placementChangeRequest.setOtExemption(Utility.forceParseInteger(value));

			} else if(field.equalsIgnoreCase(OTHERHOURLYFEE)) {

				placementChangeRequest.setOtherHourlyFee(Utility.forceParseDouble(value));

			} else if(field.equalsIgnoreCase(OTHERHOURLYFEECOMMENTS)) {

				placementChangeRequest.setOtherHourlyFeeComments(value);

			} else if(field.equalsIgnoreCase(OVERTIMERATE)) {

				placementChangeRequest.setOvertimeRate(Utility.forceParseDouble(value));

			} else if(field.equalsIgnoreCase(PAYRATE)) {

				placementChangeRequest.setPayRate(Utility.forceParseBigDecimal(value));

			} else if(field.equalsIgnoreCase(PLACEMENTCHANGEREQUESTID)) {

				placementChangeRequest.setPlacementChangeRequestID(Utility.forceParseInteger(value));

			} else if(field.equalsIgnoreCase(PLACEMENTID)) {

				placementChangeRequest.setPlacementID(Utility.forceParseInteger(value));

			} else if(field.equalsIgnoreCase(RECRUITINGMANAGERPERCENTGROSSMARGIN)) {

				placementChangeRequest.setRecruitingManagerPercentGrossMargin(Utility.forceParseDouble(value));

			} else if(field.equalsIgnoreCase(REFERRALFEE)) {

				placementChangeRequest.setReferralFee(Utility.forceParseBigDecimal(value));

			} else if(field.equalsIgnoreCase(REFERRALFEETYPE)) {

				placementChangeRequest.setReferralFeeType(value);

			} else if(field.equalsIgnoreCase(REPORTTO)) {

				placementChangeRequest.setReportTo(value);

			} else if(field.equalsIgnoreCase(REQUESTCUSTOMDATE1)) {

				placementChangeRequest.setRequestCustomDate1(Utility.forceParseStringToXMLGregorianCalendar(value, dateFormat));

			} else if(field.equalsIgnoreCase(REQUESTCUSTOMDATE2)) {

				placementChangeRequest.setRequestCustomDate2(Utility.forceParseStringToXMLGregorianCalendar(value, dateFormat));

			} else if(field.equalsIgnoreCase(REQUESTCUSTOMDATE3)) {

				placementChangeRequest.setRequestCustomDate3(Utility.forceParseStringToXMLGregorianCalendar(value, dateFormat));

			} else if(field.equalsIgnoreCase(REQUESTCUSTOMFLOAT1)) {

				placementChangeRequest.setRequestCustomFloat1(Utility.forceParseDouble(value));

			} else if(field.equalsIgnoreCase(REQUESTCUSTOMFLOAT2)) {

				placementChangeRequest.setRequestCustomFloat2(Utility.forceParseDouble(value));

			} else if(field.equalsIgnoreCase(REQUESTCUSTOMFLOAT3)) {

				placementChangeRequest.setRequestCustomFloat3(Utility.forceParseDouble(value));

			} else if(field.equalsIgnoreCase(REQUESTCUSTOMINT1)) {

				placementChangeRequest.setRequestCustomInt1(Utility.forceParseInteger(value));

			} else if(field.equalsIgnoreCase(REQUESTCUSTOMINT2)) {

				placementChangeRequest.setRequestCustomInt2(Utility.forceParseInteger(value));

			} else if(field.equalsIgnoreCase(REQUESTCUSTOMINT3)) {

				placementChangeRequest.setRequestCustomInt3(Utility.forceParseInteger(value));

			} else if(field.equalsIgnoreCase(REQUESTCUSTOMTEXT1)) {

				placementChangeRequest.setRequestCustomText1(value);

			} else if(field.equalsIgnoreCase(REQUESTCUSTOMTEXT10)) {

				placementChangeRequest.setRequestCustomText10(value);

			} else if(field.equalsIgnoreCase(REQUESTCUSTOMTEXT11)) {

				placementChangeRequest.setRequestCustomText11(value);

			} else if(field.equalsIgnoreCase(REQUESTCUSTOMTEXT12)) {

				placementChangeRequest.setRequestCustomText12(value);

			} else if(field.equalsIgnoreCase(REQUESTCUSTOMTEXT13)) {

				placementChangeRequest.setRequestCustomText13(value);

			} else if(field.equalsIgnoreCase(REQUESTCUSTOMTEXT14)) {

				placementChangeRequest.setRequestCustomText14(value);

			} else if(field.equalsIgnoreCase(REQUESTCUSTOMTEXT15)) {

				placementChangeRequest.setRequestCustomText15(value);

			} else if(field.equalsIgnoreCase(REQUESTCUSTOMTEXT16)) {

				placementChangeRequest.setRequestCustomText16(value);

			} else if(field.equalsIgnoreCase(REQUESTCUSTOMTEXT17)) {

				placementChangeRequest.setRequestCustomText17(value);

			} else if(field.equalsIgnoreCase(REQUESTCUSTOMTEXT18)) {

				placementChangeRequest.setRequestCustomText18(value);

			} else if(field.equalsIgnoreCase(REQUESTCUSTOMTEXT19)) {

				placementChangeRequest.setRequestCustomText19(value);

			} else if(field.equalsIgnoreCase(REQUESTCUSTOMTEXT2)) {

				placementChangeRequest.setRequestCustomText2(value);

			} else if(field.equalsIgnoreCase(REQUESTCUSTOMTEXT20)) {

				placementChangeRequest.setRequestCustomText20(value);

			} else if(field.equalsIgnoreCase(REQUESTCUSTOMTEXT3)) {

				placementChangeRequest.setRequestCustomText3(value);

			} else if(field.equalsIgnoreCase(REQUESTCUSTOMTEXT4)) {

				placementChangeRequest.setRequestCustomText4(value);

			} else if(field.equalsIgnoreCase(REQUESTCUSTOMTEXT5)) {

				placementChangeRequest.setRequestCustomText5(value);

			} else if(field.equalsIgnoreCase(REQUESTCUSTOMTEXT6)) {

				placementChangeRequest.setRequestCustomText6(value);

			} else if(field.equalsIgnoreCase(REQUESTCUSTOMTEXT7)) {

				placementChangeRequest.setRequestCustomText7(value);

			} else if(field.equalsIgnoreCase(REQUESTCUSTOMTEXT8)) {

				placementChangeRequest.setRequestCustomText8(value);

			} else if(field.equalsIgnoreCase(REQUESTCUSTOMTEXT9)) {

				placementChangeRequest.setRequestCustomText9(value);

			} else if(field.equalsIgnoreCase(REQUESTCUSTOMTEXTBLOCK1)) {

				placementChangeRequest.setRequestCustomTextBlock1(value);

			} else if(field.equalsIgnoreCase(REQUESTCUSTOMTEXTBLOCK2)) {

				placementChangeRequest.setRequestCustomTextBlock2(value);

			} else if(field.equalsIgnoreCase(REQUESTCUSTOMTEXTBLOCK3)) {

				placementChangeRequest.setRequestCustomTextBlock3(value);

			} else if(field.equalsIgnoreCase(REQUESTCUSTOMTEXTBLOCK4)) {

				placementChangeRequest.setRequestCustomTextBlock4(value);

			} else if(field.equalsIgnoreCase(REQUESTCUSTOMTEXTBLOCK5)) {

				placementChangeRequest.setRequestCustomTextBlock5(value);

			} else if(field.equalsIgnoreCase(REQUESTSTATUS)) {

				placementChangeRequest.setRequestStatus(value);

			} else if(field.equalsIgnoreCase(REQUESTTYPE)) {

				placementChangeRequest.setRequestType(value);

			} else if(field.equalsIgnoreCase(REQUESTINGUSERID)) {

				placementChangeRequest.setRequestingUserID(Utility.forceParseInteger(value));

			} else if(field.equalsIgnoreCase(SALARY)) {

				placementChangeRequest.setSalary(Utility.forceParseBigDecimal(value));

			} else if(field.equalsIgnoreCase(SALARYUNIT)) {

				placementChangeRequest.setSalaryUnit(value);

			} else if(field.equalsIgnoreCase(SALESMANAGERPERCENTGROSSMARGIN)) {

				placementChangeRequest.setSalesManagerPercentGrossMargin(Utility.forceParseDouble(value));

			} else if(field.equalsIgnoreCase(STATEMENTCLIENTCONTACTID)) {

				placementChangeRequest.setStatementClientContactID(Utility.forceParseInteger(value));

			} else if(field.equalsIgnoreCase(STATUS)) {

				placementChangeRequest.setStatus(value);

			} else if(field.equalsIgnoreCase(TERMINATIONREASON)) {

				placementChangeRequest.setTerminationReason(value);

			} else if(field.equalsIgnoreCase(VENDORCLIENTCORPORATIONID)) {

				placementChangeRequest.setVendorClientCorporationID(Utility.forceParseInteger(value));

			} else if(field.equalsIgnoreCase(WORKWEEKSTART)) {

				placementChangeRequest.setWorkWeekStart(Utility.forceParseInteger(value));

			} else if(field.equalsIgnoreCase(WORKERSCOMPRATEID)) {

				placementChangeRequest.setWorkersCompRateID(Utility.forceParseInteger(value));

			}
		}
		return placementChangeRequest;
	}

	private String APPROVINGUSERID="approvingUserID";
	private String BILLINGCLIENTCONTACTID="billingClientContactID";
	private String BILLINGFREQUENCY="billingFrequency";
	private String BONUSPACKAGE="bonusPackage";
	private String CLIENTBILLRATE="clientBillRate";
	private String CLIENTOVERTIMERATE="clientOvertimeRate";
	private String COMMENTS="comments";
	private String CORRELATEDCUSTOMDATE1="correlatedCustomDate1";
	private String CORRELATEDCUSTOMDATE2="correlatedCustomDate2";
	private String CORRELATEDCUSTOMDATE3="correlatedCustomDate3";
	private String CORRELATEDCUSTOMFLOAT1="correlatedCustomFloat1";
	private String CORRELATEDCUSTOMFLOAT2="correlatedCustomFloat2";
	private String CORRELATEDCUSTOMFLOAT3="correlatedCustomFloat3";
	private String CORRELATEDCUSTOMINT1="correlatedCustomInt1";
	private String CORRELATEDCUSTOMINT2="correlatedCustomInt2";
	private String CORRELATEDCUSTOMINT3="correlatedCustomInt3";
	private String CORRELATEDCUSTOMTEXT1="correlatedCustomText1";
	private String CORRELATEDCUSTOMTEXT10="correlatedCustomText10";
	private String CORRELATEDCUSTOMTEXT2="correlatedCustomText2";
	private String CORRELATEDCUSTOMTEXT3="correlatedCustomText3";
	private String CORRELATEDCUSTOMTEXT4="correlatedCustomText4";
	private String CORRELATEDCUSTOMTEXT5="correlatedCustomText5";
	private String CORRELATEDCUSTOMTEXT6="correlatedCustomText6";
	private String CORRELATEDCUSTOMTEXT7="correlatedCustomText7";
	private String CORRELATEDCUSTOMTEXT8="correlatedCustomText8";
	private String CORRELATEDCUSTOMTEXT9="correlatedCustomText9";
	private String CORRELATEDCUSTOMTEXTBLOCK1="correlatedCustomTextBlock1";
	private String CORRELATEDCUSTOMTEXTBLOCK2="correlatedCustomTextBlock2";
	private String CORRELATEDCUSTOMTEXTBLOCK3="correlatedCustomTextBlock3";
	private String COSTCENTER="costCenter";
	private String CUSTOMBILLRATE1="customBillRate1";
	private String CUSTOMBILLRATE10="customBillRate10";
	private String CUSTOMBILLRATE2="customBillRate2";
	private String CUSTOMBILLRATE3="customBillRate3";
	private String CUSTOMBILLRATE4="customBillRate4";
	private String CUSTOMBILLRATE5="customBillRate5";
	private String CUSTOMBILLRATE6="customBillRate6";
	private String CUSTOMBILLRATE7="customBillRate7";
	private String CUSTOMBILLRATE8="customBillRate8";
	private String CUSTOMBILLRATE9="customBillRate9";
	private String CUSTOMDATE1="customDate1";
	private String CUSTOMDATE2="customDate2";
	private String CUSTOMDATE3="customDate3";
	private String CUSTOMFLOAT1="customFloat1";
	private String CUSTOMFLOAT2="customFloat2";
	private String CUSTOMFLOAT3="customFloat3";
	private String CUSTOMINT1="customInt1";
	private String CUSTOMINT2="customInt2";
	private String CUSTOMINT3="customInt3";
	private String CUSTOMPAYRATE1="customPayRate1";
	private String CUSTOMPAYRATE10="customPayRate10";
	private String CUSTOMPAYRATE2="customPayRate2";
	private String CUSTOMPAYRATE3="customPayRate3";
	private String CUSTOMPAYRATE4="customPayRate4";
	private String CUSTOMPAYRATE5="customPayRate5";
	private String CUSTOMPAYRATE6="customPayRate6";
	private String CUSTOMPAYRATE7="customPayRate7";
	private String CUSTOMPAYRATE8="customPayRate8";
	private String CUSTOMPAYRATE9="customPayRate9";
	private String CUSTOMTEXT1 = "customText1";
	private String CUSTOMTEXT10 = "customText10";
	private String CUSTOMTEXT11 = "customText11";
	private String CUSTOMTEXT12 = "customText12";
	private String CUSTOMTEXT13 = "customText13";
	private String CUSTOMTEXT14 = "customText14";
	private String CUSTOMTEXT15 = "customText15";
	private String CUSTOMTEXT16 = "customText16";
	private String CUSTOMTEXT17 = "customText17";
	private String CUSTOMTEXT18 = "customText18";
	private String CUSTOMTEXT19 = "customText19";
	private String CUSTOMTEXT2 = "customText2";
	private String CUSTOMTEXT20 = "customText20";
	private String CUSTOMTEXT21 = "customText21";
	private String CUSTOMTEXT22 = "customText22";
	private String CUSTOMTEXT23 = "customText23";
	private String CUSTOMTEXT24 = "customText24";
	private String CUSTOMTEXT25 = "customText25";
	private String CUSTOMTEXT26 = "customText26";
	private String CUSTOMTEXT27 = "customText27";
	private String CUSTOMTEXT28 = "customText28";
	private String CUSTOMTEXT29 = "customText29";
	private String CUSTOMTEXT3 = "customText3";
	private String CUSTOMTEXT30 = "customText30";
	private String CUSTOMTEXT31 = "customText31";
	private String CUSTOMTEXT32 = "customText32";
	private String CUSTOMTEXT33 = "customText33";
	private String CUSTOMTEXT34 = "customText34";
	private String CUSTOMTEXT35 = "customText35";
	private String CUSTOMTEXT36 = "customText36";
	private String CUSTOMTEXT37 = "customText37";
	private String CUSTOMTEXT38 = "customText38";
	private String CUSTOMTEXT39 = "customText39";
	private String CUSTOMTEXT4 = "customText4";
	private String CUSTOMTEXT40 = "customText40";
	private String CUSTOMTEXT5 = "customText5";
	private String CUSTOMTEXT6 = "customText6";
	private String CUSTOMTEXT7 = "customText7";
	private String CUSTOMTEXT8 = "customText8";
	private String CUSTOMTEXT9 = "customText9";
	private String CUSTOMTEXTBLOCK1 = "customTextBlock1";
	private String CUSTOMTEXTBLOCK2 = "customTextBlock2";
	private String CUSTOMTEXTBLOCK3 = "customTextBlock3";
	private String CUSTOMTEXTBLOCK4 = "customTextBlock4";
	private String CUSTOMTEXTBLOCK5 = "customTextBlock5";
	private String DATEADDED="dateAdded";
	private String DATEAPPROVED="dateApproved";
	private String DATEBEGIN="dateBegin";
	private String DATECLIENTEFFECTIVE="dateClientEffective";
	private String DATEEFFECTIVE="dateEffective";
	private String DATEEND="dateEnd";
	private String DAYSGUARANTEED="daysGuaranteed";
	private String DAYSPRORATED="daysProRated";
	private String DURATIONWEEKS="durationWeeks";
	private String EMPLOYEETYPE="employeeType";
	private String EMPLOYMENTTYPE="employmentType";
	private String FEE="fee";
	private String HOURSOFOPERATION="hoursOfOperation";
	private String HOURSPERDAY="hoursPerDay";
	private String HOUSINGMANAGERID="housingManagerID";
	private String HOUSINGSTATUS="housingStatus";
	private String MIGRATEGUID="migrateGUID";
	private String OPTIONSPACKAGE="optionsPackage";
	private String OTEXEMPTION="otExemption";
	private String OTHERHOURLYFEE="otherHourlyFee";
	private String OTHERHOURLYFEECOMMENTS="otherHourlyFeeComments";
	private String OVERTIMERATE="overtimeRate";
	private String PAYRATE="payRate";
	private String PLACEMENTCHANGEREQUESTID="placementChangeRequestID";
	private String PLACEMENTID="placementID";
	private String RECRUITINGMANAGERPERCENTGROSSMARGIN="recruitingManagerPercentGrossMargin";
	private String REFERRALFEE="referralFee";
	private String REFERRALFEETYPE="referralFeeType";
	private String REPORTTO="reportTo";
	private String REQUESTCUSTOMDATE1="requestCustomDate1";
	private String REQUESTCUSTOMDATE2="requestCustomDate2";
	private String REQUESTCUSTOMDATE3="requestCustomDate3";
	private String REQUESTCUSTOMFLOAT1="requestCustomFloat1";
	private String REQUESTCUSTOMFLOAT2="requestCustomFloat2";
	private String REQUESTCUSTOMFLOAT3="requestCustomFloat3";
	private String REQUESTCUSTOMINT1="requestCustomInt1";
	private String REQUESTCUSTOMINT2="requestCustomInt2";
	private String REQUESTCUSTOMINT3="requestCustomInt3";
	private String REQUESTCUSTOMTEXT1="requestCustomText1";
	private String REQUESTCUSTOMTEXT10="requestCustomText10";
	private String REQUESTCUSTOMTEXT11="requestCustomText11";
	private String REQUESTCUSTOMTEXT12="requestCustomText12";
	private String REQUESTCUSTOMTEXT13="requestCustomText13";
	private String REQUESTCUSTOMTEXT14="requestCustomText14";
	private String REQUESTCUSTOMTEXT15="requestCustomText15";
	private String REQUESTCUSTOMTEXT16="requestCustomText16";
	private String REQUESTCUSTOMTEXT17="requestCustomText17";
	private String REQUESTCUSTOMTEXT18="requestCustomText18";
	private String REQUESTCUSTOMTEXT19="requestCustomText19";
	private String REQUESTCUSTOMTEXT2="requestCustomText2";
	private String REQUESTCUSTOMTEXT20="requestCustomText20";
	private String REQUESTCUSTOMTEXT3="requestCustomText3";
	private String REQUESTCUSTOMTEXT4="requestCustomText4";
	private String REQUESTCUSTOMTEXT5="requestCustomText5";
	private String REQUESTCUSTOMTEXT6="requestCustomText6";
	private String REQUESTCUSTOMTEXT7="requestCustomText7";
	private String REQUESTCUSTOMTEXT8="requestCustomText8";
	private String REQUESTCUSTOMTEXT9="requestCustomText9";
	private String REQUESTCUSTOMTEXTBLOCK1="requestCustomTextBlock1";
	private String REQUESTCUSTOMTEXTBLOCK2="requestCustomTextBlock2";
	private String REQUESTCUSTOMTEXTBLOCK3="requestCustomTextBlock3";
	private String REQUESTCUSTOMTEXTBLOCK4="requestCustomTextBlock4";
	private String REQUESTCUSTOMTEXTBLOCK5="requestCustomTextBlock5";
	private String REQUESTSTATUS="requestStatus";
	private String REQUESTTYPE="requestType";
	private String REQUESTINGUSERID="requestingUserID";
	private String SALARY="salary";
	private String SALARYUNIT="salaryUnit";
	private String SALESMANAGERPERCENTGROSSMARGIN="salesManagerPercentGrossMargin";
	private String STATEMENTCLIENTCONTACTID="statementClientContactID";
	private String STATUS="status";
	private String TERMINATIONREASON="terminationReason";
	private String VENDORCLIENTCORPORATIONID="vendorClientCorporationID";
	private String WORKWEEKSTART="workWeekStart";
	private String WORKERSCOMPRATEID="workersCompRateID";

}
