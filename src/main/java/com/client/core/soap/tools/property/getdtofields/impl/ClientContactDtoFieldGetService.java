package com.client.core.soap.tools.property.getdtofields.impl;

import org.springframework.stereotype.Service;

import com.bullhorn.entity.client.ClientContactDto;
import com.client.core.soap.tools.property.getdtofields.DtoFieldGetService;

@Service("clientContactGetService")
public class ClientContactDtoFieldGetService extends DtoFieldGetService<ClientContactDto> {

	public ClientContactDtoFieldGetService() {
		super();
	}

	@Override
	public Object retrieveField(String field, ClientContactDto clientContact, Boolean isDotPrefixed) throws NoSuchMethodException {
		Object value = null;

		if(isDotPrefixed) {
			field = removeDotPrefix(field);
		}

		if (field.equalsIgnoreCase(CATEGORYID)) {
			value = clientContact.getCategoryID();
		}
	    else if (field.equalsIgnoreCase(CERTIFICATIONS)) {
			value = clientContact.getCertifications();
		}
	    else if (field.equalsIgnoreCase(ADDRESS)) {
			value = clientContact.getAddress();
		}
	    else if (field.equalsIgnoreCase(SECONDARYADDRESS)) {
			value = clientContact.getSecondaryAddress();
		}
	    else if (field.equalsIgnoreCase(CLIENTCORPORATIONID)) {
			value = clientContact.getClientCorporationID();
		}
	    else if (field.equalsIgnoreCase(COMMENTS)) {
			value = clientContact.getComments();
		}
	    else if (field.equalsIgnoreCase(CUSTOMTEXTBLOCK1)) {
			value = clientContact.getCustomTextBlock1();
		}
	    else if (field.equalsIgnoreCase(CUSTOMTEXTBLOCK2)) {
			value = clientContact.getCustomTextBlock2();
		}
	    else if (field.equalsIgnoreCase(CUSTOMTEXTBLOCK3)) {
			value = clientContact.getCustomTextBlock3();
		}
	    else if (field.equalsIgnoreCase(CUSTOMTEXTBLOCK4)) {
			value = clientContact.getCustomTextBlock4();
		}
	    else if (field.equalsIgnoreCase(CUSTOMTEXTBLOCK5)) {
			value = clientContact.getCustomTextBlock5();
		}
	    else if (field.equalsIgnoreCase(DATEADDED)) {
			value = clientContact.getDateAdded();
		}
	    else if (field.equalsIgnoreCase(DATELASTVISIT)) {
			value = clientContact.getDateLastVisit();
		}
	    else if (field.equalsIgnoreCase(DELETEME)) {
			value = clientContact.getDeleteMe();
		}
	    else if (field.equalsIgnoreCase(DESCRIPTION)) {
			value = clientContact.getDescription();
		}
	    else if (field.equalsIgnoreCase(DESIREDCATEGORIES)) {
			value = clientContact.getDesiredCategories();
		}
	    else if (field.equalsIgnoreCase(DESIREDSKILLS)) {
			value = clientContact.getDesiredSkills();
		}
	    else if (field.equalsIgnoreCase(DESIREDSPECIALTIES)) {
			value = clientContact.getDesiredSpecialties();
		}
	    else if (field.equalsIgnoreCase(DIVISION)) {
			value = clientContact.getDivision();
		}
	    else if (field.equalsIgnoreCase(EXTERNALID)) {
			value = clientContact.getExternalID();
		}
	    else if (field.equalsIgnoreCase(LINKEDPERSONID)) {
			value = clientContact.getLinkedPersonID();
		}
	    else if (field.equalsIgnoreCase(MIGRATEGUID)) {
			value = clientContact.getMigrateGUID();
		}
	    else if (field.equalsIgnoreCase(NUMEMPLOYEES)) {
			value = clientContact.getNumEmployees();
		}
	    else if (field.equalsIgnoreCase(OFFICE)) {
			value = clientContact.getOffice();
		}
	    else if (field.equalsIgnoreCase(OWNERID)) {
			value = clientContact.getOwnerID();
		}
	    else if (field.equalsIgnoreCase(PASSWORD)) {
			value = clientContact.getPassword();
		}
	    else if (field.equalsIgnoreCase(PREFERREDCONTACT)) {
			value = clientContact.getPreferredContact();
		}
	    else if (field.equalsIgnoreCase(REFERREDBYPERSONID)) {
			value = clientContact.getReferredByPersonID();
		}
	    else if (field.equalsIgnoreCase(REPORTTOPERSONID)) {
			value = clientContact.getReportToPersonID();
		}
	    else if (field.equalsIgnoreCase(SOURCE)) {
			value = clientContact.getSource();
		}
	    else if (field.equalsIgnoreCase(STATUS)) {
			value = clientContact.getStatus();
		}
	    else if (field.equalsIgnoreCase(TYPE)) {
			value = clientContact.getType();
		}
		else if (field.equalsIgnoreCase(SECONDARYADDRESS1)) {
			value = clientContact.getSecondaryAddress().getAddress1();
		}
		else if (field.equalsIgnoreCase(SECONDARYADDRESS2)) {
			value = clientContact.getSecondaryAddress().getAddress2();
		}
		else if (field.equalsIgnoreCase(SECONDARYCITY)) {
			value = clientContact.getSecondaryAddress().getCity();
		}
		else if (field.equalsIgnoreCase(SECONDARYCOUNTRYID)) {
			value = clientContact.getSecondaryAddress().getCountryID();
		}
		else if (field.equalsIgnoreCase(SECONDARYSTATE)) {
			value = clientContact.getSecondaryAddress().getState();
		}
		else if (field.equalsIgnoreCase(SECONDARYZIP)) {
			value = clientContact.getSecondaryAddress().getZip();
		}
		else if (field.equalsIgnoreCase(CUSTOMDATE1)) {
			value = clientContact.getCustomDate1();
		}
		else if (field.equalsIgnoreCase(CUSTOMDATE2)) {
			value = clientContact.getCustomDate2();
		}
		else if (field.equalsIgnoreCase(CUSTOMDATE3)) {
			value = clientContact.getCustomDate3();
		}
		else if (field.equalsIgnoreCase(CUSTOMFLOAT1)) {
			value = clientContact.getCustomFloat1();
		}
		else if (field.equalsIgnoreCase(CUSTOMFLOAT2)) {
			value = clientContact.getCustomFloat2();
		}
		else if (field.equalsIgnoreCase(CUSTOMFLOAT3)) {
			value = clientContact.getCustomFloat3();
		}
		else if (field.equalsIgnoreCase(CUSTOMINT1)) {
			value = clientContact.getCustomInt1();
		}
		else if (field.equalsIgnoreCase(CUSTOMINT2)) {
			value = clientContact.getCustomInt2();
		}
		else if (field.equalsIgnoreCase(CUSTOMINT3)) {
			value = clientContact.getCustomInt3();
		}
		else if (field.equalsIgnoreCase(CUSTOMTEXT1)) {
			value = clientContact.getCustomText1();
		}
		else if (field.equalsIgnoreCase(CUSTOMTEXT10)) {
			value = clientContact.getCustomText10();
		}
		else if (field.equalsIgnoreCase(CUSTOMTEXT11)) {
			value = clientContact.getCustomText11();
		}
		else if (field.equalsIgnoreCase(CUSTOMTEXT12)) {
			value = clientContact.getCustomText12();
		}
		else if (field.equalsIgnoreCase(CUSTOMTEXT13)) {
			value = clientContact.getCustomText13();
		}
		else if (field.equalsIgnoreCase(CUSTOMTEXT14)) {
			value = clientContact.getCustomText14();
		}
		else if (field.equalsIgnoreCase(CUSTOMTEXT15)) {
			value = clientContact.getCustomText15();
		}
		else if (field.equalsIgnoreCase(CUSTOMTEXT16)) {
			value = clientContact.getCustomText16();
		}
		else if (field.equalsIgnoreCase(CUSTOMTEXT17)) {
			value = clientContact.getCustomText17();
		}
		else if (field.equalsIgnoreCase(CUSTOMTEXT18)) {
			value = clientContact.getCustomText18();
		}
		else if (field.equalsIgnoreCase(CUSTOMTEXT19)) {
			value = clientContact.getCustomText19();
		}
		else if (field.equalsIgnoreCase(CUSTOMTEXT2)) {
			value = clientContact.getCustomText2();
		}
		else if (field.equalsIgnoreCase(CUSTOMTEXT20)) {
			value = clientContact.getCustomText20();
		}
		else if (field.equalsIgnoreCase(CUSTOMTEXT3)) {
			value = clientContact.getCustomText3();
		}
		else if (field.equalsIgnoreCase(CUSTOMTEXT4)) {
			value = clientContact.getCustomText4();
		}
		else if (field.equalsIgnoreCase(CUSTOMTEXT5)) {
			value = clientContact.getCustomText5();
		}
		else if (field.equalsIgnoreCase(CUSTOMTEXT6)) {
			value = clientContact.getCustomText6();
		}
		else if (field.equalsIgnoreCase(CUSTOMTEXT7)) {
			value = clientContact.getCustomText7();
		}
		else if (field.equalsIgnoreCase(CUSTOMTEXT8)) {
			value = clientContact.getCustomText8();
		}
		else if (field.equalsIgnoreCase(CUSTOMTEXT9)) {
			value = clientContact.getCustomText9();
		}
		else if (field.equalsIgnoreCase(DATELASTCOMMENT)) {
			value = clientContact.getDateLastComment();
		}
		else if (field.equalsIgnoreCase(EMAIL)) {
			value = clientContact.getEmail();
		}
		else if (field.equalsIgnoreCase(EMAIL2)) {
			value = clientContact.getEmail2();
		}
		else if (field.equalsIgnoreCase(EMAIL3)) {
			value = clientContact.getEmail3();
		}
		else if (field.equalsIgnoreCase(FAX)) {
			value = clientContact.getFax();
		}
		else if (field.equalsIgnoreCase(FAX2)) {
			value = clientContact.getFax2();
		}
		else if (field.equalsIgnoreCase(FAX3)) {
			value = clientContact.getFax3();
		}
		else if (field.equalsIgnoreCase(FIRSTNAME)) {
			value = clientContact.getFirstName();
		}
		else if (field.equalsIgnoreCase(ISDAYLIGHTSAVINGS)) {
			value = clientContact.isIsDayLightSavings();
		}
		else if (field.equalsIgnoreCase(ISDELETED)) {
			value = clientContact.isIsDeleted();
		}
		else if (field.equalsIgnoreCase(ISLOCKEDOUT)) {
			value = clientContact.isIsLockedOut();
		}
		else if (field.equalsIgnoreCase(LASTNAME)) {
			value = clientContact.getLastName();
		}
		else if (field.equalsIgnoreCase(MASSMAILOPTOUT)) {
			value = clientContact.isMassMailOptOut();
		}
		else if (field.equalsIgnoreCase(MIDDLENAME)) {
			value = clientContact.getMiddleName();
		}
		else if (field.equalsIgnoreCase(MOBILE)) {
			value = clientContact.getMobile();
		}
		else if (field.equalsIgnoreCase(NAME)) {
			value = clientContact.getName();
		}
		else if (field.equalsIgnoreCase(NAMEPREFIX)) {
			value = clientContact.getNamePrefix();
		}
		else if (field.equalsIgnoreCase(NAMESUFFIX)) {
			value = clientContact.getNameSuffix();
		}
		else if (field.equalsIgnoreCase(NICKNAME)) {
			value = clientContact.getNickName();
		}
		else if (field.equalsIgnoreCase(OCCUPATION)) {
			value = clientContact.getOccupation();
		}
		else if (field.equalsIgnoreCase(PAGER)) {
			value = clientContact.getPager();
		}
		else if (field.equalsIgnoreCase(PHONE)) {
			value = clientContact.getPhone();
		}
		else if (field.equalsIgnoreCase(PHONE2)) {
			value = clientContact.getPhone2();
		}
		else if (field.equalsIgnoreCase(PHONE3)) {
			value = clientContact.getPhone3();
		}
		else if (field.equalsIgnoreCase(SMSOPTIN)) {
			value = clientContact.isSmsOptIn();
		}
		else if (field.equalsIgnoreCase(TIMEZONEOFFSETEST)) {
			value = clientContact.getTimeZoneOffsetEST();
		}
		else if (field.equalsIgnoreCase(USERID)) {
			value = clientContact.getUserID();
		}
		else if (field.equalsIgnoreCase(USERTYPEID)) {
			value = clientContact.getUserTypeID();
		}
		else if (field.equalsIgnoreCase(USERNAME)) {
			value = clientContact.getUsername();
		}
		else if (field.equalsIgnoreCase(ADDRESS1)) {
			value = clientContact.getAddress().getAddress1();
		}
		else if (field.equalsIgnoreCase(ADDRESS2)) {
			value = clientContact.getAddress().getAddress2();
		}
		else if (field.equalsIgnoreCase(CITY)) {
			value = clientContact.getAddress().getCity();
		}
		else if (field.equalsIgnoreCase(COUNTRYID)) {
			value = clientContact.getAddress().getCountryID();
		}
		else if (field.equalsIgnoreCase(STATE)) {
			value = clientContact.getAddress().getState();
		}
		else if (field.equalsIgnoreCase(ZIP)) {
			value = clientContact.getAddress().getZip();
		}
		else {
			throw new NoSuchMethodException();
		}
		
		return value;
	}
	
