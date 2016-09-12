package com.client.core.formtrigger.model.form.impl;

import com.bullhornsdk.data.model.entity.core.standard.CorporationDepartment;
import org.apache.log4j.Logger;

import com.bullhorn.entity.client.ClientCorporationDto;
import com.bullhorn.entity.emb.AddressWithoutCountry;
import com.bullhornsdk.data.model.entity.core.standard.ClientCorporation;
import com.bullhornsdk.data.model.entity.embedded.Address;
import com.bullhornsdk.data.model.entity.embedded.LinkedId;
import com.client.core.formtrigger.model.form.AbstractFormDto;

/**
 * Used to get values from bullhorn client corporation form and convert these to the regular ClientCorporationDto
 * 
 * @author magnus.palm
 * 
 * @param <ClientCorporation>
 */
public class FormClientCorporationDto extends AbstractFormDto<ClientCorporation> {

	public FormClientCorporationDto() {
		super(Logger.getLogger(FormClientCorporationDto.class));
	}

	private String address1;// 12 Silvermani Rd
	private String address2;//
	private String annualRevenue;// 0
	private String billingAddress1;//
	private String billingAddress2;//
	private String billingCity;//
	private String billingContact;//
	private String billingContact_display;//
	private String billingFrequency;// Weekly
	private String billingPhone;//
	private String billingState;//
	private String billingZip;//
	private String blacklistID;//
	private String businessSectorList;//
	private String businessSectorList_display;//
	private String candidateRestrictionBits;// 0
	private String city;// Boston
	private Integer clientCorporationID;// 1
	private String clientCorporationTemplate1TA1124;
	private String clientCorporationTemplate1_clientCorporationTemplateID;// 101
	private String clientCorporationTemplateCount;// 1
	private String companyDescription;//
	private String companyURL;//
	private String competitors;//
	private Integer countryID;// 1
	private String culture;//
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
	private String customTextBlock1;
	private String customTextBlock2;
	private String customTextBlock3;
	private String customTextBlock4;
	private String customTextBlock5;
	private Integer departmentID;// 8677
	private String externalID;//
	private String fax;// 222222222
	private String feeArrangement;// 0.00
	private String funding;//
	private String industryList;//
	private String invoiceFormat;//
	private String jobRestrictionBits;// 0
	private String name;// First Company
	private String notes;//
	private Integer numEmployees;// 0
	private Integer numOffices;// 0
	private String ownership;// Public
	private Integer parentClientCorporationID;//
	private String parentClientCorporationID_display;//
	private String phone;// 111111111
	private String preferredHousing;//
	private String state;// Massachusetts
	private String state_display;// Massachusetts
	private String tickerSymbol;//
	private String whitelistID;//
	private String yearFounded;// 0
	private String zip;// 01245
	private String status;
	private String taxRate;
	private Integer workWeekStart;

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

	public String getAnnualRevenue() {
		return annualRevenue;
	}

	public void setAnnualRevenue(String annualRevenue) {
		this.annualRevenue = annualRevenue;
	}

	public String getBillingAddress1() {
		return billingAddress1;
	}

	public void setBillingAddress1(String billingAddress1) {
		this.billingAddress1 = billingAddress1;
	}

	public String getBillingAddress2() {
		return billingAddress2;
	}

	public void setBillingAddress2(String billingAddress2) {
		this.billingAddress2 = billingAddress2;
	}

	public String getBillingCity() {
		return billingCity;
	}

	public void setBillingCity(String billingCity) {
		this.billingCity = billingCity;
	}

	public String getBillingContact() {
		return billingContact;
	}

	public void setBillingContact(String billingContact) {
		this.billingContact = billingContact;
	}

	public String getBillingContact_display() {
		return billingContact_display;
	}

	public void setBillingContact_display(String billingContact_display) {
		this.billingContact_display = billingContact_display;
	}

	public String getBillingFrequency() {
		return billingFrequency;
	}

	public void setBillingFrequency(String billingFrequency) {
		this.billingFrequency = billingFrequency;
	}

	public String getBillingPhone() {
		return billingPhone;
	}

	public void setBillingPhone(String billingPhone) {
		this.billingPhone = billingPhone;
	}

	public String getBillingState() {
		return billingState;
	}

	public void setBillingState(String billingState) {
		this.billingState = billingState;
	}

	public String getBillingZip() {
		return billingZip;
	}

