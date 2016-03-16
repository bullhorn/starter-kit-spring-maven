package com.client.core.soap.tools.property.setdtofields.impl;

import java.util.Map;

import org.springframework.stereotype.Service;

import com.bullhorn.entity.client.ClientContactDto;
import com.client.core.soap.tools.property.setdtofields.DtoFieldSetService;
import com.client.core.base.util.Utility;

@Service("clientContactSetService")
public class ClientContactDtoFieldSetService extends DtoFieldSetService<ClientContactDto> {

	public ClientContactDtoFieldSetService() {
		super();
	}
	
	@Override
	public ClientContactDto changeDto(ClientContactDto clientContact, Map<String, String> fieldValues, 
			String dateFormat, Boolean isDotPrefixed) {
		
		for(String initialField : fieldValues.keySet()) {
			String value = fieldValues.get(initialField);

			String field = initialField;
			if(isDotPrefixed) {
				field = removeDotPrefix(initialField);
			}
			
			if(field.equalsIgnoreCase(CATEGORYID)) {
	
				clientContact.setCategoryID(Utility.forceParseInteger(value));
	
		    } else if(field.equalsIgnoreCase(CERTIFICATIONS)) {
	
				clientContact.setCertifications(value);
	
		    } else if(field.equalsIgnoreCase(CLIENTCORPORATIONID)) {
	
				clientContact.setClientCorporationID(Utility.forceParseInteger(value));
	
		    } else if(field.equalsIgnoreCase(COMMENTS)) {
	
				clientContact.setComments(value);
	
		    } else if(field.equalsIgnoreCase(CUSTOMTEXTBLOCK1)) {
	
				clientContact.setCustomTextBlock1(value);
	
		    } else if(field.equalsIgnoreCase(CUSTOMTEXTBLOCK2)) {
	
				clientContact.setCustomTextBlock2(value);
	
		    } else if(field.equalsIgnoreCase(CUSTOMTEXTBLOCK3)) {
	
				clientContact.setCustomTextBlock3(value);
	
		    } else if(field.equalsIgnoreCase(CUSTOMTEXTBLOCK4)) {
	
				clientContact.setCustomTextBlock4(value);
	
		    } else if(field.equalsIgnoreCase(CUSTOMTEXTBLOCK5)) {
	
				clientContact.setCustomTextBlock5(value);
	
		    } else if(field.equalsIgnoreCase(DATEADDED)) {
	
				clientContact.setDateAdded(Utility.forceParseStringToXMLGregorianCalendar(value, dateFormat));
	
		    } else if(field.equalsIgnoreCase(DATELASTVISIT)) {
	
				clientContact.setDateLastVisit(Utility.forceParseStringToXMLGregorianCalendar(value, dateFormat));
	
		    } else if(field.equalsIgnoreCase(DELETEME)) {
	
				clientContact.setDeleteMe(value);
	
		    } else if(field.equalsIgnoreCase(DESCRIPTION)) {
	
				clientContact.setDescription(value);
	
		    } else if(field.equalsIgnoreCase(DESIREDCATEGORIES)) {
	
				clientContact.setDesiredCategories(value);
	
		    } else if(field.equalsIgnoreCase(DESIREDSKILLS)) {
	
				clientContact.setDesiredSkills(value);
	
		    } else if(field.equalsIgnoreCase(DESIREDSPECIALTIES)) {
	
				clientContact.setDesiredSpecialties(value);
	
		    } else if(field.equalsIgnoreCase(DIVISION)) {
	
				clientContact.setDivision(value);
	
		    } else if(field.equalsIgnoreCase(EXTERNALID)) {
	
				clientContact.setExternalID(value);
	
		    } else if(field.equalsIgnoreCase(LINKEDPERSONID)) {
	
				clientContact.setLinkedPersonID(Utility.forceParseInteger(value));
	
		    } else if(field.equalsIgnoreCase(MIGRATEGUID)) {
	
				clientContact.setMigrateGUID(value);
	
		    } else if(field.equalsIgnoreCase(NUMEMPLOYEES)) {
	
				clientContact.setNumEmployees(Utility.forceParseInteger(value));
	
		    } else if(field.equalsIgnoreCase(OFFICE)) {
	
				clientContact.setOffice(value);
	
		    } else if(field.equalsIgnoreCase(OWNERID)) {
	
				clientContact.setOwnerID(Utility.forceParseInteger(value));
	
		    } else if(field.equalsIgnoreCase(PASSWORD)) {
	
				clientContact.setPassword(value);
	
		    } else if(field.equalsIgnoreCase(PREFERREDCONTACT)) {
	
				clientContact.setPreferredContact(value);
	
		    } else if(field.equalsIgnoreCase(REFERREDBYPERSONID)) {
	
				clientContact.setReferredByPersonID(Utility.forceParseInteger(value));
	
		    } else if(field.equalsIgnoreCase(REPORTTOPERSONID)) {
	
				clientContact.setReportToPersonID(Utility.forceParseInteger(value));
	
		    } else if(field.equalsIgnoreCase(SOURCE)) {
	
				clientContact.setSource(value);
	
		    } else if(field.equalsIgnoreCase(STATUS)) {
	
				clientContact.setStatus(value);
	
		    } else if(field.equalsIgnoreCase(TYPE)) {
	
				clientContact.setType(value);
	
			} else if(field.equalsIgnoreCase(SECONDARYADDRESS1)) {
	
				clientContact.getSecondaryAddress().setAddress1(value);
	
			} else if(field.equalsIgnoreCase(SECONDARYADDRESS2)) {
	
				clientContact.getSecondaryAddress().setAddress2(value);
	
			} else if(field.equalsIgnoreCase(SECONDARYCITY)) {
	
				clientContact.getSecondaryAddress().setCity(value);
	
			} else if(field.equalsIgnoreCase(SECONDARYCOUNTRYID)) {
	
				clientContact.getSecondaryAddress().setCountryID(Utility.forceParseInteger(value));
	
			} else if(field.equalsIgnoreCase(SECONDARYSTATE)) {
	
				clientContact.getSecondaryAddress().setState(value);
	
			} else if(field.equalsIgnoreCase(SECONDARYZIP)) {
	
				clientContact.getSecondaryAddress().setZip(value);
	
		    
			} else if(field.equalsIgnoreCase(CUSTOMDATE1)) {
	
				clientContact.setCustomDate1(Utility.forceParseStringToXMLGregorianCalendar(value, dateFormat));
	
			} else if(field.equalsIgnoreCase(CUSTOMDATE2)) {
	
				clientContact.setCustomDate2(Utility.forceParseStringToXMLGregorianCalendar(value, dateFormat));
	
			} else if(field.equalsIgnoreCase(CUSTOMDATE3)) {
	
				clientContact.setCustomDate3(Utility.forceParseStringToXMLGregorianCalendar(value, dateFormat));
	
			} else if(field.equalsIgnoreCase(CUSTOMFLOAT1)) {
	
				clientContact.setCustomFloat1(Utility.forceParseDouble(value));
	
			} else if(field.equalsIgnoreCase(CUSTOMFLOAT2)) {
	
				clientContact.setCustomFloat2(Utility.forceParseDouble(value));
	
			} else if(field.equalsIgnoreCase(CUSTOMFLOAT3)) {
	
				clientContact.setCustomFloat3(Utility.forceParseDouble(value));
	
			} else if(field.equalsIgnoreCase(CUSTOMINT1)) {
	
				clientContact.setCustomInt1(Utility.forceParseInteger(value));
	
			} else if(field.equalsIgnoreCase(CUSTOMINT2)) {
	
				clientContact.setCustomInt2(Utility.forceParseInteger(value));
	
			} else if(field.equalsIgnoreCase(CUSTOMINT3)) {
	
				clientContact.setCustomInt3(Utility.forceParseInteger(value));
	
			} else if(field.equalsIgnoreCase(CUSTOMTEXT1)) {
	
				clientContact.setCustomText1(value);
	
			} else if(field.equalsIgnoreCase(CUSTOMTEXT10)) {
	
				clientContact.setCustomText10(value);
	
			} else if(field.equalsIgnoreCase(CUSTOMTEXT11)) {
	
				clientContact.setCustomText11(value);
	
			} else if(field.equalsIgnoreCase(CUSTOMTEXT12)) {
	
				clientContact.setCustomText12(value);
	
			} else if(field.equalsIgnoreCase(CUSTOMTEXT13)) {
	
				clientContact.setCustomText13(value);
	
			} else if(field.equalsIgnoreCase(CUSTOMTEXT14)) {
	
				clientContact.setCustomText14(value);
	
			} else if(field.equalsIgnoreCase(CUSTOMTEXT15)) {
	
				clientContact.setCustomText15(value);
	
			} else if(field.equalsIgnoreCase(CUSTOMTEXT16)) {
	
				clientContact.setCustomText16(value);
	
			} else if(field.equalsIgnoreCase(CUSTOMTEXT17)) {
	
				clientContact.setCustomText17(value);
	
			} else if(field.equalsIgnoreCase(CUSTOMTEXT18)) {
	
				clientContact.setCustomText18(value);
	
			} else if(field.equalsIgnoreCase(CUSTOMTEXT19)) {
	
				clientContact.setCustomText19(value);
	
			} else if(field.equalsIgnoreCase(CUSTOMTEXT2)) {
	
				clientContact.setCustomText2(value);
	
			} else if(field.equalsIgnoreCase(CUSTOMTEXT20)) {
	
				clientContact.setCustomText20(value);
	
			} else if(field.equalsIgnoreCase(CUSTOMTEXT3)) {
	
				clientContact.setCustomText3(value);
	
			} else if(field.equalsIgnoreCase(CUSTOMTEXT4)) {
	
				clientContact.setCustomText4(value);
	
			} else if(field.equalsIgnoreCase(CUSTOMTEXT5)) {
	
				clientContact.setCustomText5(value);
	
			} else if(field.equalsIgnoreCase(CUSTOMTEXT6)) {
	
				clientContact.setCustomText6(value);
	
			} else if(field.equalsIgnoreCase(CUSTOMTEXT7)) {
	
				clientContact.setCustomText7(value);
	
			} else if(field.equalsIgnoreCase(CUSTOMTEXT8)) {
	
				clientContact.setCustomText8(value);
	
			} else if(field.equalsIgnoreCase(CUSTOMTEXT9)) {
	
				clientContact.setCustomText9(value);
	
			} else if(field.equalsIgnoreCase(DATELASTCOMMENT)) {
	
				clientContact.setDateLastComment(Utility.forceParseStringToXMLGregorianCalendar(value, dateFormat));
	
			} else if(field.equalsIgnoreCase(EMAIL)) {
	
				clientContact.setEmail(value);
	
			} else if(field.equalsIgnoreCase(EMAIL2)) {
	
				clientContact.setEmail2(value);
	
			} else if(field.equalsIgnoreCase(EMAIL3)) {
	
				clientContact.setEmail3(value);
	
			} else if(field.equalsIgnoreCase(FAX)) {
	
				clientContact.setFax(value);
	
			} else if(field.equalsIgnoreCase(FAX2)) {
	
				clientContact.setFax2(value);
	
			} else if(field.equalsIgnoreCase(FAX3)) {
	
				clientContact.setFax3(value);
	
			} else if(field.equalsIgnoreCase(FIRSTNAME)) {
	
				clientContact.setFirstName(value);
	
			} else if(field.equalsIgnoreCase(ISDAYLIGHTSAVINGS)) {
	
				clientContact.setIsDayLightSavings(Utility.parseBoolean(value));
	
			} else if(field.equalsIgnoreCase(ISDELETED)) {
	
				clientContact.setIsDeleted(Utility.parseBoolean(value));
	
			} else if(field.equalsIgnoreCase(ISLOCKEDOUT)) {
	
				clientContact.setIsLockedOut(Utility.parseBoolean(value));
	
			} else if(field.equalsIgnoreCase(LASTNAME)) {
	
				clientContact.setLastName(value);
	
			} else if(field.equalsIgnoreCase(MASSMAILOPTOUT)) {
	
				clientContact.setMassMailOptOut(Utility.parseBoolean(value));
	
			} else if(field.equalsIgnoreCase(MIDDLENAME)) {
	
				clientContact.setMiddleName(value);
	
			} else if(field.equalsIgnoreCase(MOBILE)) {
	
				clientContact.setMobile(value);
	
			} else if(field.equalsIgnoreCase(NAME)) {
	
				clientContact.setName(value);
	
			} else if(field.equalsIgnoreCase(NAMEPREFIX)) {
	
				clientContact.setNamePrefix(value);
	
			} else if(field.equalsIgnoreCase(NAMESUFFIX)) {
	
				clientContact.setNameSuffix(value);
	
			} else if(field.equalsIgnoreCase(NICKNAME)) {
	
				clientContact.setNickName(value);
	
			} else if(field.equalsIgnoreCase(OCCUPATION)) {
	
				clientContact.setOccupation(value);
	
			} else if(field.equalsIgnoreCase(PAGER)) {
	
				clientContact.setPager(value);
	
			} else if(field.equalsIgnoreCase(PHONE)) {
	
				clientContact.setPhone(value);
	
			} else if(field.equalsIgnoreCase(PHONE2)) {
	
				clientContact.setPhone2(value);
	
			} else if(field.equalsIgnoreCase(PHONE3)) {
	
				clientContact.setPhone3(value);
	
			} else if(field.equalsIgnoreCase(SMSOPTIN)) {
	
				clientContact.setSmsOptIn(Utility.parseBoolean(value));
	
			} else if(field.equalsIgnoreCase(TIMEZONEOFFSETEST)) {
	
				clientContact.setTimeZoneOffsetEST(Utility.forceParseInteger(value));
	
			} else if(field.equalsIgnoreCase(USERID)) {
	
				clientContact.setUserID(Utility.forceParseInteger(value));
	
			} else if(field.equalsIgnoreCase(USERTYPEID)) {
	
				clientContact.setUserTypeID(Utility.forceParseInteger(value));
	
			} else if(field.equalsIgnoreCase(USERNAME)) {
	
				clientContact.setUsername(value);
	
			} else if(field.equalsIgnoreCase(ADDRESS1)) {
	
				clientContact.getAddress().setAddress1(value);
	
			} else if(field.equalsIgnoreCase(ADDRESS2)) {
	
				clientContact.getAddress().setAddress2(value);
	
			} else if(field.equalsIgnoreCase(CITY)) {
	
				clientContact.getAddress().setCity(value);
	
			} else if(field.equalsIgnoreCase(COUNTRYID)) {
	
				clientContact.getAddress().setCountryID(Utility.forceParseInteger(value));
	
			} else if(field.equalsIgnoreCase(STATE)) {
	
				clientContact.getAddress().setState(value);
	
			} else if(field.equalsIgnoreCase(ZIP)) {
	
				clientContact.getAddress().setZip(value);
			
			}
			
		}
		
		return clientContact;
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
