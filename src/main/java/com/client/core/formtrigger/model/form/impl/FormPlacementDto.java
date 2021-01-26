package com.client.core.formtrigger.model.form.impl;

import org.apache.log4j.Logger;

import com.bullhorn.entity.job.PlacementDto;
import com.bullhornsdk.data.model.entity.core.standard.Candidate;
import com.bullhornsdk.data.model.entity.core.standard.ClientContact;
import com.bullhornsdk.data.model.entity.core.standard.ClientCorporation;
import com.bullhornsdk.data.model.entity.core.standard.JobOrder;
import com.bullhornsdk.data.model.entity.core.standard.Placement;
import com.client.core.formtrigger.model.form.AbstractFormDto;

public class FormPlacementDto extends AbstractFormDto<Placement> {

	public FormPlacementDto() {
		super(Logger.getLogger(FormPlacementDto.class));
	}

	private Integer approvingUserID;
	private Integer backupApprovingUserID;
	private Integer billingUserID;
	private String billingFrequency;
	private String bonusPackage;
	private String clientBillRate;
	private String clientOverTimeRate;
	private String comments;
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
	private String customBillRate1;
	private String customBillRate10;
	private String customBillRate2;
	private String customBillRate3;
	private String customBillRate4;
	private String customBillRate5;
	private String customBillRate6;
	private String customBillRate7;
	private String customBillRate8;
	private String customBillRate9;
	private String customDate1;
	private String customDate2;
	private String customDate3;
	private String customFloat1;
	private String customFloat2;
	private String customFloat3;
	private String customInt1;
	private String customInt2;
	private String customInt3;
	private String customPayRate1;
	private String customPayRate10;
	private String customPayRate2;
	private String customPayRate3;
	private String customPayRate4;
	private String customPayRate5;
	private String customPayRate6;
	private String customPayRate7;
	private String customPayRate8;
	private String customPayRate9;
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
	private String customText21;
	private String customText22;
	private String customText23;
	private String customText24;
	private String customText25;
	private String customText26;
	private String customText27;
	private String customText28;
	private String customText29;
	private String customText3;
	private String customText30;
	private String customText31;
	private String customText32;
	private String customText33;
	private String customText34;
	private String customText35;
	private String customText36;
	private String customText37;
	private String customText38;
	private String customText39;
	private String customText4;
	private String customText40;
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
	private String dateAdded;
	private String dateBegin;
	private String dateClientEffective;
	private String dateEffective;
	private String dateEnd;
	private String daysGuaranteed;
	private String daysProRated;
	private String durationWeeks;
	private String employeeType;
	private String employmentType;
	private String fee;
	private String hoursOfOperation;
	private String hoursPerDay;
	private Integer housingManagerID;
	private String housingStatus;
	private String invoiceGroup;
	private String isChangeRequest;
	private Integer jobPostingID;
	private String otExemption;
	private String otherHourlyFee;
	private String otherHourlyFeeComments;
	private String overtimeRate;
	private String payRate;
	private Integer placementID;
	private String recruitingManagerPercentGrossMargin;
	private String referralFee;
	private String referralFeeType;
	private String reportTo;
	private String reportedMargin;
	private String salary;
	private String salaryUnit;
	private String salesManagerPercentGrossMargin;
	private Integer shiftID;
	private Integer statementClientContactID;
	private String status;
	private String taxRate;
	private String taxState;
	private String terminationReason;
	private Integer userID;
	private Integer vendorClientCorporationID;
	private String workWeekStart;
	private Integer workersCompRateID;

	public Integer getApprovingUserID() {
		return approvingUserID;
	}

	public void setApprovingUserID(Integer approvingUserID) {
		this.approvingUserID = approvingUserID;
	}

	public Integer getBackupApprovingUserID() {
		return backupApprovingUserID;
	}

	public void setBackupApprovingUserID(Integer backupApprovingUserID) {
		this.backupApprovingUserID = backupApprovingUserID;
	}

	public Integer getBillingUserID() {
		return billingUserID;
	}

	public void setBillingUserID(Integer billingUserID) {
		this.billingUserID = billingUserID;
	}

	public String getBillingFrequency() {
		return billingFrequency;
	}

	public void setBillingFrequency(String billingFrequency) {
		this.billingFrequency = billingFrequency;
	}

	public String getBonusPackage() {
		return bonusPackage;
	}

	public void setBonusPackage(String bonusPackage) {
		this.bonusPackage = bonusPackage;
	}

	public String getClientBillRate() {
		return clientBillRate;
	}

	public void setClientBillRate(String clientBillRate) {
		this.clientBillRate = clientBillRate;
	}

	public String getClientOverTimeRate() {
		return clientOverTimeRate;
	}

