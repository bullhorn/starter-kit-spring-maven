
package com.bullhorn.apiservice.oauth;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for partnerSessionRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="partnerSessionRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="corporationId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="oauth_consumerKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="oauth_nonce" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="oauth_signature" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="oauth_signatureMethod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="oauth_timeStamp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="oauth_version" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="userId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "partnerSessionRequest", propOrder = {
    "corporationId",
    "oauthConsumerKey",
    "oauthNonce",
    "oauthSignature",
    "oauthSignatureMethod",
    "oauthTimeStamp",
    "oauthVersion",
    "userId"
})
public class PartnerSessionRequest {

    protected int corporationId;
    @XmlElement(name = "oauth_consumerKey")
    protected String oauthConsumerKey;
    @XmlElement(name = "oauth_nonce")
    protected String oauthNonce;
    @XmlElement(name = "oauth_signature")
    protected String oauthSignature;
    @XmlElement(name = "oauth_signatureMethod")
    protected String oauthSignatureMethod;
    @XmlElement(name = "oauth_timeStamp")
    protected String oauthTimeStamp;
    @XmlElement(name = "oauth_version")
    protected String oauthVersion;
    protected int userId;

    /**
     * Gets the value of the corporationId property.
     * 
     */
    public int getCorporationId() {
        return corporationId;
    }

    /**
     * Sets the value of the corporationId property.
     * 
     */
    public void setCorporationId(int value) {
        this.corporationId = value;
    }

    /**
     * Gets the value of the oauthConsumerKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOauthConsumerKey() {
        return oauthConsumerKey;
    }

    /**
     * Sets the value of the oauthConsumerKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOauthConsumerKey(String value) {
        this.oauthConsumerKey = value;
    }

    /**
     * Gets the value of the oauthNonce property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOauthNonce() {
        return oauthNonce;
    }

    /**
     * Sets the value of the oauthNonce property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOauthNonce(String value) {
        this.oauthNonce = value;
    }

    /**
     * Gets the value of the oauthSignature property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOauthSignature() {
        return oauthSignature;
    }

    /**
     * Sets the value of the oauthSignature property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOauthSignature(String value) {
        this.oauthSignature = value;
    }

    /**
     * Gets the value of the oauthSignatureMethod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOauthSignatureMethod() {
        return oauthSignatureMethod;
    }

    /**
     * Sets the value of the oauthSignatureMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOauthSignatureMethod(String value) {
        this.oauthSignatureMethod = value;
    }

    /**
     * Gets the value of the oauthTimeStamp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOauthTimeStamp() {
        return oauthTimeStamp;
    }

    /**
     * Sets the value of the oauthTimeStamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOauthTimeStamp(String value) {
        this.oauthTimeStamp = value;
    }

    /**
     * Gets the value of the oauthVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOauthVersion() {
        return oauthVersion;
    }

    /**
     * Sets the value of the oauthVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOauthVersion(String value) {
        this.oauthVersion = value;
    }

    /**
     * Gets the value of the userId property.
     * 
     */
    public int getUserId() {
        return userId;
    }

    /**
     * Sets the value of the userId property.
     * 
     */
    public void setUserId(int value) {
        this.userId = value;
    }

}
