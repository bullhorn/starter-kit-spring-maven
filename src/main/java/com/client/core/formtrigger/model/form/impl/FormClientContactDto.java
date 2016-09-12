package com.client.core.formtrigger.model.form.impl;

import com.bullhorn.entity.client.ClientContactDto;
import com.bullhornsdk.data.model.entity.core.standard.Category;
import com.bullhornsdk.data.model.entity.core.standard.ClientContact;
import com.bullhornsdk.data.model.entity.core.standard.ClientCorporation;
import com.bullhornsdk.data.model.entity.core.standard.CorporateUser;
import com.bullhornsdk.data.model.entity.core.standard.Person;
import com.bullhornsdk.data.model.entity.embedded.Address;
import com.client.core.base.util.Util;
import com.client.core.formtrigger.model.form.AbstractFormDto;
import org.apache.log4j.Logger;

/**
 * Maps a client contact form in BH to a ClientContactDto
 * 
 * @author magnus.palm
 * 
 */

public class FormClientContactDto extends AbstractFormDto<ClientContact> {

	private String address1;
	private String address2;
	private String businessSectorID;
	private String candidateRestrictionBits;
	private String candidateSourceID;
	private String categoryID;
	private String categoryID_display;
	private String certifications;
	private String city;
	private Integer clientCorporationID;
	private String clientCorporationID_display;
	private String companyDescription;
	private String comments;
	private String companyName;
	private String companyURL;
	private Integer countryID;
	private String customDate1;
	private String customDate2;
	private String customDate3;
	private String customFloat1;
	private String customFloat2;
	private String customFloat3;
	private Integer customInt1;
	private Integer customInt2;
	private Integer customInt3;
	private String customText1;
	private String customText10;
	private String customText11;
	private String customText12;
	private String customText13;
	private String customText14;
	private String customText15;
	private String customText16;
	private String customText17;
	private String customText18;
	private String customText19;
	private String customText2;
	private String customText20;
	private String customText3;
	private String customText4;
	private String customText5;
	private String customText6;
	private String customText7;
	private String customText8;
	private String customText9;
	private String customTextBlock1;
	private String customTextBlock2;
	private String customTextBlock3;
	private String customTextBlock4;
	private String customTextBlock5;
	private String dateLastVisit;
	private String desiredCategories;
	private String desiredCategories_display;
	private String desiredSkills;
	private String desiredSkills_display;
	private String desiredSpecialties;
	private String division;
	private String description;
	private String email;
	private String email2;
	private String email3;
	private String externalID;
	private String fax;
	private String fax2;
	private String fax3;
	private String firstName;
	private String lastName;
	private String middleName;
	private String mobile;
	private String namePrefix;
	private String nameSuffix;
	private String nickName;
	private String occupation;
	private String office;
	private String pager;
	private String phone;
	private String phone2;
	private String phone3;
	private String preferredContact;
	private String recruiterUserID;
	private String recruiterUserID_display;
	private Integer referredByUserID;
	private String referredByUserID_display;
	private Integer reportToUserID;
	private String secondaryAddress1;
	private String secondaryAddress2;
	private String secondaryCity;
	private Integer secondaryCountryID;
	private String secondaryState;
	private String secondaryState_display;
	private String secondaryZip;
	private Boolean smsOptIn;
	private String source;
	private String state;
	private String status;
	private String type;
	private Integer userID;
	private String zip;

	public FormClientContactDto() {
		super(Logger.getLogger(FormClientContactDto.class));
	}

