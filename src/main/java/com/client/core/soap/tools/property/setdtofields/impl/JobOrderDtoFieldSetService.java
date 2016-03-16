package com.client.core.soap.tools.property.setdtofields.impl;

import java.util.Map;

import org.springframework.stereotype.Service;

import com.bullhorn.entity.job.JobOrderDto;
import com.client.core.soap.tools.property.setdtofields.DtoFieldSetService;
import com.client.core.base.util.Utility;

@Service("jobOrderSetService")
public class JobOrderDtoFieldSetService extends DtoFieldSetService<JobOrderDto> {

	@Override
	public JobOrderDto changeDto(JobOrderDto jobOrder, Map<String, String> fieldValues, 
			String dateFormat, Boolean isDotPrefixed) {
		for(String initialField : fieldValues.keySet()) {
			String value = fieldValues.get(initialField);

			String field = initialField;
			if(isDotPrefixed) {
				field = removeDotPrefix(initialField);
			}
			
		    if(field.equalsIgnoreCase(BENEFITS)) {

				jobOrder.setBenefits(value);

		    } else if(field.equalsIgnoreCase(BILLRATECATEGORYID)) {

				jobOrder.setBillRateCategoryID(Utility.forceParseInteger(value));

		    } else if(field.equalsIgnoreCase(BONUSPACKAGE)) {

				jobOrder.setBonusPackage(value);

		    } else if(field.equalsIgnoreCase(BRANCHCODE)) {

				jobOrder.setBranchCode(value);

		    } else if(field.equalsIgnoreCase(CERTIFICATIONLIST)) {

				jobOrder.setCertificationList(value);

		    } else if(field.equalsIgnoreCase(CLIENTBILLRATE)) {

				jobOrder.setClientBillRate(Utility.forceParseBigDecimal(value));

		    } else if(field.equalsIgnoreCase(CLIENTCONTACTID)) {

				jobOrder.setClientContactID(Utility.forceParseInteger(value));

		    } else if(field.equalsIgnoreCase(CLIENTCORPORATIONID)) {

				jobOrder.setClientCorporationID(Utility.forceParseInteger(value));

		    } else if(field.equalsIgnoreCase(CORRELATEDCUSTOMDATE1)) {

				jobOrder.setCorrelatedCustomDate1(Utility.forceParseStringToXMLGregorianCalendar(value, dateFormat));

		    } else if(field.equalsIgnoreCase(CORRELATEDCUSTOMDATE2)) {

				jobOrder.setCorrelatedCustomDate2(Utility.forceParseStringToXMLGregorianCalendar(value, dateFormat));

		    } else if(field.equalsIgnoreCase(CORRELATEDCUSTOMDATE3)) {

				jobOrder.setCorrelatedCustomDate3(Utility.forceParseStringToXMLGregorianCalendar(value, dateFormat));

		    } else if(field.equalsIgnoreCase(CORRELATEDCUSTOMFLOAT1)) {

				jobOrder.setCorrelatedCustomFloat1(Utility.forceParseDouble(value));

		    } else if(field.equalsIgnoreCase(CORRELATEDCUSTOMFLOAT2)) {

				jobOrder.setCorrelatedCustomFloat2(Utility.forceParseDouble(value));

		    } else if(field.equalsIgnoreCase(CORRELATEDCUSTOMFLOAT3)) {

				jobOrder.setCorrelatedCustomFloat3(Utility.forceParseDouble(value));

		    } else if(field.equalsIgnoreCase(CORRELATEDCUSTOMINT1)) {

				jobOrder.setCorrelatedCustomInt1(Utility.forceParseInteger(value));

		    } else if(field.equalsIgnoreCase(CORRELATEDCUSTOMINT2)) {

				jobOrder.setCorrelatedCustomInt2(Utility.forceParseInteger(value));

		    } else if(field.equalsIgnoreCase(CORRELATEDCUSTOMINT3)) {

				jobOrder.setCorrelatedCustomInt3(Utility.forceParseInteger(value));

		    } else if(field.equalsIgnoreCase(CORRELATEDCUSTOMTEXT1)) {

				jobOrder.setCorrelatedCustomText1(value);

		    } else if(field.equalsIgnoreCase(CORRELATEDCUSTOMTEXT10)) {

				jobOrder.setCorrelatedCustomText10(value);

		    } else if(field.equalsIgnoreCase(CORRELATEDCUSTOMTEXT2)) {

				jobOrder.setCorrelatedCustomText2(value);

		    } else if(field.equalsIgnoreCase(CORRELATEDCUSTOMTEXT3)) {

				jobOrder.setCorrelatedCustomText3(value);

		    } else if(field.equalsIgnoreCase(CORRELATEDCUSTOMTEXT4)) {

				jobOrder.setCorrelatedCustomText4(value);

		    } else if(field.equalsIgnoreCase(CORRELATEDCUSTOMTEXT5)) {

				jobOrder.setCorrelatedCustomText5(value);

		    } else if(field.equalsIgnoreCase(CORRELATEDCUSTOMTEXT6)) {

				jobOrder.setCorrelatedCustomText6(value);

		    } else if(field.equalsIgnoreCase(CORRELATEDCUSTOMTEXT7)) {

				jobOrder.setCorrelatedCustomText7(value);

		    } else if(field.equalsIgnoreCase(CORRELATEDCUSTOMTEXT8)) {

				jobOrder.setCorrelatedCustomText8(value);

		    } else if(field.equalsIgnoreCase(CORRELATEDCUSTOMTEXT9)) {

				jobOrder.setCorrelatedCustomText9(value);

		    } else if(field.equalsIgnoreCase(CORRELATEDCUSTOMTEXTBLOCK1)) {

				jobOrder.setCorrelatedCustomTextBlock1(value);

		    } else if(field.equalsIgnoreCase(CORRELATEDCUSTOMTEXTBLOCK2)) {

				jobOrder.setCorrelatedCustomTextBlock2(value);

		    } else if(field.equalsIgnoreCase(CORRELATEDCUSTOMTEXTBLOCK3)) {

				jobOrder.setCorrelatedCustomTextBlock3(value);

		    } else if(field.equalsIgnoreCase(COSTCENTER)) {

				jobOrder.setCostCenter(value);

		    } else if(field.equalsIgnoreCase(CUSTOMDATE1)) {

				jobOrder.setCustomDate1(Utility.forceParseStringToXMLGregorianCalendar(value, dateFormat));

		    } else if(field.equalsIgnoreCase(CUSTOMDATE2)) {

				jobOrder.setCustomDate2(Utility.forceParseStringToXMLGregorianCalendar(value, dateFormat));

		    } else if(field.equalsIgnoreCase(CUSTOMDATE3)) {

				jobOrder.setCustomDate3(Utility.forceParseStringToXMLGregorianCalendar(value, dateFormat));

		    } else if(field.equalsIgnoreCase(CUSTOMFLOAT1)) {

				jobOrder.setCustomFloat1(Utility.forceParseDouble(value));

		    } else if(field.equalsIgnoreCase(CUSTOMFLOAT2)) {

				jobOrder.setCustomFloat2(Utility.forceParseDouble(value));

		    } else if(field.equalsIgnoreCase(CUSTOMFLOAT3)) {

				jobOrder.setCustomFloat3(Utility.forceParseDouble(value));

		    } else if(field.equalsIgnoreCase(CUSTOMINT1)) {

				jobOrder.setCustomInt1(Utility.forceParseInteger(value));

		    } else if(field.equalsIgnoreCase(CUSTOMINT2)) {

				jobOrder.setCustomInt2(Utility.forceParseInteger(value));

		    } else if(field.equalsIgnoreCase(CUSTOMINT3)) {

				jobOrder.setCustomInt3(Utility.forceParseInteger(value));

		    } else if(field.equalsIgnoreCase(CUSTOMTEXT1)) {

				jobOrder.setCustomText1(value);

		    } else if(field.equalsIgnoreCase(CUSTOMTEXT10)) {

				jobOrder.setCustomText10(value);

		    } else if(field.equalsIgnoreCase(CUSTOMTEXT11)) {

				jobOrder.setCustomText11(value);

		    } else if(field.equalsIgnoreCase(CUSTOMTEXT12)) {

				jobOrder.setCustomText12(value);

		    } else if(field.equalsIgnoreCase(CUSTOMTEXT13)) {

				jobOrder.setCustomText13(value);

		    } else if(field.equalsIgnoreCase(CUSTOMTEXT14)) {

				jobOrder.setCustomText14(value);

		    } else if(field.equalsIgnoreCase(CUSTOMTEXT15)) {

				jobOrder.setCustomText15(value);

		    } else if(field.equalsIgnoreCase(CUSTOMTEXT16)) {

				jobOrder.setCustomText16(value);

		    } else if(field.equalsIgnoreCase(CUSTOMTEXT17)) {

				jobOrder.setCustomText17(value);

		    } else if(field.equalsIgnoreCase(CUSTOMTEXT18)) {

				jobOrder.setCustomText18(value);

		    } else if(field.equalsIgnoreCase(CUSTOMTEXT19)) {

				jobOrder.setCustomText19(value);

		    } else if(field.equalsIgnoreCase(CUSTOMTEXT2)) {

				jobOrder.setCustomText2(value);

		    } else if(field.equalsIgnoreCase(CUSTOMTEXT20)) {

				jobOrder.setCustomText20(value);

		    } else if(field.equalsIgnoreCase(CUSTOMTEXT3)) {

				jobOrder.setCustomText3(value);

		    } else if(field.equalsIgnoreCase(CUSTOMTEXT4)) {

				jobOrder.setCustomText4(value);

		    } else if(field.equalsIgnoreCase(CUSTOMTEXT5)) {

				jobOrder.setCustomText5(value);

		    } else if(field.equalsIgnoreCase(CUSTOMTEXT6)) {

				jobOrder.setCustomText6(value);

		    } else if(field.equalsIgnoreCase(CUSTOMTEXT7)) {

				jobOrder.setCustomText7(value);

		    } else if(field.equalsIgnoreCase(CUSTOMTEXT8)) {

				jobOrder.setCustomText8(value);

		    } else if(field.equalsIgnoreCase(CUSTOMTEXT9)) {

				jobOrder.setCustomText9(value);

		    } else if(field.equalsIgnoreCase(CUSTOMTEXTBLOCK1)) {

				jobOrder.setCustomTextBlock1(value);

		    } else if(field.equalsIgnoreCase(CUSTOMTEXTBLOCK2)) {

				jobOrder.setCustomTextBlock2(value);

		    } else if(field.equalsIgnoreCase(CUSTOMTEXTBLOCK3)) {

				jobOrder.setCustomTextBlock3(value);

		    } else if(field.equalsIgnoreCase(CUSTOMTEXTBLOCK4)) {

				jobOrder.setCustomTextBlock4(value);

		    } else if(field.equalsIgnoreCase(CUSTOMTEXTBLOCK5)) {

				jobOrder.setCustomTextBlock5(value);

		    } else if(field.equalsIgnoreCase(DATEADDED)) {

				jobOrder.setDateAdded(Utility.forceParseStringToXMLGregorianCalendar(value, dateFormat));

		    } else if(field.equalsIgnoreCase(DATECLOSED)) {

				jobOrder.setDateClosed(Utility.forceParseStringToXMLGregorianCalendar(value, dateFormat));

		    } else if(field.equalsIgnoreCase(DATEEND)) {

				jobOrder.setDateEnd(Utility.forceParseStringToXMLGregorianCalendar(value, dateFormat));

		    } else if(field.equalsIgnoreCase(DATELASTEXPORTED)) {

				jobOrder.setDateLastExported(Utility.forceParseStringToXMLGregorianCalendar(value, dateFormat));

		    } else if(field.equalsIgnoreCase(DEGREELIST)) {

				jobOrder.setDegreeList(value);

		    } else if(field.equalsIgnoreCase(DESCRIPTION)) {

				jobOrder.setDescription(value);

		    } else if(field.equalsIgnoreCase(DURATIONWEEKS)) {

				jobOrder.setDurationWeeks(Utility.forceParseDouble(value));

		    } else if(field.equalsIgnoreCase(EDUCATIONDEGREE)) {

				jobOrder.setEducationDegree(value);

		    } else if(field.equalsIgnoreCase(EMPLOYMENTTYPE)) {

				jobOrder.setEmploymentType(value);

		    } else if(field.equalsIgnoreCase(EXTERNALCATEGORYID)) {

				jobOrder.setExternalCategoryID(Utility.forceParseInteger(value));

		    } else if(field.equalsIgnoreCase(EXTERNALID)) {

				jobOrder.setExternalID(value);

		    } else if(field.equalsIgnoreCase(FEEARRANGEMENT)) {

				jobOrder.setFeeArrangement(Utility.forceParseDouble(value));

		    } else if(field.equalsIgnoreCase(HOURSOFOPERATION)) {

				jobOrder.setHoursOfOperation(value);

		    } else if(field.equalsIgnoreCase(HOURSPERWEEK)) {

				jobOrder.setHoursPerWeek(Utility.forceParseDouble(value));

		    } else if(field.equalsIgnoreCase(ISCLIENTEDITABLE)) {

				jobOrder.setIsClientEditable(Utility.parseBoolean(value));

		    } else if(field.equalsIgnoreCase(ISDELETED)) {

				jobOrder.setIsDeleted(Utility.parseBoolean(value));

		    } else if(field.equalsIgnoreCase(ISINTERVIEWREQUIRED)) {

				jobOrder.setIsInterviewRequired(Utility.parseBoolean(value));

		    } else if(field.equalsIgnoreCase(ISJOBCASTPUBLISHED)) {

				jobOrder.setIsJobcastPublished(Utility.parseBoolean(value));

		    } else if(field.equalsIgnoreCase(ISOPEN)) {

				jobOrder.setIsOpen(Utility.parseBoolean(value));

		    } else if(field.equalsIgnoreCase(ISPUBLIC)) {

				jobOrder.setIsPublic(Utility.forceParseInteger(value));

		    } else if(field.equalsIgnoreCase(JOBBOARDLIST)) {

				jobOrder.setJobBoardList(value);

		    } else if(field.equalsIgnoreCase(JOBORDERID)) {

				jobOrder.setJobOrderID(Utility.forceParseInteger(value));

		    } else if(field.equalsIgnoreCase(NUMOPENINGS)) {

				jobOrder.setNumOpenings(Utility.forceParseInteger(value));

		    } else if(field.equalsIgnoreCase(ONSITE)) {

				jobOrder.setOnSite(value);

		    } else if(field.equalsIgnoreCase(OPTIONSPACKAGE)) {

				jobOrder.setOptionsPackage(value);

		    } else if(field.equalsIgnoreCase(OWNERID)) {

				jobOrder.setOwnerID(Utility.forceParseInteger(value));

		    } else if(field.equalsIgnoreCase(PAYRATE)) {

				jobOrder.setPayRate(Utility.forceParseBigDecimal(value));

		    } else if(field.equalsIgnoreCase(PUBLICDESCRIPTION)) {

				jobOrder.setPublicDescription(value);

		    } else if(field.equalsIgnoreCase(PUBLISHEDZIP)) {

				jobOrder.setPublishedZip(value);

		    } else if(field.equalsIgnoreCase(REASONCLOSED)) {

				jobOrder.setReasonClosed(value);

		    } else if(field.equalsIgnoreCase(REPORTTO)) {

				jobOrder.setReportTo(value);

		    } else if(field.equalsIgnoreCase(REPORTTOCLIENTCONTACTID)) {

				jobOrder.setReportToClientContactID(Utility.forceParseInteger(value));

		    } else if(field.equalsIgnoreCase(RESPONSEUSERID)) {

				jobOrder.setResponseUserID(Utility.forceParseInteger(value));

		    } else if(field.equalsIgnoreCase(SALARY)) {

				jobOrder.setSalary(Utility.forceParseBigDecimal(value));

		    } else if(field.equalsIgnoreCase(SALARYUNIT)) {

				jobOrder.setSalaryUnit(value);

		    } else if(field.equalsIgnoreCase(SHIFTID)) {

				jobOrder.setShiftID(Utility.forceParseInteger(value));

		    } else if(field.equalsIgnoreCase(SKILLLIST)) {

				jobOrder.setSkillList(value);

		    } else if(field.equalsIgnoreCase(SOURCE)) {

				jobOrder.setSource(value);

		    } else if(field.equalsIgnoreCase(STARTDATE)) {

				jobOrder.setStartDate(Utility.forceParseStringToXMLGregorianCalendar(value, dateFormat));

		    } else if(field.equalsIgnoreCase(STATUS)) {

				jobOrder.setStatus(value);

		    } else if(field.equalsIgnoreCase(TAXRATE)) {

				jobOrder.setTaxRate(Utility.forceParseDouble(value));

		    } else if(field.equalsIgnoreCase(TAXSTATUS)) {

				jobOrder.setTaxStatus(value);

		    } else if(field.equalsIgnoreCase(TITLE)) {

				jobOrder.setTitle(value);

		    } else if(field.equalsIgnoreCase(TRAVELREQUIREMENTS)) {

				jobOrder.setTravelRequirements(value);

		    } else if(field.equalsIgnoreCase(TYPE)) {

				jobOrder.setType(Utility.forceParseInteger(value));

		    } else if(field.equalsIgnoreCase(WILLRELOCATE)) {

				jobOrder.setWillRelocate(Utility.parseBoolean(value));

		    } else if(field.equalsIgnoreCase(WILLSPONSOR)) {

				jobOrder.setWillSponsor(Utility.parseBoolean(value));

		    } else if(field.equalsIgnoreCase(WORKERSCOMPRATEID)) {

				jobOrder.setWorkersCompRateID(Utility.forceParseInteger(value));

		    } else if(field.equalsIgnoreCase(YEARSREQUIRED)) {

				jobOrder.setYearsRequired(Utility.forceParseInteger(value));

		    } else if(field.equalsIgnoreCase(ADDRESS1)) {

				jobOrder.getAddress().setAddress1(value);

		    } else if(field.equalsIgnoreCase(CITY)) {

				jobOrder.getAddress().setCity(value);

		    } else if(field.equalsIgnoreCase(COUNTRYID)) {

				jobOrder.getAddress().setCountryID(Utility.forceParseInteger(value));

		    } else if(field.equalsIgnoreCase(STATE)) {

				jobOrder.getAddress().setState(value);

		    } else if(field.equalsIgnoreCase(ZIP)) {

				jobOrder.getAddress().setZip(value);
				
			}
			
		}
		return jobOrder;
	}

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
