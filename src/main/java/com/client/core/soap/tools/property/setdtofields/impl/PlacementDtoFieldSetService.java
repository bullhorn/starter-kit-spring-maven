package com.client.core.soap.tools.property.setdtofields.impl;

import java.util.Map;

import org.springframework.stereotype.Service;

import com.bullhorn.entity.job.PlacementDto;
import com.client.core.soap.tools.property.setdtofields.DtoFieldSetService;
import com.client.core.base.util.Utility;

@Service("placementSetService")
public class PlacementDtoFieldSetService extends DtoFieldSetService<PlacementDto> {
	
	public PlacementDtoFieldSetService() {
		super();
	}
	
	@Override
	public PlacementDto changeDto(PlacementDto placement, Map<String, String> fieldValues, String dateFormat, Boolean isDotPrefixed) {
		for(String initialField : fieldValues.keySet()) {
			String value = fieldValues.get(initialField);

			String field = initialField;
			if(isDotPrefixed) {
				field = removeDotPrefix(initialField);
			}
			
			if(field.equalsIgnoreCase(APPROVINGCLIENTCONTACTID)) {

				placement.setApprovingClientContactID(Utility.forceParseInteger(value));

		    } else if(field.equalsIgnoreCase(BACKUPAPPROVINGCLIENTCONTACTID)) {

				placement.setBackupApprovingClientContactID(Utility.forceParseInteger(value));

		    } else if(field.equalsIgnoreCase(BILLINGCLIENTCONTACTID)) {

				placement.setBillingClientContactID(Utility.forceParseInteger(value));

		    } else if(field.equalsIgnoreCase(BILLINGFREQUENCY)) {

				placement.setBillingFrequency(value);

		    } else if(field.equalsIgnoreCase(BONUSPACKAGE)) {

				placement.setBonusPackage(value);

		    } else if(field.equalsIgnoreCase(CANDIDATEID)) {

				placement.setCandidateID(Utility.forceParseInteger(value));

		    } else if(field.equalsIgnoreCase(CLIENTBILLRATE)) {

				placement.setClientBillRate(Utility.forceParseDouble(value));

		    } else if(field.equalsIgnoreCase(CLIENTOVERTIMERATE)) {

				placement.setClientOvertimeRate(Utility.forceParseDouble(value));

		    } else if(field.equalsIgnoreCase(COMMENTS)) {

				placement.setComments(value);

		    } else if(field.equalsIgnoreCase(CORRELATEDCUSTOMDATE1)) {

				placement.setCorrelatedCustomDate1(Utility.forceParseStringToXMLGregorianCalendar(value, dateFormat));

		    } else if(field.equalsIgnoreCase(CORRELATEDCUSTOMDATE2)) {

				placement.setCorrelatedCustomDate2(Utility.forceParseStringToXMLGregorianCalendar(value, dateFormat));

		    } else if(field.equalsIgnoreCase(CORRELATEDCUSTOMDATE3)) {

				placement.setCorrelatedCustomDate3(Utility.forceParseStringToXMLGregorianCalendar(value, dateFormat));

		    } else if(field.equalsIgnoreCase(CORRELATEDCUSTOMFLOAT1)) {

				placement.setCorrelatedCustomFloat1(Utility.forceParseDouble(value));

		    } else if(field.equalsIgnoreCase(CORRELATEDCUSTOMFLOAT2)) {

				placement.setCorrelatedCustomFloat2(Utility.forceParseDouble(value));

		    } else if(field.equalsIgnoreCase(CORRELATEDCUSTOMFLOAT3)) {

				placement.setCorrelatedCustomFloat3(Utility.forceParseDouble(value));

		    } else if(field.equalsIgnoreCase(CORRELATEDCUSTOMINT1)) {

				placement.setCorrelatedCustomInt1(Utility.forceParseInteger(value));

		    } else if(field.equalsIgnoreCase(CORRELATEDCUSTOMINT2)) {

				placement.setCorrelatedCustomInt2(Utility.forceParseInteger(value));

		    } else if(field.equalsIgnoreCase(CORRELATEDCUSTOMINT3)) {

				placement.setCorrelatedCustomInt3(Utility.forceParseInteger(value));

		    } else if(field.equalsIgnoreCase(CORRELATEDCUSTOMTEXT1)) {

				placement.setCorrelatedCustomText1(value);

		    } else if(field.equalsIgnoreCase(CORRELATEDCUSTOMTEXT10)) {

				placement.setCorrelatedCustomText10(value);

		    } else if(field.equalsIgnoreCase(CORRELATEDCUSTOMTEXT2)) {

				placement.setCorrelatedCustomText2(value);

		    } else if(field.equalsIgnoreCase(CORRELATEDCUSTOMTEXT3)) {

				placement.setCorrelatedCustomText3(value);

		    } else if(field.equalsIgnoreCase(CORRELATEDCUSTOMTEXT4)) {

				placement.setCorrelatedCustomText4(value);

		    } else if(field.equalsIgnoreCase(CORRELATEDCUSTOMTEXT5)) {

				placement.setCorrelatedCustomText5(value);

		    } else if(field.equalsIgnoreCase(CORRELATEDCUSTOMTEXT6)) {

				placement.setCorrelatedCustomText6(value);

		    } else if(field.equalsIgnoreCase(CORRELATEDCUSTOMTEXT7)) {

				placement.setCorrelatedCustomText7(value);

		    } else if(field.equalsIgnoreCase(CORRELATEDCUSTOMTEXT8)) {

				placement.setCorrelatedCustomText8(value);

		    } else if(field.equalsIgnoreCase(CORRELATEDCUSTOMTEXT9)) {

				placement.setCorrelatedCustomText9(value);

		    } else if(field.equalsIgnoreCase(CORRELATEDCUSTOMTEXTBLOCK1)) {

				placement.setCorrelatedCustomTextBlock1(value);

		    } else if(field.equalsIgnoreCase(CORRELATEDCUSTOMTEXTBLOCK2)) {

				placement.setCorrelatedCustomTextBlock2(value);

		    } else if(field.equalsIgnoreCase(CORRELATEDCUSTOMTEXTBLOCK3)) {

				placement.setCorrelatedCustomTextBlock3(value);

		    } else if(field.equalsIgnoreCase(COSTCENTER)) {

				placement.setCostCenter(value);

		    } else if(field.equalsIgnoreCase(CUSTOMBILLRATE1)) {

				placement.setCustomBillRate1(Utility.forceParseBigDecimal(value));

		    } else if(field.equalsIgnoreCase(CUSTOMBILLRATE10)) {

				placement.setCustomBillRate10(Utility.forceParseBigDecimal(value));

		    } else if(field.equalsIgnoreCase(CUSTOMBILLRATE2)) {

				placement.setCustomBillRate2(Utility.forceParseBigDecimal(value));

		    } else if(field.equalsIgnoreCase(CUSTOMBILLRATE3)) {

				placement.setCustomBillRate3(Utility.forceParseBigDecimal(value));

		    } else if(field.equalsIgnoreCase(CUSTOMBILLRATE4)) {

				placement.setCustomBillRate4(Utility.forceParseBigDecimal(value));

		    } else if(field.equalsIgnoreCase(CUSTOMBILLRATE5)) {

				placement.setCustomBillRate5(Utility.forceParseBigDecimal(value));

		    } else if(field.equalsIgnoreCase(CUSTOMBILLRATE6)) {

				placement.setCustomBillRate6(Utility.forceParseBigDecimal(value));

		    } else if(field.equalsIgnoreCase(CUSTOMBILLRATE7)) {

				placement.setCustomBillRate7(Utility.forceParseBigDecimal(value));

		    } else if(field.equalsIgnoreCase(CUSTOMBILLRATE8)) {

				placement.setCustomBillRate8(Utility.forceParseBigDecimal(value));

		    } else if(field.equalsIgnoreCase(CUSTOMBILLRATE9)) {

				placement.setCustomBillRate9(Utility.forceParseBigDecimal(value));

		    } else if(field.equalsIgnoreCase(CUSTOMDATE1)) {

				placement.setCustomDate1(Utility.forceParseStringToXMLGregorianCalendar(value, dateFormat));

		    } else if(field.equalsIgnoreCase(CUSTOMDATE2)) {

				placement.setCustomDate2(Utility.forceParseStringToXMLGregorianCalendar(value, dateFormat));

		    } else if(field.equalsIgnoreCase(CUSTOMDATE3)) {

				placement.setCustomDate3(Utility.forceParseStringToXMLGregorianCalendar(value, dateFormat));

		    } else if(field.equalsIgnoreCase(CUSTOMFLOAT1)) {

				placement.setCustomFloat1(Utility.forceParseDouble(value));

		    } else if(field.equalsIgnoreCase(CUSTOMFLOAT2)) {

				placement.setCustomFloat2(Utility.forceParseDouble(value));

		    } else if(field.equalsIgnoreCase(CUSTOMFLOAT3)) {

				placement.setCustomFloat3(Utility.forceParseDouble(value));

		    } else if(field.equalsIgnoreCase(CUSTOMINT1)) {

				placement.setCustomInt1(Utility.forceParseInteger(value));

		    } else if(field.equalsIgnoreCase(CUSTOMINT2)) {

		    	placement.setCustomInt2(Utility.forceParseInteger(value));

		    } else if(field.equalsIgnoreCase(CUSTOMINT3)) {

				placement.setCustomInt3(Utility.forceParseInteger(value));

		    } else if(field.equalsIgnoreCase(CUSTOMPAYRATE1)) {

				placement.setCustomPayRate1(Utility.forceParseBigDecimal(value));

		    } else if(field.equalsIgnoreCase(CUSTOMPAYRATE10)) {

				placement.setCustomPayRate10(Utility.forceParseBigDecimal(value));

		    } else if(field.equalsIgnoreCase(CUSTOMPAYRATE2)) {

				placement.setCustomPayRate2(Utility.forceParseBigDecimal(value));

		    } else if(field.equalsIgnoreCase(CUSTOMPAYRATE3)) {

				placement.setCustomPayRate3(Utility.forceParseBigDecimal(value));

		    } else if(field.equalsIgnoreCase(CUSTOMPAYRATE4)) {

				placement.setCustomPayRate4(Utility.forceParseBigDecimal(value));

		    } else if(field.equalsIgnoreCase(CUSTOMPAYRATE5)) {

				placement.setCustomPayRate5(Utility.forceParseBigDecimal(value));

		    } else if(field.equalsIgnoreCase(CUSTOMPAYRATE6)) {

				placement.setCustomPayRate6(Utility.forceParseBigDecimal(value));

		    } else if(field.equalsIgnoreCase(CUSTOMPAYRATE7)) {

				placement.setCustomPayRate7(Utility.forceParseBigDecimal(value));

		    } else if(field.equalsIgnoreCase(CUSTOMPAYRATE8)) {

				placement.setCustomPayRate8(Utility.forceParseBigDecimal(value));

		    } else if(field.equalsIgnoreCase(CUSTOMPAYRATE9)) {

				placement.setCustomPayRate9(Utility.forceParseBigDecimal(value));

		    } else if(field.equalsIgnoreCase(CUSTOMTEXT1)) {

				placement.setCustomText1(value);

		    } else if(field.equalsIgnoreCase(CUSTOMTEXT10)) {

				placement.setCustomText10(value);

		    } else if(field.equalsIgnoreCase(CUSTOMTEXT11)) {

				placement.setCustomText11(value);

		    } else if(field.equalsIgnoreCase(CUSTOMTEXT12)) {

				placement.setCustomText12(value);

		    } else if(field.equalsIgnoreCase(CUSTOMTEXT13)) {

				placement.setCustomText13(value);

		    } else if(field.equalsIgnoreCase(CUSTOMTEXT14)) {

				placement.setCustomText14(value);

		    } else if(field.equalsIgnoreCase(CUSTOMTEXT15)) {

				placement.setCustomText15(value);

		    } else if(field.equalsIgnoreCase(CUSTOMTEXT16)) {

				placement.setCustomText16(value);

		    } else if(field.equalsIgnoreCase(CUSTOMTEXT17)) {

				placement.setCustomText17(value);

		    } else if(field.equalsIgnoreCase(CUSTOMTEXT18)) {

				placement.setCustomText18(value);

		    } else if(field.equalsIgnoreCase(CUSTOMTEXT19)) {

				placement.setCustomText19(value);

		    } else if(field.equalsIgnoreCase(CUSTOMTEXT2)) {

				placement.setCustomText2(value);

		    } else if(field.equalsIgnoreCase(CUSTOMTEXT20)) {

				placement.setCustomText20(value);

		    } else if(field.equalsIgnoreCase(CUSTOMTEXT21)) {

				placement.setCustomText21(value);

		    } else if(field.equalsIgnoreCase(CUSTOMTEXT22)) {

				placement.setCustomText22(value);

		    } else if(field.equalsIgnoreCase(CUSTOMTEXT23)) {

				placement.setCustomText23(value);

		    } else if(field.equalsIgnoreCase(CUSTOMTEXT24)) {

				placement.setCustomText24(value);

		    } else if(field.equalsIgnoreCase(CUSTOMTEXT25)) {

				placement.setCustomText25(value);

		    } else if(field.equalsIgnoreCase(CUSTOMTEXT26)) {

				placement.setCustomText26(value);

		    } else if(field.equalsIgnoreCase(CUSTOMTEXT27)) {

				placement.setCustomText27(value);

		    } else if(field.equalsIgnoreCase(CUSTOMTEXT28)) {

				placement.setCustomText28(value);

		    } else if(field.equalsIgnoreCase(CUSTOMTEXT29)) {

				placement.setCustomText29(value);

		    } else if(field.equalsIgnoreCase(CUSTOMTEXT3)) {

				placement.setCustomText3(value);

		    } else if(field.equalsIgnoreCase(CUSTOMTEXT30)) {

				placement.setCustomText30(value);

		    } else if(field.equalsIgnoreCase(CUSTOMTEXT31)) {

				placement.setCustomText31(value);

		    } else if(field.equalsIgnoreCase(CUSTOMTEXT32)) {

				placement.setCustomText32(value);

		    } else if(field.equalsIgnoreCase(CUSTOMTEXT33)) {

				placement.setCustomText33(value);

		    } else if(field.equalsIgnoreCase(CUSTOMTEXT34)) {

				placement.setCustomText34(value);

		    } else if(field.equalsIgnoreCase(CUSTOMTEXT35)) {

				placement.setCustomText35(value);

		    } else if(field.equalsIgnoreCase(CUSTOMTEXT36)) {

				placement.setCustomText36(value);

		    } else if(field.equalsIgnoreCase(CUSTOMTEXT37)) {

				placement.setCustomText37(value);

		    } else if(field.equalsIgnoreCase(CUSTOMTEXT38)) {

				placement.setCustomText38(value);

		    } else if(field.equalsIgnoreCase(CUSTOMTEXT39)) {

				placement.setCustomText39(value);

		    } else if(field.equalsIgnoreCase(CUSTOMTEXT4)) {

				placement.setCustomText4(value);

		    } else if(field.equalsIgnoreCase(CUSTOMTEXT40)) {

				placement.setCustomText40(value);

		    } else if(field.equalsIgnoreCase(CUSTOMTEXT5)) {

				placement.setCustomText5(value);

		    } else if(field.equalsIgnoreCase(CUSTOMTEXT6)) {

				placement.setCustomText6(value);

		    } else if(field.equalsIgnoreCase(CUSTOMTEXT7)) {

				placement.setCustomText7(value);

		    } else if(field.equalsIgnoreCase(CUSTOMTEXT8)) {

				placement.setCustomText8(value);

		    } else if(field.equalsIgnoreCase(CUSTOMTEXT9)) {

				placement.setCustomText9(value);

		    } else if(field.equalsIgnoreCase(CUSTOMTEXTBLOCK1)) {

				placement.setCustomTextBlock1(value);

		    } else if(field.equalsIgnoreCase(CUSTOMTEXTBLOCK2)) {

				placement.setCustomTextBlock2(value);

		    } else if(field.equalsIgnoreCase(CUSTOMTEXTBLOCK3)) {

				placement.setCustomTextBlock3(value);

		    } else if(field.equalsIgnoreCase(CUSTOMTEXTBLOCK4)) {

				placement.setCustomTextBlock4(value);

		    } else if(field.equalsIgnoreCase(CUSTOMTEXTBLOCK5)) {

				placement.setCustomTextBlock5(value);

		    } else if(field.equalsIgnoreCase(DATEADDED)) {

				placement.setDateAdded(Utility.forceParseStringToXMLGregorianCalendar(value, dateFormat));

		    } else if(field.equalsIgnoreCase(DATEBEGIN)) {

				placement.setDateBegin(Utility.forceParseStringToXMLGregorianCalendar(value, dateFormat));

		    } else if(field.equalsIgnoreCase(DATECLIENTEFFECTIVE)) {

				placement.setDateClientEffective(Utility.forceParseStringToXMLGregorianCalendar(value, dateFormat));

		    } else if(field.equalsIgnoreCase(DATEEFFECTIVE)) {
		    	
				placement.setDateEffective(Utility.forceParseStringToXMLGregorianCalendar(value, dateFormat));

		    } else if(field.equalsIgnoreCase(DATEEND)) {

				placement.setDateEnd(Utility.forceParseStringToXMLGregorianCalendar(value, dateFormat));

		    } else if(field.equalsIgnoreCase(DAYSGUARANTEED)) {

				placement.setDaysGuaranteed(Utility.forceParseInteger(value));

		    } else if(field.equalsIgnoreCase(DAYSPRORATED)) {

				placement.setDaysProRated(Utility.forceParseInteger(value));

		    } else if(field.equalsIgnoreCase(DURATIONWEEKS)) {

				placement.setDurationWeeks(Utility.forceParseDouble(value));

		    } else if(field.equalsIgnoreCase(EMPLOYEETYPE)) {

				placement.setEmployeeType(value);

		    } else if(field.equalsIgnoreCase(EMPLOYMENTTYPE)) {

				placement.setEmploymentType(value);

		    } else if(field.equalsIgnoreCase(FEE)) {

				placement.setFee(Utility.forceParseDouble(value));

		    } else if(field.equalsIgnoreCase(HOURSOFOPERATION)) {

				placement.setHoursOfOperation(value);

		    } else if(field.equalsIgnoreCase(HOURSPERDAY)) {

				placement.setHoursPerDay(Utility.forceParseDouble(value));

		    } else if(field.equalsIgnoreCase(HOUSINGMANAGERID)) {

				placement.setHousingManagerID(Utility.forceParseInteger(value));

		    } else if(field.equalsIgnoreCase(HOUSINGSTATUS)) {

				placement.setHousingStatus(value);

		    } else if(field.equalsIgnoreCase(INVOICEGROUPID)) {

				placement.setInvoiceGroupID(Utility.forceParseInteger(value));

		    } else if(field.equalsIgnoreCase(INVOICEGROUPNAME)) {

				placement.setInvoiceGroupName(value);

		    } else if(field.equalsIgnoreCase(INVOICEID)) {

				placement.setInvoiceID(Utility.forceParseInteger(value));

		    } else if(field.equalsIgnoreCase(JOBORDERID)) {

				placement.setJobOrderID(Utility.forceParseInteger(value));

		    } else if(field.equalsIgnoreCase(MIGRATEGUID)) {

				placement.setMigrateGUID(value);

		    } else if(field.equalsIgnoreCase(OPTIONSPACKAGE)) {

				placement.setOptionsPackage(value);

		    } else if(field.equalsIgnoreCase(OTEXEMPTION)) {

				placement.setOtExemption(Utility.forceParseInteger(value));

		    } else if(field.equalsIgnoreCase(OTHERHOURLYFEE)) {

				placement.setOtherHourlyFee(Utility.forceParseDouble(value));

		    } else if(field.equalsIgnoreCase(OTHERHOURLYFEECOMMENTS)) {

				placement.setOtherHourlyFeeComments(value);

		    } else if(field.equalsIgnoreCase(OVERTIMERATE)) {

				placement.setOvertimeRate(Utility.forceParseDouble(value));

		    } else if(field.equalsIgnoreCase(PAYRATE)) {

				placement.setPayRate(Utility.forceParseBigDecimal(value));

		    } else if(field.equalsIgnoreCase(PLACEMENTID)) {

				placement.setPlacementID(Utility.forceParseInteger(field));
		    } else if(field.equalsIgnoreCase(RECRUITINGMANAGERPERCENTGROSSMARGIN)) {

				placement.setRecruitingManagerPercentGrossMargin(Utility.forceParseDouble(value));

		    } else if(field.equalsIgnoreCase(REFERRALFEE)) {

				placement.setReferralFee(Utility.forceParseBigDecimal(value));

		    } else if(field.equalsIgnoreCase(REFERRALFEETYPE)) {

				placement.setReferralFeeType(value);

		    } else if(field.equalsIgnoreCase(REPORTTO)) {

				placement.setReportTo(value);

		    } else if(field.equalsIgnoreCase(REPORTEDMARGIN)) {

				placement.setReportedMargin(Utility.forceParseDouble(field));
		    } else if(field.equalsIgnoreCase(SALARY)) {

				placement.setSalary(Utility.forceParseBigDecimal(value));

		    } else if(field.equalsIgnoreCase(SALARYUNIT)) {

				placement.setSalaryUnit(value);

		    } else if(field.equalsIgnoreCase(SALESMANAGERPERCENTGROSSMARGIN)) {

				placement.setSalesManagerPercentGrossMargin(Utility.forceParseDouble(value));

		    } else if(field.equalsIgnoreCase(SHIFTID)) {

				placement.setShiftID(Utility.forceParseInteger(value));

		    } else if(field.equalsIgnoreCase(STATEMENTCLIENTCONTACTID)) {

				placement.setStatementClientContactID(Utility.forceParseInteger(value));

		    } else if(field.equalsIgnoreCase(STATUS)) {

				placement.setStatus(value);

		    } else if(field.equalsIgnoreCase(TAXRATE)) {

				placement.setTaxRate(Utility.forceParseDouble(value));

		    } else if(field.equalsIgnoreCase(TAXSTATE)) {

				placement.setTaxState(value);

		    } else if(field.equalsIgnoreCase(TERMINATIONREASON)) {

				placement.setTerminationReason(value);

		    } else if(field.equalsIgnoreCase(VENDORCLIENTCORPORATIONID)) {

				placement.setVendorClientCorporationID(Utility.forceParseInteger(value));

		    } else if(field.equalsIgnoreCase(WORKWEEKSTART)) {

				placement.setWorkWeekStart(Utility.forceParseInteger(value));

		    } else if(field.equalsIgnoreCase(WORKERSCOMPENSATIONRATEID)) {

				placement.setWorkersCompensationRateID(Utility.forceParseInteger(value));

		    }
	    }
		
		return placement;
	}
	
