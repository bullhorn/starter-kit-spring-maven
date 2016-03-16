package com.client.core.soap.tools.property.getdtofields.impl;

import org.springframework.stereotype.Service;

import com.bullhorn.entity.candidate.CandidateDto;
import com.client.core.soap.tools.property.getdtofields.DtoFieldGetService;

@Service("candidateGetService")
public class CandidateDtoFieldGetService extends DtoFieldGetService<CandidateDto> {
	
	public CandidateDtoFieldGetService() {
		super();
	}
	
	@Override
	public Object retrieveField(String field, CandidateDto candidate, Boolean isDotPrefixed) throws NoSuchMethodException {
		Object value = null;
		
		if(isDotPrefixed) {
			field = removeDotPrefix(field);
		}
		
		if (field.equalsIgnoreCase(CATEGORYID)) {
			value = candidate.getCategoryID();
		}
		else if (field.equalsIgnoreCase(CERTIFICATIONS)) {
			value = candidate.getCertifications();
		}
		else if (field.equalsIgnoreCase(COMMENTS)) {
			value = candidate.getComments();
		}
		else if (field.equalsIgnoreCase(COMPANYNAME)) {
			value = candidate.getCompanyName();
		}
		else if (field.equalsIgnoreCase(COMPANYURL)) {
			value = candidate.getCompanyURL();
		}
		else if (field.equalsIgnoreCase(CUSTOMTEXTBLOCK1)) {
			value = candidate.getCustomTextBlock1();
		}
		else if (field.equalsIgnoreCase(CUSTOMTEXTBLOCK2)) {
			value = candidate.getCustomTextBlock2();
		}
		else if (field.equalsIgnoreCase(CUSTOMTEXTBLOCK3)) {
			value = candidate.getCustomTextBlock3();
		}
		else if (field.equalsIgnoreCase(CUSTOMTEXTBLOCK4)) {
			value = candidate.getCustomTextBlock4();
		}
		else if (field.equalsIgnoreCase(CUSTOMTEXTBLOCK5)) {
			value = candidate.getCustomTextBlock5();
		}
		else if (field.equalsIgnoreCase(DATEADDED)) {
			value = candidate.getDateAdded();
		}
		else if (field.equalsIgnoreCase(DATEAVAILABLE)) {
			value = candidate.getDateAvailable();
		}
		else if (field.equalsIgnoreCase(DATEAVAILABLEEND)) {
			value = candidate.getDateAvailableEnd();
		}
		else if (field.equalsIgnoreCase(DATEI9EXPIRATION)) {
			value = candidate.getDateI9Expiration();
		}
		else if (field.equalsIgnoreCase(DATENEXTCALL)) {
			value = candidate.getDateNextCall();
		}
		else if (field.equalsIgnoreCase(DATEOFBIRTH)) {
			value = candidate.getDateOfBirth();
		}
		else if (field.equalsIgnoreCase(DAYRATE)) {
			value = candidate.getDayRate();
		}
		else if (field.equalsIgnoreCase(DAYRATELOW)) {
			value = candidate.getDayRateLow();
		}
		else if (field.equalsIgnoreCase(DEGREELIST)) {
			value = candidate.getDegreeList();
		}
		else if (field.equalsIgnoreCase(DESCRIPTION)) {
			value = candidate.getDescription();
		}
		else if (field.equalsIgnoreCase(DESIREDLOCATIONS)) {
			value = candidate.getDesiredLocations();
		}
		else if (field.equalsIgnoreCase(DISABILITY)) {
			value = candidate.getDisability();
		}
		else if (field.equalsIgnoreCase(EDUCATIONDEGREE)) {
			value = candidate.getEducationDegree();
		}
		else if (field.equalsIgnoreCase(EMPLOYEETYPE)) {
			value = candidate.getEmployeeType();
		}
		else if (field.equalsIgnoreCase(EMPLOYMENTPREFERENCE)) {
			value = candidate.getEmploymentPreference();
		}
		else if (field.equalsIgnoreCase(ETHNICITY)) {
			value = candidate.getEthnicity();
		}
		else if (field.equalsIgnoreCase(EXPERIENCE)) {
			value = candidate.getExperience();
		}
		else if (field.equalsIgnoreCase(EXTERNALID)) {
			value = candidate.getExternalID();
		}
		else if (field.equalsIgnoreCase(FEDERALADDTIONALWITHOLDINGSAMOUNT)) {
			value = candidate.getFederalAddtionalWitholdingsAmount();
		}
		else if (field.equalsIgnoreCase(FEDERALEXEMPTIONS)) {
			value = candidate.getFederalExemptions();
		}
		else if (field.equalsIgnoreCase(FEDERALFILINGSTATUS)) {
			value = candidate.getFederalFilingStatus();
		}
		else if (field.equalsIgnoreCase(GENDER)) {
			value = candidate.getGender();
		}
		else if (field.equalsIgnoreCase(HOURLYRATE)) {
			value = candidate.getHourlyRate();
		}
		else if (field.equalsIgnoreCase(HOURLYRATELOW)) {
			value = candidate.getHourlyRateLow();
		}
		else if (field.equalsIgnoreCase(I9ONFILE)) {
			value = candidate.getHourlyRateLow();
		}
		else if (field.equalsIgnoreCase(ISEDITABLE)) {
			value = candidate.isIsEditable();
		}
		else if (field.equalsIgnoreCase(LINKEDPERSONID)) {
			value = candidate.getLinkedPersonID();
		}
		else if (field.equalsIgnoreCase(LOCALADDTIONALWITHOLDINGSAMOUNT)) {
			value = candidate.getLocalAddtionalWitholdingsAmount();
		}
		else if (field.equalsIgnoreCase(LOCALEXEMPTIONS)) {
			value = candidate.getLocalExemptions();
		}
		else if (field.equalsIgnoreCase(LOCALFILINGSTATUS)) {
			value = candidate.getLocalFilingStatus();
		}
		else if (field.equalsIgnoreCase(LOCALTAXCODE)) {
			value = candidate.getLocalTaxCode();
		}
		else if (field.equalsIgnoreCase(MIGRATEGUID)) {
			value = candidate.getMigrateGUID();
		}
		else if (field.equalsIgnoreCase(NUMCATEGORIES)) {
			value = candidate.getNumCategories();
		}
		else if (field.equalsIgnoreCase(NUMOWNERS)) {
			value = candidate.getNumOwners();
		}
		else if (field.equalsIgnoreCase(OWNERCORPORATIONID)) {
			value = candidate.getOwnerCorporationID();
		}
		else if (field.equalsIgnoreCase(OWNERID)) {
			value = candidate.getOwnerID();
		}
		else if (field.equalsIgnoreCase(PAPERWORKONFILE)) {
			value = candidate.getPaperWorkOnFile();
		}
		else if (field.equalsIgnoreCase(PASSWORD)) {
			value = candidate.getPassword();
		}
		else if (field.equalsIgnoreCase(PREFERREDCONTACT)) {
			value = candidate.getPreferredContact();
		}
		else if (field.equalsIgnoreCase(RECENTCLIENTLIST)) {
			value = candidate.getRecentClientList();
		}
		else if (field.equalsIgnoreCase(REFERREDBY)) {
			value = candidate.getReferredBy();
		}
		else if (field.equalsIgnoreCase(REFERREDBYPERSONID)) {
			value = candidate.getReferredByPersonID();
		}
		else if (field.equalsIgnoreCase(SALARY)) {
			value = candidate.getSalary();
		}
		else if (field.equalsIgnoreCase(SALARYLOW)) {
			value = candidate.getSalaryLow();
		}
		else if (field.equalsIgnoreCase(SECONDARYADDRESS)) {
			value = candidate.getSecondaryAddress();
		}
		else if (field.equalsIgnoreCase(SKILLSET)) {
			value = candidate.getSkillSet();
		}
		else if (field.equalsIgnoreCase(source)) {
			value = candidate.getSource();
		}
		else if (field.equalsIgnoreCase(SSN)) {
			value = candidate.getSsn();
		}
		else if (field.equalsIgnoreCase(STATEADDTIONALWITHOLDINGSAMOUNT)) {
			value = candidate.getStateAddtionalWitholdingsAmount();
		}
		else if (field.equalsIgnoreCase(STATEEXEMPTIONS)) {
			value = candidate.getStateExemptions();
		}
		else if (field.equalsIgnoreCase(STATEFILINGSTATUS)) {
			value = candidate.getStateFilingStatus();
		}
		else if (field.equalsIgnoreCase(STATUS)) {
			value = candidate.getStatus();
		}
		else if (field.equalsIgnoreCase(TAXID)) {
			value = candidate.getTaxID();
		}
		else if (field.equalsIgnoreCase(TAXSTATE)) {
			value = candidate.getTaxState();
		}
		else if (field.equalsIgnoreCase(TRAVELLIMIT)) {
			value = candidate.getTravelLimit();
		}
		else if (field.equalsIgnoreCase(TYPE)) {
			value = candidate.getType();
		}
		else if (field.equalsIgnoreCase(VETERAN)) {
			value = candidate.getVeteran();
		}
		else if (field.equalsIgnoreCase(WILLRELOCATE)) {
			value = candidate.isWillRelocate();
		}
		else if (field.equalsIgnoreCase(WORKAUTHORIZED)) {
			value = candidate.isWorkAuthorized();
		}
		else if (field.equalsIgnoreCase(WORKPHONE)) {
			value = candidate.getWorkPhone();
		}
		else if (field.equalsIgnoreCase(ADDRESS)) {
			value = candidate.getAddress();
		}
		else if (field.equalsIgnoreCase(CUSTOMDATE1)) {
			value = candidate.getCustomDate1();
		}
		else if (field.equalsIgnoreCase(CUSTOMDATE2)) {
			value = candidate.getCustomDate2();
		}
		else if (field.equalsIgnoreCase(CUSTOMDATE3)) {
			value = candidate.getCustomDate3();
		}
		else if (field.equalsIgnoreCase(CUSTOMFLOAT1)) {
			value = candidate.getCustomFloat1();
		}
		else if (field.equalsIgnoreCase(CUSTOMFLOAT2)) {
			value = candidate.getCustomFloat2();
		}
		else if (field.equalsIgnoreCase(CUSTOMFLOAT3)) {
			value = candidate.getCustomFloat3();
		}
		else if (field.equalsIgnoreCase(CUSTOMINT1)) {
			value = candidate.getCustomInt1();
		}
		else if (field.equalsIgnoreCase(CUSTOMINT2)) {
			value = candidate.getCustomInt2();
		}
		else if (field.equalsIgnoreCase(CUSTOMINT3)) {
			value = candidate.getCustomInt3();
		}
		else if (field.equalsIgnoreCase(CUSTOMTEXT1)) {
			value = candidate.getCustomText1();
		}
		else if (field.equalsIgnoreCase(CUSTOMTEXT10)) {
			value = candidate.getCustomText10();
		}
		else if (field.equalsIgnoreCase(CUSTOMTEXT11)) {
			value = candidate.getCustomText11();
		}
		else if (field.equalsIgnoreCase(CUSTOMTEXT12)) {
			value = candidate.getCustomText12();
		}
		else if (field.equalsIgnoreCase(CUSTOMTEXT13)) {
			value = candidate.getCustomText13();
		}
		else if (field.equalsIgnoreCase(CUSTOMTEXT14)) {
			value = candidate.getCustomText14();
		}
		else if (field.equalsIgnoreCase(CUSTOMTEXT15)) {
			value = candidate.getCustomText15();
		}
		else if (field.equalsIgnoreCase(CUSTOMTEXT16)) {
			value = candidate.getCustomText16();
		}
		else if (field.equalsIgnoreCase(CUSTOMTEXT17)) {
			value = candidate.getCustomText17();
		}
		else if (field.equalsIgnoreCase(CUSTOMTEXT18)) {
			value = candidate.getCustomText18();
		}
		else if (field.equalsIgnoreCase(CUSTOMTEXT19)) {
			value = candidate.getCustomText19();
		}
		else if (field.equalsIgnoreCase(CUSTOMTEXT2)) {
			value = candidate.getCustomText2();
		}
		else if (field.equalsIgnoreCase(CUSTOMTEXT20)) {
			value = candidate.getCustomText20();
		}
		else if (field.equalsIgnoreCase(CUSTOMTEXT3)) {
			value = candidate.getCustomText3();
		}
		else if (field.equalsIgnoreCase(CUSTOMTEXT4)) {
			value = candidate.getCustomText4();
		}
		else if (field.equalsIgnoreCase(CUSTOMTEXT5)) {
			value = candidate.getCustomText5();
		}
		else if (field.equalsIgnoreCase(CUSTOMTEXT6)) {
			value = candidate.getCustomText6();
		}
		else if (field.equalsIgnoreCase(CUSTOMTEXT7)) {
			value = candidate.getCustomText7();
		}
		else if (field.equalsIgnoreCase(CUSTOMTEXT8)) {
			value = candidate.getCustomText8();
		}
		else if (field.equalsIgnoreCase(CUSTOMTEXT9)) {
			value = candidate.getCustomText9();
		}
		else if (field.equalsIgnoreCase(DATELASTCOMMENT)) {
			value = candidate.getDateLastComment();
		}
		else if (field.equalsIgnoreCase(EMAIL)) {
			value = candidate.getEmail();
		}
		else if (field.equalsIgnoreCase(EMAIL2)) {
			value = candidate.getEmail2();
		}
		else if (field.equalsIgnoreCase(EMAIL3)) {
			value = candidate.getEmail3();
		}
		else if (field.equalsIgnoreCase(FAX)) {
			value = candidate.getFax();
		}
		else if (field.equalsIgnoreCase(FAX2)) {
			value = candidate.getFax2();
		}
		else if (field.equalsIgnoreCase(FAX3)) {
			value = candidate.getFax3();
		}
		else if (field.equalsIgnoreCase(FIRSTNAME)) {
			value = candidate.getFirstName();
		}
		else if (field.equalsIgnoreCase(ISDAYLIGHTSAVINGS)) {
			value = candidate.isIsDayLightSavings();
		}
		else if (field.equalsIgnoreCase(ISDELETED)) {
			value = candidate.isIsDeleted();
		}
		else if (field.equalsIgnoreCase(ISLOCKEDOUT)) {
			value = candidate.isIsLockedOut();
		}
		else if (field.equalsIgnoreCase(LASTNAME)) {
			value = candidate.getLastName();
		}
		else if (field.equalsIgnoreCase(MASSMAILOPTOUT)) {
			value = candidate.isMassMailOptOut();
		}
		else if (field.equalsIgnoreCase(MIDDLENAME)) {
			value = candidate.getMiddleName();
		}
		else if (field.equalsIgnoreCase(MOBILE)) {
			value = candidate.getMobile();
		}
		else if (field.equalsIgnoreCase(NAME)) {
			value = candidate.getName();
		}
		else if (field.equalsIgnoreCase(NAMEPREFIX)) {
			value = candidate.getNamePrefix();
		}
		else if (field.equalsIgnoreCase(NAMESUFFIX)) {
			value = candidate.getNameSuffix();
		}
		else if (field.equalsIgnoreCase(NICKNAME)) {
			value = candidate.getNickName();
		}
		else if (field.equalsIgnoreCase(OCCUPATION)) {
			value = candidate.getOccupation();
		}
		else if (field.equalsIgnoreCase(PAGER)) {
			value = candidate.getPager();
		}
		else if (field.equalsIgnoreCase(PHONE)) {
			value = candidate.getPhone();
		}
		else if (field.equalsIgnoreCase(PHONE2)) {
			value = candidate.getPhone2();
		}
		else if (field.equalsIgnoreCase(PHONE3)) {
			value = candidate.getPhone3();
		}
		else if (field.equalsIgnoreCase(SMSOPTIN)) {
			value = candidate.isSmsOptIn();
		}
		else if (field.equalsIgnoreCase(TIMEZONEOFFSETEST)) {
			value = candidate.getTimeZoneOffsetEST();
		}
		else if (field.equalsIgnoreCase(USERID)) {
			value = candidate.getUserID();
		}
		else if (field.equalsIgnoreCase(USERTYPEID)) {
			value = candidate.getUserTypeID();
		}
		else if (field.equalsIgnoreCase(USERNAME)) {
			value = candidate.getUsername();
		}
		else if(field.equalsIgnoreCase(ADDRESS1)) {
			value = candidate.getAddress().getAddress1();
		}
		else if(field.equalsIgnoreCase(ADDRESS2)) {
			value = candidate.getAddress().getAddress2();
		}
		else if(field.equalsIgnoreCase(CITY)) {
			value = candidate.getAddress().getCity();
		}
		else if(field.equalsIgnoreCase(COUNTRYID)) {
			value = candidate.getAddress().getCountryID();
		}
		else if(field.equalsIgnoreCase(STATE)) {
			value = candidate.getAddress().getState();
		}
		else if(field.equalsIgnoreCase(ZIP)) {
			value = candidate.getAddress().getZip();
		}
		else {
			throw new NoSuchMethodException();
		}

		return value;
	}

