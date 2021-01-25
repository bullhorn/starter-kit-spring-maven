package com.client.core.formtrigger.model.form.impl;

import com.bullhorn.entity.candidate.CandidateDto;
import com.bullhornsdk.data.model.entity.core.standard.Candidate;
import com.bullhornsdk.data.model.entity.core.standard.Category;
import com.bullhornsdk.data.model.entity.core.standard.CorporateUser;
import com.bullhornsdk.data.model.entity.core.standard.Person;
import com.bullhornsdk.data.model.entity.embedded.Address;
import com.client.core.base.util.Utility;
import com.client.core.formtrigger.model.form.AbstractFormDto;
import com.google.common.base.Strings;
import org.apache.log4j.Logger;

public class FormCandidateDto extends AbstractFormDto<Candidate> {

	public FormCandidateDto() {
		super(Logger.getLogger(FormCandidateDto.class));
	}

	private String address1;
	private String address2;
	private String blacklistID;
	private String businessSectorID;
	private String businessSectorID_display;
	private String candidateSourceID;
	private String categoryID;
	private String categoryID_display;
	private String certifications;
	private String city;
	private String clientRestrictionBits;
	private String comments;
	private String companyName;
	private String companyURL;
	private String countryID;
	private String customDate1;
	private String customDate2;
	private String customDate3;
	private String customEncryptedText1;
	private String customEncryptedText2;
	private String customEncryptedText3;
	private String customEncryptedText4;
	private String customEncryptedText5;
	private String customEncryptedText6;
	private String customEncryptedText7;
	private String customEncryptedText8;
	private String customEncryptedText9;
	private String customEncryptedText10;
	private String customFloat1;
	private String customFloat2;
	private String customFloat3;
	private String customInt1;
	private String customInt2;
	private String customInt3;
	private String customText1;
	private String customText10;
	private String customText10_display;
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
	private String customText8_display;
	private String customText9;
	private String customTextBlock1;
	private String customTextBlock2;
	private String customTextBlock3;
	private String customTextBlock4;
	private String customTextBlock5;
	private String dateAdded;
	private String dateI9Expiration;
	private String dateAvailable;
	private String dateAvailableEnd;
	private String dateLastComment;
	private String dateOfBirth;
	private String dateNextCall;
	private String dayRate;
	private String dayRateLow;
	private String degreeList;
	private String description;
	private String desiredLocations;
	private String disability;
	private String distributionListID;
	private String distributionListID_display;
	private String educationDegree;
	private String email;
	private String email2;
	private String email3;
	private String employeeType;
	private String employmentPreference;
	private String ethnicity;
	private String experience;
	private String externalID;
	private String fax;
	private String fax2;
	private String fax3;
	private String federalAddtionalWitholdingsAmount;
	private String federalExemptions;
	private String federalFilingStatus;
	private String firstName;
	private String gender;
	private String hourlyRate;
	private String hourlyRateLow;
	private String housingAmenityID;
	private String i9OnFile;
	private String isEditable;
	private String jobRestrictionBits;
	private String lastName;
	private String linkedPersonID;
	private String localAddtionalWitholdingsAmount;
	private String localExemptions;
	private String localFilingStatus;
	private String localTaxCode;

	private String massMailOptOut;
	private String middleName;
	private String mobile;
	private String namePrefix;
	private String nameSuffix;
	private String nickName;
	private String occupation;
	private String pager;
	private String phone;
	private String phone2;
	private String phone3;
	private String preferredContact;
	private String preferredHousing;
	private String recentClientList;
	private String recruiterUserID;
	private String recruiterUserID_display;
	private String referredBy;
	private String referredByUserID;
	private String referredByUserID_display;
	private String salary;
	private String salaryLow;
	private String secondaryAddress1;
	private String secondaryAddress2;
	private String secondaryCity;
	private String secondaryCountryID;
	private String secondarySkillID;
	private String secondaryState;
	private String secondaryState_display;
	private String secondaryZip;
	private String sendWelcomeEmail;
	private String skillID;
	private String skillID_display;
	private String skillSet;
	private String smsOptIn;
	private String source;
	private String specialtyCategoryID;
	private String specialtyCategoryID_display;
	private String ssn;
	private String stateAddtionalWitholdingsAmount;
	private String stateExemptions;
	private String stateFilingStatus;
	private String state;
	private String state_display;
	private String status;
	private String taxID;
	private String taxState;
	private String travelLimit;
	private String type;
	private String userID;
	private String veteran;
	private String whitelistID;
	private String willRelocate;
	private String workAuthorized;
	private String workPhone;
	private String zip;

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

	public String getBlacklistID() {
		return blacklistID;
	}

	public void setBlacklistID(String blacklistID) {
		this.blacklistID = blacklistID;
	}

	public String getBusinessSectorID() {
		return businessSectorID;
	}

	public void setBusinessSectorID(String businessSectorID) {
		this.businessSectorID = businessSectorID;
	}

	public String getBusinessSectorID_display() {
		return businessSectorID_display;
	}

