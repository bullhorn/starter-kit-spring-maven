package com.client.core.formtrigger.model.form.impl;

import org.apache.log4j.Logger;

import com.bullhornsdk.data.model.entity.core.standard.Category;
import com.bullhornsdk.data.model.entity.core.standard.ClientContact;
import com.bullhornsdk.data.model.entity.core.standard.ClientCorporation;
import com.bullhornsdk.data.model.entity.core.standard.CorporateUser;
import com.bullhornsdk.data.model.entity.core.standard.Lead;
import com.bullhornsdk.data.model.entity.core.standard.Person;
import com.bullhornsdk.data.model.entity.core.standard.Skill;
import com.bullhornsdk.data.model.entity.embedded.Address;
import com.bullhornsdk.data.model.entity.embedded.OneToMany;
import com.client.core.base.util.Utility;
import com.client.core.formtrigger.model.form.AbstractFormDto;
import com.google.common.collect.Lists;

/**
 * Created by hiqbal on 12/22/2015.
 */
public class FormLeadDto extends AbstractFormDto<Lead> {

    public FormLeadDto() {
        super(Logger.getLogger(FormLeadDto.class));
    }

    private String address1;
    private String address2;
    private String city;
    private String countryID;
    private String state;
    private String zip;
    private String assignedToUserID;
    private String businessSectorID;
    private String campaignSource;
    private String candidateID;
    private String categoryID;
    private String clientContactID;
    private String clientCorporationID;
    private String comments;
    private String companyName;
    private String companyURL;
    private String conversionSource;
    private String dateAdded;
    private String dateLastComment;
    private String dateLastModified;
    private String dateLastVisited;
    private String description;
    private String distributionListID;
    private String division;
    private String educationDegree;
    private String email;
    private String email2;
    private String email3;
    private String fax;
    private String fax2;
    private String fax3;
    private String firstName;
    private String isDayLightSavingsTime;
    private String isDeleted;
    private String lastName;
    private String leadSource;
    private String massMailOptOut;
    private String middleName;
    private String mobile;
    private String name;
    private String namePrefix;
    private String nameSuffix;
    private String nickName;
    private String numEmployees;
    private String occupation;
    private String userID;
    private String ownerCorporationID;
    private String pager;
    private String phone;
    private String phone2;
    private String phone3;
    private String preferredContact;
    private String primarySkillID;
    private String priority;
    private String recruiterUserID;
    private String referredByPersonID;
    private String reportToPersonID;
    private String role;
    private String salary;
    private String salaryLow;
    private String secondarySkillId;
    private String skillSet;
    private String smsOptIn;
    private String source;
    private String specialties;
    private String status;
    private String tearsheetsID;
    private String timeZoneOffsetEST;
    private String type;
    private String willRelocate;

    private String customTextBlock1;
    private String customTextBlock2;
    private String customTextBlock3;
    private String customTextBlock4;
    private String customTextBlock5;
    private String customDate1;
    private String customDate2;
    private String customDate3;
    private String customFloat1;
    private String customFloat2;
    private String customFloat3;
    private String customInt1;
    private String customInt2;
    private String customInt3;
    private String customText1;
    private String customText2;
    private String customText3;
    private String customText4;
    private String customText5;
    private String customText6;
    private String customText7;
    private String customText8;
    private String customText9;
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
    private String customText20;

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

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountryID() {
        return countryID;
    }