	private String CATEGORYID = "categoryID";
	private String CERTIFICATIONS = "certifications";
	private String COMMENTS = "comments";
	private String COMPANYNAME = "companyName";
	private String COMPANYURL = "companyURL";
	private String CUSTOMTEXTBLOCK1 = "customTextBlock1";
	private String CUSTOMTEXTBLOCK2 = "customTextBlock2";
	private String CUSTOMTEXTBLOCK3 = "customTextBlock3";
	private String CUSTOMTEXTBLOCK4 = "customTextBlock4";
	private String CUSTOMTEXTBLOCK5 = "customTextBlock5";
	private String DATEADDED = "dateAdded";
	private String DATEAVAILABLE = "dateAvailable";
	private String DATEAVAILABLEEND = "dateAvailableEnd";
	private String DATEI9EXPIRATION = "dateI9Expiration";
	private String DATENEXTCALL = "dateNextCall";
	private String DATEOFBIRTH = "dateOfBirth";
	private String DAYRATE = "dayRate";
	private String DAYRATELOW = "dayRateLow";
	private String DEGREELIST = "degreeList";
	private String DESCRIPTION = "description";
	private String DESIREDLOCATIONS = "desiredLocations";
	private String DISABILITY = "disability";
	private String EDUCATIONDEGREE = "educationDegree";
	private String EMPLOYEETYPE = "employeeType";
	private String EMPLOYMENTPREFERENCE = "employmentPreference";
	private String ETHNICITY = "employmentPreference";
	private String EXPERIENCE = "experience";
	private String EXTERNALID = "externalID";
	private String FEDERALADDTIONALWITHOLDINGSAMOUNT = "federalAddtionalWitholdingsAmount";
	private String FEDERALEXEMPTIONS = "federalExemptions";
	private String FEDERALFILINGSTATUS = "federalFilingStatus";
	private String GENDER = "gender";
	private String HOURLYRATE = "hourlyRate";
	private String HOURLYRATELOW = "hourlyRateLow";
	private String I9ONFILE = "hourlyRateLow";
	private String ISEDITABLE = "isEditable";
	private String LINKEDPERSONID = "linkedPersonID";
	private String LOCALADDTIONALWITHOLDINGSAMOUNT = "localAddtionalWitholdingsAmount";
	private String LOCALEXEMPTIONS = "localExemptions";
	private String LOCALFILINGSTATUS = "localFilingStatus";
	private String LOCALTAXCODE = "localTaxCode";
	private String MIGRATEGUID = "migrateGUID";
	private String NUMCATEGORIES = "numCategories";
	private String NUMOWNERS = "numOwners";
	private String OWNERCORPORATIONID = "ownerCorporationID";
	private String OWNERID = "ownerID";
	private String PAPERWORKONFILE = "paperWorkOnFile";
	private String PASSWORD = "password";
	private String PREFERREDCONTACT = "preferredContact";
	private String RECENTCLIENTLIST = "recentClientList";
	private String REFERREDBY = "referredBy";
	private String REFERREDBYPERSONID = "referredByPersonID";
	private String SALARY = "salary";
	private String SALARYLOW = "salaryLow";
	private String SECONDARYADDRESS = "secondaryAddress";
	private String SKILLSET = "skillSet";
	private String source = "source";
	private String SSN = "ssn";
	private String STATEADDTIONALWITHOLDINGSAMOUNT = "stateAddtionalWitholdingsAmount";
	private String STATEEXEMPTIONS = "stateExemptions";
	private String STATEFILINGSTATUS = "stateFilingStatus";
	private String STATUS = "status";
	private String TAXID = "taxID";
	private String TAXSTATE = "taxState";
	private String TRAVELLIMIT = "travelLimit";
	private String TYPE = "type";
	private String VETERAN = "veteran";
	private String WILLRELOCATE = "willRelocate";
	private String WORKAUTHORIZED = "workAuthorized";
	private String WORKPHONE = "workPhone";