	private String CATEGORYID="categoryID";
    private String CERTIFICATIONS="certifications";
    private String CLIENTCORPORATIONID="clientCorporationID";
    private String COMMENTS="comments";
    private String CUSTOMTEXTBLOCK1="customTextBlock1";
    private String CUSTOMTEXTBLOCK2="customTextBlock2";
    private String CUSTOMTEXTBLOCK3="customTextBlock3";
    private String CUSTOMTEXTBLOCK4="customTextBlock4";
    private String CUSTOMTEXTBLOCK5="customTextBlock5";
    private String DATEADDED="dateAdded";
    private String DATELASTVISIT="dateLastVisit";
    private String DELETEME="deleteMe";
    private String DESCRIPTION="description";
    private String DESIREDCATEGORIES="desiredCategories";
    private String DESIREDSKILLS="desiredSkills";
    private String DESIREDSPECIALTIES="desiredSpecialties";
    private String DIVISION="division";
    private String EXTERNALID="externalID";
    private String LINKEDPERSONID="linkedPersonID";
    private String MIGRATEGUID="migrateGUID";
    private String NUMEMPLOYEES="numEmployees";
    private String OFFICE="office";
    private String OWNERID="ownerID";
    private String PASSWORD="password";
    private String PREFERREDCONTACT="preferredContact";
    private String REFERREDBYPERSONID="referredByPersonID";
    private String REPORTTOPERSONID="reportToPersonID";
    private String SOURCE="source";
    private String STATUS="status";
    private String TYPE="type";
	private String SECONDARYADDRESS1="secondaryAddress1";
	private String SECONDARYADDRESS2="secondaryAddress2";
	private String SECONDARYCITY="secondaryCity";
	private String SECONDARYCOUNTRYID="secondaryCountryID";
	private String SECONDARYSTATE="secondaryState";
	private String SECONDARYZIP="secondaryZip";
	private String SECONDARYADDRESS="secondaryAddress";
	
