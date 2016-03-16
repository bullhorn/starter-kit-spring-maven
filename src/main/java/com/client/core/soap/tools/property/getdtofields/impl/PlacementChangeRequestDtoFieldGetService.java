package com.client.core.soap.tools.property.getdtofields.impl;

import org.springframework.stereotype.Service;

import com.bullhorn.entity.job.PlacementChangeRequestDto;
import com.client.core.soap.tools.property.getdtofields.DtoFieldGetService;

@Service("placementChangeRequestGetService")
public class PlacementChangeRequestDtoFieldGetService extends DtoFieldGetService<PlacementChangeRequestDto> {

	public PlacementChangeRequestDtoFieldGetService() {
		super();
	}
	
	@Override
	public Object retrieveField(String field, PlacementChangeRequestDto placementChangeRequest, Boolean isDotPrefixed) throws NoSuchMethodException {
		Object value = null;

		if(isDotPrefixed) {
			field = removeDotPrefix(field);
		}
		
		if(field.equalsIgnoreCase(APPROVINGUSERID)) {
			value = placementChangeRequest.getApprovingUserID();
		}
		else if(field.equalsIgnoreCase(BILLINGCLIENTCONTACTID)) {
			value = placementChangeRequest.getBillingClientContactID();
		}
		else if(field.equalsIgnoreCase(BILLINGFREQUENCY)) {
			value = placementChangeRequest.getBillingFrequency();
		}
		else if(field.equalsIgnoreCase(BONUSPACKAGE)) {
			value = placementChangeRequest.getBonusPackage();
		}
		else if(field.equalsIgnoreCase(CLIENTBILLRATE)) {
			value = placementChangeRequest.getClientBillRate();
		}
		else if(field.equalsIgnoreCase(CLIENTOVERTIMERATE)) {
			value = placementChangeRequest.getClientOvertimeRate();
		}
		else if(field.equalsIgnoreCase(COMMENTS)) {
			value = placementChangeRequest.getComments();
		}
		else if(field.equalsIgnoreCase(CORRELATEDCUSTOMDATE1)) {
			value = placementChangeRequest.getCorrelatedCustomDate1();
		}
		else if(field.equalsIgnoreCase(CORRELATEDCUSTOMDATE2)) {
			value = placementChangeRequest.getCorrelatedCustomDate2();
		}
		else if(field.equalsIgnoreCase(CORRELATEDCUSTOMDATE3)) {
			value = placementChangeRequest.getCorrelatedCustomDate3();
		}
		else if(field.equalsIgnoreCase(CORRELATEDCUSTOMFLOAT1)) {
			value = placementChangeRequest.getCorrelatedCustomFloat1();
		}
		else if(field.equalsIgnoreCase(CORRELATEDCUSTOMFLOAT2)) {
			value = placementChangeRequest.getCorrelatedCustomFloat2();
		}
		else if(field.equalsIgnoreCase(CORRELATEDCUSTOMFLOAT3)) {
			value = placementChangeRequest.getCorrelatedCustomFloat3();
		}
		else if(field.equalsIgnoreCase(CORRELATEDCUSTOMINT1)) {
			value = placementChangeRequest.getCorrelatedCustomInt1();
		}
		else if(field.equalsIgnoreCase(CORRELATEDCUSTOMINT2)) {
			value = placementChangeRequest.getCorrelatedCustomInt2();
		}
		else if(field.equalsIgnoreCase(CORRELATEDCUSTOMINT3)) {
			value = placementChangeRequest.getCorrelatedCustomInt3();
		}
		else if(field.equalsIgnoreCase(CORRELATEDCUSTOMTEXT1)) {
			value = placementChangeRequest.getCorrelatedCustomText1();
		}
		else if(field.equalsIgnoreCase(CORRELATEDCUSTOMTEXT10)) {
			value = placementChangeRequest.getCorrelatedCustomText10();
		}
		else if(field.equalsIgnoreCase(CORRELATEDCUSTOMTEXT2)) {
			value = placementChangeRequest.getCorrelatedCustomText2();
		}
		else if(field.equalsIgnoreCase(CORRELATEDCUSTOMTEXT3)) {
			value = placementChangeRequest.getCorrelatedCustomText3();
		}
		else if(field.equalsIgnoreCase(CORRELATEDCUSTOMTEXT4)) {
			value = placementChangeRequest.getCorrelatedCustomText4();
		}
		else if(field.equalsIgnoreCase(CORRELATEDCUSTOMTEXT5)) {
			value = placementChangeRequest.getCorrelatedCustomText5();
		}
		else if(field.equalsIgnoreCase(CORRELATEDCUSTOMTEXT6)) {
			value = placementChangeRequest.getCorrelatedCustomText6();
		}
		else if(field.equalsIgnoreCase(CORRELATEDCUSTOMTEXT7)) {
			value = placementChangeRequest.getCorrelatedCustomText7();
		}
		else if(field.equalsIgnoreCase(CORRELATEDCUSTOMTEXT8)) {
			value = placementChangeRequest.getCorrelatedCustomText8();
		}
		else if(field.equalsIgnoreCase(CORRELATEDCUSTOMTEXT9)) {
			value = placementChangeRequest.getCorrelatedCustomText9();
		}
		else if(field.equalsIgnoreCase(CORRELATEDCUSTOMTEXTBLOCK1)) {
			value = placementChangeRequest.getCorrelatedCustomTextBlock1();
		}
		else if(field.equalsIgnoreCase(CORRELATEDCUSTOMTEXTBLOCK2)) {
			value = placementChangeRequest.getCorrelatedCustomTextBlock2();
		}
		else if(field.equalsIgnoreCase(CORRELATEDCUSTOMTEXTBLOCK3)) {
			value = placementChangeRequest.getCorrelatedCustomTextBlock3();
		}
		else if(field.equalsIgnoreCase(COSTCENTER)) {
			value = placementChangeRequest.getCostCenter();
		}
		else if(field.equalsIgnoreCase(CUSTOMBILLRATE1)) {
			value = placementChangeRequest.getCustomBillRate1();
		}
		else if(field.equalsIgnoreCase(CUSTOMBILLRATE10)) {
			value = placementChangeRequest.getCustomBillRate10();
		}
		else if(field.equalsIgnoreCase(CUSTOMBILLRATE2)) {
			value = placementChangeRequest.getCustomBillRate2();
		}
		else if(field.equalsIgnoreCase(CUSTOMBILLRATE3)) {
			value = placementChangeRequest.getCustomBillRate3();
		}
		else if(field.equalsIgnoreCase(CUSTOMBILLRATE4)) {
			value = placementChangeRequest.getCustomBillRate4();
		}
		else if(field.equalsIgnoreCase(CUSTOMBILLRATE5)) {
			value = placementChangeRequest.getCustomBillRate5();
		}
		else if(field.equalsIgnoreCase(CUSTOMBILLRATE6)) {
			value = placementChangeRequest.getCustomBillRate6();
		}
		else if(field.equalsIgnoreCase(CUSTOMBILLRATE7)) {
			value = placementChangeRequest.getCustomBillRate7();
		}
		else if(field.equalsIgnoreCase(CUSTOMBILLRATE8)) {
			value = placementChangeRequest.getCustomBillRate8();
		}
		else if(field.equalsIgnoreCase(CUSTOMBILLRATE9)) {
			value = placementChangeRequest.getCustomBillRate9();
		}
		else if(field.equalsIgnoreCase(CUSTOMDATE1)) {
			value = placementChangeRequest.getCustomDate1();
		}
		else if(field.equalsIgnoreCase(CUSTOMDATE2)) {
			value = placementChangeRequest.getCustomDate2();
		}
		else if(field.equalsIgnoreCase(CUSTOMDATE3)) {
			value = placementChangeRequest.getCustomDate3();
		}
		else if(field.equalsIgnoreCase(CUSTOMFLOAT1)) {
			value = placementChangeRequest.getCustomFloat1();
		}
		else if(field.equalsIgnoreCase(CUSTOMFLOAT2)) {
			value = placementChangeRequest.getCustomFloat2();
		}
		else if(field.equalsIgnoreCase(CUSTOMFLOAT3)) {
			value = placementChangeRequest.getCustomFloat3();
		}
		else if(field.equalsIgnoreCase(CUSTOMINT1)) {
			value = placementChangeRequest.getCustomInt1();
		}
		else if(field.equalsIgnoreCase(CUSTOMINT2)) {
			value = placementChangeRequest.getCustomInt2();
		}
		else if(field.equalsIgnoreCase(CUSTOMINT3)) {
			value = placementChangeRequest.getCustomInt3();
		}
		else if(field.equalsIgnoreCase(CUSTOMPAYRATE1)) {
			value = placementChangeRequest.getCustomPayRate1();
		}
		else if(field.equalsIgnoreCase(CUSTOMPAYRATE10)) {
			value = placementChangeRequest.getCustomPayRate10();
		}
		else if(field.equalsIgnoreCase(CUSTOMPAYRATE2)) {
			value = placementChangeRequest.getCustomPayRate2();
		}
		else if(field.equalsIgnoreCase(CUSTOMPAYRATE3)) {
			value = placementChangeRequest.getCustomPayRate3();
		}
		else if(field.equalsIgnoreCase(CUSTOMPAYRATE4)) {
			value = placementChangeRequest.getCustomPayRate4();
		}
		else if(field.equalsIgnoreCase(CUSTOMPAYRATE5)) {
			value = placementChangeRequest.getCustomPayRate5();
		}
		else if(field.equalsIgnoreCase(CUSTOMPAYRATE6)) {
			value = placementChangeRequest.getCustomPayRate6();
		}
		else if(field.equalsIgnoreCase(CUSTOMPAYRATE7)) {
			value = placementChangeRequest.getCustomPayRate7();
		}
		else if(field.equalsIgnoreCase(CUSTOMPAYRATE8)) {
			value = placementChangeRequest.getCustomPayRate8();
		}
		else if(field.equalsIgnoreCase(CUSTOMPAYRATE9)) {
			value = placementChangeRequest.getCustomPayRate9();
		}
		else if(field.equalsIgnoreCase(CUSTOMTEXT1)) {
			value = placementChangeRequest.getCustomText1();
		}
		else if(field.equalsIgnoreCase(CUSTOMTEXT10)) {
			value = placementChangeRequest.getCustomText10();
		}
		else if(field.equalsIgnoreCase(CUSTOMTEXT11)) {
			value = placementChangeRequest.getCustomText11();
		}
		else if(field.equalsIgnoreCase(CUSTOMTEXT12)) {
			value = placementChangeRequest.getCustomText12();
		}
		else if(field.equalsIgnoreCase(CUSTOMTEXT13)) {
			value = placementChangeRequest.getCustomText13();
		}
		else if(field.equalsIgnoreCase(CUSTOMTEXT14)) {
			value = placementChangeRequest.getCustomText14();
		}
		else if(field.equalsIgnoreCase(CUSTOMTEXT15)) {
			value = placementChangeRequest.getCustomText15();
		}
		else if(field.equalsIgnoreCase(CUSTOMTEXT16)) {
			value = placementChangeRequest.getCustomText16();
		}
		else if(field.equalsIgnoreCase(CUSTOMTEXT17)) {
			value = placementChangeRequest.getCustomText17();
		}
		else if(field.equalsIgnoreCase(CUSTOMTEXT18)) {
			value = placementChangeRequest.getCustomText18();
		}
		else if(field.equalsIgnoreCase(CUSTOMTEXT19)) {
			value = placementChangeRequest.getCustomText19();
		}
		else if(field.equalsIgnoreCase(CUSTOMTEXT2)) {
			value = placementChangeRequest.getCustomText2();
		}
		else if(field.equalsIgnoreCase(CUSTOMTEXT20)) {
			value = placementChangeRequest.getCustomText20();
		}
		else if(field.equalsIgnoreCase(CUSTOMTEXT21)) {
			value = placementChangeRequest.getCustomText21();
		}
		else if(field.equalsIgnoreCase(CUSTOMTEXT22)) {
			value = placementChangeRequest.getCustomText22();
		}
		else if(field.equalsIgnoreCase(CUSTOMTEXT23)) {
			value = placementChangeRequest.getCustomText23();
		}
		else if(field.equalsIgnoreCase(CUSTOMTEXT24)) {
			value = placementChangeRequest.getCustomText24();
		}
		else if(field.equalsIgnoreCase(CUSTOMTEXT25)) {
			value = placementChangeRequest.getCustomText25();
		}
		else if(field.equalsIgnoreCase(CUSTOMTEXT26)) {
			value = placementChangeRequest.getCustomText26();
		}
		else if(field.equalsIgnoreCase(CUSTOMTEXT27)) {
			value = placementChangeRequest.getCustomText27();
		}
		else if(field.equalsIgnoreCase(CUSTOMTEXT28)) {
			value = placementChangeRequest.getCustomText28();
		}
		else if(field.equalsIgnoreCase(CUSTOMTEXT29)) {
			value = placementChangeRequest.getCustomText29();
		}
		else if(field.equalsIgnoreCase(CUSTOMTEXT3)) {
			value = placementChangeRequest.getCustomText3();
		}
		else if(field.equalsIgnoreCase(CUSTOMTEXT30)) {
			value = placementChangeRequest.getCustomText30();
		}
		else if(field.equalsIgnoreCase(CUSTOMTEXT31)) {
			value = placementChangeRequest.getCustomText31();
		}
		else if(field.equalsIgnoreCase(CUSTOMTEXT32)) {
			value = placementChangeRequest.getCustomText32();
		}
		else if(field.equalsIgnoreCase(CUSTOMTEXT33)) {
			value = placementChangeRequest.getCustomText33();
		}
		else if(field.equalsIgnoreCase(CUSTOMTEXT34)) {
			value = placementChangeRequest.getCustomText34();
		}
		else if(field.equalsIgnoreCase(CUSTOMTEXT35)) {
			value = placementChangeRequest.getCustomText35();
		}
		else if(field.equalsIgnoreCase(CUSTOMTEXT36)) {
			value = placementChangeRequest.getCustomText36();
		}
		else if(field.equalsIgnoreCase(CUSTOMTEXT37)) {
			value = placementChangeRequest.getCustomText37();
		}
		else if(field.equalsIgnoreCase(CUSTOMTEXT38)) {
			value = placementChangeRequest.getCustomText38();
		}
		else if(field.equalsIgnoreCase(CUSTOMTEXT39)) {
			value = placementChangeRequest.getCustomText39();
		}
		else if(field.equalsIgnoreCase(CUSTOMTEXT4)) {
			value = placementChangeRequest.getCustomText4();
		}
		else if(field.equalsIgnoreCase(CUSTOMTEXT40)) {
			value = placementChangeRequest.getCustomText40();
		}
		else if(field.equalsIgnoreCase(CUSTOMTEXT5)) {
			value = placementChangeRequest.getCustomText5();
		}
		else if(field.equalsIgnoreCase(CUSTOMTEXT6)) {
			value = placementChangeRequest.getCustomText6();
		}
		else if(field.equalsIgnoreCase(CUSTOMTEXT7)) {
			value = placementChangeRequest.getCustomText7();
		}
		else if(field.equalsIgnoreCase(CUSTOMTEXT8)) {
			value = placementChangeRequest.getCustomText8();
		}
		else if(field.equalsIgnoreCase(CUSTOMTEXT9)) {
			value = placementChangeRequest.getCustomText9();
		}
		else if(field.equalsIgnoreCase(CUSTOMTEXTBLOCK1)) {
			value = placementChangeRequest.getCustomTextBlock1();
		}
		else if(field.equalsIgnoreCase(CUSTOMTEXTBLOCK2)) {
			value = placementChangeRequest.getCustomTextBlock2();
		}
		else if(field.equalsIgnoreCase(CUSTOMTEXTBLOCK3)) {
			value = placementChangeRequest.getCustomTextBlock3();
		}
		else if(field.equalsIgnoreCase(CUSTOMTEXTBLOCK4)) {
			value = placementChangeRequest.getCustomTextBlock4();
		}
		else if(field.equalsIgnoreCase(CUSTOMTEXTBLOCK5)) {
			value = placementChangeRequest.getCustomTextBlock5();
		}
		else if(field.equalsIgnoreCase(DATEADDED)) {
			value = placementChangeRequest.getDateAdded();
		}
		else if(field.equalsIgnoreCase(DATEAPPROVED)) {
			value = placementChangeRequest.getDateApproved();
		}
		else if(field.equalsIgnoreCase(DATEBEGIN)) {
			value = placementChangeRequest.getDateBegin();
		}
		else if(field.equalsIgnoreCase(DATECLIENTEFFECTIVE)) {
			value = placementChangeRequest.getDateClientEffective();
		}
		else if(field.equalsIgnoreCase(DATEEFFECTIVE)) {
			value = placementChangeRequest.getDateEffective();
		}
		else if(field.equalsIgnoreCase(DATEEND)) {
			value = placementChangeRequest.getDateEnd();
		}
		else if(field.equalsIgnoreCase(DAYSGUARANTEED)) {
			value = placementChangeRequest.getDaysGuaranteed();
		}
		else if(field.equalsIgnoreCase(DAYSPRORATED)) {
			value = placementChangeRequest.getDaysProRated();
		}
		else if(field.equalsIgnoreCase(DURATIONWEEKS)) {
			value = placementChangeRequest.getDurationWeeks();
		}
		else if(field.equalsIgnoreCase(EMPLOYEETYPE)) {
			value = placementChangeRequest.getEmployeeType();
		}
		else if(field.equalsIgnoreCase(EMPLOYMENTTYPE)) {
			value = placementChangeRequest.getEmploymentType();
		}
		else if(field.equalsIgnoreCase(FEE)) {
			value = placementChangeRequest.getFee();
		}
		else if(field.equalsIgnoreCase(HOURSOFOPERATION)) {
			value = placementChangeRequest.getHoursOfOperation();
		}
		else if(field.equalsIgnoreCase(HOURSPERDAY)) {
			value = placementChangeRequest.getHoursPerDay();
		}
		else if(field.equalsIgnoreCase(HOUSINGMANAGERID)) {
			value = placementChangeRequest.getHousingManagerID();
		}
		else if(field.equalsIgnoreCase(HOUSINGSTATUS)) {
			value = placementChangeRequest.getHousingStatus();
		}
		else if(field.equalsIgnoreCase(MIGRATEGUID)) {
			value = placementChangeRequest.getMigrateGUID();
		}
		else if(field.equalsIgnoreCase(OPTIONSPACKAGE)) {
			value = placementChangeRequest.getOptionsPackage();
		}
		else if(field.equalsIgnoreCase(OTEXEMPTION)) {
			value = placementChangeRequest.getOtExemption();
		}
		else if(field.equalsIgnoreCase(OTHERHOURLYFEE)) {
			value = placementChangeRequest.getOtherHourlyFee();
		}
		else if(field.equalsIgnoreCase(OTHERHOURLYFEECOMMENTS)) {
			value = placementChangeRequest.getOtherHourlyFeeComments();
		}
		else if(field.equalsIgnoreCase(OVERTIMERATE)) {
			value = placementChangeRequest.getOvertimeRate();
		}
		else if(field.equalsIgnoreCase(PAYRATE)) {
			value = placementChangeRequest.getPayRate();
		}
		else if(field.equalsIgnoreCase(PLACEMENTCHANGEREQUESTID)) {
			value = placementChangeRequest.getPlacementChangeRequestID();
		}
		else if(field.equalsIgnoreCase(PLACEMENTID)) {
			value = placementChangeRequest.getPlacementID();
		}
		else if(field.equalsIgnoreCase(RECRUITINGMANAGERPERCENTGROSSMARGIN)) {
			value = placementChangeRequest.getRecruitingManagerPercentGrossMargin();
		}
		else if(field.equalsIgnoreCase(REFERRALFEE)) {
			value = placementChangeRequest.getReferralFee();
		}
		else if(field.equalsIgnoreCase(REFERRALFEETYPE)) {
			value = placementChangeRequest.getReferralFeeType();
		}
		else if(field.equalsIgnoreCase(REPORTTO)) {
			value = placementChangeRequest.getReportTo();
		}
		else if(field.equalsIgnoreCase(REQUESTCUSTOMDATE1)) {
			value = placementChangeRequest.getRequestCustomDate1();
		}
		else if(field.equalsIgnoreCase(REQUESTCUSTOMDATE2)) {
			value = placementChangeRequest.getRequestCustomDate2();
		}
		else if(field.equalsIgnoreCase(REQUESTCUSTOMDATE3)) {
			value = placementChangeRequest.getRequestCustomDate3();
		}
		else if(field.equalsIgnoreCase(REQUESTCUSTOMFLOAT1)) {
			value = placementChangeRequest.getRequestCustomFloat1();
		}
		else if(field.equalsIgnoreCase(REQUESTCUSTOMFLOAT2)) {
			value = placementChangeRequest.getRequestCustomFloat2();
		}
		else if(field.equalsIgnoreCase(REQUESTCUSTOMFLOAT3)) {
			value = placementChangeRequest.getRequestCustomFloat3();
		}
		else if(field.equalsIgnoreCase(REQUESTCUSTOMINT1)) {
			value = placementChangeRequest.getRequestCustomInt1();
		}
		else if(field.equalsIgnoreCase(REQUESTCUSTOMINT2)) {
			value = placementChangeRequest.getRequestCustomInt2();
		}
		else if(field.equalsIgnoreCase(REQUESTCUSTOMINT3)) {
			value = placementChangeRequest.getRequestCustomInt3();
		}
		else if(field.equalsIgnoreCase(REQUESTCUSTOMTEXT1)) {
			value = placementChangeRequest.getRequestCustomText1();
		}
		else if(field.equalsIgnoreCase(REQUESTCUSTOMTEXT10)) {
			value = placementChangeRequest.getRequestCustomText10();
		}
		else if(field.equalsIgnoreCase(REQUESTCUSTOMTEXT11)) {
			value = placementChangeRequest.getRequestCustomText11();
		}
		else if(field.equalsIgnoreCase(REQUESTCUSTOMTEXT12)) {
			value = placementChangeRequest.getRequestCustomText12();
		}
		else if(field.equalsIgnoreCase(REQUESTCUSTOMTEXT13)) {
			value = placementChangeRequest.getRequestCustomText13();
		}
		else if(field.equalsIgnoreCase(REQUESTCUSTOMTEXT14)) {
			value = placementChangeRequest.getRequestCustomText14();
		}
		else if(field.equalsIgnoreCase(REQUESTCUSTOMTEXT15)) {
			value = placementChangeRequest.getRequestCustomText15();
		}
		else if(field.equalsIgnoreCase(REQUESTCUSTOMTEXT16)) {
			value = placementChangeRequest.getRequestCustomText16();
		}
		else if(field.equalsIgnoreCase(REQUESTCUSTOMTEXT17)) {
			value = placementChangeRequest.getRequestCustomText17();
		}
		else if(field.equalsIgnoreCase(REQUESTCUSTOMTEXT18)) {
			value = placementChangeRequest.getRequestCustomText18();
		}
		else if(field.equalsIgnoreCase(REQUESTCUSTOMTEXT19)) {
			value = placementChangeRequest.getRequestCustomText19();
		}
		else if(field.equalsIgnoreCase(REQUESTCUSTOMTEXT2)) {
			value = placementChangeRequest.getRequestCustomText2();
		}
		else if(field.equalsIgnoreCase(REQUESTCUSTOMTEXT20)) {
			value = placementChangeRequest.getRequestCustomText20();
		}
		else if(field.equalsIgnoreCase(REQUESTCUSTOMTEXT3)) {
			value = placementChangeRequest.getRequestCustomText3();
		}
		else if(field.equalsIgnoreCase(REQUESTCUSTOMTEXT4)) {
			value = placementChangeRequest.getRequestCustomText4();
		}
		else if(field.equalsIgnoreCase(REQUESTCUSTOMTEXT5)) {
			value = placementChangeRequest.getRequestCustomText5();
		}
		else if(field.equalsIgnoreCase(REQUESTCUSTOMTEXT6)) {
			value = placementChangeRequest.getRequestCustomText6();
		}
		else if(field.equalsIgnoreCase(REQUESTCUSTOMTEXT7)) {
			value = placementChangeRequest.getRequestCustomText7();
		}
		else if(field.equalsIgnoreCase(REQUESTCUSTOMTEXT8)) {
			value = placementChangeRequest.getRequestCustomText8();
		}
		else if(field.equalsIgnoreCase(REQUESTCUSTOMTEXT9)) {
			value = placementChangeRequest.getRequestCustomText9();
		}
		else if(field.equalsIgnoreCase(REQUESTCUSTOMTEXTBLOCK1)) {
			value = placementChangeRequest.getRequestCustomTextBlock1();
		}
		else if(field.equalsIgnoreCase(REQUESTCUSTOMTEXTBLOCK2)) {
			value = placementChangeRequest.getRequestCustomTextBlock2();
		}
		else if(field.equalsIgnoreCase(REQUESTCUSTOMTEXTBLOCK3)) {
			value = placementChangeRequest.getRequestCustomTextBlock3();
		}
		else if(field.equalsIgnoreCase(REQUESTCUSTOMTEXTBLOCK4)) {
			value = placementChangeRequest.getRequestCustomTextBlock4();
		}
		else if(field.equalsIgnoreCase(REQUESTCUSTOMTEXTBLOCK5)) {
			value = placementChangeRequest.getRequestCustomTextBlock5();
		}
		else if(field.equalsIgnoreCase(REQUESTSTATUS)) {
			value = placementChangeRequest.getRequestStatus();
		}
		else if(field.equalsIgnoreCase(REQUESTTYPE)) {
			value = placementChangeRequest.getRequestType();
		}
		else if(field.equalsIgnoreCase(REQUESTINGUSERID)) {
			value = placementChangeRequest.getRequestingUserID();
		}
		else if(field.equalsIgnoreCase(SALARY)) {
			value = placementChangeRequest.getSalary();
		}
		else if(field.equalsIgnoreCase(SALARYUNIT)) {
			value = placementChangeRequest.getSalaryUnit();
		}
		else if(field.equalsIgnoreCase(SALESMANAGERPERCENTGROSSMARGIN)) {
			value = placementChangeRequest.getSalesManagerPercentGrossMargin();
		}
		else if(field.equalsIgnoreCase(STATEMENTCLIENTCONTACTID)) {
			value = placementChangeRequest.getStatementClientContactID();
		}
		else if(field.equalsIgnoreCase(STATUS)) {
			value = placementChangeRequest.getStatus();
		}
		else if(field.equalsIgnoreCase(TERMINATIONREASON)) {
			value = placementChangeRequest.getTerminationReason();
		}
		else if(field.equalsIgnoreCase(VENDORCLIENTCORPORATIONID)) {
			value = placementChangeRequest.getVendorClientCorporationID();
		}
		else if(field.equalsIgnoreCase(WORKWEEKSTART)) {
			value = placementChangeRequest.getWorkWeekStart();
		}
		else if(field.equalsIgnoreCase(WORKERSCOMPRATEID)) {
			value = placementChangeRequest.getWorkersCompRateID();
		}
		else {
			throw new NoSuchMethodException();
		}

		return value;
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