	private String ADDRESS = "address";
	private String CUSTOMDATE1 = "customDate1";
	private String CUSTOMDATE2 = "customDate2";
	private String CUSTOMDATE3 = "customDate3";
	private String CUSTOMFLOAT1 = "customFloat1";
	private String CUSTOMFLOAT2 = "customFloat2";
	private String CUSTOMFLOAT3 = "customFloat3";
	private String CUSTOMINT1 = "customInt1";
	private String CUSTOMINT2 = "customInt2";
	private String CUSTOMINT3 = "customInt3";
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
	private String CUSTOMTEXT3 = "customText3";
	private String CUSTOMTEXT4 = "customText4";
	private String CUSTOMTEXT5 = "customText5";
	private String CUSTOMTEXT6 = "customText6";
	private String CUSTOMTEXT7 = "customText7";
	private String CUSTOMTEXT8 = "customText8";
	private String CUSTOMTEXT9 = "customText9";
	private String DATELASTCOMMENT = "dateLastComment";
	private String EMAIL = "email";
	private String EMAIL2 = "email2";
	private String EMAIL3 = "email3";
	private String FAX = "fax";
	private String FAX2 = "fax2";
	private String FAX3 = "fax3";
	private String FIRSTNAME = "firstName";
	private String ISDAYLIGHTSAVINGS = "isDayLightSavings";
	private String ISDELETED = "isDeleted";
	private String ISLOCKEDOUT = "isLockedOut";
	private String LASTNAME = "lastName";
	private String MASSMAILOPTOUT = "massMailOptOut";
	private String MIDDLENAME = "middleName";
	private String MOBILE = "mobile";
	private String NAME = "name";
	private String NAMEPREFIX = "namePrefix";
	private String NAMESUFFIX = "nameSuffix";
	private String NICKNAME = "nickName";
	private String OCCUPATION = "occupation";
	private String PAGER = "pager";
	private String PHONE = "phone";
	private String PHONE2 = "phone2";
	private String PHONE3 = "phone3";
	private String SMSOPTIN = "smsOptIn";
	private String TIMEZONEOFFSETEST = "timeZoneOffsetEST";
	private String USERID = "userID";
	private String USERTYPEID = "userTypeID";
	private String USERNAME = "username";
	private String ADDRESS1="address1";
	private String ADDRESS2="address2";
	private String CITY="city";
	private String COUNTRYID="countryID";
	private String STATE="state";
	private String ZIP="zip";

}
