package com.client.core.soap.tools.property.getdtofields.impl;

import org.springframework.stereotype.Service;

import com.bullhorn.entity.client.ClientCorporationDto;
import com.client.core.soap.tools.property.getdtofields.DtoFieldGetService;

@Service("clientCorporationGetService")
public class ClientCorporationDtoFieldGetService extends DtoFieldGetService<ClientCorporationDto> {
	
	public ClientCorporationDtoFieldGetService() {
		super();
	}
	
	@Override
	public Object retrieveField(String field, ClientCorporationDto clientCorporation, Boolean isDotPrefixed) throws NoSuchMethodException {
		Object value = null;

		if(isDotPrefixed) {
			field = removeDotPrefix(field);
		}
		
		if(field.equalsIgnoreCase(ADDRESS)) {
			value = clientCorporation.getAddress();
		}
		else if(field.equalsIgnoreCase(ANNUALREVENUE)) {
			value = clientCorporation.getAnnualRevenue();
		}
		else if(field.equalsIgnoreCase(BILLINGADDRESS)) {
			value = clientCorporation.getBillingAddress();
		}
		else if(field.equalsIgnoreCase(BILLINGCONTACT)) {
			value = clientCorporation.getBillingContact();
		}
		else if(field.equalsIgnoreCase(BILLINGFREQUENCY)) {
			value = clientCorporation.getBillingFrequency();
		}
		else if(field.equalsIgnoreCase(BILLINGPHONE)) {
			value = clientCorporation.getBillingPhone();
		}
		else if(field.equalsIgnoreCase(BUSINESSSECTORLIST)) {
			value = clientCorporation.getBusinessSectorList();
		}
		else if(field.equalsIgnoreCase(CLIENTCORPORATIONID)) {
			value = clientCorporation.getClientCorporationID();
		}
		else if(field.equalsIgnoreCase(COMPANYDESCRIPTION)) {
			value = clientCorporation.getCompanyDescription();
		}
		else if(field.equalsIgnoreCase(COMPANYURL)) {
			value = clientCorporation.getCompanyURL();
		}
		else if(field.equalsIgnoreCase(COMPETITORS)) {
			value = clientCorporation.getCompetitors();
		}
		else if(field.equalsIgnoreCase(CULTURE)) {
			value = clientCorporation.getCulture();
		}
		else if(field.equalsIgnoreCase(CUSTOMDATE1)) {
			value = clientCorporation.getCustomDate1();
		}
		else if(field.equalsIgnoreCase(CUSTOMDATE2)) {
			value = clientCorporation.getCustomDate2();
		}
		else if(field.equalsIgnoreCase(CUSTOMDATE3)) {
			value = clientCorporation.getCustomDate3();
		}
		else if(field.equalsIgnoreCase(CUSTOMFLOAT1)) {
			value = clientCorporation.getCustomFloat1();
		}
		else if(field.equalsIgnoreCase(CUSTOMFLOAT2)) {
			value = clientCorporation.getCustomFloat2();
		}
		else if(field.equalsIgnoreCase(CUSTOMFLOAT3)) {
			value = clientCorporation.getCustomFloat3();
		}
		else if(field.equalsIgnoreCase(CUSTOMINT1)) {
			value = clientCorporation.getCustomInt1();
		}
		else if(field.equalsIgnoreCase(CUSTOMINT2)) {
			value = clientCorporation.getCustomInt2();
		}
		else if(field.equalsIgnoreCase(CUSTOMINT3)) {
			value = clientCorporation.getCustomInt3();
		}
		else if(field.equalsIgnoreCase(CUSTOMTEXT1)) {
			value = clientCorporation.getCustomText1();
		}
		else if(field.equalsIgnoreCase(CUSTOMTEXT10)) {
			value = clientCorporation.getCustomText10();
		}
		else if(field.equalsIgnoreCase(CUSTOMTEXT11)) {
			value = clientCorporation.getCustomText11();
		}
		else if(field.equalsIgnoreCase(CUSTOMTEXT12)) {
			value = clientCorporation.getCustomText12();
		}
		else if(field.equalsIgnoreCase(CUSTOMTEXT13)) {
			value = clientCorporation.getCustomText13();
		}
		else if(field.equalsIgnoreCase(CUSTOMTEXT14)) {
			value = clientCorporation.getCustomText14();
		}
		else if(field.equalsIgnoreCase(CUSTOMTEXT15)) {
			value = clientCorporation.getCustomText15();
		}
		else if(field.equalsIgnoreCase(CUSTOMTEXT16)) {
			value = clientCorporation.getCustomText16();
		}
		else if(field.equalsIgnoreCase(CUSTOMTEXT17)) {
			value = clientCorporation.getCustomText17();
		}
		else if(field.equalsIgnoreCase(CUSTOMTEXT18)) {
			value = clientCorporation.getCustomText18();
		}
		else if(field.equalsIgnoreCase(CUSTOMTEXT19)) {
			value = clientCorporation.getCustomText19();
		}
		else if(field.equalsIgnoreCase(CUSTOMTEXT2)) {
			value = clientCorporation.getCustomText2();
		}
		else if(field.equalsIgnoreCase(CUSTOMTEXT20)) {
			value = clientCorporation.getCustomText20();
		}
		else if(field.equalsIgnoreCase(CUSTOMTEXT3)) {
			value = clientCorporation.getCustomText3();
		}
		else if(field.equalsIgnoreCase(CUSTOMTEXT4)) {
			value = clientCorporation.getCustomText4();
		}
		else if(field.equalsIgnoreCase(CUSTOMTEXT5)) {
			value = clientCorporation.getCustomText5();
		}
		else if(field.equalsIgnoreCase(CUSTOMTEXT6)) {
			value = clientCorporation.getCustomText6();
		}
		else if(field.equalsIgnoreCase(CUSTOMTEXT7)) {
			value = clientCorporation.getCustomText7();
		}
		else if(field.equalsIgnoreCase(CUSTOMTEXT8)) {
			value = clientCorporation.getCustomText8();
		}
		else if(field.equalsIgnoreCase(CUSTOMTEXT9)) {
			value = clientCorporation.getCustomText9();
		}
		else if(field.equalsIgnoreCase(CUSTOMTEXTBLOCK1)) {
			value = clientCorporation.getCustomTextBlock1();
		}
		else if(field.equalsIgnoreCase(CUSTOMTEXTBLOCK2)) {
			value = clientCorporation.getCustomTextBlock2();
		}
		else if(field.equalsIgnoreCase(CUSTOMTEXTBLOCK3)) {
			value = clientCorporation.getCustomTextBlock3();
		}
		else if(field.equalsIgnoreCase(CUSTOMTEXTBLOCK4)) {
			value = clientCorporation.getCustomTextBlock4();
		}
		else if(field.equalsIgnoreCase(CUSTOMTEXTBLOCK5)) {
			value = clientCorporation.getCustomTextBlock5();
		}
		else if(field.equalsIgnoreCase(DATEADDED)) {
			value = clientCorporation.getDateAdded();
		}
		else if(field.equalsIgnoreCase(DATEFOUNDED)) {
			value = clientCorporation.getDateFounded();
		}
		else if(field.equalsIgnoreCase(DEPARTMENTID)) {
			value = clientCorporation.getDepartmentID();
		}
		else if(field.equalsIgnoreCase(EXTERNALID)) {
			value = clientCorporation.getExternalID();
		}
		else if(field.equalsIgnoreCase(FAX)) {
			value = clientCorporation.getFax();
		}
		else if(field.equalsIgnoreCase(FEEARRANGEMENT)) {
			value = clientCorporation.getFeeArrangement();
		}
		else if(field.equalsIgnoreCase(FUNDING)) {
			value = clientCorporation.getFunding();
		}
		else if(field.equalsIgnoreCase(INDUSTRYLIST)) {
			value = clientCorporation.getIndustryList();
		}
		else if(field.equalsIgnoreCase(INVOICEFORMAT)) {
			value = clientCorporation.getInvoiceFormat();
		}
		else if(field.equalsIgnoreCase(NAME)) {
			value = clientCorporation.getName();
		}
		else if(field.equalsIgnoreCase(NOTES)) {
			value = clientCorporation.getNotes();
		}
		else if(field.equalsIgnoreCase(NUMEMPLOYEES)) {
			value = clientCorporation.getNumEmployees();
		}
		else if(field.equalsIgnoreCase(NUMOFFICES)) {
			value = clientCorporation.getNumOffices();
		}
		else if(field.equalsIgnoreCase(OWNERSHIP)) {
			value = clientCorporation.getOwnership();
		}
		else if(field.equalsIgnoreCase(PARENTCLIENTCORPORATIONID)) {
			value = clientCorporation.getParentClientCorporationID();
		}
		else if(field.equalsIgnoreCase(PHONE)) {
			value = clientCorporation.getPhone();
		}
		else if(field.equalsIgnoreCase(REVENUE)) {
			value = clientCorporation.getRevenue();
		}
		else if(field.equalsIgnoreCase(STATUS)) {
			value = clientCorporation.getStatus();
		}
		else if(field.equalsIgnoreCase(TAXRATE)) {
			value = clientCorporation.getTaxRate();
		}
		else if(field.equalsIgnoreCase(TICKERSYMBOL)) {
			value = clientCorporation.getTickerSymbol();
		}
		else if(field.equalsIgnoreCase(WORKWEEKSTART)) {
			value = clientCorporation.getWorkWeekStart();
		}
		else if(field.equalsIgnoreCase(ADDRESS1)) {
			value = clientCorporation.getAddress().getAddress1();
		}
		else if(field.equalsIgnoreCase(ADDRESS2)) {
			value = clientCorporation.getAddress().getAddress2();
		}
		else if(field.equalsIgnoreCase(CITY)) {
			value = clientCorporation.getAddress().getCity();
		}
		else if(field.equalsIgnoreCase(COUNTRYID)) {
			value = clientCorporation.getAddress().getCountryID();
		}
		else if(field.equalsIgnoreCase(STATE)) {
			value = clientCorporation.getAddress().getState();
		}
		else if(field.equalsIgnoreCase(ZIP)) {
			value = clientCorporation.getAddress().getZip();
		}
		else if(field.equalsIgnoreCase(BILLINGADDRESS1)) {
			value = clientCorporation.getBillingAddress().getAddress1();
		}
		else if(field.equalsIgnoreCase(BILLINGADDRESS2)) {
			value = clientCorporation.getBillingAddress().getAddress2();
		}
		else if(field.equalsIgnoreCase(BILLINGCITY)) {
			value = clientCorporation.getBillingAddress().getCity();
		}
		else if(field.equalsIgnoreCase(BILLINGSTATE)) {
			value = clientCorporation.getBillingAddress().getState();
		}
		else if(field.equalsIgnoreCase(BILLINGZIP)) {
			value = clientCorporation.getBillingAddress().getZip();
		}
		else {
			throw new NoSuchMethodException();
		}
		
		return value;
	}

