package com.client.core.formtrigger.model.form.impl;

import org.apache.log4j.Logger;

import com.bullhorn.entity.emb.Address1;
import com.bullhorn.entity.job.JobOrderDto;
import com.bullhornsdk.data.model.entity.core.standard.ClientContact;
import com.bullhornsdk.data.model.entity.core.standard.ClientCorporation;
import com.bullhornsdk.data.model.entity.core.standard.CorporateUser;
import com.bullhornsdk.data.model.entity.core.standard.JobOrder;
import com.bullhornsdk.data.model.entity.embedded.Address;
import com.client.core.formtrigger.model.form.AbstractFormDto;

public class FormJobOrderDto extends AbstractFormDto<JobOrder> {

	public FormJobOrderDto() {
		super(Logger.getLogger(FormJobOrderDto.class));
	}

	private Integer jobPostingID;
	private String address;
	private String assignments;
	private String benefits;
	private Integer billRateCategoryID;
	private String bonusPackage;
	private String branchCode;
	private Integer businessSectorID;
	private String businessSectorID_display;
	private String categoryID;
	private Integer certificationID;
	private String certifications;
	private String city;
	private String clientBillRate;
	private Integer clientCorporationID;
	private String clientCorporationID_display;
	private Integer clientUserID;
	private String clientUserID_display;
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
	private String correlatedCustomText2_display;
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
	private Integer countryID;
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
	private String customText16;
	private String customText17;
	private String customText18;
	private String customText19;
	private String customText2;
	private String customText20;
	private String customText3;
	private String customText4;
	private String customText5;
	private String customText5_display;
	private String customText6;
	private String customText7;
	private String customText8;
	private String customText9;
	private String customTextBlock1;
	private String customTextBlock2;
	private String customTextBlock3;
	private String customTextBlock4;
	private String customTextBlock5;
	private String dateEnd;
	private String degreeList;
	private String description;
	private Integer distributionListID;
	private String distributionListID_display;
	private String durationWeeks;
	private String educationDegree;
	private String employmentType;
	private Integer externalCategoryID;
	private String externalID;
	private String feeArrangement;
	private String hoursOfOperation;
	private String hoursPerWeek;
	private Boolean isClientEditable;
	private Boolean isInterviewRequired;
	private Boolean isOpen;
	private String isPublic;
	private String jobBoardList;
	private String markUpPercentage;
	private String notify;
	private String notify_display;
	private String numOpenings;
	private String onSite;
	private String optionsPackage;
	private String payRate;
	private String publicDescription;
	private String publishedZip;
	private String reasonClosed;
	private String reportTo;
	private Integer reportToUserID;
	private String reportToUserID_display;
	private Integer responseUserID;
	private String responseUserID_display;
	private String salary;
	private String salaryUnit;
	private Integer shiftID;
	private String skillID;
	private String skillID_display;
	private String skills;
	private String skills_display;
	private String source;
	private String specialty_categoryID;
	private String specialty_categoryID_display;
	private String startDate;
	private String state;
	private String state_display;
	private String status;
	private String taxRate;
	private String taxStatus;
	private String title;
	private String travelRequirements;
	private Integer type;
	private Integer userID;
	private String userID_display;
	private String willRelocate;
	private String willSponsor;
	private Integer workersCompRateID;
	private String yearsRequired;
	private String zip;

	public Integer getJobPostingID() {
		return jobPostingID;
	}

	public void setJobPostingID(Integer jobPostingID) {
		this.jobPostingID = jobPostingID;
	}

	public String getJobPosting_address() {
		return address;
	}

	public void setJobPosting_address(String address) {
		this.address = address;
	}

	public String getJobPosting_assignments() {
		return assignments;
	}

	public void setJobPosting_assignments(String assignments) {
		this.assignments = assignments;
	}

	public String getJobPosting_benefits() {
		return benefits;
	}

	public void setJobPosting_benefits(String benefits) {
		this.benefits = benefits;
	}

	public Integer getJobPosting_billRateCategoryID() {
		return billRateCategoryID;
	}

	public void setJobPosting_billRateCategoryID(Integer billRateCategoryID) {
		this.billRateCategoryID = billRateCategoryID;
	}

	public String getJobPosting_bonusPackage() {
		return bonusPackage;
	}

	public void setJobPosting_bonusPackage(String bonusPackage) {
		this.bonusPackage = bonusPackage;
	}

	public String getJobPosting_branchCode() {
		return branchCode;
	}

	public void setJobPosting_branchCode(String branchCode) {
		this.branchCode = branchCode;
	}

	public Integer getJobPosting_businessSectorID() {
		return businessSectorID;
	}

	public void setJobPosting_businessSectorID(Integer businessSectorID) {
		this.businessSectorID = businessSectorID;
	}

	public String getJobPosting_businessSectorID_display() {
		return businessSectorID_display;
	}

	public void setJobPosting_businessSectorID_display(String businessSectorID_display) {
		this.businessSectorID_display = businessSectorID_display;
	}

	public String getJobPosting_categoryID() {
		return categoryID;
	}

	public void setJobPosting_categoryID(String categoryID) {
		this.categoryID = categoryID;
	}

	public Integer getJobPosting_certificationID() {
		return certificationID;
	}

	public void setJobPosting_certificationID(Integer certificationID) {
		this.certificationID = certificationID;
	}

	public String getJobPosting_certifications() {
		return certifications;
	}

	public void setJobPosting_certifications(String certifications) {
		this.certifications = certifications;
	}

	public String getJobPosting_city() {
		return city;
	}

	public void setJobPosting_city(String city) {
		this.city = city;
	}

	public String getJobPosting_clientBillRate() {
		return clientBillRate;
	}

	public void setJobPosting_clientBillRate(String clientBillRate) {
		this.clientBillRate = clientBillRate;
	}

	public Integer getJobPosting_clientCorporationID() {
		return clientCorporationID;
	}

	public void setJobPosting_clientCorporationID(Integer clientCorporationID) {
		this.clientCorporationID = clientCorporationID;
	}

	public String getJobPosting_clientCorporationID_display() {
		return clientCorporationID_display;
	}

	public void setJobPosting_clientCorporationID_display(String clientCorporationID_display) {
		this.clientCorporationID_display = clientCorporationID_display;
	}

	public Integer getJobPosting_clientUserID() {
		return clientUserID;
	}

	public void setJobPosting_clientUserID(Integer clientUserID) {
		this.clientUserID = clientUserID;
	}

	public String getJobPosting_clientUserID_display() {
		return clientUserID_display;
	}

	public void setJobPosting_clientUserID_display(String clientUserID_display) {
		this.clientUserID_display = clientUserID_display;
	}

	public String getJobPosting_correlatedCustomDate1() {
		return correlatedCustomDate1;
	}

	public void setJobPosting_correlatedCustomDate1(String correlatedCustomDate1) {
		this.correlatedCustomDate1 = correlatedCustomDate1;
	}

	public String getJobPosting_correlatedCustomDate2() {
		return correlatedCustomDate2;
	}

	public void setJobPosting_correlatedCustomDate2(String correlatedCustomDate2) {
		this.correlatedCustomDate2 = correlatedCustomDate2;
	}

	public String getJobPosting_correlatedCustomDate3() {
		return correlatedCustomDate3;
	}

	public void setJobPosting_correlatedCustomDate3(String correlatedCustomDate3) {
		this.correlatedCustomDate3 = correlatedCustomDate3;
	}

	public String getJobPosting_correlatedCustomFloat1() {
		return correlatedCustomFloat1;
	}

	public void setJobPosting_correlatedCustomFloat1(String correlatedCustomFloat1) {
		this.correlatedCustomFloat1 = correlatedCustomFloat1;
	}

	public String getJobPosting_correlatedCustomFloat2() {
		return correlatedCustomFloat2;
	}

	public void setJobPosting_correlatedCustomFloat2(String correlatedCustomFloat2) {
		this.correlatedCustomFloat2 = correlatedCustomFloat2;
	}

	public String getJobPosting_correlatedCustomFloat3() {
		return correlatedCustomFloat3;
	}

	public void setJobPosting_correlatedCustomFloat3(String correlatedCustomFloat3) {
		this.correlatedCustomFloat3 = correlatedCustomFloat3;
	}

	public String getJobPosting_correlatedCustomInt1() {
		return correlatedCustomInt1;
	}

	public void setJobPosting_correlatedCustomInt1(String correlatedCustomInt1) {
		this.correlatedCustomInt1 = correlatedCustomInt1;
	}

