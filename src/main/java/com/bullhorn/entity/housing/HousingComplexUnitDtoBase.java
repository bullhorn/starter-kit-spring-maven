
package com.bullhorn.entity.housing;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.bullhorn.entity.AbstractDto;


/**
 * <p>Java class for housingComplexUnitDtoBase complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="housingComplexUnitDtoBase">
 *   &lt;complexContent>
 *     &lt;extension base="{http://entity.bullhorn.com/}abstractDto">
 *       &lt;sequence>
 *         &lt;element name="billingContactID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="comments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customContactID1" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="customContactID2" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
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
 *         &lt;element name="customText2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customText3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customText4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customText5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customTextBlock1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customTextBlock2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customTextBlock3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customTextBlock4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customTextBlock5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dateAdded" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="dateLeaseBegin" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="dateLeaseEnd" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="dateOfDeposit" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="dateOfRefund" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="firstMonthProRate" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="housingComplexID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="housingComplexUnitID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="isDeleted" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="isDepositRefundable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="isLeaseOnFile" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="maxOccupants" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="migrateGUID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="monthlyRent" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="penalties" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="securityDeposit" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="unitManagerID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "housingComplexUnitDtoBase", propOrder = {
    "billingContactID",
    "comments",
    "customContactID1",
    "customContactID2",
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
    "customText2",
    "customText3",
    "customText4",
    "customText5",
    "customTextBlock1",
    "customTextBlock2",
    "customTextBlock3",
    "customTextBlock4",
    "customTextBlock5",
    "dateAdded",
    "dateLeaseBegin",
    "dateLeaseEnd",
    "dateOfDeposit",
    "dateOfRefund",
    "firstMonthProRate",
    "housingComplexID",
    "housingComplexUnitID",
    "isDeleted",
    "isDepositRefundable",
    "isLeaseOnFile",
    "maxOccupants",
    "migrateGUID",
    "monthlyRent",
    "name",
    "penalties",
    "securityDeposit",
    "unitManagerID"
})
@XmlSeeAlso({
    HousingComplexUnitDto.class
})
public abstract class HousingComplexUnitDtoBase
    extends AbstractDto
{

    protected Integer billingContactID;
    protected String comments;
    protected Integer customContactID1;
    protected Integer customContactID2;
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
    protected String customText2;
    protected String customText3;
    protected String customText4;
    protected String customText5;
    protected String customTextBlock1;
    protected String customTextBlock2;
    protected String customTextBlock3;
    protected String customTextBlock4;
    protected String customTextBlock5;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateAdded;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateLeaseBegin;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateLeaseEnd;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateOfDeposit;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateOfRefund;
    protected BigDecimal firstMonthProRate;
    protected Integer housingComplexID;
    protected Integer housingComplexUnitID;
    protected Boolean isDeleted;
    protected Boolean isDepositRefundable;
    protected Boolean isLeaseOnFile;
    protected Integer maxOccupants;
    protected String migrateGUID;
    protected BigDecimal monthlyRent;
    protected String name;
    protected String penalties;
    protected BigDecimal securityDeposit;
    protected Integer unitManagerID;

    /**
     * Gets the value of the billingContactID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBillingContactID() {
        return billingContactID;
    }

    /**
     * Sets the value of the billingContactID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBillingContactID(Integer value) {
        this.billingContactID = value;
    }

    /**
     * Gets the value of the comments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComments() {
        return comments;
    }

    /**
     * Sets the value of the comments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComments(String value) {
        this.comments = value;
    }

    /**
     * Gets the value of the customContactID1 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCustomContactID1() {
        return customContactID1;
    }

    /**
     * Sets the value of the customContactID1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCustomContactID1(Integer value) {
        this.customContactID1 = value;
    }

    /**
     * Gets the value of the customContactID2 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCustomContactID2() {
        return customContactID2;
    }

    /**
     * Sets the value of the customContactID2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCustomContactID2(Integer value) {
        this.customContactID2 = value;
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
     * Gets the value of the dateLeaseBegin property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateLeaseBegin() {
        return dateLeaseBegin;
    }

    /**
     * Sets the value of the dateLeaseBegin property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateLeaseBegin(XMLGregorianCalendar value) {
        this.dateLeaseBegin = value;
    }

    /**
     * Gets the value of the dateLeaseEnd property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateLeaseEnd() {
        return dateLeaseEnd;
    }

    /**
     * Sets the value of the dateLeaseEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateLeaseEnd(XMLGregorianCalendar value) {
        this.dateLeaseEnd = value;
    }

    /**
     * Gets the value of the dateOfDeposit property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateOfDeposit() {
        return dateOfDeposit;
    }

    /**
     * Sets the value of the dateOfDeposit property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateOfDeposit(XMLGregorianCalendar value) {
        this.dateOfDeposit = value;
    }

    /**
     * Gets the value of the dateOfRefund property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateOfRefund() {
        return dateOfRefund;
    }

    /**
     * Sets the value of the dateOfRefund property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateOfRefund(XMLGregorianCalendar value) {
        this.dateOfRefund = value;
    }

    /**
     * Gets the value of the firstMonthProRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFirstMonthProRate() {
        return firstMonthProRate;
    }

    /**
     * Sets the value of the firstMonthProRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFirstMonthProRate(BigDecimal value) {
        this.firstMonthProRate = value;
    }

    /**
     * Gets the value of the housingComplexID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getHousingComplexID() {
        return housingComplexID;
    }

    /**
     * Sets the value of the housingComplexID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setHousingComplexID(Integer value) {
        this.housingComplexID = value;
    }

    /**
     * Gets the value of the housingComplexUnitID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getHousingComplexUnitID() {
        return housingComplexUnitID;
    }

    /**
     * Sets the value of the housingComplexUnitID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setHousingComplexUnitID(Integer value) {
        this.housingComplexUnitID = value;
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
     * Gets the value of the isDepositRefundable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsDepositRefundable() {
        return isDepositRefundable;
    }

    /**
     * Sets the value of the isDepositRefundable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsDepositRefundable(Boolean value) {
        this.isDepositRefundable = value;
    }

    /**
     * Gets the value of the isLeaseOnFile property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsLeaseOnFile() {
        return isLeaseOnFile;
    }

    /**
     * Sets the value of the isLeaseOnFile property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsLeaseOnFile(Boolean value) {
        this.isLeaseOnFile = value;
    }

    /**
     * Gets the value of the maxOccupants property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxOccupants() {
        return maxOccupants;
    }

    /**
     * Sets the value of the maxOccupants property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxOccupants(Integer value) {
        this.maxOccupants = value;
    }

    /**
     * Gets the value of the migrateGUID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMigrateGUID() {
        return migrateGUID;
    }

    /**
     * Sets the value of the migrateGUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMigrateGUID(String value) {
        this.migrateGUID = value;
    }

    /**
     * Gets the value of the monthlyRent property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMonthlyRent() {
        return monthlyRent;
    }

    /**
     * Sets the value of the monthlyRent property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMonthlyRent(BigDecimal value) {
        this.monthlyRent = value;
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
     * Gets the value of the penalties property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPenalties() {
        return penalties;
    }

    /**
     * Sets the value of the penalties property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPenalties(String value) {
        this.penalties = value;
    }

    /**
     * Gets the value of the securityDeposit property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSecurityDeposit() {
        return securityDeposit;
    }

    /**
     * Sets the value of the securityDeposit property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSecurityDeposit(BigDecimal value) {
        this.securityDeposit = value;
    }

    /**
     * Gets the value of the unitManagerID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getUnitManagerID() {
        return unitManagerID;
    }

    /**
     * Sets the value of the unitManagerID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setUnitManagerID(Integer value) {
        this.unitManagerID = value;
    }

}
