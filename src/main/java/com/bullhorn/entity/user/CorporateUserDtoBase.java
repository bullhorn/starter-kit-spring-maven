
package com.bullhorn.entity.user;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.bullhorn.entity.types.LoginRestrictions;


/**
 * <p>Java class for corporateUserDtoBase complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="corporateUserDtoBase">
 *   &lt;complexContent>
 *     &lt;extension base="{http://user.entity.bullhorn.com/}personDto">
 *       &lt;sequence>
 *         &lt;element name="corporationID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="emailNotify" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="emailSignature" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="enabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="externalEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="inboundEmailEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="isOutboundFaxEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="loginRestrictions" type="{http://types.entity.bullhorn.com/}loginRestrictions" minOccurs="0"/>
 *         &lt;element name="password" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="primaryPrivateLabelID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "corporateUserDtoBase", propOrder = {
    "corporationID",
    "emailNotify",
    "emailSignature",
    "enabled",
    "externalEmail",
    "inboundEmailEnabled",
    "isOutboundFaxEnabled",
    "loginRestrictions",
    "password",
    "primaryPrivateLabelID"
})
@XmlSeeAlso({
    CorporateUserDto.class
})
public abstract class CorporateUserDtoBase
    extends PersonDto
{

    protected Integer corporationID;
    protected Boolean emailNotify;
    protected String emailSignature;
    protected Boolean enabled;
    protected String externalEmail;
    protected Boolean inboundEmailEnabled;
    protected Boolean isOutboundFaxEnabled;
    protected LoginRestrictions loginRestrictions;
    protected String password;
    protected Integer primaryPrivateLabelID;

    /**
     * Gets the value of the corporationID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCorporationID() {
        return corporationID;
    }

    /**
     * Sets the value of the corporationID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCorporationID(Integer value) {
        this.corporationID = value;
    }

    /**
     * Gets the value of the emailNotify property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEmailNotify() {
        return emailNotify;
    }

    /**
     * Sets the value of the emailNotify property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEmailNotify(Boolean value) {
        this.emailNotify = value;
    }

    /**
     * Gets the value of the emailSignature property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailSignature() {
        return emailSignature;
    }

    /**
     * Sets the value of the emailSignature property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailSignature(String value) {
        this.emailSignature = value;
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
     * Gets the value of the externalEmail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalEmail() {
        return externalEmail;
    }

    /**
     * Sets the value of the externalEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalEmail(String value) {
        this.externalEmail = value;
    }

    /**
     * Gets the value of the inboundEmailEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInboundEmailEnabled() {
        return inboundEmailEnabled;
    }

    /**
     * Sets the value of the inboundEmailEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInboundEmailEnabled(Boolean value) {
        this.inboundEmailEnabled = value;
    }

    /**
     * Gets the value of the isOutboundFaxEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsOutboundFaxEnabled() {
        return isOutboundFaxEnabled;
    }

    /**
     * Sets the value of the isOutboundFaxEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsOutboundFaxEnabled(Boolean value) {
        this.isOutboundFaxEnabled = value;
    }

    /**
     * Gets the value of the loginRestrictions property.
     * 
     * @return
     *     possible object is
     *     {@link LoginRestrictions }
     *     
     */
    public LoginRestrictions getLoginRestrictions() {
        return loginRestrictions;
    }

    /**
     * Sets the value of the loginRestrictions property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoginRestrictions }
     *     
     */
    public void setLoginRestrictions(LoginRestrictions value) {
        this.loginRestrictions = value;
    }

    /**
     * Gets the value of the password property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassword() {
        return password;
    }

    /**
     * Sets the value of the password property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassword(String value) {
        this.password = value;
    }

    /**
     * Gets the value of the primaryPrivateLabelID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPrimaryPrivateLabelID() {
        return primaryPrivateLabelID;
    }

    /**
     * Sets the value of the primaryPrivateLabelID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPrimaryPrivateLabelID(Integer value) {
        this.primaryPrivateLabelID = value;
    }

}