	public String getJobPosting_correlatedCustomInt2() {
		return correlatedCustomInt2;
	}

	public void setJobPosting_correlatedCustomInt2(String correlatedCustomInt2) {
		this.correlatedCustomInt2 = correlatedCustomInt2;
	}

	public String getJobPosting_correlatedCustomInt3() {
		return correlatedCustomInt3;
	}

	public void setJobPosting_correlatedCustomInt3(String correlatedCustomInt3) {
		this.correlatedCustomInt3 = correlatedCustomInt3;
	}

	public String getJobPosting_correlatedCustomText1() {
		return correlatedCustomText1;
	}

	public void setJobPosting_correlatedCustomText1(String correlatedCustomText1) {
		this.correlatedCustomText1 = correlatedCustomText1;
	}

	public String getJobPosting_correlatedCustomText10() {
		return correlatedCustomText10;
	}

	public void setJobPosting_correlatedCustomText10(String correlatedCustomText10) {
		this.correlatedCustomText10 = correlatedCustomText10;
	}

	public String getJobPosting_correlatedCustomText2() {
		return correlatedCustomText2;
	}

	public void setJobPosting_correlatedCustomText2(String correlatedCustomText2) {
		this.correlatedCustomText2 = correlatedCustomText2;
	}

	public String getJobPosting_correlatedCustomText2_display() {
		return correlatedCustomText2_display;
	}

	public void setJobPosting_correlatedCustomText2_display(String correlatedCustomText2_display) {
		this.correlatedCustomText2_display = correlatedCustomText2_display;
	}

	public String getJobPosting_correlatedCustomText3() {
		return correlatedCustomText3;
	}

	public void setJobPosting_correlatedCustomText3(String correlatedCustomText3) {
		this.correlatedCustomText3 = correlatedCustomText3;
	}

	public String getJobPosting_correlatedCustomText4() {
		return correlatedCustomText4;
	}

	public void setJobPosting_correlatedCustomText4(String correlatedCustomText4) {
		this.correlatedCustomText4 = correlatedCustomText4;
	}

	public String getJobPosting_correlatedCustomText5() {
		return correlatedCustomText5;
	}

	public void setJobPosting_correlatedCustomText5(String correlatedCustomText5) {
		this.correlatedCustomText5 = correlatedCustomText5;
	}

	public String getJobPosting_correlatedCustomText6() {
		return correlatedCustomText6;
	}

	public void setJobPosting_correlatedCustomText6(String correlatedCustomText6) {
		this.correlatedCustomText6 = correlatedCustomText6;
	}

	public String getJobPosting_correlatedCustomText7() {
		return correlatedCustomText7;
	}

	public void setJobPosting_correlatedCustomText7(String correlatedCustomText7) {
		this.correlatedCustomText7 = correlatedCustomText7;
	}

	public String getJobPosting_correlatedCustomText8() {
		return correlatedCustomText8;
	}

	public void setJobPosting_correlatedCustomText8(String correlatedCustomText8) {
		this.correlatedCustomText8 = correlatedCustomText8;
	}

	public String getJobPosting_correlatedCustomText9() {
		return correlatedCustomText9;
	}

	public void setJobPosting_correlatedCustomText9(String correlatedCustomText9) {
		this.correlatedCustomText9 = correlatedCustomText9;
	}

	public String getJobPosting_correlatedCustomTextBlock1() {
		return correlatedCustomTextBlock1;
	}

	public void setJobPosting_correlatedCustomTextBlock1(String correlatedCustomTextBlock1) {
		this.correlatedCustomTextBlock1 = correlatedCustomTextBlock1;
	}

	public String getJobPosting_correlatedCustomTextBlock2() {
		return correlatedCustomTextBlock2;
	}

	public void setJobPosting_correlatedCustomTextBlock2(String correlatedCustomTextBlock2) {
		this.correlatedCustomTextBlock2 = correlatedCustomTextBlock2;
	}

	public String getJobPosting_correlatedCustomTextBlock3() {
		return correlatedCustomTextBlock3;
	}

	public void setJobPosting_correlatedCustomTextBlock3(String correlatedCustomTextBlock3) {
		this.correlatedCustomTextBlock3 = correlatedCustomTextBlock3;
	}

	public String getJobPosting_costCenter() {
		return costCenter;
	}

	public void setJobPosting_costCenter(String costCenter) {
		this.costCenter = costCenter;
	}

	public Integer getJobPosting_countryID() {
		return countryID;
	}

	public void setJobPosting_countryID(Integer countryID) {
		this.countryID = countryID;
	}

	public String getJobPosting_customDate1() {
		return customDate1;
	}

	public void setJobPosting_customDate1(String customDate1) {
		this.customDate1 = customDate1;
	}

	public String getJobPosting_customDate2() {
		return customDate2;
	}

	public void setJobPosting_customDate2(String customDate2) {
		this.customDate2 = customDate2;
	}

	public String getJobPosting_customDate3() {
		return customDate3;
	}

	public void setJobPosting_customDate3(String customDate3) {
		this.customDate3 = customDate3;
	}

	public String getJobPosting_customFloat1() {
		return customFloat1;
	}

	public void setJobPosting_customFloat1(String customFloat1) {
		this.customFloat1 = customFloat1;
	}

	public String getJobPosting_customFloat2() {
		return customFloat2;
	}

	public void setJobPosting_customFloat2(String customFloat2) {
		this.customFloat2 = customFloat2;
	}

	public String getJobPosting_customFloat3() {
		return customFloat3;
	}

	public void setJobPosting_customFloat3(String customFloat3) {
		this.customFloat3 = customFloat3;
	}

	public String getJobPosting_customInt1() {
		return customInt1;
	}

	public void setJobPosting_customInt1(String customInt1) {
		this.customInt1 = customInt1;
	}

	public String getJobPosting_customInt2() {
		return customInt2;
	}

	public void setJobPosting_customInt2(String customInt2) {
		this.customInt2 = customInt2;
	}

	public String getJobPosting_customInt3() {
		return customInt3;
	}

	public void setJobPosting_customInt3(String customInt3) {
		this.customInt3 = customInt3;
	}

	public String getJobPosting_customText1() {
		return customText1;
	}

	public void setJobPosting_customText1(String customText1) {
		this.customText1 = customText1;
	}

	public String getJobPosting_customText10() {
		return customText10;
	}

	public void setJobPosting_customText10(String customText10) {
		this.customText10 = customText10;
	}

	public String getJobPosting_customText11() {
		return customText11;
	}

	public void setJobPosting_customText11(String customText11) {
		this.customText11 = customText11;
	}

	public String getJobPosting_customText12() {
		return customText12;
	}

	public void setJobPosting_customText12(String customText12) {
		this.customText12 = customText12;
	}

	public String getJobPosting_customText13() {
		return customText13;
	}

	public void setJobPosting_customText13(String customText13) {
		this.customText13 = customText13;
	}

	public String getJobPosting_customText14() {
		return customText14;
	}

	public void setJobPosting_customText14(String customText14) {
		this.customText14 = customText14;
	}

	public String getJobPosting_customText15() {
		return customText15;
	}

	public void setJobPosting_customText15(String customText15) {
		this.customText15 = customText15;
	}

	public String getJobPosting_customText16() {
		return customText16;
	}

	public void setJobPosting_customText16(String customText16) {
		this.customText16 = customText16;
	}

	public String getJobPosting_customText17() {
		return customText17;
	}

	public void setJobPosting_customText17(String customText17) {
		this.customText17 = customText17;
	}

	public String getJobPosting_customText18() {
		return customText18;
	}

	public void setJobPosting_customText18(String customText18) {
		this.customText18 = customText18;
	}

	public String getJobPosting_customText19() {
		return customText19;
	}

	public void setJobPosting_customText19(String customText19) {
		this.customText19 = customText19;
	}

	public String getJobPosting_customText2() {
		return customText2;
	}

	public void setJobPosting_customText2(String customText2) {
		this.customText2 = customText2;
	}

	public String getJobPosting_customText20() {
		return customText20;
	}

	public void setJobPosting_customText20(String customText20) {
		this.customText20 = customText20;
	}

	public String getJobPosting_customText3() {
		return customText3;
	}

	public void setJobPosting_customText3(String customText3) {
		this.customText3 = customText3;
	}

	public String getJobPosting_customText4() {
		return customText4;
	}

	public void setJobPosting_customText4(String customText4) {
		this.customText4 = customText4;
	}

	public String getJobPosting_customText5() {
		return customText5;
	}

	public void setJobPosting_customText5(String customText5) {
		this.customText5 = customText5;
	}

