package com.client.core.formtrigger.model.form.impl;

import org.apache.log4j.Logger;

import com.bullhornsdk.data.model.entity.core.standard.ClientContact;
import com.bullhornsdk.data.model.entity.core.standard.ClientCorporation;
import com.bullhornsdk.data.model.entity.core.standard.CorporateUser;
import com.bullhornsdk.data.model.entity.core.standard.Opportunity;
import com.bullhornsdk.data.model.entity.embedded.Address;
import com.client.core.base.util.Utility;
import com.client.core.formtrigger.model.form.AbstractFormDto;

public class FormOpportunityDto extends AbstractFormDto<Opportunity> {

	public FormOpportunityDto() {
		super(Logger.getLogger(FormOpportunityDto.class));
	}

	private Integer jobPostingID;
	private String actualCloseDate;
	private String address;
	private String assignedDate;
	private String assignments;
	private String assignments_display;
	private String benefits;
	private String billRateCategoryID;
	private String bonusPackage;
	private String branchCode;
	private String businessSectorID;
	private String campaignSource;
	private String categoryID;
	private String certifications;
	private String city;
	private Integer clientCorporationID;
	private String clientCorporationID_display;
	private Integer clientUserID;
	private String clientUserID_display;
	private String committed;
	private String correlatedCustomDate1;
	private String correlatedCustomDate2;
	private String correlatedCustomDate3;
	private String correlatedCustomFloat1;
	private String correlatedCustomFloat2;
	private String correlatedCustomFloat3;
	private String correlatedCustomInt1;
	private String correlatedCustomInt2;
	private String correlatedCustomInt3;
	private String correlatedCustomText1;
	private String correlatedCustomText10;
	private String correlatedCustomText2;
	private String correlatedCustomText3;
	private String correlatedCustomText4;
	private String correlatedCustomText5;
	private String correlatedCustomText6;
	private String correlatedCustomText7;
	private String correlatedCustomText8;
	private String correlatedCustomText9;
	private String correlatedCustomTextBlock1;
	private String correlatedCustomTextBlock2;
	private String correlatedCustomTextBlock3;
	private String costCenter;
	private String countryID;
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
	private String customText10;
	private String customText11;
	private String customText12;
	private String customText13;
	private String customText14;
	private String customText15;
	private String customText15_display;
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
	private String dealValue;
	private String degreeList;
	private String description;
	private String distributionListID;
	private String distributionListID_display;
	private String educationDegree;
	private String effectiveDate;
	private String estimatedDuration;
	private String estimatedEnd;
	private String estimatedHoursPerWeek;
	private String estimatedStart;
	private String expectedBillRate;
	private String expectedCloseDate;
	private String expectedFee;
	private String expectedPayRate;
	private String externalCategoryID;
	private String externalID;
	private String hoursOfOperation;
	private String leadUserID;
	private String leadUserID_display;
	private String notify;
	private String notify_display;
	private String numOpenings;
	private String onSite;
	private String opportunityMarkUp;
	private String optionsPackage;
	private String primaryBusinessSectorID;
	private String primaryCategoryID;
	private String priority;
	private String publicDescription;
	private String publishedZip;
	private String reasonClosed;
	private String reportTo;
	private String reportToUserID;
	private String responseUserID;
	private String salary;
	private String salaryUnit;
	private String skillID;
	private String skills;
	private String source;
	private String specialty_categoryID;
	private String state;
	private String status;
	private String taxRate;
	private String taxStatus;
	private String title;
	private String type;
	private Integer userID;
	private String userID_display;
	private String weightedDealValue;
	private String willRelocate;
	private String winProbabilityPercent;
	private String workersCompRateID;
	private String yearsRequired;
	private String zip;

	public String getActualCloseDate() {
		return actualCloseDate;
	}

