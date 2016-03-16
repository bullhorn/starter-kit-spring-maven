package com.client.core.soap.tools.property.getdtofields.impl;

import org.springframework.stereotype.Service;

import com.bullhorn.entity.user.CorporateUserDto;
import com.client.core.soap.tools.property.getdtofields.DtoFieldGetService;

@Service("corporateUserGetService")
public class CorporateUserDtoFieldGetService extends DtoFieldGetService<CorporateUserDto> {
	
	public CorporateUserDtoFieldGetService() {
		super();
	}
	
	@Override
	public Object retrieveField(String field, CorporateUserDto corporateUser, Boolean isDotPrefixed) throws NoSuchMethodException {
		Object value = null;

		if(isDotPrefixed) {
			field = removeDotPrefix(field);
		}
		
		if(field.equalsIgnoreCase(CUSTOMDATE1)) {
			value = corporateUser.getCustomDate1();
		}
		else if(field.equalsIgnoreCase(CUSTOMDATE2)) {
			value = corporateUser.getCustomDate2();
		}
		else if(field.equalsIgnoreCase(CUSTOMDATE3)) {
			value = corporateUser.getCustomDate3();
		}
		else if(field.equalsIgnoreCase(CUSTOMFLOAT1)) {
			value = corporateUser.getCustomFloat1();
		}
		else if(field.equalsIgnoreCase(CUSTOMFLOAT2)) {
			value = corporateUser.getCustomFloat2();
		}
		else if(field.equalsIgnoreCase(CUSTOMFLOAT3)) {
			value = corporateUser.getCustomFloat3();
		}
		else if(field.equalsIgnoreCase(CUSTOMINT1)) {
			value = corporateUser.getCustomInt1();
		}
		else if(field.equalsIgnoreCase(CUSTOMINT2)) {
			value = corporateUser.getCustomInt2();
		}
		else if(field.equalsIgnoreCase(CUSTOMINT3)) {
			value = corporateUser.getCustomInt3();
		}
		else if(field.equalsIgnoreCase(CUSTOMTEXT1)) {
			value = corporateUser.getCustomText1();
		}
		else if(field.equalsIgnoreCase(CUSTOMTEXT10)) {
			value = corporateUser.getCustomText10();
		}
		else if(field.equalsIgnoreCase(CUSTOMTEXT11)) {
			value = corporateUser.getCustomText11();
		}
		else if(field.equalsIgnoreCase(CUSTOMTEXT12)) {
			value = corporateUser.getCustomText12();
		}
		else if(field.equalsIgnoreCase(CUSTOMTEXT13)) {
			value = corporateUser.getCustomText13();
		}
		else if(field.equalsIgnoreCase(CUSTOMTEXT14)) {
			value = corporateUser.getCustomText14();
		}
		else if(field.equalsIgnoreCase(CUSTOMTEXT15)) {
			value = corporateUser.getCustomText15();
		}
		else if(field.equalsIgnoreCase(CUSTOMTEXT16)) {
			value = corporateUser.getCustomText16();
		}
		else if(field.equalsIgnoreCase(CUSTOMTEXT17)) {
			value = corporateUser.getCustomText17();
		}
		else if(field.equalsIgnoreCase(CUSTOMTEXT18)) {
			value = corporateUser.getCustomText18();
		}
		else if(field.equalsIgnoreCase(CUSTOMTEXT19)) {
			value = corporateUser.getCustomText19();
		}
		else if(field.equalsIgnoreCase(CUSTOMTEXT2)) {
			value = corporateUser.getCustomText2();
		}
		else if(field.equalsIgnoreCase(CUSTOMTEXT20)) {
			value = corporateUser.getCustomText20();
		}
		else if(field.equalsIgnoreCase(CUSTOMTEXT3)) {
			value = corporateUser.getCustomText3();
		}
		else if(field.equalsIgnoreCase(CUSTOMTEXT4)) {
			value = corporateUser.getCustomText4();
		}
		else if(field.equalsIgnoreCase(CUSTOMTEXT5)) {
			value = corporateUser.getCustomText5();
		}
		else if(field.equalsIgnoreCase(CUSTOMTEXT6)) {
			value = corporateUser.getCustomText6();
		}
		else if(field.equalsIgnoreCase(CUSTOMTEXT7)) {
			value = corporateUser.getCustomText7();
		}
		else if(field.equalsIgnoreCase(CUSTOMTEXT8)) {
			value = corporateUser.getCustomText8();
		}
		else if(field.equalsIgnoreCase(CUSTOMTEXT9)) {
			value = corporateUser.getCustomText9();
		}
		else if(field.equalsIgnoreCase(DATELASTCOMMENT)) {
			value = corporateUser.getDateLastComment();
		}
		else if(field.equalsIgnoreCase(EMAIL)) {
			value = corporateUser.getEmail();
		}
		else if(field.equalsIgnoreCase(EMAIL2)) {
			value = corporateUser.getEmail2();
		}
		else if(field.equalsIgnoreCase(EMAIL3)) {
			value = corporateUser.getEmail3();
		}
		else if(field.equalsIgnoreCase(FAX)) {
			value = corporateUser.getFax();
		}
		else if(field.equalsIgnoreCase(FAX2)) {
			value = corporateUser.getFax2();
		}
		else if(field.equalsIgnoreCase(FAX3)) {
			value = corporateUser.getFax3();
		}
		else if(field.equalsIgnoreCase(FIRSTNAME)) {
			value = corporateUser.getFirstName();
		}
		else if(field.equalsIgnoreCase(ISDAYLIGHTSAVINGS)) {
			value = corporateUser.isIsDayLightSavings();
		}
		else if(field.equalsIgnoreCase(ISDELETED)) {
			value = corporateUser.isIsDeleted();
		}
		else if(field.equalsIgnoreCase(ISLOCKEDOUT)) {
			value = corporateUser.isIsLockedOut();
		}
		else if(field.equalsIgnoreCase(LASTNAME)) {
			value = corporateUser.getLastName();
		}
		else if(field.equalsIgnoreCase(MASSMAILOPTOUT)) {
			value = corporateUser.isMassMailOptOut();
		}
		else if(field.equalsIgnoreCase(MIDDLENAME)) {
			value = corporateUser.getMiddleName();
		}
		else if(field.equalsIgnoreCase(MOBILE)) {
			value = corporateUser.getMobile();
		}
		else if(field.equalsIgnoreCase(NAME)) {
			value = corporateUser.getName();
		}
		else if(field.equalsIgnoreCase(NAMEPREFIX)) {
			value = corporateUser.getNamePrefix();
		}
		else if(field.equalsIgnoreCase(NAMESUFFIX)) {
			value = corporateUser.getNameSuffix();
		}
		else if(field.equalsIgnoreCase(NICKNAME)) {
			value = corporateUser.getNickName();
		}
		else if(field.equalsIgnoreCase(OCCUPATION)) {
			value = corporateUser.getOccupation();
		}
		else if(field.equalsIgnoreCase(PAGER)) {
			value = corporateUser.getPager();
		}
		else if(field.equalsIgnoreCase(PHONE)) {
			value = corporateUser.getPhone();
		}
		else if(field.equalsIgnoreCase(PHONE2)) {
			value = corporateUser.getPhone2();
		}
		else if(field.equalsIgnoreCase(PHONE3)) {
			value = corporateUser.getPhone3();
		}
		else if(field.equalsIgnoreCase(SMSOPTIN)) {
			value = corporateUser.isSmsOptIn();
		}
		else if(field.equalsIgnoreCase(TIMEZONEOFFSETEST)) {
			value = corporateUser.getTimeZoneOffsetEST();
		}
		else if(field.equalsIgnoreCase(USERID)) {
			value = corporateUser.getUserID();
		}
		else if(field.equalsIgnoreCase(USERTYPEID)) {
			value = corporateUser.getUserTypeID();
		}
		else if(field.equalsIgnoreCase(USERNAME)) {
			value = corporateUser.getUsername();
		}
		else if(field.equalsIgnoreCase(CORPORATIONID)) {
			value = corporateUser.getCorporationID();
		}
		else if(field.equalsIgnoreCase(EMAILNOTIFY)) {
			value = corporateUser.isEmailNotify();
		}
		else if(field.equalsIgnoreCase(EMAILSIGNATURE)) {
			value = corporateUser.getEmailSignature();
		}
		else if(field.equalsIgnoreCase(ENABLED)) {
			value = corporateUser.isEnabled();
		}
		else if(field.equalsIgnoreCase(EXTERNALEMAIL)) {
			value = corporateUser.getExternalEmail();
		}
		else if(field.equalsIgnoreCase(INBOUNDEMAILENABLED)) {
			value = corporateUser.isInboundEmailEnabled();
		}
		else if(field.equalsIgnoreCase(ISOUTBOUNDFAXENABLED)) {
			value = corporateUser.isIsOutboundFaxEnabled();
		}
		else if(field.equalsIgnoreCase(PASSWORD)) {
			value = corporateUser.getPassword();
		}
		else if(field.equalsIgnoreCase(PRIMARYPRIVATELABELID)) {
			value = corporateUser.getPrimaryPrivateLabelID();
		}
		else if(field.equalsIgnoreCase(ADDRESS)) {
			value = corporateUser.getAddress();
		}
		else if(field.equalsIgnoreCase(ADDRESS1)) {
			value = corporateUser.getAddress().getAddress1();
		}
		else if(field.equalsIgnoreCase(ADDRESS2)) {
			value = corporateUser.getAddress().getAddress2();
		}
		else if(field.equalsIgnoreCase(CITY)) {
			value = corporateUser.getAddress().getCity();
		}
		else if(field.equalsIgnoreCase(COUNTRYID)) {
			value = corporateUser.getAddress().getCountryID();
		}
		else if(field.equalsIgnoreCase(STATE)) {
			value = corporateUser.getAddress().getState();
		}
		else if(field.equalsIgnoreCase(ZIP)) {
			value = corporateUser.getAddress().getZip();
		}
		else {
			throw new NoSuchMethodException();
		}

		return value;
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
	private String ADDRESS = "address";
	private String ADDRESS1="address1";
	private String ADDRESS2="address2";
	private String CITY="city";
	private String COUNTRYID="countryID";
	private String STATE="state";
	private String ZIP="zip";

}