	public String getJobPosting_customText5_display() {
		return customText5_display;
	}

	public void setJobPosting_customText5_display(String customText5_display) {
		this.customText5_display = customText5_display;
	}

	public String getJobPosting_customText6() {
		return customText6;
	}

	public void setJobPosting_customText6(String customText6) {
		this.customText6 = customText6;
	}

	public String getJobPosting_customText7() {
		return customText7;
	}

	public void setJobPosting_customText7(String customText7) {
		this.customText7 = customText7;
	}

	public String getJobPosting_customText8() {
		return customText8;
	}

	public void setJobPosting_customText8(String customText8) {
		this.customText8 = customText8;
	}

	public String getJobPosting_customText9() {
		return customText9;
	}

	public void setJobPosting_customText9(String customText9) {
		this.customText9 = customText9;
	}

	public String getJobPosting_customTextBlock1() {
		return customTextBlock1;
	}

	public void setJobPosting_customTextBlock1(String customTextBlock1) {
		this.customTextBlock1 = customTextBlock1;
	}

	public String getJobPosting_customTextBlock2() {
		return customTextBlock2;
	}

	public void setJobPosting_customTextBlock2(String customTextBlock2) {
		this.customTextBlock2 = customTextBlock2;
	}

	public String getJobPosting_customTextBlock3() {
		return customTextBlock3;
	}

	public void setJobPosting_customTextBlock3(String customTextBlock3) {
		this.customTextBlock3 = customTextBlock3;
	}

	public String getJobPosting_customTextBlock4() {
		return customTextBlock4;
	}

	public void setJobPosting_customTextBlock4(String customTextBlock4) {
		this.customTextBlock4 = customTextBlock4;
	}

	public String getJobPosting_customTextBlock5() {
		return customTextBlock5;
	}

	public void setJobPosting_customTextBlock5(String customTextBlock5) {
		this.customTextBlock5 = customTextBlock5;
	}

	public String getJobPosting_dateEnd() {
		return dateEnd;
	}

	public void setJobPosting_dateEnd(String dateEnd) {
		this.dateEnd = dateEnd;
	}

	public String getJobPosting_degreeList() {
		return degreeList;
	}

	public void setJobPosting_degreeList(String degreeList) {
		this.degreeList = degreeList;
	}

	public String getJobPosting_description() {
		return description;
	}

	public void setJobPosting_description(String description) {
		this.description = description;
	}

	public Integer getJobPosting_distributionListID() {
		return distributionListID;
	}

	public void setJobPosting_distributionListID(Integer distributionListID) {
		this.distributionListID = distributionListID;
	}

	public String getJobPosting_distributionListID_display() {
		return distributionListID_display;
	}

	public void setJobPosting_distributionListID_display(String distributionListID_display) {
		this.distributionListID_display = distributionListID_display;
	}

	public String getJobPosting_durationWeeks() {
		return durationWeeks;
	}

	public void setJobPosting_durationWeeks(String durationWeeks) {
		this.durationWeeks = durationWeeks;
	}

	public String getJobPosting_educationDegree() {
		return educationDegree;
	}

	public void setJobPosting_educationDegree(String educationDegree) {
		this.educationDegree = educationDegree;
	}

	public String getJobPosting_employmentType() {
		return employmentType;
	}

	public void setJobPosting_employmentType(String employmentType) {
		this.employmentType = employmentType;
	}

	public Integer getJobPosting_externalCategoryID() {
		return externalCategoryID;
	}

	public void setJobPosting_externalCategoryID(Integer externalCategoryID) {
		this.externalCategoryID = externalCategoryID;
	}

	public String getJobPosting_externalID() {
		return externalID;
	}

	public void setJobPosting_externalID(String externalID) {
		this.externalID = externalID;
	}

	public String getJobPosting_feeArrangement() {
		return feeArrangement;
	}

	public void setJobPosting_feeArrangement(String feeArrangement) {
		this.feeArrangement = feeArrangement;
	}

	public String getJobPosting_hoursOfOperation() {
		return hoursOfOperation;
	}

	public void setJobPosting_hoursOfOperation(String hoursOfOperation) {
		this.hoursOfOperation = hoursOfOperation;
	}

	public String getJobPosting_hoursPerWeek() {
		return hoursPerWeek;
	}

	public void setJobPosting_hoursPerWeek(String hoursPerWeek) {
		this.hoursPerWeek = hoursPerWeek;
	}

	public Boolean getJobPosting_isClientEditable() {
		return isClientEditable;
	}

	public void setJobPosting_isClientEditable(Boolean isClientEditable) {
		this.isClientEditable = isClientEditable;
	}

	public Boolean getJobPosting_isInterviewRequired() {
		return isInterviewRequired;
	}

	public void setJobPosting_isInterviewRequired(Boolean isInterviewRequired) {
		this.isInterviewRequired = isInterviewRequired;
	}

	public Boolean getJobPosting_isOpen() {
		return isOpen;
	}

	public void setJobPosting_isOpen(Boolean isOpen) {
		this.isOpen = isOpen;
	}

	public String getJobPosting_isPublic() {
		return isPublic;
	}

	public void setJobPosting_isPublic(String isPublic) {
		this.isPublic = isPublic;
	}

	public String getJobPosting_jobBoardList() {
		return jobBoardList;
	}

	public void setJobPosting_jobBoardList(String jobBoardList) {
		this.jobBoardList = jobBoardList;
	}

	public String getJobPosting_markUpPercentage() {
		return markUpPercentage;
	}

	public void setJobPosting_markUpPercentage(String markUpPercentage) {
		this.markUpPercentage = markUpPercentage;
	}

	public String getJobPosting_notify() {
		return notify;
	}

	public void setJobPosting_notify(String notify) {
		this.notify = notify;
	}

	public String getJobPosting_notify_display() {
		return notify_display;
	}

	public void setJobPosting_notify_display(String notify_display) {
		this.notify_display = notify_display;
	}

	public String getJobPosting_numOpenings() {
		return numOpenings;
	}

	public void setJobPosting_numOpenings(String numOpenings) {
		this.numOpenings = numOpenings;
	}

	public String getJobPosting_onSite() {
		return onSite;
	}

	public void setJobPosting_onSite(String onSite) {
		this.onSite = onSite;
	}

	public String getJobPosting_optionsPackage() {
		return optionsPackage;
	}

	public void setJobPosting_optionsPackage(String optionsPackage) {
		this.optionsPackage = optionsPackage;
	}

	public String getJobPosting_payRate() {
		return payRate;
	}

	public void setJobPosting_payRate(String payRate) {
		this.payRate = payRate;
	}

	public String getJobPosting_publicDescription() {
		return publicDescription;
	}

	public void setJobPosting_publicDescription(String publicDescription) {
		this.publicDescription = publicDescription;
	}

	public String getJobPosting_publishedZip() {
		return publishedZip;
	}

	public void setJobPosting_publishedZip(String publishedZip) {
		this.publishedZip = publishedZip;
	}

	public String getJobPosting_reasonClosed() {
		return reasonClosed;
	}

	public void setJobPosting_reasonClosed(String reasonClosed) {
		this.reasonClosed = reasonClosed;
	}

	public String getJobPosting_reportTo() {
		return reportTo;
	}

	public void setJobPosting_reportTo(String reportTo) {
		this.reportTo = reportTo;
	}

	public Integer getJobPosting_reportToUserID() {
		return reportToUserID;
	}

	public void setJobPosting_reportToUserID(Integer reportToUserID) {
		this.reportToUserID = reportToUserID;
	}

	public String getJobPosting_reportToUserID_display() {
		return reportToUserID_display;
	}

	public void setJobPosting_reportToUserID_display(String reportToUserID_display) {
		this.reportToUserID_display = reportToUserID_display;
	}

	public Integer getJobPosting_responseUserID() {
		return responseUserID;
	}

	public void setJobPosting_responseUserID(Integer responseUserID) {
		this.responseUserID = responseUserID;
	}

	public String getJobPosting_responseUserID_display() {
		return responseUserID_display;
	}

	public void setJobPosting_responseUserID_display(String responseUserID_display) {
		this.responseUserID_display = responseUserID_display;
	}

	public String getJobPosting_salary() {
		return salary;
	}

	public void setJobPosting_salary(String salary) {
		this.salary = salary;
	}

	public String getJobPosting_salaryUnit() {
		return salaryUnit;
	}

	public void setJobPosting_salaryUnit(String salaryUnit) {
		this.salaryUnit = salaryUnit;
	}

	public Integer getJobPosting_shiftID() {
		return shiftID;
	}