	public void setBillingZip(String billingZip) {
		this.billingZip = billingZip;
	}

	public String getBlacklistID() {
		return blacklistID;
	}

	public void setBlacklistID(String blacklistID) {
		this.blacklistID = blacklistID;
	}

	public String getBusinessSectorList() {
		return businessSectorList;
	}

	public void setBusinessSectorList(String businessSectorList) {
		this.businessSectorList = businessSectorList;
	}

	public String getBusinessSectorList_display() {
		return businessSectorList_display;
	}

	public void setBusinessSectorList_display(String businessSectorList_display) {
		this.businessSectorList_display = businessSectorList_display;
	}

	public String getCandidateRestrictionBits() {
		return candidateRestrictionBits;
	}

	public void setCandidateRestrictionBits(String candidateRestrictionBits) {
		this.candidateRestrictionBits = candidateRestrictionBits;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getClientCorporationTemplate1TA1124() {
		return clientCorporationTemplate1TA1124;
	}

	public void setClientCorporationTemplate1TA1124(String clientCorporationTemplate1TA1124) {
		this.clientCorporationTemplate1TA1124 = clientCorporationTemplate1TA1124;
	}

	public String getClientCorporationTemplate1_clientCorporationTemplateID() {
		return clientCorporationTemplate1_clientCorporationTemplateID;
	}

	public void setClientCorporationTemplate1_clientCorporationTemplateID(String clientCorporationTemplate1_clientCorporationTemplateID) {
		this.clientCorporationTemplate1_clientCorporationTemplateID = clientCorporationTemplate1_clientCorporationTemplateID;
	}

	public String getClientCorporationTemplateCount() {
		return clientCorporationTemplateCount;
	}

	public void setClientCorporationTemplateCount(String clientCorporationTemplateCount) {
		this.clientCorporationTemplateCount = clientCorporationTemplateCount;
	}

	public String getCompanyDescription() {
		return companyDescription;
	}

	public void setCompanyDescription(String companyDescription) {
		this.companyDescription = companyDescription;
	}

	public String getCompanyURL() {
		return companyURL;
	}

	public void setCompanyURL(String companyURL) {
		this.companyURL = companyURL;
	}

	public String getCompetitors() {
		return competitors;
	}

	public void setCompetitors(String competitors) {
		this.competitors = competitors;
	}

	public Integer getCountryID() {
		return countryID;
	}

	public void setCountryID(Integer countryID) {
		this.countryID = countryID;
	}

	public String getCulture() {
		return culture;
	}

	public void setCulture(String culture) {
		this.culture = culture;
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

	public Integer getDepartmentID() {
		return departmentID;
	}

	public void setDepartmentID(Integer departmentID) {
		this.departmentID = departmentID;
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

	public String getFeeArrangement() {
		return feeArrangement;
	}

	public void setFeeArrangement(String feeArrangement) {
		this.feeArrangement = feeArrangement;
	}

	public String getFunding() {
		return funding;
	}

	public void setFunding(String funding) {
		this.funding = funding;
	}

	public String getIndustryList() {
		return industryList;
	}

	public void setIndustryList(String industryList) {
		this.industryList = industryList;
	}

	public String getInvoiceFormat() {
		return invoiceFormat;
	}

	public void setInvoiceFormat(String invoiceFormat) {
		this.invoiceFormat = invoiceFormat;
	}

	public String getJobRestrictionBits() {
		return jobRestrictionBits;
	}

	public void setJobRestrictionBits(String jobRestrictionBits) {
		this.jobRestrictionBits = jobRestrictionBits;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public Integer getNumEmployees() {
		return numEmployees;
	}

	public void setNumEmployees(Integer numEmployees) {
		this.numEmployees = numEmployees;
	}

	public Integer getNumOffices() {
		return numOffices;
	}

	public void setNumOffices(Integer numOffices) {
		this.numOffices = numOffices;
	}

	public String getOwnership() {
		return ownership;
	}

	public void setOwnership(String ownership) {
		this.ownership = ownership;
	}

	public Integer getParentClientCorporationID() {
		return parentClientCorporationID;
	}

	public void setParentClientCorporationID(Integer parentClientCorporationID) {
		this.parentClientCorporationID = parentClientCorporationID;
	}

	public String getParentClientCorporationID_display() {
		return parentClientCorporationID_display;
	}

	public void setParentClientCorporationID_display(String parentClientCorporationID_display) {
		this.parentClientCorporationID_display = parentClientCorporationID_display;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPreferredHousing() {
		return preferredHousing;
	}

	public void setPreferredHousing(String preferredHousing) {
		this.preferredHousing = preferredHousing;
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

	public String getTickerSymbol() {
		return tickerSymbol;
	}

	public void setTickerSymbol(String tickerSymbol) {
		this.tickerSymbol = tickerSymbol;
	}

	public String getWhitelistID() {
		return whitelistID;
	}

	public void setWhitelistID(String whitelistID) {
		this.whitelistID = whitelistID;
	}

	public String getYearFounded() {
		return yearFounded;
	}

	public void setYearFounded(String yearFounded) {
		this.yearFounded = yearFounded;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
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

	public Integer getWorkWeekStart() {
		return workWeekStart;
	}

	public void setWorkWeekStart(Integer workWeekStart) {
		this.workWeekStart = workWeekStart;
	}

	public Integer getClientCorporationID() {
		return clientCorporationID;
	}

	public void setClientCorporationID(Integer clientCorporationID) {
		this.clientCorporationID = clientCorporationID;
	}

	@Override
	public ClientCorporation instantiateEntity() {

		ClientCorporation clientCorporation = new ClientCorporation();

		clientCorporation.setAnnualRevenue(toBigDecimal(annualRevenue, "annualRevenue"));
		clientCorporation.setBillingContact(billingContact);
		clientCorporation.setBillingFrequency(billingFrequency);
		clientCorporation.setBillingPhone(billingPhone);
		clientCorporation.setBusinessSectorList(businessSectorList);
		clientCorporation.setId(clientCorporationID);
		clientCorporation.setCompanyDescription(companyDescription);
		clientCorporation.setCompanyURL(companyURL);
		clientCorporation.setCompetitors(competitors);
		clientCorporation.setCulture(culture);
		clientCorporation.setCustomDate1(stringToDateTime(customDate1));
		clientCorporation.setCustomDate2(stringToDateTime(customDate2));
		clientCorporation.setCustomDate3(stringToDateTime(customDate3));
		clientCorporation.setCustomFloat1(toBigDecimal(customFloat1, "customFloat1"));
		clientCorporation.setCustomFloat2(toBigDecimal(customFloat2, "customFloat2"));
		clientCorporation.setCustomFloat3(toBigDecimal(customFloat3, "customFloat3"));
		clientCorporation.setCustomInt1(customInt1);
		clientCorporation.setCustomInt2(customInt2);
		clientCorporation.setCustomInt3(customInt3);
		clientCorporation.setCustomText1(customText1);
		clientCorporation.setCustomText10(customText10);
		clientCorporation.setCustomText11(customText11);
		clientCorporation.setCustomText12(customText12);
		clientCorporation.setCustomText13(customText13);
		clientCorporation.setCustomText14(customText14);
		clientCorporation.setCustomText15(customText15);
		clientCorporation.setCustomText16(customText16);
		clientCorporation.setCustomText17(customText17);
		clientCorporation.setCustomText18(customText18);
		clientCorporation.setCustomText19(customText19);
		clientCorporation.setCustomText2(customText2);
		clientCorporation.setCustomText20(customText20);
		clientCorporation.setCustomText3(customText3);
		clientCorporation.setCustomText4(customText4);
		clientCorporation.setCustomText5(customText5);
		clientCorporation.setCustomText6(customText6);
		clientCorporation.setCustomText7(customText7);
		clientCorporation.setCustomText8(customText8);
		clientCorporation.setCustomText9(customText9);
		clientCorporation.setCustomTextBlock1(customTextBlock1);
		clientCorporation.setCustomTextBlock2(customTextBlock2);
		clientCorporation.setCustomTextBlock3(customTextBlock3);
		clientCorporation.setCustomTextBlock4(customTextBlock4);
		clientCorporation.setCustomTextBlock5(customTextBlock5);
		clientCorporation.setDateAdded(null);
		clientCorporation.setDateFounded(null);

		CorporationDepartment department = new CorporationDepartment();
		department.setId(departmentID);

		clientCorporation.setDepartment(department);
		clientCorporation.setExternalID(externalID);
		clientCorporation.setFax(fax);
		clientCorporation.setFeeArrangement(toBigDecimal(feeArrangement, "feeArrangement"));
		clientCorporation.setFunding(funding);
		clientCorporation.setIndustryList(industryList);
		clientCorporation.setInvoiceFormat(invoiceFormat);
		clientCorporation.setName(name);
		clientCorporation.setNotes(notes);
		clientCorporation.setNumEmployees(numEmployees);
		clientCorporation.setNumOffices(numOffices);
		clientCorporation.setOwnership(ownership);
		clientCorporation.setParentClientCorporation(new ClientCorporation(parentClientCorporationID));
		clientCorporation.setPhone(phone);
		clientCorporation.setRevenue(null);
		clientCorporation.setStatus(status);
		clientCorporation.setTaxRate(toBigDecimal(taxRate, "taxRate"));
		clientCorporation.setTickerSymbol(tickerSymbol);
		clientCorporation.setWorkWeekStart(workWeekStart);

		Address address = new Address();
		address.setAddress1(address1);
		address.setAddress2(address2);
		address.setCity(city);
		address.setCountryID(countryID);
		address.setState(state);
		address.setZip(zip);
		clientCorporation.setAddress(address);

		Address billingAddress = new Address();
		billingAddress.setAddress1(billingAddress1);
		billingAddress.setAddress2(billingAddress2);
		billingAddress.setCity(billingCity);
		billingAddress.setState(billingState);
		billingAddress.setZip(billingZip);
		clientCorporation.setBillingAddress(billingAddress);

		return clientCorporation;
	}

    public static FormClientCorporationDto instantiateFromClientCorporation(ClientCorporation clientCorporation){

        FormClientCorporationDto formClientCorporationDto = new FormClientCorporationDto();
        formClientCorporationDto.setAnnualRevenue(makeString(clientCorporation.getAnnualRevenue()));
        formClientCorporationDto.setBillingContact(clientCorporation.getBillingContact());
        formClientCorporationDto.setBillingFrequency(clientCorporation.getBillingFrequency());
        formClientCorporationDto.setBillingPhone(clientCorporation.getBillingPhone());
        formClientCorporationDto.setBusinessSectorList(clientCorporation.getBusinessSectorList());
        formClientCorporationDto.setClientCorporationID(clientCorporation.getId());
        formClientCorporationDto.setCompanyDescription(clientCorporation.getCompanyDescription());
        formClientCorporationDto.setCompanyURL(clientCorporation.getCompanyURL());
        formClientCorporationDto.setCompetitors(clientCorporation.getCompetitors());
        formClientCorporationDto.setCulture(clientCorporation.getCulture());
        formClientCorporationDto.setCustomDate1(makeString(clientCorporation.getCustomDate1()));
        formClientCorporationDto.setCustomDate1(makeString(clientCorporation.getCustomDate1()));
        formClientCorporationDto.setCustomDate2(makeString(clientCorporation.getCustomDate2()));
        formClientCorporationDto.setCustomDate3(makeString(clientCorporation.getCustomDate3()));
        formClientCorporationDto.setCustomFloat1(makeString(clientCorporation.getCustomFloat1()));
        formClientCorporationDto.setCustomFloat2(makeString(clientCorporation.getCustomFloat2()));
        formClientCorporationDto.setCustomFloat3(makeString(clientCorporation.getCustomFloat3()));
        formClientCorporationDto.setCustomInt1(clientCorporation.getCustomInt1());
        formClientCorporationDto.setCustomInt2(clientCorporation.getCustomInt2());
        formClientCorporationDto.setCustomInt3(clientCorporation.getCustomInt3());
        formClientCorporationDto.setCustomText1(clientCorporation.getCustomText1());
        formClientCorporationDto.setCustomText10(clientCorporation.getCustomText10());
        formClientCorporationDto.setCustomText11(clientCorporation.getCustomText11());
        formClientCorporationDto.setCustomText12(clientCorporation.getCustomText12());
        formClientCorporationDto.setCustomText13(clientCorporation.getCustomText13());
        formClientCorporationDto.setCustomText14(clientCorporation.getCustomText14());
        formClientCorporationDto.setCustomText15(clientCorporation.getCustomText15());
        formClientCorporationDto.setCustomText16(clientCorporation.getCustomText16());
        formClientCorporationDto.setCustomText17(clientCorporation.getCustomText17());
        formClientCorporationDto.setCustomText18(clientCorporation.getCustomText18());
        formClientCorporationDto.setCustomText19(clientCorporation.getCustomText19());
        formClientCorporationDto.setCustomText2(clientCorporation.getCustomText2());
        formClientCorporationDto.setCustomText20(clientCorporation.getCustomText20());
        formClientCorporationDto.setCustomText3(clientCorporation.getCustomText3());
        formClientCorporationDto.setCustomText4(clientCorporation.getCustomText4());
        formClientCorporationDto.setCustomText5(clientCorporation.getCustomText5());
        formClientCorporationDto.setCustomText6(clientCorporation.getCustomText6());
        formClientCorporationDto.setCustomText7(clientCorporation.getCustomText7());
        formClientCorporationDto.setCustomText8(clientCorporation.getCustomText8());
        formClientCorporationDto.setCustomText9(clientCorporation.getCustomText9());
        formClientCorporationDto.setCustomTextBlock1(clientCorporation.getCustomTextBlock1());
        formClientCorporationDto.setCustomTextBlock2(clientCorporation.getCustomTextBlock2());
        formClientCorporationDto.setCustomTextBlock3(clientCorporation.getCustomTextBlock3());
        formClientCorporationDto.setCustomTextBlock4(clientCorporation.getCustomTextBlock4());
        formClientCorporationDto.setCustomTextBlock5(clientCorporation.getCustomTextBlock5());
        formClientCorporationDto.setDepartmentID(clientCorporation.getDepartment() != null ? clientCorporation.getDepartment().getId() : null);
        formClientCorporationDto.setExternalID(clientCorporation.getExternalID());
        formClientCorporationDto.setFax(clientCorporation.getFax());
        formClientCorporationDto.setFeeArrangement(makeString(clientCorporation.getFeeArrangement()));
        formClientCorporationDto.setFunding(clientCorporation.getFunding());
        formClientCorporationDto.setIndustryList(clientCorporation.getIndustryList());
        formClientCorporationDto.setInvoiceFormat(clientCorporation.getInvoiceFormat());
        formClientCorporationDto.setName(clientCorporation.getName());
        formClientCorporationDto.setNotes(clientCorporation.getNotes());
        formClientCorporationDto.setNumEmployees(clientCorporation.getNumEmployees());
        formClientCorporationDto.setNumOffices(clientCorporation.getNumOffices());
        formClientCorporationDto.setOwnership(clientCorporation.getOwnership());
        formClientCorporationDto.setParentClientCorporationID(clientCorporation.getParentClientCorporation() != null ? clientCorporation.getParentClientCorporation().getId() : null);
        formClientCorporationDto.setPhone(clientCorporation.getPhone());
        formClientCorporationDto.setStatus(clientCorporation.getStatus());
        formClientCorporationDto.setTaxRate(makeString(clientCorporation.getTaxRate()));
        formClientCorporationDto.setTickerSymbol(clientCorporation.getTickerSymbol());
        formClientCorporationDto.setWorkWeekStart(clientCorporation.getWorkWeekStart());

        Address address = clientCorporation.getAddress();

        if(address != null){
            formClientCorporationDto.setAddress1(address.getAddress1());
            formClientCorporationDto.setAddress2(address.getAddress2());
            formClientCorporationDto.setCity(address.getCity());
            formClientCorporationDto.setState(address.getState());
            formClientCorporationDto.setZip(address.getZip());
            formClientCorporationDto.setCountryID(address.getCountryID());
        }

        address = clientCorporation.getBillingAddress();

        if(address != null){
            formClientCorporationDto.setBillingAddress1(address.getAddress1());
            formClientCorporationDto.setBillingAddress2(address.getAddress2());
            formClientCorporationDto.setBillingCity(address.getCity());
            formClientCorporationDto.setBillingState(address.getState());
            formClientCorporationDto.setBillingZip(address.getZip());
        }

        return formClientCorporationDto;
    }

	/**
	 * Converts the form values to a SOAP dto.
	 * 
	 * @deprecated use {@link #instantiateEntity()} instead for BullhornEntity
	 * @return a SOAP dto
	 */
	@Deprecated
	public ClientCorporationDto instantiateBullhornDto() {

		ClientCorporationDto clientCorporation = new ClientCorporationDto();

		clientCorporation.setAnnualRevenue(toBigDecimal(annualRevenue,"annualRevenue"));
		clientCorporation.setBillingContact(billingContact);
		clientCorporation.setBillingFrequency(billingFrequency);
		clientCorporation.setBillingPhone(billingPhone);
		clientCorporation.setBusinessSectorList(businessSectorList);
		clientCorporation.setClientCorporationID(clientCorporationID);
		clientCorporation.setCompanyDescription(companyDescription);
		clientCorporation.setCompanyURL(companyURL);
		clientCorporation.setCompetitors(competitors);
		clientCorporation.setCulture(culture);
		clientCorporation.setCustomDate1(stringToXMLGregorianCalendar(customDate1));
		clientCorporation.setCustomDate2(stringToXMLGregorianCalendar(customDate2));
		clientCorporation.setCustomDate3(stringToXMLGregorianCalendar(customDate3));
		clientCorporation.setCustomFloat1(toDouble(customFloat1,"customFloat1"));
		clientCorporation.setCustomFloat2(toDouble(customFloat2,"customFloat2"));
		clientCorporation.setCustomFloat3(toDouble(customFloat3,"customFloat3"));
		clientCorporation.setCustomInt1(customInt1);
		clientCorporation.setCustomInt2(customInt2);
		clientCorporation.setCustomInt3(customInt3);
		clientCorporation.setCustomText1(customText1);
		clientCorporation.setCustomText10(customText10);
		clientCorporation.setCustomText11(customText11);
		clientCorporation.setCustomText12(customText12);
		clientCorporation.setCustomText13(customText13);
		clientCorporation.setCustomText14(customText14);
		clientCorporation.setCustomText15(customText15);
		clientCorporation.setCustomText16(customText16);
		clientCorporation.setCustomText17(customText17);
		clientCorporation.setCustomText18(customText18);
		clientCorporation.setCustomText19(customText19);
		clientCorporation.setCustomText2(customText2);
		clientCorporation.setCustomText20(customText20);
		clientCorporation.setCustomText3(customText3);
		clientCorporation.setCustomText4(customText4);
		clientCorporation.setCustomText5(customText5);
		clientCorporation.setCustomText6(customText6);
		clientCorporation.setCustomText7(customText7);
		clientCorporation.setCustomText8(customText8);
		clientCorporation.setCustomText9(customText9);
		clientCorporation.setCustomTextBlock1(customTextBlock1);
		clientCorporation.setCustomTextBlock2(customTextBlock2);
		clientCorporation.setCustomTextBlock3(customTextBlock3);
		clientCorporation.setCustomTextBlock4(customTextBlock4);
		clientCorporation.setCustomTextBlock5(customTextBlock5);
		clientCorporation.setDateAdded(null);
		clientCorporation.setDateFounded(null);
		clientCorporation.setDepartmentID(departmentID);
		clientCorporation.setExternalID(externalID);
		clientCorporation.setFax(fax);
		clientCorporation.setFeeArrangement(toDouble(feeArrangement,"feeArrangement"));
		clientCorporation.setFunding(funding);
		clientCorporation.setIndustryList(industryList);
		clientCorporation.setInvoiceFormat(invoiceFormat);
		clientCorporation.setName(name);
		clientCorporation.setNotes(notes);
		clientCorporation.setNumEmployees(numEmployees);
		clientCorporation.setNumOffices(numOffices);
		clientCorporation.setOwnership(ownership);
		clientCorporation.setParentClientCorporationID(parentClientCorporationID);
		clientCorporation.setPhone(phone);
		clientCorporation.setRevenue(null);
		clientCorporation.setStatus(status);
		clientCorporation.setTaxRate(toDouble(taxRate,"taxRate"));
		clientCorporation.setTickerSymbol(tickerSymbol);
		clientCorporation.setWorkWeekStart(workWeekStart);

		com.bullhorn.entity.emb.Address address = new com.bullhorn.entity.emb.Address();
		address.setAddress1(address1);
		address.setAddress2(address2);
		address.setCity(city);
		address.setCountryID(countryID);
		address.setState(state);
		address.setZip(zip);
		clientCorporation.setAddress(address);

		AddressWithoutCountry billingAddress = new AddressWithoutCountry();
		billingAddress.setAddress1(billingAddress1);
		billingAddress.setAddress2(billingAddress2);
		billingAddress.setCity(billingCity);
		billingAddress.setState(billingState);
		billingAddress.setZip(billingZip);
		clientCorporation.setBillingAddress(billingAddress);

		return clientCorporation;
	}

}