	public void setBusinessSectorID_display(String businessSectorID_display) {
		this.businessSectorID_display = businessSectorID_display;
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

	public String getClientRestrictionBits() {
		return clientRestrictionBits;
	}

	public void setClientRestrictionBits(String clientRestrictionBits) {
		this.clientRestrictionBits = clientRestrictionBits;
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

	public String getCountryID() {
		return countryID;
	}

	public void setCountryID(String countryID) {
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

	public String getCustomEncryptedText1() {
		return customEncryptedText1;
	}

	public void setCustomEncryptedText1(String customEncryptedText1) {
		this.customEncryptedText1 = customEncryptedText1;
	}

	public String getCustomEncryptedText2() {
		return customEncryptedText2;
	}

	public void setCustomEncryptedText2(String customEncryptedText2) {
		this.customEncryptedText2 = customEncryptedText2;
	}

	public String getCustomEncryptedText3() {
		return customEncryptedText3;
	}

	public void setCustomEncryptedText3(String customEncryptedText3) {
		this.customEncryptedText3 = customEncryptedText3;
	}

	public String getCustomEncryptedText4() {
		return customEncryptedText4;
	}

	public void setCustomEncryptedText4(String customEncryptedText4) {
		this.customEncryptedText4 = customEncryptedText4;
	}

	public String getCustomEncryptedText5() {
		return customEncryptedText5;
	}

	public void setCustomEncryptedText5(String customEncryptedText5) {
		this.customEncryptedText5 = customEncryptedText5;
	}

	public String getCustomEncryptedText6() {
		return customEncryptedText6;
	}

	public void setCustomEncryptedText6(String customEncryptedText6) {
		this.customEncryptedText6 = customEncryptedText6;
	}

	public String getCustomEncryptedText7() {
		return customEncryptedText7;
	}

	public void setCustomEncryptedText7(String customEncryptedText7) {
		this.customEncryptedText7 = customEncryptedText7;
	}

	public String getCustomEncryptedText8() {
		return customEncryptedText8;
	}

	public void setCustomEncryptedText8(String customEncryptedText8) {
		this.customEncryptedText8 = customEncryptedText8;
	}

	public String getCustomEncryptedText9() {
		return customEncryptedText9;
	}

	public void setCustomEncryptedText9(String customEncryptedText9) {
		this.customEncryptedText9 = customEncryptedText9;
	}

	public String getCustomEncryptedText10() {
		return customEncryptedText10;
	}

	public void setCustomEncryptedText10(String customEncryptedText10) {
		this.customEncryptedText10 = customEncryptedText10;
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

	public String getCustomInt1() {
		return customInt1;
	}

	public void setCustomInt1(String customInt1) {
		this.customInt1 = customInt1;
	}

	public String getCustomInt2() {
		return customInt2;
	}

	public void setCustomInt2(String customInt2) {
		this.customInt2 = customInt2;
	}

	public String getCustomInt3() {
		return customInt3;
	}

	public void setCustomInt3(String customInt3) {
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

	public String getCustomText10_display() {
		return customText10_display;
	}

	public void setCustomText10_display(String customText10_display) {
		this.customText10_display = customText10_display;
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

	public String getCustomText8_display() {
		return customText8_display;
	}

	public void setCustomText8_display(String customText8_display) {
		this.customText8_display = customText8_display;
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

	public String getDateAdded() {
		return dateAdded;
	}

	public void setDateAdded(String dateAdded) {
		this.dateAdded = dateAdded;
	}

	public String getDateI9Expiration() {
		return dateI9Expiration;
	}

	public void setDateI9Expiration(String dateI9Expiration) {
		this.dateI9Expiration = dateI9Expiration;
	}

	public String getDateAvailable() {
		return dateAvailable;
	}

	public void setDateAvailable(String dateAvailable) {
		this.dateAvailable = dateAvailable;
	}

	public String getDateAvailableEnd() {
		return dateAvailableEnd;
	}

	public void setDateAvailableEnd(String dateAvailableEnd) {
		this.dateAvailableEnd = dateAvailableEnd;
	}

	public String getDateLastComment() {
		return dateLastComment;
	}

	public void setDateLastComment(String dateLastComment) {
		this.dateLastComment = dateLastComment;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getDateNextCall() {
		return dateNextCall;
	}

	public void setDateNextCall(String dateNextCall) {
		this.dateNextCall = dateNextCall;
	}

	public String getDayRate() {
		return dayRate;
	}

	public void setDayRate(String dayRate) {
		this.dayRate = dayRate;
	}

	public String getDayRateLow() {
		return dayRateLow;
	}

	public void setDayRateLow(String dayRateLow) {
		this.dayRateLow = dayRateLow;
	}

	public String getDegreeList() {
		return degreeList;
	}

	public void setDegreeList(String degreeList) {
		this.degreeList = degreeList;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDesiredLocations() {
		return desiredLocations;
	}

	public void setDesiredLocations(String desiredLocations) {
		this.desiredLocations = desiredLocations;
	}

	public String getDisability() {
		return disability;
	}

	public void setDisability(String disability) {
		this.disability = disability;
	}

	public String getDistributionListID() {
		return distributionListID;
	}

	public void setDistributionListID(String distributionListID) {
		this.distributionListID = distributionListID;
	}

	public String getDistributionListID_display() {
		return distributionListID_display;
	}

	public void setDistributionListID_display(String distributionListID_display) {
		this.distributionListID_display = distributionListID_display;
	}

	public String getEducationDegree() {
		return educationDegree;
	}

	public void setEducationDegree(String educationDegree) {
		this.educationDegree = educationDegree;
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

	public String getEmployeeType() {
		return employeeType;
	}

	public void setEmployeeType(String employeeType) {
		this.employeeType = employeeType;
	}

	public String getEmploymentPreference() {
		return employmentPreference;
	}

	public void setEmploymentPreference(String employmentPreference) {
		this.employmentPreference = employmentPreference;
	}

	public String getEthnicity() {
		return ethnicity;
	}

	public void setEthnicity(String ethnicity) {
		this.ethnicity = ethnicity;
	}

	public String getExperience() {
		return experience;
	}

	public void setExperience(String experience) {
		this.experience = experience;
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

	public String getFederalAddtionalWitholdingsAmount() {
		return federalAddtionalWitholdingsAmount;
	}

	public void setFederalAddtionalWitholdingsAmount(String federalAddtionalWitholdingsAmount) {
		this.federalAddtionalWitholdingsAmount = federalAddtionalWitholdingsAmount;
	}

	public String getFederalExemptions() {
		return federalExemptions;
	}

	public void setFederalExemptions(String federalExemptions) {
		this.federalExemptions = federalExemptions;
	}

	public String getFederalFilingStatus() {
		return federalFilingStatus;
	}

	public void setFederalFilingStatus(String federalFilingStatus) {
		this.federalFilingStatus = federalFilingStatus;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getHourlyRate() {
		return hourlyRate;
	}

	public void setHourlyRate(String hourlyRate) {
		this.hourlyRate = hourlyRate;
	}

	public String getHourlyRateLow() {
		return hourlyRateLow;
	}

	public void setHourlyRateLow(String hourlyRateLow) {
		this.hourlyRateLow = hourlyRateLow;
	}

	public String getHousingAmenityID() {
		return housingAmenityID;
	}

	public void setHousingAmenityID(String housingAmenityID) {
		this.housingAmenityID = housingAmenityID;
	}

	public String getI9OnFile() {
		return i9OnFile;
	}

	public void setI9OnFile(String i9OnFile) {
		this.i9OnFile = i9OnFile;
	}

	public String getIsEditable() {
		return isEditable;
	}

	public void setIsEditable(String isEditable) {
		this.isEditable = isEditable;
	}

	public String getJobRestrictionBits() {
		return jobRestrictionBits;
	}

	public void setJobRestrictionBits(String jobRestrictionBits) {
		this.jobRestrictionBits = jobRestrictionBits;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getLinkedPersonID() {
		return linkedPersonID;
	}

	public void setLinkedPersonID(String linkedPersonID) {
		this.linkedPersonID = linkedPersonID;
	}

	public String getLocalAddtionalWitholdingsAmount() {
		return localAddtionalWitholdingsAmount;
	}

	public void setLocalAddtionalWitholdingsAmount(String localAddtionalWitholdingsAmount) {
		this.localAddtionalWitholdingsAmount = localAddtionalWitholdingsAmount;
	}

	public String getLocalExemptions() {
		return localExemptions;
	}

	public void setLocalExemptions(String localExemptions) {
		this.localExemptions = localExemptions;
	}

	public String getLocalFilingStatus() {
		return localFilingStatus;
	}

	public void setLocalFilingStatus(String localFilingStatus) {
		this.localFilingStatus = localFilingStatus;
	}

	public String getLocalTaxCode() {
		return localTaxCode;
	}

	public void setLocalTaxCode(String localTaxCode) {
		this.localTaxCode = localTaxCode;
	}

	public String getMassMailOptOut() {
		return massMailOptOut;
	}

	public void setMassMailOptOut(String massMailOptOut) {
		this.massMailOptOut = massMailOptOut;
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

	public String getPreferredHousing() {
		return preferredHousing;
	}

	public void setPreferredHousing(String preferredHousing) {
		this.preferredHousing = preferredHousing;
	}

	public String getRecentClientList() {
		return recentClientList;
	}

	public void setRecentClientList(String recentClientList) {
		this.recentClientList = recentClientList;
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

	public String getReferredBy() {
		return referredBy;
	}

	public void setReferredBy(String referredBy) {
		this.referredBy = referredBy;
	}

	public String getReferredByUserID() {
		return referredByUserID;
	}

	public void setReferredByUserID(String referredByUserID) {
		this.referredByUserID = referredByUserID;
	}

	public String getReferredByUserID_display() {
		return referredByUserID_display;
	}

	public void setReferredByUserID_display(String referredByUserID_display) {
		this.referredByUserID_display = referredByUserID_display;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

	public String getSalaryLow() {
		return salaryLow;
	}

	public void setSalaryLow(String salaryLow) {
		this.salaryLow = salaryLow;
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

	public String getSecondaryCountryID() {
		return secondaryCountryID;
	}

	public void setSecondaryCountryID(String secondaryCountryID) {
		this.secondaryCountryID = secondaryCountryID;
	}

	public String getSecondarySkillID() {
		return secondarySkillID;
	}

	public void setSecondarySkillID(String secondarySkillID) {
		this.secondarySkillID = secondarySkillID;
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

	public String getSendWelcomeEmail() {
		return sendWelcomeEmail;
	}

	public void setSendWelcomeEmail(String sendWelcomeEmail) {
		this.sendWelcomeEmail = sendWelcomeEmail;
	}

	public String getSkillID() {
		return skillID;
	}

	public void setSkillID(String skillID) {
		this.skillID = skillID;
	}

	public String getSkillID_display() {
		return skillID_display;
	}

	public void setSkillID_display(String skillID_display) {
		this.skillID_display = skillID_display;
	}

	public String getSkillSet() {
		return skillSet;
	}

	public void setSkillSet(String skillSet) {
		this.skillSet = skillSet;
	}

	public String getSmsOptIn() {
		return smsOptIn;
	}

	public void setSmsOptIn(String smsOptIn) {
		this.smsOptIn = smsOptIn;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getSpecialtyCategoryID() {
		return specialtyCategoryID;
	}

	public void setSpecialtyCategoryID(String specialtyCategoryID) {
		this.specialtyCategoryID = specialtyCategoryID;
	}

	public String getSpecialtyCategoryID_display() {
		return specialtyCategoryID_display;
	}

	public void setSpecialtyCategoryID_display(String specialtyCategoryID_display) {
		this.specialtyCategoryID_display = specialtyCategoryID_display;
	}

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	public String getStateAddtionalWitholdingsAmount() {
		return stateAddtionalWitholdingsAmount;
	}

	public void setStateAddtionalWitholdingsAmount(String stateAddtionalWitholdingsAmount) {
		this.stateAddtionalWitholdingsAmount = stateAddtionalWitholdingsAmount;
	}

	public String getStateExemptions() {
		return stateExemptions;
	}

	public void setStateExemptions(String stateExemptions) {
		this.stateExemptions = stateExemptions;
	}

	public String getStateFilingStatus() {
		return stateFilingStatus;
	}

	public void setStateFilingStatus(String stateFilingStatus) {
		this.stateFilingStatus = stateFilingStatus;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getState_display() {
		return state_display;
	}

	public void setState_display(String state_display) {
		this.state_display = state_display;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getTaxID() {
		return taxID;
	}

	public void setTaxID(String taxID) {
		this.taxID = taxID;
	}

	public String getTaxState() {
		return taxState;
	}

	public void setTaxState(String taxState) {
		this.taxState = taxState;
	}

	public String getTravelLimit() {
		return travelLimit;
	}

	public void setTravelLimit(String travelLimit) {
		this.travelLimit = travelLimit;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getUserID() {
		return userID;
	}

	public void setUserID(String userID) {
		this.userID = userID;
	}

	public String getVeteran() {
		return veteran;
	}

	public void setVeteran(String veteran) {
		this.veteran = veteran;
	}

	public String getWhitelistID() {
		return whitelistID;
	}

	public void setWhitelistID(String whitelistID) {
		this.whitelistID = whitelistID;
	}

	public String getWillRelocate() {
		return willRelocate;
	}

	public void setWillRelocate(String willRelocate) {
		this.willRelocate = willRelocate;
	}

	public String getWorkAuthorized() {
		return workAuthorized;
	}

	public void setWorkAuthorized(String workAuthorized) {
		this.workAuthorized = workAuthorized;
	}

	public String getWorkPhone() {
		return workPhone;
	}

	public void setWorkPhone(String workPhone) {
		this.workPhone = workPhone;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public String getCandidate_address1() {
		return address1;
	}

	public void setCandidate_address1(String address1) {
		this.address1 = address1;
	}

	public String getCandidate_address2() {
		return address2;
	}

	public void setCandidate_address2(String address2) {
		this.address2 = address2;
	}

	public String getCandidate_blacklistID() {
		return blacklistID;
	}

	public void setCandidate_blacklistID(String blacklistID) {
		this.blacklistID = blacklistID;
	}

	public String getCandidate_businessSectorID() {
		return businessSectorID;
	}

	public void setCandidate_businessSectorID(String businessSectorID) {
		this.businessSectorID = businessSectorID;
	}

	public String getCandidate_businessSectorID_display() {
		return businessSectorID_display;
	}

	public void setCandidate_businessSectorID_display(String businessSectorID_display) {
		this.businessSectorID_display = businessSectorID_display;
	}

	public String getCandidate_candidateSourceID() {
		return candidateSourceID;
	}

	public void setCandidate_candidateSourceID(String candidateSourceID) {
		this.candidateSourceID = candidateSourceID;
	}

	public String getCandidate_categoryID() {
		return categoryID;
	}

	public void setCandidate_categoryID(String categoryID) {
		this.categoryID = categoryID;
	}

	public String getCandidate_categoryID_display() {
		return categoryID_display;
	}

	public void setCandidate_categoryID_display(String categoryID_display) {
		this.categoryID_display = categoryID_display;
	}

	public String getCandidate_certifications() {
		return certifications;
	}

	public void setCandidate_certifications(String certifications) {
		this.certifications = certifications;
	}

	public String getCandidate_city() {
		return city;
	}

	public void setCandidate_city(String city) {
		this.city = city;
	}

	public String getCandidate_clientRestrictionBits() {
		return clientRestrictionBits;
	}

	public void setCandidate_clientRestrictionBits(String clientRestrictionBits) {
		this.clientRestrictionBits = clientRestrictionBits;
	}

	public String getCandidate_comments() {
		return comments;
	}

	public void setCandidate_comments(String comments) {
		this.comments = comments;
	}

	public String getCandidate_companyName() {
		return companyName;
	}

	public void setCandidate_companyName(String companyName) {
		this.companyName = companyName;
	}

	public String getCandidate_companyURL() {
		return companyURL;
	}

	public void setCandidate_companyURL(String companyURL) {
		this.companyURL = companyURL;
	}

	public String getCandidate_countryID() {
		return countryID;
	}

	public void setCandidate_countryID(String countryID) {
		this.countryID = countryID;
	}

	public String getCandidate_customDate1() {
		return customDate1;
	}

	public void setCandidate_customDate1(String customDate1) {
		this.customDate1 = customDate1;
	}

	public String getCandidate_customDate2() {
		return customDate2;
	}

	public void setCandidate_customDate2(String customDate2) {
		this.customDate2 = customDate2;
	}

	public String getCandidate_customDate3() {
		return customDate3;
	}

	public void setCandidate_customDate3(String customDate3) {
		this.customDate3 = customDate3;
	}

	public String getCandidate_customEncryptedText1() {
		return customEncryptedText1;
	}

	public void setCandidate_customEncryptedText1(String customEncryptedText1) {
		this.customEncryptedText1 = customEncryptedText1;
	}

	public String getCandidate_customEncryptedText2() {
		return customEncryptedText2;
	}

	public void setCandidate_customEncryptedText2(String customEncryptedText2) {
		this.customEncryptedText2 = customEncryptedText2;
	}

	public String getCandidate_customEncryptedText3() {
		return customEncryptedText3;
	}

	public void setCandidate_customEncryptedText3(String customEncryptedText3) {
		this.customEncryptedText3 = customEncryptedText3;
	}

	public String getCandidate_customEncryptedText4() {
		return customEncryptedText4;
	}

	public void setCandidate_customEncryptedText4(String customEncryptedText4) {
		this.customEncryptedText4 = customEncryptedText4;
	}

	public String getCandidate_customEncryptedText5() {
		return customEncryptedText5;
	}

	public void setCandidate_customEncryptedText5(String customEncryptedText5) {
		this.customEncryptedText5 = customEncryptedText5;
	}

	public String getCandidate_customEncryptedText6() {
		return customEncryptedText6;
	}

	public void setCandidate_customEncryptedText6(String customEncryptedText6) {
		this.customEncryptedText6 = customEncryptedText6;
	}

	public String getCandidate_customEncryptedText7() {
		return customEncryptedText7;
	}

	public void setCandidate_customEncryptedText7(String customEncryptedText7) {
		this.customEncryptedText7 = customEncryptedText7;
	}

	public String getCandidate_customEncryptedText8() {
		return customEncryptedText8;
	}

	public void setCandidate_customEncryptedText8(String customEncryptedText8) {
		this.customEncryptedText8 = customEncryptedText8;
	}

	public String getCandidate_customEncryptedText9() {
		return customEncryptedText9;
	}

	public void setCandidate_customEncryptedText9(String customEncryptedText9) {
		this.customEncryptedText9 = customEncryptedText9;
	}

	public String getCandidate_customEncryptedText10() {
		return customEncryptedText10;
	}

	public void setCandidate_customEncryptedText10(String customEncryptedText10) {
		this.customEncryptedText10 = customEncryptedText10;
	}

	public String getCandidate_customFloat1() {
		return customFloat1;
	}

	public void setCandidate_customFloat1(String customFloat1) {
		this.customFloat1 = customFloat1;
	}

	public String getCandidate_customFloat2() {
		return customFloat2;
	}

	public void setCandidate_customFloat2(String customFloat2) {
		this.customFloat2 = customFloat2;
	}

	public String getCandidate_customFloat3() {
		return customFloat3;
	}

	public void setCandidate_customFloat3(String customFloat3) {
		this.customFloat3 = customFloat3;
	}

	public String getCandidate_customInt1() {
		return customInt1;
	}

	public void setCandidate_customInt1(String customInt1) {
		this.customInt1 = customInt1;
	}

	public String getCandidate_customInt2() {
		return customInt2;
	}

	public void setCandidate_customInt2(String customInt2) {
		this.customInt2 = customInt2;
	}

	public String getCandidate_customInt3() {
		return customInt3;
	}

	public void setCandidate_customInt3(String customInt3) {
		this.customInt3 = customInt3;
	}

	public String getCandidate_customText1() {
		return customText1;
	}

	public void setCandidate_customText1(String customText1) {
		this.customText1 = customText1;
	}

	public String getCandidate_customText10() {
		return customText10;
	}

	public void setCandidate_customText10(String customText10) {
		this.customText10 = customText10;
	}

	public String getCandidate_customText10_display() {
		return customText10_display;
	}

	public void setCandidate_customText10_display(String customText10_display) {
		this.customText10_display = customText10_display;
	}

	public String getCandidate_customText11() {
		return customText11;
	}

	public void setCandidate_customText11(String customText11) {
		this.customText11 = customText11;
	}

	public String getCandidate_customText12() {
		return customText12;
	}

	public void setCandidate_customText12(String customText12) {
		this.customText12 = customText12;
	}

	public String getCandidate_customText13() {
		return customText13;
	}

	public void setCandidate_customText13(String customText13) {
		this.customText13 = customText13;
	}

	public String getCandidate_customText14() {
		return customText14;
	}

	public void setCandidate_customText14(String customText14) {
		this.customText14 = customText14;
	}

	public String getCandidate_customText15() {
		return customText15;
	}

	public void setCandidate_customText15(String customText15) {
		this.customText15 = customText15;
	}

	public String getCandidate_customText16() {
		return customText16;
	}

	public void setCandidate_customText16(String customText16) {
		this.customText16 = customText16;
	}

	public String getCandidate_customText17() {
		return customText17;
	}

	public void setCandidate_customText17(String customText17) {
		this.customText17 = customText17;
	}

	public String getCandidate_customText18() {
		return customText18;
	}

	public void setCandidate_customText18(String customText18) {
		this.customText18 = customText18;
	}

	public String getCandidate_customText19() {
		return customText19;
	}

	public void setCandidate_customText19(String customText19) {
		this.customText19 = customText19;
	}

	public String getCandidate_customText2() {
		return customText2;
	}

	public void setCandidate_customText2(String customText2) {
		this.customText2 = customText2;
	}

	public String getCandidate_customText20() {
		return customText20;
	}

	public void setCandidate_customText20(String customText20) {
		this.customText20 = customText20;
	}

	public String getCandidate_customText3() {
		return customText3;
	}

	public void setCandidate_customText3(String customText3) {
		this.customText3 = customText3;
	}

	public String getCandidate_customText4() {
		return customText4;
	}

	public void setCandidate_customText4(String customText4) {
		this.customText4 = customText4;
	}

	public String getCandidate_customText5() {
		return customText5;
	}

	public void setCandidate_customText5(String customText5) {
		this.customText5 = customText5;
	}

	public String getCandidate_customText6() {
		return customText6;
	}

	public void setCandidate_customText6(String customText6) {
		this.customText6 = customText6;
	}

	public String getCandidate_customText7() {
		return customText7;
	}

	public void setCandidate_customText7(String customText7) {
		this.customText7 = customText7;
	}

	public String getCandidate_customText8() {
		return customText8;
	}

	public void setCandidate_customText8(String customText8) {
		this.customText8 = customText8;
	}

	public String getCandidate_customText8_display() {
		return customText8_display;
	}

	public void setCandidate_customText8_display(String customText8_display) {
		this.customText8_display = customText8_display;
	}

	public String getCandidate_customText9() {
		return customText9;
	}

	public void setCandidate_customText9(String customText9) {
		this.customText9 = customText9;
	}

	public String getCandidate_customTextBlock1() {
		return customTextBlock1;
	}

	public void setCandidate_customTextBlock1(String customTextBlock1) {
		this.customTextBlock1 = customTextBlock1;
	}

	public String getCandidate_customTextBlock2() {
		return customTextBlock2;
	}

	public void setCandidate_customTextBlock2(String customTextBlock2) {
		this.customTextBlock2 = customTextBlock2;
	}

	public String getCandidate_customTextBlock3() {
		return customTextBlock3;
	}

	public void setCandidate_customTextBlock3(String customTextBlock3) {
		this.customTextBlock3 = customTextBlock3;
	}

	public String getCandidate_customTextBlock4() {
		return customTextBlock4;
	}

	public void setCandidate_customTextBlock4(String customTextBlock4) {
		this.customTextBlock4 = customTextBlock4;
	}

	public String getCandidate_customTextBlock5() {
		return customTextBlock5;
	}

	public void setCandidate_customTextBlock5(String customTextBlock5) {
		this.customTextBlock5 = customTextBlock5;
	}

	public String getCandidate_dateAdded() {
		return dateAdded;
	}

	public void setCandidate_dateAdded(String dateAdded) {
		this.dateAdded = dateAdded;
	}

	public String getCandidate_dateI9Expiration() {
		return dateI9Expiration;
	}

	public void setCandidate_dateI9Expiration(String dateI9Expiration) {
		this.dateI9Expiration = dateI9Expiration;
	}

	public String getCandidate_dateAvailable() {
		return dateAvailable;
	}

	public void setCandidate_dateAvailable(String dateAvailable) {
		this.dateAvailable = dateAvailable;
	}

	public String getCandidate_dateAvailableEnd() {
		return dateAvailableEnd;
	}

	public void setCandidate_dateAvailableEnd(String dateAvailableEnd) {
		this.dateAvailableEnd = dateAvailableEnd;
	}

	public String getCandidate_dateLastComment() {
		return dateLastComment;
	}

	public void setCandidate_dateLastComment(String dateLastComment) {
		this.dateLastComment = dateLastComment;
	}

	public String getCandidate_dateOfBirth() {
		return dateOfBirth;
	}

	public void setCandidate_dateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getCandidate_dateNextCall() {
		return dateNextCall;
	}

	public void setCandidate_dateNextCall(String dateNextCall) {
		this.dateNextCall = dateNextCall;
	}

	public String getCandidate_dayRate() {
		return dayRate;
	}

	public void setCandidate_dayRate(String dayRate) {
		this.dayRate = dayRate;
	}

	public String getCandidate_dayRateLow() {
		return dayRateLow;
	}

	public void setCandidate_dayRateLow(String dayRateLow) {
		this.dayRateLow = dayRateLow;
	}

	public String getCandidate_degreeList() {
		return degreeList;
	}

	public void setCandidate_degreeList(String degreeList) {
		this.degreeList = degreeList;
	}

	public String getCandidate_description() {
		return description;
	}

	public void setCandidate_description(String description) {
		this.description = description;
	}

	public String getCandidate_desiredLocations() {
		return desiredLocations;
	}

	public void setCandidate_desiredLocations(String desiredLocations) {
		this.desiredLocations = desiredLocations;
	}

	public String getCandidate_disability() {
		return disability;
	}

	public void setCandidate_disability(String disability) {
		this.disability = disability;
	}

	public String getCandidate_distributionListID() {
		return distributionListID;
	}

	public void setCandidate_distributionListID(String distributionListID) {
		this.distributionListID = distributionListID;
	}

	public String getCandidate_distributionListID_display() {
		return distributionListID_display;
	}

	public void setCandidate_distributionListID_display(String distributionListID_display) {
		this.distributionListID_display = distributionListID_display;
	}

	public String getCandidate_educationDegree() {
		return educationDegree;
	}

	public void setCandidate_educationDegree(String educationDegree) {
		this.educationDegree = educationDegree;
	}

	public String getCandidate_email() {
		return email;
	}

	public void setCandidate_email(String email) {
		this.email = email;
	}

	public String getCandidate_email2() {
		return email2;
	}

	public void setCandidate_email2(String email2) {
		this.email2 = email2;
	}

	public String getCandidate_email3() {
		return email3;
	}

	public void setCandidate_email3(String email3) {
		this.email3 = email3;
	}

	public String getCandidate_employeeType() {
		return employeeType;
	}

	public void setCandidate_employeeType(String employeeType) {
		this.employeeType = employeeType;
	}

	public String getCandidate_employmentPreference() {
		return employmentPreference;
	}

	public void setCandidate_employmentPreference(String employmentPreference) {
		this.employmentPreference = employmentPreference;
	}

	public String getCandidate_ethnicity() {
		return ethnicity;
	}

	public void setCandidate_ethnicity(String ethnicity) {
		this.ethnicity = ethnicity;
	}

	public String getCandidate_experience() {
		return experience;
	}

	public void setCandidate_experience(String experience) {
		this.experience = experience;
	}

	public String getCandidate_externalID() {
		return externalID;
	}

	public void setCandidate_externalID(String externalID) {
		this.externalID = externalID;
	}

	public String getCandidate_fax() {
		return fax;
	}

	public void setCandidate_fax(String fax) {
		this.fax = fax;
	}

	public String getCandidate_fax2() {
		return fax2;
	}

	public void setCandidate_fax2(String fax2) {
		this.fax2 = fax2;
	}

	public String getCandidate_fax3() {
		return fax3;
	}

	public void setCandidate_fax3(String fax3) {
		this.fax3 = fax3;
	}

	public String getCandidate_federalAddtionalWitholdingsAmount() {
		return federalAddtionalWitholdingsAmount;
	}

	public void setCandidate_federalAddtionalWitholdingsAmount(String federalAddtionalWitholdingsAmount) {
		this.federalAddtionalWitholdingsAmount = federalAddtionalWitholdingsAmount;
	}

	public String getCandidate_federalExemptions() {
		return federalExemptions;
	}

	public void setCandidate_federalExemptions(String federalExemptions) {
		this.federalExemptions = federalExemptions;
	}

	public String getCandidate_federalFilingStatus() {
		return federalFilingStatus;
	}

	public void setCandidate_federalFilingStatus(String federalFilingStatus) {
		this.federalFilingStatus = federalFilingStatus;
	}

	public String getCandidate_firstName() {
		return firstName;
	}

	public void setCandidate_firstName(String firstName) {
		this.firstName = firstName;
	}

	public String getCandidate_gender() {
		return gender;
	}

	public void setCandidate_gender(String gender) {
		this.gender = gender;
	}

	public String getCandidate_hourlyRate() {
		return hourlyRate;
	}

	public void setCandidate_hourlyRate(String hourlyRate) {
		this.hourlyRate = hourlyRate;
	}

	public String getCandidate_hourlyRateLow() {
		return hourlyRateLow;
	}

	public void setCandidate_hourlyRateLow(String hourlyRateLow) {
		this.hourlyRateLow = hourlyRateLow;
	}

	public String getCandidate_housingAmenityID() {
		return housingAmenityID;
	}

	public void setCandidate_housingAmenityID(String housingAmenityID) {
		this.housingAmenityID = housingAmenityID;
	}

	public String getCandidate_i9OnFile() {
		return i9OnFile;
	}

	public void setCandidate_i9OnFile(String i9OnFile) {
		this.i9OnFile = i9OnFile;
	}

	public String getCandidate_isEditable() {
		return isEditable;
	}

	public void setCandidate_isEditable(String isEditable) {
		this.isEditable = isEditable;
	}

	public String getCandidate_jobRestrictionBits() {
		return jobRestrictionBits;
	}

	public void setCandidate_jobRestrictionBits(String jobRestrictionBits) {
		this.jobRestrictionBits = jobRestrictionBits;
	}

	public String getCandidate_lastName() {
		return lastName;
	}

	public void setCandidate_lastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCandidate_linkedPersonID() {
		return linkedPersonID;
	}

	public void setCandidate_linkedPersonID(String linkedPersonID) {
		this.linkedPersonID = linkedPersonID;
	}

	public String getCandidate_localAddtionalWitholdingsAmount() {
		return localAddtionalWitholdingsAmount;
	}

	public void setCandidate_localAddtionalWitholdingsAmount(String localAddtionalWitholdingsAmount) {
		this.localAddtionalWitholdingsAmount = localAddtionalWitholdingsAmount;
	}

	public String getCandidate_localExemptions() {
		return localExemptions;
	}

	public void setCandidate_localExemptions(String localExemptions) {
		this.localExemptions = localExemptions;
	}

	public String getCandidate_localFilingStatus() {
		return localFilingStatus;
	}

	public void setCandidate_localFilingStatus(String localFilingStatus) {
		this.localFilingStatus = localFilingStatus;
	}

	public String getCandidate_localTaxCode() {
		return localTaxCode;
	}

	public void setCandidate_localTaxCode(String localTaxCode) {
		this.localTaxCode = localTaxCode;
	}

	public String getCandidate_mailOptOut() {
		return massMailOptOut;
	}

	public void setCandidate_massMailOptOut(String massMailOptOut) {
		this.massMailOptOut = massMailOptOut;
	}

	public String getCandidate_middleName() {
		return middleName;
	}

	public void setCandidate_middleName(String middleName) {
		this.middleName = middleName;
	}

	public String getCandidate_mobile() {
		return mobile;
	}

	public void setCandidate_mobile(String mobile) {
		this.mobile = mobile;
	}

	public String getCandidate_namePrefix() {
		return namePrefix;
	}

	public void setCandidate_namePrefix(String namePrefix) {
		this.namePrefix = namePrefix;
	}

	public String getCandidate_nameSuffix() {
		return nameSuffix;
	}

	public void setCandidate_nameSuffix(String nameSuffix) {
		this.nameSuffix = nameSuffix;
	}

	public String getCandidate_nickName() {
		return nickName;
	}

	public void setCandidate_nickName(String nickName) {
		this.nickName = nickName;
	}

	public String getCandidate_occupation() {
		return occupation;
	}

	public void setCandidate_occupation(String occupation) {
		this.occupation = occupation;
	}

	public String getCandidate_pager() {
		return pager;
	}

	public void setCandidate_pager(String pager) {
		this.pager = pager;
	}

	public String getCandidate_phone() {
		return phone;
	}

	public void setCandidate_phone(String phone) {
		this.phone = phone;
	}

	public String getCandidate_phone2() {
		return phone2;
	}

	public void setCandidate_phone2(String phone2) {
		this.phone2 = phone2;
	}

	public String getCandidate_phone3() {
		return phone3;
	}

	public void setCandidate_phone3(String phone3) {
		this.phone3 = phone3;
	}

	public String getCandidate_preferredContact() {
		return preferredContact;
	}

	public void setCandidate_preferredContact(String preferredContact) {
		this.preferredContact = preferredContact;
	}

	public String getCandidate_preferredHousing() {
		return preferredHousing;
	}

	public void setCandidate_preferredHousing(String preferredHousing) {
		this.preferredHousing = preferredHousing;
	}

	public String getCandidate_recentClientList() {
		return recentClientList;
	}

	public void setCandidate_recentClientList(String recentClientList) {
		this.recentClientList = recentClientList;
	}

	public String getCandidate_recruiterUserID() {
		return recruiterUserID;
	}

	public void setCandidate_recruiterUserID(String recruiterUserID) {
		this.recruiterUserID = recruiterUserID;
	}

	public String getCandidate_recruiterUserID_display() {
		return recruiterUserID_display;
	}

	public void setCandidate_recruiterUserID_display(String recruiterUserID_display) {
		this.recruiterUserID_display = recruiterUserID_display;
	}

	public String getCandidate_referredBy() {
		return referredBy;
	}

	public void setCandidate_referredBy(String referredBy) {
		this.referredBy = referredBy;
	}

	public String getCandidate_referredByUserID() {
		return referredByUserID;
	}

	public void setCandidate_referredByUserID(String referredByUserID) {
		this.referredByUserID = referredByUserID;
	}

	public String getCandidate_referredByUserID_display() {
		return referredByUserID_display;
	}

	public void setCandidate_referredByUserID_display(String referredByUserID_display) {
		this.referredByUserID_display = referredByUserID_display;
	}

	public String getCandidate_salary() {
		return salary;
	}

	public void setCandidate_salary(String salary) {
		this.salary = salary;
	}

	public String getCandidate_salaryLow() {
		return salaryLow;
	}

	public void setCandidate_salaryLow(String salaryLow) {
		this.salaryLow = salaryLow;
	}

	public String getCandidate_secondaryAddress1() {
		return secondaryAddress1;
	}

	public void setCandidate_secondaryAddress1(String secondaryAddress1) {
		this.secondaryAddress1 = secondaryAddress1;
	}

	public String getCandidate_secondaryAddress2() {
		return secondaryAddress2;
	}

	public void setCandidate_secondaryAddress2(String secondaryAddress2) {
		this.secondaryAddress2 = secondaryAddress2;
	}

	public String getCandidate_secondaryCity() {
		return secondaryCity;
	}

	public void setCandidate_secondaryCity(String secondaryCity) {
		this.secondaryCity = secondaryCity;
	}

	public String getCandidate_secondaryCountryID() {
		return secondaryCountryID;
	}

	public void setCandidate_secondaryCountryID(String secondaryCountryID) {
		this.secondaryCountryID = secondaryCountryID;
	}

	public String getCandidate_secondarySkillID() {
		return secondarySkillID;
	}

	public void setCandidate_secondarySkillID(String secondarySkillID) {
		this.secondarySkillID = secondarySkillID;
	}

	public String getCandidate_secondaryState() {
		return secondaryState;
	}

	public void setCandidate_secondaryState(String secondaryState) {
		this.secondaryState = secondaryState;
	}

	public String getCandidate_secondaryState_display() {
		return secondaryState_display;
	}

	public void setCandidate_secondaryState_display(String secondaryState_display) {
		this.secondaryState_display = secondaryState_display;
	}

	public String getCandidate_secondaryZip() {
		return secondaryZip;
	}

	public void setCandidate_secondaryZip(String secondaryZip) {
		this.secondaryZip = secondaryZip;
	}

	public String getCandidate_sendWelcomeEmail() {
		return sendWelcomeEmail;
	}

	public void setCandidate_sendWelcomeEmail(String sendWelcomeEmail) {
		this.sendWelcomeEmail = sendWelcomeEmail;
	}

	public String getCandidate_skillID() {
		return skillID;
	}

	public void setCandidate_skillID(String skillID) {
		this.skillID = skillID;
	}

	public String getCandidate_skillID_display() {
		return skillID_display;
	}

	public void setCandidate_skillID_display(String skillID_display) {
		this.skillID_display = skillID_display;
	}

	public String getCandidate_skillSet() {
		return skillSet;
	}

	public void setCandidate_skillSet(String skillSet) {
		this.skillSet = skillSet;
	}

	public String getCandidate_smsOptIn() {
		return smsOptIn;
	}

	public void setCandidate_smsOptIn(String smsOptIn) {
		this.smsOptIn = smsOptIn;
	}

	public String getCandidate_source() {
		return source;
	}

	public void setCandidate_source(String source) {
		this.source = source;
	}

	public String getCandidate_specialtyCategoryID() {
		return specialtyCategoryID;
	}

	public void setCandidate_specialtyCategoryID(String specialtyCategoryID) {
		this.specialtyCategoryID = specialtyCategoryID;
	}

	public String getCandidate_specialtyCategoryID_display() {
		return specialtyCategoryID_display;
	}

	public void setCandidate_specialtyCategoryID_display(String specialtyCategoryID_display) {
		this.specialtyCategoryID_display = specialtyCategoryID_display;
	}

	public String getCandidate_ssn() {
		return ssn;
	}

	public void setCandidate_ssn(String ssn) {
		this.ssn = ssn;
	}

	public String getCandidate_stateAddtionalWitholdingsAmount() {
		return stateAddtionalWitholdingsAmount;
	}

	public void setCandidate_stateAddtionalWitholdingsAmount(String stateAddtionalWitholdingsAmount) {
		this.stateAddtionalWitholdingsAmount = stateAddtionalWitholdingsAmount;
	}

	public String getCandidate_stateExemptions() {
		return stateExemptions;
	}

	public void setCandidate_stateExemptions(String stateExemptions) {
		this.stateExemptions = stateExemptions;
	}

	public String getCandidate_stateFilingStatus() {
		return stateFilingStatus;
	}

	public void setCandidate_stateFilingStatus(String stateFilingStatus) {
		this.stateFilingStatus = stateFilingStatus;
	}

	public String getCandidate_state() {
		return state;
	}

	public void setCandidate_state(String state) {
		this.state = state;
	}

	public String getCandidate_state_display() {
		return state_display;
	}

	public void setCandidate_state_display(String state_display) {
		this.state_display = state_display;
	}

	public String getCandidate_status() {
		return status;
	}

	public void setCandidate_status(String status) {
		this.status = status;
	}

	public String getCandidate_taxID() {
		return taxID;
	}

	public void setCandidate_taxID(String taxID) {
		this.taxID = taxID;
	}

	public String getCandidate_taxState() {
		return taxState;
	}

	public void setCandidate_taxState(String taxState) {
		this.taxState = taxState;
	}

	public String getCandidate_travelLimit() {
		return travelLimit;
	}

	public void setCandidate_travelLimit(String travelLimit) {
		this.travelLimit = travelLimit;
	}

	public String getCandidate_type() {
		return type;
	}

	public void setCandidate_type(String type) {
		this.type = type;
	}

	public String getCandidate_userID() {
		return userID;
	}

	public void setCandidate_userID(String userID) {
		this.userID = userID;
	}

	public String getCandidate_veteran() {
		return veteran;
	}

	public void setCandidate_veteran(String veteran) {
		this.veteran = veteran;
	}

	public String getCandidate_whitelistID() {
		return whitelistID;
	}

	public void setCandidate_whitelistID(String whitelistID) {
		this.whitelistID = whitelistID;
	}

	public String getCandidate_willRelocate() {
		return willRelocate;
	}

	public void setCandidate_willRelocate(String willRelocate) {
		this.willRelocate = willRelocate;
	}

	public String getCandidate_workAuthorized() {
		return workAuthorized;
	}

	public void setCandidate_workAuthorized(String workAuthorized) {
		this.workAuthorized = workAuthorized;
	}

	public String getCandidate_workPhone() {
		return workPhone;
	}

	public void setCandidate_workPhone(String workPhone) {
		this.workPhone = workPhone;
	}

	public String getCandidate_zip() {
		return zip;
	}

	public void setCandidate_zip(String zip) {
		this.zip = zip;
	}

	@Override
	public Candidate instantiateEntity() {
		Candidate candidate = new Candidate();

		Address address = new Address();
		address.setAddress1(address1);
		address.setAddress2(address2);
		address.setCity(city);
		address.setCountryID(toInteger(countryID, "countryID"));
		address.setState(state);
		address.setZip(zip);

		candidate.setAddress(address);
		candidate.setCategory(new Category(getFirstIntegerInCommaSeparatedList(categoryID)));
		candidate.setCertifications(certifications);
		candidate.setComments(comments);
		candidate.setCompanyName(companyName);
		candidate.setCompanyURL(companyURL);
		candidate.setCustomDate1(stringToDateTime(customDate1));
		candidate.setCustomDate2(stringToDateTime(customDate2));
		candidate.setCustomDate3(stringToDateTime(customDate3));
		candidate.setCustomEncryptedText1(customEncryptedText1);
		candidate.setCustomEncryptedText2(customEncryptedText2);
		candidate.setCustomEncryptedText3(customEncryptedText3);
		candidate.setCustomEncryptedText4(customEncryptedText4);
		candidate.setCustomEncryptedText5(customEncryptedText5);
		candidate.setCustomEncryptedText6(customEncryptedText6);
		candidate.setCustomEncryptedText7(customEncryptedText7);
		candidate.setCustomEncryptedText8(customEncryptedText8);
		candidate.setCustomEncryptedText9(customEncryptedText9);
		candidate.setCustomEncryptedText10(customEncryptedText10);
		candidate.setCustomFloat1(toBigDecimal(customFloat1, "customFloat1"));
		candidate.setCustomFloat2(toBigDecimal(customFloat2, "customFloat2"));
		candidate.setCustomFloat3(toBigDecimal(customFloat3, "customFloat3"));
		candidate.setCustomInt1(toInteger(customInt1, "customInt1"));
		candidate.setCustomInt2(toInteger(customInt2, "customInt2"));
		candidate.setCustomInt3(toInteger(customInt3, "customInt3"));
		candidate.setCustomText1(customText1);
		candidate.setCustomText2(customText2);
		candidate.setCustomText3(customText3);
		candidate.setCustomText4(customText4);
		candidate.setCustomText5(customText5);
		candidate.setCustomText6(customText6);
		candidate.setCustomText7(customText7);
		candidate.setCustomText8(customText8);
		candidate.setCustomText9(customText9);
		candidate.setCustomText10(customText10);
		candidate.setCustomText11(customText11);
		candidate.setCustomText12(customText12);
		candidate.setCustomText13(customText13);
		candidate.setCustomText14(customText14);
		candidate.setCustomText15(customText15);
		candidate.setCustomText16(customText16);
		candidate.setCustomText17(customText17);
		candidate.setCustomText18(customText18);
		candidate.setCustomText19(customText19);
		candidate.setCustomText20(customText20);
		candidate.setCustomTextBlock1(customTextBlock1);
		candidate.setCustomTextBlock2(customTextBlock2);
		candidate.setCustomTextBlock3(customTextBlock3);
		candidate.setCustomTextBlock4(customTextBlock4);
		candidate.setCustomTextBlock5(customTextBlock5);
		candidate.setDateAdded(stringToDateTime(dateAdded));
		candidate.setDateI9Expiration(stringToDateTime(dateI9Expiration));
		candidate.setDateAvailable(stringToDateTime(dateAvailable));
		candidate.setDateAvailableEnd(stringToDateTime(dateAvailableEnd));
		candidate.setDateLastComment(stringToDateTime(dateLastComment));
		candidate.setDateOfBirth(stringToDateTime(dateOfBirth));
		candidate.setDateNextCall(stringToDateTime(dateNextCall));
		candidate.setDayRate(toBigDecimal(dayRate, "dayRate"));
		candidate.setDayRateLow(toBigDecimal(dayRateLow, "dayRateLow"));
		candidate.setDegreeList(degreeList);
		candidate.setDescription(description);
		candidate.setDesiredLocations(desiredLocations);
		candidate.setDisability(disability);
		candidate.setEducationDegree(educationDegree);
		candidate.setEmail(email);
		candidate.setEmail2(email2);
		candidate.setEmail3(email3);
		candidate.setEmployeeType(employeeType);
		candidate.setEmploymentPreference(employmentPreference);
		candidate.setEthnicity(ethnicity);
		candidate.setExperience(toInteger(experience, "experience"));
		candidate.setExternalID(externalID);
		candidate.setFax(fax);
		candidate.setFax2(fax2);
		candidate.setFax3(fax3);
		candidate
				.setFederalAddtionalWitholdingsAmount(toBigDecimal(federalAddtionalWitholdingsAmount, "federalAddtionalWitholdingsAmount"));
		candidate.setFederalExemptions(toInteger(federalExemptions, "federalExemptions"));
		candidate.setFederalFilingStatus(federalFilingStatus);
		candidate.setFirstName(firstName);
		candidate.setGender(gender);
		candidate.setHourlyRate(toBigDecimal(hourlyRate, "hourlyRate"));
		candidate.setHourlyRateLow(toBigDecimal(hourlyRateLow, "hourlyRateLow"));
		candidate.setIsEditable(toBoolean(isEditable, "isEditable"));
		candidate.setI9OnFile(toInteger(i9OnFile, "i9OnFile"));
		candidate.setLastName(lastName);
		candidate.setLinkedPerson(new Person(toInteger(linkedPersonID, "linkedPerson.id")));
		candidate.setLocalAddtionalWitholdingsAmount(toBigDecimal(localAddtionalWitholdingsAmount, "localAddtionalWitholdingsAmount"));
		candidate.setLocalExemptions(toInteger(localExemptions, "localExemptions"));
		candidate.setLocalFilingStatus(localFilingStatus);
		candidate.setLocalTaxCode(localTaxCode);
		candidate.setMassMailOptOut(toBoolean(massMailOptOut, "massMailOptOut"));
		candidate.setMiddleName(middleName);
		candidate.setMobile(mobile);
		candidate.setName((Strings.nullToEmpty(firstName) + " " + Strings.nullToEmpty(lastName)).trim());
		candidate.setNamePrefix(namePrefix);
		candidate.setNameSuffix(nameSuffix);
		candidate.setNickName(nickName);
		candidate.setOccupation(occupation);
		candidate.setPager(pager);
		candidate.setPhone(phone);
		candidate.setPhone2(phone2);
		candidate.setPhone3(phone3);
		candidate.setPreferredContact(preferredContact);
		candidate.setRecentClientList(recentClientList);
		if (Utility.isNumeric(recruiterUserID))
			candidate.setOwner(new CorporateUser(Integer.parseInt(recruiterUserID)));
		else if (recruiterUserID != null) {
			String[] ownerIDs = recruiterUserID.split(",");
			candidate
					.setOwner(new CorporateUser(ownerIDs.length > 0 && Utility.isNumbersOnly(ownerIDs[0]) ? Integer.parseInt(ownerIDs[0]) : 0));
		}

		candidate.setReferredBy(referredBy);
		candidate.setReferredByPerson(new Person(toInteger(referredByUserID, "referredByUserID")));
		candidate.setSalary(toBigDecimal(salary, "salary"));
		candidate.setSalaryLow(toBigDecimal(salaryLow, "salaryLow"));

		Address secondaryAddress = new Address();
		secondaryAddress.setAddress1(secondaryAddress1);
		secondaryAddress.setAddress2(secondaryAddress2);
		secondaryAddress.setCity(secondaryCity);
		secondaryAddress.setCountryID(toInteger(secondaryCountryID, "secondaryCountryID"));
		secondaryAddress.setState(secondaryState);
		secondaryAddress.setZip(secondaryZip);
		candidate.setSecondaryAddress(secondaryAddress);

		candidate.setSkillSet(skillSet);
		candidate.setSmsOptIn(toBoolean(smsOptIn, "smsOptIn"));
		candidate.setSource(source);
		candidate.setSsn(ssn);
		candidate.setStateAddtionalWitholdingsAmount(toBigDecimal(stateAddtionalWitholdingsAmount, "stateAddtionalWitholdingsAmount"));
		candidate.setStateExemptions(toInteger(stateExemptions, "stateExemptions"));
		candidate.setStateFilingStatus(stateFilingStatus);
		candidate.setStatus(status);
		candidate.setTaxID(taxID);
		candidate.setTaxState(taxState);
		candidate.setTravelLimit(toInteger(travelLimit, "travelLimit"));
		candidate.setType(type);
		candidate.setId(toInteger(userID, "id"));
		candidate.setVeteran(veteran);
		candidate.setWillRelocate(toBoolean(willRelocate, "willRelocate"));
		candidate.setWorkAuthorized(toBoolean(workAuthorized, "workAuthorized"));
		candidate.setWorkPhone(workPhone);

		return candidate;
	}

    public static FormCandidateDto instantiateFromCandidate(Candidate candidate){

        FormCandidateDto formCandidateDto = new FormCandidateDto();

        Address address = candidate.getAddress();

        if(address != null) {
            formCandidateDto.setAddress1(address.getAddress1());
            formCandidateDto.setAddress2(address.getAddress2());
            formCandidateDto.setCity(address.getCity());
            formCandidateDto.setCountryID(makeString(address.getCountryID()));
            formCandidateDto.setState(address.getState());
            formCandidateDto.setZip(address.getZip());
        }

        formCandidateDto.setCategoryID(candidate.getCategory() != null ? makeString(candidate.getCategory().getId()) : null);
        formCandidateDto.setCertifications(candidate.getCertifications());
        formCandidateDto.setComments(candidate.getComments());
        formCandidateDto.setCompanyName(candidate.getCompanyName());
        formCandidateDto.setCompanyURL(candidate.getCompanyURL());
        formCandidateDto.setCustomDate1(makeString(candidate.getCustomDate1()));
        formCandidateDto.setCustomDate2(makeString(candidate.getCustomDate2()));
        formCandidateDto.setCustomDate3(makeString(candidate.getCustomDate3()));
        formCandidateDto.setCustomFloat1(makeString(candidate.getCustomFloat1()));
        formCandidateDto.setCustomFloat2(makeString(candidate.getCustomFloat2()));
        formCandidateDto.setCustomFloat3(makeString(candidate.getCustomFloat3()));
        formCandidateDto.setCustomInt1(makeString(candidate.getCustomInt1()));
        formCandidateDto.setCustomInt2(makeString(candidate.getCustomInt2()));
        formCandidateDto.setCustomInt3(makeString(candidate.getCustomInt3()));
        formCandidateDto.setCustomText1(candidate.getCustomText1());
        formCandidateDto.setCustomText10(candidate.getCustomText10());
        formCandidateDto.setCustomText11(candidate.getCustomText11());
        formCandidateDto.setCustomText12(candidate.getCustomText12());
        formCandidateDto.setCustomText13(candidate.getCustomText13());
        formCandidateDto.setCustomText14(candidate.getCustomText14());
        formCandidateDto.setCustomText15(candidate.getCustomText15());
        formCandidateDto.setCustomText16(candidate.getCustomText16());
        formCandidateDto.setCustomText17(candidate.getCustomText17());
        formCandidateDto.setCustomText18(candidate.getCustomText18());
        formCandidateDto.setCustomText19(candidate.getCustomText19());
        formCandidateDto.setCustomText2(candidate.getCustomText2());
        formCandidateDto.setCustomText20(candidate.getCustomText20());
        formCandidateDto.setCustomText3(candidate.getCustomText3());
        formCandidateDto.setCustomText4(candidate.getCustomText4());
        formCandidateDto.setCustomText5(candidate.getCustomText5());
        formCandidateDto.setCustomText6(candidate.getCustomText6());
        formCandidateDto.setCustomText7(candidate.getCustomText7());
        formCandidateDto.setCustomText8(candidate.getCustomText8());
        formCandidateDto.setCustomText9(candidate.getCustomText9());
        formCandidateDto.setCustomTextBlock1(candidate.getCustomTextBlock1());
        formCandidateDto.setCustomTextBlock2(candidate.getCustomTextBlock2());
        formCandidateDto.setCustomTextBlock3(candidate.getCustomTextBlock3());
        formCandidateDto.setCustomTextBlock4(candidate.getCustomTextBlock4());
        formCandidateDto.setCustomTextBlock5(candidate.getCustomTextBlock5());
        formCandidateDto.setDateAdded(makeString(candidate.getDateAdded()));
        formCandidateDto.setDateI9Expiration(makeString(candidate.getDateI9Expiration()));
        formCandidateDto.setDateAvailable(makeString(candidate.getDateAvailable()));
        formCandidateDto.setDateAvailableEnd(makeString(candidate.getDateAvailableEnd()));
        formCandidateDto.setDateLastComment(makeString(candidate.getDateLastComment()));
        formCandidateDto.setDateOfBirth(makeString(candidate.getDateOfBirth()));
        formCandidateDto.setDateNextCall(makeString(candidate.getDateNextCall()));
        formCandidateDto.setDayRate(makeString(candidate.getDayRate()));
        formCandidateDto.setDayRateLow(makeString(candidate.getDayRateLow()));
        formCandidateDto.setDegreeList(candidate.getDegreeList());
        formCandidateDto.setDescription(candidate.getDescription());
        formCandidateDto.setDesiredLocations(candidate.getDesiredLocations());
        formCandidateDto.setDisability(candidate.getDisability());
        formCandidateDto.setEducationDegree(candidate.getEducationDegree());
        formCandidateDto.setEmail(candidate.getEmail());
        formCandidateDto.setEmail2(candidate.getEmail2());
        formCandidateDto.setEmail3(candidate.getEmail3());
        formCandidateDto.setEmployeeType(candidate.getEmployeeType());
        formCandidateDto.setEmploymentPreference(candidate.getEmploymentPreference());
        formCandidateDto.setEthnicity(candidate.getEthnicity());
        formCandidateDto.setExperience(makeString(candidate.getExperience()));
        formCandidateDto.setExternalID(makeString(candidate.getExternalID()));
        formCandidateDto.setFax(candidate.getFax());
        formCandidateDto.setFax2(candidate.getFax2());
        formCandidateDto.setFax3(candidate.getFax3());
        formCandidateDto.setFederalAddtionalWitholdingsAmount(makeString(candidate.getFederalAddtionalWitholdingsAmount()));
        formCandidateDto.setFederalExemptions(makeString(candidate.getFederalExemptions()));
        formCandidateDto.setFederalFilingStatus(candidate.getFederalFilingStatus());
        formCandidateDto.setFirstName(candidate.getFirstName());
        formCandidateDto.setGender(candidate.getGender());
        formCandidateDto.setHourlyRate(makeString(candidate.getHourlyRate()));
        formCandidateDto.setHourlyRateLow(makeString(candidate.getHourlyRateLow()));
        formCandidateDto.setIsEditable(makeString(candidate.getIsEditable()));
        formCandidateDto.setI9OnFile(makeString(candidate.getI9OnFile()));
        formCandidateDto.setLastName(makeString(candidate.getLastName()));
        formCandidateDto.setLinkedPersonID(candidate.getLinkedPerson() != null ? makeString(candidate.getLinkedPerson().getId()) : null);
        formCandidateDto.setLocalAddtionalWitholdingsAmount(makeString(candidate.getLocalAddtionalWitholdingsAmount()));
        formCandidateDto.setLocalExemptions(makeString(candidate.getLocalExemptions()));
        formCandidateDto.setLocalFilingStatus(candidate.getLocalFilingStatus());
        formCandidateDto.setLocalTaxCode(candidate.getLocalTaxCode());
        formCandidateDto.setMassMailOptOut(makeString(candidate.getMassMailOptOut()));
        formCandidateDto.setMiddleName(candidate.getMiddleName());
        formCandidateDto.setMobile(candidate.getMobile());
        formCandidateDto.setNamePrefix(candidate.getNamePrefix());
        formCandidateDto.setNameSuffix(candidate.getNameSuffix());
        formCandidateDto.setNickName(candidate.getNickName());
        formCandidateDto.setOccupation(candidate.getOccupation());
        formCandidateDto.setPager(candidate.getPager());
        formCandidateDto.setPhone(candidate.getPhone());
        formCandidateDto.setPhone2(candidate.getPhone2());
        formCandidateDto.setPhone3(candidate.getPhone3());
        formCandidateDto.setPreferredContact(candidate.getPreferredContact());
        formCandidateDto.setRecentClientList(candidate.getRecentClientList());
        formCandidateDto.setRecruiterUserID(candidate.getOwner() != null ? makeString(candidate.getOwner().getId()) : null);
        formCandidateDto.setReferredBy(candidate.getReferredBy());
        formCandidateDto.setReferredByUserID(candidate.getReferredByPerson() != null ? makeString(candidate.getReferredByPerson().getId()) : null);
        formCandidateDto.setSalary(makeString(candidate.getSalary()));
        formCandidateDto.setSalaryLow(makeString(candidate.getSalaryLow()));

        address = candidate.getSecondaryAddress();

        if(address != null){
            formCandidateDto.setSecondaryAddress1(address.getAddress1());
            formCandidateDto.setSecondaryAddress2(address.getAddress2());
            formCandidateDto.setSecondaryCity(address.getCity());
            formCandidateDto.setSecondaryCountryID(makeString(address.getCountryID()));
            formCandidateDto.setSecondaryState(address.getState());
            formCandidateDto.setSecondaryZip(address.getZip());
        }

        formCandidateDto.setSkillSet(candidate.getSkillSet());
        formCandidateDto.setSmsOptIn(makeString(candidate.getSmsOptIn()));
        formCandidateDto.setSource(candidate.getSource());
        formCandidateDto.setSsn(candidate.getSsn());
        formCandidateDto.setStateAddtionalWitholdingsAmount(makeString(candidate.getStateAddtionalWitholdingsAmount()));
        formCandidateDto.setStateExemptions(makeString(candidate.getStateExemptions()));
        formCandidateDto.setStateFilingStatus(candidate.getStateFilingStatus());
        formCandidateDto.setStatus(candidate.getStatus());
        formCandidateDto.setTaxID(candidate.getTaxID());
        formCandidateDto.setTaxState(candidate.getTaxState());
        formCandidateDto.setTravelLimit(makeString(candidate.getTravelLimit()));
        formCandidateDto.setType(candidate.getType());
        formCandidateDto.setUserID(makeString(candidate.getId()));
        formCandidateDto.setVeteran(candidate.getVeteran());
        formCandidateDto.setWillRelocate(makeString(candidate.getWillRelocate()));
        formCandidateDto.setWorkAuthorized(makeString(candidate.getWorkAuthorized()));
        formCandidateDto.setWorkPhone(candidate.getWorkPhone());

        return formCandidateDto;
    }
	
	
	/**
	 * Converts the form values to a SOAP dto.
	 * 
	 * @deprecated use {@link #instantiateEntity()} instead for BullhornEntity
	 * @return a SOAP dto
	 */
	@Deprecated
	public CandidateDto instantiateBullhornDto() {
		CandidateDto candidateDto = new CandidateDto();

		com.bullhorn.entity.emb.Address address = new com.bullhorn.entity.emb.Address();
		address.setAddress1(address1);
		address.setAddress2(address2);
		address.setCity(city);
		address.setCountryID(toInteger(countryID, "countryID"));
		address.setState(state);
		address.setZip(zip);

		candidateDto.setAddress(address);
		candidateDto.setCategoryID(getFirstIntegerInCommaSeparatedList(categoryID));
		candidateDto.setCertifications(certifications);
		candidateDto.setComments(comments);
		candidateDto.setCompanyName(companyName);
		candidateDto.setCompanyURL(companyURL);
		candidateDto.setCustomDate1(stringToXMLGregorianCalendar(customDate1));
		candidateDto.setCustomDate2(stringToXMLGregorianCalendar(customDate2));
		candidateDto.setCustomDate3(stringToXMLGregorianCalendar(customDate3));
		candidateDto.setCustomFloat1(toDouble(customFloat1, "customFloat1"));
		candidateDto.setCustomFloat2(toDouble(customFloat2, "customFloat2"));
		candidateDto.setCustomFloat3(toDouble(customFloat3, "customFloat3"));
		candidateDto.setCustomInt1(toInteger(customInt1, "customInt1"));
		candidateDto.setCustomInt2(toInteger(customInt2, "customInt2"));
		candidateDto.setCustomInt3(toInteger(customInt3, "customInt3"));
		candidateDto.setCustomText1(customText1);
		candidateDto.setCustomText2(customText2);
		candidateDto.setCustomText3(customText3);
		candidateDto.setCustomText4(customText4);
		candidateDto.setCustomText5(customText5);
		candidateDto.setCustomText6(customText6);
		candidateDto.setCustomText7(customText7);
		candidateDto.setCustomText8(customText8);
		candidateDto.setCustomText9(customText9);
		candidateDto.setCustomText10(customText10);
		candidateDto.setCustomText11(customText11);
		candidateDto.setCustomText12(customText12);
		candidateDto.setCustomText13(customText13);
		candidateDto.setCustomText14(customText14);
		candidateDto.setCustomText15(customText15);
		candidateDto.setCustomText16(customText16);
		candidateDto.setCustomText17(customText17);
		candidateDto.setCustomText18(customText18);
		candidateDto.setCustomText19(customText19);
		candidateDto.setCustomText20(customText20);
		candidateDto.setCustomTextBlock1(customTextBlock1);
		candidateDto.setCustomTextBlock2(customTextBlock2);
		candidateDto.setCustomTextBlock3(customTextBlock3);
		candidateDto.setCustomTextBlock4(customTextBlock4);
		candidateDto.setCustomTextBlock5(customTextBlock5);
		candidateDto.setDateAdded(stringToXMLGregorianCalendar(dateAdded));
		candidateDto.setDateI9Expiration(stringToXMLGregorianCalendar(dateI9Expiration));
		candidateDto.setDateAvailable(stringToXMLGregorianCalendar(dateAvailable));
		candidateDto.setDateAvailableEnd(stringToXMLGregorianCalendar(dateAvailableEnd));
		candidateDto.setDateLastComment(stringToXMLGregorianCalendar(dateLastComment));
		candidateDto.setDateOfBirth(stringToXMLGregorianCalendar(dateOfBirth));
		candidateDto.setDateNextCall(stringToXMLGregorianCalendar(dateNextCall));
		candidateDto.setDayRate(toBigDecimal(dayRate, "dayRate"));
		candidateDto.setDayRateLow(toBigDecimal(dayRateLow, "dayRateLow"));
		candidateDto.setDegreeList(degreeList);
		candidateDto.setDescription(description);
		candidateDto.setDesiredLocations(desiredLocations);
		candidateDto.setDisability(disability);
		candidateDto.setEducationDegree(educationDegree);
		candidateDto.setEmail(email);
		candidateDto.setEmail2(email2);
		candidateDto.setEmail3(email3);
		candidateDto.setEmployeeType(employeeType);
		candidateDto.setEmploymentPreference(employmentPreference);
		candidateDto.setEthnicity(ethnicity);
		candidateDto.setExperience(toInteger(experience, "experience"));
		candidateDto.setExternalID(externalID);
		candidateDto.setFax(fax);
		candidateDto.setFax2(fax2);
		candidateDto.setFax3(fax3);
		candidateDto.setFederalAddtionalWitholdingsAmount(toBigDecimal(federalAddtionalWitholdingsAmount,
				"federalAddtionalWitholdingsAmount"));
		candidateDto.setFederalExemptions(toInteger(federalExemptions, "federalExemptions"));
		candidateDto.setFederalFilingStatus(federalFilingStatus);
		candidateDto.setFirstName(firstName);
		candidateDto.setGender(gender);
		candidateDto.setHourlyRate(toBigDecimal(hourlyRate, "hourlyRate"));
		candidateDto.setHourlyRateLow(toBigDecimal(hourlyRateLow, "hourlyRateLow"));
		candidateDto.setIsEditable(toBoolean(isEditable, "isEditable"));
		candidateDto.setI9OnFile(toInteger(i9OnFile, "i9OnFile"));
		candidateDto.setLastName(lastName);
		candidateDto.setLinkedPersonID(toInteger(linkedPersonID, "linkedPersonID"));
		candidateDto.setLocalAddtionalWitholdingsAmount(toBigDecimal(localAddtionalWitholdingsAmount, "localAddtionalWitholdingsAmount"));
		candidateDto.setLocalExemptions(toInteger(localExemptions, "localExemptions"));
		candidateDto.setLocalFilingStatus(localFilingStatus);
		candidateDto.setLocalTaxCode(localTaxCode);
		candidateDto.setMassMailOptOut(toBoolean(massMailOptOut,"massMailOptOut"));
		candidateDto.setMiddleName(middleName);
		candidateDto.setMobile(mobile);
		candidateDto.setName((Strings.nullToEmpty(firstName) + " " + Strings.nullToEmpty(lastName)).trim());
		candidateDto.setNamePrefix(namePrefix);
		candidateDto.setNameSuffix(nameSuffix);
		candidateDto.setNickName(nickName);
		candidateDto.setOccupation(occupation);
		candidateDto.setPager(pager);
		candidateDto.setPhone(phone);
		candidateDto.setPhone2(phone2);
		candidateDto.setPhone3(phone3);
		candidateDto.setPreferredContact(preferredContact);
		candidateDto.setRecentClientList(recentClientList);
		if (Utility.isNumeric(recruiterUserID))
			candidateDto.setOwnerID(Integer.parseInt(recruiterUserID));
		else if (recruiterUserID != null) {
			String[] ownerIDs = recruiterUserID.split(",");
			candidateDto.setOwnerID(ownerIDs.length > 0 && Utility.isNumbersOnly(ownerIDs[0]) ? Integer.parseInt(ownerIDs[0]) : 0);
		}

		candidateDto.setReferredBy(referredBy);
		candidateDto.setReferredByPersonID(toInteger(referredByUserID, "referredByUserID"));
		candidateDto.setSalary(toBigDecimal(salary, "salary"));
		candidateDto.setSalaryLow(toBigDecimal(salaryLow, "salaryLow"));

		com.bullhorn.entity.emb.Address secondaryAddress = new com.bullhorn.entity.emb.Address();
		secondaryAddress.setAddress1(secondaryAddress1);
		secondaryAddress.setAddress2(secondaryAddress2);
		secondaryAddress.setCity(secondaryCity);
		secondaryAddress.setCountryID(toInteger(secondaryCountryID, "secondaryCountryID"));
		secondaryAddress.setState(secondaryState);
		secondaryAddress.setZip(secondaryZip);
		candidateDto.setSecondaryAddress(secondaryAddress);

		candidateDto.setSkillSet(skillSet);
		candidateDto.setSmsOptIn(toBoolean(smsOptIn, "smsOptIn"));
		candidateDto.setSource(source);
		candidateDto.setSsn(ssn);
		candidateDto.setStateAddtionalWitholdingsAmount(toBigDecimal(stateAddtionalWitholdingsAmount, "stateAddtionalWitholdingsAmount"));
		candidateDto.setStateExemptions(toInteger(stateExemptions, "stateExemptions"));
		candidateDto.setStateFilingStatus(stateFilingStatus);
		candidateDto.setStatus(status);
		candidateDto.setTaxID(taxID);
		candidateDto.setTaxState(taxState);
		candidateDto.setTravelLimit(toInteger(travelLimit, "travelLimit"));
		candidateDto.setType(type);
		candidateDto.setUserID(toInteger(userID, "userID"));
		candidateDto.setVeteran(veteran);
		candidateDto.setWillRelocate(toBoolean(willRelocate, "willRelocate"));
		candidateDto.setWorkAuthorized(toBoolean(workAuthorized, "workAuthorized"));
		candidateDto.setWorkPhone(workPhone);

		return candidateDto;
	}
}