	public void setJobPosting_shiftID(Integer shiftID) {
		this.shiftID = shiftID;
	}

	public String getJobPosting_skillID() {
		return skillID;
	}

	public void setJobPosting_skillID(String skillID) {
		this.skillID = skillID;
	}

	public String getJobPosting_skillID_display() {
		return skillID_display;
	}

	public void setJobPosting_skillID_display(String skillID_display) {
		this.skillID_display = skillID_display;
	}

	public String getJobPosting_skills() {
		return skills;
	}

	public void setJobPosting_skills(String skills) {
		this.skills = skills;
	}

	public String getJobPosting_skills_display() {
		return skills_display;
	}

	public void setJobPosting_skills_display(String skills_display) {
		this.skills_display = skills_display;
	}

	public String getJobPosting_source() {
		return source;
	}

	public void setJobPosting_source(String source) {
		this.source = source;
	}

	public String getJobPosting_specialty_categoryID() {
		return specialty_categoryID;
	}

	public void setJobPosting_specialty_categoryID(String specialty_categoryID) {
		this.specialty_categoryID = specialty_categoryID;
	}

	public String getJobPosting_specialty_categoryID_display() {
		return specialty_categoryID_display;
	}

	public void setJobPosting_specialty_categoryID_display(String specialty_categoryID_display) {
		this.specialty_categoryID_display = specialty_categoryID_display;
	}

	public String getJobPosting_startDate() {
		return startDate;
	}

	public void setJobPosting_startDate(String startDate) {
		this.startDate = startDate;
	}

	public String getJobPosting_state() {
		return state;
	}

	public void setJobPosting_state(String state) {
		this.state = state;
	}

	public String getJobPosting_state_display() {
		return state_display;
	}

	public void setJobPosting_state_display(String state_display) {
		this.state_display = state_display;
	}

	public String getJobPosting_status() {
		return status;
	}

	public void setJobPosting_status(String status) {
		this.status = status;
	}

	public String getJobPosting_taxRate() {
		return taxRate;
	}

	public void setJobPosting_taxRate(String taxRate) {
		this.taxRate = taxRate;
	}

	public String getJobPosting_taxStatus() {
		return taxStatus;
	}

	public void setJobPosting_taxStatus(String taxStatus) {
		this.taxStatus = taxStatus;
	}

	public String getJobPosting_title() {
		return title;
	}

	public void setJobPosting_title(String title) {
		this.title = title;
	}

	public String getJobPosting_travelRequirements() {
		return travelRequirements;
	}

	public void setJobPosting_travelRequirements(String travelRequirements) {
		this.travelRequirements = travelRequirements;
	}

	public Integer getJobPosting_type() {
		return type;
	}

	public void setJobPosting_type(Integer type) {
		this.type = type;
	}

	public Integer getJobPosting_userID() {
		return userID;
	}

	public void setJobPosting_userID(Integer userID) {
		this.userID = userID;
	}

	public String getJobPosting_userID_display() {
		return userID_display;
	}

	public void setJobPosting_userID_display(String userID_display) {
		this.userID_display = userID_display;
	}

	public String getJobPosting_willRelocate() {
		return willRelocate;
	}

	public void setJobPosting_willRelocate(String willRelocate) {
		this.willRelocate = willRelocate;
	}

	public String getJobPosting_willSponsor() {
		return willSponsor;
	}

	public void setJobPosting_willSponsor(String willSponsor) {
		this.willSponsor = willSponsor;
	}

	public Integer getJobPosting_workersCompRateID() {
		return workersCompRateID;
	}

	public void setJobPosting_workersCompRateID(Integer workersCompRateID) {
		this.workersCompRateID = workersCompRateID;
	}

	public String getJobPosting_yearsRequired() {
		return yearsRequired;
	}

	public void setJobPosting_yearsRequired(String yearsRequired) {
		this.yearsRequired = yearsRequired;
	}

	public String getJobPosting_zip() {
		return zip;
	}