	public void setActualCloseDate(String actualCloseDate) {
		this.actualCloseDate = actualCloseDate;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getAssignedDate() {
		return assignedDate;
	}

	public void setAssignedDate(String assignedDate) {
		this.assignedDate = assignedDate;
	}

	public String getAssignments() {
		return assignments;
	}

	public void setAssignments(String assignments) {
		this.assignments = assignments;
	}

	public String getAssignments_display() {
		return assignments_display;
	}

	public void setAssignments_display(String assignments_display) {
		this.assignments_display = assignments_display;
	}

	public String getBenefits() {
		return benefits;
	}

	public void setBenefits(String benefits) {
		this.benefits = benefits;
	}

	public String getBillRateCategoryID() {
		return billRateCategoryID;
	}

	public void setBillRateCategoryID(String billRateCategoryID) {
		this.billRateCategoryID = billRateCategoryID;
	}

	public String getBonusPackage() {
		return bonusPackage;
	}

	public void setBonusPackage(String bonusPackage) {
		this.bonusPackage = bonusPackage;
	}

	public String getBranchCode() {
		return branchCode;
	}

	public void setBranchCode(String branchCode) {
		this.branchCode = branchCode;
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

	public String getCategoryID() {
		return categoryID;
	}

	public void setCategoryID(String categoryID) {
		this.categoryID = categoryID;
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

	public Integer getClientUserID() {
		return clientUserID;
	}

	public void setClientUserID(Integer clientUserID) {
		this.clientUserID = clientUserID;
	}

	public String getClientUserID_display() {
		return clientUserID_display;
	}

	public void setClientUserID_display(String clientUserID_display) {
		this.clientUserID_display = clientUserID_display;
	}

	public String getCommitted() {
		return committed;
	}

	public void setCommitted(String committed) {
		this.committed = committed;
	}

	public String getCorrelatedCustomDate1() {
		return correlatedCustomDate1;
	}

	public void setCorrelatedCustomDate1(String correlatedCustomDate1) {
		this.correlatedCustomDate1 = correlatedCustomDate1;
	}

	public String getCorrelatedCustomDate2() {
		return correlatedCustomDate2;
	}

	public void setCorrelatedCustomDate2(String correlatedCustomDate2) {
		this.correlatedCustomDate2 = correlatedCustomDate2;
	}

	public String getCorrelatedCustomDate3() {
		return correlatedCustomDate3;
	}

	public void setCorrelatedCustomDate3(String correlatedCustomDate3) {
		this.correlatedCustomDate3 = correlatedCustomDate3;
	}

	public String getCorrelatedCustomFloat1() {
		return correlatedCustomFloat1;
	}

	public void setCorrelatedCustomFloat1(String correlatedCustomFloat1) {
		this.correlatedCustomFloat1 = correlatedCustomFloat1;
	}

	public String getCorrelatedCustomFloat2() {
		return correlatedCustomFloat2;
	}

	public void setCorrelatedCustomFloat2(String correlatedCustomFloat2) {
		this.correlatedCustomFloat2 = correlatedCustomFloat2;
	}

	public String getCorrelatedCustomFloat3() {
		return correlatedCustomFloat3;
	}

	public void setCorrelatedCustomFloat3(String correlatedCustomFloat3) {
		this.correlatedCustomFloat3 = correlatedCustomFloat3;
	}

	public String getCorrelatedCustomInt1() {
		return correlatedCustomInt1;
	}

	public void setCorrelatedCustomInt1(String correlatedCustomInt1) {
		this.correlatedCustomInt1 = correlatedCustomInt1;
	}

	public String getCorrelatedCustomInt2() {
		return correlatedCustomInt2;
	}

	public void setCorrelatedCustomInt2(String correlatedCustomInt2) {
		this.correlatedCustomInt2 = correlatedCustomInt2;
	}

	public String getCorrelatedCustomInt3() {
		return correlatedCustomInt3;
	}

	public void setCorrelatedCustomInt3(String correlatedCustomInt3) {
		this.correlatedCustomInt3 = correlatedCustomInt3;
	}

	public String getCorrelatedCustomText1() {
		return correlatedCustomText1;
	}

	public void setCorrelatedCustomText1(String correlatedCustomText1) {
		this.correlatedCustomText1 = correlatedCustomText1;
	}

	public String getCorrelatedCustomText10() {
		return correlatedCustomText10;
	}

	public void setCorrelatedCustomText10(String correlatedCustomText10) {
		this.correlatedCustomText10 = correlatedCustomText10;
	}

	public String getCorrelatedCustomText2() {
		return correlatedCustomText2;
	}

	public void setCorrelatedCustomText2(String correlatedCustomText2) {
		this.correlatedCustomText2 = correlatedCustomText2;
	}

	public String getCorrelatedCustomText3() {
		return correlatedCustomText3;
	}

	public void setCorrelatedCustomText3(String correlatedCustomText3) {
		this.correlatedCustomText3 = correlatedCustomText3;
	}

	public String getCorrelatedCustomText4() {
		return correlatedCustomText4;
	}

	public void setCorrelatedCustomText4(String correlatedCustomText4) {
		this.correlatedCustomText4 = correlatedCustomText4;
	}

	public String getCorrelatedCustomText5() {
		return correlatedCustomText5;
	}

	public void setCorrelatedCustomText5(String correlatedCustomText5) {
		this.correlatedCustomText5 = correlatedCustomText5;
	}

	public String getCorrelatedCustomText6() {
		return correlatedCustomText6;
	}

	public void setCorrelatedCustomText6(String correlatedCustomText6) {
		this.correlatedCustomText6 = correlatedCustomText6;
	}

	public String getCorrelatedCustomText7() {
		return correlatedCustomText7;
	}

	public void setCorrelatedCustomText7(String correlatedCustomText7) {
		this.correlatedCustomText7 = correlatedCustomText7;
	}

	public String getCorrelatedCustomText8() {
		return correlatedCustomText8;
	}

	public void setCorrelatedCustomText8(String correlatedCustomText8) {
		this.correlatedCustomText8 = correlatedCustomText8;
	}

	public String getCorrelatedCustomText9() {
		return correlatedCustomText9;
	}

	public void setCorrelatedCustomText9(String correlatedCustomText9) {
		this.correlatedCustomText9 = correlatedCustomText9;
	}

	public String getCorrelatedCustomTextBlock1() {
		return correlatedCustomTextBlock1;
	}

	public void setCorrelatedCustomTextBlock1(String correlatedCustomTextBlock1) {
		this.correlatedCustomTextBlock1 = correlatedCustomTextBlock1;
	}

	public String getCorrelatedCustomTextBlock2() {
		return correlatedCustomTextBlock2;
	}

	public void setCorrelatedCustomTextBlock2(String correlatedCustomTextBlock2) {
		this.correlatedCustomTextBlock2 = correlatedCustomTextBlock2;
	}

	public String getCorrelatedCustomTextBlock3() {
		return correlatedCustomTextBlock3;
	}

	public void setCorrelatedCustomTextBlock3(String correlatedCustomTextBlock3) {
		this.correlatedCustomTextBlock3 = correlatedCustomTextBlock3;
	}

	public String getCostCenter() {
		return costCenter;
	}

	public void setCostCenter(String costCenter) {
		this.costCenter = costCenter;
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

	public String getCustomText15_display() {
		return customText15_display;
	}

	public void setCustomText15_display(String customText15_display) {
		this.customText15_display = customText15_display;
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

	public String getDealValue() {
		return dealValue;
	}

	public void setDealValue(String dealValue) {
		this.dealValue = dealValue;
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

	public String getEffectiveDate() {
		return effectiveDate;
	}

	public void setEffectiveDate(String effectiveDate) {
		this.effectiveDate = effectiveDate;
	}

	public String getEstimatedDuration() {
		return estimatedDuration;
	}

	public void setEstimatedDuration(String estimatedDuration) {
		this.estimatedDuration = estimatedDuration;
	}

	public String getEstimatedEnd() {
		return estimatedEnd;
	}

	public void setEstimatedEnd(String estimatedEnd) {
		this.estimatedEnd = estimatedEnd;
	}

	public String getEstimatedHoursPerWeek() {
		return estimatedHoursPerWeek;
	}

	public void setEstimatedHoursPerWeek(String estimatedHoursPerWeek) {
		this.estimatedHoursPerWeek = estimatedHoursPerWeek;
	}

	public String getEstimatedStart() {
		return estimatedStart;
	}

	public void setEstimatedStart(String estimatedStart) {
		this.estimatedStart = estimatedStart;
	}

	public String getExpectedBillRate() {
		return expectedBillRate;
	}

	public void setExpectedBillRate(String expectedBillRate) {
		this.expectedBillRate = expectedBillRate;
	}

	public String getExpectedCloseDate() {
		return expectedCloseDate;
	}

	public void setExpectedCloseDate(String expectedCloseDate) {
		this.expectedCloseDate = expectedCloseDate;
	}

	public String getExpectedFee() {
		return expectedFee;
	}

	public void setExpectedFee(String expectedFee) {
		this.expectedFee = expectedFee;
	}

	public String getExpectedPayRate() {
		return expectedPayRate;
	}

	public void setExpectedPayRate(String expectedPayRate) {
		this.expectedPayRate = expectedPayRate;
	}

	public String getExternalCategoryID() {
		return externalCategoryID;
	}

	public void setExternalCategoryID(String externalCategoryID) {
		this.externalCategoryID = externalCategoryID;
	}

	public String getExternalID() {
		return externalID;
	}

	public void setExternalID(String externalID) {
		this.externalID = externalID;
	}

	public String getHoursOfOperation() {
		return hoursOfOperation;
	}

	public void setHoursOfOperation(String hoursOfOperation) {
		this.hoursOfOperation = hoursOfOperation;
	}

	public String getLeadUserID() {
		return leadUserID;
	}

	public void setLeadUserID(String leadUserID) {
		this.leadUserID = leadUserID;
	}

	public String getLeadUserID_display() {
		return leadUserID_display;
	}

	public void setLeadUserID_display(String leadUserID_display) {
		this.leadUserID_display = leadUserID_display;
	}

	public String getNotify() {
		return notify;
	}

	public void setNotify(String notify) {
		this.notify = notify;
	}

	public String getNotify_display() {
		return notify_display;
	}

	public void setNotify_display(String notify_display) {
		this.notify_display = notify_display;
	}

	public String getNumOpenings() {
		return numOpenings;
	}

	public void setNumOpenings(String numOpenings) {
		this.numOpenings = numOpenings;
	}

	public String getOnSite() {
		return onSite;
	}

	public void setOnSite(String onSite) {
		this.onSite = onSite;
	}

	public String getOpportunityMarkUp() {
		return opportunityMarkUp;
	}

	public void setOpportunityMarkUp(String opportunityMarkUp) {
		this.opportunityMarkUp = opportunityMarkUp;
	}

	public String getOptionsPackage() {
		return optionsPackage;
	}

	public void setOptionsPackage(String optionsPackage) {
		this.optionsPackage = optionsPackage;
	}

	public String getPrimaryBusinessSectorID() {
		return primaryBusinessSectorID;
	}

	public void setPrimaryBusinessSectorID(String primaryBusinessSectorID) {
		this.primaryBusinessSectorID = primaryBusinessSectorID;
	}

	public String getPrimaryCategoryID() {
		return primaryCategoryID;
	}

	public void setPrimaryCategoryID(String primaryCategoryID) {
		this.primaryCategoryID = primaryCategoryID;
	}

	public String getPriority() {
		return priority;
	}

	public void setPriority(String priority) {
		this.priority = priority;
	}

	public String getPublicDescription() {
		return publicDescription;
	}

	public void setPublicDescription(String publicDescription) {
		this.publicDescription = publicDescription;
	}

	public String getPublishedZip() {
		return publishedZip;
	}

	public void setPublishedZip(String publishedZip) {
		this.publishedZip = publishedZip;
	}

	public String getReasonClosed() {
		return reasonClosed;
	}

	public void setReasonClosed(String reasonClosed) {
		this.reasonClosed = reasonClosed;
	}

	public String getReportTo() {
		return reportTo;
	}

	public void setReportTo(String reportTo) {
		this.reportTo = reportTo;
	}

	public String getReportToUserID() {
		return reportToUserID;
	}

	public void setReportToUserID(String reportToUserID) {
		this.reportToUserID = reportToUserID;
	}

	public String getResponseUserID() {
		return responseUserID;
	}

	public void setResponseUserID(String responseUserID) {
		this.responseUserID = responseUserID;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

	public String getSalaryUnit() {
		return salaryUnit;
	}

	public void setSalaryUnit(String salaryUnit) {
		this.salaryUnit = salaryUnit;
	}

	public String getSkillID() {
		return skillID;
	}

	public void setSkillID(String skillID) {
		this.skillID = skillID;
	}

	public String getSkills() {
		return skills;
	}

	public void setSkills(String skills) {
		this.skills = skills;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getSpecialty_categoryID() {
		return specialty_categoryID;
	}

	public void setSpecialty_categoryID(String specialty_categoryID) {
		this.specialty_categoryID = specialty_categoryID;
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

	public String getTaxRate() {
		return taxRate;
	}

	public void setTaxRate(String taxRate) {
		this.taxRate = taxRate;
	}

	public String getTaxStatus() {
		return taxStatus;
	}

	public void setTaxStatus(String taxStatus) {
		this.taxStatus = taxStatus;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Integer getUserID() {
		return userID;
	}

	public void setUserID(Integer userID) {
		this.userID = userID;
	}

	public String getUserID_display() {
		return userID_display;
	}

	public void setUserID_display(String userID_display) {
		this.userID_display = userID_display;
	}

	public String getWeightedDealValue() {
		return weightedDealValue;
	}

	public void setWeightedDealValue(String weightedDealValue) {
		this.weightedDealValue = weightedDealValue;
	}

	public String getWillRelocate() {
		return willRelocate;
	}

	public void setWillRelocate(String willRelocate) {
		this.willRelocate = willRelocate;
	}

	public String getWinProbabilityPercent() {
		return winProbabilityPercent;
	}

	public void setWinProbabilityPercent(String winProbabilityPercent) {
		this.winProbabilityPercent = winProbabilityPercent;
	}

	public String getWorkersCompRateID() {
		return workersCompRateID;
	}

	public void setWorkersCompRateID(String workersCompRateID) {
		this.workersCompRateID = workersCompRateID;
	}

	public String getYearsRequired() {
		return yearsRequired;
	}

	public void setYearsRequired(String yearsRequired) {
		this.yearsRequired = yearsRequired;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public Integer getJobPostingID() {
		return jobPostingID;
	}

	public void setJobPostingID(Integer jobPostingID) {
		this.jobPostingID = jobPostingID;
	}

	public String getOpportunity_actualCloseDate() {
		return actualCloseDate;
	}

	public void setOpportunity_actualCloseDate(String opportunity_actualCloseDate) {
		this.actualCloseDate = opportunity_actualCloseDate;
	}

	public String getOpportunity_address() {
		return address;
	}

	public void setOpportunity_address(String opportunity_address) {
		this.address = opportunity_address;
	}

	public String getOpportunity_assignedDate() {
		return assignedDate;
	}

	public void setOpportunity_assignedDate(String opportunity_assignedDate) {
		this.assignedDate = opportunity_assignedDate;
	}

	public String getOpportunity_assignments() {
		return assignments;
	}

	public void setOpportunity_assignments(String opportunity_assignments) {
		this.assignments = opportunity_assignments;
	}

	public String getOpportunity_assignments_display() {
		return assignments_display;
	}

	public void setOpportunity_assignments_display(String opportunity_assignments_display) {
		this.assignments_display = opportunity_assignments_display;
	}

	public String getOpportunity_benefits() {
		return benefits;
	}

	public void setOpportunity_benefits(String opportunity_benefits) {
		this.benefits = opportunity_benefits;
	}

	public String getOpportunity_billRateCategoryID() {
		return billRateCategoryID;
	}

	public void setOpportunity_billRateCategoryID(String opportunity_billRateCategoryID) {
		this.billRateCategoryID = opportunity_billRateCategoryID;
	}

	public String getOpportunity_bonusPackage() {
		return bonusPackage;
	}

	public void setOpportunity_bonusPackage(String opportunity_bonusPackage) {
		this.bonusPackage = opportunity_bonusPackage;
	}

	public String getOpportunity_branchCode() {
		return branchCode;
	}

	public void setOpportunity_branchCode(String opportunity_branchCode) {
		this.branchCode = opportunity_branchCode;
	}

	public String getOpportunity_businessSectorID() {
		return businessSectorID;
	}

	public void setOpportunity_businessSectorID(String opportunity_businessSectorID) {
		this.businessSectorID = opportunity_businessSectorID;
	}

	public String getOpportunity_campaignSource() {
		return campaignSource;
	}

	public void setOpportunity_campaignSource(String opportunity_campaignSource) {
		this.campaignSource = opportunity_campaignSource;
	}

	public String getOpportunity_categoryID() {
		return categoryID;
	}

	public void setOpportunity_categoryID(String opportunity_categoryID) {
		this.categoryID = opportunity_categoryID;
	}

	public String getOpportunity_certifications() {
		return certifications;
	}

	public void setOpportunity_certifications(String opportunity_certifications) {
		this.certifications = opportunity_certifications;
	}

	public String getOpportunity_city() {
		return city;
	}

	public void setOpportunity_city(String opportunity_city) {
		this.city = opportunity_city;
	}

	public Integer getOpportunity_clientCorporationID() {
		return clientCorporationID;
	}

	public void setOpportunity_clientCorporationID(Integer opportunity_clientCorporationID) {
		this.clientCorporationID = opportunity_clientCorporationID;
	}

	public String getOpportunity_clientCorporationID_display() {
		return clientCorporationID_display;
	}

	public void setOpportunity_clientCorporationID_display(String opportunity_clientCorporationID_display) {
		this.clientCorporationID_display = opportunity_clientCorporationID_display;
	}

	public Integer getOpportunity_clientUserID() {
		return clientUserID;
	}

	public void setOpportunity_clientUserID(Integer opportunity_clientUserID) {
		this.clientUserID = opportunity_clientUserID;
	}

	public String getOpportunity_clientUserID_display() {
		return clientUserID_display;
	}

	public void setOpportunity_clientUserID_display(String opportunity_clientUserID_display) {
		this.clientUserID_display = opportunity_clientUserID_display;
	}

	public String getOpportunity_committed() {
		return committed;
	}

	public void setOpportunity_committed(String opportunity_committed) {
		this.committed = opportunity_committed;
	}

	public String getOpportunity_correlatedCustomDate1() {
		return correlatedCustomDate1;
	}

	public void setOpportunity_correlatedCustomDate1(String opportunity_correlatedCustomDate1) {
		this.correlatedCustomDate1 = opportunity_correlatedCustomDate1;
	}

	public String getOpportunity_correlatedCustomDate2() {
		return correlatedCustomDate2;
	}

	public void setOpportunity_correlatedCustomDate2(String opportunity_correlatedCustomDate2) {
		this.correlatedCustomDate2 = opportunity_correlatedCustomDate2;
	}

	public String getOpportunity_correlatedCustomDate3() {
		return correlatedCustomDate3;
	}

	public void setOpportunity_correlatedCustomDate3(String opportunity_correlatedCustomDate3) {
		this.correlatedCustomDate3 = opportunity_correlatedCustomDate3;
	}

	public String getOpportunity_correlatedCustomFloat1() {
		return correlatedCustomFloat1;
	}

	public void setOpportunity_correlatedCustomFloat1(String opportunity_correlatedCustomFloat1) {
		this.correlatedCustomFloat1 = opportunity_correlatedCustomFloat1;
	}

	public String getOpportunity_correlatedCustomFloat2() {
		return correlatedCustomFloat2;
	}

	public void setOpportunity_correlatedCustomFloat2(String opportunity_correlatedCustomFloat2) {
		this.correlatedCustomFloat2 = opportunity_correlatedCustomFloat2;
	}

	public String getOpportunity_correlatedCustomFloat3() {
		return correlatedCustomFloat3;
	}

	public void setOpportunity_correlatedCustomFloat3(String opportunity_correlatedCustomFloat3) {
		this.correlatedCustomFloat3 = opportunity_correlatedCustomFloat3;
	}

	public String getOpportunity_correlatedCustomInt1() {
		return correlatedCustomInt1;
	}

	public void setOpportunity_correlatedCustomInt1(String opportunity_correlatedCustomInt1) {
		this.correlatedCustomInt1 = opportunity_correlatedCustomInt1;
	}

	public String getOpportunity_correlatedCustomInt2() {
		return correlatedCustomInt2;
	}

	public void setOpportunity_correlatedCustomInt2(String opportunity_correlatedCustomInt2) {
		this.correlatedCustomInt2 = opportunity_correlatedCustomInt2;
	}

	public String getOpportunity_correlatedCustomInt3() {
		return correlatedCustomInt3;
	}

	public void setOpportunity_correlatedCustomInt3(String opportunity_correlatedCustomInt3) {
		this.correlatedCustomInt3 = opportunity_correlatedCustomInt3;
	}

	public String getOpportunity_correlatedCustomText1() {
		return correlatedCustomText1;
	}

	public void setOpportunity_correlatedCustomText1(String opportunity_correlatedCustomText1) {
		this.correlatedCustomText1 = opportunity_correlatedCustomText1;
	}

	public String getOpportunity_correlatedCustomText10() {
		return correlatedCustomText10;
	}

	public void setOpportunity_correlatedCustomText10(String opportunity_correlatedCustomText10) {
		this.correlatedCustomText10 = opportunity_correlatedCustomText10;
	}

	public String getOpportunity_correlatedCustomText2() {
		return correlatedCustomText2;
	}

	public void setOpportunity_correlatedCustomText2(String opportunity_correlatedCustomText2) {
		this.correlatedCustomText2 = opportunity_correlatedCustomText2;
	}

	public String getOpportunity_correlatedCustomText3() {
		return correlatedCustomText3;
	}

	public void setOpportunity_correlatedCustomText3(String opportunity_correlatedCustomText3) {
		this.correlatedCustomText3 = opportunity_correlatedCustomText3;
	}

	public String getOpportunity_correlatedCustomText4() {
		return correlatedCustomText4;
	}

	public void setOpportunity_correlatedCustomText4(String opportunity_correlatedCustomText4) {
		this.correlatedCustomText4 = opportunity_correlatedCustomText4;
	}

	public String getOpportunity_correlatedCustomText5() {
		return correlatedCustomText5;
	}

	public void setOpportunity_correlatedCustomText5(String opportunity_correlatedCustomText5) {
		this.correlatedCustomText5 = opportunity_correlatedCustomText5;
	}

	public String getOpportunity_correlatedCustomText6() {
		return correlatedCustomText6;
	}

	public void setOpportunity_correlatedCustomText6(String opportunity_correlatedCustomText6) {
		this.correlatedCustomText6 = opportunity_correlatedCustomText6;
	}

	public String getOpportunity_correlatedCustomText7() {
		return correlatedCustomText7;
	}

	public void setOpportunity_correlatedCustomText7(String opportunity_correlatedCustomText7) {
		this.correlatedCustomText7 = opportunity_correlatedCustomText7;
	}

	public String getOpportunity_correlatedCustomText8() {
		return correlatedCustomText8;
	}

	public void setOpportunity_correlatedCustomText8(String opportunity_correlatedCustomText8) {
		this.correlatedCustomText8 = opportunity_correlatedCustomText8;
	}

	public String getOpportunity_correlatedCustomText9() {
		return correlatedCustomText9;
	}

	public void setOpportunity_correlatedCustomText9(String opportunity_correlatedCustomText9) {
		this.correlatedCustomText9 = opportunity_correlatedCustomText9;
	}

	public String getOpportunity_correlatedCustomTextBlock1() {
		return correlatedCustomTextBlock1;
	}

	public void setOpportunity_correlatedCustomTextBlock1(String opportunity_correlatedCustomTextBlock1) {
		this.correlatedCustomTextBlock1 = opportunity_correlatedCustomTextBlock1;
	}

	public String getOpportunity_correlatedCustomTextBlock2() {
		return correlatedCustomTextBlock2;
	}

	public void setOpportunity_correlatedCustomTextBlock2(String opportunity_correlatedCustomTextBlock2) {
		this.correlatedCustomTextBlock2 = opportunity_correlatedCustomTextBlock2;
	}

	public String getOpportunity_correlatedCustomTextBlock3() {
		return correlatedCustomTextBlock3;
	}

	public void setOpportunity_correlatedCustomTextBlock3(String opportunity_correlatedCustomTextBlock3) {
		this.correlatedCustomTextBlock3 = opportunity_correlatedCustomTextBlock3;
	}

	public String getOpportunity_costCenter() {
		return costCenter;
	}

	public void setOpportunity_costCenter(String opportunity_costCenter) {
		this.costCenter = opportunity_costCenter;
	}

	public String getOpportunity_countryID() {
		return countryID;
	}

	public void setOpportunity_countryID(String opportunity_countryID) {
		this.countryID = opportunity_countryID;
	}

	public String getOpportunity_customDate1() {
		return customDate1;
	}

	public void setOpportunity_customDate1(String opportunity_customDate1) {
		this.customDate1 = opportunity_customDate1;
	}

	public String getOpportunity_customDate2() {
		return customDate2;
	}

	public void setOpportunity_customDate2(String opportunity_customDate2) {
		this.customDate2 = opportunity_customDate2;
	}

	public String getOpportunity_customDate3() {
		return customDate3;
	}

	public void setOpportunity_customDate3(String opportunity_customDate3) {
		this.customDate3 = opportunity_customDate3;
	}

	public String getOpportunity_customFloat1() {
		return customFloat1;
	}

	public void setOpportunity_customFloat1(String opportunity_customFloat1) {
		this.customFloat1 = opportunity_customFloat1;
	}

	public String getOpportunity_customFloat2() {
		return customFloat2;
	}

	public void setOpportunity_customFloat2(String opportunity_customFloat2) {
		this.customFloat2 = opportunity_customFloat2;
	}

	public String getOpportunity_customFloat3() {
		return customFloat3;
	}

	public void setOpportunity_customFloat3(String opportunity_customFloat3) {
		this.customFloat3 = opportunity_customFloat3;
	}

	public String getOpportunity_customInt1() {
		return customInt1;
	}

	public void setOpportunity_customInt1(String opportunity_customInt1) {
		this.customInt1 = opportunity_customInt1;
	}

	public String getOpportunity_customInt2() {
		return customInt2;
	}

	public void setOpportunity_customInt2(String opportunity_customInt2) {
		this.customInt2 = opportunity_customInt2;
	}

	public String getOpportunity_customInt3() {
		return customInt3;
	}

	public void setOpportunity_customInt3(String opportunity_customInt3) {
		this.customInt3 = opportunity_customInt3;
	}

	public String getOpportunity_customText1() {
		return customText1;
	}

	public void setOpportunity_customText1(String opportunity_customText1) {
		this.customText1 = opportunity_customText1;
	}

	public String getOpportunity_customText10() {
		return customText10;
	}

	public void setOpportunity_customText10(String opportunity_customText10) {
		this.customText10 = opportunity_customText10;
	}

	public String getOpportunity_customText11() {
		return customText11;
	}

	public void setOpportunity_customText11(String opportunity_customText11) {
		this.customText11 = opportunity_customText11;
	}

	public String getOpportunity_customText12() {
		return customText12;
	}

	public void setOpportunity_customText12(String opportunity_customText12) {
		this.customText12 = opportunity_customText12;
	}

	public String getOpportunity_customText13() {
		return customText13;
	}

	public void setOpportunity_customText13(String opportunity_customText13) {
		this.customText13 = opportunity_customText13;
	}

	public String getOpportunity_customText14() {
		return customText14;
	}

	public void setOpportunity_customText14(String opportunity_customText14) {
		this.customText14 = opportunity_customText14;
	}

	public String getOpportunity_customText15() {
		return customText15;
	}

	public void setOpportunity_customText15(String opportunity_customText15) {
		this.customText15 = opportunity_customText15;
	}

	public String getOpportunity_customText15_display() {
		return customText15_display;
	}

	public void setOpportunity_customText15_display(String opportunity_customText15_display) {
		this.customText15_display = opportunity_customText15_display;
	}

	public String getOpportunity_customText16() {
		return customText16;
	}

	public void setOpportunity_customText16(String opportunity_customText16) {
		this.customText16 = opportunity_customText16;
	}

	public String getOpportunity_customText17() {
		return customText17;
	}

	public void setOpportunity_customText17(String opportunity_customText17) {
		this.customText17 = opportunity_customText17;
	}

	public String getOpportunity_customText18() {
		return customText18;
	}

	public void setOpportunity_customText18(String opportunity_customText18) {
		this.customText18 = opportunity_customText18;
	}

	public String getOpportunity_customText19() {
		return customText19;
	}

	public void setOpportunity_customText19(String opportunity_customText19) {
		this.customText19 = opportunity_customText19;
	}

	public String getOpportunity_customText2() {
		return customText2;
	}

	public void setOpportunity_customText2(String opportunity_customText2) {
		this.customText2 = opportunity_customText2;
	}

	public String getOpportunity_customText20() {
		return customText20;
	}

	public void setOpportunity_customText20(String opportunity_customText20) {
		this.customText20 = opportunity_customText20;
	}

	public String getOpportunity_customText3() {
		return customText3;
	}

	public void setOpportunity_customText3(String opportunity_customText3) {
		this.customText3 = opportunity_customText3;
	}

	public String getOpportunity_customText4() {
		return customText4;
	}

	public void setOpportunity_customText4(String opportunity_customText4) {
		this.customText4 = opportunity_customText4;
	}

	public String getOpportunity_customText5() {
		return customText5;
	}

	public void setOpportunity_customText5(String opportunity_customText5) {
		this.customText5 = opportunity_customText5;
	}

	public String getOpportunity_customText6() {
		return customText6;
	}

	public void setOpportunity_customText6(String opportunity_customText6) {
		this.customText6 = opportunity_customText6;
	}

	public String getOpportunity_customText7() {
		return customText7;
	}

	public void setOpportunity_customText7(String opportunity_customText7) {
		this.customText7 = opportunity_customText7;
	}

	public String getOpportunity_customText8() {
		return customText8;
	}

	public void setOpportunity_customText8(String opportunity_customText8) {
		this.customText8 = opportunity_customText8;
	}

	public String getOpportunity_customText9() {
		return customText9;
	}

	public void setOpportunity_customText9(String opportunity_customText9) {
		this.customText9 = opportunity_customText9;
	}

	public String getOpportunity_customTextBlock1() {
		return customTextBlock1;
	}

	public void setOpportunity_customTextBlock1(String opportunity_customTextBlock1) {
		this.customTextBlock1 = opportunity_customTextBlock1;
	}

	public String getOpportunity_customTextBlock2() {
		return customTextBlock2;
	}

	public void setOpportunity_customTextBlock2(String opportunity_customTextBlock2) {
		this.customTextBlock2 = opportunity_customTextBlock2;
	}

	public String getOpportunity_customTextBlock3() {
		return customTextBlock3;
	}

	public void setOpportunity_customTextBlock3(String opportunity_customTextBlock3) {
		this.customTextBlock3 = opportunity_customTextBlock3;
	}

	public String getOpportunity_customTextBlock4() {
		return customTextBlock4;
	}

	public void setOpportunity_customTextBlock4(String opportunity_customTextBlock4) {
		this.customTextBlock4 = opportunity_customTextBlock4;
	}

	public String getOpportunity_customTextBlock5() {
		return customTextBlock5;
	}

	public void setOpportunity_customTextBlock5(String opportunity_customTextBlock5) {
		this.customTextBlock5 = opportunity_customTextBlock5;
	}

	public String getOpportunity_dealValue() {
		return dealValue;
	}

	public void setOpportunity_dealValue(String opportunity_dealValue) {
		this.dealValue = opportunity_dealValue;
	}

	public String getOpportunity_degreeList() {
		return degreeList;
	}

	public void setOpportunity_degreeList(String opportunity_degreeList) {
		this.degreeList = opportunity_degreeList;
	}

	public String getOpportunity_description() {
		return description;
	}

	public void setOpportunity_description(String opportunity_description) {
		this.description = opportunity_description;
	}

	public String getOpportunity_distributionListID() {
		return distributionListID;
	}

	public void setOpportunity_distributionListID(String opportunity_distributionListID) {
		this.distributionListID = opportunity_distributionListID;
	}

	public String getOpportunity_distributionListID_display() {
		return distributionListID_display;
	}

	public void setOpportunity_distributionListID_display(String opportunity_distributionListID_display) {
		this.distributionListID_display = opportunity_distributionListID_display;
	}

	public String getOpportunity_educationDegree() {
		return educationDegree;
	}

	public void setOpportunity_educationDegree(String opportunity_educationDegree) {
		this.educationDegree = opportunity_educationDegree;
	}

	public String getOpportunity_effectiveDate() {
		return effectiveDate;
	}

	public void setOpportunity_effectiveDate(String opportunity_effectiveDate) {
		this.effectiveDate = opportunity_effectiveDate;
	}

	public String getOpportunity_estimatedDuration() {
		return estimatedDuration;
	}

	public void setOpportunity_estimatedDuration(String opportunity_estimatedDuration) {
		this.estimatedDuration = opportunity_estimatedDuration;
	}

	public String getOpportunity_estimatedEnd() {
		return estimatedEnd;
	}

	public void setOpportunity_estimatedEnd(String opportunity_estimatedEnd) {
		this.estimatedEnd = opportunity_estimatedEnd;
	}

	public String getOpportunity_estimatedHoursPerWeek() {
		return estimatedHoursPerWeek;
	}

	public void setOpportunity_estimatedHoursPerWeek(String opportunity_estimatedHoursPerWeek) {
		this.estimatedHoursPerWeek = opportunity_estimatedHoursPerWeek;
	}

	public String getOpportunity_estimatedStart() {
		return estimatedStart;
	}

	public void setOpportunity_estimatedStart(String opportunity_estimatedStart) {
		this.estimatedStart = opportunity_estimatedStart;
	}

	public String getOpportunity_expectedBillRate() {
		return expectedBillRate;
	}

	public void setOpportunity_expectedBillRate(String opportunity_expectedBillRate) {
		this.expectedBillRate = opportunity_expectedBillRate;
	}

	public String getOpportunity_expectedCloseDate() {
		return expectedCloseDate;
	}

	public void setOpportunity_expectedCloseDate(String opportunity_expectedCloseDate) {
		this.expectedCloseDate = opportunity_expectedCloseDate;
	}

	public String getOpportunity_expectedFee() {
		return expectedFee;
	}

	public void setOpportunity_expectedFee(String opportunity_expectedFee) {
		this.expectedFee = opportunity_expectedFee;
	}

	public String getOpportunity_expectedPayRate() {
		return expectedPayRate;
	}

	public void setOpportunity_expectedPayRate(String opportunity_expectedPayRate) {
		this.expectedPayRate = opportunity_expectedPayRate;
	}

	public String getOpportunity_externalCategoryID() {
		return externalCategoryID;
	}

	public void setOpportunity_externalCategoryID(String opportunity_externalCategoryID) {
		this.externalCategoryID = opportunity_externalCategoryID;
	}

	public String getOpportunity_externalID() {
		return externalID;
	}

	public void setOpportunity_externalID(String opportunity_externalID) {
		this.externalID = opportunity_externalID;
	}

	public String getOpportunity_hoursOfOperation() {
		return hoursOfOperation;
	}

	public void setOpportunity_hoursOfOperation(String opportunity_hoursOfOperation) {
		this.hoursOfOperation = opportunity_hoursOfOperation;
	}

	public String getOpportunity_leadUserID() {
		return leadUserID;
	}

	public void setOpportunity_leadUserID(String opportunity_leadUserID) {
		this.leadUserID = opportunity_leadUserID;
	}

	public String getOpportunity_leadUserID_display() {
		return leadUserID_display;
	}

	public void setOpportunity_leadUserID_display(String opportunity_leadUserID_display) {
		this.leadUserID_display = opportunity_leadUserID_display;
	}

	public String getOpportunity_notify() {
		return notify;
	}

	public void setOpportunity_notify(String opportunity_notify) {
		this.notify = opportunity_notify;
	}

	public String getOpportunity_notify_display() {
		return notify_display;
	}

	public void setOpportunity_notify_display(String opportunity_notify_display) {
		this.notify_display = opportunity_notify_display;
	}

	public String getOpportunity_numOpenings() {
		return numOpenings;
	}

	public void setOpportunity_numOpenings(String opportunity_numOpenings) {
		this.numOpenings = opportunity_numOpenings;
	}

	public String getOpportunity_onSite() {
		return onSite;
	}

	public void setOpportunity_onSite(String opportunity_onSite) {
		this.onSite = opportunity_onSite;
	}

	public String getOpportunity_opportunityMarkUp() {
		return opportunityMarkUp;
	}

	public void setOpportunity_opportunityMarkUp(String opportunity_opportunityMarkUp) {
		this.opportunityMarkUp = opportunity_opportunityMarkUp;
	}

	public String getOpportunity_optionsPackage() {
		return optionsPackage;
	}

	public void setOpportunity_optionsPackage(String opportunity_optionsPackage) {
		this.optionsPackage = opportunity_optionsPackage;
	}

	public String getOpportunity_primaryBusinessSectorID() {
		return primaryBusinessSectorID;
	}

	public void setOpportunity_primaryBusinessSectorID(String opportunity_primaryBusinessSectorID) {
		this.primaryBusinessSectorID = opportunity_primaryBusinessSectorID;
	}

	public String getOpportunity_primaryCategoryID() {
		return primaryCategoryID;
	}

	public void setOpportunity_primaryCategoryID(String opportunity_primaryCategoryID) {
		this.primaryCategoryID = opportunity_primaryCategoryID;
	}

	public String getOpportunity_priority() {
		return priority;
	}

	public void setOpportunity_priority(String opportunity_priority) {
		this.priority = opportunity_priority;
	}

	public String getOpportunity_publicDescription() {
		return publicDescription;
	}

	public void setOpportunity_publicDescription(String opportunity_publicDescription) {
		this.publicDescription = opportunity_publicDescription;
	}

	public String getOpportunity_publishedZip() {
		return publishedZip;
	}

	public void setOpportunity_publishedZip(String opportunity_publishedZip) {
		this.publishedZip = opportunity_publishedZip;
	}

	public String getOpportunity_reasonClosed() {
		return reasonClosed;
	}

	public void setOpportunity_reasonClosed(String opportunity_reasonClosed) {
		this.reasonClosed = opportunity_reasonClosed;
	}

	public String getOpportunity_reportTo() {
		return reportTo;
	}

	public void setOpportunity_reportTo(String opportunity_reportTo) {
		this.reportTo = opportunity_reportTo;
	}

	public String getOpportunity_reportToUserID() {
		return reportToUserID;
	}

	public void setOpportunity_reportToUserID(String opportunity_reportToUserID) {
		this.reportToUserID = opportunity_reportToUserID;
	}

	public String getOpportunity_responseUserID() {
		return responseUserID;
	}

	public void setOpportunity_responseUserID(String opportunity_responseUserID) {
		this.responseUserID = opportunity_responseUserID;
	}

	public String getOpportunity_salary() {
		return salary;
	}

	public void setOpportunity_salary(String opportunity_salary) {
		this.salary = opportunity_salary;
	}

	public String getOpportunity_salaryUnit() {
		return salaryUnit;
	}

	public void setOpportunity_salaryUnit(String opportunity_salaryUnit) {
		this.salaryUnit = opportunity_salaryUnit;
	}

	public String getOpportunity_skillID() {
		return skillID;
	}

	public void setOpportunity_skillID(String opportunity_skillID) {
		this.skillID = opportunity_skillID;
	}

	public String getOpportunity_skills() {
		return skills;
	}

	public void setOpportunity_skills(String opportunity_skills) {
		this.skills = opportunity_skills;
	}

	public String getOpportunity_source() {
		return source;
	}

	public void setOpportunity_source(String opportunity_source) {
		this.source = opportunity_source;
	}

	public String getOpportunity_specialty_categoryID() {
		return specialty_categoryID;
	}

	public void setOpportunity_specialty_categoryID(String opportunity_specialty_categoryID) {
		this.specialty_categoryID = opportunity_specialty_categoryID;
	}

	public String getOpportunity_state() {
		return state;
	}

	public void setOpportunity_state(String opportunity_state) {
		this.state = opportunity_state;
	}

	public String getOpportunity_status() {
		return status;
	}

	public void setOpportunity_status(String opportunity_status) {
		this.status = opportunity_status;
	}

	public String getOpportunity_taxRate() {
		return taxRate;
	}

	public void setOpportunity_taxRate(String opportunity_taxRate) {
		this.taxRate = opportunity_taxRate;
	}

	public String getOpportunity_taxStatus() {
		return taxStatus;
	}

	public void setOpportunity_taxStatus(String opportunity_taxStatus) {
		this.taxStatus = opportunity_taxStatus;
	}

	public String getOpportunity_title() {
		return title;
	}

	public void setOpportunity_title(String opportunity_title) {
		this.title = opportunity_title;
	}

	public String getOpportunity_type() {
		return type;
	}

	public void setOpportunity_type(String opportunity_type) {
		this.type = opportunity_type;
	}

	public Integer getOpportunity_userID() {
		return userID;
	}

	public void setOpportunity_userID(Integer opportunity_userID) {
		this.userID = opportunity_userID;
	}

	public String getOpportunity_userID_display() {
		return userID_display;
	}

	public void setOpportunity_userID_display(String opportunity_userID_display) {
		this.userID_display = opportunity_userID_display;
	}

	public String getOpportunity_weightedDealValue() {
		return weightedDealValue;
	}

	public void setOpportunity_weightedDealValue(String opportunity_weightedDealValue) {
		this.weightedDealValue = opportunity_weightedDealValue;
	}

	public String getOpportunity_willRelocate() {
		return willRelocate;
	}

	public void setOpportunity_willRelocate(String opportunity_willRelocate) {
		this.willRelocate = opportunity_willRelocate;
	}

	public String getOpportunity_winProbabilityPercent() {
		return winProbabilityPercent;
	}

	public void setOpportunity_winProbabilityPercent(String opportunity_winProbabilityPercent) {
		this.winProbabilityPercent = opportunity_winProbabilityPercent;
	}

	public String getOpportunity_workersCompRateID() {
		return workersCompRateID;
	}

	public void setOpportunity_workersCompRateID(String opportunity_workersCompRateID) {
		this.workersCompRateID = opportunity_workersCompRateID;
	}

	public String getOpportunity_yearsRequired() {
		return yearsRequired;
	}

	public void setOpportunity_yearsRequired(String opportunity_yearsRequired) {
		this.yearsRequired = opportunity_yearsRequired;
	}

	public String getOpportunity_zip() {
		return zip;
	}

	public void setOpportunity_zip(String opportunity_zip) {
		this.zip = opportunity_zip;
	}

	@Override
	public Opportunity instantiateEntity() {
		Opportunity jobOrder = new Opportunity();

		jobOrder.setBenefits(benefits);
		jobOrder.setBillRateCategoryID(Utility.parseInteger(billRateCategoryID));
		jobOrder.setBonusPackage(bonusPackage);
		jobOrder.setBranchCode(branchCode);
		jobOrder.setClientContact(new ClientContact(Utility.parseInteger(clientUserID)));
		jobOrder.setClientCorporation(new ClientCorporation(Utility.parseInteger(clientCorporationID)));
		jobOrder.setCorrelatedCustomDate1(stringToDateTime(correlatedCustomDate1));
		jobOrder.setCorrelatedCustomDate2(stringToDateTime(correlatedCustomDate2));
		jobOrder.setCorrelatedCustomDate3(stringToDateTime(correlatedCustomDate3));
		jobOrder.setCorrelatedCustomFloat1(toBigDecimal(correlatedCustomFloat1, "correlatedCustomFloat1"));
		jobOrder.setCorrelatedCustomFloat2(toBigDecimal(correlatedCustomFloat2, "correlatedCustomFloat2"));
		jobOrder.setCorrelatedCustomFloat3(toBigDecimal(correlatedCustomFloat3, "correlatedCustomFloat3"));
		jobOrder.setCorrelatedCustomInt1(toInteger(correlatedCustomInt1, "correlatedCustomInt1"));
		jobOrder.setCorrelatedCustomInt2(toInteger(correlatedCustomInt2, "correlatedCustomInt2"));
		jobOrder.setCorrelatedCustomInt3(toInteger(correlatedCustomInt3, "correlatedCustomInt3"));
		jobOrder.setCorrelatedCustomText1(correlatedCustomText1);
		jobOrder.setCorrelatedCustomText10(correlatedCustomText10);
		jobOrder.setCorrelatedCustomText2(correlatedCustomText2);
		jobOrder.setCorrelatedCustomText3(correlatedCustomText3);
		jobOrder.setCorrelatedCustomText4(correlatedCustomText4);
		jobOrder.setCorrelatedCustomText5(correlatedCustomText5);
		jobOrder.setCorrelatedCustomText6(correlatedCustomText6);
		jobOrder.setCorrelatedCustomText7(correlatedCustomText7);
		jobOrder.setCorrelatedCustomText8(correlatedCustomText8);
		jobOrder.setCorrelatedCustomText9(correlatedCustomText9);
		jobOrder.setCorrelatedCustomTextBlock1(correlatedCustomTextBlock1);
		jobOrder.setCorrelatedCustomTextBlock2(correlatedCustomTextBlock2);
		jobOrder.setCorrelatedCustomTextBlock3(correlatedCustomTextBlock3);
		jobOrder.setCostCenter(costCenter);
		jobOrder.setCustomDate1(stringToDateTime(customDate1));
		jobOrder.setCustomDate2(stringToDateTime(customDate2));
		jobOrder.setCustomDate3(stringToDateTime(customDate3));
		jobOrder.setCustomFloat1(toBigDecimal(customFloat1, "customFloat1"));
		jobOrder.setCustomFloat2(toBigDecimal(customFloat2, "customFloat2"));
		jobOrder.setCustomFloat3(toBigDecimal(customFloat3, "customFloat3"));
		jobOrder.setCustomInt1(toInteger(customInt1, "customInt1"));
		jobOrder.setCustomInt2(toInteger(customInt2, "customInt2"));
		jobOrder.setCustomInt3(toInteger(customInt3, "customInt3"));
		jobOrder.setCustomText1(customText1);
		jobOrder.setCustomText10(customText10);
		jobOrder.setCustomText11(customText11);
		jobOrder.setCustomText12(customText12);
		jobOrder.setCustomText13(customText13);
		jobOrder.setCustomText14(customText14);
		jobOrder.setCustomText15(customText15);
		jobOrder.setCustomText16(customText16);
		jobOrder.setCustomText17(customText17);
		jobOrder.setCustomText18(customText18);
		jobOrder.setCustomText19(customText19);
		jobOrder.setCustomText2(customText2);
		jobOrder.setCustomText20(customText20);
		jobOrder.setCustomText3(customText3);
		jobOrder.setCustomText4(customText4);
		jobOrder.setCustomText5(customText5);
		jobOrder.setCustomText6(customText6);
		jobOrder.setCustomText7(customText7);
		jobOrder.setCustomText8(customText8);
		jobOrder.setCustomText9(customText9);
		jobOrder.setCustomTextBlock1(customTextBlock1);
		jobOrder.setCustomTextBlock2(customTextBlock2);
		jobOrder.setCustomTextBlock3(customTextBlock3);
		jobOrder.setCustomTextBlock4(customTextBlock4);
		jobOrder.setCustomTextBlock5(customTextBlock5);
		jobOrder.setDegreeList(degreeList);
		jobOrder.setDescription(description);

		jobOrder.setEducationDegree(educationDegree);
		jobOrder.setExternalCategoryID(toInteger(externalCategoryID, "externalCategoryID"));
		jobOrder.setExternalID(externalID);
		jobOrder.setHoursOfOperation(hoursOfOperation);
		jobOrder.setIsDeleted(false);
		jobOrder.setId(jobPostingID);
		jobOrder.setNumOpenings(toInteger(numOpenings, "numOpenings"));
		jobOrder.setOnSite(onSite);
		jobOrder.setOptionsPackage(optionsPackage);
		jobOrder.setOwner(new CorporateUser(userID));
		jobOrder.setPublicDescription(publicDescription);
		jobOrder.setPublishedZip(publishedZip);
		jobOrder.setReasonClosed(reasonClosed);
		jobOrder.setReportTo(reportTo);
		jobOrder.setReportToClientContact(new ClientContact(toInteger(reportToUserID, "reportToUserID")));
		jobOrder.setResponseUser(new CorporateUser(toInteger(responseUserID, "responseUserID")));
		jobOrder.setSalary(toBigDecimal(salary, "salary"));
		jobOrder.setSalaryUnit(salaryUnit);

		jobOrder.setSkillList(skills);
		jobOrder.setSource(source);
		jobOrder.setStatus(status);
		jobOrder.setTaxRate(toBigDecimal(taxRate, "taxRate"));
		jobOrder.setTaxStatus(taxStatus);
		jobOrder.setTitle(title);
		jobOrder.setType(type);
		jobOrder.setWillRelocate(willRelocate == null ? null : willRelocate == "1");

		jobOrder.setYearsRequired(toInteger(yearsRequired, "yearsRequired"));

		jobOrder.setAddress(new Address());
		jobOrder.getAddress().setAddress1(address);
		jobOrder.getAddress().setCity(city);
		jobOrder.getAddress().setCountryID(toInteger(countryID, "countryID"));
		jobOrder.getAddress().setState(state);
		jobOrder.getAddress().setZip(zip);

		return jobOrder;
	}

	public static FormOpportunityDto instantiateFromOpportunity(Opportunity opportunity){

		FormOpportunityDto formOpportunityDto = new FormOpportunityDto();
		formOpportunityDto.setBillRateCategoryID(makeString(opportunity.getBillRateCategoryID()));
		formOpportunityDto.setBonusPackage(opportunity.getBonusPackage());
		formOpportunityDto.setBranchCode(opportunity.getBranchCode());
		formOpportunityDto.setClientUserID(opportunity.getClientContact() != null ? opportunity.getClientContact().getId() : null);
		formOpportunityDto.setClientCorporationID(opportunity.getClientCorporation() != null ? opportunity.getClientCorporation().getId() : null);
		formOpportunityDto.setCorrelatedCustomDate1(makeString(opportunity.getCorrelatedCustomDate1()));
		formOpportunityDto.setCorrelatedCustomDate2(makeString(opportunity.getCorrelatedCustomDate2()));
		formOpportunityDto.setCorrelatedCustomDate3(makeString(opportunity.getCorrelatedCustomDate3()));
		formOpportunityDto.setCorrelatedCustomFloat1(makeString(opportunity.getCorrelatedCustomFloat1()));
		formOpportunityDto.setCorrelatedCustomFloat2(makeString(opportunity.getCorrelatedCustomFloat2()));
		formOpportunityDto.setCorrelatedCustomFloat3(makeString(opportunity.getCorrelatedCustomFloat3()));
		formOpportunityDto.setCorrelatedCustomInt1(makeString(opportunity.getCorrelatedCustomInt1()));
		formOpportunityDto.setCorrelatedCustomInt2(makeString(opportunity.getCorrelatedCustomInt2()));
		formOpportunityDto.setCorrelatedCustomInt3(makeString(opportunity.getCorrelatedCustomInt3()));
		formOpportunityDto.setCorrelatedCustomText1(opportunity.getCorrelatedCustomText1());
		formOpportunityDto.setCorrelatedCustomText10(opportunity.getCorrelatedCustomText10());
		formOpportunityDto.setCorrelatedCustomText2(opportunity.getCorrelatedCustomText2());
		formOpportunityDto.setCorrelatedCustomText3(opportunity.getCorrelatedCustomText3());
		formOpportunityDto.setCorrelatedCustomText4(opportunity.getCorrelatedCustomText4());
		formOpportunityDto.setCorrelatedCustomText5(opportunity.getCorrelatedCustomText5());
		formOpportunityDto.setCorrelatedCustomText6(opportunity.getCorrelatedCustomText6());
		formOpportunityDto.setCorrelatedCustomText7(opportunity.getCorrelatedCustomText7());
		formOpportunityDto.setCorrelatedCustomText8(opportunity.getCorrelatedCustomText8());
		formOpportunityDto.setCorrelatedCustomText9(opportunity.getCorrelatedCustomText9());
		formOpportunityDto.setCorrelatedCustomTextBlock1(opportunity.getCorrelatedCustomTextBlock1());
		formOpportunityDto.setCorrelatedCustomTextBlock2(opportunity.getCorrelatedCustomTextBlock2());
		formOpportunityDto.setCorrelatedCustomTextBlock3(opportunity.getCorrelatedCustomTextBlock3());
		formOpportunityDto.setCostCenter(opportunity.getCostCenter());
		formOpportunityDto.setCustomDate1(makeString(opportunity.getCustomDate1()));
		formOpportunityDto.setCustomDate2(makeString(opportunity.getCustomDate2()));
		formOpportunityDto.setCustomDate3(makeString(opportunity.getCustomDate3()));
		formOpportunityDto.setCustomFloat1(makeString(opportunity.getCustomFloat1()));
		formOpportunityDto.setCustomFloat2(makeString(opportunity.getCustomFloat2()));
		formOpportunityDto.setCustomFloat3(makeString(opportunity.getCustomFloat3()));
		formOpportunityDto.setCustomInt1(makeString(opportunity.getCustomInt1()));
		formOpportunityDto.setCustomInt2(makeString(opportunity.getCustomInt2()));
		formOpportunityDto.setCustomInt3(makeString(opportunity.getCustomInt3()));
		formOpportunityDto.setCustomText1(opportunity.getCustomText1());
		formOpportunityDto.setCustomText10(opportunity.getCustomText10());
		formOpportunityDto.setCustomText11(opportunity.getCustomText11());
		formOpportunityDto.setCustomText12(opportunity.getCustomText12());
		formOpportunityDto.setCustomText13(opportunity.getCustomText13());
		formOpportunityDto.setCustomText14(opportunity.getCustomText14());
		formOpportunityDto.setCustomText15(opportunity.getCustomText15());
		formOpportunityDto.setCustomText16(opportunity.getCustomText16());
		formOpportunityDto.setCustomText17(opportunity.getCustomText17());
		formOpportunityDto.setCustomText18(opportunity.getCustomText18());
		formOpportunityDto.setCustomText19(opportunity.getCustomText19());
		formOpportunityDto.setCustomText2(opportunity.getCustomText2());
		formOpportunityDto.setCustomText20(opportunity.getCustomText20());
		formOpportunityDto.setCustomText3(opportunity.getCustomText3());
		formOpportunityDto.setCustomText4(opportunity.getCustomText4());
		formOpportunityDto.setCustomText5(opportunity.getCustomText5());
		formOpportunityDto.setCustomText6(opportunity.getCustomText6());
		formOpportunityDto.setCustomText7(opportunity.getCustomText7());
		formOpportunityDto.setCustomText8(opportunity.getCustomText8());
		formOpportunityDto.setCustomText9(opportunity.getCustomText9());
		formOpportunityDto.setCustomTextBlock1(opportunity.getCustomTextBlock1());
		formOpportunityDto.setCustomTextBlock2(opportunity.getCustomTextBlock2());
		formOpportunityDto.setCustomTextBlock3(opportunity.getCustomTextBlock3());
		formOpportunityDto.setCustomTextBlock4(opportunity.getCustomTextBlock4());
		formOpportunityDto.setCustomTextBlock5(opportunity.getCustomTextBlock5());
		formOpportunityDto.setDegreeList(opportunity.getDegreeList());
		formOpportunityDto.setDescription(opportunity.getDescription());
		formOpportunityDto.setEducationDegree(opportunity.getEducationDegree());
		formOpportunityDto.setExternalCategoryID(makeString(opportunity.getExternalCategoryID()));
		formOpportunityDto.setExternalID(opportunity.getExternalID());
		formOpportunityDto.setHoursOfOperation(opportunity.getHoursOfOperation());
		formOpportunityDto.setJobPostingID(opportunity.getId());
		formOpportunityDto.setNumOpenings(makeString(opportunity.getNumOpenings()));
		formOpportunityDto.setOnSite(opportunity.getOnSite());
		formOpportunityDto.setOptionsPackage(opportunity.getOptionsPackage());
		formOpportunityDto.setUserID(opportunity.getOwner() != null ? opportunity.getOwner().getId() : null);
		formOpportunityDto.setPublicDescription(opportunity.getPublicDescription());
		formOpportunityDto.setPublishedZip(opportunity.getPublishedZip());
		formOpportunityDto.setReasonClosed(opportunity.getReasonClosed());
		formOpportunityDto.setReportTo(opportunity.getReportTo());
		formOpportunityDto.setResponseUserID(opportunity.getResponseUser() != null ? makeString(opportunity.getResponseUser().getId()) : null);
		formOpportunityDto.setSalary(makeString(opportunity.getSalary()));
		formOpportunityDto.setSalaryUnit(opportunity.getSalaryUnit());

		formOpportunityDto.setSkills(opportunity.getSkillList());
		formOpportunityDto.setSource(opportunity.getSource());
		formOpportunityDto.setStatus(opportunity.getStatus());
		formOpportunityDto.setTaxRate(makeString(opportunity.getTaxRate()));
		formOpportunityDto.setTaxStatus(opportunity.getTaxStatus());
		formOpportunityDto.setTitle(opportunity.getTitle());
		formOpportunityDto.setType(opportunity.getType());
		formOpportunityDto.setWillRelocate(makeString(opportunity.getWillRelocate()));

		formOpportunityDto.setYearsRequired(makeString(opportunity.getYearsRequired()));

		Address address = opportunity.getAddress();

		if(address != null){
			formOpportunityDto.setAddress(address.getAddress1());
			formOpportunityDto.setCity(address.getCity());
			formOpportunityDto.setCountryID(makeString(address.getCountryID()));
			formOpportunityDto.setState(address.getState());
			formOpportunityDto.setZip(address.getZip());
		}

		return formOpportunityDto;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("FormOpportunityDto {\n\tjobPostingID: ").append(jobPostingID).append(",\n\tactualCloseDate: ")
				.append(actualCloseDate).append(",\n\taddress: ").append(address).append(",\n\tassignedDate: ")
				.append(assignedDate).append(",\n\tassignments: ").append(assignments)
				.append(",\n\tassignments_display: ").append(assignments_display).append(",\n\tbenefits: ")
				.append(benefits).append(",\n\tbillRateCategoryID: ").append(billRateCategoryID)
				.append(",\n\tbonusPackage: ").append(bonusPackage).append(",\n\tbranchCode: ").append(branchCode)
				.append(",\n\tbusinessSectorID: ").append(businessSectorID).append(",\n\tcampaignSource: ")
				.append(campaignSource).append(",\n\tcategoryID: ").append(categoryID).append(",\n\tcertifications: ")
				.append(certifications).append(",\n\tcity: ").append(city).append(",\n\tclientCorporationID: ")
				.append(clientCorporationID).append(",\n\tclientCorporationID_display: ")
				.append(clientCorporationID_display).append(",\n\tclientUserID: ").append(clientUserID)
				.append(",\n\tclientUserID_display: ").append(clientUserID_display).append(",\n\tcommitted: ")
				.append(committed).append(",\n\tcorrelatedCustomDate1: ").append(correlatedCustomDate1)
				.append(",\n\tcorrelatedCustomDate2: ").append(correlatedCustomDate2)
				.append(",\n\tcorrelatedCustomDate3: ").append(correlatedCustomDate3)
				.append(",\n\tcorrelatedCustomFloat1: ").append(correlatedCustomFloat1)
				.append(",\n\tcorrelatedCustomFloat2: ").append(correlatedCustomFloat2)
				.append(",\n\tcorrelatedCustomFloat3: ").append(correlatedCustomFloat3)
				.append(",\n\tcorrelatedCustomInt1: ").append(correlatedCustomInt1)
				.append(",\n\tcorrelatedCustomInt2: ").append(correlatedCustomInt2)
				.append(",\n\tcorrelatedCustomInt3: ").append(correlatedCustomInt3)
				.append(",\n\tcorrelatedCustomText1: ").append(correlatedCustomText1)
				.append(",\n\tcorrelatedCustomText10: ").append(correlatedCustomText10)
				.append(",\n\tcorrelatedCustomText2: ").append(correlatedCustomText2)
				.append(",\n\tcorrelatedCustomText3: ").append(correlatedCustomText3)
				.append(",\n\tcorrelatedCustomText4: ").append(correlatedCustomText4)
				.append(",\n\tcorrelatedCustomText5: ").append(correlatedCustomText5)
				.append(",\n\tcorrelatedCustomText6: ").append(correlatedCustomText6)
				.append(",\n\tcorrelatedCustomText7: ").append(correlatedCustomText7)
				.append(",\n\tcorrelatedCustomText8: ").append(correlatedCustomText8)
				.append(",\n\tcorrelatedCustomText9: ").append(correlatedCustomText9)
				.append(",\n\tcorrelatedCustomTextBlock1: ").append(correlatedCustomTextBlock1)
				.append(",\n\tcorrelatedCustomTextBlock2: ").append(correlatedCustomTextBlock2)
				.append(",\n\tcorrelatedCustomTextBlock3: ").append(correlatedCustomTextBlock3)
				.append(",\n\tcostCenter: ").append(costCenter).append(",\n\tcountryID: ").append(countryID)
				.append(",\n\tcustomDate1: ").append(customDate1).append(",\n\tcustomDate2: ").append(customDate2)
				.append(",\n\tcustomDate3: ").append(customDate3).append(",\n\tcustomFloat1: ").append(customFloat1)
				.append(",\n\tcustomFloat2: ").append(customFloat2).append(",\n\tcustomFloat3: ").append(customFloat3)
				.append(",\n\tcustomInt1: ").append(customInt1).append(",\n\tcustomInt2: ").append(customInt2)
				.append(",\n\tcustomInt3: ").append(customInt3).append(",\n\tcustomText1: ").append(customText1)
				.append(",\n\tcustomText10: ").append(customText10).append(",\n\tcustomText11: ").append(customText11)
				.append(",\n\tcustomText12: ").append(customText12).append(",\n\tcustomText13: ").append(customText13)
				.append(",\n\tcustomText14: ").append(customText14).append(",\n\tcustomText15: ").append(customText15)
				.append(",\n\tcustomText15_display: ").append(customText15_display).append(",\n\tcustomText16: ")
				.append(customText16).append(",\n\tcustomText17: ").append(customText17).append(",\n\tcustomText18: ")
				.append(customText18).append(",\n\tcustomText19: ").append(customText19).append(",\n\tcustomText2: ")
				.append(customText2).append(",\n\tcustomText20: ").append(customText20).append(",\n\tcustomText3: ")
				.append(customText3).append(",\n\tcustomText4: ").append(customText4).append(",\n\tcustomText5: ")
				.append(customText5).append(",\n\tcustomText6: ").append(customText6).append(",\n\tcustomText7: ")
				.append(customText7).append(",\n\tcustomText8: ").append(customText8).append(",\n\tcustomText9: ")
				.append(customText9).append(",\n\tcustomTextBlock1: ").append(customTextBlock1)
				.append(",\n\tcustomTextBlock2: ").append(customTextBlock2).append(",\n\tcustomTextBlock3: ")
				.append(customTextBlock3).append(",\n\tcustomTextBlock4: ").append(customTextBlock4)
				.append(",\n\tcustomTextBlock5: ").append(customTextBlock5).append(",\n\tdealValue: ").append(dealValue)
				.append(",\n\tdegreeList: ").append(degreeList).append(",\n\tdescription: ").append(description)
				.append(",\n\tdistributionListID: ").append(distributionListID)
				.append(",\n\tdistributionListID_display: ").append(distributionListID_display)
				.append(",\n\teducationDegree: ").append(educationDegree).append(",\n\teffectiveDate: ")
				.append(effectiveDate).append(",\n\testimatedDuration: ").append(estimatedDuration)
				.append(",\n\testimatedEnd: ").append(estimatedEnd).append(",\n\testimatedHoursPerWeek: ")
				.append(estimatedHoursPerWeek).append(",\n\testimatedStart: ").append(estimatedStart)
				.append(",\n\texpectedBillRate: ").append(expectedBillRate).append(",\n\texpectedCloseDate: ")
				.append(expectedCloseDate).append(",\n\texpectedFee: ").append(expectedFee)
				.append(",\n\texpectedPayRate: ").append(expectedPayRate).append(",\n\texternalCategoryID: ")
				.append(externalCategoryID).append(",\n\texternalID: ").append(externalID)
				.append(",\n\thoursOfOperation: ").append(hoursOfOperation).append(",\n\tleadUserID: ")
				.append(leadUserID).append(",\n\tleadUserID_display: ").append(leadUserID_display)
				.append(",\n\tnotify: ").append(notify).append(",\n\tnotify_display: ").append(notify_display)
				.append(",\n\tnumOpenings: ").append(numOpenings).append(",\n\tonSite: ").append(onSite)
				.append(",\n\topportunityMarkUp: ").append(opportunityMarkUp).append(",\n\toptionsPackage: ")
				.append(optionsPackage).append(",\n\tprimaryBusinessSectorID: ").append(primaryBusinessSectorID)
				.append(",\n\tprimaryCategoryID: ").append(primaryCategoryID).append(",\n\tpriority: ").append(priority)
				.append(",\n\tpublicDescription: ").append(publicDescription).append(",\n\tpublishedZip: ")
				.append(publishedZip).append(",\n\treasonClosed: ").append(reasonClosed).append(",\n\treportTo: ")
				.append(reportTo).append(",\n\treportToUserID: ").append(reportToUserID).append(",\n\tresponseUserID: ")
				.append(responseUserID).append(",\n\tsalary: ").append(salary).append(",\n\tsalaryUnit: ")
				.append(salaryUnit).append(",\n\tskillID: ").append(skillID).append(",\n\tskills: ").append(skills)
				.append(",\n\tsource: ").append(source).append(",\n\tspecialty_categoryID: ")
				.append(specialty_categoryID).append(",\n\tstate: ").append(state).append(",\n\tstatus: ")
				.append(status).append(",\n\ttaxRate: ").append(taxRate).append(",\n\ttaxStatus: ").append(taxStatus)
				.append(",\n\ttitle: ").append(title).append(",\n\ttype: ").append(type).append(",\n\tuserID: ")
				.append(userID).append(",\n\tuserID_display: ").append(userID_display)
				.append(",\n\tweightedDealValue: ").append(weightedDealValue).append(",\n\twillRelocate: ")
				.append(willRelocate).append(",\n\twinProbabilityPercent: ").append(winProbabilityPercent)
				.append(",\n\tworkersCompRateID: ").append(workersCompRateID).append(",\n\tyearsRequired: ")
				.append(yearsRequired).append(",\n\tzip: ").append(zip).append("\n}");
		return builder.toString();
	}

}
