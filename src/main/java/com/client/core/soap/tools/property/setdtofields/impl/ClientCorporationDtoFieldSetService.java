package com.client.core.soap.tools.property.setdtofields.impl;

import java.util.Map;

import org.springframework.stereotype.Service;

import com.bullhorn.entity.client.ClientCorporationDto;
import com.client.core.soap.tools.property.setdtofields.DtoFieldSetService;
import com.client.core.base.util.Utility;

@Service("clientCorporationSetService")
public class ClientCorporationDtoFieldSetService extends DtoFieldSetService<ClientCorporationDto> {

	public ClientCorporationDtoFieldSetService() {
		super();
	}

	@Override
	public ClientCorporationDto changeDto(ClientCorporationDto clientCorporation, Map<String, String> fieldValues, 
			String dateFormat, Boolean isDotPrefixed) {
		for(String initialField : fieldValues.keySet()) {
			String value = fieldValues.get(initialField);

			String field = initialField;
			if(isDotPrefixed) {
				field = removeDotPrefix(initialField);
			}

			if(field.equalsIgnoreCase(ANNUALREVENUE)) {

				clientCorporation.setAnnualRevenue(Utility.forceParseBigDecimal(value));

			}else if(field.equalsIgnoreCase(BILLINGCONTACT)) {

				clientCorporation.setBillingContact(value);

			} else if(field.equalsIgnoreCase(BILLINGFREQUENCY)) {

				clientCorporation.setBillingFrequency(value);

			} else if(field.equalsIgnoreCase(BILLINGPHONE)) {

				clientCorporation.setBillingPhone(value);

			} else if(field.equalsIgnoreCase(BUSINESSSECTORLIST)) {

				clientCorporation.setBusinessSectorList(value);

			} else if(field.equalsIgnoreCase(CLIENTCORPORATIONID)) {

				clientCorporation.setClientCorporationID(Utility.forceParseInteger(value));

			} else if(field.equalsIgnoreCase(COMPANYDESCRIPTION)) {

				clientCorporation.setCompanyDescription(value);

			} else if(field.equalsIgnoreCase(COMPANYURL)) {

				clientCorporation.setCompanyURL(value);

			} else if(field.equalsIgnoreCase(COMPETITORS)) {

				clientCorporation.setCompetitors(value);

			} else if(field.equalsIgnoreCase(CULTURE)) {

				clientCorporation.setCulture(value);

			} else if(field.equalsIgnoreCase(CUSTOMDATE1)) {

				clientCorporation.setCustomDate1(Utility.forceParseStringToXMLGregorianCalendar(value, dateFormat));

			} else if(field.equalsIgnoreCase(CUSTOMDATE2)) {

				clientCorporation.setCustomDate2(Utility.forceParseStringToXMLGregorianCalendar(value, dateFormat));

			} else if(field.equalsIgnoreCase(CUSTOMDATE3)) {

				clientCorporation.setCustomDate3(Utility.forceParseStringToXMLGregorianCalendar(value, dateFormat));

			} else if(field.equalsIgnoreCase(CUSTOMFLOAT1)) {

				clientCorporation.setCustomFloat1(Utility.forceParseDouble(value));

			} else if(field.equalsIgnoreCase(CUSTOMFLOAT2)) {

				clientCorporation.setCustomFloat2(Utility.forceParseDouble(value));

			} else if(field.equalsIgnoreCase(CUSTOMFLOAT3)) {

				clientCorporation.setCustomFloat3(Utility.forceParseDouble(value));

			} else if(field.equalsIgnoreCase(CUSTOMINT1)) {

				clientCorporation.setCustomInt1(Utility.forceParseInteger(value));

			} else if(field.equalsIgnoreCase(CUSTOMINT2)) {

				clientCorporation.setCustomInt2(Utility.forceParseInteger(value));

			} else if(field.equalsIgnoreCase(CUSTOMINT3)) {

				clientCorporation.setCustomInt3(Utility.forceParseInteger(value));

			} else if(field.equalsIgnoreCase(CUSTOMTEXT1)) {

				clientCorporation.setCustomText1(value);

			} else if(field.equalsIgnoreCase(CUSTOMTEXT10)) {

				clientCorporation.setCustomText10(value);

			} else if(field.equalsIgnoreCase(CUSTOMTEXT11)) {

				clientCorporation.setCustomText11(value);

			} else if(field.equalsIgnoreCase(CUSTOMTEXT12)) {

				clientCorporation.setCustomText12(value);

			} else if(field.equalsIgnoreCase(CUSTOMTEXT13)) {

				clientCorporation.setCustomText13(value);

			} else if(field.equalsIgnoreCase(CUSTOMTEXT14)) {

				clientCorporation.setCustomText14(value);

			} else if(field.equalsIgnoreCase(CUSTOMTEXT15)) {

				clientCorporation.setCustomText15(value);

			} else if(field.equalsIgnoreCase(CUSTOMTEXT16)) {

				clientCorporation.setCustomText16(value);

			} else if(field.equalsIgnoreCase(CUSTOMTEXT17)) {

				clientCorporation.setCustomText17(value);

			} else if(field.equalsIgnoreCase(CUSTOMTEXT18)) {

				clientCorporation.setCustomText18(value);

			} else if(field.equalsIgnoreCase(CUSTOMTEXT19)) {

				clientCorporation.setCustomText19(value);

			} else if(field.equalsIgnoreCase(CUSTOMTEXT2)) {

				clientCorporation.setCustomText2(value);

			} else if(field.equalsIgnoreCase(CUSTOMTEXT20)) {

				clientCorporation.setCustomText20(value);

			} else if(field.equalsIgnoreCase(CUSTOMTEXT3)) {

				clientCorporation.setCustomText3(value);

			} else if(field.equalsIgnoreCase(CUSTOMTEXT4)) {

				clientCorporation.setCustomText4(value);

			} else if(field.equalsIgnoreCase(CUSTOMTEXT5)) {

				clientCorporation.setCustomText5(value);

			} else if(field.equalsIgnoreCase(CUSTOMTEXT6)) {

				clientCorporation.setCustomText6(value);

			} else if(field.equalsIgnoreCase(CUSTOMTEXT7)) {

				clientCorporation.setCustomText7(value);

			} else if(field.equalsIgnoreCase(CUSTOMTEXT8)) {

				clientCorporation.setCustomText8(value);

			} else if(field.equalsIgnoreCase(CUSTOMTEXT9)) {

				clientCorporation.setCustomText9(value);

			} else if(field.equalsIgnoreCase(CUSTOMTEXTBLOCK1)) {

				clientCorporation.setCustomTextBlock1(value);

			} else if(field.equalsIgnoreCase(CUSTOMTEXTBLOCK2)) {

				clientCorporation.setCustomTextBlock2(value);

			} else if(field.equalsIgnoreCase(CUSTOMTEXTBLOCK3)) {

				clientCorporation.setCustomTextBlock3(value);

			} else if(field.equalsIgnoreCase(CUSTOMTEXTBLOCK4)) {

				clientCorporation.setCustomTextBlock4(value);

			} else if(field.equalsIgnoreCase(CUSTOMTEXTBLOCK5)) {

				clientCorporation.setCustomTextBlock5(value);

			} else if(field.equalsIgnoreCase(DATEADDED)) {

				clientCorporation.setDateAdded(Utility.forceParseStringToXMLGregorianCalendar(value, dateFormat));

			} else if(field.equalsIgnoreCase(DATEFOUNDED)) {

				clientCorporation.setDateFounded(Utility.forceParseStringToXMLGregorianCalendar(value, dateFormat));

			} else if(field.equalsIgnoreCase(DEPARTMENTID)) {

				clientCorporation.setDepartmentID(Utility.forceParseInteger(value));

			} else if(field.equalsIgnoreCase(EXTERNALID)) {

				clientCorporation.setExternalID(value);

			} else if(field.equalsIgnoreCase(FAX)) {

				clientCorporation.setFax(value);

			} else if(field.equalsIgnoreCase(FEEARRANGEMENT)) {

				clientCorporation.setFeeArrangement(Utility.forceParseDouble(value));

			} else if(field.equalsIgnoreCase(FUNDING)) {

				clientCorporation.setFunding(value);

			} else if(field.equalsIgnoreCase(INDUSTRYLIST)) {

				clientCorporation.setIndustryList(value);

			} else if(field.equalsIgnoreCase(INVOICEFORMAT)) {

				clientCorporation.setInvoiceFormat(value);

			} else if(field.equalsIgnoreCase(NAME)) {

				clientCorporation.setName(value);

			} else if(field.equalsIgnoreCase(NOTES)) {

				clientCorporation.setNotes(value);

			} else if(field.equalsIgnoreCase(NUMEMPLOYEES)) {

				clientCorporation.setNumEmployees(Utility.forceParseInteger(value));

			} else if(field.equalsIgnoreCase(NUMOFFICES)) {

				clientCorporation.setNumOffices(Utility.forceParseInteger(value));

			} else if(field.equalsIgnoreCase(OWNERSHIP)) {

				clientCorporation.setOwnership(value);

			} else if(field.equalsIgnoreCase(PARENTCLIENTCORPORATIONID)) {

				clientCorporation.setParentClientCorporationID(Utility.forceParseInteger(value));

			} else if(field.equalsIgnoreCase(PHONE)) {

				clientCorporation.setPhone(value);

			} else if(field.equalsIgnoreCase(REVENUE)) {

				clientCorporation.setRevenue(value);

			} else if(field.equalsIgnoreCase(STATUS)) {

				clientCorporation.setStatus(value);

			} else if(field.equalsIgnoreCase(TAXRATE)) {

				clientCorporation.setTaxRate(Utility.forceParseDouble(value));

			} else if(field.equalsIgnoreCase(TICKERSYMBOL)) {

				clientCorporation.setTickerSymbol(value);

			} else if(field.equalsIgnoreCase(WORKWEEKSTART)) {

				clientCorporation.setWorkWeekStart(Utility.forceParseInteger(value));

			} else if(field.equalsIgnoreCase(ADDRESS1)) {

				clientCorporation.getAddress().setAddress1(value);

			} else if(field.equalsIgnoreCase(ADDRESS2)) {

				clientCorporation.getAddress().setAddress2(value);

			} else if(field.equalsIgnoreCase(CITY)) {

				clientCorporation.getAddress().setCity(value);

			} else if(field.equalsIgnoreCase(COUNTRYID)) {

				clientCorporation.getAddress().setCountryID(Utility.forceParseInteger(value));

			} else if(field.equalsIgnoreCase(STATE)) {

				clientCorporation.getAddress().setState(value);

			} else if(field.equalsIgnoreCase(ZIP)) {

				clientCorporation.getAddress().setZip(value);

			} else if(field.equalsIgnoreCase(BILLINGADDRESS1)) {

				clientCorporation.getBillingAddress().setAddress1(value);

			} else if(field.equalsIgnoreCase(BILLINGADDRESS2)) {

				clientCorporation.getBillingAddress().setAddress2(value);

			} else if(field.equalsIgnoreCase(BILLINGCITY)) {

				clientCorporation.getBillingAddress().setCity(value);

			} else if(field.equalsIgnoreCase(BILLINGSTATE)) {

				clientCorporation.getBillingAddress().setState(value);

			} else if(field.equalsIgnoreCase(BILLINGZIP)) {

				clientCorporation.getBillingAddress().setZip(value);
			}
		}
		return clientCorporation;

	}

	private String ANNUALREVENUE="annualRevenue";
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
