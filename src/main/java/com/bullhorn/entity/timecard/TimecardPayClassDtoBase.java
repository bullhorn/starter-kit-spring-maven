
package com.bullhorn.entity.timecard;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.bullhorn.entity.AbstractDto;


/**
 * <p>Java class for timecardPayClassDtoBase complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="timecardPayClassDtoBase">
 *   &lt;complexContent>
 *     &lt;extension base="{http://entity.bullhorn.com/}abstractDto">
 *       &lt;sequence>
 *         &lt;element name="billRateField" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="classType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="clientMarkupFactor" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="display" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="enabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="excludeFromInvoicing" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="excludeFromPayrolling" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="isRegularHoursClass" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="markupFactor" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="payClassID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="payRateField" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="privateLabelID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="sortOrder" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "timecardPayClassDtoBase", propOrder = {
    "billRateField",
    "classType",
    "clientMarkupFactor",
    "display",
    "enabled",
    "excludeFromInvoicing",
    "excludeFromPayrolling",
    "isRegularHoursClass",
    "markupFactor",
    "name",
    "payClassID",
    "payRateField",
    "privateLabelID",
    "sortOrder"
})
@XmlSeeAlso({
    TimecardPayClassDto.class
})
public abstract class TimecardPayClassDtoBase
    extends AbstractDto
{

    protected String billRateField;
    protected String classType;
    protected Double clientMarkupFactor;
    protected String display;
    protected Boolean enabled;
    protected Integer excludeFromInvoicing;
    protected Integer excludeFromPayrolling;
    protected Boolean isRegularHoursClass;
    protected Double markupFactor;
    protected String name;
    protected Integer payClassID;
    protected String payRateField;
    protected Integer privateLabelID;
    protected Integer sortOrder;

    /**
     * Gets the value of the billRateField property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillRateField() {
        return billRateField;
    }

    /**
     * Sets the value of the billRateField property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillRateField(String value) {
        this.billRateField = value;
    }

    /**
     * Gets the value of the classType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClassType() {
        return classType;
    }

    /**
     * Sets the value of the classType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClassType(String value) {
        this.classType = value;
    }

    /**
     * Gets the value of the clientMarkupFactor property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getClientMarkupFactor() {
        return clientMarkupFactor;
    }

    /**
     * Sets the value of the clientMarkupFactor property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setClientMarkupFactor(Double value) {
        this.clientMarkupFactor = value;
    }

    /**
     * Gets the value of the display property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplay() {
        return display;
    }

    /**
     * Sets the value of the display property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplay(String value) {
        this.display = value;
    }

    /**
     * Gets the value of the enabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnabled() {
        return enabled;
    }

    /**
     * Sets the value of the enabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnabled(Boolean value) {
        this.enabled = value;
    }

    /**
     * Gets the value of the excludeFromInvoicing property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getExcludeFromInvoicing() {
        return excludeFromInvoicing;
    }

    /**
     * Sets the value of the excludeFromInvoicing property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setExcludeFromInvoicing(Integer value) {
        this.excludeFromInvoicing = value;
    }

    /**
     * Gets the value of the excludeFromPayrolling property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getExcludeFromPayrolling() {
        return excludeFromPayrolling;
    }

    /**
     * Sets the value of the excludeFromPayrolling property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setExcludeFromPayrolling(Integer value) {
        this.excludeFromPayrolling = value;
    }

    /**
     * Gets the value of the isRegularHoursClass property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsRegularHoursClass() {
        return isRegularHoursClass;
    }

    /**
     * Sets the value of the isRegularHoursClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsRegularHoursClass(Boolean value) {
        this.isRegularHoursClass = value;
    }

    /**
     * Gets the value of the markupFactor property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMarkupFactor() {
        return markupFactor;
    }

    /**
     * Sets the value of the markupFactor property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMarkupFactor(Double value) {
        this.markupFactor = value;
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
     * Gets the value of the payClassID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPayClassID() {
        return payClassID;
    }

    /**
     * Sets the value of the payClassID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPayClassID(Integer value) {
        this.payClassID = value;
    }

    /**
     * Gets the value of the payRateField property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayRateField() {
        return payRateField;
    }

    /**
     * Sets the value of the payRateField property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayRateField(String value) {
        this.payRateField = value;
    }

    /**
     * Gets the value of the privateLabelID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPrivateLabelID() {
        return privateLabelID;
    }

    /**
     * Sets the value of the privateLabelID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPrivateLabelID(Integer value) {
        this.privateLabelID = value;
    }

    /**
     * Gets the value of the sortOrder property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSortOrder() {
        return sortOrder;
    }

    /**
     * Sets the value of the sortOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSortOrder(Integer value) {
        this.sortOrder = value;
    }

}