    public void setCountryID(String countryID) {
        this.countryID = countryID;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getAssignedToUserID() {
        return assignedToUserID;
    }

    public void setAssignedToUserID(String assignedToUserID) {
        this.assignedToUserID = assignedToUserID;
    }

    public String getBusinessSectorID() {
        return businessSectorID;
    }

    public void setBusinessSectorID(String businessSectorID) {
        this.businessSectorID = businessSectorID;
    }

    public String getCampaignSource() {
        return campaignSource;
    }

    public void setCampaignSource(String campaignSource) {
        this.campaignSource = campaignSource;
    }

    public String getCandidateID() {
        return candidateID;
    }

    public void setCandidateID(String candidateID) {
        this.candidateID = candidateID;
    }

    public String getCategoryID() {
        return categoryID;
    }

    public void setCategoryID(String categoryID) {
        this.categoryID = categoryID;
    }

    public String getClientContactID() {
        return clientContactID;
    }

    public void setClientContactID(String clientContactID) {
        this.clientContactID = clientContactID;
    }

    public String getClientCorporationID() {
        return clientCorporationID;
    }

    public void setClientCorporationID(String clientCorporationID) {
        this.clientCorporationID = clientCorporationID;
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

    public String getConversionSource() {
        return conversionSource;
    }

    public void setConversionSource(String conversionSource) {
        this.conversionSource = conversionSource;
    }

    public String getDateAdded() {
        return dateAdded;
    }

    public void setDateAdded(String dateAdded) {
        this.dateAdded = dateAdded;
    }

    public String getDateLastComment() {
        return dateLastComment;
    }

    public void setDateLastComment(String dateLastComment) {
        this.dateLastComment = dateLastComment;
    }

    public String getDateLastModified() {
        return dateLastModified;
    }

    public void setDateLastModified(String dateLastModified) {
        this.dateLastModified = dateLastModified;
    }

    public String getDateLastVisited() {
        return dateLastVisited;
    }

    public void setDateLastVisited(String dateLastVisited) {
        this.dateLastVisited = dateLastVisited;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDistributionListID() {
        return distributionListID;
    }

    public void setDistributionListID(String distributionListID) {
        this.distributionListID = distributionListID;
    }

    public String getDivision() {
        return division;
    }

    public void setDivision(String division) {
        this.division = division;
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

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getEmail3() {
        return email3;
    }

    public void setEmail3(String email3) {
        this.email3 = email3;
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

    public String getIsDayLightSavingsTime() {
        return isDayLightSavingsTime;
    }

    public void setIsDayLightSavingsTime(String isDayLightSavingsTime) {
        this.isDayLightSavingsTime = isDayLightSavingsTime;
    }

    public String getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(String isDeleted) {
        this.isDeleted = isDeleted;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLeadSource() {
        return leadSource;
    }

    public void setLeadSource(String leadSource) {
        this.leadSource = leadSource;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public String getNumEmployees() {
        return numEmployees;
    }

    public void setNumEmployees(String numEmployees) {
        this.numEmployees = numEmployees;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getOwnerCorporationID() {
        return ownerCorporationID;
    }

    public void setOwnerCorporationID(String ownerCorporationID) {
        this.ownerCorporationID = ownerCorporationID;
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

    public String getPrimarySkillID() {
        return primarySkillID;
    }

    public void setPrimarySkillID(String primarySkillID) {
        this.primarySkillID = primarySkillID;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public String getRecruiterUserID() {
        return recruiterUserID;
    }

    public void setRecruiterUserID(String recruiterUserID) {
        this.recruiterUserID = recruiterUserID;
    }

    public String getReferredByPersonID() {
        return referredByPersonID;
    }

    public void setReferredByPersonID(String referredByPersonID) {
        this.referredByPersonID = referredByPersonID;
    }

    public String getReportToPersonID() {
        return reportToPersonID;
    }

    public void setReportToPersonID(String reportToPersonID) {
        this.reportToPersonID = reportToPersonID;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
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

    public String getSecondarySkillId() {
        return secondarySkillId;
    }

    public void setSecondarySkillId(String secondarySkillId) {
        this.secondarySkillId = secondarySkillId;
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

    public String getSpecialties() {
        return specialties;
    }

    public void setSpecialties(String specialties) {
        this.specialties = specialties;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTearsheetsID() {
        return tearsheetsID;
    }

    public void setTearsheetsID(String tearsheetsID) {
        this.tearsheetsID = tearsheetsID;
    }

    public String getTimeZoneOffsetEST() {
        return timeZoneOffsetEST;
    }

    public void setTimeZoneOffsetEST(String timeZoneOffsetEST) {
        this.timeZoneOffsetEST = timeZoneOffsetEST;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getWillRelocate() {
        return willRelocate;
    }

    public void setWillRelocate(String willRelocate) {
        this.willRelocate = willRelocate;
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

    public String getCustomText2() {
        return customText2;
    }

    public void setCustomText2(String customText2) {
        this.customText2 = customText2;
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

    public String getCustomText20() {
        return customText20;
    }

    public void setCustomText20(String customText20) {
        this.customText20 = customText20;
    }

    public String getLead_address1() {
        return address1;
    }

    public void setLead_address1(String address1) {
        this.address1 = address1;
    }

    public String getLead_address2() {
        return address2;
    }

    public void setLead_address2(String address2) {
        this.address2 = address2;
    }

    public String getLead_city() {
        return city;
    }

    public void setLead_city(String city) {
        this.city = city;
    }

    public String getLead_countryID() {
        return countryID;
    }

    public void setLead_countryID(String countryID) {
        this.countryID = countryID;
    }

    public String getLead_state() {
        return state;
    }

    public void setLead_state(String state) {
        this.state = state;
    }

    public String getLead_zip() {
        return zip;
    }

    public void setLead_zip(String zip) {
        this.zip = zip;
    }

    public String getLead_assignedToUserID() {
        return assignedToUserID;
    }

    public void setLead_assignedToUserID(String assignedToUserID) {
        this.assignedToUserID = assignedToUserID;
    }

    public String getLead_businessSectorID() {
        return businessSectorID;
    }

    public void setLead_businessSectorID(String businessSectorID) {
        this.businessSectorID = businessSectorID;
    }

    public String getLead_campaignSource() {
        return campaignSource;
    }

    public void setLead_campaignSource(String campaignSource) {
        this.campaignSource = campaignSource;
    }

    public String getLead_candidateID() {
        return candidateID;
    }

    public void setLead_candidateID(String candidateID) {
        this.candidateID = candidateID;
    }

    public String getLead_categoryID() {
        return categoryID;
    }

    public void setLead_categoryID(String categoryID) {
        this.categoryID = categoryID;
    }

    public String getLead_clientContactID() {
        return clientContactID;
    }

    public void setLead_clientContactID(String clientContactID) {
        this.clientContactID = clientContactID;
    }

    public String getLead_clientCorporationID() {
        return clientCorporationID;
    }

    public void setLead_clientCorporationID(String clientCorporationID) {
        this.clientCorporationID = clientCorporationID;
    }

    public String getLead_comments() {
        return comments;
    }

    public void setLead_comments(String comments) {
        this.comments = comments;
    }

    public String getLead_companyName() {
        return companyName;
    }

    public void setLead_companyName(String companyName) {
        this.companyName = companyName;
    }

    public String getLead_companyURL() {
        return companyURL;
    }

    public void setLead_companyURL(String companyURL) {
        this.companyURL = companyURL;
    }

    public String getLead_conversionSource() {
        return conversionSource;
    }

    public void setLead_conversionSource(String conversionSource) {
        this.conversionSource = conversionSource;
    }

    public String getLead_dateAdded() {
        return dateAdded;
    }

    public void setLead_dateAdded(String dateAdded) {
        this.dateAdded = dateAdded;
    }

    public String getLead_dateLastComment() {
        return dateLastComment;
    }

    public void setLead_dateLastComment(String dateLastComment) {
        this.dateLastComment = dateLastComment;
    }

    public String getLead_dateLastModified() {
        return dateLastModified;
    }

    public void setLead_dateLastModified(String dateLastModified) {
        this.dateLastModified = dateLastModified;
    }

    public String getLead_dateLastVisited() {
        return dateLastVisited;
    }

    public void setLead_dateLastVisited(String dateLastVisited) {
        this.dateLastVisited = dateLastVisited;
    }

    public String getLead_description() {
        return description;
    }

    public void setLead_description(String description) {
        this.description = description;
    }

    public String getLead_distributionListID() {
        return distributionListID;
    }

    public void setLead_distributionListID(String distributionListID) {
        this.distributionListID = distributionListID;
    }

    public String getLead_division() {
        return division;
    }

    public void setLead_division(String division) {
        this.division = division;
    }

    public String getLead_educationDegree() {
        return educationDegree;
    }

    public void setLead_educationDegree(String educationDegree) {
        this.educationDegree = educationDegree;
    }

    public String getLead_email() {
        return email;
    }

    public void setLead_email(String email) {
        this.email = email;
    }

    public String getLead_email2() {
        return email2;
    }

    public void setLead_email2(String email2) {
        this.email2 = email2;
    }

    public String getLead_fax() {
        return fax;
    }

    public void setLead_fax(String fax) {
        this.fax = fax;
    }

    public String getLead_email3() {
        return email3;
    }

    public void setLead_email3(String email3) {
        this.email3 = email3;
    }

    public String getLead_fax2() {
        return fax2;
    }

    public void setLead_fax2(String fax2) {
        this.fax2 = fax2;
    }

    public String getLead_fax3() {
        return fax3;
    }

    public void setLead_fax3(String fax3) {
        this.fax3 = fax3;
    }

    public String getLead_firstName() {
        return firstName;
    }

    public void setLead_firstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLead_isDayLightSavingsTime() {
        return isDayLightSavingsTime;
    }

    public void setLead_isDayLightSavingsTime(String isDayLightSavingsTime) {
        this.isDayLightSavingsTime = isDayLightSavingsTime;
    }

    public String getLead_isDeleted() {
        return isDeleted;
    }

    public void setLead_isDeleted(String isDeleted) {
        this.isDeleted = isDeleted;
    }

    public String getLead_lastName() {
        return lastName;
    }

    public void setLead_lastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLead_leadSource() {
        return leadSource;
    }

    public void setLead_leadSource(String leadSource) {
        this.leadSource = leadSource;
    }

    public String getLead_massMailOptOut() {
        return massMailOptOut;
    }

    public void setLead_massMailOptOut(String massMailOptOut) {
        this.massMailOptOut = massMailOptOut;
    }

    public String getLead_middleName() {
        return middleName;
    }

    public void setLead_middleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLead_mobile() {
        return mobile;
    }

    public void setLead_mobile(String mobile) {
        this.mobile = mobile;
    }

    public String getLead_name() {
        return name;
    }

    public void setLead_name(String name) {
        this.name = name;
    }

    public String getLead_namePrefix() {
        return namePrefix;
    }

    public void setLead_namePrefix(String namePrefix) {
        this.namePrefix = namePrefix;
    }

    public String getLead_nameSuffix() {
        return nameSuffix;
    }

    public void setLead_nameSuffix(String nameSuffix) {
        this.nameSuffix = nameSuffix;
    }

    public String getLead_nickName() {
        return nickName;
    }

    public void setLead_nickName(String nickName) {
        this.nickName = nickName;
    }

    public String getLead_numEmployees() {
        return numEmployees;
    }

    public void setLead_numEmployees(String numEmployees) {
        this.numEmployees = numEmployees;
    }

    public String getLead_occupation() {
        return occupation;
    }

    public void setLead_occupation(String occupation) {
        this.occupation = occupation;
    }

    public String getLead_userID() {
        return userID;
    }

    public void setLead_userID(String userID) {
        this.userID = userID;
    }

    public String getLead_ownerCorporationID() {
        return ownerCorporationID;
    }

    public void setLead_ownerCorporationID(String ownerCorporationID) {
        this.ownerCorporationID = ownerCorporationID;
    }

    public String getLead_pager() {
        return pager;
    }

    public void setLead_pager(String pager) {
        this.pager = pager;
    }

    public String getLead_phone() {
        return phone;
    }

    public void setLead_phone(String phone) {
        this.phone = phone;
    }

    public String getLead_phone2() {
        return phone2;
    }

    public void setLead_phone2(String phone2) {
        this.phone2 = phone2;
    }

    public String getLead_phone3() {
        return phone3;
    }

    public void setLead_phone3(String phone3) {
        this.phone3 = phone3;
    }

    public String getLead_preferredContact() {
        return preferredContact;
    }

    public void setLead_preferredContact(String preferredContact) {
        this.preferredContact = preferredContact;
    }

    public String getLead_primarySkillID() {
        return primarySkillID;
    }

    public void setLead_primarySkillID(String primarySkillID) {
        this.primarySkillID = primarySkillID;
    }

    public String getLead_priority() {
        return priority;
    }

    public void setLead_priority(String priority) {
        this.priority = priority;
    }

    public String getLead_recruiterUserID() {
        return recruiterUserID;
    }

    public void setLead_recruiterUserID(String recruiterUserID) {
        this.recruiterUserID = recruiterUserID;
    }

    public String getLead_referredByPersonID() {
        return referredByPersonID;
    }

    public void setLead_referredByPersonID(String referredByPersonID) {
        this.referredByPersonID = referredByPersonID;
    }

    public String getLead_reportToPersonID() {
        return reportToPersonID;
    }

    public void setLead_reportToPersonID(String reportToPersonID) {
        this.reportToPersonID = reportToPersonID;
    }

    public String getLead_role() {
        return role;
    }

    public void setLead_role(String role) {
        this.role = role;
    }

    public String getLead_salary() {
        return salary;
    }

    public void setLead_salary(String salary) {
        this.salary = salary;
    }

    public String getLead_salaryLow() {
        return salaryLow;
    }

    public void setLead_salaryLow(String salaryLow) {
        this.salaryLow = salaryLow;
    }

    public String getLead_secondarySkillId() {
        return secondarySkillId;
    }

    public void setLead_secondarySkillId(String secondarySkillId) {
        this.secondarySkillId = secondarySkillId;
    }

    public String getLead_skillSet() {
        return skillSet;
    }

    public void setLead_skillSet(String skillSet) {
        this.skillSet = skillSet;
    }

    public String getLead_smsOptIn() {
        return smsOptIn;
    }

    public void setLead_smsOptIn(String smsOptIn) {
        this.smsOptIn = smsOptIn;
    }

    public String getLead_source() {
        return source;
    }

    public void setLead_source(String source) {
        this.source = source;
    }

    public String getLead_specialties() {
        return specialties;
    }

    public void setLead_specialties(String specialties) {
        this.specialties = specialties;
    }

    public String getLead_status() {
        return status;
    }

    public void setLead_status(String status) {
        this.status = status;
    }

    public String getLead_tearsheetsID() {
        return tearsheetsID;
    }

    public void setLead_tearsheetsID(String tearsheetsID) {
        this.tearsheetsID = tearsheetsID;
    }

    public String getLead_timeZoneOffsetEST() {
        return timeZoneOffsetEST;
    }

    public void setLead_timeZoneOffsetEST(String timeZoneOffsetEST) {
        this.timeZoneOffsetEST = timeZoneOffsetEST;
    }

    public String getLead_type() {
        return type;
    }

    public void setLead_type(String type) {
        this.type = type;
    }

    public String getLead_willRelocate() {
        return willRelocate;
    }

    public void setLead_willRelocate(String willRelocate) {
        this.willRelocate = willRelocate;
    }

    public String getLead_customTextBlock1() {
        return customTextBlock1;
    }

    public void setLead_customTextBlock1(String customTextBlock1) {
        this.customTextBlock1 = customTextBlock1;
    }

    public String getLead_customTextBlock2() {
        return customTextBlock2;
    }

    public void setLead_customTextBlock2(String customTextBlock2) {
        this.customTextBlock2 = customTextBlock2;
    }

    public String getLead_customTextBlock3() {
        return customTextBlock3;
    }

    public void setLead_customTextBlock3(String customTextBlock3) {
        this.customTextBlock3 = customTextBlock3;
    }

    public String getLead_customTextBlock4() {
        return customTextBlock4;
    }

    public void setLead_customTextBlock4(String customTextBlock4) {
        this.customTextBlock4 = customTextBlock4;
    }

    public String getLead_customTextBlock5() {
        return customTextBlock5;
    }

    public void setLead_customTextBlock5(String customTextBlock5) {
        this.customTextBlock5 = customTextBlock5;
    }

    public String getLead_customDate1() {
        return customDate1;
    }

    public void setLead_customDate1(String customDate1) {
        this.customDate1 = customDate1;
    }

    public String getLead_customDate2() {
        return customDate2;
    }

    public void setLead_customDate2(String customDate2) {
        this.customDate2 = customDate2;
    }

    public String getLead_customDate3() {
        return customDate3;
    }

    public void setLead_customDate3(String customDate3) {
        this.customDate3 = customDate3;
    }

    public String getLead_customFloat1() {
        return customFloat1;
    }

    public void setLead_customFloat1(String customFloat1) {
        this.customFloat1 = customFloat1;
    }

    public String getLead_customFloat2() {
        return customFloat2;
    }

    public void setLead_customFloat2(String customFloat2) {
        this.customFloat2 = customFloat2;
    }

    public String getLead_customFloat3() {
        return customFloat3;
    }

    public void setLead_customFloat3(String customFloat3) {
        this.customFloat3 = customFloat3;
    }

    public String getLead_customInt1() {
        return customInt1;
    }

    public void setLead_customInt1(String customInt1) {
        this.customInt1 = customInt1;
    }

    public String getLead_customInt2() {
        return customInt2;
    }

    public void setLead_customInt2(String customInt2) {
        this.customInt2 = customInt2;
    }

    public String getLead_customInt3() {
        return customInt3;
    }

    public void setLead_customInt3(String customInt3) {
        this.customInt3 = customInt3;
    }

    public String getLead_customText1() {
        return customText1;
    }

    public void setLead_customText1(String customText1) {
        this.customText1 = customText1;
    }

    public String getLead_customText2() {
        return customText2;
    }

    public void setLead_customText2(String customText2) {
        this.customText2 = customText2;
    }

    public String getLead_customText3() {
        return customText3;
    }

    public void setLead_customText3(String customText3) {
        this.customText3 = customText3;
    }

    public String getLead_customText4() {
        return customText4;
    }

    public void setLead_customText4(String customText4) {
        this.customText4 = customText4;
    }

    public String getLead_customText5() {
        return customText5;
    }

    public void setLead_customText5(String customText5) {
        this.customText5 = customText5;
    }

    public String getLead_customText6() {
        return customText6;
    }

    public void setLead_customText6(String customText6) {
        this.customText6 = customText6;
    }

    public String getLead_customText7() {
        return customText7;
    }

    public void setLead_customText7(String customText7) {
        this.customText7 = customText7;
    }

    public String getLead_customText8() {
        return customText8;
    }

    public void setLead_customText8(String customText8) {
        this.customText8 = customText8;
    }

    public String getLead_customText9() {
        return customText9;
    }

    public void setLead_customText9(String customText9) {
        this.customText9 = customText9;
    }

    public String getLead_customText10() {
        return customText10;
    }

    public void setLead_customText10(String customText10) {
        this.customText10 = customText10;
    }

    public String getLead_customText11() {
        return customText11;
    }

    public void setLead_customText11(String customText11) {
        this.customText11 = customText11;
    }

    public String getLead_customText12() {
        return customText12;
    }

    public void setLead_customText12(String customText12) {
        this.customText12 = customText12;
    }

    public String getLead_customText13() {
        return customText13;
    }

    public void setLead_customText13(String customText13) {
        this.customText13 = customText13;
    }

    public String getLead_customText14() {
        return customText14;
    }

    public void setLead_customText14(String customText14) {
        this.customText14 = customText14;
    }

    public String getLead_customText15() {
        return customText15;
    }

    public void setLead_customText15(String customText15) {
        this.customText15 = customText15;
    }

    public String getLead_customText16() {
        return customText16;
    }

    public void setLead_customText16(String customText16) {
        this.customText16 = customText16;
    }

    public String getLead_customText17() {
        return customText17;
    }

    public void setLead_customText17(String customText17) {
        this.customText17 = customText17;
    }

    public String getLead_customText18() {
        return customText18;
    }

    public void setLead_customText18(String customText18) {
        this.customText18 = customText18;
    }

    public String getLead_customText19() {
        return customText19;
    }

    public void setLead_customText19(String customText19) {
        this.customText19 = customText19;
    }

    public String getLead_customText20() {
        return customText20;
    }

    public void setLead_customText20(String customText20) {
        this.customText20 = customText20;
    }

    @Override
    public Lead instantiateEntity() {

        Lead lead = new Lead();

        lead.setId(Utility.parseInteger(userID));

        Address address = new Address();
        address.setAddress1(address1);
        address.setAddress2(address2);
        address.setCity(city);
        address.setState(state);
        address.setCountryID(Utility.parseInteger(countryID));
        address.setZip(zip);

        lead.setAddress(address);

        OneToMany<CorporateUser> assignedTo = new OneToMany<>();
        assignedTo.setData(Lists.newArrayList(new CorporateUser(Utility.parseInteger(assignedToUserID))));
        lead.setAssignedTo(assignedTo);

        lead.setCategory(new Category(Utility.parseInteger(categoryID)));
        lead.setClientCorporation(new ClientCorporation(Utility.parseInteger(clientCorporationID)));

        OneToMany<ClientContact> clientContacts = new OneToMany<>();
        clientContacts.setData(Lists.newArrayList(new ClientContact(Utility.parseInteger(clientContactID))));
        lead.setClientContacts(clientContacts);

        lead.setComments(comments);
        lead.setCompanyName(companyName);
        lead.setCompanyURL(companyURL);
        lead.setConversionSource(conversionSource);
        lead.setDateAdded(stringToDateTime(dateAdded));
        lead.setDateLastComment(stringToDateTime(dateLastComment));
        lead.setDateLastModified(stringToDateTime(dateLastModified));
        lead.setDateLastVisited(stringToDateTime(dateLastVisited));
        lead.setDescription(description);

        OneToMany<Integer> distLists = new OneToMany<>();
        distLists.setData(Lists.newArrayList(Utility.parseInteger(distributionListID)));
        lead.setDistributionLists(distLists);

        lead.setDivision(division);
        lead.setEducationDegree(educationDegree);
        lead.setEmail(email);
        lead.setEmail2(email2);
        lead.setEmail3(email3);
        lead.setFax(fax);
        lead.setFax2(fax2);
        lead.setFax3(fax3);
        lead.setFirstName(firstName);
        lead.setIsDayLightSavingsTime(Utility.parseBoolean(isDayLightSavingsTime));
        lead.setIsDeleted(Utility.parseBoolean(isDeleted));
        lead.setLastName(lastName);
        lead.setLeadSource(leadSource);
        lead.setMassMailOptOut(Utility.parseBoolean(massMailOptOut));
        lead.setMiddleName(middleName);
        lead.setMobile(mobile);
        lead.setName(name);
        lead.setNamePrefix(namePrefix);
        lead.setNameSuffix(nameSuffix);
        lead.setNickName(nickName);
        lead.setNumEmployees(Utility.parseInteger(numEmployees));
        lead.setOccupation(occupation);
        lead.setOwner(new CorporateUser(Utility.parseInteger(getFirstIntegerInCommaSeparatedList(recruiterUserID))));
        lead.setOwnerCorporation(new ClientCorporation(Utility.parseInteger(ownerCorporationID)));
        lead.setPager(pager);
        lead.setPhone(phone);
        lead.setPhone2(phone2);
        lead.setPhone3(phone3);
        lead.setPreferredContact(preferredContact);

        OneToMany<Skill> primarySkills = new OneToMany<>();
        Skill skill = new Skill();
        skill.setId(Utility.parseInteger(primarySkillID));
        primarySkills.setData(Lists.newArrayList(skill));
        lead.setPrimarySkills(primarySkills);

        lead.setPriority(priority);
        lead.setReferredByPerson(new Person(Utility.parseInteger(referredByPersonID)));
        lead.setReportToPerson(new Person(Utility.parseInteger(reportToPersonID)));
        lead.setRole(role);
        lead.setSalary(Utility.parseBigDecimal(salary));
        lead.setSalaryLow(Utility.parseBigDecimal(salaryLow));

        OneToMany<Skill> secondarySkills = new OneToMany<>();
        skill = new Skill();
        skill.setId(Utility.parseInteger(primarySkillID));
        secondarySkills.setData(Lists.newArrayList(skill));
        lead.setSecondarySkills(secondarySkills);

        lead.setSkillSet(skillSet);
        lead.setSmsOptIn(Utility.parseBoolean(smsOptIn));
        lead.setSource(source);
        lead.setStatus(status);

        OneToMany<Integer> tearsheets = new OneToMany<>();
        tearsheets.setData(Lists.newArrayList(Utility.parseInteger(tearsheetsID)));
        lead.setTearsheets(tearsheets);

        lead.setTimeZoneOffsetEST(Utility.parseInteger(timeZoneOffsetEST));

        lead.setCustomTextBlock1(customTextBlock1);
        lead.setCustomTextBlock2(customTextBlock2);
        lead.setCustomTextBlock3(customTextBlock3);
        lead.setCustomTextBlock4(customTextBlock4);
        lead.setCustomTextBlock5(customTextBlock5);
        lead.setCustomDate1(stringToDateTime(customDate1));
        lead.setCustomDate2(stringToDateTime(customDate2));
        lead.setCustomDate3(stringToDateTime(customDate3));
        lead.setCustomFloat1(Utility.parseBigDecimal(customFloat1));
        lead.setCustomFloat2(Utility.parseBigDecimal(customFloat2));
        lead.setCustomFloat3(Utility.parseBigDecimal(customFloat3));
        lead.setCustomInt1(Utility.parseInteger(customInt1));
        lead.setCustomInt2(Utility.parseInteger(customInt2));
        lead.setCustomInt3(Utility.parseInteger(customInt3));
        lead.setCustomText1(customText1);
        lead.setCustomText2(customText2);
        lead.setCustomText3(customText3);
        lead.setCustomText4(customText4);
        lead.setCustomText5(customText5);
        lead.setCustomText6(customText6);
        lead.setCustomText7(customText7);
        lead.setCustomText8(customText8);
        lead.setCustomText9(customText9);
        lead.setCustomText10(customText10);
        lead.setCustomText11(customText11);
        lead.setCustomText12(customText12);
        lead.setCustomText13(customText13);
        lead.setCustomText14(customText14);
        lead.setCustomText15(customText15);
        lead.setCustomText16(customText16);
        lead.setCustomText17(customText17);
        lead.setCustomText18(customText18);
        lead.setCustomText19(customText19);
        lead.setCustomText20(customText20);

        return lead;

    }

    public static FormLeadDto instantiateFromLead(Lead lead){

        FormLeadDto formLeadDto = new FormLeadDto();

        formLeadDto.setUserID(makeString(lead.getId()));

        Address address = lead.getAddress();
        if(address != null){
            formLeadDto.setAddress1(address.getAddress1());
            formLeadDto.setAddress2(address.getAddress2());
            formLeadDto.setCity(address.getCity());
            formLeadDto.setState(address.getState());
            formLeadDto.setZip(address.getZip());
            formLeadDto.setCountryID(makeString(address.getCountryID()));
        }

        formLeadDto.setAssignedToUserID(makeString(lead.getAssignedTo() != null ? (lead.getAssignedTo().getData() != null && lead.getAssignedTo().getData().size() > 0 ? (lead.getAssignedTo().getData().get(0) != null ? lead.getAssignedTo().getData().get(0).getId() : null) : null) : null));
        formLeadDto.setCategoryID(makeString(lead.getCategory().getId()));
        formLeadDto.setClientCorporationID(makeString(lead.getClientCorporation() != null ? lead.getClientCorporation().getId() : null));
        formLeadDto.setClientContactID(makeString(lead.getClientContacts() != null ? (lead.getClientContacts().getData() != null && lead.getClientContacts().getData().size() > 0? (lead.getClientContacts().getData().get(0) != null ? lead.getClientContacts().getData().get(0).getId() : null) : null) : null));
        formLeadDto.setComments(lead.getComments());
        formLeadDto.setCompanyName(lead.getCompanyName());
        formLeadDto.setCompanyURL(lead.getCompanyURL());
        formLeadDto.setConversionSource(lead.getConversionSource());
        formLeadDto.setDateAdded(makeString(lead.getDateAdded()));
        formLeadDto.setDateLastComment(makeString(lead.getDateLastComment()));
        formLeadDto.setDateLastModified(makeString(lead.getDateLastModified()));
        formLeadDto.setDateLastVisited(makeString(lead.getDateLastVisited()));
        formLeadDto.setDescription(lead.getDescription());
        formLeadDto.setDistributionListID(makeString(lead.getDistributionLists() != null ? (lead.getDistributionLists().getData() != null && lead.getDistributionLists().getData().size() > 0 ?  lead.getDistributionLists().getData().get(0) : null) : null));
        formLeadDto.setDivision(lead.getDivision());
        formLeadDto.setEducationDegree(lead.getEducationDegree());
        formLeadDto.setEmail(lead.getEmail());
        formLeadDto.setEmail2(lead.getEmail2());
        formLeadDto.setEmail3(lead.getEmail3());
        formLeadDto.setFax(lead.getFax());
        formLeadDto.setFax2(lead.getFax2());
        formLeadDto.setFax3(lead.getFax3());
        formLeadDto.setFirstName(lead.getFirstName());
        formLeadDto.setIsDayLightSavingsTime(makeString(lead.getIsDayLightSavingsTime()));
        formLeadDto.setIsDeleted(makeString(lead.getIsDeleted()));
        formLeadDto.setLastName(makeString(lead.getLastName()));
        formLeadDto.setLeadSource(lead.getLeadSource());
        formLeadDto.setMassMailOptOut(makeString(lead.getMassMailOptOut()));
        formLeadDto.setMiddleName(lead.getMiddleName());
        formLeadDto.setMobile(lead.getMobile());
        formLeadDto.setName(lead.getName());
        formLeadDto.setNamePrefix(lead.getNamePrefix());
        formLeadDto.setNameSuffix(lead.getNameSuffix());
        formLeadDto.setNickName(lead.getNickName());
        formLeadDto.setNumEmployees(makeString(lead.getNumEmployees()));
        formLeadDto.setOccupation(lead.getOccupation());
        formLeadDto.setUserID(lead.getOwner() != null ? makeString(lead.getOwner().getId()) : null);
        formLeadDto.setOwnerCorporationID(lead.getOwnerCorporation() != null ? makeString(lead.getOwnerCorporation().getId()) : null);
        formLeadDto.setPager(lead.getPager());
        formLeadDto.setPhone(lead.getPhone());
        formLeadDto.setPhone2(lead.getPhone2());
        formLeadDto.setPhone3(lead.getPhone3());
        formLeadDto.setPreferredContact(lead.getPreferredContact());
        formLeadDto.setPrimarySkillID(makeString(lead.getPrimarySkills() != null ? (lead.getPrimarySkills().getData() != null && lead.getPrimarySkills().getData().size() > 0 ? (lead.getPrimarySkills().getData().get(0) != null ? lead.getPrimarySkills().getData().get(0).getId() : null) : null) : null));
        formLeadDto.setPriority(lead.getPriority());
        formLeadDto.setReferredByPersonID(lead.getReferredByPerson() != null ? makeString(lead.getReferredByPerson().getId()) : null);
        formLeadDto.setReportToPersonID(lead.getReportToPerson() != null ? makeString(lead.getReportToPerson().getId()) : null);
        formLeadDto.setRole(lead.getRole());
        formLeadDto.setSalary(makeString(lead.getSalary()));
        formLeadDto.setSalaryLow(makeString(lead.getSalaryLow()));
        formLeadDto.setSecondarySkillId(makeString(lead.getSecondarySkills() != null ? (lead.getSecondarySkills().getData() != null && lead.getSecondarySkills().getData().size() > 0 ? (lead.getSecondarySkills().getData().get(0) != null ? lead.getSecondarySkills().getData().get(0).getId() : null) : null) : null));
        formLeadDto.setSkillSet(lead.getSkillSet());
        formLeadDto.setSmsOptIn(makeString(lead.getSmsOptIn()));
        formLeadDto.setSource(lead.getSource());
        formLeadDto.setStatus(lead.getStatus());
        formLeadDto.setTearsheetsID(makeString(lead.getTearsheets() != null ? (lead.getTearsheets().getData() != null && lead.getTearsheets().getData().size() > 0 ?  lead.getTearsheets().getData().get(0) : null) : null));
        formLeadDto.setTimeZoneOffsetEST(makeString(lead.getTimeZoneOffsetEST()));

        return formLeadDto;

    }

    @Override
    public String toString() {
        return new StringBuilder("FormLeadDto {")
                .append("\n\t\"address1\": ")
                .append("'")
                .append(address1).append('\'')
                .append(",\n\t\"address2\": ")
                .append("'")
                .append(address2).append('\'')
                .append(",\n\t\"city\": ")
                .append("'")
                .append(city).append('\'')
                .append(",\n\t\"countryID\": ")
                .append("'")
                .append(countryID).append('\'')
                .append(",\n\t\"state\": ")
                .append("'")
                .append(state).append('\'')
                .append(",\n\t\"zip\": ")
                .append("'")
                .append(zip).append('\'')
                .append(",\n\t\"assignedToUserID\": ")
                .append("'")
                .append(assignedToUserID).append('\'')
                .append(",\n\t\"businessSectorID\": ")
                .append("'")
                .append(businessSectorID).append('\'')
                .append(",\n\t\"campaignSource\": ")
                .append("'")
                .append(campaignSource).append('\'')
                .append(",\n\t\"candidateID\": ")
                .append("'")
                .append(candidateID).append('\'')
                .append(",\n\t\"categoryID\": ")
                .append("'")
                .append(categoryID).append('\'')
                .append(",\n\t\"clientContactID\": ")
                .append("'")
                .append(clientContactID).append('\'')
                .append(",\n\t\"clientCorporationID\": ")
                .append("'")
                .append(clientCorporationID).append('\'')
                .append(",\n\t\"comments\": ")
                .append("'")
                .append(comments).append('\'')
                .append(",\n\t\"companyName\": ")
                .append("'")
                .append(companyName).append('\'')
                .append(",\n\t\"companyURL\": ")
                .append("'")
                .append(companyURL).append('\'')
                .append(",\n\t\"conversionSource\": ")
                .append("'")
                .append(conversionSource).append('\'')
                .append(",\n\t\"dateAdded\": ")
                .append("'")
                .append(dateAdded).append('\'')
                .append(",\n\t\"dateLastComment\": ")
                .append("'")
                .append(dateLastComment).append('\'')
                .append(",\n\t\"dateLastModified\": ")
                .append("'")
                .append(dateLastModified).append('\'')
                .append(",\n\t\"dateLastVisited\": ")
                .append("'")
                .append(dateLastVisited).append('\'')
                .append(",\n\t\"description\": ")
                .append("'")
                .append(description).append('\'')
                .append(",\n\t\"distributionListID\": ")
                .append("'")
                .append(distributionListID).append('\'')
                .append(",\n\t\"division\": ")
                .append("'")
                .append(division).append('\'')
                .append(",\n\t\"educationDegree\": ")
                .append("'")
                .append(educationDegree).append('\'')
                .append(",\n\t\"email\": ")
                .append("'")
                .append(email).append('\'')
                .append(",\n\t\"email2\": ")
                .append("'")
                .append(email2).append('\'')
                .append(",\n\t\"email3\": ")
                .append("'")
                .append(email3).append('\'')
                .append(",\n\t\"fax\": ")
                .append("'")
                .append(fax).append('\'')
                .append(",\n\t\"fax2\": ")
                .append("'")
                .append(fax2).append('\'')
                .append(",\n\t\"fax3\": ")
                .append("'")
                .append(fax3).append('\'')
                .append(",\n\t\"firstName\": ")
                .append("'")
                .append(firstName).append('\'')
                .append(",\n\t\"isDayLightSavingsTime\": ")
                .append("'")
                .append(isDayLightSavingsTime).append('\'')
                .append(",\n\t\"isDeleted\": ")
                .append("'")
                .append(isDeleted).append('\'')
                .append(",\n\t\"lastName\": ")
                .append("'")
                .append(lastName).append('\'')
                .append(",\n\t\"leadSource\": ")
                .append("'")
                .append(leadSource).append('\'')
                .append(",\n\t\"massMailOptOut\": ")
                .append("'")
                .append(massMailOptOut).append('\'')
                .append(",\n\t\"middleName\": ")
                .append("'")
                .append(middleName).append('\'')
                .append(",\n\t\"mobile\": ")
                .append("'")
                .append(mobile).append('\'')
                .append(",\n\t\"name\": ")
                .append("'")
                .append(name).append('\'')
                .append(",\n\t\"namePrefix\": ")
                .append("'")
                .append(namePrefix).append('\'')
                .append(",\n\t\"nameSuffix\": ")
                .append("'")
                .append(nameSuffix).append('\'')
                .append(",\n\t\"nickName\": ")
                .append("'")
                .append(nickName).append('\'')
                .append(",\n\t\"numEmployees\": ")
                .append("'")
                .append(numEmployees).append('\'')
                .append(",\n\t\"occupation\": ")
                .append("'")
                .append(occupation).append('\'')
                .append(",\n\t\"userID\": ")
                .append("'")
                .append(userID).append('\'')
                .append(",\n\t\"ownerCorporationID\": ")
                .append("'")
                .append(ownerCorporationID).append('\'')
                .append(",\n\t\"pager\": ")
                .append("'")
                .append(pager).append('\'')
                .append(",\n\t\"phone\": ")
                .append("'")
                .append(phone).append('\'')
                .append(",\n\t\"phone2\": ")
                .append("'")
                .append(phone2).append('\'')
                .append(",\n\t\"phone3\": ")
                .append("'")
                .append(phone3).append('\'')
                .append(",\n\t\"preferredContact\": ")
                .append("'")
                .append(preferredContact).append('\'')
                .append(",\n\t\"primarySkillID\": ")
                .append("'")
                .append(primarySkillID).append('\'')
                .append(",\n\t\"priority\": ")
                .append("'")
                .append(priority).append('\'')
                .append(",\n\t\"recruiterUserID\": ")
                .append("'")
                .append(recruiterUserID).append('\'')
                .append(",\n\t\"referredByPersonID\": ")
                .append("'")
                .append(referredByPersonID).append('\'')
                .append(",\n\t\"reportToPersonID\": ")
                .append("'")
                .append(reportToPersonID).append('\'')
                .append(",\n\t\"role\": ")
                .append("'")
                .append(role).append('\'')
                .append(",\n\t\"salary\": ")
                .append("'")
                .append(salary).append('\'')
                .append(",\n\t\"salaryLow\": ")
                .append("'")
                .append(salaryLow).append('\'')
                .append(",\n\t\"secondarySkillId\": ")
                .append("'")
                .append(secondarySkillId).append('\'')
                .append(",\n\t\"skillSet\": ")
                .append("'")
                .append(skillSet).append('\'')
                .append(",\n\t\"smsOptIn\": ")
                .append("'")
                .append(smsOptIn).append('\'')
                .append(",\n\t\"source\": ")
                .append("'")
                .append(source).append('\'')
                .append(",\n\t\"specialties\": ")
                .append("'")
                .append(specialties).append('\'')
                .append(",\n\t\"status\": ")
                .append("'")
                .append(status).append('\'')
                .append(",\n\t\"tearsheetsID\": ")
                .append("'")
                .append(tearsheetsID).append('\'')
                .append(",\n\t\"timeZoneOffsetEST\": ")
                .append("'")
                .append(timeZoneOffsetEST).append('\'')
                .append(",\n\t\"type\": ")
                .append("'")
                .append(type).append('\'')
                .append(",\n\t\"willRelocate\": ")
                .append("'")
                .append(willRelocate).append('\'')
                .append(",\n\t\"customTextBlock1\": ")
                .append("'")
                .append(customTextBlock1).append('\'')
                .append(",\n\t\"customTextBlock2\": ")
                .append("'")
                .append(customTextBlock2).append('\'')
                .append(",\n\t\"customTextBlock3\": ")
                .append("'")
                .append(customTextBlock3).append('\'')
                .append(",\n\t\"customTextBlock4\": ")
                .append("'")
                .append(customTextBlock4).append('\'')
                .append(",\n\t\"customTextBlock5\": ")
                .append("'")
                .append(customTextBlock5).append('\'')
                .append(",\n\t\"customDate1\": ")
                .append("'")
                .append(customDate1).append('\'')
                .append(",\n\t\"customDate2\": ")
                .append("'")
                .append(customDate2).append('\'')
                .append(",\n\t\"customDate3\": ")
                .append("'")
                .append(customDate3).append('\'')
                .append(",\n\t\"customFloat1\": ")
                .append("'")
                .append(customFloat1).append('\'')
                .append(",\n\t\"customFloat2\": ")
                .append("'")
                .append(customFloat2).append('\'')
                .append(",\n\t\"customFloat3\": ")
                .append("'")
                .append(customFloat3).append('\'')
                .append(",\n\t\"customInt1\": ")
                .append("'")
                .append(customInt1).append('\'')
                .append(",\n\t\"customInt2\": ")
                .append("'")
                .append(customInt2).append('\'')
                .append(",\n\t\"customInt3\": ")
                .append("'")
                .append(customInt3).append('\'')
                .append(",\n\t\"customText1\": ")
                .append("'")
                .append(customText1).append('\'')
                .append(",\n\t\"customText2\": ")
                .append("'")
                .append(customText2).append('\'')
                .append(",\n\t\"customText3\": ")
                .append("'")
                .append(customText3).append('\'')
                .append(",\n\t\"customText4\": ")
                .append("'")
                .append(customText4).append('\'')
                .append(",\n\t\"customText5\": ")
                .append("'")
                .append(customText5).append('\'')
                .append(",\n\t\"customText6\": ")
                .append("'")
                .append(customText6).append('\'')
                .append(",\n\t\"customText7\": ")
                .append("'")
                .append(customText7).append('\'')
                .append(",\n\t\"customText8\": ")
                .append("'")
                .append(customText8).append('\'')
                .append(",\n\t\"customText9\": ")
                .append("'")
                .append(customText9).append('\'')
                .append(",\n\t\"customText10\": ")
                .append("'")
                .append(customText10).append('\'')
                .append(",\n\t\"customText11\": ")
                .append("'")
                .append(customText11).append('\'')
                .append(",\n\t\"customText12\": ")
                .append("'")
                .append(customText12).append('\'')
                .append(",\n\t\"customText13\": ")
                .append("'")
                .append(customText13).append('\'')
                .append(",\n\t\"customText14\": ")
                .append("'")
                .append(customText14).append('\'')
                .append(",\n\t\"customText15\": ")
                .append("'")
                .append(customText15).append('\'')
                .append(",\n\t\"customText16\": ")
                .append("'")
                .append(customText16).append('\'')
                .append(",\n\t\"customText17\": ")
                .append("'")
                .append(customText17).append('\'')
                .append(",\n\t\"customText18\": ")
                .append("'")
                .append(customText18).append('\'')
                .append(",\n\t\"customText19\": ")
                .append("'")
                .append(customText19).append('\'')
                .append(",\n\t\"customText20\": ")
                .append("'")
                .append(customText20).append('\'')
                .append('}')
                .toString();
    }
}
