package com.client.core.formtrigger.model.form.impl;

import org.apache.log4j.Logger;

import com.bullhorn.entity.job.PlacementChangeRequestDto;
import com.bullhornsdk.data.model.entity.core.standard.ClientContact;
import com.bullhornsdk.data.model.entity.core.standard.ClientCorporation;
import com.bullhornsdk.data.model.entity.core.standard.Placement;
import com.bullhornsdk.data.model.entity.core.standard.PlacementChangeRequest;
import com.bullhornsdk.data.model.entity.embedded.LinkedId;
import com.client.core.formtrigger.model.form.AbstractFormDto;

public class FormPlacementChangeRequestDto extends AbstractFormDto<PlacementChangeRequest> {
	private Integer billingUserID;
	private String billingFrequency;
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
	private String isChangeRequest;
	private String otExemption;
	private String overtimeRate;
	private String payRate;
	private Integer placementChangeRequestID;
	private Integer placementID;
	private String recruitingManagerPercentGrossMargin;
	private String reportTo;
	private String requestCustomDate1;
	private String requestCustomDate2;
	private String requestCustomDate3;
	private String requestCustomFloat1;
	private String requestCustomFloat2;
	private String requestCustomFloat3;
	private String requestCustomInt1;
	private String requestCustomInt2;
	private String requestCustomInt3;
	private String requestCustomText1;
	private String requestCustomText10;
	private String requestCustomText11;
	private String requestCustomText12;
	private String requestCustomText13;
	private String requestCustomText14;
	private String requestCustomText15;
	private String requestCustomText16;
	private String requestCustomText17;
	private String requestCustomText18;
	private String requestCustomText19;
	private String requestCustomText2;
	private String requestCustomText20;
	private String requestCustomText21;
	private String requestCustomText22;
	private String requestCustomText23;
	private String requestCustomText24;
	private String requestCustomText25;
	private String requestCustomText26;
	private String requestCustomText27;
	private String requestCustomText28;
	private String requestCustomText29;
	private String requestCustomText3;
	private String requestCustomText30;
	private String requestCustomText31;
	private String requestCustomText32;
	private String requestCustomText33;
	private String requestCustomText34;
	private String requestCustomText35;
	private String requestCustomText36;
	private String requestCustomText37;
	private String requestCustomText38;
	private String requestCustomText39;
	private String requestCustomText4;
	private String requestCustomText40;
	private String requestCustomText5;
	private String requestCustomText6;
	private String requestCustomText7;
	private String requestCustomText8;
	private String requestCustomText9;
	private String requestCustomTextBlock1;
	private String requestCustomTextBlock2;
	private String requestCustomTextBlock3;
	private String requestCustomTextBlock4;
	private String requestCustomTextBlock5;
	private Integer requestingUserID;
	private String requestStatus;
	private String requestType;
	private String salary;
	private String salaryUnit;
	private String salesManagerPercentGrossMargin;
	private Integer statementUserID;
	private String status;
	private String terminationReason;
	private Integer vendorClientCorporationID;
	private String workWeekStart;
	private Integer workersCompRateID;