	public void setJobPosting_zip(String zip) {
		this.zip = zip;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getAssignments() {
		return assignments;
	}

	public void setAssignments(String assignments) {
		this.assignments = assignments;
	}

	public String getBenefits() {
		return benefits;
	}

	public void setBenefits(String benefits) {
		this.benefits = benefits;
	}

	public Integer getBillRateCategoryID() {
		return billRateCategoryID;
	}

	public void setBillRateCategoryID(Integer billRateCategoryID) {
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

	public Integer getBusinessSectorID() {
		return businessSectorID;
	}

	public void setBusinessSectorID(Integer businessSectorID) {
		this.businessSectorID = businessSectorID;
	}

	public String getBusinessSectorID_display() {
		return businessSectorID_display;
	}

	public void setBusinessSectorID_display(String businessSectorID_display) {
		this.businessSectorID_display = businessSectorID_display;
	}

	public String getCategoryID() {
		return categoryID;
	}

	public void setCategoryID(String categoryID) {
		this.categoryID = categoryID;
	}

	public Integer getCertificationID() {
		return certificationID;
	}

	public void setCertificationID(Integer certificationID) {
		this.certificationID = certificationID;
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

	public String getClientBillRate() {
		return clientBillRate;
	}

	public void setClientBillRate(String clientBillRate) {
		this.clientBillRate = clientBillRate;
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

	public String getCorrelatedCustomText2_display() {
		return correlatedCustomText2_display;
	}

	public void setCorrelatedCustomText2_display(String correlatedCustomText2_display) {
		this.correlatedCustomText2_display = correlatedCustomText2_display;
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

	public String getCustomText5_display() {
		return customText5_display;
	}

	public void setCustomText5_display(String customText5_display) {
		this.customText5_display = customText5_display;
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

	public String getDateEnd() {
		return dateEnd;
	}

	public void setDateEnd(String dateEnd) {
		this.dateEnd = dateEnd;
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

	public Integer getDistributionListID() {
		return distributionListID;
	}

	public void setDistributionListID(Integer distributionListID) {
		this.distributionListID = distributionListID;
	}

	public String getDistributionListID_display() {
		return distributionListID_display;
	}

	public void setDistributionListID_display(String distributionListID_display) {
		this.distributionListID_display = distributionListID_display;
	}

	public String getDurationWeeks() {
		return durationWeeks;
	}

	public void setDurationWeeks(String durationWeeks) {
		this.durationWeeks = durationWeeks;
	}

	public String getEducationDegree() {
		return educationDegree;
	}

	public void setEducationDegree(String educationDegree) {
		this.educationDegree = educationDegree;
	}

	public String getEmploymentType() {
		return employmentType;
	}

	public void setEmploymentType(String employmentType) {
		this.employmentType = employmentType;
	}

	public Integer getExternalCategoryID() {
		return externalCategoryID;
	}

	public void setExternalCategoryID(Integer externalCategoryID) {
		this.externalCategoryID = externalCategoryID;
	}

	public String getExternalID() {
		return externalID;
	}

	public void setExternalID(String externalID) {
		this.externalID = externalID;
	}

	public String getFeeArrangement() {
		return feeArrangement;
	}

	public void setFeeArrangement(String feeArrangement) {
		this.feeArrangement = feeArrangement;
	}

	public String getHoursOfOperation() {
		return hoursOfOperation;
	}

	public void setHoursOfOperation(String hoursOfOperation) {
		this.hoursOfOperation = hoursOfOperation;
	}

	public String getHoursPerWeek() {
		return hoursPerWeek;
	}

	public void setHoursPerWeek(String hoursPerWeek) {
		this.hoursPerWeek = hoursPerWeek;
	}

	public Boolean getIsClientEditable() {
		return isClientEditable;
	}

	public void setIsClientEditable(Boolean isClientEditable) {
		this.isClientEditable = isClientEditable;
	}

	public Boolean getIsInterviewRequired() {
		return isInterviewRequired;
	}

	public void setIsInterviewRequired(Boolean isInterviewRequired) {
		this.isInterviewRequired = isInterviewRequired;
	}

	public Boolean getIsOpen() {
		return isOpen;
	}

	public void setIsOpen(Boolean isOpen) {
		this.isOpen = isOpen;
	}

	public String getIsPublic() {
		return isPublic;
	}

	public void setIsPublic(String isPublic) {
		this.isPublic = isPublic;
	}

	public String getJobBoardList() {
		return jobBoardList;
	}

	public void setJobBoardList(String jobBoardList) {
		this.jobBoardList = jobBoardList;
	}

	public String getMarkUpPercentage() {
		return markUpPercentage;
	}

	public void setMarkUpPercentage(String markUpPercentage) {
		this.markUpPercentage = markUpPercentage;
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

	public String getOptionsPackage() {
		return optionsPackage;
	}

	public void setOptionsPackage(String optionsPackage) {
		this.optionsPackage = optionsPackage;
	}

	public String getPayRate() {
		return payRate;
	}

	public void setPayRate(String payRate) {
		this.payRate = payRate;
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

	public Integer getReportToUserID() {
		return reportToUserID;
	}

	public void setReportToUserID(Integer reportToUserID) {
		this.reportToUserID = reportToUserID;
	}

	public String getReportToUserID_display() {
		return reportToUserID_display;
	}

	public void setReportToUserID_display(String reportToUserID_display) {
		this.reportToUserID_display = reportToUserID_display;
	}

	public Integer getResponseUserID() {
		return responseUserID;
	}

	public void setResponseUserID(Integer responseUserID) {
		this.responseUserID = responseUserID;
	}

	public String getResponseUserID_display() {
		return responseUserID_display;
	}

	public void setResponseUserID_display(String responseUserID_display) {
		this.responseUserID_display = responseUserID_display;
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

	public Integer getShiftID() {
		return shiftID;
	}

	public void setShiftID(Integer shiftID) {
		this.shiftID = shiftID;
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

	public String getSkills() {
		return skills;
	}

	public void setSkills(String skills) {
		this.skills = skills;
	}

	public String getSkills_display() {
		return skills_display;
	}

	public void setSkills_display(String skills_display) {
		this.skills_display = skills_display;
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

	public String getSpecialty_categoryID_display() {
		return specialty_categoryID_display;
	}

	public void setSpecialty_categoryID_display(String specialty_categoryID_display) {
		this.specialty_categoryID_display = specialty_categoryID_display;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
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

	public String getTravelRequirements() {
		return travelRequirements;
	}

	public void setTravelRequirements(String travelRequirements) {
		this.travelRequirements = travelRequirements;
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
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

	public String getWillRelocate() {
		return willRelocate;
	}

	public void setWillRelocate(String willRelocate) {
		this.willRelocate = willRelocate;
	}

	public String getWillSponsor() {
		return willSponsor;
	}

	public void setWillSponsor(String willSponsor) {
		this.willSponsor = willSponsor;
	}

	public Integer getWorkersCompRateID() {
		return workersCompRateID;
	}

	public void setWorkersCompRateID(Integer workersCompRateID) {
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

	@Override
	public JobOrder instantiateEntity() {
		JobOrder jobOrder = new JobOrder();

		jobOrder.setBenefits(benefits);
		jobOrder.setBillRateCategoryID(billRateCategoryID);
		jobOrder.setBonusPackage(bonusPackage);
		jobOrder.setBranchCode(branchCode);
		jobOrder.setCertificationList(certifications);
		jobOrder.setClientBillRate(toBigDecimal(clientBillRate, "clientBillRate"));
		jobOrder.setClientContact(new ClientContact(clientUserID));
		jobOrder.setClientCorporation(new ClientCorporation(clientCorporationID));
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
		jobOrder.setDateEnd(stringToDateTime(dateEnd));
		jobOrder.setDegreeList(degreeList);
		jobOrder.setDescription(description);
		jobOrder.setDurationWeeks(toBigDecimal(durationWeeks, "durationWeeks"));

		jobOrder.setEducationDegree(educationDegree);
		jobOrder.setEmploymentType(employmentType);
		jobOrder.setExternalCategoryID(externalCategoryID);
		jobOrder.setExternalID(externalID);
		jobOrder.setFeeArrangement(toBigDecimal(feeArrangement, "feeArrangement"));
		jobOrder.setHoursOfOperation(hoursOfOperation);
		jobOrder.setHoursPerWeek(toBigDecimal(hoursPerWeek, "hoursPerWeek"));
		jobOrder.setIsClientEditable(isClientEditable);
		jobOrder.setIsDeleted(false);
		jobOrder.setIsInterviewRequired(isInterviewRequired);
		jobOrder.setIsOpen(isOpen);
		jobOrder.setIsPublic(toInteger(isPublic, "isPublic"));
		jobOrder.setJobBoardList(jobBoardList);
		jobOrder.setId(jobPostingID);
		jobOrder.setNumOpenings(toInteger(numOpenings, "numOpenings"));
		jobOrder.setOnSite(onSite);
		jobOrder.setOptionsPackage(optionsPackage);
		jobOrder.setOwner(new CorporateUser(userID));
		jobOrder.setPayRate(toBigDecimal(payRate, "payRate"));
		jobOrder.setPublicDescription(publicDescription);
		jobOrder.setPublishedZip(publishedZip);
		jobOrder.setReasonClosed(reasonClosed);
		jobOrder.setReportTo(reportTo);
		jobOrder.setReportToClientContact(new ClientContact(reportToUserID));
		jobOrder.setResponseUser(new CorporateUser(responseUserID));
		jobOrder.setSalary(toBigDecimal(salary, "salary"));
		jobOrder.setSalaryUnit(salaryUnit);

		jobOrder.setSkillList(skills);
		jobOrder.setSource(source);
		jobOrder.setStartDate(stringToDateTime(startDate));
		jobOrder.setStatus(status);
		jobOrder.setTaxRate(toBigDecimal(taxRate, "taxRate"));
		jobOrder.setTaxStatus(taxStatus);
		jobOrder.setTitle(title);
		jobOrder.setTravelRequirements(travelRequirements);
		jobOrder.setType(type);
		jobOrder.setWillRelocate(willRelocate == null ? null : willRelocate == "1");
		jobOrder.setWillSponsor(willSponsor == null ? null : willSponsor == "1");

		jobOrder.setYearsRequired(toInteger(yearsRequired, "yearsRequired"));

		jobOrder.setAddress(new Address());
		jobOrder.getAddress().setAddress1(address);
		jobOrder.getAddress().setCity(city);
		jobOrder.getAddress().setCountryID(countryID);
		jobOrder.getAddress().setState(state);
		jobOrder.getAddress().setZip(zip);

		return jobOrder;
	}

    public static FormJobOrderDto instantiateFromJobOrder(JobOrder jobOrder){

        FormJobOrderDto formJobOrderDto = new FormJobOrderDto();
        formJobOrderDto.setBenefits(jobOrder.getBenefits());
        formJobOrderDto.setBillRateCategoryID(jobOrder.getBillRateCategoryID());
        formJobOrderDto.setBonusPackage(jobOrder.getBonusPackage());
        formJobOrderDto.setBranchCode(jobOrder.getBranchCode());
        formJobOrderDto.setCertifications(jobOrder.getCertificationList());
        formJobOrderDto.setClientBillRate(makeString(jobOrder.getClientBillRate()));
        formJobOrderDto.setClientUserID(jobOrder.getClientContact().getId());
        formJobOrderDto.setClientCorporationID(jobOrder.getClientCorporation().getId());
        formJobOrderDto.setCorrelatedCustomDate1(makeString(jobOrder.getCorrelatedCustomDate1()));
        formJobOrderDto.setCorrelatedCustomDate2(makeString(jobOrder.getCorrelatedCustomDate2()));
        formJobOrderDto.setCorrelatedCustomDate3(makeString(jobOrder.getCorrelatedCustomDate3()));
        formJobOrderDto.setCorrelatedCustomFloat1(makeString(jobOrder.getCorrelatedCustomFloat1()));
        formJobOrderDto.setCorrelatedCustomFloat2(makeString(jobOrder.getCorrelatedCustomFloat2()));
        formJobOrderDto.setCorrelatedCustomFloat3(makeString(jobOrder.getCorrelatedCustomFloat3()));
        formJobOrderDto.setCorrelatedCustomInt1(makeString(jobOrder.getCorrelatedCustomInt1()));
        formJobOrderDto.setCorrelatedCustomInt2(makeString(jobOrder.getCorrelatedCustomInt2()));
        formJobOrderDto.setCorrelatedCustomInt3(makeString(jobOrder.getCorrelatedCustomInt3()));
        formJobOrderDto.setCorrelatedCustomText1(jobOrder.getCorrelatedCustomText1());
        formJobOrderDto.setCorrelatedCustomText10(jobOrder.getCorrelatedCustomText10());
        formJobOrderDto.setCorrelatedCustomText2(jobOrder.getCorrelatedCustomText2());
        formJobOrderDto.setCorrelatedCustomText3(jobOrder.getCorrelatedCustomText3());
        formJobOrderDto.setCorrelatedCustomText4(jobOrder.getCorrelatedCustomText4());
        formJobOrderDto.setCorrelatedCustomText5(jobOrder.getCorrelatedCustomText5());
        formJobOrderDto.setCorrelatedCustomText6(jobOrder.getCorrelatedCustomText6());
        formJobOrderDto.setCorrelatedCustomText7(jobOrder.getCorrelatedCustomText7());
        formJobOrderDto.setCorrelatedCustomText8(jobOrder.getCorrelatedCustomText8());
        formJobOrderDto.setCorrelatedCustomText9(jobOrder.getCorrelatedCustomText9());
        formJobOrderDto.setCorrelatedCustomTextBlock1(jobOrder.getCorrelatedCustomTextBlock1());
        formJobOrderDto.setCorrelatedCustomTextBlock2(jobOrder.getCorrelatedCustomTextBlock2());
        formJobOrderDto.setCorrelatedCustomTextBlock3(jobOrder.getCorrelatedCustomTextBlock3());
        formJobOrderDto.setCostCenter(jobOrder.getCostCenter());
        formJobOrderDto.setCustomDate1(makeString(jobOrder.getCustomDate1()));
        formJobOrderDto.setCustomDate2(makeString(jobOrder.getCustomDate2()));
        formJobOrderDto.setCustomDate3(makeString(jobOrder.getCustomDate3()));
        formJobOrderDto.setCustomFloat1(makeString(jobOrder.getCustomFloat1()));
        formJobOrderDto.setCustomFloat2(makeString(jobOrder.getCustomFloat2()));
        formJobOrderDto.setCustomFloat3(makeString(jobOrder.getCustomFloat3()));
        formJobOrderDto.setCustomInt1(makeString(jobOrder.getCustomInt1()));
        formJobOrderDto.setCustomInt2(makeString(jobOrder.getCustomInt2()));
        formJobOrderDto.setCustomInt3(makeString(jobOrder.getCustomInt3()));
        formJobOrderDto.setCustomText1(jobOrder.getCustomText1());
        formJobOrderDto.setCustomText10(jobOrder.getCustomText10());
        formJobOrderDto.setCustomText11(jobOrder.getCustomText11());
        formJobOrderDto.setCustomText12(jobOrder.getCustomText12());
        formJobOrderDto.setCustomText13(jobOrder.getCustomText13());
        formJobOrderDto.setCustomText14(jobOrder.getCustomText14());
        formJobOrderDto.setCustomText15(jobOrder.getCustomText15());
        formJobOrderDto.setCustomText16(jobOrder.getCustomText16());
        formJobOrderDto.setCustomText17(jobOrder.getCustomText17());
        formJobOrderDto.setCustomText18(jobOrder.getCustomText18());
        formJobOrderDto.setCustomText19(jobOrder.getCustomText19());
        formJobOrderDto.setCustomText2(jobOrder.getCustomText2());
        formJobOrderDto.setCustomText20(jobOrder.getCustomText20());
        formJobOrderDto.setCustomText3(jobOrder.getCustomText3());
        formJobOrderDto.setCustomText4(jobOrder.getCustomText4());
        formJobOrderDto.setCustomText5(jobOrder.getCustomText5());
        formJobOrderDto.setCustomText6(jobOrder.getCustomText6());
        formJobOrderDto.setCustomText7(jobOrder.getCustomText7());
        formJobOrderDto.setCustomText8(jobOrder.getCustomText8());
        formJobOrderDto.setCustomText9(jobOrder.getCustomText9());
        formJobOrderDto.setCustomTextBlock1(jobOrder.getCustomTextBlock1());
        formJobOrderDto.setCustomTextBlock2(jobOrder.getCustomTextBlock2());
        formJobOrderDto.setCustomTextBlock3(jobOrder.getCustomTextBlock3());
        formJobOrderDto.setCustomTextBlock4(jobOrder.getCustomTextBlock4());
        formJobOrderDto.setCustomTextBlock5(jobOrder.getCustomTextBlock5());
        formJobOrderDto.setDateEnd(makeString(jobOrder.getDateEnd()));
        formJobOrderDto.setDegreeList(jobOrder.getDegreeList());
        formJobOrderDto.setDescription(jobOrder.getDescription());
        formJobOrderDto.setDurationWeeks(makeString(jobOrder.getDurationWeeks()));

        formJobOrderDto.setEducationDegree(jobOrder.getEducationDegree());
        formJobOrderDto.setEmploymentType(jobOrder.getEmploymentType());
        formJobOrderDto.setExternalCategoryID(jobOrder.getExternalCategoryID());
        formJobOrderDto.setExternalID(jobOrder.getExternalID());
        formJobOrderDto.setFeeArrangement(makeString(jobOrder.getFeeArrangement()));
        formJobOrderDto.setHoursOfOperation(jobOrder.getHoursOfOperation());
        formJobOrderDto.setHoursPerWeek(makeString(jobOrder.getHoursPerWeek()));
        formJobOrderDto.setIsClientEditable(jobOrder.getIsClientEditable());
        formJobOrderDto.setIsInterviewRequired(jobOrder.getIsInterviewRequired());
        formJobOrderDto.setIsOpen(jobOrder.getIsOpen());
        formJobOrderDto.setIsPublic(makeString(jobOrder.getIsPublic()));
        formJobOrderDto.setJobBoardList(jobOrder.getJobBoardList());
        formJobOrderDto.setJobPostingID(jobOrder.getId());
        formJobOrderDto.setNumOpenings(makeString(jobOrder.getNumOpenings()));
        formJobOrderDto.setOnSite(jobOrder.getOnSite());
        formJobOrderDto.setOptionsPackage(jobOrder.getOptionsPackage());
        formJobOrderDto.setUserID(jobOrder.getOwner().getId());
        formJobOrderDto.setPayRate(makeString(jobOrder.getPayRate()));
        formJobOrderDto.setPublicDescription(jobOrder.getPublicDescription());
        formJobOrderDto.setPublishedZip(jobOrder.getPublishedZip());
        formJobOrderDto.setReasonClosed(jobOrder.getReasonClosed());
        formJobOrderDto.setReportTo(jobOrder.getReportTo());
        formJobOrderDto.setReportToUserID(jobOrder.getReportToClientContact() != null ? jobOrder.getReportToClientContact().getId() : null);
        formJobOrderDto.setResponseUserID(jobOrder.getResponseUser() != null ? jobOrder.getResponseUser().getId() : null);
        formJobOrderDto.setSalary(makeString(jobOrder.getSalary()));
        formJobOrderDto.setSalaryUnit(jobOrder.getSalaryUnit());
        formJobOrderDto.setSkills(jobOrder.getSkillList());
        formJobOrderDto.setSource(jobOrder.getSource());
        formJobOrderDto.setStartDate(makeString(jobOrder.getStartDate()));
        formJobOrderDto.setStatus(jobOrder.getStatus());
        formJobOrderDto.setTaxRate(makeString(jobOrder.getTaxRate()));
        formJobOrderDto.setTaxStatus(jobOrder.getTaxStatus());
        formJobOrderDto.setTitle(jobOrder.getTitle());
        formJobOrderDto.setTravelRequirements(jobOrder.getTravelRequirements());
        formJobOrderDto.setType(jobOrder.getType());
        formJobOrderDto.setWillRelocate(jobOrder.getWillRelocate() == null ? null : jobOrder.getWillRelocate().toString());
        formJobOrderDto.setWillSponsor(jobOrder.getWillSponsor() == null ? null : jobOrder.getWillSponsor().toString());
        formJobOrderDto.setYearsRequired(makeString(jobOrder.getYearsRequired()));

        if(jobOrder.getAddress() != null) {
            formJobOrderDto.setAddress(jobOrder.getAddress().getAddress1());
            formJobOrderDto.setCity(jobOrder.getAddress().getCity());
            formJobOrderDto.setCountryID(jobOrder.getAddress().getCountryID());
            formJobOrderDto.setState(jobOrder.getAddress().getState());
            formJobOrderDto.setZip(jobOrder.getAddress().getZip());
        }

        return formJobOrderDto;
    }

	/**
	 * Converts the form values to a SOAP dto.
	 * 
	 * @deprecated use {@link #instantiateEntity()} instead for BullhornEntity
	 * @return a SOAP dto
	 */
	@Deprecated
	public JobOrderDto instantiateBullhornDto() {
		JobOrderDto jobOrder = new JobOrderDto();

		jobOrder.setBenefits(benefits);
		jobOrder.setBillRateCategoryID(billRateCategoryID);
		jobOrder.setBonusPackage(bonusPackage);
		jobOrder.setBranchCode(branchCode);
		jobOrder.setCertificationList(certifications);
		jobOrder.setClientBillRate(toBigDecimal(clientBillRate, "clientBillRate"));
		jobOrder.setClientContactID(clientUserID);
		jobOrder.setClientCorporationID(clientCorporationID);
		jobOrder.setCorrelatedCustomDate1(stringToXMLGregorianCalendar(correlatedCustomDate1));
		jobOrder.setCorrelatedCustomDate2(stringToXMLGregorianCalendar(correlatedCustomDate2));
		jobOrder.setCorrelatedCustomDate3(stringToXMLGregorianCalendar(correlatedCustomDate3));
		jobOrder.setCorrelatedCustomFloat1(toDouble(correlatedCustomFloat1, "correlatedCustomFloat1"));
		jobOrder.setCorrelatedCustomFloat2(toDouble(correlatedCustomFloat2, "correlatedCustomFloat2"));
		jobOrder.setCorrelatedCustomFloat3(toDouble(correlatedCustomFloat3, "correlatedCustomFloat3"));
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
		jobOrder.setCustomDate1(stringToXMLGregorianCalendar(customDate1));
		jobOrder.setCustomDate2(stringToXMLGregorianCalendar(customDate2));
		jobOrder.setCustomDate3(stringToXMLGregorianCalendar(customDate3));
		jobOrder.setCustomFloat1(toDouble(customFloat1, "customFloat1"));
		jobOrder.setCustomFloat2(toDouble(customFloat2, "customFloat2"));
		jobOrder.setCustomFloat3(toDouble(customFloat3, "customFloat3"));
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
		jobOrder.setDateEnd(stringToXMLGregorianCalendar(dateEnd));
		jobOrder.setDegreeList(degreeList);
		jobOrder.setDescription(description);
		jobOrder.setDurationWeeks(toDouble(durationWeeks, "durationWeeks"));

		jobOrder.setEducationDegree(educationDegree);
		jobOrder.setEmploymentType(employmentType);
		jobOrder.setExternalCategoryID(externalCategoryID);
		jobOrder.setExternalID(externalID);
		jobOrder.setFeeArrangement(toDouble(feeArrangement, "feeArrangement"));
		jobOrder.setHoursOfOperation(hoursOfOperation);
		jobOrder.setHoursPerWeek(toDouble(hoursPerWeek, "hoursPerWeek"));
		jobOrder.setIsClientEditable(isClientEditable);
		jobOrder.setIsDeleted(false);
		jobOrder.setIsInterviewRequired(isInterviewRequired);
		jobOrder.setIsOpen(isOpen);
		jobOrder.setIsPublic(toInteger(isPublic, "isPublic"));
		jobOrder.setJobBoardList(jobBoardList);
		jobOrder.setJobOrderID(jobPostingID);
		jobOrder.setNumOpenings(toInteger(numOpenings, "numOpenings"));
		jobOrder.setOnSite(onSite);
		jobOrder.setOptionsPackage(optionsPackage);
		jobOrder.setOwnerID(userID);
		jobOrder.setPayRate(toBigDecimal(payRate, "payRate"));
		jobOrder.setPublicDescription(publicDescription);
		jobOrder.setPublishedZip(publishedZip);
		jobOrder.setReasonClosed(reasonClosed);
		jobOrder.setReportTo(reportTo);
		jobOrder.setReportToClientContactID(reportToUserID);
		jobOrder.setResponseUserID(responseUserID);
		jobOrder.setSalary(toBigDecimal(salary, "salary"));
		jobOrder.setSalaryUnit(salaryUnit);
		jobOrder.setShiftID(shiftID);
		jobOrder.setSkillList(skills);
		jobOrder.setSource(source);
		jobOrder.setStartDate(stringToXMLGregorianCalendar(startDate));
		jobOrder.setStatus(status);
		jobOrder.setTaxRate(toDouble(taxRate, "taxRate"));
		jobOrder.setTaxStatus(taxStatus);
		jobOrder.setTitle(title);
		jobOrder.setTravelRequirements(travelRequirements);
		jobOrder.setType(type);
		jobOrder.setWillRelocate(willRelocate == null ? null : willRelocate == "1");
		jobOrder.setWillSponsor(willSponsor == null ? null : willSponsor == "1");
		jobOrder.setWorkersCompRateID(workersCompRateID);
		jobOrder.setYearsRequired(toInteger(yearsRequired, "yearsRequired"));

		jobOrder.setAddress(new Address1());

		jobOrder.getAddress().setAddress1(address);
		jobOrder.getAddress().setCity(city);
		jobOrder.getAddress().setCountryID(countryID);
		jobOrder.getAddress().setState(state);
		jobOrder.getAddress().setZip(zip);

		return jobOrder;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("FormJobOrderDto {\n\"jobPostingID\":\"");
		builder.append(jobPostingID);
		builder.append("\", \naddress\":\"");
		builder.append(address);
		builder.append("\", \nassignments\":\"");
		builder.append(assignments);
		builder.append("\", \nbenefits\":\"");
		builder.append(benefits);
		builder.append("\", \nbillRateCategoryID\":\"");
		builder.append(billRateCategoryID);
		builder.append("\", \nbonusPackage\":\"");
		builder.append(bonusPackage);
		builder.append("\", \nbranchCode\":\"");
		builder.append(branchCode);
		builder.append("\", \nbusinessSectorID\":\"");
		builder.append(businessSectorID);
		builder.append("\", \nbusinessSectorID_display\":\"");
		builder.append(businessSectorID_display);
		builder.append("\", \ncategoryID\":\"");
		builder.append(categoryID);
		builder.append("\", \ncertificationID\":\"");
		builder.append(certificationID);
		builder.append("\", \ncertifications\":\"");
		builder.append(certifications);
		builder.append("\", \ncity\":\"");
		builder.append(city);
		builder.append("\", \nclientBillRate\":\"");
		builder.append(clientBillRate);
		builder.append("\", \nclientCorporationID\":\"");
		builder.append(clientCorporationID);
		builder.append("\", \nclientCorporationID_display\":\"");
		builder.append(clientCorporationID_display);
		builder.append("\", \nclientUserID\":\"");
		builder.append(clientUserID);
		builder.append("\", \nclientUserID_display\":\"");
		builder.append(clientUserID_display);
		builder.append("\", \ncorrelatedCustomDate1\":\"");
		builder.append(correlatedCustomDate1);
		builder.append("\", \ncorrelatedCustomDate2\":\"");
		builder.append(correlatedCustomDate2);
		builder.append("\", \ncorrelatedCustomDate3\":\"");
		builder.append(correlatedCustomDate3);
		builder.append("\", \ncorrelatedCustomFloat1\":\"");
		builder.append(correlatedCustomFloat1);
		builder.append("\", \ncorrelatedCustomFloat2\":\"");
		builder.append(correlatedCustomFloat2);
		builder.append("\", \ncorrelatedCustomFloat3\":\"");
		builder.append(correlatedCustomFloat3);
		builder.append("\", \ncorrelatedCustomInt1\":\"");
		builder.append(correlatedCustomInt1);
		builder.append("\", \ncorrelatedCustomInt2\":\"");
		builder.append(correlatedCustomInt2);
		builder.append("\", \ncorrelatedCustomInt3\":\"");
		builder.append(correlatedCustomInt3);
		builder.append("\", \ncorrelatedCustomText1\":\"");
		builder.append(correlatedCustomText1);
		builder.append("\", \ncorrelatedCustomText10\":\"");
		builder.append(correlatedCustomText10);
		builder.append("\", \ncorrelatedCustomText2\":\"");
		builder.append(correlatedCustomText2);
		builder.append("\", \ncorrelatedCustomText2_display\":\"");
		builder.append(correlatedCustomText2_display);
		builder.append("\", \ncorrelatedCustomText3\":\"");
		builder.append(correlatedCustomText3);
		builder.append("\", \ncorrelatedCustomText4\":\"");
		builder.append(correlatedCustomText4);
		builder.append("\", \ncorrelatedCustomText5\":\"");
		builder.append(correlatedCustomText5);
		builder.append("\", \ncorrelatedCustomText6\":\"");
		builder.append(correlatedCustomText6);
		builder.append("\", \ncorrelatedCustomText7\":\"");
		builder.append(correlatedCustomText7);
		builder.append("\", \ncorrelatedCustomText8\":\"");
		builder.append(correlatedCustomText8);
		builder.append("\", \ncorrelatedCustomText9\":\"");
		builder.append(correlatedCustomText9);
		builder.append("\", \ncorrelatedCustomTextBlock1\":\"");
		builder.append(correlatedCustomTextBlock1);
		builder.append("\", \ncorrelatedCustomTextBlock2\":\"");
		builder.append(correlatedCustomTextBlock2);
		builder.append("\", \ncorrelatedCustomTextBlock3\":\"");
		builder.append(correlatedCustomTextBlock3);
		builder.append("\", \ncostCenter\":\"");
		builder.append(costCenter);
		builder.append("\", \ncountryID\":\"");
		builder.append(countryID);
		builder.append("\", \ncustomDate1\":\"");
		builder.append(customDate1);
		builder.append("\", \ncustomDate2\":\"");
		builder.append(customDate2);
		builder.append("\", \ncustomDate3\":\"");
		builder.append(customDate3);
		builder.append("\", \ncustomFloat1\":\"");
		builder.append(customFloat1);
		builder.append("\", \ncustomFloat2\":\"");
		builder.append(customFloat2);
		builder.append("\", \ncustomFloat3\":\"");
		builder.append(customFloat3);
		builder.append("\", \ncustomInt1\":\"");
		builder.append(customInt1);
		builder.append("\", \ncustomInt2\":\"");
		builder.append(customInt2);
		builder.append("\", \ncustomInt3\":\"");
		builder.append(customInt3);
		builder.append("\", \ncustomText1\":\"");
		builder.append(customText1);
		builder.append("\", \ncustomText10\":\"");
		builder.append(customText10);
		builder.append("\", \ncustomText11\":\"");
		builder.append(customText11);
		builder.append("\", \ncustomText12\":\"");
		builder.append(customText12);
		builder.append("\", \ncustomText13\":\"");
		builder.append(customText13);
		builder.append("\", \ncustomText14\":\"");
		builder.append(customText14);
		builder.append("\", \ncustomText15\":\"");
		builder.append(customText15);
		builder.append("\", \ncustomText16\":\"");
		builder.append(customText16);
		builder.append("\", \ncustomText17\":\"");
		builder.append(customText17);
		builder.append("\", \ncustomText18\":\"");
		builder.append(customText18);
		builder.append("\", \ncustomText19\":\"");
		builder.append(customText19);
		builder.append("\", \ncustomText2\":\"");
		builder.append(customText2);
		builder.append("\", \ncustomText20\":\"");
		builder.append(customText20);
		builder.append("\", \ncustomText3\":\"");
		builder.append(customText3);
		builder.append("\", \ncustomText4\":\"");
		builder.append(customText4);
		builder.append("\", \ncustomText5\":\"");
		builder.append(customText5);
		builder.append("\", \ncustomText5_display\":\"");
		builder.append(customText5_display);
		builder.append("\", \ncustomText6\":\"");
		builder.append(customText6);
		builder.append("\", \ncustomText7\":\"");
		builder.append(customText7);
		builder.append("\", \ncustomText8\":\"");
		builder.append(customText8);
		builder.append("\", \ncustomText9\":\"");
		builder.append(customText9);
		builder.append("\", \ncustomTextBlock1\":\"");
		builder.append(customTextBlock1);
		builder.append("\", \ncustomTextBlock2\":\"");
		builder.append(customTextBlock2);
		builder.append("\", \ncustomTextBlock3\":\"");
		builder.append(customTextBlock3);
		builder.append("\", \ncustomTextBlock4\":\"");
		builder.append(customTextBlock4);
		builder.append("\", \ncustomTextBlock5\":\"");
		builder.append(customTextBlock5);
		builder.append("\", \ndateEnd\":\"");
		builder.append(dateEnd);
		builder.append("\", \ndegreeList\":\"");
		builder.append(degreeList);
		builder.append("\", \ndescription\":\"");
		builder.append(description);
		builder.append("\", \ndistributionListID\":\"");
		builder.append(distributionListID);
		builder.append("\", \ndistributionListID_display\":\"");
		builder.append(distributionListID_display);
		builder.append("\", \ndurationWeeks\":\"");
		builder.append(durationWeeks);
		builder.append("\", \neducationDegree\":\"");
		builder.append(educationDegree);
		builder.append("\", \nemploymentType\":\"");
		builder.append(employmentType);
		builder.append("\", \nexternalCategoryID\":\"");
		builder.append(externalCategoryID);
		builder.append("\", \nexternalID\":\"");
		builder.append(externalID);
		builder.append("\", \nfeeArrangement\":\"");
		builder.append(feeArrangement);
		builder.append("\", \nhoursOfOperation\":\"");
		builder.append(hoursOfOperation);
		builder.append("\", \nhoursPerWeek\":\"");
		builder.append(hoursPerWeek);
		builder.append("\", \nisClientEditable\":\"");
		builder.append(isClientEditable);
		builder.append("\", \nisInterviewRequired\":\"");
		builder.append(isInterviewRequired);
		builder.append("\", \nisOpen\":\"");
		builder.append(isOpen);
		builder.append("\", \nisPublic\":\"");
		builder.append(isPublic);
		builder.append("\", \njobBoardList\":\"");
		builder.append(jobBoardList);
		builder.append("\", \nmarkUpPercentage\":\"");
		builder.append(markUpPercentage);
		builder.append("\", \nnotify\":\"");
		builder.append(notify);
		builder.append("\", \nnotify_display\":\"");
		builder.append(notify_display);
		builder.append("\", \nnumOpenings\":\"");
		builder.append(numOpenings);
		builder.append("\", \nonSite\":\"");
		builder.append(onSite);
		builder.append("\", \noptionsPackage\":\"");
		builder.append(optionsPackage);
		builder.append("\", \npayRate\":\"");
		builder.append(payRate);
		builder.append("\", \npublicDescription\":\"");
		builder.append(publicDescription);
		builder.append("\", \npublishedZip\":\"");
		builder.append(publishedZip);
		builder.append("\", \nreasonClosed\":\"");
		builder.append(reasonClosed);
		builder.append("\", \nreportTo\":\"");
		builder.append(reportTo);
		builder.append("\", \nreportToUserID\":\"");
		builder.append(reportToUserID);
		builder.append("\", \nreportToUserID_display\":\"");
		builder.append(reportToUserID_display);
		builder.append("\", \nresponseUserID\":\"");
		builder.append(responseUserID);
		builder.append("\", \nresponseUserID_display\":\"");
		builder.append(responseUserID_display);
		builder.append("\", \nsalary\":\"");
		builder.append(salary);
		builder.append("\", \nsalaryUnit\":\"");
		builder.append(salaryUnit);
		builder.append("\", \nshiftID\":\"");
		builder.append(shiftID);
		builder.append("\", \nskillID\":\"");
		builder.append(skillID);
		builder.append("\", \nskillID_display\":\"");
		builder.append(skillID_display);
		builder.append("\", \nskills\":\"");
		builder.append(skills);
		builder.append("\", \nskills_display\":\"");
		builder.append(skills_display);
		builder.append("\", \nsource\":\"");
		builder.append(source);
		builder.append("\", \nspecialty_categoryID\":\"");
		builder.append(specialty_categoryID);
		builder.append("\", \nspecialty_categoryID_display\":\"");
		builder.append(specialty_categoryID_display);
		builder.append("\", \nstartDate\":\"");
		builder.append(startDate);
		builder.append("\", \nstate\":\"");
		builder.append(state);
		builder.append("\", \nstate_display\":\"");
		builder.append(state_display);
		builder.append("\", \nstatus\":\"");
		builder.append(status);
		builder.append("\", \ntaxRate\":\"");
		builder.append(taxRate);
		builder.append("\", \ntaxStatus\":\"");
		builder.append(taxStatus);
		builder.append("\", \ntitle\":\"");
		builder.append(title);
		builder.append("\", \ntravelRequirements\":\"");
		builder.append(travelRequirements);
		builder.append("\", \ntype\":\"");
		builder.append(type);
		builder.append("\", \nuserID\":\"");
		builder.append(userID);
		builder.append("\", \nuserID_display\":\"");
		builder.append(userID_display);
		builder.append("\", \nwillRelocate\":\"");
		builder.append(willRelocate);
		builder.append("\", \nwillSponsor\":\"");
		builder.append(willSponsor);
		builder.append("\", \nworkersCompRateID\":\"");
		builder.append(workersCompRateID);
		builder.append("\", \nyearsRequired\":\"");
		builder.append(yearsRequired);
		builder.append("\", \nzip\":\"");
		builder.append(zip);
		builder.append("\n}");
		return builder.toString();
	}

}
