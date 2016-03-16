package com.client.core.soap.tools.property.getdtofields.impl;

import org.springframework.stereotype.Service;

import com.bullhorn.entity.job.JobOrderDto;
import com.client.core.soap.tools.property.getdtofields.DtoFieldGetService;

@Service("jobOrderGetService")
public class JobOrderDtoFieldGetService extends DtoFieldGetService<JobOrderDto> {

	public JobOrderDtoFieldGetService() {
		super();
	}
	
	@Override
	public Object retrieveField(String field, JobOrderDto jobOrder, Boolean isDotPrefixed) throws NoSuchMethodException {
		Object value = null;

		if(isDotPrefixed) {
			field = removeDotPrefix(field);
		}
		
		if(field.equalsIgnoreCase(ADDRESS)) {
			value=jobOrder.getAddress();
		}
		else if(field.equalsIgnoreCase(BENEFITS)) {
			value=jobOrder.getBenefits();
		}
		else if(field.equalsIgnoreCase(BILLRATECATEGORYID)) {
			value=jobOrder.getBillRateCategoryID();
		}
		else if(field.equalsIgnoreCase(BONUSPACKAGE)) {
			value=jobOrder.getBonusPackage();
		}
		else if(field.equalsIgnoreCase(BRANCHCODE)) {
			value=jobOrder.getBranchCode();
		}
		else if(field.equalsIgnoreCase(CERTIFICATIONLIST)) {
			value=jobOrder.getCertificationList();
		}
		else if(field.equalsIgnoreCase(CLIENTBILLRATE)) {
			value=jobOrder.getClientBillRate();
		}
		else if(field.equalsIgnoreCase(CLIENTCONTACTID)) {
			value=jobOrder.getClientContactID();
		}
		else if(field.equalsIgnoreCase(CLIENTCORPORATIONID)) {
			value=jobOrder.getClientCorporationID();
		}
		else if(field.equalsIgnoreCase(CORRELATEDCUSTOMDATE1)) {
			value=jobOrder.getCorrelatedCustomDate1();
		}
		else if(field.equalsIgnoreCase(CORRELATEDCUSTOMDATE2)) {
			value=jobOrder.getCorrelatedCustomDate2();
		}
		else if(field.equalsIgnoreCase(CORRELATEDCUSTOMDATE3)) {
			value=jobOrder.getCorrelatedCustomDate3();
		}
		else if(field.equalsIgnoreCase(CORRELATEDCUSTOMFLOAT1)) {
			value=jobOrder.getCorrelatedCustomFloat1();
		}
		else if(field.equalsIgnoreCase(CORRELATEDCUSTOMFLOAT2)) {
			value=jobOrder.getCorrelatedCustomFloat2();
		}
		else if(field.equalsIgnoreCase(CORRELATEDCUSTOMFLOAT3)) {
			value=jobOrder.getCorrelatedCustomFloat3();
		}
		else if(field.equalsIgnoreCase(CORRELATEDCUSTOMINT1)) {
			value=jobOrder.getCorrelatedCustomInt1();
		}
		else if(field.equalsIgnoreCase(CORRELATEDCUSTOMINT2)) {
			value=jobOrder.getCorrelatedCustomInt2();
		}
		else if(field.equalsIgnoreCase(CORRELATEDCUSTOMINT3)) {
			value=jobOrder.getCorrelatedCustomInt3();
		}
		else if(field.equalsIgnoreCase(CORRELATEDCUSTOMTEXT1)) {
			value=jobOrder.getCorrelatedCustomText1();
		}
		else if(field.equalsIgnoreCase(CORRELATEDCUSTOMTEXT10)) {
			value=jobOrder.getCorrelatedCustomText10();
		}
		else if(field.equalsIgnoreCase(CORRELATEDCUSTOMTEXT2)) {
			value=jobOrder.getCorrelatedCustomText2();
		}
		else if(field.equalsIgnoreCase(CORRELATEDCUSTOMTEXT3)) {
			value=jobOrder.getCorrelatedCustomText3();
		}
		else if(field.equalsIgnoreCase(CORRELATEDCUSTOMTEXT4)) {
			value=jobOrder.getCorrelatedCustomText4();
		}
		else if(field.equalsIgnoreCase(CORRELATEDCUSTOMTEXT5)) {
			value=jobOrder.getCorrelatedCustomText5();
		}
		else if(field.equalsIgnoreCase(CORRELATEDCUSTOMTEXT6)) {
			value=jobOrder.getCorrelatedCustomText6();
		}
		else if(field.equalsIgnoreCase(CORRELATEDCUSTOMTEXT7)) {
			value=jobOrder.getCorrelatedCustomText7();
		}
		else if(field.equalsIgnoreCase(CORRELATEDCUSTOMTEXT8)) {
			value=jobOrder.getCorrelatedCustomText8();
		}
		else if(field.equalsIgnoreCase(CORRELATEDCUSTOMTEXT9)) {
			value=jobOrder.getCorrelatedCustomText9();
		}
		else if(field.equalsIgnoreCase(CORRELATEDCUSTOMTEXTBLOCK1)) {
			value=jobOrder.getCorrelatedCustomTextBlock1();
		}
		else if(field.equalsIgnoreCase(CORRELATEDCUSTOMTEXTBLOCK2)) {
			value=jobOrder.getCorrelatedCustomTextBlock2();
		}
		else if(field.equalsIgnoreCase(CORRELATEDCUSTOMTEXTBLOCK3)) {
			value=jobOrder.getCorrelatedCustomTextBlock3();
		}
		else if(field.equalsIgnoreCase(COSTCENTER)) {
			value=jobOrder.getCostCenter();
		}
		else if(field.equalsIgnoreCase(CUSTOMDATE1)) {
			value=jobOrder.getCustomDate1();
		}
		else if(field.equalsIgnoreCase(CUSTOMDATE2)) {
			value=jobOrder.getCustomDate2();
		}
		else if(field.equalsIgnoreCase(CUSTOMDATE3)) {
			value=jobOrder.getCustomDate3();
		}
		else if(field.equalsIgnoreCase(CUSTOMFLOAT1)) {
			value=jobOrder.getCustomFloat1();
		}
		else if(field.equalsIgnoreCase(CUSTOMFLOAT2)) {
			value=jobOrder.getCustomFloat2();
		}
		else if(field.equalsIgnoreCase(CUSTOMFLOAT3)) {
			value=jobOrder.getCustomFloat3();
		}
		else if(field.equalsIgnoreCase(CUSTOMINT1)) {
			value=jobOrder.getCustomInt1();
		}
		else if(field.equalsIgnoreCase(CUSTOMINT2)) {
			value=jobOrder.getCustomInt2();
		}
		else if(field.equalsIgnoreCase(CUSTOMINT3)) {
			value=jobOrder.getCustomInt3();
		}
		else if(field.equalsIgnoreCase(CUSTOMTEXT1)) {
			value=jobOrder.getCustomText1();
		}
		else if(field.equalsIgnoreCase(CUSTOMTEXT10)) {
			value=jobOrder.getCustomText10();
		}
		else if(field.equalsIgnoreCase(CUSTOMTEXT11)) {
			value=jobOrder.getCustomText11();
		}
		else if(field.equalsIgnoreCase(CUSTOMTEXT12)) {
			value=jobOrder.getCustomText12();
		}
		else if(field.equalsIgnoreCase(CUSTOMTEXT13)) {
			value=jobOrder.getCustomText13();
		}
		else if(field.equalsIgnoreCase(CUSTOMTEXT14)) {
			value=jobOrder.getCustomText14();
		}
		else if(field.equalsIgnoreCase(CUSTOMTEXT15)) {
			value=jobOrder.getCustomText15();
		}
		else if(field.equalsIgnoreCase(CUSTOMTEXT16)) {
			value=jobOrder.getCustomText16();
		}
		else if(field.equalsIgnoreCase(CUSTOMTEXT17)) {
			value=jobOrder.getCustomText17();
		}
		else if(field.equalsIgnoreCase(CUSTOMTEXT18)) {
			value=jobOrder.getCustomText18();
		}
		else if(field.equalsIgnoreCase(CUSTOMTEXT19)) {
			value=jobOrder.getCustomText19();
		}
		else if(field.equalsIgnoreCase(CUSTOMTEXT2)) {
			value=jobOrder.getCustomText2();
		}
		else if(field.equalsIgnoreCase(CUSTOMTEXT20)) {
			value=jobOrder.getCustomText20();
		}
		else if(field.equalsIgnoreCase(CUSTOMTEXT3)) {
			value=jobOrder.getCustomText3();
		}
		else if(field.equalsIgnoreCase(CUSTOMTEXT4)) {
			value=jobOrder.getCustomText4();
		}
		else if(field.equalsIgnoreCase(CUSTOMTEXT5)) {
			value=jobOrder.getCustomText5();
		}
		else if(field.equalsIgnoreCase(CUSTOMTEXT6)) {
			value=jobOrder.getCustomText6();
		}
		else if(field.equalsIgnoreCase(CUSTOMTEXT7)) {
			value=jobOrder.getCustomText7();
		}
		else if(field.equalsIgnoreCase(CUSTOMTEXT8)) {
			value=jobOrder.getCustomText8();
		}
		else if(field.equalsIgnoreCase(CUSTOMTEXT9)) {
			value=jobOrder.getCustomText9();
		}
		else if(field.equalsIgnoreCase(CUSTOMTEXTBLOCK1)) {
			value=jobOrder.getCustomTextBlock1();
		}
		else if(field.equalsIgnoreCase(CUSTOMTEXTBLOCK2)) {
			value=jobOrder.getCustomTextBlock2();
		}
		else if(field.equalsIgnoreCase(CUSTOMTEXTBLOCK3)) {
			value=jobOrder.getCustomTextBlock3();
		}
		else if(field.equalsIgnoreCase(CUSTOMTEXTBLOCK4)) {
			value=jobOrder.getCustomTextBlock4();
		}
		else if(field.equalsIgnoreCase(CUSTOMTEXTBLOCK5)) {
			value=jobOrder.getCustomTextBlock5();
		}
		else if(field.equalsIgnoreCase(DATEADDED)) {
			value=jobOrder.getDateAdded();
		}
		else if(field.equalsIgnoreCase(DATECLOSED)) {
			value=jobOrder.getDateClosed();
		}
		else if(field.equalsIgnoreCase(DATEEND)) {
			value=jobOrder.getDateEnd();
		}
		else if(field.equalsIgnoreCase(DATELASTEXPORTED)) {
			value=jobOrder.getDateLastExported();
		}
		else if(field.equalsIgnoreCase(DEGREELIST)) {
			value=jobOrder.getDegreeList();
		}
		else if(field.equalsIgnoreCase(DESCRIPTION)) {
			value=jobOrder.getDescription();
		}
		else if(field.equalsIgnoreCase(DURATIONWEEKS)) {
			value=jobOrder.getDurationWeeks();
		}
		else if(field.equalsIgnoreCase(EDUCATIONDEGREE)) {
			value=jobOrder.getEducationDegree();
		}
		else if(field.equalsIgnoreCase(EMPLOYMENTTYPE)) {
			value=jobOrder.getEmploymentType();
		}
		else if(field.equalsIgnoreCase(EXTERNALCATEGORYID)) {
			value=jobOrder.getExternalCategoryID();
		}
		else if(field.equalsIgnoreCase(EXTERNALID)) {
			value=jobOrder.getExternalID();
		}
		else if(field.equalsIgnoreCase(FEEARRANGEMENT)) {
			value=jobOrder.getFeeArrangement();
		}
		else if(field.equalsIgnoreCase(HOURSOFOPERATION)) {
			value=jobOrder.getHoursOfOperation();
		}
		else if(field.equalsIgnoreCase(HOURSPERWEEK)) {
			value=jobOrder.getHoursPerWeek();
		}
		else if(field.equalsIgnoreCase(ISCLIENTEDITABLE)) {
			value=jobOrder.isIsClientEditable();
		}
		else if(field.equalsIgnoreCase(ISDELETED)) {
			value=jobOrder.isIsDeleted();
		}
		else if(field.equalsIgnoreCase(ISINTERVIEWREQUIRED)) {
			value=jobOrder.isIsInterviewRequired();
		}
		else if(field.equalsIgnoreCase(ISJOBCASTPUBLISHED)) {
			value=jobOrder.isIsJobcastPublished();
		}
		else if(field.equalsIgnoreCase(ISOPEN)) {
			value=jobOrder.isIsOpen();
		}
		else if(field.equalsIgnoreCase(ISPUBLIC)) {
			value=jobOrder.getIsPublic();
		}
		else if(field.equalsIgnoreCase(JOBBOARDLIST)) {
			value=jobOrder.getJobBoardList();
		}
		else if(field.equalsIgnoreCase(JOBORDERID) || field.equalsIgnoreCase(JOBPOSTINGID)) {
			value=jobOrder.getJobOrderID();
		}
		else if(field.equalsIgnoreCase(NUMOPENINGS)) {
			value=jobOrder.getNumOpenings();
		}
		else if(field.equalsIgnoreCase(ONSITE)) {
			value=jobOrder.getOnSite();
		}
		else if(field.equalsIgnoreCase(OPTIONSPACKAGE)) {
			value=jobOrder.getOptionsPackage();
		}
		else if(field.equalsIgnoreCase(OWNERID)) {
			value=jobOrder.getOwnerID();
		}
		else if(field.equalsIgnoreCase(PAYRATE)) {
			value=jobOrder.getPayRate();
		}
		else if(field.equalsIgnoreCase(PUBLICDESCRIPTION)) {
			value=jobOrder.getPublicDescription();
		}
		else if(field.equalsIgnoreCase(PUBLISHEDZIP)) {
			value=jobOrder.getPublishedZip();
		}
		else if(field.equalsIgnoreCase(REASONCLOSED)) {
			value=jobOrder.getReasonClosed();
		}
		else if(field.equalsIgnoreCase(REPORTTO)) {
			value=jobOrder.getReportTo();
		}
		else if(field.equalsIgnoreCase(REPORTTOCLIENTCONTACTID) || field.equalsIgnoreCase(REPORTTOUSERID) ) {
			value=jobOrder.getReportToClientContactID();
		}
		else if(field.equalsIgnoreCase(RESPONSEUSERID)) {
			value=jobOrder.getResponseUserID();
		}
		else if(field.equalsIgnoreCase(SALARY)) {
			value=jobOrder.getSalary();
		}
		else if(field.equalsIgnoreCase(SALARYUNIT)) {
			value=jobOrder.getSalaryUnit();
		}
		else if(field.equalsIgnoreCase(SHIFTID)) {
			value=jobOrder.getShiftID();
		}
		else if(field.equalsIgnoreCase(SKILLLIST)) {
			value=jobOrder.getSkillList();
		}
		else if(field.equalsIgnoreCase(SOURCE)) {
			value=jobOrder.getSource();
		}
		else if(field.equalsIgnoreCase(STARTDATE)) {
			value=jobOrder.getStartDate();
		}
		else if(field.equalsIgnoreCase(STATUS)) {
			value=jobOrder.getStatus();
		}
		else if(field.equalsIgnoreCase(TAXRATE)) {
			value=jobOrder.getTaxRate();
		}
		else if(field.equalsIgnoreCase(TAXSTATUS)) {
			value=jobOrder.getTaxStatus();
		}
		else if(field.equalsIgnoreCase(TITLE)) {
			value=jobOrder.getTitle();
		}
		else if(field.equalsIgnoreCase(TRAVELREQUIREMENTS)) {
			value=jobOrder.getTravelRequirements();
		}
		else if(field.equalsIgnoreCase(TYPE)) {
			value=jobOrder.getType();
		}
		else if(field.equalsIgnoreCase(WILLRELOCATE)) {
			value=jobOrder.isWillRelocate();
		}
		else if(field.equalsIgnoreCase(WILLSPONSOR)) {
			value=jobOrder.isWillSponsor();
		}
		else if(field.equalsIgnoreCase(WORKERSCOMPRATEID)) {
			value=jobOrder.getWorkersCompRateID();
		}
		else if(field.equalsIgnoreCase(YEARSREQUIRED)) {
			value=jobOrder.getYearsRequired();
		}
		else if(field.equalsIgnoreCase(ADDRESS1)) {
			value=jobOrder.getAddress().getAddress1();
		}
		else if(field.equalsIgnoreCase(CITY)) {
			value=jobOrder.getAddress().getCity();
		}
		else if(field.equalsIgnoreCase(COUNTRYID)) {
			value=jobOrder.getAddress().getCountryID();
		}
		else if(field.equalsIgnoreCase(STATE)) {
			value=jobOrder.getAddress().getState();
		}
		else if(field.equalsIgnoreCase(ZIP)) {
			value=jobOrder.getAddress().getZip();
		}
		else {
			throw new NoSuchMethodException();
		}
		
		return value;
	}

