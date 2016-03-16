
package com.bullhorn.entity.user;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.bullhorn.entity.AbstractDto;
import com.bullhorn.entity.emb.Address;


/**
 * <p>Java class for personDtoBase complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="personDtoBase">
 *   &lt;complexContent>
 *     &lt;extension base="{http://entity.bullhorn.com/}abstractDto">
 *       &lt;sequence>
 *         &lt;element name="address" type="{http://emb.entity.bullhorn.com/}address" minOccurs="0"/>
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
 *         &lt;element name="dateLastComment" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="email2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="email3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fax" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fax2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fax3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="firstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="isDayLightSavings" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="isDeleted" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="isLockedOut" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="lastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="massMailOptOut" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="middleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mobile" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="namePrefix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nameSuffix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nickName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="occupation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pager" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="phone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="phone2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="phone3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="smsOptIn" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="timeZoneOffsetEST" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="userID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="userTypeID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="username" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "personDtoBase", propOrder = {
    "address",
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
    "dateLastComment",
    "email",
    "email2",
    "email3",
    "fax",
    "fax2",
    "fax3",
    "firstName",
    "isDayLightSavings",
    "isDeleted",
    "isLockedOut",
    "lastName",
    "massMailOptOut",
    "middleName",
    "mobile",
    "name",
    "namePrefix",
    "nameSuffix",
    "nickName",
    "occupation",
    "pager",
    "phone",
    "phone2",
    "phone3",
    "smsOptIn",
    "timeZoneOffsetEST",
    "userID",
    "userTypeID",
    "username"
})
@XmlSeeAlso({
    PersonDto.class
})
public abstract class PersonDtoBase
    extends AbstractDto
{

    protected Address address;
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
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateLastComment;
    protected String email;
    protected String email2;
    protected String email3;
    protected String fax;
    protected String fax2;
    protected String fax3;
    protected String firstName;
    protected Boolean isDayLightSavings;
    protected Boolean isDeleted;
    protected Boolean isLockedOut;
    protected String lastName;
    protected Boolean massMailOptOut;
    protected String middleName;
    protected String mobile;
    protected String name;
    protected String namePrefix;
    protected String nameSuffix;
    protected String nickName;
    protected String occupation;
    protected String pager;
    protected String phone;
    protected String phone2;
    protected String phone3;
    protected Boolean smsOptIn;
    protected Integer timeZoneOffsetEST;
    protected Integer userID;
    protected Integer userTypeID;
    protected String username;

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
     * Gets the value of the dateLastComment property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateLastComment() {
        return dateLastComment;
    }

    /**
     * Sets the value of the dateLastComment property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateLastComment(XMLGregorianCalendar value) {
        this.dateLastComment = value;
    }

    /**
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Gets the value of the email2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail2() {
        return email2;
    }

    /**
     * Sets the value of the email2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail2(String value) {
        this.email2 = value;
    }

    /**
     * Gets the value of the email3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail3() {
        return email3;
    }

    /**
     * Sets the value of the email3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail3(String value) {
        this.email3 = value;
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
     * Gets the value of the fax2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFax2() {
        return fax2;
    }

    /**
     * Sets the value of the fax2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFax2(String value) {
        this.fax2 = value;
    }

    /**
     * Gets the value of the fax3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFax3() {
        return fax3;
    }

    /**
     * Sets the value of the fax3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFax3(String value) {
        this.fax3 = value;
    }

    /**
     * Gets the value of the firstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the value of the firstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstName(String value) {
        this.firstName = value;
    }

    /**
     * Gets the value of the isDayLightSavings property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsDayLightSavings() {
        return isDayLightSavings;
    }

    /**
     * Sets the value of the isDayLightSavings property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsDayLightSavings(Boolean value) {
        this.isDayLightSavings = value;
    }

    /**
     * Gets the value of the isDeleted property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsDeleted() {
        return isDeleted;
    }

    /**
     * Sets the value of the isDeleted property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsDeleted(Boolean value) {
        this.isDeleted = value;
    }

    /**
     * Gets the value of the isLockedOut property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsLockedOut() {
        return isLockedOut;
    }

    /**
     * Sets the value of the isLockedOut property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsLockedOut(Boolean value) {
        this.isLockedOut = value;
    }

    /**
     * Gets the value of the lastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the value of the lastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastName(String value) {
        this.lastName = value;
    }

    /**
     * Gets the value of the massMailOptOut property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMassMailOptOut() {
        return massMailOptOut;
    }

    /**
     * Sets the value of the massMailOptOut property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMassMailOptOut(Boolean value) {
        this.massMailOptOut = value;
    }

    /**
     * Gets the value of the middleName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMiddleName() {
        return middleName;
    }

    /**
     * Sets the value of the middleName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMiddleName(String value) {
        this.middleName = value;
    }

    /**
     * Gets the value of the mobile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * Sets the value of the mobile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMobile(String value) {
        this.mobile = value;
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
     * Gets the value of the namePrefix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNamePrefix() {
        return namePrefix;
    }

    /**
     * Sets the value of the namePrefix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNamePrefix(String value) {
        this.namePrefix = value;
    }

    /**
     * Gets the value of the nameSuffix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameSuffix() {
        return nameSuffix;
    }

    /**
     * Sets the value of the nameSuffix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameSuffix(String value) {
        this.nameSuffix = value;
    }

    /**
     * Gets the value of the nickName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNickName() {
        return nickName;
    }

    /**
     * Sets the value of the nickName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNickName(String value) {
        this.nickName = value;
    }

    /**
     * Gets the value of the occupation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOccupation() {
        return occupation;
    }

    /**
     * Sets the value of the occupation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOccupation(String value) {
        this.occupation = value;
    }

    /**
     * Gets the value of the pager property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPager() {
        return pager;
    }

    /**
     * Sets the value of the pager property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPager(String value) {
        this.pager = value;
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
     * Gets the value of the phone2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhone2() {
        return phone2;
    }

    /**
     * Sets the value of the phone2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhone2(String value) {
        this.phone2 = value;
    }

    /**
     * Gets the value of the phone3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhone3() {
        return phone3;
    }

    /**
     * Sets the value of the phone3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhone3(String value) {
        this.phone3 = value;
    }

    /**
     * Gets the value of the smsOptIn property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSmsOptIn() {
        return smsOptIn;
    }

    /**
     * Sets the value of the smsOptIn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSmsOptIn(Boolean value) {
        this.smsOptIn = value;
    }

    /**
     * Gets the value of the timeZoneOffsetEST property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTimeZoneOffsetEST() {
        return timeZoneOffsetEST;
    }

    /**
     * Sets the value of the timeZoneOffsetEST property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTimeZoneOffsetEST(Integer value) {
        this.timeZoneOffsetEST = value;
    }

    /**
     * Gets the value of the userID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getUserID() {
        return userID;
    }

    /**
     * Sets the value of the userID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setUserID(Integer value) {
        this.userID = value;
    }

    /**
     * Gets the value of the userTypeID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getUserTypeID() {
        return userTypeID;
    }

    /**
     * Sets the value of the userTypeID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setUserTypeID(Integer value) {
        this.userTypeID = value;
    }

    /**
     * Gets the value of the username property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsername() {
        return username;
    }

    /**
     * Sets the value of the username property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsername(String value) {
        this.username = value;
    }

}
