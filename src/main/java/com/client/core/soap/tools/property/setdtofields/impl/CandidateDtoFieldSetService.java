package com.client.core.soap.tools.property.setdtofields.impl;

import java.util.Map;

import org.springframework.stereotype.Service;

import com.bullhorn.entity.candidate.CandidateDto;
import com.client.core.soap.tools.property.setdtofields.DtoFieldSetService;
import com.client.core.base.util.Utility;

@Service("candidateSetService")
public class CandidateDtoFieldSetService extends DtoFieldSetService<CandidateDto> {

	public CandidateDtoFieldSetService() {
		super();
	}

	@Override
	public CandidateDto changeDto(CandidateDto candidate, Map<String, String> fieldValues, String dateFormat, Boolean isDotPrefixed) {
		for(String initialField : fieldValues.keySet()) {
			String value = fieldValues.get(initialField);

			String field = initialField;
			if(isDotPrefixed) {
				field = removeDotPrefix(initialField);
			}

			if(field.equalsIgnoreCase(CATEGORYID)) {

				candidate.setCategoryID(Utility.forceParseInteger(value));

			} else if(field.equalsIgnoreCase(CERTIFICATIONS)) {

				candidate.setCertifications(value);

			} else if(field.equalsIgnoreCase(COMMENTS)) {

				candidate.setComments(value);

			} else if(field.equalsIgnoreCase(COMPANYNAME)) {

				candidate.setCompanyName(value);

			} else if(field.equalsIgnoreCase(COMPANYURL)) {

				candidate.setCompanyURL(value);

			} else if(field.equalsIgnoreCase(CUSTOMTEXTBLOCK1)) {

				candidate.setCustomTextBlock1(value);

			} else if(field.equalsIgnoreCase(CUSTOMTEXTBLOCK2)) {

				candidate.setCustomTextBlock2(value);

			} else if(field.equalsIgnoreCase(CUSTOMTEXTBLOCK3)) {

				candidate.setCustomTextBlock3(value);

			} else if(field.equalsIgnoreCase(CUSTOMTEXTBLOCK4)) {

				candidate.setCustomTextBlock4(value);

			} else if(field.equalsIgnoreCase(CUSTOMTEXTBLOCK5)) {

				candidate.setCustomTextBlock5(value);

			} else if(field.equalsIgnoreCase(DATEADDED)) {

				candidate.setDateAdded(Utility.forceParseStringToXMLGregorianCalendar(value, dateFormat));

			} else if(field.equalsIgnoreCase(DATEAVAILABLE)) {

				candidate.setDateAvailable(Utility.forceParseStringToXMLGregorianCalendar(value, dateFormat));

			} else if(field.equalsIgnoreCase(DATEAVAILABLEEND)) {

				candidate.setDateAvailableEnd(Utility.forceParseStringToXMLGregorianCalendar(value, dateFormat));

			} else if(field.equalsIgnoreCase(DATEI9EXPIRATION)) {

				candidate.setDateI9Expiration(Utility.forceParseStringToXMLGregorianCalendar(value, dateFormat));

			} else if(field.equalsIgnoreCase(DATENEXTCALL)) {

				candidate.setDateNextCall(Utility.forceParseStringToXMLGregorianCalendar(value, dateFormat));

			} else if(field.equalsIgnoreCase(DATEOFBIRTH)) {

				candidate.setDateOfBirth(Utility.forceParseStringToXMLGregorianCalendar(value, dateFormat));

			} else if(field.equalsIgnoreCase(DAYRATE)) {

				candidate.setDayRate(Utility.forceParseBigDecimal(value));

			} else if(field.equalsIgnoreCase(DAYRATELOW)) {

				candidate.setDayRateLow(Utility.forceParseBigDecimal(value));

			} else if(field.equalsIgnoreCase(DEGREELIST)) {

				candidate.setDegreeList(value);

			} else if(field.equalsIgnoreCase(DESCRIPTION)) {

				candidate.setDescription(value);

			} else if(field.equalsIgnoreCase(DESIREDLOCATIONS)) {

				candidate.setDesiredLocations(value);

			} else if(field.equalsIgnoreCase(DISABILITY)) {

				candidate.setDisability(value);

			} else if(field.equalsIgnoreCase(EDUCATIONDEGREE)) {

				candidate.setEducationDegree(value);

			} else if(field.equalsIgnoreCase(EMPLOYEETYPE)) {

				candidate.setEmployeeType(value);

			} else if(field.equalsIgnoreCase(EMPLOYMENTPREFERENCE)) {

				candidate.setEmploymentPreference(value);

			} else if(field.equalsIgnoreCase(ETHNICITY)) {

				candidate.setEthnicity(value);

			} else if(field.equalsIgnoreCase(EXPERIENCE)) {

				candidate.setExperience(Utility.forceParseInteger(value));

			} else if(field.equalsIgnoreCase(EXTERNALID)) {

				candidate.setExternalID(value);

			} else if(field.equalsIgnoreCase(FEDERALADDTIONALWITHOLDINGSAMOUNT)) {

				candidate.setFederalAddtionalWitholdingsAmount(Utility.forceParseBigDecimal(value));

			} else if(field.equalsIgnoreCase(FEDERALEXEMPTIONS)) {

				candidate.setFederalExemptions(Utility.forceParseInteger(value));

			} else if(field.equalsIgnoreCase(FEDERALFILINGSTATUS)) {

				candidate.setFederalFilingStatus(value);

			} else if(field.equalsIgnoreCase(GENDER)) {

				candidate.setGender(value);

			} else if(field.equalsIgnoreCase(HOURLYRATE)) {

				candidate.setHourlyRate(Utility.forceParseBigDecimal(value));

			} else if(field.equalsIgnoreCase(HOURLYRATELOW)) {

				candidate.setHourlyRateLow(Utility.forceParseBigDecimal(value));

			} else if(field.equalsIgnoreCase(I9ONFILE)) {

				candidate.setHourlyRateLow(Utility.forceParseBigDecimal(value));

			} else if(field.equalsIgnoreCase(ISEDITABLE)) {

				candidate.setIsEditable(Utility.parseBoolean(value));

			} else if(field.equalsIgnoreCase(LINKEDPERSONID)) {

				candidate.setLinkedPersonID(Utility.forceParseInteger(value));

			} else if(field.equalsIgnoreCase(LOCALADDTIONALWITHOLDINGSAMOUNT)) {

				candidate.setLocalAddtionalWitholdingsAmount(Utility.forceParseBigDecimal(value));

			} else if(field.equalsIgnoreCase(LOCALEXEMPTIONS)) {

				candidate.setLocalExemptions(Utility.forceParseInteger(value));

			} else if(field.equalsIgnoreCase(LOCALFILINGSTATUS)) {

				candidate.setLocalFilingStatus(value);

			} else if(field.equalsIgnoreCase(LOCALTAXCODE)) {

				candidate.setLocalTaxCode(value);

			} else if(field.equalsIgnoreCase(MIGRATEGUID)) {

				candidate.setMigrateGUID(value);

			} else if(field.equalsIgnoreCase(NUMCATEGORIES)) {

				candidate.setNumCategories(Utility.forceParseInteger(value));

			} else if(field.equalsIgnoreCase(NUMOWNERS)) {

				candidate.setNumOwners(Utility.forceParseInteger(value));

			} else if(field.equalsIgnoreCase(OWNERCORPORATIONID)) {

				candidate.setOwnerCorporationID(Utility.forceParseInteger(value));

			} else if(field.equalsIgnoreCase(OWNERID)) {

				candidate.setOwnerID(Utility.forceParseInteger(value));

			} else if(field.equalsIgnoreCase(PAPERWORKONFILE)) {

				candidate.setPaperWorkOnFile(value);

			} else if(field.equalsIgnoreCase(PASSWORD)) {

				candidate.setPassword(value);

			} else if(field.equalsIgnoreCase(PREFERREDCONTACT)) {

				candidate.setPreferredContact(value);

			} else if(field.equalsIgnoreCase(RECENTCLIENTLIST)) {

				candidate.setRecentClientList(value);

			} else if(field.equalsIgnoreCase(REFERREDBY)) {

				candidate.setReferredBy(value);

			} else if(field.equalsIgnoreCase(REFERREDBYPERSONID)) {

				candidate.setReferredByPersonID(Utility.forceParseInteger(value));

			} else if(field.equalsIgnoreCase(SALARY)) {

				candidate.setSalary(Utility.forceParseBigDecimal(value));

			} else if(field.equalsIgnoreCase(SALARYLOW)) {

				candidate.setSalaryLow(Utility.forceParseBigDecimal(value));

			} else if(field.equalsIgnoreCase(SKILLSET)) {

				candidate.setSkillSet(value);

			} else if(field.equalsIgnoreCase(source)) {

				candidate.setSource(value);

			} else if(field.equalsIgnoreCase(SSN)) {

				candidate.setSsn(value);

			} else if(field.equalsIgnoreCase(STATEADDTIONALWITHOLDINGSAMOUNT)) {

				candidate.setStateAddtionalWitholdingsAmount(Utility.forceParseBigDecimal(value));

			} else if(field.equalsIgnoreCase(STATEEXEMPTIONS)) {

				candidate.setStateExemptions(Utility.forceParseInteger(value));

			} else if(field.equalsIgnoreCase(STATEFILINGSTATUS)) {

				candidate.setStateFilingStatus(value);

			} else if(field.equalsIgnoreCase(STATUS)) {

				candidate.setStatus(value);

			} else if(field.equalsIgnoreCase(TAXID)) {

				candidate.setTaxID(value);

			} else if(field.equalsIgnoreCase(TAXSTATE)) {

				candidate.setTaxState(value);

			} else if(field.equalsIgnoreCase(TRAVELLIMIT)) {

				candidate.setTravelLimit(Utility.forceParseInteger(value));

			} else if(field.equalsIgnoreCase(TYPE)) {

				candidate.setType(value);

			} else if(field.equalsIgnoreCase(VETERAN)) {

				candidate.setVeteran(value);

			} else if(field.equalsIgnoreCase(WILLRELOCATE)) {

				candidate.setWillRelocate(Utility.parseBoolean(value));

			} else if(field.equalsIgnoreCase(WORKAUTHORIZED)) {

				candidate.setWorkAuthorized(Utility.parseBoolean(value));

			} else if(field.equalsIgnoreCase(WORKPHONE)) {

				candidate.setWorkPhone(value);

			} else if(field.equalsIgnoreCase(CUSTOMDATE1)) {

				candidate.setCustomDate1(Utility.forceParseStringToXMLGregorianCalendar(value, dateFormat));

			} else if(field.equalsIgnoreCase(CUSTOMDATE2)) {

				candidate.setCustomDate2(Utility.forceParseStringToXMLGregorianCalendar(value, dateFormat));

			} else if(field.equalsIgnoreCase(CUSTOMDATE3)) {

				candidate.setCustomDate3(Utility.forceParseStringToXMLGregorianCalendar(value, dateFormat));

			} else if(field.equalsIgnoreCase(CUSTOMFLOAT1)) {

				candidate.setCustomFloat1(Utility.parseDouble(value));

			} else if(field.equalsIgnoreCase(CUSTOMFLOAT2)) {

				candidate.setCustomFloat2(Utility.parseDouble(value));

			} else if(field.equalsIgnoreCase(CUSTOMFLOAT3)) {

				candidate.setCustomFloat3(Utility.parseDouble(value));

			} else if(field.equalsIgnoreCase(CUSTOMINT1)) {

				candidate.setCustomInt1(Utility.forceParseInteger(value));

			} else if(field.equalsIgnoreCase(CUSTOMINT2)) {

				candidate.setCustomInt2(Utility.forceParseInteger(value));

			} else if(field.equalsIgnoreCase(CUSTOMINT3)) {

				candidate.setCustomInt3(Utility.forceParseInteger(value));

			} else if(field.equalsIgnoreCase(CUSTOMTEXT1)) {

				candidate.setCustomText1(value);

			} else if(field.equalsIgnoreCase(CUSTOMTEXT10)) {

				candidate.setCustomText10(value);

			} else if(field.equalsIgnoreCase(CUSTOMTEXT11)) {

				candidate.setCustomText11(value);

			} else if(field.equalsIgnoreCase(CUSTOMTEXT12)) {

				candidate.setCustomText12(value);

			} else if(field.equalsIgnoreCase(CUSTOMTEXT13)) {

				candidate.setCustomText13(value);

			} else if(field.equalsIgnoreCase(CUSTOMTEXT14)) {

				candidate.setCustomText14(value);

			} else if(field.equalsIgnoreCase(CUSTOMTEXT15)) {

				candidate.setCustomText15(value);

			} else if(field.equalsIgnoreCase(CUSTOMTEXT16)) {

				candidate.setCustomText16(value);

			} else if(field.equalsIgnoreCase(CUSTOMTEXT17)) {

				candidate.setCustomText17(value);

			} else if(field.equalsIgnoreCase(CUSTOMTEXT18)) {

				candidate.setCustomText18(value);

			} else if(field.equalsIgnoreCase(CUSTOMTEXT19)) {

				candidate.setCustomText19(value);

			} else if(field.equalsIgnoreCase(CUSTOMTEXT2)) {

				candidate.setCustomText2(value);

			} else if(field.equalsIgnoreCase(CUSTOMTEXT20)) {

				candidate.setCustomText20(value);

			} else if(field.equalsIgnoreCase(CUSTOMTEXT3)) {

				candidate.setCustomText3(value);

			} else if(field.equalsIgnoreCase(CUSTOMTEXT4)) {

				candidate.setCustomText4(value);

			} else if(field.equalsIgnoreCase(CUSTOMTEXT5)) {

				candidate.setCustomText5(value);

			} else if(field.equalsIgnoreCase(CUSTOMTEXT6)) {

				candidate.setCustomText6(value);

			} else if(field.equalsIgnoreCase(CUSTOMTEXT7)) {

				candidate.setCustomText7(value);

			} else if(field.equalsIgnoreCase(CUSTOMTEXT8)) {

				candidate.setCustomText8(value);

			} else if(field.equalsIgnoreCase(CUSTOMTEXT9)) {

				candidate.setCustomText9(value);

			} else if(field.equalsIgnoreCase(DATELASTCOMMENT)) {

				candidate.setDateLastComment(Utility.forceParseStringToXMLGregorianCalendar(value, dateFormat));

			} else if(field.equalsIgnoreCase(EMAIL)) {

				candidate.setEmail(value);

			} else if(field.equalsIgnoreCase(EMAIL2)) {

				candidate.setEmail2(value);

			} else if(field.equalsIgnoreCase(EMAIL3)) {

				candidate.setEmail3(value);

			} else if(field.equalsIgnoreCase(FAX)) {

				candidate.setFax(value);

			} else if(field.equalsIgnoreCase(FAX2)) {

				candidate.setFax2(value);

			} else if(field.equalsIgnoreCase(FAX3)) {

				candidate.setFax3(value);

			} else if(field.equalsIgnoreCase(FIRSTNAME)) {

				candidate.setFirstName(value);

			} else if(field.equalsIgnoreCase(ISDAYLIGHTSAVINGS)) {

				candidate.setIsDayLightSavings(Utility.parseBoolean(value));

			} else if(field.equalsIgnoreCase(ISDELETED)) {

				candidate.setIsDeleted(Utility.parseBoolean(value));

			} else if(field.equalsIgnoreCase(ISLOCKEDOUT)) {

				candidate.setIsLockedOut(Utility.parseBoolean(value));

			} else if(field.equalsIgnoreCase(LASTNAME)) {

				candidate.setLastName(value);

			} else if(field.equalsIgnoreCase(MASSMAILOPTOUT)) {

				candidate.setMassMailOptOut(Utility.parseBoolean(value));

			} else if(field.equalsIgnoreCase(MIDDLENAME)) {

				candidate.setMiddleName(value);

			} else if(field.equalsIgnoreCase(MOBILE)) {

				candidate.setMobile(value);

			} else if(field.equalsIgnoreCase(NAME)) {

				candidate.setName(value);

			} else if(field.equalsIgnoreCase(NAMEPREFIX)) {

				candidate.setNamePrefix(value);

			} else if(field.equalsIgnoreCase(NAMESUFFIX)) {

				candidate.setNameSuffix(value);

			} else if(field.equalsIgnoreCase(NICKNAME)) {

				candidate.setNickName(value);

			} else if(field.equalsIgnoreCase(OCCUPATION)) {

				candidate.setOccupation(value);

			} else if(field.equalsIgnoreCase(PAGER)) {

				candidate.setPager(value);

			} else if(field.equalsIgnoreCase(PHONE)) {

				candidate.setPhone(value);

			} else if(field.equalsIgnoreCase(PHONE2)) {

				candidate.setPhone2(value);

			} else if(field.equalsIgnoreCase(PHONE3)) {

				candidate.setPhone3(value);

			} else if(field.equalsIgnoreCase(SMSOPTIN)) {

				candidate.setSmsOptIn(Utility.parseBoolean(value));

			} else if(field.equalsIgnoreCase(TIMEZONEOFFSETEST)) {

				candidate.setTimeZoneOffsetEST(Utility.forceParseInteger(value));

			} else if(field.equalsIgnoreCase(USERID)) {

				candidate.setUserID(Utility.forceParseInteger(value));

			} else if(field.equalsIgnoreCase(USERTYPEID)) {

				candidate.setUserTypeID(Utility.forceParseInteger(value));

			} else if(field.equalsIgnoreCase(USERNAME)) {

				candidate.setUsername(value);

			} else if(field.equalsIgnoreCase(ADDRESS1)) {

				candidate.getAddress().setAddress1(value);

			} else if(field.equalsIgnoreCase(ADDRESS2)) {

				candidate.getAddress().setAddress2(value);

			} else if(field.equalsIgnoreCase(CITY)) {

				candidate.getAddress().setCity(value);

			} else if(field.equalsIgnoreCase(COUNTRYID)) {

				candidate.getAddress().setCountryID(Utility.forceParseInteger(value));

			} else if(field.equalsIgnoreCase(STATE)) {

				candidate.getAddress().setState(value);

			} else if(field.equalsIgnoreCase(ZIP)) {

				candidate.getAddress().setZip(value);

			} else if(field.equalsIgnoreCase(SECONDARYADDRESS1)) {

				candidate.getSecondaryAddress().setAddress1(value);

			} else if(field.equalsIgnoreCase(SECONDARYADDRESS2)) {

				candidate.getSecondaryAddress().setAddress2(value);

			} else if(field.equalsIgnoreCase(SECONDARYCITY)) {

				candidate.getSecondaryAddress().setCity(value);

			} else if(field.equalsIgnoreCase(SECONDARYCOUNTRYID)) {

				candidate.getSecondaryAddress().setCountryID(Utility.forceParseInteger(value));

			} else if(field.equalsIgnoreCase(SECONDARYSTATE)) {

				candidate.getSecondaryAddress().setState(value);

			} else if(field.equalsIgnoreCase(SECONDARYZIP)) {

				candidate.getSecondaryAddress().setZip(value);

			}
		}

		return candidate;
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
	private String ETHNICITY = "ethnicity";
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
	private String SECONDARYADDRESS1="secondaryAddress1";
	private String SECONDARYADDRESS2="secondaryAddress2";
	private String SECONDARYCITY="secondaryCity";
	private String SECONDARYCOUNTRYID="secondaryCountryID";
	private String SECONDARYSTATE="secondaryState";
	private String SECONDARYZIP="secondaryZip";

}
