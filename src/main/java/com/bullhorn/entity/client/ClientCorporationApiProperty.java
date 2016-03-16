
package com.bullhorn.entity.client;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for clientCorporationApiProperty.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="clientCorporationApiProperty">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="clientCorporationID"/>
 *     &lt;enumeration value="address"/>
 *     &lt;enumeration value="annualRevenue"/>
 *     &lt;enumeration value="billingAddress"/>
 *     &lt;enumeration value="billingContact"/>
 *     &lt;enumeration value="billingFrequency"/>
 *     &lt;enumeration value="billingPhone"/>
 *     &lt;enumeration value="businessSectorList"/>
 *     &lt;enumeration value="companyDescription"/>
 *     &lt;enumeration value="companyURL"/>
 *     &lt;enumeration value="competitors"/>
 *     &lt;enumeration value="culture"/>
 *     &lt;enumeration value="customDate1"/>
 *     &lt;enumeration value="customDate2"/>
 *     &lt;enumeration value="customDate3"/>
 *     &lt;enumeration value="customFloat1"/>
 *     &lt;enumeration value="customFloat2"/>
 *     &lt;enumeration value="customFloat3"/>
 *     &lt;enumeration value="customInt1"/>
 *     &lt;enumeration value="customInt2"/>
 *     &lt;enumeration value="customInt3"/>
 *     &lt;enumeration value="customText1"/>
 *     &lt;enumeration value="customText10"/>
 *     &lt;enumeration value="customText11"/>
 *     &lt;enumeration value="customText12"/>
 *     &lt;enumeration value="customText13"/>
 *     &lt;enumeration value="customText14"/>
 *     &lt;enumeration value="customText15"/>
 *     &lt;enumeration value="customText16"/>
 *     &lt;enumeration value="customText17"/>
 *     &lt;enumeration value="customText18"/>
 *     &lt;enumeration value="customText19"/>
 *     &lt;enumeration value="customText2"/>
 *     &lt;enumeration value="customText20"/>
 *     &lt;enumeration value="customText3"/>
 *     &lt;enumeration value="customText4"/>
 *     &lt;enumeration value="customText5"/>
 *     &lt;enumeration value="customText6"/>
 *     &lt;enumeration value="customText7"/>
 *     &lt;enumeration value="customText8"/>
 *     &lt;enumeration value="customText9"/>
 *     &lt;enumeration value="customTextBlock1"/>
 *     &lt;enumeration value="customTextBlock2"/>
 *     &lt;enumeration value="customTextBlock3"/>
 *     &lt;enumeration value="customTextBlock4"/>
 *     &lt;enumeration value="customTextBlock5"/>
 *     &lt;enumeration value="dateAdded"/>
 *     &lt;enumeration value="dateFounded"/>
 *     &lt;enumeration value="departmentID"/>
 *     &lt;enumeration value="externalID"/>
 *     &lt;enumeration value="fax"/>
 *     &lt;enumeration value="feeArrangement"/>
 *     &lt;enumeration value="funding"/>
 *     &lt;enumeration value="industryList"/>
 *     &lt;enumeration value="invoiceFormat"/>
 *     &lt;enumeration value="name"/>
 *     &lt;enumeration value="notes"/>
 *     &lt;enumeration value="numEmployees"/>
 *     &lt;enumeration value="numOffices"/>
 *     &lt;enumeration value="ownerShip"/>
 *     &lt;enumeration value="parentClientCorporationID"/>
 *     &lt;enumeration value="phone"/>
 *     &lt;enumeration value="revenue"/>
 *     &lt;enumeration value="status"/>
 *     &lt;enumeration value="taxRate"/>
 *     &lt;enumeration value="tickerSymbol"/>
 *     &lt;enumeration value="workWeekStart"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "clientCorporationApiProperty")
@XmlEnum
public enum ClientCorporationApiProperty {