	public String getAddress1() {
		return address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	public String getAddress2() {
		return address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	public String getBusinessSectorID() {
		return businessSectorID;
	}

	public void setBusinessSectorID(String businessSectorID) {
		this.businessSectorID = businessSectorID;
	}

	public String getCandidateRestrictionBits() {
		return candidateRestrictionBits;
	}

	public void setCandidateRestrictionBits(String candidateRestrictionBits) {
		this.candidateRestrictionBits = candidateRestrictionBits;
	}

	public String getCandidateSourceID() {
		return candidateSourceID;
	}

	public void setCandidateSourceID(String candidateSourceID) {
		this.candidateSourceID = candidateSourceID;
	}

	public String getCategoryID() {
		return categoryID;
	}

	public void setCategoryID(String categoryID) {
		this.categoryID = categoryID;
	}

	public String getCategoryID_display() {
		return categoryID_display;
	}

	public void setCategoryID_display(String categoryID_display) {
		this.categoryID_display = categoryID_display;
	}

	public String getCertifications() {
		return certifications;
	}

	public void setCertifications(String certifications) {
		this.certifications = certifications;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Integer getClientCorporationID() {
		return clientCorporationID;
	}

	public void setClientCorporationID(Integer clientCorporationID) {
		this.clientCorporationID = clientCorporationID;
	}

	public String getClientCorporationID_display() {
		return clientCorporationID_display;
	}

	public void setClientCorporationID_display(String clientCorporationID_display) {
		this.clientCorporationID_display = clientCorporationID_display;
	}

	public String getCompanyDescription() {
		return companyDescription;
	}

	public void setCompanyDescription(String companyDescription) {
		this.companyDescription = companyDescription;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getCompanyURL() {
		return companyURL;
	}

	public void setCompanyURL(String companyURL) {
		this.companyURL = companyURL;
	}

	public Integer getCountryID() {
		return countryID;
	}

	public void setCountryID(Integer countryID) {
		this.countryID = countryID;
	}

	public String getCustomDate1() {
		return customDate1;
	}

	public void setCustomDate1(String customDate1) {
		this.customDate1 = customDate1;
	}

	public String getCustomDate2() {
		return customDate2;
	}

	public void setCustomDate2(String customDate2) {
		this.customDate2 = customDate2;
	}

	public String getCustomDate3() {
		return customDate3;
	}

	public void setCustomDate3(String customDate3) {
		this.customDate3 = customDate3;
	}

	public String getCustomFloat1() {
		return customFloat1;
	}

	public void setCustomFloat1(String customFloat1) {
		this.customFloat1 = customFloat1;
	}

	public String getCustomFloat2() {
		return customFloat2;
	}

	public void setCustomFloat2(String customFloat2) {
		this.customFloat2 = customFloat2;
	}

	public String getCustomFloat3() {
		return customFloat3;
	}

	public void setCustomFloat3(String customFloat3) {
		this.customFloat3 = customFloat3;
	}

	public Integer getCustomInt1() {
		return customInt1;
	}

	public void setCustomInt1(Integer customInt1) {
		this.customInt1 = customInt1;
	}

	public Integer getCustomInt2() {
		return customInt2;
	}

	public void setCustomInt2(Integer customInt2) {
		this.customInt2 = customInt2;
	}

	public Integer getCustomInt3() {
		return customInt3;
	}

	public void setCustomInt3(Integer customInt3) {
		this.customInt3 = customInt3;
	}

	public String getCustomText1() {
		return customText1;
	}

	public void setCustomText1(String customText1) {
		this.customText1 = customText1;
	}

	public String getCustomText10() {
		return customText10;
	}

	public void setCustomText10(String customText10) {
		this.customText10 = customText10;
	}

	public String getCustomText11() {
		return customText11;
	}

	public void setCustomText11(String customText11) {
		this.customText11 = customText11;
	}

	public String getCustomText12() {
		return customText12;
	}

	public void setCustomText12(String customText12) {
		this.customText12 = customText12;
	}

	public String getCustomText13() {
		return customText13;
	}

	public void setCustomText13(String customText13) {
		this.customText13 = customText13;
	}

	public String getCustomText14() {
		return customText14;
	}

	public void setCustomText14(String customText14) {
		this.customText14 = customText14;
	}

	public String getCustomText15() {
		return customText15;
	}

	public void setCustomText15(String customText15) {
		this.customText15 = customText15;
	}

	public String getCustomText16() {
		return customText16;
	}

	public void setCustomText16(String customText16) {
		this.customText16 = customText16;
	}

	public String getCustomText17() {
		return customText17;
	}

	public void setCustomText17(String customText17) {
		this.customText17 = customText17;
	}

	public String getCustomText18() {
		return customText18;
	}

	public void setCustomText18(String customText18) {
		this.customText18 = customText18;
	}

	public String getCustomText19() {
		return customText19;
	}

	public void setCustomText19(String customText19) {
		this.customText19 = customText19;
	}

	public String getCustomText2() {
		return customText2;
	}

	public void setCustomText2(String customText2) {
		this.customText2 = customText2;
	}

	public String getCustomText20() {
		return customText20;
	}

	public void setCustomText20(String customText20) {
		this.customText20 = customText20;
	}

	public String getCustomText3() {
		return customText3;
	}

	public void setCustomText3(String customText3) {
		this.customText3 = customText3;
	}

	public String getCustomText4() {
		return customText4;
	}

	public void setCustomText4(String customText4) {
		this.customText4 = customText4;
	}

	public String getCustomText5() {
		return customText5;
	}

	public void setCustomText5(String customText5) {
		this.customText5 = customText5;
	}

	public String getCustomText6() {
		return customText6;
	}

	public void setCustomText6(String customText6) {
		this.customText6 = customText6;
	}

	public String getCustomText7() {
		return customText7;
	}

	public void setCustomText7(String customText7) {
		this.customText7 = customText7;
	}

	public String getCustomText8() {
		return customText8;
	}

	public void setCustomText8(String customText8) {
		this.customText8 = customText8;
	}

	public String getCustomText9() {
		return customText9;
	}

	public void setCustomText9(String customText9) {
		this.customText9 = customText9;
	}

	public String getCustomTextBlock1() {
		return customTextBlock1;
	}

	public void setCustomTextBlock1(String customTextBlock1) {
		this.customTextBlock1 = customTextBlock1;
	}

	public String getCustomTextBlock2() {
		return customTextBlock2;
	}

	public void setCustomTextBlock2(String customTextBlock2) {
		this.customTextBlock2 = customTextBlock2;
	}

	public String getCustomTextBlock3() {
		return customTextBlock3;
	}

	public void setCustomTextBlock3(String customTextBlock3) {
		this.customTextBlock3 = customTextBlock3;
	}

	public String getCustomTextBlock4() {
		return customTextBlock4;
	}

	public void setCustomTextBlock4(String customTextBlock4) {
		this.customTextBlock4 = customTextBlock4;
	}

	public String getCustomTextBlock5() {
		return customTextBlock5;
	}

	public void setCustomTextBlock5(String customTextBlock5) {
		this.customTextBlock5 = customTextBlock5;
	}

	public String getDateLastVisit() {
		return dateLastVisit;
	}

	public void setDateLastVisit(String dateLastVisit) {
		this.dateLastVisit = dateLastVisit;
	}

	public String getDesiredCategories() {
		return desiredCategories;
	}

	public void setDesiredCategories(String desiredCategories) {
		this.desiredCategories = desiredCategories;
	}

	public String getDesiredCategories_display() {
		return desiredCategories_display;
	}

	public void setDesiredCategories_display(String desiredCategories_display) {
		this.desiredCategories_display = desiredCategories_display;
	}

	public String getDesiredSkills() {
		return desiredSkills;
	}

	public void setDesiredSkills(String desiredSkills) {
		this.desiredSkills = desiredSkills;
	}

	public String getDesiredSkills_display() {
		return desiredSkills_display;
	}

	public void setDesiredSkills_display(String desiredSkills_display) {
		this.desiredSkills_display = desiredSkills_display;
	}

	public String getDesiredSpecialties() {
		return desiredSpecialties;
	}

	public void setDesiredSpecialties(String desiredSpecialties) {
		this.desiredSpecialties = desiredSpecialties;
	}

	public String getDivision() {
		return division;
	}

	public void setDivision(String division) {
		this.division = division;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEmail2() {
		return email2;
	}

	public void setEmail2(String email2) {
		this.email2 = email2;
	}

	public String getEmail3() {
		return email3;
	}

	public void setEmail3(String email3) {
		this.email3 = email3;
	}

	public String getExternalID() {
		return externalID;
	}

	public void setExternalID(String externalID) {
		this.externalID = externalID;
	}

	public String getFax() {
		return fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	public String getFax2() {
		return fax2;
	}

	public void setFax2(String fax2) {
		this.fax2 = fax2;
	}

	public String getFax3() {
		return fax3;
	}

	public void setFax3(String fax3) {
		this.fax3 = fax3;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getNamePrefix() {
		return namePrefix;
	}

	public void setNamePrefix(String namePrefix) {
		this.namePrefix = namePrefix;
	}

	public String getNameSuffix() {
		return nameSuffix;
	}

	public void setNameSuffix(String nameSuffix) {
		this.nameSuffix = nameSuffix;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getOccupation() {
		return occupation;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}

	public String getOffice() {
		return office;
	}

	public void setOffice(String office) {
		this.office = office;
	}

	public String getPager() {
		return pager;
	}

	public void setPager(String pager) {
		this.pager = pager;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPhone2() {
		return phone2;
	}

	public void setPhone2(String phone2) {
		this.phone2 = phone2;
	}

	public String getPhone3() {
		return phone3;
	}

	public void setPhone3(String phone3) {
		this.phone3 = phone3;
	}

	public String getPreferredContact() {
		return preferredContact;
	}

	public void setPreferredContact(String preferredContact) {
		this.preferredContact = preferredContact;
	}

	public String getRecruiterUserID() {
		return recruiterUserID;
	}

	public void setRecruiterUserID(String recruiterUserID) {
		this.recruiterUserID = recruiterUserID;
	}

	public String getRecruiterUserID_display() {
		return recruiterUserID_display;
	}

	public void setRecruiterUserID_display(String recruiterUserID_display) {
		this.recruiterUserID_display = recruiterUserID_display;
	}

	public Integer getReferredByUserID() {
		return referredByUserID;
	}

	public void setReferredByUserID(Integer referredByUserID) {
		this.referredByUserID = referredByUserID;
	}

	public String getReferredByUserID_display() {
		return referredByUserID_display;
	}

	public void setReferredByUserID_display(String referredByUserID_display) {
		this.referredByUserID_display = referredByUserID_display;
	}

	public Integer getReportToUserID() {
		return reportToUserID;
	}

	public void setReportToUserID(Integer reportToUserID) {
		this.reportToUserID = reportToUserID;
	}

	public String getSecondaryAddress1() {
		return secondaryAddress1;
	}

	public void setSecondaryAddress1(String secondaryAddress1) {
		this.secondaryAddress1 = secondaryAddress1;
	}

	public String getSecondaryAddress2() {
		return secondaryAddress2;
	}

	public void setSecondaryAddress2(String secondaryAddress2) {
		this.secondaryAddress2 = secondaryAddress2;
	}

	public String getSecondaryCity() {
		return secondaryCity;
	}

	public void setSecondaryCity(String secondaryCity) {
		this.secondaryCity = secondaryCity;
	}

	public Integer getSecondaryCountryID() {
		return secondaryCountryID;
	}

	public void setSecondaryCountryID(Integer secondaryCountryID) {
		this.secondaryCountryID = secondaryCountryID;
	}

	public String getSecondaryState() {
		return secondaryState;
	}

	public void setSecondaryState(String secondaryState) {
		this.secondaryState = secondaryState;
	}

	public String getSecondaryState_display() {
		return secondaryState_display;
	}

	public void setSecondaryState_display(String secondaryState_display) {
		this.secondaryState_display = secondaryState_display;
	}

	public String getSecondaryZip() {
		return secondaryZip;
	}

	public void setSecondaryZip(String secondaryZip) {
		this.secondaryZip = secondaryZip;
	}

	public Boolean getSmsOptIn() {
		return smsOptIn;
	}

	public void setSmsOptIn(Boolean smsOptIn) {
		this.smsOptIn = smsOptIn;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public String getClient_address1() {
		return address1;
	}

	public void setClient_address1(String address1) {
		this.address1 = address1;
	}

	public String getClient_address2() {
		return address2;
	}

	public void setClient_address2(String address2) {
		this.address2 = address2;
	}

	public String getClient_businessSectorID() {
		return businessSectorID;
	}

	public void setClient_businessSectorID(String businessSectorID) {
		this.businessSectorID = businessSectorID;
	}

	public String getClient_candidateRestrictionBits() {
		return candidateRestrictionBits;
	}

	public void setClient_candidateRestrictionBits(String candidateRestrictionBits) {
		this.candidateRestrictionBits = candidateRestrictionBits;
	}

	public String getClient_candidateSourceID() {
		return candidateSourceID;
	}

	public void setClient_candidateSourceID(String candidateSourceID) {
		this.candidateSourceID = candidateSourceID;
	}

	public String getClient_categoryID() {
		return categoryID;
	}

	public void setClient_categoryID(String categoryID) {
		this.categoryID = categoryID;
	}

	public String getClient_categoryID_display() {
		return categoryID_display;
	}

	public void setClient_categoryID_display(String categoryID_display) {
		this.categoryID_display = categoryID_display;
	}

	public String getClient_certifications() {
		return certifications;
	}

	public void setClient_certifications(String certifications) {
		this.certifications = certifications;
	}

	public String getClient_city() {
		return city;
	}

	public void setClient_city(String city) {
		this.city = city;
	}

	public Integer getClient_clientCorporationID() {
		return clientCorporationID;
	}

	public void setClient_clientCorporationID(Integer clientCorporationID) {
		this.clientCorporationID = clientCorporationID;
	}

	public String getClient_clientCorporationID_display() {
		return clientCorporationID_display;
	}

	public void setClient_clientCorporationID_display(String clientCorporationID_display) {
		this.clientCorporationID_display = clientCorporationID_display;
	}

	public String getClient_companyDescription() {
		return companyDescription;
	}

	public void setClient_companyDescription(String companyDescription) {
		this.companyDescription = companyDescription;
	}

	public String getClient_comments() {
		return comments;
	}

	public void setClient_comments(String comments) {
		this.comments = comments;
	}

	public String getClient_companyName() {
		return companyName;
	}

	public void setClient_companyName(String companyName) {
		this.companyName = companyName;
	}

	public String getClient_companyURL() {
		return companyURL;
	}

	public void setClient_companyURL(String companyURL) {
		this.companyURL = companyURL;
	}

	public Integer getClient_countryID() {
		return countryID;
	}

	public void setClient_countryID(Integer countryID) {
		this.countryID = countryID;
	}

	public String getClient_customDate1() {
		return customDate1;
	}

	public void setClient_customDate1(String customDate1) {
		this.customDate1 = customDate1;
	}

	public String getClient_customDate2() {
		return customDate2;
	}

	public void setClient_customDate2(String customDate2) {
		this.customDate2 = customDate2;
	}

	public String getClient_customDate3() {
		return customDate3;
	}

	public void setClient_customDate3(String customDate3) {
		this.customDate3 = customDate3;
	}

	public String getClient_customFloat1() {
		return customFloat1;
	}

	public void setClient_customFloat1(String customFloat1) {
		this.customFloat1 = customFloat1;
	}

	public String getClient_customFloat2() {
		return customFloat2;
	}

	public void setClient_customFloat2(String customFloat2) {
		this.customFloat2 = customFloat2;
	}

	public String getClient_customFloat3() {
		return customFloat3;
	}

	public void setClient_customFloat3(String customFloat3) {
		this.customFloat3 = customFloat3;
	}

	public Integer getClient_customInt1() {
		return customInt1;
	}

	public void setClient_customInt1(Integer customInt1) {
		this.customInt1 = customInt1;
	}

	public Integer getClient_customInt2() {
		return customInt2;
	}

	public void setClient_customInt2(Integer customInt2) {
		this.customInt2 = customInt2;
	}

	public Integer getClient_customInt3() {
		return customInt3;
	}

	public void setClient_customInt3(Integer customInt3) {
		this.customInt3 = customInt3;
	}

	public String getClient_customText1() {
		return customText1;
	}

	public void setClient_customText1(String customText1) {
		this.customText1 = customText1;
	}

	public String getClient_customText10() {
		return customText10;
	}

	public void setClient_customText10(String customText10) {
		this.customText10 = customText10;
	}

	public String getClient_customText11() {
		return customText11;
	}

	public void setClient_customText11(String customText11) {
		this.customText11 = customText11;
	}

	public String getClient_customText12() {
		return customText12;
	}

	public void setClient_customText12(String customText12) {
		this.customText12 = customText12;
	}

	public String getClient_customText13() {
		return customText13;
	}

	public void setClient_customText13(String customText13) {
		this.customText13 = customText13;
	}

	public String getClient_customText14() {
		return customText14;
	}

	public void setClient_customText14(String customText14) {
		this.customText14 = customText14;
	}

	public String getClient_customText15() {
		return customText15;
	}

	public void setClient_customText15(String customText15) {
		this.customText15 = customText15;
	}

	public String getClient_customText16() {
		return customText16;
	}

	public void setClient_customText16(String customText16) {
		this.customText16 = customText16;
	}

	public String getClient_customText17() {
		return customText17;
	}

	public void setClient_customText17(String customText17) {
		this.customText17 = customText17;
	}

	public String getClient_customText18() {
		return customText18;
	}

	public void setClient_customText18(String customText18) {
		this.customText18 = customText18;
	}

	public String getClient_customText19() {
		return customText19;
	}

	public void setClient_customText19(String customText19) {
		this.customText19 = customText19;
	}

	public String getClient_customText2() {
		return customText2;
	}

	public void setClient_customText2(String customText2) {
		this.customText2 = customText2;
	}

	public String getClient_customText20() {
		return customText20;
	}

	public void setClient_customText20(String customText20) {
		this.customText20 = customText20;
	}

	public String getClient_customText3() {
		return customText3;
	}

	public void setClient_customText3(String customText3) {
		this.customText3 = customText3;
	}

	public String getClient_customText4() {
		return customText4;
	}

	public void setClient_customText4(String customText4) {
		this.customText4 = customText4;
	}

	public String getClient_customText5() {
		return customText5;
	}

	public void setClient_customText5(String customText5) {
		this.customText5 = customText5;
	}

	public String getClient_customText6() {
		return customText6;
	}

	public void setClient_customText6(String customText6) {
		this.customText6 = customText6;
	}

	public String getClient_customText7() {
		return customText7;
	}

	public void setClient_customText7(String customText7) {
		this.customText7 = customText7;
	}

	public String getClient_customText8() {
		return customText8;
	}

	public void setClient_customText8(String customText8) {
		this.customText8 = customText8;
	}

	public String getClient_customText9() {
		return customText9;
	}

	public void setClient_customText9(String customText9) {
		this.customText9 = customText9;
	}

	public String getClient_customTextBlock1() {
		return customTextBlock1;
	}

	public void setClient_customTextBlock1(String customTextBlock1) {
		this.customTextBlock1 = customTextBlock1;
	}

	public String getClient_customTextBlock2() {
		return customTextBlock2;
	}

	public void setClient_customTextBlock2(String customTextBlock2) {
		this.customTextBlock2 = customTextBlock2;
	}

	public String getClient_customTextBlock3() {
		return customTextBlock3;
	}

	public void setClient_customTextBlock3(String customTextBlock3) {
		this.customTextBlock3 = customTextBlock3;
	}

	public String getClient_customTextBlock4() {
		return customTextBlock4;
	}

	public void setClient_customTextBlock4(String customTextBlock4) {
		this.customTextBlock4 = customTextBlock4;
	}

	public String getClient_customTextBlock5() {
		return customTextBlock5;
	}

	public void setClient_customTextBlock5(String customTextBlock5) {
		this.customTextBlock5 = customTextBlock5;
	}

	public String getClient_dateLastVisit() {
		return dateLastVisit;
	}

	public void setClient_dateLastVisit(String dateLastVisit) {
		this.dateLastVisit = dateLastVisit;
	}

	public String getClient_desiredCategories() {
		return desiredCategories;
	}

	public void setClient_desiredCategories(String desiredCategories) {
		this.desiredCategories = desiredCategories;
	}

	public String getClient_desiredCategories_display() {
		return desiredCategories_display;
	}

	public void setClient_desiredCategories_display(String desiredCategories_display) {
		this.desiredCategories_display = desiredCategories_display;
	}

	public String getClient_desiredSkills() {
		return desiredSkills;
	}

	public void setClient_desiredSkills(String desiredSkills) {
		this.desiredSkills = desiredSkills;
	}

	public String getClient_desiredSkills_display() {
		return desiredSkills_display;
	}

	public void setClient_desiredSkills_display(String desiredSkills_display) {
		this.desiredSkills_display = desiredSkills_display;
	}

	public String getClient_desiredSpecialties() {
		return desiredSpecialties;
	}

	public void setClient_desiredSpecialties(String desiredSpecialties) {
		this.desiredSpecialties = desiredSpecialties;
	}

	public String getClient_division() {
		return division;
	}

	public void setClient_division(String division) {
		this.division = division;
	}

	public String getClient_description() {
		return description;
	}

	public void setClient_description(String description) {
		this.description = description;
	}

	public String getClient_email() {
		return email;
	}

	public void setClient_email(String email) {
		this.email = email;
	}

	public String getClient_email2() {
		return email2;
	}

	public void setClient_email2(String email2) {
		this.email2 = email2;
	}

	public String getClient_email3() {
		return email3;
	}

	public void setClient_email3(String email3) {
		this.email3 = email3;
	}

	public String getClient_externalID() {
		return externalID;
	}

	public void setClient_externalID(String externalID) {
		this.externalID = externalID;
	}

	public String getClient_fax() {
		return fax;
	}

	public void setClient_fax(String fax) {
		this.fax = fax;
	}

	public String getClient_fax2() {
		return fax2;
	}

	public void setClient_fax2(String fax2) {
		this.fax2 = fax2;
	}

	public String getClient_fax3() {
		return fax3;
	}

	public void setClient_fax3(String fax3) {
		this.fax3 = fax3;
	}

	public String getClient_firstName() {
		return firstName;
	}

	public void setClient_firstName(String firstName) {
		this.firstName = firstName;
	}

	public String getClient_lastName() {
		return lastName;
	}

	public void setClient_lastName(String lastName) {
		this.lastName = lastName;
	}

	public String getClient_middleName() {
		return middleName;
	}

	public void setClient_middleName(String middleName) {
		this.middleName = middleName;
	}

	public String getClient_mobile() {
		return mobile;
	}

	public void setClient_mobile(String mobile) {
		this.mobile = mobile;
	}

	public String getClient_namePrefix() {
		return namePrefix;
	}

	public void setClient_namePrefix(String namePrefix) {
		this.namePrefix = namePrefix;
	}

	public String getClient_nameSuffix() {
		return nameSuffix;
	}

	public void setClient_nameSuffix(String nameSuffix) {
		this.nameSuffix = nameSuffix;
	}

	public String getClient_nickName() {
		return nickName;
	}

	public void setClient_nickName(String nickName) {
		this.nickName = nickName;
	}

	public String getClient_occupation() {
		return occupation;
	}

	public void setClient_occupation(String occupation) {
		this.occupation = occupation;
	}

	public String getClient_office() {
		return office;
	}

	public void setClient_office(String office) {
		this.office = office;
	}

	public String getClient_pager() {
		return pager;
	}

	public void setClient_pager(String pager) {
		this.pager = pager;
	}

	public String getClient_phone() {
		return phone;
	}

	public void setClient_phone(String phone) {
		this.phone = phone;
	}

	public String getClient_phone2() {
		return phone2;
	}

	public void setClient_phone2(String phone2) {
		this.phone2 = phone2;
	}

	public String getClient_phone3() {
		return phone3;
	}

	public void setClient_phone3(String phone3) {
		this.phone3 = phone3;
	}

	public String getClient_preferredContact() {
		return preferredContact;
	}

	public void setClient_preferredContact(String preferredContact) {
		this.preferredContact = preferredContact;
	}

	public String getClient_recruiterUserID() {
		return recruiterUserID;
	}

	public void setClient_recruiterUserID(String recruiterUserID) {
		this.recruiterUserID = recruiterUserID;
	}

	public String getClient_recruiterUserID_display() {
		return recruiterUserID_display;
	}

	public void setClient_recruiterUserID_display(String recruiterUserID_display) {
		this.recruiterUserID_display = recruiterUserID_display;
	}

	public Integer getClient_referredByUserID() {
		return referredByUserID;
	}

	public void setClient_referredByUserID(Integer referredByUserID) {
		this.referredByUserID = referredByUserID;
	}

	public String getClient_referredByUserID_display() {
		return referredByUserID_display;
	}

	public void setClient_referredByUserID_display(String referredByUserID_display) {
		this.referredByUserID_display = referredByUserID_display;
	}

	public Integer getClient_reportToUserID() {
		return reportToUserID;
	}

	public void setClient_reportToUserID(Integer reportToUserID) {
		this.reportToUserID = reportToUserID;
	}

	public String getClient_secondaryAddress1() {
		return secondaryAddress1;
	}

	public void setClient_secondaryAddress1(String secondaryAddress1) {
		this.secondaryAddress1 = secondaryAddress1;
	}

	public String getClient_secondaryAddress2() {
		return secondaryAddress2;
	}

	public void setClient_secondaryAddress2(String secondaryAddress2) {
		this.secondaryAddress2 = secondaryAddress2;
	}

	public String getClient_secondaryCity() {
		return secondaryCity;
	}

	public void setClient_secondaryCity(String secondaryCity) {
		this.secondaryCity = secondaryCity;
	}

	public Integer getClient_secondaryCountryID() {
		return secondaryCountryID;
	}

	public void setClient_secondaryCountryID(Integer secondaryCountryID) {
		this.secondaryCountryID = secondaryCountryID;
	}

	public String getClient_secondaryState() {
		return secondaryState;
	}

	public void setClient_secondaryState(String secondaryState) {
		this.secondaryState = secondaryState;
	}

	public String getClient_secondaryState_display() {
		return secondaryState_display;
	}

	public void setClient_secondaryState_display(String secondaryState_display) {
		this.secondaryState_display = secondaryState_display;
	}

	public String getClient_secondaryZip() {
		return secondaryZip;
	}

	public void setClient_secondaryZip(String secondaryZip) {
		this.secondaryZip = secondaryZip;
	}

	public Boolean getClient_smsOptIn() {
		return smsOptIn;
	}

	public void setClient_smsOptIn(Boolean smsOptIn) {
		this.smsOptIn = smsOptIn;
	}

	public String getClient_source() {
		return source;
	}

	public void setClient_source(String source) {
		this.source = source;
	}

	public String getClient_state() {
		return state;
	}

	public void setClient_state(String state) {
		this.state = state;
	}

	public String getClient_status() {
		return status;
	}

	public void setClient_status(String status) {
		this.status = status;
	}

	public String getClient_type() {
		return type;
	}

	public void setClient_type(String type) {
		this.type = type;
	}

	public Integer getUserID() {
		return userID;
	}

	public void setUserID(Integer userID) {
		this.userID = userID;
	}

	public String getClient_zip() {
		return zip;
	}

	public void setClient_zip(String zip) {
		this.zip = zip;
	}

	@Override
	public ClientContact instantiateEntity() {

		ClientContact clientContact = new ClientContact();

		Address address = new Address();
		address.setAddress1(address1);
		address.setAddress2(address2);
		address.setCity(city);
		address.setCountryID(countryID);
		address.setState(state);
		address.setZip(zip);
		clientContact.setAddress(address);

		clientContact.setCategory(new Category(getFirstIntegerInCommaSeparatedList(categoryID)));
		clientContact.setCertifications(certifications);
		clientContact.setComments(comments);
		clientContact.setClientCorporation(new ClientCorporation(clientCorporationID));
		clientContact.setCustomDate1(stringToDateTime(customDate1));
		clientContact.setCustomDate2(stringToDateTime(customDate2));
		clientContact.setCustomDate3(stringToDateTime(customDate3));
		clientContact.setCustomFloat1(toBigDecimal(customFloat1,"customFloat1"));
		clientContact.setCustomFloat2(toBigDecimal(customFloat2,"customFloat2"));
		clientContact.setCustomFloat3(toBigDecimal(customFloat3,"customFloat3"));
		clientContact.setCustomInt1(customInt1);
		clientContact.setCustomInt2(customInt2);
		clientContact.setCustomInt3(customInt3);
		clientContact.setCustomText1(customText1);
		clientContact.setCustomText2(customText2);
		clientContact.setCustomText3(customText3);
		clientContact.setCustomText4(customText4);
		clientContact.setCustomText5(customText5);
		clientContact.setCustomText6(customText6);
		clientContact.setCustomText7(customText7);
		clientContact.setCustomText8(customText8);
		clientContact.setCustomText9(customText9);
		clientContact.setCustomText10(customText10);
		clientContact.setCustomText11(customText11);
		clientContact.setCustomText12(customText12);
		clientContact.setCustomText13(customText13);
		clientContact.setCustomText14(customText14);
		clientContact.setCustomText15(customText15);
		clientContact.setCustomText16(customText16);
		clientContact.setCustomText17(customText17);
		clientContact.setCustomText18(customText18);
		clientContact.setCustomText19(customText19);
		clientContact.setCustomText20(customText20);
		clientContact.setCustomTextBlock1(customTextBlock1);
		clientContact.setCustomTextBlock2(customTextBlock2);
		clientContact.setCustomTextBlock3(customTextBlock3);
		clientContact.setCustomTextBlock4(customTextBlock4);
		clientContact.setCustomTextBlock5(customTextBlock5);
		clientContact.setDateLastVisit(stringToDateTime(dateLastVisit));
		clientContact.setDescription(description);
		clientContact.setDesiredCategories(desiredCategories);
		clientContact.setDesiredSkills(desiredSkills);
		clientContact.setDesiredSpecialties(desiredSpecialties);
		clientContact.setDivision(division);
		clientContact.setEmail(email);
		clientContact.setEmail2(email2);
		clientContact.setEmail3(email3);
		clientContact.setExternalID(externalID);
		clientContact.setFax(fax);
		clientContact.setFax2(fax2);
		clientContact.setFax3(fax3);
		clientContact.setFirstName(firstName);
		clientContact.setLastName(lastName);
		clientContact.setMiddleName(middleName);
		clientContact.setMobile(mobile);
		clientContact.setNamePrefix(namePrefix);
		clientContact.setNameSuffix(nameSuffix);
		clientContact.setNickName(nickName);
		clientContact.setOccupation(occupation);
		clientContact.setOffice(office);
		clientContact.setPager(pager);
		clientContact.setPhone(phone);
		clientContact.setPhone2(phone2);
		clientContact.setPhone3(phone3);
		clientContact.setPreferredContact(preferredContact);
		if (Util.isNumeric(recruiterUserID))
			clientContact.setOwner(new CorporateUser(Integer.parseInt(recruiterUserID)));
		else {
			String[] ownerIDs = recruiterUserID.split(",");
			clientContact.setOwner(new CorporateUser(ownerIDs.length > 0 && Util.isNumbersOnly(ownerIDs[0]) ? Integer.parseInt(ownerIDs[0]) : 0));
		}

		clientContact.setReferredByPerson(new Person(referredByUserID));
		clientContact.setReportToPerson(new Person(reportToUserID));

		Address secondaryAddress = new Address();
		secondaryAddress.setAddress1(secondaryAddress1);
		secondaryAddress.setAddress2(secondaryAddress2);
		secondaryAddress.setCity(secondaryCity);
		secondaryAddress.setCountryID(secondaryCountryID);
		secondaryAddress.setState(secondaryState);
		secondaryAddress.setZip(secondaryZip);
		clientContact.setSecondaryAddress(secondaryAddress);

		clientContact.setSmsOptIn(smsOptIn);
		clientContact.setSource(source);
		clientContact.setStatus(status);
		clientContact.setType(type);
		clientContact.setId(userID);

		return clientContact;
	}

    public static FormClientContactDto instantiateFromClientContact(ClientContact clientContact){

        FormClientContactDto formClientContactDto = new FormClientContactDto();

        Address address = clientContact.getAddress();

        if(address != null) {
            formClientContactDto.setAddress1(address.getAddress1());
            formClientContactDto.setAddress2(address.getAddress2());
            formClientContactDto.setCity(address.getCity());
            formClientContactDto.setCountryID(address.getCountryID());
            formClientContactDto.setState(address.getState());
            formClientContactDto.setZip(address.getZip());
        }

        formClientContactDto.setCategoryID(clientContact.getCategory() != null ? makeString(clientContact.getCategory().getId()) : null);
        formClientContactDto.setCertifications(clientContact.getCertifications());
        formClientContactDto.setComments(clientContact.getComments());
        formClientContactDto.setClientCorporationID(clientContact.getClientCorporation() != null ? clientContact.getClientCorporation().getId() : null);
        formClientContactDto.setCustomDate1(makeString(clientContact.getCustomDate1()));
        formClientContactDto.setCustomDate2(makeString(clientContact.getCustomDate2()));
        formClientContactDto.setCustomDate3(makeString(clientContact.getCustomDate3()));
        formClientContactDto.setCustomFloat1(makeString(clientContact.getCustomFloat1()));
        formClientContactDto.setCustomFloat2(makeString(clientContact.getCustomFloat2()));
        formClientContactDto.setCustomFloat3(makeString(clientContact.getCustomFloat3()));
        formClientContactDto.setCustomInt1(clientContact.getCustomInt1());
        formClientContactDto.setCustomInt2(clientContact.getCustomInt2());
        formClientContactDto.setCustomInt3(clientContact.getCustomInt3());
        formClientContactDto.setCustomText1(clientContact.getCustomText1());
        formClientContactDto.setCustomText10(clientContact.getCustomText10());
        formClientContactDto.setCustomText11(clientContact.getCustomText11());
        formClientContactDto.setCustomText12(clientContact.getCustomText12());
        formClientContactDto.setCustomText13(clientContact.getCustomText13());
        formClientContactDto.setCustomText14(clientContact.getCustomText14());
        formClientContactDto.setCustomText15(clientContact.getCustomText15());
        formClientContactDto.setCustomText16(clientContact.getCustomText16());
        formClientContactDto.setCustomText17(clientContact.getCustomText17());
        formClientContactDto.setCustomText18(clientContact.getCustomText18());
        formClientContactDto.setCustomText19(clientContact.getCustomText19());
        formClientContactDto.setCustomText2(clientContact.getCustomText2());
        formClientContactDto.setCustomText20(clientContact.getCustomText20());
        formClientContactDto.setCustomText3(clientContact.getCustomText3());
        formClientContactDto.setCustomText4(clientContact.getCustomText4());
        formClientContactDto.setCustomText5(clientContact.getCustomText5());
        formClientContactDto.setCustomText6(clientContact.getCustomText6());
        formClientContactDto.setCustomText7(clientContact.getCustomText7());
        formClientContactDto.setCustomText8(clientContact.getCustomText8());
        formClientContactDto.setCustomText9(clientContact.getCustomText9());
        formClientContactDto.setCustomTextBlock1(clientContact.getCustomTextBlock1());
        formClientContactDto.setCustomTextBlock2(clientContact.getCustomTextBlock2());
        formClientContactDto.setCustomTextBlock3(clientContact.getCustomTextBlock3());
        formClientContactDto.setCustomTextBlock4(clientContact.getCustomTextBlock4());
        formClientContactDto.setCustomTextBlock5(clientContact.getCustomTextBlock5());
        formClientContactDto.setDateLastVisit(makeString(clientContact.getDateLastVisit()));
        formClientContactDto.setDescription(clientContact.getDescription());
        formClientContactDto.setDesiredCategories(clientContact.getDesiredCategories());
        formClientContactDto.setDesiredSkills(clientContact.getDesiredSkills());
        formClientContactDto.setDesiredSpecialties(clientContact.getDesiredSpecialties());
        formClientContactDto.setDivision(clientContact.getDivision());
        formClientContactDto.setEmail(clientContact.getEmail());
        formClientContactDto.setEmail2(clientContact.getEmail2());
        formClientContactDto.setEmail3(clientContact.getEmail3());
        formClientContactDto.setExternalID(clientContact.getExternalID());
        formClientContactDto.setFax(clientContact.getFax());
        formClientContactDto.setFax2(clientContact.getFax2());
        formClientContactDto.setFax3(clientContact.getFax3());
        formClientContactDto.setFirstName(clientContact.getFirstName());
        formClientContactDto.setLastName(clientContact.getLastName());
        formClientContactDto.setMiddleName(clientContact.getMiddleName());
        formClientContactDto.setMobile(clientContact.getMobile());
        formClientContactDto.setNamePrefix(clientContact.getNamePrefix());
        formClientContactDto.setNameSuffix(clientContact.getNameSuffix());
        formClientContactDto.setNickName(clientContact.getNickName());
        formClientContactDto.setOccupation(clientContact.getOccupation());
        formClientContactDto.setOffice(clientContact.getOffice());
        formClientContactDto.setPager(clientContact.getPager());
        formClientContactDto.setPhone(clientContact.getPhone());
        formClientContactDto.setPhone2(clientContact.getPhone2());
        formClientContactDto.setPhone3(clientContact.getPhone3());
        formClientContactDto.setPreferredContact(clientContact.getPreferredContact());
        formClientContactDto.setRecruiterUserID(clientContact.getOwner() != null ? makeString(clientContact.getOwner().getId()) : null);
        formClientContactDto.setReferredByUserID(clientContact.getReferredByPerson() != null ? clientContact.getReferredByPerson().getId() : null);
        formClientContactDto.setReportToUserID(clientContact.getReportToPerson() != null ? clientContact.getReportToPerson().getId() : null);

        address = clientContact.getSecondaryAddress();

        if(address != null){
            formClientContactDto.setSecondaryAddress1(address.getAddress1());
            formClientContactDto.setSecondaryAddress2(address.getAddress2());
            formClientContactDto.setSecondaryCity(address.getCity());
            formClientContactDto.setSecondaryCountryID(address.getCountryID());
            formClientContactDto.setSecondaryState(address.getState());
            formClientContactDto.setSecondaryZip(address.getZip());
        }

        formClientContactDto.setSmsOptIn(clientContact.getSmsOptIn());
        formClientContactDto.setSource(clientContact.getSource());
        formClientContactDto.setStatus(clientContact.getStatus());
        formClientContactDto.setType(clientContact.getType());
        formClientContactDto.setUserID(clientContact.getId());

        return formClientContactDto;
    }
	
	
	/**
	 * Converts the form values to a SOAP dto.
	 * 
	 * @deprecated use {@link #instantiateEntity()} instead for BullhornEntity
	 * @return a SOAP dto
	 */
	@Deprecated
	public ClientContactDto instantiateBullhornDto() {

		ClientContactDto clientContactDto = new ClientContactDto();

		com.bullhorn.entity.emb.Address address = new com.bullhorn.entity.emb.Address();
		address.setAddress1(address1);
		address.setAddress2(address2);
		address.setCity(city);
		address.setCountryID(countryID);
		address.setState(state);
		address.setZip(zip);
		clientContactDto.setAddress(address);

		clientContactDto.setCategoryID(getFirstIntegerInCommaSeparatedList(categoryID));
		clientContactDto.setCertifications(certifications);
		clientContactDto.setComments(comments);
		clientContactDto.setClientCorporationID(clientCorporationID);
		clientContactDto.setCustomDate1(stringToXMLGregorianCalendar(customDate1));
		clientContactDto.setCustomDate2(stringToXMLGregorianCalendar(customDate2));
		clientContactDto.setCustomDate3(stringToXMLGregorianCalendar(customDate3));
		clientContactDto.setCustomFloat1(toDouble(customFloat1,"customFloat1"));
		clientContactDto.setCustomFloat2(toDouble(customFloat2,"customFloat2"));
		clientContactDto.setCustomFloat3(toDouble(customFloat3,"customFloat3"));
		clientContactDto.setCustomInt1(customInt1);
		clientContactDto.setCustomInt2(customInt2);
		clientContactDto.setCustomInt3(customInt3);
		clientContactDto.setCustomText1(customText1);
		clientContactDto.setCustomText2(customText2);
		clientContactDto.setCustomText3(customText3);
		clientContactDto.setCustomText4(customText4);
		clientContactDto.setCustomText5(customText5);
		clientContactDto.setCustomText6(customText6);
		clientContactDto.setCustomText7(customText7);
		clientContactDto.setCustomText8(customText8);
		clientContactDto.setCustomText9(customText9);
		clientContactDto.setCustomText10(customText10);
		clientContactDto.setCustomText11(customText11);
		clientContactDto.setCustomText12(customText12);
		clientContactDto.setCustomText13(customText13);
		clientContactDto.setCustomText14(customText14);
		clientContactDto.setCustomText15(customText15);
		clientContactDto.setCustomText16(customText16);
		clientContactDto.setCustomText17(customText17);
		clientContactDto.setCustomText18(customText18);
		clientContactDto.setCustomText19(customText19);
		clientContactDto.setCustomText20(customText20);
		clientContactDto.setCustomTextBlock1(customTextBlock1);
		clientContactDto.setCustomTextBlock2(customTextBlock2);
		clientContactDto.setCustomTextBlock3(customTextBlock3);
		clientContactDto.setCustomTextBlock4(customTextBlock4);
		clientContactDto.setCustomTextBlock5(customTextBlock5);
		clientContactDto.setDateLastVisit(stringToXMLGregorianCalendar(dateLastVisit));
		clientContactDto.setDescription(description);
		clientContactDto.setDesiredCategories(desiredCategories);
		clientContactDto.setDesiredSkills(desiredSkills);
		clientContactDto.setDesiredSpecialties(desiredSpecialties);
		clientContactDto.setDivision(division);
		clientContactDto.setEmail(email);
		clientContactDto.setEmail2(email2);
		clientContactDto.setEmail3(email3);
		clientContactDto.setExternalID(externalID);
		clientContactDto.setFax(fax);
		clientContactDto.setFax2(fax2);
		clientContactDto.setFax3(fax3);
		clientContactDto.setFirstName(firstName);
		clientContactDto.setLastName(lastName);
		clientContactDto.setMiddleName(middleName);
		clientContactDto.setMobile(mobile);
		clientContactDto.setNamePrefix(namePrefix);
		clientContactDto.setNameSuffix(nameSuffix);
		clientContactDto.setNickName(nickName);
		clientContactDto.setOccupation(occupation);
		clientContactDto.setOffice(office);
		clientContactDto.setPager(pager);
		clientContactDto.setPhone(phone);
		clientContactDto.setPhone2(phone2);
		clientContactDto.setPhone3(phone3);
		clientContactDto.setPreferredContact(preferredContact);
		if (Util.isNumeric(recruiterUserID))
			clientContactDto.setOwnerID(Integer.parseInt(recruiterUserID));
		else {
			String[] ownerIDs = recruiterUserID.split(",");
			clientContactDto.setOwnerID(ownerIDs.length > 0 && Util.isNumbersOnly(ownerIDs[0]) ? Integer.parseInt(ownerIDs[0]) : 0);
		}
		
		clientContactDto.setReferredByPersonID(referredByUserID);
		clientContactDto.setReportToPersonID(reportToUserID);

		com.bullhorn.entity.emb.Address secondaryAddress = new com.bullhorn.entity.emb.Address();
		secondaryAddress.setAddress1(secondaryAddress1);
		secondaryAddress.setAddress2(secondaryAddress2);
		secondaryAddress.setCity(secondaryCity);
		secondaryAddress.setCountryID(secondaryCountryID);
		secondaryAddress.setState(secondaryState);
		secondaryAddress.setZip(secondaryZip);
		clientContactDto.setSecondaryAddress(secondaryAddress);

		clientContactDto.setSmsOptIn(smsOptIn);
		clientContactDto.setSource(source);
		clientContactDto.setStatus(status);
		clientContactDto.setType(type);
		clientContactDto.setUserID(userID);

		return clientContactDto;
	}

}
