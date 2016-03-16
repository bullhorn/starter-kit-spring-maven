package com.client.core.soap.tools.property.setdtofields.impl;

import java.util.Map;

import org.springframework.stereotype.Service;

import com.bullhorn.entity.user.CorporateUserDto;
import com.client.core.soap.tools.property.setdtofields.DtoFieldSetService;
import com.client.core.base.util.Utility;

@Service("corporateUserSetService")
public class CorporateUserDtoFieldSetService extends DtoFieldSetService<CorporateUserDto> {
	
	public CorporateUserDtoFieldSetService() {
		super();
	}

	@Override
	public CorporateUserDto changeDto(CorporateUserDto corporateUser, Map<String, String> fieldValues, 
			String dateFormat, Boolean isDotPrefixed) {
		for(String initialField : fieldValues.keySet()) {
			String value = fieldValues.get(initialField);

			String field = initialField;
			if(isDotPrefixed) {
				field = removeDotPrefix(initialField);
			}

			if(field.equalsIgnoreCase(CUSTOMDATE1)) {

				corporateUser.setCustomDate1(Utility.forceParseStringToXMLGregorianCalendar(value, dateFormat));

			} else if(field.equalsIgnoreCase(CUSTOMDATE2)) {

				corporateUser.setCustomDate2(Utility.forceParseStringToXMLGregorianCalendar(value, dateFormat));

			} else if(field.equalsIgnoreCase(CUSTOMDATE3)) {

				corporateUser.setCustomDate3(Utility.forceParseStringToXMLGregorianCalendar(value, dateFormat));

			} else if(field.equalsIgnoreCase(CUSTOMFLOAT1)) {

				corporateUser.setCustomFloat1(Utility.forceParseDouble(value));

			} else if(field.equalsIgnoreCase(CUSTOMFLOAT2)) {

				corporateUser.setCustomFloat2(Utility.forceParseDouble(value));

			} else if(field.equalsIgnoreCase(CUSTOMFLOAT3)) {

				corporateUser.setCustomFloat3(Utility.forceParseDouble(value));

			} else if(field.equalsIgnoreCase(CUSTOMINT1)) {

				corporateUser.setCustomInt1(Utility.forceParseInteger(value));

			} else if(field.equalsIgnoreCase(CUSTOMINT2)) {

				corporateUser.setCustomInt2(Utility.forceParseInteger(value));

			} else if(field.equalsIgnoreCase(CUSTOMINT3)) {

				corporateUser.setCustomInt3(Utility.forceParseInteger(value));

			} else if(field.equalsIgnoreCase(CUSTOMTEXT1)) {

				corporateUser.setCustomText1(value);

			} else if(field.equalsIgnoreCase(CUSTOMTEXT10)) {

				corporateUser.setCustomText10(value);

			} else if(field.equalsIgnoreCase(CUSTOMTEXT11)) {

				corporateUser.setCustomText11(value);

			} else if(field.equalsIgnoreCase(CUSTOMTEXT12)) {

				corporateUser.setCustomText12(value);

			} else if(field.equalsIgnoreCase(CUSTOMTEXT13)) {

				corporateUser.setCustomText13(value);

			} else if(field.equalsIgnoreCase(CUSTOMTEXT14)) {

				corporateUser.setCustomText14(value);

			} else if(field.equalsIgnoreCase(CUSTOMTEXT15)) {

				corporateUser.setCustomText15(value);

			} else if(field.equalsIgnoreCase(CUSTOMTEXT16)) {

				corporateUser.setCustomText16(value);

			} else if(field.equalsIgnoreCase(CUSTOMTEXT17)) {

				corporateUser.setCustomText17(value);

			} else if(field.equalsIgnoreCase(CUSTOMTEXT18)) {

				corporateUser.setCustomText18(value);

			} else if(field.equalsIgnoreCase(CUSTOMTEXT19)) {

				corporateUser.setCustomText19(value);

			} else if(field.equalsIgnoreCase(CUSTOMTEXT2)) {

				corporateUser.setCustomText2(value);

			} else if(field.equalsIgnoreCase(CUSTOMTEXT20)) {

				corporateUser.setCustomText20(value);

			} else if(field.equalsIgnoreCase(CUSTOMTEXT3)) {

				corporateUser.setCustomText3(value);

			} else if(field.equalsIgnoreCase(CUSTOMTEXT4)) {

				corporateUser.setCustomText4(value);

			} else if(field.equalsIgnoreCase(CUSTOMTEXT5)) {

				corporateUser.setCustomText5(value);

			} else if(field.equalsIgnoreCase(CUSTOMTEXT6)) {

				corporateUser.setCustomText6(value);

			} else if(field.equalsIgnoreCase(CUSTOMTEXT7)) {

				corporateUser.setCustomText7(value);

			} else if(field.equalsIgnoreCase(CUSTOMTEXT8)) {

				corporateUser.setCustomText8(value);

			} else if(field.equalsIgnoreCase(CUSTOMTEXT9)) {

				corporateUser.setCustomText9(value);

			} else if(field.equalsIgnoreCase(DATELASTCOMMENT)) {

				corporateUser.setDateLastComment(Utility.forceParseStringToXMLGregorianCalendar(value, dateFormat));

			} else if(field.equalsIgnoreCase(EMAIL)) {

				corporateUser.setEmail(value);

			} else if(field.equalsIgnoreCase(EMAIL2)) {

				corporateUser.setEmail2(value);

			} else if(field.equalsIgnoreCase(EMAIL3)) {

				corporateUser.setEmail3(value);

			} else if(field.equalsIgnoreCase(FAX)) {

				corporateUser.setFax(value);

			} else if(field.equalsIgnoreCase(FAX2)) {

				corporateUser.setFax2(value);

			} else if(field.equalsIgnoreCase(FAX3)) {

				corporateUser.setFax3(value);

			} else if(field.equalsIgnoreCase(FIRSTNAME)) {

				corporateUser.setFirstName(value);

			} else if(field.equalsIgnoreCase(ISDAYLIGHTSAVINGS)) {

				corporateUser.setIsDayLightSavings(Utility.parseBoolean(value));

			} else if(field.equalsIgnoreCase(ISDELETED)) {

				corporateUser.setIsDeleted(Utility.parseBoolean(value));

			} else if(field.equalsIgnoreCase(ISLOCKEDOUT)) {

				corporateUser.setIsLockedOut(Utility.parseBoolean(value));

			} else if(field.equalsIgnoreCase(LASTNAME)) {

				corporateUser.setLastName(value);

			} else if(field.equalsIgnoreCase(MASSMAILOPTOUT)) {

				corporateUser.setMassMailOptOut(Utility.parseBoolean(value));

			} else if(field.equalsIgnoreCase(MIDDLENAME)) {

				corporateUser.setMiddleName(value);

			} else if(field.equalsIgnoreCase(MOBILE)) {

				corporateUser.setMobile(value);

			} else if(field.equalsIgnoreCase(NAME)) {

				corporateUser.setName(value);

			} else if(field.equalsIgnoreCase(NAMEPREFIX)) {

				corporateUser.setNamePrefix(value);

			} else if(field.equalsIgnoreCase(NAMESUFFIX)) {

				corporateUser.setNameSuffix(value);

			} else if(field.equalsIgnoreCase(NICKNAME)) {

				corporateUser.setNickName(value);

			} else if(field.equalsIgnoreCase(OCCUPATION)) {

				corporateUser.setOccupation(value);

			} else if(field.equalsIgnoreCase(PAGER)) {

				corporateUser.setPager(value);

			} else if(field.equalsIgnoreCase(PHONE)) {

				corporateUser.setPhone(value);

			} else if(field.equalsIgnoreCase(PHONE2)) {

				corporateUser.setPhone2(value);

			} else if(field.equalsIgnoreCase(PHONE3)) {

				corporateUser.setPhone3(value);

			} else if(field.equalsIgnoreCase(SMSOPTIN)) {

				corporateUser.setSmsOptIn(Utility.parseBoolean(value));

			} else if(field.equalsIgnoreCase(TIMEZONEOFFSETEST)) {

				corporateUser.setTimeZoneOffsetEST(Utility.forceParseInteger(value));

			} else if(field.equalsIgnoreCase(USERID)) {

				corporateUser.setUserID(Utility.forceParseInteger(value));

			} else if(field.equalsIgnoreCase(USERTYPEID)) {

				corporateUser.setUserTypeID(Utility.forceParseInteger(value));

			} else if(field.equalsIgnoreCase(USERNAME)) {

				corporateUser.setUsername(value);

			} else if(field.equalsIgnoreCase(CORPORATIONID)) {

				corporateUser.setCorporationID(Utility.forceParseInteger(value));

			} else if(field.equalsIgnoreCase(EMAILNOTIFY)) {

				corporateUser.setEmailNotify(Utility.parseBoolean(value));

			} else if(field.equalsIgnoreCase(EMAILSIGNATURE)) {

				corporateUser.setEmailSignature(value);

			} else if(field.equalsIgnoreCase(ENABLED)) {

				corporateUser.setEnabled(Utility.parseBoolean(value));

			} else if(field.equalsIgnoreCase(EXTERNALEMAIL)) {

				corporateUser.setExternalEmail(value);

			} else if(field.equalsIgnoreCase(INBOUNDEMAILENABLED)) {

				corporateUser.setInboundEmailEnabled(Utility.parseBoolean(value));

			} else if(field.equalsIgnoreCase(ISOUTBOUNDFAXENABLED)) {

				corporateUser.setIsOutboundFaxEnabled(Utility.parseBoolean(value));

			} else if(field.equalsIgnoreCase(PASSWORD)) {

				corporateUser.setPassword(value);

			} else if(field.equalsIgnoreCase(PRIMARYPRIVATELABELID)) {

				corporateUser.setPrimaryPrivateLabelID(Utility.forceParseInteger(value));

			} else if(field.equalsIgnoreCase(ADDRESS1)) {

				corporateUser.getAddress().setAddress1(value);

			} else if(field.equalsIgnoreCase(ADDRESS2)) {

				corporateUser.getAddress().setAddress2(value);

			} else if(field.equalsIgnoreCase(CITY)) {

				corporateUser.getAddress().setCity(value);

			} else if(field.equalsIgnoreCase(COUNTRYID)) {

				corporateUser.getAddress().setCountryID(Utility.forceParseInteger(value));

			} else if(field.equalsIgnoreCase(STATE)) {

				corporateUser.getAddress().setState(value);

			} else if(field.equalsIgnoreCase(ZIP)) {

				corporateUser.getAddress().setZip(value);

			}

		}
		return corporateUser;
	}

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
	private String CORPORATIONID="corporationID";
	private String EMAILNOTIFY="emailNotify";
	private String EMAILSIGNATURE="emailSignature";
	private String ENABLED="enabled";
	private String EXTERNALEMAIL="externalEmail";
	private String INBOUNDEMAILENABLED="inboundEmailEnabled";
	private String ISOUTBOUNDFAXENABLED="isOutboundFaxEnabled";
	private String PASSWORD="password";
	private String PRIMARYPRIVATELABELID="primaryPrivateLabelID";
	private String ADDRESS1="address1";
	private String ADDRESS2="address2";
	private String CITY="city";
	private String COUNTRYID="countryID";
	private String STATE="state";
	private String ZIP="zip";

}