	public void setClientOverTimeRate(String clientOverTimeRate) {
		this.clientOverTimeRate = clientOverTimeRate;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
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

	public String getCustomBillRate1() {
		return customBillRate1;
	}

	public void setCustomBillRate1(String customBillRate1) {
		this.customBillRate1 = customBillRate1;
	}

	public String getCustomBillRate10() {
		return customBillRate10;
	}

	public void setCustomBillRate10(String customBillRate10) {
		this.customBillRate10 = customBillRate10;
	}

	public String getCustomBillRate2() {
		return customBillRate2;
	}

	public void setCustomBillRate2(String customBillRate2) {
		this.customBillRate2 = customBillRate2;
	}

	public String getCustomBillRate3() {
		return customBillRate3;
	}

	public void setCustomBillRate3(String customBillRate3) {
		this.customBillRate3 = customBillRate3;
	}

	public String getCustomBillRate4() {
		return customBillRate4;
	}

	public void setCustomBillRate4(String customBillRate4) {
		this.customBillRate4 = customBillRate4;
	}

	public String getCustomBillRate5() {
		return customBillRate5;
	}

	public void setCustomBillRate5(String customBillRate5) {
		this.customBillRate5 = customBillRate5;
	}

	public String getCustomBillRate6() {
		return customBillRate6;
	}

	public void setCustomBillRate6(String customBillRate6) {
		this.customBillRate6 = customBillRate6;
	}

	public String getCustomBillRate7() {
		return customBillRate7;
	}

	public void setCustomBillRate7(String customBillRate7) {
		this.customBillRate7 = customBillRate7;
	}

	public String getCustomBillRate8() {
		return customBillRate8;
	}

	public void setCustomBillRate8(String customBillRate8) {
		this.customBillRate8 = customBillRate8;
	}

	public String getCustomBillRate9() {
		return customBillRate9;
	}

	public void setCustomBillRate9(String customBillRate9) {
		this.customBillRate9 = customBillRate9;
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

	public String getCustomPayRate1() {
		return customPayRate1;
	}

	public void setCustomPayRate1(String customPayRate1) {
		this.customPayRate1 = customPayRate1;
	}

	public String getCustomPayRate10() {
		return customPayRate10;
	}

	public void setCustomPayRate10(String customPayRate10) {
		this.customPayRate10 = customPayRate10;
	}

	public String getCustomPayRate2() {
		return customPayRate2;
	}

	public void setCustomPayRate2(String customPayRate2) {
		this.customPayRate2 = customPayRate2;
	}

	public String getCustomPayRate3() {
		return customPayRate3;
	}

	public void setCustomPayRate3(String customPayRate3) {
		this.customPayRate3 = customPayRate3;
	}

	public String getCustomPayRate4() {
		return customPayRate4;
	}

	public void setCustomPayRate4(String customPayRate4) {
		this.customPayRate4 = customPayRate4;
	}

	public String getCustomPayRate5() {
		return customPayRate5;
	}

	public void setCustomPayRate5(String customPayRate5) {
		this.customPayRate5 = customPayRate5;
	}

	public String getCustomPayRate6() {
		return customPayRate6;
	}

	public void setCustomPayRate6(String customPayRate6) {
		this.customPayRate6 = customPayRate6;
	}

	public String getCustomPayRate7() {
		return customPayRate7;
	}

	public void setCustomPayRate7(String customPayRate7) {
		this.customPayRate7 = customPayRate7;
	}

	public String getCustomPayRate8() {
		return customPayRate8;
	}

	public void setCustomPayRate8(String customPayRate8) {
		this.customPayRate8 = customPayRate8;
	}

	public String getCustomPayRate9() {
		return customPayRate9;
	}

	public void setCustomPayRate9(String customPayRate9) {
		this.customPayRate9 = customPayRate9;
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

	public String getCustomText21() {
		return customText21;
	}

	public void setCustomText21(String customText21) {
		this.customText21 = customText21;
	}

	public String getCustomText22() {
		return customText22;
	}

	public void setCustomText22(String customText22) {
		this.customText22 = customText22;
	}

	public String getCustomText23() {
		return customText23;
	}

	public void setCustomText23(String customText23) {
		this.customText23 = customText23;
	}

	public String getCustomText24() {
		return customText24;
	}

	public void setCustomText24(String customText24) {
		this.customText24 = customText24;
	}

	public String getCustomText25() {
		return customText25;
	}

	public void setCustomText25(String customText25) {
		this.customText25 = customText25;
	}

	public String getCustomText26() {
		return customText26;
	}

	public void setCustomText26(String customText26) {
		this.customText26 = customText26;
	}

	public String getCustomText27() {
		return customText27;
	}

	public void setCustomText27(String customText27) {
		this.customText27 = customText27;
	}

	public String getCustomText28() {
		return customText28;
	}

	public void setCustomText28(String customText28) {
		this.customText28 = customText28;
	}

	public String getCustomText29() {
		return customText29;
	}

	public void setCustomText29(String customText29) {
		this.customText29 = customText29;
	}

	public String getCustomText3() {
		return customText3;
	}

	public void setCustomText3(String customText3) {
		this.customText3 = customText3;
	}

	public String getCustomText30() {
		return customText30;
	}

	public void setCustomText30(String customText30) {
		this.customText30 = customText30;
	}

	public String getCustomText31() {
		return customText31;
	}

	public void setCustomText31(String customText31) {
		this.customText31 = customText31;
	}

	public String getCustomText32() {
		return customText32;
	}

	public void setCustomText32(String customText32) {
		this.customText32 = customText32;
	}

	public String getCustomText33() {
		return customText33;
	}

	public void setCustomText33(String customText33) {
		this.customText33 = customText33;
	}

	public String getCustomText34() {
		return customText34;
	}

	public void setCustomText34(String customText34) {
		this.customText34 = customText34;
	}

	public String getCustomText35() {
		return customText35;
	}

	public void setCustomText35(String customText35) {
		this.customText35 = customText35;
	}

	public String getCustomText36() {
		return customText36;
	}

	public void setCustomText36(String customText36) {
		this.customText36 = customText36;
	}

	public String getCustomText37() {
		return customText37;
	}

	public void setCustomText37(String customText37) {
		this.customText37 = customText37;
	}

	public String getCustomText38() {
		return customText38;
	}

	public void setCustomText38(String customText38) {
		this.customText38 = customText38;
	}

	public String getCustomText39() {
		return customText39;
	}

	public void setCustomText39(String customText39) {
		this.customText39 = customText39;
	}

	public String getCustomText4() {
		return customText4;
	}

	public void setCustomText4(String customText4) {
		this.customText4 = customText4;
	}

	public String getCustomText40() {
		return customText40;
	}

	public void setCustomText40(String customText40) {
		this.customText40 = customText40;
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

	public String getDateAdded() {
		return dateAdded;
	}

	public void setDateAdded(String dateAdded) {
		this.dateAdded = dateAdded;
	}

	public String getDateBegin() {
		return dateBegin;
	}

	public void setDateBegin(String dateBegin) {
		this.dateBegin = dateBegin;
	}

	public String getDateClientEffective() {
		return dateClientEffective;
	}

	public void setDateClientEffective(String dateClientEffective) {
		this.dateClientEffective = dateClientEffective;
	}

	public String getDateEffective() {
		return dateEffective;
	}

	public void setDateEffective(String dateEffective) {
		this.dateEffective = dateEffective;
	}

	public String getDateEnd() {
		return dateEnd;
	}

	public void setDateEnd(String dateEnd) {
		this.dateEnd = dateEnd;
	}

	public String getDaysGuaranteed() {
		return daysGuaranteed;
	}

	public void setDaysGuaranteed(String daysGuaranteed) {
		this.daysGuaranteed = daysGuaranteed;
	}

	public String getDaysProRated() {
		return daysProRated;
	}

	public void setDaysProRated(String daysProRated) {
		this.daysProRated = daysProRated;
	}

	public String getDurationWeeks() {
		return durationWeeks;
	}

	public void setDurationWeeks(String durationWeeks) {
		this.durationWeeks = durationWeeks;
	}

	public String getEmployeeType() {
		return employeeType;
	}

	public void setEmployeeType(String employeeType) {
		this.employeeType = employeeType;
	}

	public String getEmploymentType() {
		return employmentType;
	}

	public void setEmploymentType(String employmentType) {
		this.employmentType = employmentType;
	}

	public String getFee() {
		return fee;
	}

	public void setFee(String fee) {
		this.fee = fee;
	}

	public String getHoursOfOperation() {
		return hoursOfOperation;
	}

	public void setHoursOfOperation(String hoursOfOperation) {
		this.hoursOfOperation = hoursOfOperation;
	}

	public String getHoursPerDay() {
		return hoursPerDay;
	}

	public void setHoursPerDay(String hoursPerDay) {
		this.hoursPerDay = hoursPerDay;
	}

	public Integer getHousingManagerID() {
		return housingManagerID;
	}

	public void setHousingManagerID(Integer housingManagerID) {
		this.housingManagerID = housingManagerID;
	}

	public String getHousingStatus() {
		return housingStatus;
	}

	public void setHousingStatus(String housingStatus) {
		this.housingStatus = housingStatus;
	}

	public String getInvoiceGroup() {
		return invoiceGroup;
	}

	public void setInvoiceGroup(String invoiceGroup) {
		this.invoiceGroup = invoiceGroup;
	}

	public String getIsChangeRequest() {
		return isChangeRequest;
	}

	public void setIsChangeRequest() {
		this.isChangeRequest = "false";
	}

	public Integer getJobPostingID() {
		return jobPostingID;
	}

	public void setJobPostingID(Integer jobPostingID) {
		this.jobPostingID = jobPostingID;
	}

	public String getOtExemption() {
		return otExemption;
	}

	public void setOtExemption(String otExemption) {
		this.otExemption = otExemption;
	}

	public String getOtherHourlyFee() {
		return otherHourlyFee;
	}

	public void setOtherHourlyFee(String otherHourlyFee) {
		this.otherHourlyFee = otherHourlyFee;
	}

	public String getOtherHourlyFeeComments() {
		return otherHourlyFeeComments;
	}

	public void setOtherHourlyFeeComments(String otherHourlyFeeComments) {
		this.otherHourlyFeeComments = otherHourlyFeeComments;
	}

	public String getOvertimeRate() {
		return overtimeRate;
	}

	public void setOvertimeRate(String overtimeRate) {
		this.overtimeRate = overtimeRate;
	}

	public String getPayRate() {
		return payRate;
	}

	public void setPayRate(String payRate) {
		this.payRate = payRate;
	}

	public Integer getPlacementID() {
		return placementID;
	}

	public void setPlacementID(Integer placementID) {
		this.placementID = placementID;
	}

	public String getRecruitingManagerPercentGrossMargin() {
		return recruitingManagerPercentGrossMargin;
	}

	public void setRecruitingManagerPercentGrossMargin(String recruitingManagerPercentGrossMargin) {
		this.recruitingManagerPercentGrossMargin = recruitingManagerPercentGrossMargin;
	}

	public String getReferralFee() {
		return referralFee;
	}

	public void setReferralFee(String referralFee) {
		this.referralFee = referralFee;
	}

	public String getReferralFeeType() {
		return referralFeeType;
	}

	public void setReferralFeeType(String referralFeeType) {
		this.referralFeeType = referralFeeType;
	}

	public String getReportTo() {
		return reportTo;
	}

	public void setReportTo(String reportTo) {
		this.reportTo = reportTo;
	}

	public String getReportedMargin() {
		return reportedMargin;
	}

	public void setReportedMargin(String reportedMargin) {
		this.reportedMargin = reportedMargin;
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

	public String getSalesManagerPercentGrossMargin() {
		return salesManagerPercentGrossMargin;
	}

	public void setSalesManagerPercentGrossMargin(String salesManagerPercentGrossMargin) {
		this.salesManagerPercentGrossMargin = salesManagerPercentGrossMargin;
	}

	public Integer getShiftID() {
		return shiftID;
	}

	public void setShiftID(Integer shiftID) {
		this.shiftID = shiftID;
	}

	public Integer getStatementClientContactID() {
		return statementClientContactID;
	}

	public void setStatementClientContactID(Integer statementClientContactID) {
		this.statementClientContactID = statementClientContactID;
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

	public String getTaxState() {
		return taxState;
	}

	public void setTaxState(String taxState) {
		this.taxState = taxState;
	}

	public String getTerminationReason() {
		return terminationReason;
	}

	public void setTerminationReason(String terminationReason) {
		this.terminationReason = terminationReason;
	}

	public Integer getUserID() {
		return userID;
	}

	public void setUserID(Integer userID) {
		this.userID = userID;
	}

	public Integer getVendorClientCorporationID() {
		return vendorClientCorporationID;
	}

	public void setVendorClientCorporationID(Integer vendorClientCorporationID) {
		this.vendorClientCorporationID = vendorClientCorporationID;
	}

	public String getWorkWeekStart() {
		return workWeekStart;
	}

	public void setWorkWeekStart(String workWeekStart) {
		this.workWeekStart = workWeekStart;
	}

	public Integer getWorkersCompRateID() {
		return workersCompRateID;
	}

	public void setWorkersCompRateID(Integer workersCompRateID) {
		this.workersCompRateID = workersCompRateID;
	}

	@Override
	public Placement instantiateEntity() {

		Placement entity = new Placement();
		entity.setApprovingClientContact(new ClientContact(approvingUserID));
		entity.setBackupApprovingClientContact(new ClientContact(backupApprovingUserID));
		entity.setBillingClientContact(new ClientContact(billingUserID));
		entity.setBillingFrequency(billingFrequency);
		entity.setBonusPackage(bonusPackage);
		entity.setCandidate(new Candidate(userID));
		entity.setClientBillRate(toBigDecimal(clientBillRate, "clientBillRate"));
		entity.setClientOvertimeRate(toBigDecimal(clientOverTimeRate, "clientOverTimeRate"));
		entity.setComments(comments);
		entity.setCorrelatedCustomDate1(stringToDateTime(correlatedCustomDate1));
		entity.setCorrelatedCustomDate2(stringToDateTime(correlatedCustomDate2));
		entity.setCorrelatedCustomDate3(stringToDateTime(correlatedCustomDate3));
		entity.setCorrelatedCustomFloat1(toBigDecimal(correlatedCustomFloat1, "correlatedCustomFloat1"));
		entity.setCorrelatedCustomFloat2(toBigDecimal(correlatedCustomFloat2, "correlatedCustomFloat2"));
		entity.setCorrelatedCustomFloat3(toBigDecimal(correlatedCustomFloat3, "correlatedCustomFloat3"));
		entity.setCorrelatedCustomInt1(toInteger(correlatedCustomInt1, "correlatedCustomInt1"));
		entity.setCorrelatedCustomInt2(toInteger(correlatedCustomInt2, "correlatedCustomInt2"));
		entity.setCorrelatedCustomInt3(toInteger(correlatedCustomInt3, "correlatedCustomInt3"));
		entity.setCorrelatedCustomText1(correlatedCustomText1);
		entity.setCorrelatedCustomText10(correlatedCustomText10);
		entity.setCorrelatedCustomText2(correlatedCustomText2);
		entity.setCorrelatedCustomText3(correlatedCustomText3);
		entity.setCorrelatedCustomText4(correlatedCustomText4);
		entity.setCorrelatedCustomText5(correlatedCustomText5);
		entity.setCorrelatedCustomText6(correlatedCustomText6);
		entity.setCorrelatedCustomText7(correlatedCustomText7);
		entity.setCorrelatedCustomText8(correlatedCustomText8);
		entity.setCorrelatedCustomText9(correlatedCustomText9);
		entity.setCorrelatedCustomTextBlock1(correlatedCustomTextBlock1);
		entity.setCorrelatedCustomTextBlock2(correlatedCustomTextBlock2);
		entity.setCorrelatedCustomTextBlock3(correlatedCustomTextBlock3);
		entity.setCostCenter(costCenter);

		entity.setCustomBillRate1(toBigDecimal(customBillRate1, "customBillRate1"));
		entity.setCustomBillRate10(toBigDecimal(customBillRate10, "customBillRate10"));
		entity.setCustomBillRate2(toBigDecimal(customBillRate2, "customBillRate2"));
		entity.setCustomBillRate3(toBigDecimal(customBillRate3, "customBillRate3"));
		entity.setCustomBillRate4(toBigDecimal(customBillRate4, "customBillRate4"));
		entity.setCustomBillRate5(toBigDecimal(customBillRate5, "customBillRate5"));
		entity.setCustomBillRate6(toBigDecimal(customBillRate6, "customBillRate6"));
		entity.setCustomBillRate7(toBigDecimal(customBillRate7, "customBillRate7"));
		entity.setCustomBillRate8(toBigDecimal(customBillRate8, "customBillRate8"));
		entity.setCustomBillRate9(toBigDecimal(customBillRate9, "customBillRate9"));
		entity.setCustomDate1(stringToDateTime(customDate1));
		entity.setCustomDate2(stringToDateTime(customDate2));
		entity.setCustomDate3(stringToDateTime(customDate3));
		entity.setCustomFloat1(toBigDecimal(customFloat1, "customFloat1"));
		entity.setCustomFloat2(toBigDecimal(customFloat2, "customFloat2"));
		entity.setCustomFloat3(toBigDecimal(customFloat3, "customFloat3"));
		entity.setCustomInt1(toInteger(customInt1, "customInt1"));
		entity.setCustomInt2(toInteger(customInt2, "customInt2"));
		entity.setCustomInt3(toInteger(customInt3, "customInt3"));
		entity.setCustomPayRate1(toBigDecimal(customPayRate1, "customPayRate1"));
		entity.setCustomPayRate10(toBigDecimal(customPayRate10, "customPayRate10"));
		entity.setCustomPayRate2(toBigDecimal(customPayRate2, "customPayRate2"));
		entity.setCustomPayRate3(toBigDecimal(customPayRate3, "customPayRate3"));
		entity.setCustomPayRate4(toBigDecimal(customPayRate4, "customPayRate4"));
		entity.setCustomPayRate5(toBigDecimal(customPayRate5, "customPayRate5"));
		entity.setCustomPayRate6(toBigDecimal(customPayRate6, "customPayRate6"));
		entity.setCustomPayRate7(toBigDecimal(customPayRate7, "customPayRate7"));
		entity.setCustomPayRate8(toBigDecimal(customPayRate8, "customPayRate8"));
		entity.setCustomPayRate9(toBigDecimal(customPayRate9, "customPayRate9"));
		entity.setCustomText1(customText1);
		entity.setCustomText2(customText2);
		entity.setCustomText3(customText3);
		entity.setCustomText4(customText4);
		entity.setCustomText5(customText5);
		entity.setCustomText6(customText6);
		entity.setCustomText7(customText7);
		entity.setCustomText8(customText8);
		entity.setCustomText9(customText9);
		entity.setCustomText10(customText10);
		entity.setCustomText11(customText11);
		entity.setCustomText12(customText12);
		entity.setCustomText13(customText13);
		entity.setCustomText14(customText14);
		entity.setCustomText15(customText15);
		entity.setCustomText16(customText16);
		entity.setCustomText17(customText17);
		entity.setCustomText18(customText18);
		entity.setCustomText19(customText19);
		entity.setCustomText20(customText20);
		entity.setCustomText21(customText21);
		entity.setCustomText22(customText22);
		entity.setCustomText23(customText23);
		entity.setCustomText24(customText24);
		entity.setCustomText25(customText25);
		entity.setCustomText26(customText26);
		entity.setCustomText27(customText27);
		entity.setCustomText28(customText28);
		entity.setCustomText29(customText29);
		entity.setCustomText30(customText30);
		entity.setCustomText31(customText31);
		entity.setCustomText32(customText32);
		entity.setCustomText33(customText33);
		entity.setCustomText34(customText34);
		entity.setCustomText35(customText35);
		entity.setCustomText36(customText36);
		entity.setCustomText37(customText37);
		entity.setCustomText38(customText38);
		entity.setCustomText39(customText39);
		entity.setCustomText40(customText40);

		entity.setCustomTextBlock1(customTextBlock1);
		entity.setCustomTextBlock2(customTextBlock2);
		entity.setCustomTextBlock3(customTextBlock3);
		entity.setCustomTextBlock4(customTextBlock4);
		entity.setCustomTextBlock5(customTextBlock5);
		entity.setDateAdded(stringToDateTime(dateAdded));
		entity.setDateBegin(stringToDateTime(dateBegin));
		entity.setDateClientEffective(stringToDateTime(dateClientEffective));
		entity.setDateEffective(stringToDateTime(dateEffective));
		entity.setDateEnd(stringToDateTime(dateEnd));
		entity.setDaysGuaranteed(toInteger(daysGuaranteed, "daysGuaranteed"));
		entity.setDaysProRated(toInteger(daysProRated, "daysProRated"));
		entity.setDurationWeeks(toBigDecimal(durationWeeks, "durationWeeks"));
		entity.setEmployeeType(employeeType);
		entity.setEmploymentType(employmentType);
		entity.setFee(toBigDecimal(fee, "fee"));
		entity.setHoursOfOperation(hoursOfOperation);
		entity.setHoursPerDay(toBigDecimal(hoursPerDay, "hoursPerDay"));
		entity.setHousingManagerID(housingManagerID);
		entity.setHousingStatus(housingStatus);
		entity.setInvoiceGroupName(invoiceGroup);
		entity.setJobOrder(new JobOrder(jobPostingID));
		entity.setOtExemption(toInteger(otExemption, "otExemption"));
		entity.setOtherHourlyFee(toBigDecimal(otherHourlyFee, "otherHourlyFee"));
		entity.setOtherHourlyFeeComments(otherHourlyFeeComments);
		entity.setOvertimeRate(toBigDecimal(overtimeRate, "overtimeRate"));
		entity.setPayRate(toBigDecimal(payRate, "payRate"));
		entity.setId(placementID);
		entity.setRecruitingManagerPercentGrossMargin(toBigDecimal(recruitingManagerPercentGrossMargin,
				"recruitingManagerPercentGrossMargin"));
		entity.setReferralFee(toBigDecimal(referralFee, "referralFee"));
		entity.setReferralFeeType(referralFeeType);
		entity.setReportTo(reportTo);
		entity.setReportedMargin(toBigDecimal(reportedMargin, "reportedMargin"));
		entity.setSalary(toBigDecimal(salary, "salary"));
		entity.setSalaryUnit(salaryUnit);
		entity.setSalesManagerPercentGrossMargin(toBigDecimal(salesManagerPercentGrossMargin, "salesManagerPercentGrossMargin"));

		entity.setStatementClientContact(new ClientContact(statementClientContactID));
		entity.setStatus(status);
		entity.setTaxRate(toBigDecimal(taxRate, "taxRate"));
		entity.setTaxState(taxState);
		entity.setTerminationReason(terminationReason);
		entity.setVendorClientCorporation(new ClientCorporation(vendorClientCorporationID));
		entity.setWorkWeekStart(toInteger(workWeekStart, "workWeekStart"));

		return entity;
	}

    public static FormPlacementDto instantiateFromPlacement(Placement placement){
        FormPlacementDto formPlacementDto = new FormPlacementDto();

        formPlacementDto.setApprovingUserID(placement.getApprovingClientContact() != null ? placement.getApprovingClientContact().getId() : null);
        formPlacementDto.setBackupApprovingUserID(placement.getBackupApprovingClientContact() != null ? placement.getBackupApprovingClientContact().getId() : null);
        formPlacementDto.setBillingUserID(placement.getBillingClientContact() != null ? placement.getBillingClientContact().getId() : null);
        formPlacementDto.setBillingFrequency(placement.getBillingFrequency());
        formPlacementDto.setBonusPackage(placement.getBonusPackage());
        formPlacementDto.setUserID(placement.getCandidate() != null ? placement.getCandidate().getId() : null);
        formPlacementDto.setClientBillRate(makeString(placement.getClientBillRate()));
        formPlacementDto.setClientOverTimeRate(makeString(placement.getClientOvertimeRate()));
        formPlacementDto.setComments(placement.getComments());
        formPlacementDto.setCorrelatedCustomDate1(makeString(placement.getCorrelatedCustomDate1()));
        formPlacementDto.setCorrelatedCustomDate2(makeString(placement.getCorrelatedCustomDate2()));
        formPlacementDto.setCorrelatedCustomDate3(makeString(placement.getCorrelatedCustomDate3()));
        formPlacementDto.setCorrelatedCustomFloat1(makeString(placement.getCorrelatedCustomFloat1()));
        formPlacementDto.setCorrelatedCustomFloat2(makeString(placement.getCorrelatedCustomFloat2()));
        formPlacementDto.setCorrelatedCustomFloat3(makeString(placement.getCorrelatedCustomFloat3()));
        formPlacementDto.setCorrelatedCustomInt1(makeString(placement.getCorrelatedCustomInt1()));
        formPlacementDto.setCorrelatedCustomInt2(makeString(placement.getCorrelatedCustomInt2()));
        formPlacementDto.setCorrelatedCustomInt3(makeString(placement.getCorrelatedCustomInt3()));
        formPlacementDto.setCorrelatedCustomText1(placement.getCorrelatedCustomText1());
        formPlacementDto.setCorrelatedCustomText10(placement.getCorrelatedCustomText10());
        formPlacementDto.setCorrelatedCustomText2(placement.getCorrelatedCustomText2());
        formPlacementDto.setCorrelatedCustomText3(placement.getCorrelatedCustomText3());
        formPlacementDto.setCorrelatedCustomText4(placement.getCorrelatedCustomText4());
        formPlacementDto.setCorrelatedCustomText5(placement.getCorrelatedCustomText5());
        formPlacementDto.setCorrelatedCustomText6(placement.getCorrelatedCustomText6());
        formPlacementDto.setCorrelatedCustomText7(placement.getCorrelatedCustomText7());
        formPlacementDto.setCorrelatedCustomText8(placement.getCorrelatedCustomText8());
        formPlacementDto.setCorrelatedCustomText9(placement.getCorrelatedCustomText9());
        formPlacementDto.setCorrelatedCustomTextBlock1(placement.getCorrelatedCustomTextBlock1());
        formPlacementDto.setCorrelatedCustomTextBlock2(placement.getCorrelatedCustomTextBlock2());
        formPlacementDto.setCorrelatedCustomTextBlock3(placement.getCorrelatedCustomTextBlock3());
        formPlacementDto.setCostCenter(placement.getCostCenter());

        formPlacementDto.setCustomBillRate1(makeString(placement.getCustomBillRate1()));
        formPlacementDto.setCustomBillRate2(makeString(placement.getCustomBillRate2()));
        formPlacementDto.setCustomBillRate3(makeString(placement.getCustomBillRate3()));
        formPlacementDto.setCustomBillRate4(makeString(placement.getCustomBillRate4()));
        formPlacementDto.setCustomBillRate5(makeString(placement.getCustomBillRate5()));
        formPlacementDto.setCustomBillRate6(makeString(placement.getCustomBillRate6()));
        formPlacementDto.setCustomBillRate7(makeString(placement.getCustomBillRate7()));
        formPlacementDto.setCustomBillRate8(makeString(placement.getCustomBillRate8()));
        formPlacementDto.setCustomBillRate9(makeString(placement.getCustomBillRate9()));
        formPlacementDto.setCustomDate1(makeString(placement.getCustomDate1()));
        formPlacementDto.setCustomDate2(makeString(placement.getCustomDate2()));
        formPlacementDto.setCustomDate3(makeString(placement.getCustomDate3()));
        formPlacementDto.setCustomFloat1(makeString(placement.getCustomFloat1()));
        formPlacementDto.setCustomFloat2(makeString(placement.getCustomFloat2()));
        formPlacementDto.setCustomFloat3(makeString(placement.getCustomFloat3()));
        formPlacementDto.setCustomInt1(makeString(placement.getCustomInt1()));
        formPlacementDto.setCustomInt2(makeString(placement.getCustomInt2()));
        formPlacementDto.setCustomInt3(makeString(placement.getCustomInt3()));
        formPlacementDto.setCustomPayRate1(makeString(placement.getCustomPayRate1()));
        formPlacementDto.setCustomPayRate2(makeString(placement.getCustomPayRate2()));
        formPlacementDto.setCustomPayRate3(makeString(placement.getCustomPayRate3()));
        formPlacementDto.setCustomPayRate4(makeString(placement.getCustomPayRate4()));
        formPlacementDto.setCustomPayRate5(makeString(placement.getCustomPayRate5()));
        formPlacementDto.setCustomPayRate6(makeString(placement.getCustomPayRate6()));
        formPlacementDto.setCustomPayRate7(makeString(placement.getCustomPayRate7()));
        formPlacementDto.setCustomPayRate8(makeString(placement.getCustomPayRate8()));
        formPlacementDto.setCustomPayRate9(makeString(placement.getCustomPayRate9()));
        formPlacementDto.setCustomText1(placement.getCustomText1());
        formPlacementDto.setCustomText10(placement.getCustomText10());
        formPlacementDto.setCustomText11(placement.getCustomText11());
        formPlacementDto.setCustomText12(placement.getCustomText12());
        formPlacementDto.setCustomText13(placement.getCustomText13());
        formPlacementDto.setCustomText14(placement.getCustomText14());
        formPlacementDto.setCustomText15(placement.getCustomText15());
        formPlacementDto.setCustomText16(placement.getCustomText16());
        formPlacementDto.setCustomText17(placement.getCustomText17());
        formPlacementDto.setCustomText18(placement.getCustomText18());
        formPlacementDto.setCustomText19(placement.getCustomText19());
        formPlacementDto.setCustomText2(placement.getCustomText2());
        formPlacementDto.setCustomText20(placement.getCustomText20());
        formPlacementDto.setCustomText3(placement.getCustomText3());
        formPlacementDto.setCustomText4(placement.getCustomText4());
        formPlacementDto.setCustomText5(placement.getCustomText5());
        formPlacementDto.setCustomText6(placement.getCustomText6());
        formPlacementDto.setCustomText7(placement.getCustomText7());
        formPlacementDto.setCustomText8(placement.getCustomText8());
        formPlacementDto.setCustomText9(placement.getCustomText9());
        formPlacementDto.setCustomText21(placement.getCustomText21());
        formPlacementDto.setCustomText22(placement.getCustomText22());
        formPlacementDto.setCustomText23(placement.getCustomText23());
        formPlacementDto.setCustomText24(placement.getCustomText24());
        formPlacementDto.setCustomText25(placement.getCustomText25());
        formPlacementDto.setCustomText26(placement.getCustomText26());
        formPlacementDto.setCustomText27(placement.getCustomText27());
        formPlacementDto.setCustomText28(placement.getCustomText28());
        formPlacementDto.setCustomText29(placement.getCustomText29());
        formPlacementDto.setCustomText30(placement.getCustomText30());
        formPlacementDto.setCustomText31(placement.getCustomText31());
        formPlacementDto.setCustomText32(placement.getCustomText32());
        formPlacementDto.setCustomText33(placement.getCustomText33());
        formPlacementDto.setCustomText34(placement.getCustomText34());
        formPlacementDto.setCustomText35(placement.getCustomText35());
        formPlacementDto.setCustomText36(placement.getCustomText36());
        formPlacementDto.setCustomText37(placement.getCustomText37());
        formPlacementDto.setCustomText38(placement.getCustomText38());
        formPlacementDto.setCustomText39(placement.getCustomText39());
        formPlacementDto.setCustomText40(placement.getCustomText40());

        formPlacementDto.setCustomTextBlock1(placement.getCustomTextBlock1());
        formPlacementDto.setCustomTextBlock2(placement.getCustomTextBlock2());
        formPlacementDto.setCustomTextBlock3(placement.getCustomTextBlock3());
        formPlacementDto.setCustomTextBlock4(placement.getCustomTextBlock4());
        formPlacementDto.setCustomTextBlock5(placement.getCustomTextBlock5());
        formPlacementDto.setDateAdded(makeString(placement.getDateAdded()));
        formPlacementDto.setDateBegin(makeString(placement.getDateBegin()));
        formPlacementDto.setDateClientEffective(makeString(placement.getDateClientEffective()));
        formPlacementDto.setDateEffective(makeString(placement.getDateEffective()));
        formPlacementDto.setDateEnd(makeString(placement.getDateEnd()));
        formPlacementDto.setDaysGuaranteed(makeString(placement.getDaysGuaranteed()));
        formPlacementDto.setDaysProRated(makeString(placement.getDaysProRated()));
        formPlacementDto.setDurationWeeks(makeString(placement.getDurationWeeks()));
        formPlacementDto.setEmployeeType(placement.getEmployeeType());
        formPlacementDto.setEmploymentType(placement.getEmploymentType());
        formPlacementDto.setFee(makeString(placement.getFee()));
        formPlacementDto.setHoursOfOperation(makeString(placement.getHoursOfOperation()));
        formPlacementDto.setHoursPerDay(makeString(placement.getHoursPerDay()));
        formPlacementDto.setHousingManagerID(placement.getHousingManagerID());
        formPlacementDto.setHousingStatus(placement.getHousingStatus());
        formPlacementDto.setInvoiceGroup(placement.getInvoiceGroupName());
        formPlacementDto.setJobPostingID(placement.getJobOrder() != null ? placement.getJobOrder().getId() : null);
        formPlacementDto.setOtExemption(makeString(placement.getOtExemption()));
        formPlacementDto.setOtherHourlyFee(makeString(placement.getOtherHourlyFee()));
        formPlacementDto.setOtherHourlyFeeComments(placement.getOtherHourlyFeeComments());
        formPlacementDto.setOvertimeRate(makeString(placement.getOvertimeRate()));
        formPlacementDto.setPayRate(makeString(placement.getPayRate()));
        formPlacementDto.setPlacementID(placement.getId());
        formPlacementDto.setRecruitingManagerPercentGrossMargin(makeString(placement.getRecruitingManagerPercentGrossMargin()));
        formPlacementDto.setReferralFee(makeString(placement.getReferralFee()));
        formPlacementDto.setReferralFeeType(makeString(placement.getReferralFeeType()));
        formPlacementDto.setReportTo(placement.getReportTo());
        formPlacementDto.setReportedMargin(makeString(placement.getReportedMargin()));
        formPlacementDto.setSalary(makeString(placement.getSalary()));
        formPlacementDto.setSalaryUnit(placement.getSalaryUnit());
        formPlacementDto.setSalesManagerPercentGrossMargin(makeString(placement.getSalesManagerPercentGrossMargin()));
        formPlacementDto.setStatementClientContactID(placement.getStatementClientContact() != null ? placement.getStatementClientContact().getId() : null);
        formPlacementDto.setStatus(placement.getStatus());
        formPlacementDto.setTaxRate(makeString(placement.getTaxRate()));
        formPlacementDto.setTaxState(placement.getTaxState());
        formPlacementDto.setTerminationReason(placement.getTerminationReason());
        formPlacementDto.setVendorClientCorporationID(placement.getVendorClientCorporation() != null ? placement.getVendorClientCorporation().getId() : null);
        formPlacementDto.setWorkWeekStart(makeString(placement.getWorkWeekStart()));

        return formPlacementDto;
    }

	/**
	 * Converts the form values to a SOAP dto.
	 * 
	 * @deprecated use {@link #instantiateEntity()} instead for BullhornEntity
	 * @return a SOAP dto
	 */
	@Deprecated
	public PlacementDto instantiateBullhornDto() {

		PlacementDto entity = new PlacementDto();
		entity.setApprovingClientContactID(approvingUserID);
		entity.setBackupApprovingClientContactID(backupApprovingUserID);
		entity.setBillingClientContactID(billingUserID);
		entity.setBillingFrequency(billingFrequency);
		entity.setBonusPackage(bonusPackage);
		entity.setCandidateID(userID);
		entity.setClientBillRate(toDouble(clientBillRate, "clientBillRate"));
		entity.setClientOvertimeRate(toDouble(clientOverTimeRate, "clientOverTimeRate"));
		entity.setComments(comments);
		entity.setCorrelatedCustomDate1(stringToXMLGregorianCalendar(correlatedCustomDate1));
		entity.setCorrelatedCustomDate2(stringToXMLGregorianCalendar(correlatedCustomDate2));
		entity.setCorrelatedCustomDate3(stringToXMLGregorianCalendar(correlatedCustomDate3));
		entity.setCorrelatedCustomFloat1(toDouble(correlatedCustomFloat1, "correlatedCustomFloat1"));
		entity.setCorrelatedCustomFloat2(toDouble(correlatedCustomFloat2, "correlatedCustomFloat2"));
		entity.setCorrelatedCustomFloat3(toDouble(correlatedCustomFloat3, "correlatedCustomFloat3"));
		entity.setCorrelatedCustomInt1(toInteger(correlatedCustomInt1, "correlatedCustomInt1"));
		entity.setCorrelatedCustomInt2(toInteger(correlatedCustomInt2, "correlatedCustomInt2"));
		entity.setCorrelatedCustomInt3(toInteger(correlatedCustomInt3, "correlatedCustomInt3"));
		entity.setCorrelatedCustomText1(correlatedCustomText1);
		entity.setCorrelatedCustomText10(correlatedCustomText10);
		entity.setCorrelatedCustomText2(correlatedCustomText2);
		entity.setCorrelatedCustomText3(correlatedCustomText3);
		entity.setCorrelatedCustomText4(correlatedCustomText4);
		entity.setCorrelatedCustomText5(correlatedCustomText5);
		entity.setCorrelatedCustomText6(correlatedCustomText6);
		entity.setCorrelatedCustomText7(correlatedCustomText7);
		entity.setCorrelatedCustomText8(correlatedCustomText8);
		entity.setCorrelatedCustomText9(correlatedCustomText9);
		entity.setCorrelatedCustomTextBlock1(correlatedCustomTextBlock1);
		entity.setCorrelatedCustomTextBlock2(correlatedCustomTextBlock2);
		entity.setCorrelatedCustomTextBlock3(correlatedCustomTextBlock3);
		entity.setCostCenter(costCenter);

		entity.setCustomBillRate1(toBigDecimal(customBillRate1, "customBillRate1"));
		entity.setCustomBillRate10(toBigDecimal(customBillRate10, "customBillRate10"));
		entity.setCustomBillRate2(toBigDecimal(customBillRate2, "customBillRate2"));
		entity.setCustomBillRate3(toBigDecimal(customBillRate3, "customBillRate3"));
		entity.setCustomBillRate4(toBigDecimal(customBillRate4, "customBillRate4"));
		entity.setCustomBillRate5(toBigDecimal(customBillRate5, "customBillRate5"));
		entity.setCustomBillRate6(toBigDecimal(customBillRate6, "customBillRate6"));
		entity.setCustomBillRate7(toBigDecimal(customBillRate7, "customBillRate7"));
		entity.setCustomBillRate8(toBigDecimal(customBillRate8, "customBillRate8"));
		entity.setCustomBillRate9(toBigDecimal(customBillRate9, "customBillRate9"));
		entity.setCustomDate1(stringToXMLGregorianCalendar(customDate1));
		entity.setCustomDate2(stringToXMLGregorianCalendar(customDate2));
		entity.setCustomDate3(stringToXMLGregorianCalendar(customDate3));
		entity.setCustomFloat1(toDouble(customFloat1, "customFloat1"));
		entity.setCustomFloat2(toDouble(customFloat2, "customFloat2"));
		entity.setCustomFloat3(toDouble(customFloat3, "customFloat3"));
		entity.setCustomInt1(toInteger(customInt1, "customInt1"));
		entity.setCustomInt2(toInteger(customInt2, "customInt2"));
		entity.setCustomInt3(toInteger(customInt3, "customInt3"));
		entity.setCustomPayRate1(toBigDecimal(customPayRate1, "customPayRate1"));
		entity.setCustomPayRate10(toBigDecimal(customPayRate10, "customPayRate10"));
		entity.setCustomPayRate2(toBigDecimal(customPayRate2, "customPayRate2"));
		entity.setCustomPayRate3(toBigDecimal(customPayRate3, "customPayRate3"));
		entity.setCustomPayRate4(toBigDecimal(customPayRate4, "customPayRate4"));
		entity.setCustomPayRate5(toBigDecimal(customPayRate5, "customPayRate5"));
		entity.setCustomPayRate6(toBigDecimal(customPayRate6, "customPayRate6"));
		entity.setCustomPayRate7(toBigDecimal(customPayRate7, "customPayRate7"));
		entity.setCustomPayRate8(toBigDecimal(customPayRate8, "customPayRate8"));
		entity.setCustomPayRate9(toBigDecimal(customPayRate9, "customPayRate9"));
		entity.setCustomText1(customText1);
		entity.setCustomText2(customText2);
		entity.setCustomText3(customText3);
		entity.setCustomText4(customText4);
		entity.setCustomText5(customText5);
		entity.setCustomText6(customText6);
		entity.setCustomText7(customText7);
		entity.setCustomText8(customText8);
		entity.setCustomText9(customText9);
		entity.setCustomText10(customText10);
		entity.setCustomText11(customText11);
		entity.setCustomText12(customText12);
		entity.setCustomText13(customText13);
		entity.setCustomText14(customText14);
		entity.setCustomText15(customText15);
		entity.setCustomText16(customText16);
		entity.setCustomText17(customText17);
		entity.setCustomText18(customText18);
		entity.setCustomText19(customText19);
		entity.setCustomText20(customText20);
		entity.setCustomText21(customText21);
		entity.setCustomText22(customText22);
		entity.setCustomText23(customText23);
		entity.setCustomText24(customText24);
		entity.setCustomText25(customText25);
		entity.setCustomText26(customText26);
		entity.setCustomText27(customText27);
		entity.setCustomText28(customText28);
		entity.setCustomText29(customText29);
		entity.setCustomText30(customText30);
		entity.setCustomText31(customText31);
		entity.setCustomText32(customText32);
		entity.setCustomText33(customText33);
		entity.setCustomText34(customText34);
		entity.setCustomText35(customText35);
		entity.setCustomText36(customText36);
		entity.setCustomText37(customText37);
		entity.setCustomText38(customText38);
		entity.setCustomText39(customText39);
		entity.setCustomText40(customText40);

		entity.setCustomTextBlock1(customTextBlock1);
		entity.setCustomTextBlock2(customTextBlock2);
		entity.setCustomTextBlock3(customTextBlock3);
		entity.setCustomTextBlock4(customTextBlock4);
		entity.setCustomTextBlock5(customTextBlock5);
		entity.setDateAdded(stringToXMLGregorianCalendar(dateAdded));
		entity.setDateBegin(stringToXMLGregorianCalendar(dateBegin));
		entity.setDateClientEffective(stringToXMLGregorianCalendar(dateClientEffective));
		entity.setDateEffective(stringToXMLGregorianCalendar(dateEffective));
		entity.setDateEnd(stringToXMLGregorianCalendar(dateEnd));
		entity.setDaysGuaranteed(toInteger(daysGuaranteed, "daysGuaranteed"));
		entity.setDaysProRated(toInteger(daysProRated, "daysProRated"));
		entity.setDurationWeeks(toDouble(durationWeeks, "durationWeeks"));
		entity.setEmployeeType(employeeType);
		entity.setEmploymentType(employmentType);
		entity.setFee(toDouble(fee, "fee"));
		entity.setHoursOfOperation(hoursOfOperation);
		entity.setHoursPerDay(toDouble(hoursPerDay, "hoursPerDay"));
		entity.setHousingManagerID(housingManagerID);
		entity.setHousingStatus(housingStatus);
		entity.setInvoiceGroupName(invoiceGroup);
		entity.setJobOrderID(jobPostingID);
		entity.setOtExemption(toInteger(otExemption, "otExemption"));
		entity.setOtherHourlyFee(toDouble(otherHourlyFee, "otherHourlyFee"));
		entity.setOtherHourlyFeeComments(otherHourlyFeeComments);
		entity.setOvertimeRate(toDouble(overtimeRate, "overtimeRate"));
		entity.setPayRate(toBigDecimal(payRate, "payRate"));
		entity.setPlacementID(placementID);
		entity.setRecruitingManagerPercentGrossMargin(toDouble(recruitingManagerPercentGrossMargin, "recruitingManagerPercentGrossMargin"));
		entity.setReferralFee(toBigDecimal(referralFee, "referralFee"));
		entity.setReferralFeeType(referralFeeType);
		entity.setReportTo(reportTo);
		entity.setReportedMargin(toDouble(reportedMargin, "reportedMargin"));
		entity.setSalary(toBigDecimal(salary, "salary"));
		entity.setSalaryUnit(salaryUnit);
		entity.setSalesManagerPercentGrossMargin(toDouble(salesManagerPercentGrossMargin, "salesManagerPercentGrossMargin"));
		entity.setShiftID(shiftID);
		entity.setStatementClientContactID(statementClientContactID);
		entity.setStatus(status);
		entity.setTaxRate(toDouble(taxRate, "taxRate"));
		entity.setTaxState(taxState);
		entity.setTerminationReason(terminationReason);
		entity.setVendorClientCorporationID(vendorClientCorporationID);
		entity.setWorkWeekStart(toInteger(workWeekStart, "workWeekStart"));
		entity.setWorkersCompensationRateID(workersCompRateID);
		return entity;
	}

}
