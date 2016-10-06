package com.client.core.formtrigger.model.form.impl;

import com.bullhornsdk.data.model.entity.core.standard.*;
import com.bullhornsdk.data.model.entity.embedded.Address;
import com.bullhornsdk.data.model.entity.embedded.OneToMany;
import com.client.core.base.util.Utility;
import com.client.core.formtrigger.model.form.AbstractFormDto;
import com.google.common.collect.Lists;
import org.apache.log4j.Logger;

/**
 * Created by hiqbal on 12/22/2015.
 */
public class FormLeadDto extends AbstractFormDto<Lead> {

    public FormLeadDto() {
        super(Logger.getLogger(FormLeadDto.class));
    }

    private String leadID;
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

    public String getLeadID() {
        return leadID;
    }

    public void setLeadID(String leadID) {
        this.leadID = leadID;
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

    public String getLead_leadID() {
        return leadID;
    }

    public void setLead_leadID(String leadID) {
        this.leadID = leadID;
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

    @Override
    public Lead instantiateEntity() {

        Lead lead = new Lead();

        lead.setId(Utility.parseInteger(leadID));

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
        lead.setOwner(new CorporateUser(Utility.parseInteger(userID)));
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

        return lead;

    }

    public static FormLeadDto instantiateFromLead(Lead lead){

        FormLeadDto formLeadDto = new FormLeadDto();

        formLeadDto.setLeadID(makeString(lead.getId()));

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
        return "FormLeadDto{" +
                "leadID='" + leadID + '\'' +
                ", address1='" + address1 + '\'' +
                ", address2='" + address2 + '\'' +
                ", city='" + city + '\'' +
                ", countryID='" + countryID + '\'' +
                ", state='" + state + '\'' +
                ", zip='" + zip + '\'' +
                ", assignedToUserID='" + assignedToUserID + '\'' +
                ", businessSectorID='" + businessSectorID + '\'' +
                ", campaignSource='" + campaignSource + '\'' +
                ", candidateID='" + candidateID + '\'' +
                ", categoryID='" + categoryID + '\'' +
                ", clientContactID='" + clientContactID + '\'' +
                ", clientCorporationID='" + clientCorporationID + '\'' +
                ", comments='" + comments + '\'' +
                ", companyName='" + companyName + '\'' +
                ", companyURL='" + companyURL + '\'' +
                ", conversionSource='" + conversionSource + '\'' +
                ", dateAdded='" + dateAdded + '\'' +
                ", dateLastComment='" + dateLastComment + '\'' +
                ", dateLastModified='" + dateLastModified + '\'' +
                ", dateLastVisited='" + dateLastVisited + '\'' +
                ", description='" + description + '\'' +
                ", distributionListID='" + distributionListID + '\'' +
                ", division='" + division + '\'' +
                ", educationDegree='" + educationDegree + '\'' +
                ", email='" + email + '\'' +
                ", email2='" + email2 + '\'' +
                ", email3='" + email3 + '\'' +
                ", fax='" + fax + '\'' +
                ", fax2='" + fax2 + '\'' +
                ", fax3='" + fax3 + '\'' +
                ", firstName='" + firstName + '\'' +
                ", isDayLightSavingsTime='" + isDayLightSavingsTime + '\'' +
                ", isDeleted='" + isDeleted + '\'' +
                ", lastName='" + lastName + '\'' +
                ", leadSource='" + leadSource + '\'' +
                ", massMailOptOut='" + massMailOptOut + '\'' +
                ", middleName='" + middleName + '\'' +
                ", mobile='" + mobile + '\'' +
                ", name='" + name + '\'' +
                ", namePrefix='" + namePrefix + '\'' +
                ", nameSuffix='" + nameSuffix + '\'' +
                ", nickName='" + nickName + '\'' +
                ", numEmployees='" + numEmployees + '\'' +
                ", occupation='" + occupation + '\'' +
                ", userID='" + userID + '\'' +
                ", ownerCorporationID='" + ownerCorporationID + '\'' +
                ", pager='" + pager + '\'' +
                ", phone='" + phone + '\'' +
                ", phone2='" + phone2 + '\'' +
                ", phone3='" + phone3 + '\'' +
                ", preferredContact='" + preferredContact + '\'' +
                ", primarySkillID='" + primarySkillID + '\'' +
                ", priority='" + priority + '\'' +
                ", referredByPersonID='" + referredByPersonID + '\'' +
                ", reportToPersonID='" + reportToPersonID + '\'' +
                ", role='" + role + '\'' +
                ", salary='" + salary + '\'' +
                ", salaryLow='" + salaryLow + '\'' +
                ", secondarySkillId='" + secondarySkillId + '\'' +
                ", skillSet='" + skillSet + '\'' +
                ", smsOptIn='" + smsOptIn + '\'' +
                ", source='" + source + '\'' +
                ", specialties='" + specialties + '\'' +
                ", status='" + status + '\'' +
                ", tearsheetsID='" + tearsheetsID + '\'' +
                ", timeZoneOffsetEST='" + timeZoneOffsetEST + '\'' +
                ", type='" + type + '\'' +
                ", willRelocate='" + willRelocate + '\'' +
                '}';
    }
}