	public FormPlacementChangeRequestDto() {
		super(Logger.getLogger(FormPlacementChangeRequestDto.class));
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

	public String getIsChangeRequest() {
		return isChangeRequest;
	}

	public void setIsChangeRequest(String isChangeRequest) {
		this.isChangeRequest = isChangeRequest;
	}

	public String getOtExemption() {
		return otExemption;
	}

	public void setOtExemption(String otExemption) {
		this.otExemption = otExemption;
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

	public Integer getPlacementChangeRequestID() {
		return placementChangeRequestID;
	}

	public void setPlacementChangeRequestID(Integer placementChangeRequestID) {
		this.placementChangeRequestID = placementChangeRequestID;
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

	public String getReportTo() {
		return reportTo;
	}

	public void setReportTo(String reportTo) {
		this.reportTo = reportTo;
	}

	public String getRequestCustomDate1() {
		return requestCustomDate1;
	}

	public void setRequestCustomDate1(String requestCustomDate1) {
		this.requestCustomDate1 = requestCustomDate1;
	}

	public String getRequestCustomDate2() {
		return requestCustomDate2;
	}

	public void setRequestCustomDate2(String requestCustomDate2) {
		this.requestCustomDate2 = requestCustomDate2;
	}

	public String getRequestCustomDate3() {
		return requestCustomDate3;
	}

	public void setRequestCustomDate3(String requestCustomDate3) {
		this.requestCustomDate3 = requestCustomDate3;
	}

	public String getRequestCustomFloat1() {
		return requestCustomFloat1;
	}

	public void setRequestCustomFloat1(String requestCustomFloat1) {
		this.requestCustomFloat1 = requestCustomFloat1;
	}

	public String getRequestCustomFloat2() {
		return requestCustomFloat2;
	}

	public void setRequestCustomFloat2(String requestCustomFloat2) {
		this.requestCustomFloat2 = requestCustomFloat2;
	}

	public String getRequestCustomFloat3() {
		return requestCustomFloat3;
	}

	public void setRequestCustomFloat3(String requestCustomFloat3) {
		this.requestCustomFloat3 = requestCustomFloat3;
	}

	public String getRequestCustomInt1() {
		return requestCustomInt1;
	}

	public void setRequestCustomInt1(String requestCustomInt1) {
		this.requestCustomInt1 = requestCustomInt1;
	}

	public String getRequestCustomInt2() {
		return requestCustomInt2;
	}

	public void setRequestCustomInt2(String requestCustomInt2) {
		this.requestCustomInt2 = requestCustomInt2;
	}

	public String getRequestCustomInt3() {
		return requestCustomInt3;
	}

	public void setRequestCustomInt3(String requestCustomInt3) {
		this.requestCustomInt3 = requestCustomInt3;
	}

	public String getRequestCustomText1() {
		return requestCustomText1;
	}

	public void setRequestCustomText1(String requestCustomText1) {
		this.requestCustomText1 = requestCustomText1;
	}

	public String getRequestCustomText10() {
		return requestCustomText10;
	}

	public void setRequestCustomText10(String requestCustomText10) {
		this.requestCustomText10 = requestCustomText10;
	}

	public String getRequestCustomText11() {
		return requestCustomText11;
	}

	public void setRequestCustomText11(String requestCustomText11) {
		this.requestCustomText11 = requestCustomText11;
	}

	public String getRequestCustomText12() {
		return requestCustomText12;
	}

	public void setRequestCustomText12(String requestCustomText12) {
		this.requestCustomText12 = requestCustomText12;
	}

	public String getRequestCustomText13() {
		return requestCustomText13;
	}

	public void setRequestCustomText13(String requestCustomText13) {
		this.requestCustomText13 = requestCustomText13;
	}

	public String getRequestCustomText14() {
		return requestCustomText14;
	}

	public void setRequestCustomText14(String requestCustomText14) {
		this.requestCustomText14 = requestCustomText14;
	}

	public String getRequestCustomText15() {
		return requestCustomText15;
	}

	public void setRequestCustomText15(String requestCustomText15) {
		this.requestCustomText15 = requestCustomText15;
	}

	public String getRequestCustomText16() {
		return requestCustomText16;
	}

	public void setRequestCustomText16(String requestCustomText16) {
		this.requestCustomText16 = requestCustomText16;
	}

	public String getRequestCustomText17() {
		return requestCustomText17;
	}

	public void setRequestCustomText17(String requestCustomText17) {
		this.requestCustomText17 = requestCustomText17;
	}

	public String getRequestCustomText18() {
		return requestCustomText18;
	}

	public void setRequestCustomText18(String requestCustomText18) {
		this.requestCustomText18 = requestCustomText18;
	}

	public String getRequestCustomText19() {
		return requestCustomText19;
	}

	public void setRequestCustomText19(String requestCustomText19) {
		this.requestCustomText19 = requestCustomText19;
	}

	public String getRequestCustomText2() {
		return requestCustomText2;
	}

	public void setRequestCustomText2(String requestCustomText2) {
		this.requestCustomText2 = requestCustomText2;
	}

	public String getRequestCustomText20() {
		return requestCustomText20;
	}

	public void setRequestCustomText20(String requestCustomText20) {
		this.requestCustomText20 = requestCustomText20;
	}

	public String getRequestCustomText21() {
		return requestCustomText21;
	}

	public void setRequestCustomText21(String requestCustomText21) {
		this.requestCustomText21 = requestCustomText21;
	}

	public String getRequestCustomText22() {
		return requestCustomText22;
	}

	public void setRequestCustomText22(String requestCustomText22) {
		this.requestCustomText22 = requestCustomText22;
	}

	public String getRequestCustomText23() {
		return requestCustomText23;
	}

	public void setRequestCustomText23(String requestCustomText23) {
		this.requestCustomText23 = requestCustomText23;
	}

	public String getRequestCustomText24() {
		return requestCustomText24;
	}

	public void setRequestCustomText24(String requestCustomText24) {
		this.requestCustomText24 = requestCustomText24;
	}

	public String getRequestCustomText25() {
		return requestCustomText25;
	}

	public void setRequestCustomText25(String requestCustomText25) {
		this.requestCustomText25 = requestCustomText25;
	}

	public String getRequestCustomText26() {
		return requestCustomText26;
	}

	public void setRequestCustomText26(String requestCustomText26) {
		this.requestCustomText26 = requestCustomText26;
	}

	public String getRequestCustomText27() {
		return requestCustomText27;
	}

	public void setRequestCustomText27(String requestCustomText27) {
		this.requestCustomText27 = requestCustomText27;
	}

	public String getRequestCustomText28() {
		return requestCustomText28;
	}

	public void setRequestCustomText28(String requestCustomText28) {
		this.requestCustomText28 = requestCustomText28;
	}

	public String getRequestCustomText29() {
		return requestCustomText29;
	}

	public void setRequestCustomText29(String requestCustomText29) {
		this.requestCustomText29 = requestCustomText29;
	}

	public String getRequestCustomText3() {
		return requestCustomText3;
	}

	public void setRequestCustomText3(String requestCustomText3) {
		this.requestCustomText3 = requestCustomText3;
	}

	public String getRequestCustomText30() {
		return requestCustomText30;
	}

	public void setRequestCustomText30(String requestCustomText30) {
		this.requestCustomText30 = requestCustomText30;
	}

	public String getRequestCustomText31() {
		return requestCustomText31;
	}

	public void setRequestCustomText31(String requestCustomText31) {
		this.requestCustomText31 = requestCustomText31;
	}

	public String getRequestCustomText32() {
		return requestCustomText32;
	}

	public void setRequestCustomText32(String requestCustomText32) {
		this.requestCustomText32 = requestCustomText32;
	}

	public String getRequestCustomText33() {
		return requestCustomText33;
	}

	public void setRequestCustomText33(String requestCustomText33) {
		this.requestCustomText33 = requestCustomText33;
	}

	public String getRequestCustomText34() {
		return requestCustomText34;
	}

	public void setRequestCustomText34(String requestCustomText34) {
		this.requestCustomText34 = requestCustomText34;
	}

	public String getRequestCustomText35() {
		return requestCustomText35;
	}

	public void setRequestCustomText35(String requestCustomText35) {
		this.requestCustomText35 = requestCustomText35;
	}

	public String getRequestCustomText36() {
		return requestCustomText36;
	}

	public void setRequestCustomText36(String requestCustomText36) {
		this.requestCustomText36 = requestCustomText36;
	}

	public String getRequestCustomText37() {
		return requestCustomText37;
	}

	public void setRequestCustomText37(String requestCustomText37) {
		this.requestCustomText37 = requestCustomText37;
	}

	public String getRequestCustomText38() {
		return requestCustomText38;
	}

	public void setRequestCustomText38(String requestCustomText38) {
		this.requestCustomText38 = requestCustomText38;
	}

	public String getRequestCustomText39() {
		return requestCustomText39;
	}

	public void setRequestCustomText39(String requestCustomText39) {
		this.requestCustomText39 = requestCustomText39;
	}

	public String getRequestCustomText4() {
		return requestCustomText4;
	}

	public void setRequestCustomText4(String requestCustomText4) {
		this.requestCustomText4 = requestCustomText4;
	}

	public String getRequestCustomText40() {
		return requestCustomText40;
	}

	public void setRequestCustomText40(String requestCustomText40) {
		this.requestCustomText40 = requestCustomText40;
	}

	public String getRequestCustomText5() {
		return requestCustomText5;
	}

	public void setRequestCustomText5(String requestCustomText5) {
		this.requestCustomText5 = requestCustomText5;
	}

	public String getRequestCustomText6() {
		return requestCustomText6;
	}

	public void setRequestCustomText6(String requestCustomText6) {
		this.requestCustomText6 = requestCustomText6;
	}

	public String getRequestCustomText7() {
		return requestCustomText7;
	}

	public void setRequestCustomText7(String requestCustomText7) {
		this.requestCustomText7 = requestCustomText7;
	}

	public String getRequestCustomText8() {
		return requestCustomText8;
	}

	public void setRequestCustomText8(String requestCustomText8) {
		this.requestCustomText8 = requestCustomText8;
	}

	public String getRequestCustomText9() {
		return requestCustomText9;
	}

	public void setRequestCustomText9(String requestCustomText9) {
		this.requestCustomText9 = requestCustomText9;
	}

	public String getRequestCustomTextBlock1() {
		return requestCustomTextBlock1;
	}

	public void setRequestCustomTextBlock1(String requestCustomTextBlock1) {
		this.requestCustomTextBlock1 = requestCustomTextBlock1;
	}

	public String getRequestCustomTextBlock2() {
		return requestCustomTextBlock2;
	}

	public void setRequestCustomTextBlock2(String requestCustomTextBlock2) {
		this.requestCustomTextBlock2 = requestCustomTextBlock2;
	}

	public String getRequestCustomTextBlock3() {
		return requestCustomTextBlock3;
	}

	public void setRequestCustomTextBlock3(String requestCustomTextBlock3) {
		this.requestCustomTextBlock3 = requestCustomTextBlock3;
	}

	public String getRequestCustomTextBlock4() {
		return requestCustomTextBlock4;
	}

	public void setRequestCustomTextBlock4(String requestCustomTextBlock4) {
		this.requestCustomTextBlock4 = requestCustomTextBlock4;
	}

	public String getRequestCustomTextBlock5() {
		return requestCustomTextBlock5;
	}

	public void setRequestCustomTextBlock5(String requestCustomTextBlock5) {
		this.requestCustomTextBlock5 = requestCustomTextBlock5;
	}

	public Integer getRequestingUserID() {
		return requestingUserID;
	}

	public void setRequestingUserID(Integer requestingUserID) {
		this.requestingUserID = requestingUserID;
	}

	public String getRequestStatus() {
		return requestStatus;
	}

	public void setRequestStatus(String requestStatus) {
		this.requestStatus = requestStatus;
	}

	public String getRequestType() {
		return requestType;
	}

	public void setRequestType(String requestType) {
		this.requestType = requestType;
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

	public Integer getStatementUserID() {
		return statementUserID;
	}

	public void setStatementUserID(Integer statementUserID) {
		this.statementUserID = statementUserID;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getTerminationReason() {
		return terminationReason;
	}

	public void setTerminationReason(String terminationReason) {
		this.terminationReason = terminationReason;
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
	public String toString() {
		StringBuilder result = new StringBuilder();
		String NEW_LINE = System.getProperty("line.separator");
		result.append("{" + NEW_LINE);
		result.append(" billingUserID: " + billingUserID + "," + NEW_LINE);
		result.append(" billingFrequency: " + billingFrequency + "," + NEW_LINE);
		result.append(" clientBillRate: " + clientBillRate + "," + NEW_LINE);
		result.append(" clientOverTimeRate: " + clientOverTimeRate + "," + NEW_LINE);
		result.append(" comments: " + comments + "," + NEW_LINE);
		result.append(" correlatedCustomDate1: " + correlatedCustomDate1 + "," + NEW_LINE);
		result.append(" correlatedCustomDate2: " + correlatedCustomDate2 + "," + NEW_LINE);
		result.append(" correlatedCustomDate3: " + correlatedCustomDate3 + "," + NEW_LINE);
		result.append(" correlatedCustomFloat1: " + correlatedCustomFloat1 + "," + NEW_LINE);
		result.append(" correlatedCustomFloat2: " + correlatedCustomFloat2 + "," + NEW_LINE);
		result.append(" correlatedCustomFloat3: " + correlatedCustomFloat3 + "," + NEW_LINE);
		result.append(" correlatedCustomInt1: " + correlatedCustomInt1 + "," + NEW_LINE);
		result.append(" correlatedCustomInt2: " + correlatedCustomInt2 + "," + NEW_LINE);
		result.append(" correlatedCustomInt3: " + correlatedCustomInt3 + "," + NEW_LINE);
		result.append(" correlatedCustomText1: " + correlatedCustomText1 + "," + NEW_LINE);
		result.append(" correlatedCustomText10: " + correlatedCustomText10 + "," + NEW_LINE);
		result.append(" correlatedCustomText2: " + correlatedCustomText2 + "," + NEW_LINE);
		result.append(" correlatedCustomText3: " + correlatedCustomText3 + "," + NEW_LINE);
		result.append(" correlatedCustomText4: " + correlatedCustomText4 + "," + NEW_LINE);
		result.append(" correlatedCustomText5: " + correlatedCustomText5 + "," + NEW_LINE);
		result.append(" correlatedCustomText6: " + correlatedCustomText6 + "," + NEW_LINE);
		result.append(" correlatedCustomText7: " + correlatedCustomText7 + "," + NEW_LINE);
		result.append(" correlatedCustomText8: " + correlatedCustomText8 + "," + NEW_LINE);
		result.append(" correlatedCustomText9: " + correlatedCustomText9 + "," + NEW_LINE);
		result.append(" correlatedCustomTextBlock1: " + correlatedCustomTextBlock1 + "," + NEW_LINE);
		result.append(" correlatedCustomTextBlock2: " + correlatedCustomTextBlock2 + "," + NEW_LINE);
		result.append(" correlatedCustomTextBlock3: " + correlatedCustomTextBlock3 + "," + NEW_LINE);
		result.append(" costCenter: " + costCenter + "," + NEW_LINE);
		result.append(" customBillRate1: " + customBillRate1 + "," + NEW_LINE);
		result.append(" customBillRate10: " + customBillRate10 + "," + NEW_LINE);
		result.append(" customBillRate2: " + customBillRate2 + "," + NEW_LINE);
		result.append(" customBillRate3: " + customBillRate3 + "," + NEW_LINE);
		result.append(" customBillRate4: " + customBillRate4 + "," + NEW_LINE);
		result.append(" customBillRate5: " + customBillRate5 + "," + NEW_LINE);
		result.append(" customBillRate6: " + customBillRate6 + "," + NEW_LINE);
		result.append(" customBillRate7: " + customBillRate7 + "," + NEW_LINE);
		result.append(" customBillRate8: " + customBillRate8 + "," + NEW_LINE);
		result.append(" customBillRate9: " + customBillRate9 + "," + NEW_LINE);
		result.append(" customDate1: " + customDate1 + "," + NEW_LINE);
		result.append(" customDate2: " + customDate2 + "," + NEW_LINE);
		result.append(" customDate3: " + customDate3 + "," + NEW_LINE);
		result.append(" customFloat1: " + customFloat1 + "," + NEW_LINE);
		result.append(" customFloat2: " + customFloat2 + "," + NEW_LINE);
		result.append(" customFloat3: " + customFloat3 + "," + NEW_LINE);
		result.append(" customInt1: " + customInt1 + "," + NEW_LINE);
		result.append(" customInt2: " + customInt2 + "," + NEW_LINE);
		result.append(" customInt3: " + customInt3 + "," + NEW_LINE);
		result.append(" customPayRate1: " + customPayRate1 + "," + NEW_LINE);
		result.append(" customPayRate2: " + customPayRate2 + "," + NEW_LINE);
		result.append(" customPayRate3: " + customPayRate3 + "," + NEW_LINE);
		result.append(" customPayRate4: " + customPayRate4 + "," + NEW_LINE);
		result.append(" customPayRate5: " + customPayRate5 + "," + NEW_LINE);
		result.append(" customPayRate6: " + customPayRate6 + "," + NEW_LINE);
		result.append(" customPayRate7: " + customPayRate7 + "," + NEW_LINE);
		result.append(" customPayRate8: " + customPayRate8 + "," + NEW_LINE);
		result.append(" customPayRate9: " + customPayRate9 + "," + NEW_LINE);
		result.append(" customPayRate10: " + customPayRate10 + "," + NEW_LINE);
		result.append(" customText1: " + customText1 + "," + NEW_LINE);
		result.append(" customText2: " + customText2 + "," + NEW_LINE);
		result.append(" customText3: " + customText3 + "," + NEW_LINE);
		result.append(" customText4: " + customText4 + "," + NEW_LINE);
		result.append(" customText5: " + customText5 + "," + NEW_LINE);
		result.append(" customText6: " + customText6 + "," + NEW_LINE);
		result.append(" customText7: " + customText7 + "," + NEW_LINE);
		result.append(" customText8: " + customText8 + "," + NEW_LINE);
		result.append(" customText9: " + customText9 + "," + NEW_LINE);
		result.append(" customText10: " + customText10 + "," + NEW_LINE);
		result.append(" customText11: " + customText11 + "," + NEW_LINE);
		result.append(" customText12: " + customText12 + "," + NEW_LINE);
		result.append(" customText13: " + customText13 + "," + NEW_LINE);
		result.append(" customText14: " + customText14 + "," + NEW_LINE);
		result.append(" customText15: " + customText15 + "," + NEW_LINE);
		result.append(" customText16: " + customText16 + "," + NEW_LINE);
		result.append(" customText17: " + customText17 + "," + NEW_LINE);
		result.append(" customText18: " + customText18 + "," + NEW_LINE);
		result.append(" customText19: " + customText19 + "," + NEW_LINE);
		result.append(" customText20: " + customText20 + "," + NEW_LINE);
		result.append(" customText21: " + customText21 + "," + NEW_LINE);
		result.append(" customText22: " + customText22 + "," + NEW_LINE);
		result.append(" customText23: " + customText23 + "," + NEW_LINE);
		result.append(" customText24: " + customText24 + "," + NEW_LINE);
		result.append(" customText25: " + customText25 + "," + NEW_LINE);
		result.append(" customText26: " + customText26 + "," + NEW_LINE);
		result.append(" customText27: " + customText27 + "," + NEW_LINE);
		result.append(" customText28: " + customText28 + "," + NEW_LINE);
		result.append(" customText29: " + customText29 + "," + NEW_LINE);
		result.append(" customText30: " + customText30 + "," + NEW_LINE);
		result.append(" customText31: " + customText31 + "," + NEW_LINE);
		result.append(" customText32: " + customText32 + "," + NEW_LINE);
		result.append(" customText33: " + customText33 + "," + NEW_LINE);
		result.append(" customText34: " + customText34 + "," + NEW_LINE);
		result.append(" customText35: " + customText35 + "," + NEW_LINE);
		result.append(" customText36: " + customText36 + "," + NEW_LINE);
		result.append(" customText37: " + customText37 + "," + NEW_LINE);
		result.append(" customText38: " + customText38 + "," + NEW_LINE);
		result.append(" customText39: " + customText39 + "," + NEW_LINE);
		result.append(" customText40: " + customText40 + "," + NEW_LINE);
		result.append(" customTextBlock1: " + customTextBlock1 + "," + NEW_LINE);
		result.append(" customTextBlock2: " + customTextBlock2 + "," + NEW_LINE);
		result.append(" customTextBlock3: " + customTextBlock3 + "," + NEW_LINE);
		result.append(" customTextBlock4: " + customTextBlock4 + "," + NEW_LINE);
		result.append(" customTextBlock5: " + customTextBlock5 + "," + NEW_LINE);
		result.append(" dateBegin: " + dateBegin + "," + NEW_LINE);
		result.append(" dateClientEffective: " + dateClientEffective + "," + NEW_LINE);
		result.append(" dateEffective: " + dateEffective + "," + NEW_LINE);
		result.append(" dateEnd: " + dateEnd + "," + NEW_LINE);
		result.append(" daysGuaranteed: " + daysGuaranteed + "," + NEW_LINE);
		result.append(" daysProRated: " + daysProRated + "," + NEW_LINE);
		result.append(" durationWeeks: " + durationWeeks + "," + NEW_LINE);
		result.append(" employeeType: " + employeeType + "," + NEW_LINE);
		result.append(" employmentType: " + employmentType + "," + NEW_LINE);
		result.append(" fee: " + fee + "," + NEW_LINE);
		result.append(" hoursOfOperation: " + hoursOfOperation + "," + NEW_LINE);
		result.append(" hoursPerDay: " + hoursPerDay + "," + NEW_LINE);
		result.append(" housingManagerID: " + housingManagerID + "," + NEW_LINE);
		result.append(" housingStatus: " + housingStatus + "," + NEW_LINE);
		result.append(" isChangeRequest: " + isChangeRequest + "," + NEW_LINE);
		result.append(" otExemption: " + otExemption + "," + NEW_LINE);
		result.append(" overtimeRate: " + overtimeRate + "," + NEW_LINE);
		result.append(" payRate: " + payRate + "," + NEW_LINE);
		result.append(" placementID: " + placementID + "," + NEW_LINE);
		result.append(" recruitingManagerPercentGrossMargin: " + recruitingManagerPercentGrossMargin + "," + NEW_LINE);
		result.append(" reportTo: " + reportTo + "," + NEW_LINE);
		result.append(" requestCustomDate1: " + requestCustomDate1 + "," + NEW_LINE);
		result.append(" requestStatus: " + requestStatus + "," + NEW_LINE);
		result.append(" requestType: " + requestType + "," + NEW_LINE);
		result.append(" salary: " + salary + "," + NEW_LINE);
		result.append(" salaryUnit: " + salaryUnit + "," + NEW_LINE);
		result.append(" salesManagerPercentGrossMargin: " + salesManagerPercentGrossMargin + "," + NEW_LINE);
		result.append(" status: " + status + "," + NEW_LINE);
		result.append(" terminationReason: " + terminationReason + "," + NEW_LINE);
		result.append(" vendorClientCorporationID: " + vendorClientCorporationID + "," + NEW_LINE);
		result.append(" workWeekStart: " + workWeekStart + "," + NEW_LINE);
		result.append(" workersCompRateID: " + workersCompRateID + "," + NEW_LINE);

		result.append("}");

		return result.toString();

	}

	@Override
	public PlacementChangeRequest instantiateEntity() {
		PlacementChangeRequest entity = new PlacementChangeRequest();

		entity.setBillingClientContact(new ClientContact(billingUserID));
		entity.setBillingFrequency(billingFrequency);
		entity.setClientBillRate(toBigDecimal(clientBillRate, "clientBillRate"));
		entity.setClientOvertimeRate(toBigDecimal(clientOverTimeRate, "clientOverTimeRate"));
		entity.setComments(comments);
		entity.setCorrelatedCustomDate1(stringToDateTime(customDate1));
		entity.setCorrelatedCustomDate2(stringToDateTime(customDate2));
		entity.setCorrelatedCustomDate3(stringToDateTime(customDate3));
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
		entity.setCustomText2(customText2);
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
		entity.setCustomText3(customText3);
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
		entity.setCustomText4(customText4);
		entity.setCustomText40(customText40);
		entity.setCustomText5(customText5);
		entity.setCustomText6(customText6);
		entity.setCustomText7(customText7);
		entity.setCustomText8(customText8);
		entity.setCustomText9(customText9);
		entity.setCustomTextBlock1(customTextBlock1);
		entity.setCustomTextBlock2(customTextBlock2);
		entity.setCustomTextBlock3(customTextBlock3);
		entity.setCustomTextBlock4(customTextBlock4);
		entity.setCustomTextBlock5(customTextBlock5);
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
		entity.setOtExemption(toInteger(otExemption, "otExemption"));
		entity.setOvertimeRate(toBigDecimal(overtimeRate, "overtimeRate"));
		entity.setPayRate(toBigDecimal(payRate, "payRate"));
		entity.setId(placementChangeRequestID);
		entity.setPlacement(new Placement(placementID));
		entity.setRecruitingManagerPercentGrossMargin(toBigDecimal(recruitingManagerPercentGrossMargin,
				"recruitingManagerPercentGrossMargin"));
		entity.setReportTo(reportTo);
		entity.setRequestCustomDate1(stringToDateTime(requestCustomDate1));
		entity.setRequestCustomDate2(stringToDateTime(requestCustomDate2));
		entity.setRequestCustomDate3(stringToDateTime(requestCustomDate3));
		entity.setRequestCustomFloat1(toBigDecimal(requestCustomFloat1, "requestCustomFloat1"));
		entity.setRequestCustomFloat2(toBigDecimal(requestCustomFloat2, "requestCustomFloat2"));
		entity.setRequestCustomFloat3(toBigDecimal(requestCustomFloat3, "requestCustomFloat3"));
		entity.setRequestCustomInt1(toInteger(requestCustomInt1, "requestCustomInt1"));
		entity.setRequestCustomInt2(toInteger(requestCustomInt2, "requestCustomInt2"));
		entity.setRequestCustomInt3(toInteger(requestCustomInt3, "requestCustomInt3"));
		entity.setRequestCustomText1(requestCustomText1);
		entity.setRequestCustomText10(requestCustomText10);
		entity.setRequestCustomText11(requestCustomText11);
		entity.setRequestCustomText12(requestCustomText12);
		entity.setRequestCustomText13(requestCustomText13);
		entity.setRequestCustomText14(requestCustomText14);
		entity.setRequestCustomText15(requestCustomText15);
		entity.setRequestCustomText16(requestCustomText16);
		entity.setRequestCustomText17(requestCustomText17);
		entity.setRequestCustomText18(requestCustomText18);
		entity.setRequestCustomText19(requestCustomText19);
		entity.setRequestCustomText2(requestCustomText2);
		entity.setRequestCustomText20(requestCustomText20);
		entity.setRequestCustomText3(requestCustomText3);
		entity.setRequestCustomText4(requestCustomText4);
		entity.setRequestCustomText5(requestCustomText5);
		entity.setRequestCustomText6(requestCustomText6);
		entity.setRequestCustomText7(requestCustomText7);
		entity.setRequestCustomText8(requestCustomText8);
		entity.setRequestCustomText9(requestCustomText9);
		entity.setRequestCustomTextBlock1(requestCustomTextBlock1);
		entity.setRequestCustomTextBlock2(requestCustomTextBlock2);
		entity.setRequestCustomTextBlock3(requestCustomTextBlock3);
		entity.setRequestCustomTextBlock4(requestCustomTextBlock4);
		entity.setRequestCustomTextBlock5(requestCustomTextBlock5);
		entity.setRequestStatus(requestStatus);
		entity.setRequestType(requestType);
		entity.setRequestingUser(new LinkedId(requestingUserID));
		entity.setSalary(toBigDecimal(salary, "salary"));
		entity.setSalaryUnit(salaryUnit);
		entity.setSalesManagerPercentGrossMargin(toBigDecimal(salesManagerPercentGrossMargin, "salesManagerPercentGrossMargin"));
		entity.setStatementClientContact(new ClientContact(statementUserID));
		entity.setStatus(status);
		entity.setTerminationReason(terminationReason);
		entity.setVendorClientCorporation(new ClientCorporation(vendorClientCorporationID));
		entity.setWorkWeekStart(toInteger(workWeekStart, "workWeekStart"));

		return entity;
	}

	/**
	 * Converts the form values to a SOAP dto.
	 * 
	 * @deprecated use {@link #instantiateEntity()} instead for BullhornEntity
	 * @return a SOAP dto
	 */
	@Deprecated
	public PlacementChangeRequestDto instantiateBullhornDto() {
		PlacementChangeRequestDto entity = new PlacementChangeRequestDto();

		entity.setBillingClientContactID(billingUserID);
		entity.setBillingFrequency(billingFrequency);
		entity.setClientBillRate(toDouble(clientBillRate, "clientBillRate"));
		entity.setClientOvertimeRate(toDouble(clientOverTimeRate, "clientOverTimeRate"));
		entity.setComments(comments);
		entity.setCorrelatedCustomDate1(stringToXMLGregorianCalendar(customDate1));
		entity.setCorrelatedCustomDate2(stringToXMLGregorianCalendar(customDate2));
		entity.setCorrelatedCustomDate3(stringToXMLGregorianCalendar(customDate3));
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
		entity.setCustomText2(customText2);
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
		entity.setCustomText3(customText3);
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
		entity.setCustomText4(customText4);
		entity.setCustomText40(customText40);
		entity.setCustomText5(customText5);
		entity.setCustomText6(customText6);
		entity.setCustomText7(customText7);
		entity.setCustomText8(customText8);
		entity.setCustomText9(customText9);
		entity.setCustomTextBlock1(customTextBlock1);
		entity.setCustomTextBlock2(customTextBlock2);
		entity.setCustomTextBlock3(customTextBlock3);
		entity.setCustomTextBlock4(customTextBlock4);
		entity.setCustomTextBlock5(customTextBlock5);
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
		entity.setOtExemption(toInteger(otExemption, "otExemption"));
		entity.setOvertimeRate(toDouble(overtimeRate, "overtimeRate"));
		entity.setPayRate(toBigDecimal(payRate, "payRate"));
		entity.setPlacementChangeRequestID(placementChangeRequestID);
		entity.setPlacementID(placementID);
		entity.setRecruitingManagerPercentGrossMargin(toDouble(recruitingManagerPercentGrossMargin, "recruitingManagerPercentGrossMargin"));
		entity.setReportTo(reportTo);
		entity.setRequestCustomDate1(stringToXMLGregorianCalendar(requestCustomDate1));
		entity.setRequestCustomDate2(stringToXMLGregorianCalendar(requestCustomDate2));
		entity.setRequestCustomDate3(stringToXMLGregorianCalendar(requestCustomDate3));
		entity.setRequestCustomFloat1(toDouble(requestCustomFloat1, "requestCustomFloat1"));
		entity.setRequestCustomFloat2(toDouble(requestCustomFloat2, "requestCustomFloat2"));
		entity.setRequestCustomFloat3(toDouble(requestCustomFloat3, "requestCustomFloat3"));
		entity.setRequestCustomInt1(toInteger(requestCustomInt1, "requestCustomInt1"));
		entity.setRequestCustomInt2(toInteger(requestCustomInt2, "requestCustomInt2"));
		entity.setRequestCustomInt3(toInteger(requestCustomInt3, "requestCustomInt3"));
		entity.setRequestCustomText1(requestCustomText1);
		entity.setRequestCustomText10(requestCustomText10);
		entity.setRequestCustomText11(requestCustomText11);
		entity.setRequestCustomText12(requestCustomText12);
		entity.setRequestCustomText13(requestCustomText13);
		entity.setRequestCustomText14(requestCustomText14);
		entity.setRequestCustomText15(requestCustomText15);
		entity.setRequestCustomText16(requestCustomText16);
		entity.setRequestCustomText17(requestCustomText17);
		entity.setRequestCustomText18(requestCustomText18);
		entity.setRequestCustomText19(requestCustomText19);
		entity.setRequestCustomText2(requestCustomText2);
		entity.setRequestCustomText20(requestCustomText20);
		entity.setRequestCustomText3(requestCustomText3);
		entity.setRequestCustomText4(requestCustomText4);
		entity.setRequestCustomText5(requestCustomText5);
		entity.setRequestCustomText6(requestCustomText6);
		entity.setRequestCustomText7(requestCustomText7);
		entity.setRequestCustomText8(requestCustomText8);
		entity.setRequestCustomText9(requestCustomText9);
		entity.setRequestCustomTextBlock1(requestCustomTextBlock1);
		entity.setRequestCustomTextBlock2(requestCustomTextBlock2);
		entity.setRequestCustomTextBlock3(requestCustomTextBlock3);
		entity.setRequestCustomTextBlock4(requestCustomTextBlock4);
		entity.setRequestCustomTextBlock5(requestCustomTextBlock5);
		entity.setRequestStatus(requestStatus);
		entity.setRequestType(requestType);
		entity.setRequestingUserID(requestingUserID);
		entity.setSalary(toBigDecimal(salary, "salary"));
		entity.setSalaryUnit(salaryUnit);
		entity.setSalesManagerPercentGrossMargin(toDouble(salesManagerPercentGrossMargin, "salesManagerPercentGrossMargin"));
		entity.setStatementClientContactID(statementUserID);
		entity.setStatus(status);
		entity.setTerminationReason(terminationReason);
		entity.setVendorClientCorporationID(vendorClientCorporationID);
		entity.setWorkWeekStart(toInteger(workWeekStart, "workWeekStart"));
		entity.setWorkersCompRateID(workersCompRateID);

		return entity;
	}

}