    private String ADDRESS="address";
    private String ANNUALREVENUE="annualRevenue";
    private String BILLINGADDRESS="billingAddress";
    private String BILLINGCONTACT="billingContact";
    private String BILLINGFREQUENCY="billingFrequency";
    private String BILLINGPHONE="billingPhone";
    private String BUSINESSSECTORLIST="businessSectorList";
    private String CLIENTCORPORATIONID="clientCorporationID";
    private String COMPANYDESCRIPTION="companyDescription";
    private String COMPANYURL="companyURL";
    private String COMPETITORS="competitors";
    private String CULTURE="culture";
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
    private String CUSTOMTEXTBLOCK1="customTextBlock1";
    private String CUSTOMTEXTBLOCK2="customTextBlock2";
    private String CUSTOMTEXTBLOCK3="customTextBlock3";
    private String CUSTOMTEXTBLOCK4="customTextBlock4";
    private String CUSTOMTEXTBLOCK5="customTextBlock5";
    private String DATEADDED="dateAdded";
    private String DATEFOUNDED="dateFounded";
    private String DEPARTMENTID="departmentID";
    private String EXTERNALID="externalID";
    private String FAX="fax";
    private String FEEARRANGEMENT="feeArrangement";
    private String FUNDING="funding";
    private String INDUSTRYLIST="industryList";
    private String INVOICEFORMAT="invoiceFormat";
    private String NAME="name";
    private String NOTES="notes";
    private String NUMEMPLOYEES="numEmployees";
    private String NUMOFFICES="numOffices";
    private String OWNERSHIP="ownerShip";
    private String PARENTCLIENTCORPORATIONID="parentClientCorporationID";
    private String PHONE="phone";
    private String REVENUE="revenue";
    private String STATUS="status";
    private String TAXRATE="taxRate";
    private String TICKERSYMBOL="tickerSymbol";
    private String WORKWEEKSTART="workWeekStart";
    private String ADDRESS1="address1";
    private String ADDRESS2="address2";
    private String CITY="city";
    private String COUNTRYID="countryID";
    private String STATE="state";
    private String ZIP="zip";
    private String BILLINGADDRESS1="billingAddress1";
    private String BILLINGADDRESS2="billingAddress2";
    private String BILLINGCITY="billingCity";
    private String BILLINGSTATE="billingState";
    private String BILLINGZIP="billingZip";

}
