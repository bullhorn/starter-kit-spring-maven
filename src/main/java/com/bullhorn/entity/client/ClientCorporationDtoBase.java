
package com.bullhorn.entity.client;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.bullhorn.entity.AbstractDto;
import com.bullhorn.entity.emb.Address;
import com.bullhorn.entity.emb.AddressWithoutCountry;


/**
 * <p>Java class for clientCorporationDtoBase complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="clientCorporationDtoBase">
 *   &lt;complexContent>
 *     &lt;extension base="{http://entity.bullhorn.com/}abstractDto">
 *       &lt;sequence>
 *         &lt;element name="address" type="{http://emb.entity.bullhorn.com/}address" minOccurs="0"/>
 *         &lt;element name="annualRevenue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="billingAddress" type="{http://emb.entity.bullhorn.com/}addressWithoutCountry" minOccurs="0"/>
 *         &lt;element name="billingContact" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="billingFrequency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="billingPhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="businessSectorList" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="clientCorporationID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="companyDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="companyURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="competitors" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="culture" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customDate1" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="customDate2" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="customDate3" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="customFloat1" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="customFloat2" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="customFloat3" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="customInt1" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="customInt2" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="customInt3" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="customText1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customText10" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customText11" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customText12" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customText13" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customText14" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customText15" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customText16" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customText17" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customText18" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customText19" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customText2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customText20" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customText3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customText4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customText5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customText6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customText7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customText8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customText9" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customTextBlock1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customTextBlock2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customTextBlock3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customTextBlock4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customTextBlock5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dateAdded" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="dateFounded" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="departmentID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="externalID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fax" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="feeArrangement" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="funding" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="industryList" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="invoiceFormat" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="notes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numEmployees" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="numOffices" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ownerShip" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="parentClientCorporationID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="phone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="revenue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="taxRate" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="tickerSymbol" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="workWeekStart" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "clientCorporationDtoBase", propOrder = {
    "address",
    "annualRevenue",
    "billingAddress",
    "billingContact",
    "billingFrequency",
    "billingPhone",
    "businessSectorList",
    "clientCorporationID",
    "companyDescription",
    "companyURL",
    "competitors",
    "culture",
    "customDate1",
    "customDate2",
    "customDate3",
    "customFloat1",
    "customFloat2",
    "customFloat3",
    "customInt1",
    "customInt2",
    "customInt3",
    "customText1",
    "customText10",
    "customText11",
    "customText12",
    "customText13",
    "customText14",
    "customText15",
    "customText16",
    "customText17",
    "customText18",
    "customText19",
    "customText2",
    "customText20",
    "customText3",
    "customText4",
    "customText5",
    "customText6",
    "customText7",
    "customText8",
    "customText9",
    "customTextBlock1",
    "customTextBlock2",
    "customTextBlock3",
    "customTextBlock4",
    "customTextBlock5",
    "dateAdded",
    "dateFounded",
    "departmentID",
    "externalID",
    "fax",
    "feeArrangement",
    "funding",
    "industryList",
    "invoiceFormat",
    "name",
    "notes",
    "numEmployees",
    "numOffices",
    "ownerShip",
    "parentClientCorporationID",
    "phone",
    "revenue",
    "status",
    "taxRate",
    "tickerSymbol",
    "workWeekStart"
})
@XmlSeeAlso({
    ClientCorporationDto.class
})
public abstract class ClientCorporationDtoBase
    extends AbstractDto
{

    protected Address address;
    protected BigDecimal annualRevenue;
    protected AddressWithoutCountry billingAddress;
    protected String billingContact;
    protected String billingFrequency;
    protected String billingPhone;
    protected String businessSectorList;
    protected Integer clientCorporationID;
    protected String companyDescription;
    protected String companyURL;
    protected String competitors;
    protected String culture;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar customDate1;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar customDate2;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar customDate3;
    protected Double customFloat1;
    protected Double customFloat2;
    protected Double customFloat3;
    protected Integer customInt1;
    protected Integer customInt2;
    protected Integer customInt3;
    protected String customText1;
    protected String customText10;
    protected String customText11;
    protected String customText12;
    protected String customText13;
    protected String customText14;
    protected String customText15;
    protected String customText16;
    protected String customText17;
    protected String customText18;
    protected String customText19;
    protected String customText2;
    protected String customText20;
    protected String customText3;
    protected String customText4;
    protected String customText5;
    protected String customText6;
    protected String customText7;
    protected String customText8;
    protected String customText9;
    protected String customTextBlock1;
    protected String customTextBlock2;
    protected String customTextBlock3;
    protected String customTextBlock4;
    protected String customTextBlock5;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateAdded;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateFounded;
    protected Integer departmentID;
    protected String externalID;
    protected String fax;
    protected Double feeArrangement;
    protected String funding;
    protected String industryList;
    protected String invoiceFormat;
    protected String name;
    protected String notes;
    protected Integer numEmployees;
    protected Integer numOffices;
    protected String ownerShip;
    protected Integer parentClientCorporationID;
    protected String phone;
    protected String revenue;
    protected String status;
    protected Double taxRate;
    protected String tickerSymbol;
    protected Integer workWeekStart;

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link Address }
     *     
     */
    public Address getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link Address }
     *     
     */
    public void setAddress(Address value) {
        this.address = value;
    }

    /**
     * Gets the value of the annualRevenue property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAnnualRevenue() {
        return annualRevenue;
    }

    /**
     * Sets the value of the annualRevenue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAnnualRevenue(BigDecimal value) {
        this.annualRevenue = value;
    }

    /**
     * Gets the value of the billingAddress property.
     * 
     * @return
     *     possible object is
     *     {@link AddressWithoutCountry }
     *     
     */
    public AddressWithoutCountry getBillingAddress() {
        return billingAddress;
    }

    /**
     * Sets the value of the billingAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressWithoutCountry }
     *     
     */
    public void setBillingAddress(AddressWithoutCountry value) {
        this.billingAddress = value;
    }

    /**
     * Gets the value of the billingContact property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillingContact() {
        return billingContact;
    }

    /**
     * Sets the value of the billingContact property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillingContact(String value) {
        this.billingContact = value;
    }

    /**
     * Gets the value of the billingFrequency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillingFrequency() {
        return billingFrequency;
    }

    /**
     * Sets the value of the billingFrequency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillingFrequency(String value) {
        this.billingFrequency = value;
    }

    /**
     * Gets the value of the billingPhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillingPhone() {
        return billingPhone;
    }

    /**
     * Sets the value of the billingPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillingPhone(String value) {
        this.billingPhone = value;
    }

    /**
     * Gets the value of the businessSectorList property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessSectorList() {
        return businessSectorList;
    }

    /**
     * Sets the value of the businessSectorList property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessSectorList(String value) {
        this.businessSectorList = value;
    }

    /**
     * Gets the value of the clientCorporationID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getClientCorporationID() {
        return clientCorporationID;
    }

    /**
     * Sets the value of the clientCorporationID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setClientCorporationID(Integer value) {
        this.clientCorporationID = value;
    }

    /**
     * Gets the value of the companyDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyDescription() {
        return companyDescription;
    }

    /**
     * Sets the value of the companyDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyDescription(String value) {
        this.companyDescription = value;
    }

    /**
     * Gets the value of the companyURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyURL() {
        return companyURL;
    }

    /**
     * Sets the value of the companyURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyURL(String value) {
        this.companyURL = value;
    }

    /**
     * Gets the value of the competitors property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompetitors() {
        return competitors;
    }

    /**
     * Sets the value of the competitors property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompetitors(String value) {
        this.competitors = value;
    }

    /**
     * Gets the value of the culture property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCulture() {
        return culture;
    }

    /**
     * Sets the value of the culture property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCulture(String value) {
        this.culture = value;
    }

    /**
     * Gets the value of the customDate1 property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCustomDate1() {
        return customDate1;
    }

    /**
     * Sets the value of the customDate1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCustomDate1(XMLGregorianCalendar value) {
        this.customDate1 = value;
    }

    /**
     * Gets the value of the customDate2 property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCustomDate2() {
        return customDate2;
    }

    /**
     * Sets the value of the customDate2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCustomDate2(XMLGregorianCalendar value) {
        this.customDate2 = value;
    }

    /**
     * Gets the value of the customDate3 property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCustomDate3() {
        return customDate3;
    }

    /**
     * Sets the value of the customDate3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCustomDate3(XMLGregorianCalendar value) {
        this.customDate3 = value;
    }

    /**
     * Gets the value of the customFloat1 property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCustomFloat1() {
        return customFloat1;
    }

    /**
     * Sets the value of the customFloat1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCustomFloat1(Double value) {
        this.customFloat1 = value;
    }

    /**
     * Gets the value of the customFloat2 property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCustomFloat2() {
        return customFloat2;
    }

    /**
     * Sets the value of the customFloat2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCustomFloat2(Double value) {
        this.customFloat2 = value;
    }

    /**
     * Gets the value of the customFloat3 property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCustomFloat3() {
        return customFloat3;
    }

    /**
     * Sets the value of the customFloat3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCustomFloat3(Double value) {
        this.customFloat3 = value;
    }

    /**
     * Gets the value of the customInt1 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCustomInt1() {
        return customInt1;
    }

    /**
     * Sets the value of the customInt1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCustomInt1(Integer value) {
        this.customInt1 = value;
    }

    /**
     * Gets the value of the customInt2 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCustomInt2() {
        return customInt2;
    }

    /**
     * Sets the value of the customInt2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCustomInt2(Integer value) {
        this.customInt2 = value;
    }

    /**
     * Gets the value of the customInt3 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCustomInt3() {
        return customInt3;
    }

    /**
     * Sets the value of the customInt3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCustomInt3(Integer value) {
        this.customInt3 = value;
    }

    /**
     * Gets the value of the customText1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomText1() {
        return customText1;
    }

    /**
     * Sets the value of the customText1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomText1(String value) {
        this.customText1 = value;
    }

    /**
     * Gets the value of the customText10 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomText10() {
        return customText10;
    }

    /**
     * Sets the value of the customText10 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomText10(String value) {
        this.customText10 = value;
    }

    /**
     * Gets the value of the customText11 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomText11() {
        return customText11;
    }

    /**
     * Sets the value of the customText11 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomText11(String value) {
        this.customText11 = value;
    }

    /**
     * Gets the value of the customText12 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomText12() {
        return customText12;
    }

    /**
     * Sets the value of the customText12 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomText12(String value) {
        this.customText12 = value;
    }

    /**
     * Gets the value of the customText13 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomText13() {
        return customText13;
    }

    /**
     * Sets the value of the customText13 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomText13(String value) {
        this.customText13 = value;
    }

    /**
     * Gets the value of the customText14 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomText14() {
        return customText14;
    }

    /**
     * Sets the value of the customText14 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomText14(String value) {
        this.customText14 = value;
    }

    /**
     * Gets the value of the customText15 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomText15() {
        return customText15;
    }

    /**
     * Sets the value of the customText15 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomText15(String value) {
        this.customText15 = value;
    }

    /**
     * Gets the value of the customText16 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomText16() {
        return customText16;
    }

    /**
     * Sets the value of the customText16 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomText16(String value) {
        this.customText16 = value;
    }

    /**
     * Gets the value of the customText17 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomText17() {
        return customText17;
    }

    /**
     * Sets the value of the customText17 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomText17(String value) {
        this.customText17 = value;
    }

    /**
     * Gets the value of the customText18 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomText18() {
        return customText18;
    }

    /**
     * Sets the value of the customText18 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomText18(String value) {
        this.customText18 = value;
    }

    /**
     * Gets the value of the customText19 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomText19() {
        return customText19;
    }

    /**
     * Sets the value of the customText19 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomText19(String value) {
        this.customText19 = value;
    }

    /**
     * Gets the value of the customText2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomText2() {
        return customText2;
    }

    /**
     * Sets the value of the customText2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomText2(String value) {
        this.customText2 = value;
    }

    /**
     * Gets the value of the customText20 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomText20() {
        return customText20;
    }

    /**
     * Sets the value of the customText20 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomText20(String value) {
        this.customText20 = value;
    }

    /**
     * Gets the value of the customText3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomText3() {
        return customText3;
    }

    /**
     * Sets the value of the customText3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomText3(String value) {
        this.customText3 = value;
    }

    /**
     * Gets the value of the customText4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomText4() {
        return customText4;
    }

    /**
     * Sets the value of the customText4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomText4(String value) {
        this.customText4 = value;
    }

    /**
     * Gets the value of the customText5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomText5() {
        return customText5;
    }

    /**
     * Sets the value of the customText5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomText5(String value) {
        this.customText5 = value;
    }

    /**
     * Gets the value of the customText6 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomText6() {
        return customText6;
    }

    /**
     * Sets the value of the customText6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomText6(String value) {
        this.customText6 = value;
    }

    /**
     * Gets the value of the customText7 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomText7() {
        return customText7;
    }

    /**
     * Sets the value of the customText7 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomText7(String value) {
        this.customText7 = value;
    }

    /**
     * Gets the value of the customText8 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomText8() {
        return customText8;
    }

    /**
     * Sets the value of the customText8 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomText8(String value) {
        this.customText8 = value;
    }

    /**
     * Gets the value of the customText9 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomText9() {
        return customText9;
    }

    /**
     * Sets the value of the customText9 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomText9(String value) {
        this.customText9 = value;
    }

    /**
     * Gets the value of the customTextBlock1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomTextBlock1() {
        return customTextBlock1;
    }

    /**
     * Sets the value of the customTextBlock1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomTextBlock1(String value) {
        this.customTextBlock1 = value;
    }

    /**
     * Gets the value of the customTextBlock2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomTextBlock2() {
        return customTextBlock2;
    }

    /**
     * Sets the value of the customTextBlock2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomTextBlock2(String value) {
        this.customTextBlock2 = value;
    }

    /**
     * Gets the value of the customTextBlock3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomTextBlock3() {
        return customTextBlock3;
    }

    /**
     * Sets the value of the customTextBlock3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomTextBlock3(String value) {
        this.customTextBlock3 = value;
    }

    /**
     * Gets the value of the customTextBlock4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomTextBlock4() {
        return customTextBlock4;
    }

    /**
     * Sets the value of the customTextBlock4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomTextBlock4(String value) {
        this.customTextBlock4 = value;
    }

    /**
     * Gets the value of the customTextBlock5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomTextBlock5() {
        return customTextBlock5;
    }

    /**
     * Sets the value of the customTextBlock5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomTextBlock5(String value) {
        this.customTextBlock5 = value;
    }

    /**
     * Gets the value of the dateAdded property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateAdded() {
        return dateAdded;
    }

    /**
     * Sets the value of the dateAdded property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateAdded(XMLGregorianCalendar value) {
        this.dateAdded = value;
    }

    /**
     * Gets the value of the dateFounded property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateFounded() {
        return dateFounded;
    }

    /**
     * Sets the value of the dateFounded property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateFounded(XMLGregorianCalendar value) {
        this.dateFounded = value;
    }

    /**
     * Gets the value of the departmentID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDepartmentID() {
        return departmentID;
    }

    /**
     * Sets the value of the departmentID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDepartmentID(Integer value) {
        this.departmentID = value;
    }

    /**
     * Gets the value of the externalID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalID() {
        return externalID;
    }

    /**
     * Sets the value of the externalID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalID(String value) {
        this.externalID = value;
    }

    /**
     * Gets the value of the fax property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFax() {
        return fax;
    }

    /**
     * Sets the value of the fax property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFax(String value) {
        this.fax = value;
    }

    /**
     * Gets the value of the feeArrangement property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getFeeArrangement() {
        return feeArrangement;
    }

    /**
     * Sets the value of the feeArrangement property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setFeeArrangement(Double value) {
        this.feeArrangement = value;
    }

    /**
     * Gets the value of the funding property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFunding() {
        return funding;
    }

    /**
     * Sets the value of the funding property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFunding(String value) {
        this.funding = value;
    }

    /**
     * Gets the value of the industryList property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndustryList() {
        return industryList;
    }

    /**
     * Sets the value of the industryList property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndustryList(String value) {
        this.industryList = value;
    }

    /**
     * Gets the value of the invoiceFormat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvoiceFormat() {
        return invoiceFormat;
    }

    /**
     * Sets the value of the invoiceFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvoiceFormat(String value) {
        this.invoiceFormat = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the notes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotes() {
        return notes;
    }

    /**
     * Sets the value of the notes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotes(String value) {
        this.notes = value;
    }

    /**
     * Gets the value of the numEmployees property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumEmployees() {
        return numEmployees;
    }

    /**
     * Sets the value of the numEmployees property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumEmployees(Integer value) {
        this.numEmployees = value;
    }

    /**
     * Gets the value of the numOffices property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumOffices() {
        return numOffices;
    }

    /**
     * Sets the value of the numOffices property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumOffices(Integer value) {
        this.numOffices = value;
    }

    /**
     * Gets the value of the ownerShip property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwnership() {
        return ownerShip;
    }

    /**
     * Sets the value of the ownerShip property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwnership(String value) {
        this.ownerShip = value;
    }

    /**
     * Gets the value of the parentClientCorporationID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getParentClientCorporationID() {
        return parentClientCorporationID;
    }

    /**
     * Sets the value of the parentClientCorporationID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setParentClientCorporationID(Integer value) {
        this.parentClientCorporationID = value;
    }

    /**
     * Gets the value of the phone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhone() {
        return phone;
    }

    /**
     * Sets the value of the phone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhone(String value) {
        this.phone = value;
    }

    /**
     * Gets the value of the revenue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRevenue() {
        return revenue;
    }

    /**
     * Sets the value of the revenue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRevenue(String value) {
        this.revenue = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the taxRate property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTaxRate() {
        return taxRate;
    }

    /**
     * Sets the value of the taxRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTaxRate(Double value) {
        this.taxRate = value;
    }

    /**
     * Gets the value of the tickerSymbol property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTickerSymbol() {
        return tickerSymbol;
    }

    /**
     * Sets the value of the tickerSymbol property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTickerSymbol(String value) {
        this.tickerSymbol = value;
    }

    /**
     * Gets the value of the workWeekStart property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getWorkWeekStart() {
        return workWeekStart;
    }

    /**
     * Sets the value of the workWeekStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setWorkWeekStart(Integer value) {
        this.workWeekStart = value;
    }

}