	private String ADDRESS="address";
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
	private String DATELASTCOMMENT="dateLastComment";
	private String EMAIL="email";
	private String EMAIL2="email2";
	private String EMAIL3="email3";
	private String FAX="fax";
	private String FAX2="fax2";
	private String FAX3="fax3";
	private String FIRSTNAME="firstName";
	private String ISDAYLIGHTSAVINGS="isDayLightSavings";
	private String ISDELETED="isDeleted";
	private String ISLOCKEDOUT="isLockedOut";
	private String LASTNAME="lastName";
	private String MASSMAILOPTOUT="massMailOptOut";
	private String MIDDLENAME="middleName";
	private String MOBILE="mobile";
	private String NAME="name";
	private String NAMEPREFIX="namePrefix";
	private String NAMESUFFIX="nameSuffix";
	private String NICKNAME="nickName";
	private String OCCUPATION="occupation";
	private String PAGER="pager";
	private String PHONE="phone";
	private String PHONE2="phone2";
	private String PHONE3="phone3";
	private String SMSOPTIN="smsOptIn";
	private String TIMEZONEOFFSETEST="timeZoneOffsetEST";
	private String USERID="userID";
	private String USERTYPEID="userTypeID";
	private String USERNAME="username";
	private String ADDRESS1="address1";
	private String ADDRESS2="address2";
	private String CITY="city";
	private String COUNTRYID="countryID";
	private String STATE="state";
	private String ZIP="zip";

}