	private String APPROVINGCLIENTCONTACTID = "approvingClientContactID";
	private String BACKUPAPPROVINGCLIENTCONTACTID = "backupApprovingClientContactID";
	private String BILLINGCLIENTCONTACTID = "billingClientContactID";
	private String BILLINGFREQUENCY = "billingFrequency";
	private String BONUSPACKAGE = "bonusPackage";
	private String CANDIDATEID = "candidateID";
	private String CLIENTBILLRATE = "clientBillRate";
	private String CLIENTOVERTIMERATE = "clientOvertimeRate";
	private String COMMENTS = "comments";
	private String CORRELATEDCUSTOMDATE1 = "correlatedCustomDate1";
	private String CORRELATEDCUSTOMDATE2 = "correlatedCustomDate2";
	private String CORRELATEDCUSTOMDATE3 = "correlatedCustomDate3";
	private String CORRELATEDCUSTOMFLOAT1 = "correlatedCustomFloat1";
	private String CORRELATEDCUSTOMFLOAT2 = "correlatedCustomFloat2";
	private String CORRELATEDCUSTOMFLOAT3 = "correlatedCustomFloat3";
	private String CORRELATEDCUSTOMINT1 = "correlatedCustomInt1";
	private String CORRELATEDCUSTOMINT2 = "correlatedCustomInt2";
	private String CORRELATEDCUSTOMINT3 = "correlatedCustomInt3";
	private String CORRELATEDCUSTOMTEXT1 = "correlatedCustomText1";
	private String CORRELATEDCUSTOMTEXT10 = "correlatedCustomText10";
	private String CORRELATEDCUSTOMTEXT2 = "correlatedCustomText2";
	private String CORRELATEDCUSTOMTEXT3 = "correlatedCustomText3";
	private String CORRELATEDCUSTOMTEXT4 = "correlatedCustomText4";
	private String CORRELATEDCUSTOMTEXT5 = "correlatedCustomText5";
	private String CORRELATEDCUSTOMTEXT6 = "correlatedCustomText6";
	private String CORRELATEDCUSTOMTEXT7 = "correlatedCustomText7";
	private String CORRELATEDCUSTOMTEXT8 = "correlatedCustomText8";
	private String CORRELATEDCUSTOMTEXT9 = "correlatedCustomText9";
	private String CORRELATEDCUSTOMTEXTBLOCK1 = "correlatedCustomTextBlock1";
	private String CORRELATEDCUSTOMTEXTBLOCK2 = "correlatedCustomTextBlock2";
	private String CORRELATEDCUSTOMTEXTBLOCK3 = "correlatedCustomTextBlock3";
	private String COSTCENTER = "costCenter";
	private String CUSTOMBILLRATE1 = "customBillRate1";
	private String CUSTOMBILLRATE10 = "customBillRate10";
	private String CUSTOMBILLRATE2 = "customBillRate2";
	private String CUSTOMBILLRATE3 = "customBillRate3";
	private String CUSTOMBILLRATE4 = "customBillRate4";
	private String CUSTOMBILLRATE5 = "customBillRate5";
	private String CUSTOMBILLRATE6 = "customBillRate6";
	private String CUSTOMBILLRATE7 = "customBillRate7";
	private String CUSTOMBILLRATE8 = "customBillRate8";
	private String CUSTOMBILLRATE9 = "customBillRate9";
	private String CUSTOMDATE1 = "customDate1";
	private String CUSTOMDATE2 = "customDate2";
	private String CUSTOMDATE3 = "customDate3";
	private String CUSTOMFLOAT1 = "customFloat1";
	private String CUSTOMFLOAT2 = "customFloat2";
	private String CUSTOMFLOAT3 = "customFloat3";
	private String CUSTOMINT1 = "customInt1";
	private String CUSTOMINT2 = "customInt2";
	private String CUSTOMINT3 = "customInt3";
	private String CUSTOMPAYRATE1 = "customPayRate1";
	private String CUSTOMPAYRATE10 = "customPayRate10";
	private String CUSTOMPAYRATE2 = "customPayRate2";
	private String CUSTOMPAYRATE3 = "customPayRate3";
	private String CUSTOMPAYRATE4 = "customPayRate4";
	private String CUSTOMPAYRATE5 = "customPayRate5";
	private String CUSTOMPAYRATE6 = "customPayRate6";
	private String CUSTOMPAYRATE7 = "customPayRate7";
	private String CUSTOMPAYRATE8 = "customPayRate8";
	private String CUSTOMPAYRATE9 = "customPayRate9";
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
	private String DATEADDED = "dateAdded";
	private String DATEBEGIN = "dateBegin";
	private String DATECLIENTEFFECTIVE = "dateClientEffective";
	private String DATEEFFECTIVE = "dateEffective";
	private String DATEEND = "dateEnd";
	private String DAYSGUARANTEED = "daysGuaranteed";
	private String DAYSPRORATED = "daysProRated";
	private String DURATIONWEEKS = "durationWeeks";
	private String EMPLOYEETYPE = "employeeType";
	private String EMPLOYMENTTYPE = "employmentType";
	private String FEE = "fee";
	private String HOURSOFOPERATION = "hoursOfOperation";
	private String HOURSPERDAY = "hoursPerDay";
	private String HOUSINGMANAGERID = "housingManagerID";
	private String HOUSINGSTATUS = "housingStatus";
	private String INVOICEGROUPID = "invoiceGroupID";
	private String INVOICEGROUPNAME = "invoiceGroupName";
	private String INVOICEID = "invoiceID";
	private String JOBORDERID = "jobOrderID";
	private String MIGRATEGUID = "migrateGUID";
	private String OPTIONSPACKAGE = "optionsPackage";
	private String OTEXEMPTION = "otExemption";
	private String OTHERHOURLYFEE = "otherHourlyFee";
	private String OTHERHOURLYFEECOMMENTS = "otherHourlyFeeComments";
	private String OVERTIMERATE = "overtimeRate";
	private String PAYRATE = "payRate";
	private String PLACEMENTID = "placementID";
	private String RECRUITINGMANAGERPERCENTGROSSMARGIN = "recruitingManagerPercentGrossMargin";
	private String REFERRALFEE = "referralFee";
	private String REFERRALFEETYPE = "referralFeeType";
	private String REPORTTO = "reportTo";
	private String REPORTEDMARGIN = "reportedMargin";
	private String SALARY = "salary";
	private String SALARYUNIT = "salaryUnit";
	private String SALESMANAGERPERCENTGROSSMARGIN = "salesManagerPercentGrossMargin";
	private String SHIFTID = "shiftID";
	private String STATEMENTCLIENTCONTACTID = "statementClientContactID";
	private String STATUS = "status";
	private String TAXRATE = "taxRate";
	private String TAXSTATE = "taxState";
	private String TERMINATIONREASON = "terminationReason";
	private String VENDORCLIENTCORPORATIONID = "vendorClientCorporationID";
	private String WORKWEEKSTART = "workWeekStart";
	private String WORKERSCOMPENSATIONRATEID = "workersCompensationRateID";
	
}