    @XmlEnumValue("clientCorporationID")
    CLIENT_CORPORATION_ID("clientCorporationID"),
    @XmlEnumValue("address")
    ADDRESS("address"),
    @XmlEnumValue("annualRevenue")
    ANNUAL_REVENUE("annualRevenue"),
    @XmlEnumValue("billingAddress")
    BILLING_ADDRESS("billingAddress"),
    @XmlEnumValue("billingContact")
    BILLING_CONTACT("billingContact"),
    @XmlEnumValue("billingFrequency")
    BILLING_FREQUENCY("billingFrequency"),
    @XmlEnumValue("billingPhone")
    BILLING_PHONE("billingPhone"),
    @XmlEnumValue("businessSectorList")
    BUSINESS_SECTOR_LIST("businessSectorList"),
    @XmlEnumValue("companyDescription")
    COMPANY_DESCRIPTION("companyDescription"),
    @XmlEnumValue("companyURL")
    COMPANY_URL("companyURL"),
    @XmlEnumValue("competitors")
    COMPETITORS("competitors"),
    @XmlEnumValue("culture")
    CULTURE("culture"),
    @XmlEnumValue("customDate1")
    CUSTOM_DATE_1("customDate1"),
    @XmlEnumValue("customDate2")
    CUSTOM_DATE_2("customDate2"),
    @XmlEnumValue("customDate3")
    CUSTOM_DATE_3("customDate3"),
    @XmlEnumValue("customFloat1")
    CUSTOM_FLOAT_1("customFloat1"),
    @XmlEnumValue("customFloat2")
    CUSTOM_FLOAT_2("customFloat2"),
    @XmlEnumValue("customFloat3")
    CUSTOM_FLOAT_3("customFloat3"),
    @XmlEnumValue("customInt1")
    CUSTOM_INT_1("customInt1"),
    @XmlEnumValue("customInt2")
    CUSTOM_INT_2("customInt2"),
    @XmlEnumValue("customInt3")
    CUSTOM_INT_3("customInt3"),
    @XmlEnumValue("customText1")
    CUSTOM_TEXT_1("customText1"),
    @XmlEnumValue("customText10")
    CUSTOM_TEXT_10("customText10"),
    @XmlEnumValue("customText11")
    CUSTOM_TEXT_11("customText11"),
    @XmlEnumValue("customText12")
    CUSTOM_TEXT_12("customText12"),
    @XmlEnumValue("customText13")
    CUSTOM_TEXT_13("customText13"),
    @XmlEnumValue("customText14")
    CUSTOM_TEXT_14("customText14"),
    @XmlEnumValue("customText15")
    CUSTOM_TEXT_15("customText15"),
    @XmlEnumValue("customText16")
    CUSTOM_TEXT_16("customText16"),
    @XmlEnumValue("customText17")
    CUSTOM_TEXT_17("customText17"),
    @XmlEnumValue("customText18")
    CUSTOM_TEXT_18("customText18"),
    @XmlEnumValue("customText19")
    CUSTOM_TEXT_19("customText19"),
    @XmlEnumValue("customText2")
    CUSTOM_TEXT_2("customText2"),
    @XmlEnumValue("customText20")
    CUSTOM_TEXT_20("customText20"),
    @XmlEnumValue("customText3")
    CUSTOM_TEXT_3("customText3"),
    @XmlEnumValue("customText4")
    CUSTOM_TEXT_4("customText4"),
    @XmlEnumValue("customText5")
    CUSTOM_TEXT_5("customText5"),
    @XmlEnumValue("customText6")
    CUSTOM_TEXT_6("customText6"),
    @XmlEnumValue("customText7")
    CUSTOM_TEXT_7("customText7"),
    @XmlEnumValue("customText8")
    CUSTOM_TEXT_8("customText8"),
    @XmlEnumValue("customText9")
    CUSTOM_TEXT_9("customText9"),
    @XmlEnumValue("customTextBlock1")
    CUSTOM_TEXT_BLOCK_1("customTextBlock1"),
    @XmlEnumValue("customTextBlock2")
    CUSTOM_TEXT_BLOCK_2("customTextBlock2"),
    @XmlEnumValue("customTextBlock3")
    CUSTOM_TEXT_BLOCK_3("customTextBlock3"),
    @XmlEnumValue("customTextBlock4")
    CUSTOM_TEXT_BLOCK_4("customTextBlock4"),
    @XmlEnumValue("customTextBlock5")
    CUSTOM_TEXT_BLOCK_5("customTextBlock5"),
    @XmlEnumValue("dateAdded")
    DATE_ADDED("dateAdded"),
    @XmlEnumValue("dateFounded")
    DATE_FOUNDED("dateFounded"),
    @XmlEnumValue("departmentID")
    DEPARTMENT_ID("departmentID"),
    @XmlEnumValue("externalID")
    EXTERNAL_ID("externalID"),
    @XmlEnumValue("fax")
    FAX("fax"),
    @XmlEnumValue("feeArrangement")
    FEE_ARRANGEMENT("feeArrangement"),
    @XmlEnumValue("funding")
    FUNDING("funding"),
    @XmlEnumValue("industryList")
    INDUSTRY_LIST("industryList"),
    @XmlEnumValue("invoiceFormat")
    INVOICE_FORMAT("invoiceFormat"),
    @XmlEnumValue("name")
    NAME("name"),
    @XmlEnumValue("notes")
    NOTES("notes"),
    @XmlEnumValue("numEmployees")
    NUM_EMPLOYEES("numEmployees"),
    @XmlEnumValue("numOffices")
    NUM_OFFICES("numOffices"),
    @XmlEnumValue("ownerShip")
    OWNER_SHIP("ownerShip"),
    @XmlEnumValue("parentClientCorporationID")
    PARENT_CLIENT_CORPORATION_ID("parentClientCorporationID"),
    @XmlEnumValue("phone")
    PHONE("phone"),
    @XmlEnumValue("revenue")
    REVENUE("revenue"),
    @XmlEnumValue("status")
    STATUS("status"),
    @XmlEnumValue("taxRate")
    TAX_RATE("taxRate"),
    @XmlEnumValue("tickerSymbol")
    TICKER_SYMBOL("tickerSymbol"),
    @XmlEnumValue("workWeekStart")
    WORK_WEEK_START("workWeekStart");
    private final String value;

    ClientCorporationApiProperty(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ClientCorporationApiProperty fromValue(String v) {
        for (ClientCorporationApiProperty c: ClientCorporationApiProperty.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
