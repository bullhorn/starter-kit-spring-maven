package com.client.core.soap.tools.property.getdtofields.impl;

import org.springframework.stereotype.Service;

import com.bullhorn.entity.job.PlacementDto;
import com.client.core.soap.tools.property.getdtofields.DtoFieldGetService;

@Service("placementGetService")
public class PlacementDtoFieldGetService extends DtoFieldGetService<PlacementDto> {
	
	public PlacementDtoFieldGetService()  {
		super();
	}
	
	@Override
	public Object retrieveField(String field, PlacementDto placement, Boolean isDotPrefixed) throws NoSuchMethodException {
		Object value = null;

		if(isDotPrefixed) {
			field = removeDotPrefix(field);
		}
		
		if (field.equalsIgnoreCase(APPROVINGCLIENTCONTACTID)) {
			value = placement.getApprovingClientContactID();
		}
		else if (field.equalsIgnoreCase(BACKUPAPPROVINGCLIENTCONTACTID)) {
			value = placement.getBackupApprovingClientContactID();
		}
		else if (field.equalsIgnoreCase(BILLINGCLIENTCONTACTID)) {
			value = placement.getBillingClientContactID();
		}
		else if (field.equalsIgnoreCase(BILLINGFREQUENCY)) {
			value = placement.getBillingFrequency();
		}
		else if (field.equalsIgnoreCase(BONUSPACKAGE)) {
			value = placement.getBonusPackage();
		}
		else if (field.equalsIgnoreCase(CANDIDATEID)) {
			value = placement.getCandidateID();
		}
		else if (field.equalsIgnoreCase(CLIENTBILLRATE)) {
			value = placement.getClientBillRate();
		}
		else if (field.equalsIgnoreCase(CLIENTOVERTIMERATE)) {
			value = placement.getClientOvertimeRate();
		}
		else if (field.equalsIgnoreCase(COMMENTS)) {
			value = placement.getComments();
		}
		else if (field.equalsIgnoreCase(CORRELATEDCUSTOMDATE1)) {
			value = placement.getCorrelatedCustomDate1();
		}
		else if (field.equalsIgnoreCase(CORRELATEDCUSTOMDATE2)) {
			value = placement.getCorrelatedCustomDate2();
		}
		else if (field.equalsIgnoreCase(CORRELATEDCUSTOMDATE3)) {
			value = placement.getCorrelatedCustomDate3();
		}
		else if (field.equalsIgnoreCase(CORRELATEDCUSTOMFLOAT1)) {
			value = placement.getCorrelatedCustomFloat1();
		}
		else if (field.equalsIgnoreCase(CORRELATEDCUSTOMFLOAT2)) {
			value = placement.getCorrelatedCustomFloat2();
		}
		else if (field.equalsIgnoreCase(CORRELATEDCUSTOMFLOAT3)) {
			value = placement.getCorrelatedCustomFloat3();
		}
		else if (field.equalsIgnoreCase(CORRELATEDCUSTOMINT1)) {
			value = placement.getCorrelatedCustomInt1();
		}
		else if (field.equalsIgnoreCase(CORRELATEDCUSTOMINT2)) {
			value = placement.getCorrelatedCustomInt2();
		}
		else if (field.equalsIgnoreCase(CORRELATEDCUSTOMINT3)) {
			value = placement.getCorrelatedCustomInt3();
		}
		else if (field.equalsIgnoreCase(CORRELATEDCUSTOMTEXT1)) {
			value = placement.getCorrelatedCustomText1();
		}
		else if (field.equalsIgnoreCase(CORRELATEDCUSTOMTEXT10)) {
			value = placement.getCorrelatedCustomText10();
		}
		else if (field.equalsIgnoreCase(CORRELATEDCUSTOMTEXT2)) {
			value = placement.getCorrelatedCustomText2();
		}
		else if (field.equalsIgnoreCase(CORRELATEDCUSTOMTEXT3)) {
			value = placement.getCorrelatedCustomText3();
		}
		else if (field.equalsIgnoreCase(CORRELATEDCUSTOMTEXT4)) {
			value = placement.getCorrelatedCustomText4();
		}
		else if (field.equalsIgnoreCase(CORRELATEDCUSTOMTEXT5)) {
			value = placement.getCorrelatedCustomText5();
		}
		else if (field.equalsIgnoreCase(CORRELATEDCUSTOMTEXT6)) {
			value = placement.getCorrelatedCustomText6();
		}
		else if (field.equalsIgnoreCase(CORRELATEDCUSTOMTEXT7)) {
			value = placement.getCorrelatedCustomText7();
		}
		else if (field.equalsIgnoreCase(CORRELATEDCUSTOMTEXT8)) {
			value = placement.getCorrelatedCustomText8();
		}
		else if (field.equalsIgnoreCase(CORRELATEDCUSTOMTEXT9)) {
			value = placement.getCorrelatedCustomText9();
		}
		else if (field.equalsIgnoreCase(CORRELATEDCUSTOMTEXTBLOCK1)) {
			value = placement.getCorrelatedCustomTextBlock1();
		}
		else if (field.equalsIgnoreCase(CORRELATEDCUSTOMTEXTBLOCK2)) {
			value = placement.getCorrelatedCustomTextBlock2();
		}
		else if (field.equalsIgnoreCase(CORRELATEDCUSTOMTEXTBLOCK3)) {
			value = placement.getCorrelatedCustomTextBlock3();
		}
		else if (field.equalsIgnoreCase(COSTCENTER)) {
			value = placement.getCostCenter();
		}
		else if (field.equalsIgnoreCase(CUSTOMBILLRATE1)) {
			value = placement.getCustomBillRate1();
		}
		else if (field.equalsIgnoreCase(CUSTOMBILLRATE10)) {
			value = placement.getCustomBillRate10();
		}
		else if (field.equalsIgnoreCase(CUSTOMBILLRATE2)) {
			value = placement.getCustomBillRate2();
		}
		else if (field.equalsIgnoreCase(CUSTOMBILLRATE3)) {
			value = placement.getCustomBillRate3();
		}
		else if (field.equalsIgnoreCase(CUSTOMBILLRATE4)) {
			value = placement.getCustomBillRate4();
		}
		else if (field.equalsIgnoreCase(CUSTOMBILLRATE5)) {
			value = placement.getCustomBillRate5();
		}
		else if (field.equalsIgnoreCase(CUSTOMBILLRATE6)) {
			value = placement.getCustomBillRate6();
		}
		else if (field.equalsIgnoreCase(CUSTOMBILLRATE7)) {
			value = placement.getCustomBillRate7();
		}
		else if (field.equalsIgnoreCase(CUSTOMBILLRATE8)) {
			value = placement.getCustomBillRate8();
		}
		else if (field.equalsIgnoreCase(CUSTOMBILLRATE9)) {
			value = placement.getCustomBillRate9();
		}
		else if (field.equalsIgnoreCase(CUSTOMDATE1)) {
			value = placement.getCustomDate1();
		}
		else if (field.equalsIgnoreCase(CUSTOMDATE2)) {
			value = placement.getCustomDate2();
		}
		else if (field.equalsIgnoreCase(CUSTOMDATE3)) {
			value = placement.getCustomDate3();
		}
		else if (field.equalsIgnoreCase(CUSTOMFLOAT1)) {
			value = placement.getCustomFloat1();
		}
		else if (field.equalsIgnoreCase(CUSTOMFLOAT2)) {
			value = placement.getCustomFloat2();
		}
		else if (field.equalsIgnoreCase(CUSTOMFLOAT3)) {
			value = placement.getCustomFloat3();
		}
		else if (field.equalsIgnoreCase(CUSTOMINT1)) {
			value = placement.getCustomInt1();
		}
		else if (field.equalsIgnoreCase(CUSTOMINT2)) {
			value = placement.getCustomInt2();
		}
		else if (field.equalsIgnoreCase(CUSTOMINT3)) {
			value = placement.getCustomInt3();
		}
		else if (field.equalsIgnoreCase(CUSTOMPAYRATE1)) {
			value = placement.getCustomPayRate1();
		}
		else if (field.equalsIgnoreCase(CUSTOMPAYRATE10)) {
			value = placement.getCustomPayRate10();
		}
		else if (field.equalsIgnoreCase(CUSTOMPAYRATE2)) {
			value = placement.getCustomPayRate2();
		}
		else if (field.equalsIgnoreCase(CUSTOMPAYRATE3)) {
			value = placement.getCustomPayRate3();
		}
		else if (field.equalsIgnoreCase(CUSTOMPAYRATE4)) {
			value = placement.getCustomPayRate4();
		}
		else if (field.equalsIgnoreCase(CUSTOMPAYRATE5)) {
			value = placement.getCustomPayRate5();
		}
		else if (field.equalsIgnoreCase(CUSTOMPAYRATE6)) {
			value = placement.getCustomPayRate6();
		}
		else if (field.equalsIgnoreCase(CUSTOMPAYRATE7)) {
			value = placement.getCustomPayRate7();
		}
		else if (field.equalsIgnoreCase(CUSTOMPAYRATE8)) {
			value = placement.getCustomPayRate8();
		}
		else if (field.equalsIgnoreCase(CUSTOMPAYRATE9)) {
			value = placement.getCustomPayRate9();
		}
		else if (field.equalsIgnoreCase(CUSTOMTEXT1)) {
			value = placement.getCustomText1();
		}
		else if (field.equalsIgnoreCase(CUSTOMTEXT10)) {
			value = placement.getCustomText10();
		}
		else if (field.equalsIgnoreCase(CUSTOMTEXT11)) {
			value = placement.getCustomText11();
		}
		else if (field.equalsIgnoreCase(CUSTOMTEXT12)) {
			value = placement.getCustomText12();
		}
		else if (field.equalsIgnoreCase(CUSTOMTEXT13)) {
			value = placement.getCustomText13();
		}
		else if (field.equalsIgnoreCase(CUSTOMTEXT14)) {
			value = placement.getCustomText14();
		}
		else if (field.equalsIgnoreCase(CUSTOMTEXT15)) {
			value = placement.getCustomText15();
		}
		else if (field.equalsIgnoreCase(CUSTOMTEXT16)) {
			value = placement.getCustomText16();
		}
		else if (field.equalsIgnoreCase(CUSTOMTEXT17)) {
			value = placement.getCustomText17();
		}
		else if (field.equalsIgnoreCase(CUSTOMTEXT18)) {
			value = placement.getCustomText18();
		}
		else if (field.equalsIgnoreCase(CUSTOMTEXT19)) {
			value = placement.getCustomText19();
		}
		else if (field.equalsIgnoreCase(CUSTOMTEXT2)) {
			value = placement.getCustomText2();
		}
		else if (field.equalsIgnoreCase(CUSTOMTEXT20)) {
			value = placement.getCustomText20();
		}
		else if (field.equalsIgnoreCase(CUSTOMTEXT21)) {
			value = placement.getCustomText21();
		}
		else if (field.equalsIgnoreCase(CUSTOMTEXT22)) {
			value = placement.getCustomText22();
		}
		else if (field.equalsIgnoreCase(CUSTOMTEXT23)) {
			value = placement.getCustomText23();
		}
		else if (field.equalsIgnoreCase(CUSTOMTEXT24)) {
			value = placement.getCustomText24();
		}
		else if (field.equalsIgnoreCase(CUSTOMTEXT25)) {
			value = placement.getCustomText25();
		}
		else if (field.equalsIgnoreCase(CUSTOMTEXT26)) {
			value = placement.getCustomText26();
		}
		else if (field.equalsIgnoreCase(CUSTOMTEXT27)) {
			value = placement.getCustomText27();
		}
		else if (field.equalsIgnoreCase(CUSTOMTEXT28)) {
			value = placement.getCustomText28();
		}
		else if (field.equalsIgnoreCase(CUSTOMTEXT29)) {
			value = placement.getCustomText29();
		}
		else if (field.equalsIgnoreCase(CUSTOMTEXT3)) {
			value = placement.getCustomText3();
		}
		else if (field.equalsIgnoreCase(CUSTOMTEXT30)) {
			value = placement.getCustomText30();
		}
		else if (field.equalsIgnoreCase(CUSTOMTEXT31)) {
			value = placement.getCustomText31();
		}
		else if (field.equalsIgnoreCase(CUSTOMTEXT32)) {
			value = placement.getCustomText32();
		}
		else if (field.equalsIgnoreCase(CUSTOMTEXT33)) {
			value = placement.getCustomText33();
		}
		else if (field.equalsIgnoreCase(CUSTOMTEXT34)) {
			value = placement.getCustomText34();
		}
		else if (field.equalsIgnoreCase(CUSTOMTEXT35)) {
			value = placement.getCustomText35();
		}
		else if (field.equalsIgnoreCase(CUSTOMTEXT36)) {
			value = placement.getCustomText36();
		}
		else if (field.equalsIgnoreCase(CUSTOMTEXT37)) {
			value = placement.getCustomText37();
		}
		else if (field.equalsIgnoreCase(CUSTOMTEXT38)) {
			value = placement.getCustomText38();
		}
		else if (field.equalsIgnoreCase(CUSTOMTEXT39)) {
			value = placement.getCustomText39();
		}
		else if (field.equalsIgnoreCase(CUSTOMTEXT4)) {
			value = placement.getCustomText4();
		}
		else if (field.equalsIgnoreCase(CUSTOMTEXT40)) {
			value = placement.getCustomText40();
		}
		else if (field.equalsIgnoreCase(CUSTOMTEXT5)) {
			value = placement.getCustomText5();
		}
		else if (field.equalsIgnoreCase(CUSTOMTEXT6)) {
			value = placement.getCustomText6();
		}
		else if (field.equalsIgnoreCase(CUSTOMTEXT7)) {
			value = placement.getCustomText7();
		}
		else if (field.equalsIgnoreCase(CUSTOMTEXT8)) {
			value = placement.getCustomText8();
		}
		else if (field.equalsIgnoreCase(CUSTOMTEXT9)) {
			value = placement.getCustomText9();
		}
		else if (field.equalsIgnoreCase(CUSTOMTEXTBLOCK1)) {
			value = placement.getCustomTextBlock1();
		}
		else if (field.equalsIgnoreCase(CUSTOMTEXTBLOCK2)) {
			value = placement.getCustomTextBlock2();
		}
		else if (field.equalsIgnoreCase(CUSTOMTEXTBLOCK3)) {
			value = placement.getCustomTextBlock3();
		}
		else if (field.equalsIgnoreCase(CUSTOMTEXTBLOCK4)) {
			value = placement.getCustomTextBlock4();
		}
		else if (field.equalsIgnoreCase(CUSTOMTEXTBLOCK5)) {
			value = placement.getCustomTextBlock5();
		}
		else if (field.equalsIgnoreCase(DATEADDED)) {
			value = placement.getDateAdded();
		}
		else if (field.equalsIgnoreCase(DATEBEGIN)) {
			value = placement.getDateBegin();
		}
		else if (field.equalsIgnoreCase(DATECLIENTEFFECTIVE)) {
			value = placement.getDateClientEffective();
		}
		else if (field.equalsIgnoreCase(DATEEFFECTIVE)) {
			value = placement.getDateEffective();
		}
		else if (field.equalsIgnoreCase(DATEEND)) {
			value = placement.getDateEnd();
		}
		else if (field.equalsIgnoreCase(DAYSGUARANTEED)) {
			value = placement.getDaysGuaranteed();
		}
		else if (field.equalsIgnoreCase(DAYSPRORATED)) {
			value = placement.getDaysProRated();
		}
		else if (field.equalsIgnoreCase(DURATIONWEEKS)) {
			value = placement.getDurationWeeks();
		}
		else if (field.equalsIgnoreCase(EMPLOYEETYPE)) {
			value = placement.getEmployeeType();
		}
		else if (field.equalsIgnoreCase(EMPLOYMENTTYPE)) {
			value = placement.getEmploymentType();
		}
		else if (field.equalsIgnoreCase(FEE)) {
			value = placement.getFee();
		}
		else if (field.equalsIgnoreCase(HOURSOFOPERATION)) {
			value = placement.getHoursOfOperation();
		}
		else if (field.equalsIgnoreCase(HOURSPERDAY)) {
			value = placement.getHoursPerDay();
		}
		else if (field.equalsIgnoreCase(HOUSINGMANAGERID)) {
			value = placement.getHousingManagerID();
		}
		else if (field.equalsIgnoreCase(HOUSINGSTATUS)) {
			value = placement.getHousingStatus();
		}
		else if (field.equalsIgnoreCase(INVOICEGROUPID)) {
			value = placement.getInvoiceGroupID();
		}
		else if (field.equalsIgnoreCase(INVOICEGROUPNAME)) {
			value = placement.getInvoiceGroupName();
		}
		else if (field.equalsIgnoreCase(INVOICEID)) {
			value = placement.getInvoiceID();
		}
		else if (field.equalsIgnoreCase(JOBORDERID)) {
			value = placement.getJobOrderID();
		}
		else if (field.equalsIgnoreCase(MIGRATEGUID)) {
			value = placement.getMigrateGUID();
		}
		else if (field.equalsIgnoreCase(OPTIONSPACKAGE)) {
			value = placement.getOptionsPackage();
		}
		else if (field.equalsIgnoreCase(OTEXEMPTION)) {
			value = placement.getOtExemption();
		}
		else if (field.equalsIgnoreCase(OTHERHOURLYFEE)) {
			value = placement.getOtherHourlyFee();
		}
		else if (field.equalsIgnoreCase(OTHERHOURLYFEECOMMENTS)) {
			value = placement.getOtherHourlyFeeComments();
		}
		else if (field.equalsIgnoreCase(OVERTIMERATE)) {
			value = placement.getOvertimeRate();
		}
		else if (field.equalsIgnoreCase(PAYRATE)) {
			value = placement.getPayRate();
		}
		else if (field.equalsIgnoreCase(PLACEMENTID)) {
			value = placement.getPlacementID();
		}
		else if (field.equalsIgnoreCase(RECRUITINGMANAGERPERCENTGROSSMARGIN)) {
			value = placement.getRecruitingManagerPercentGrossMargin();
		}
		else if (field.equalsIgnoreCase(REFERRALFEE)) {
			value = placement.getReferralFee();
		}
		else if (field.equalsIgnoreCase(REFERRALFEETYPE)) {
			value = placement.getReferralFeeType();
		}
		else if (field.equalsIgnoreCase(REPORTTO)) {
			value = placement.getReportTo();
		}
		else if (field.equalsIgnoreCase(REPORTEDMARGIN)) {
			value = placement.getReportedMargin();
		}
		else if (field.equalsIgnoreCase(SALARY)) {
			value = placement.getSalary();
		}
		else if (field.equalsIgnoreCase(SALARYUNIT)) {
			value = placement.getSalaryUnit();
		}
		else if (field.equalsIgnoreCase(SALESMANAGERPERCENTGROSSMARGIN)) {
			value = placement.getSalesManagerPercentGrossMargin();
		}
		else if (field.equalsIgnoreCase(SHIFTID)) {
			value = placement.getShiftID();
		}
		else if (field.equalsIgnoreCase(STATEMENTCLIENTCONTACTID)) {
			value = placement.getStatementClientContactID();
		}
		else if (field.equalsIgnoreCase(STATUS)) {
			value = placement.getStatus();
		}
		else if (field.equalsIgnoreCase(TAXRATE)) {
			value = placement.getTaxRate();
		}
		else if (field.equalsIgnoreCase(TAXSTATE)) {
			value = placement.getTaxState();
		}
		else if (field.equalsIgnoreCase(TERMINATIONREASON)) {
			value = placement.getTerminationReason();
		}
		else if (field.equalsIgnoreCase(VENDORCLIENTCORPORATIONID)) {
			value = placement.getVendorClientCorporationID();
		}
		else if (field.equalsIgnoreCase(WORKWEEKSTART)) {
			value = placement.getWorkWeekStart();
		}
		else if (field.equalsIgnoreCase(WORKERSCOMPENSATIONRATEID)) {
			value = placement.getWorkersCompensationRateID();
		}
		else {
			throw new NoSuchMethodException();
		}
		
		return value;
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