    private String ADDRESS="address";
    private String BENEFITS="benefits";
    private String BILLRATECATEGORYID="billRateCategoryID";
    private String BONUSPACKAGE="bonusPackage";
    private String BRANCHCODE="branchCode";
    private String CERTIFICATIONLIST="certificationList";
    private String CLIENTBILLRATE="clientBillRate";
    private String CLIENTCONTACTID="clientContactID";
    private String CLIENTCORPORATIONID="clientCorporationID";
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
    private String CUSTOMDATE1="customDate1";
    private String CUSTOMDATE2="customDate2";
    private String CUSTOMDATE3="customDate3";
    private String CUSTOMFLOAT1="customFloat1";
    private String CUSTOMFLOAT2="customFloat2";
    private String CUSTOMFLOAT3="customFloat3";
    private String CUSTOMINT1="customInt1";
    private String CUSTOMINT2="customInt2";
    private String CUSTOMINT3="customInt3";
    private String CUSTOMTEXT1="customText1";
    private String CUSTOMTEXT10="customText10";
    private String CUSTOMTEXT11="customText11";
    private String CUSTOMTEXT12="customText12";
    private String CUSTOMTEXT13="customText13";
    private String CUSTOMTEXT14="customText14";
    private String CUSTOMTEXT15="customText15";
    private String CUSTOMTEXT16="customText16";
    private String CUSTOMTEXT17="customText17";
    private String CUSTOMTEXT18="customText18";
    private String CUSTOMTEXT19="customText19";
    private String CUSTOMTEXT2="customText2";
    private String CUSTOMTEXT20="customText20";
    private String CUSTOMTEXT3="customText3";
    private String CUSTOMTEXT4="customText4";
    private String CUSTOMTEXT5="customText5";
    private String CUSTOMTEXT6="customText6";
    private String CUSTOMTEXT7="customText7";
    private String CUSTOMTEXT8="customText8";
    private String CUSTOMTEXT9="customText9";
    private String CUSTOMTEXTBLOCK1="customTextBlock1";
    private String CUSTOMTEXTBLOCK2="customTextBlock2";
    private String CUSTOMTEXTBLOCK3="customTextBlock3";
    private String CUSTOMTEXTBLOCK4="customTextBlock4";
    private String CUSTOMTEXTBLOCK5="customTextBlock5";
    private String DATEADDED="dateAdded";
    private String DATECLOSED="dateClosed";
    private String DATEEND="dateEnd";
    private String DATELASTEXPORTED="dateLastExported";
    private String DEGREELIST="degreeList";
    private String DESCRIPTION="description";
    private String DURATIONWEEKS="durationWeeks";
    private String EDUCATIONDEGREE="educationDegree";
    private String EMPLOYMENTTYPE="employmentType";
    private String EXTERNALCATEGORYID="externalCategoryID";
    private String EXTERNALID="externalID";
    private String FEEARRANGEMENT="feeArrangement";
    private String HOURSOFOPERATION="hoursOfOperation";
    private String HOURSPERWEEK="hoursPerWeek";
    private String ISCLIENTEDITABLE="isClientEditable";
    private String ISDELETED="isDeleted";
    private String ISINTERVIEWREQUIRED="isInterviewRequired";
    private String ISJOBCASTPUBLISHED="isJobcastPublished";
    private String ISOPEN="isOpen";
    private String ISPUBLIC="isPublic";
    private String JOBBOARDLIST="jobBoardList";
    private String JOBORDERID="jobOrderID";
    private String JOBPOSTINGID="jobPostingID";
    private String NUMOPENINGS="numOpenings";
    private String ONSITE="onSite";
    private String OPTIONSPACKAGE="optionsPackage";
    private String OWNERID="ownerID";
    private String PAYRATE="payRate";
    private String PUBLICDESCRIPTION="publicDescription";
    private String PUBLISHEDZIP="publishedZip";
    private String REASONCLOSED="reasonClosed";
    private String REPORTTO="reportTo";
    private String REPORTTOCLIENTCONTACTID="reportToClientContactID";
    private String REPORTTOUSERID="reportToUserID";
    private String RESPONSEUSERID="responseUserID";
    private String SALARY="salary";
    private String SALARYUNIT="salaryUnit";
    private String SHIFTID="shiftID";
    private String SKILLLIST="skillList";
    private String SOURCE="source";
    private String STARTDATE="startDate";
    private String STATUS="status";
    private String TAXRATE="taxRate";
    private String TAXSTATUS="taxStatus";
    private String TITLE="title";
    private String TRAVELREQUIREMENTS="travelRequirements";
    private String TYPE="type";
    private String WILLRELOCATE="willRelocate";
    private String WILLSPONSOR="willSponsor";
    private String WORKERSCOMPRATEID="workersCompRateID";
    private String YEARSREQUIRED="yearsRequired";
    private String ADDRESS1="address1";
    private String CITY="city";
    private String COUNTRYID="countryID";
    private String STATE="state";
    private String ZIP="zip";

}
