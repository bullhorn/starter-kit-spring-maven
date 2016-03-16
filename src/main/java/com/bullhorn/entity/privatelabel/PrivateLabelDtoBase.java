
package com.bullhorn.entity.privatelabel;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.bullhorn.entity.AbstractDto;


/**
 * <p>Java class for privateLabelDtoBase complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="privateLabelDtoBase">
 *   &lt;complexContent>
 *     &lt;extension base="{http://entity.bullhorn.com/}abstractDto">
 *       &lt;sequence>
 *         &lt;element name="applicationID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="attributeList" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="coBrandedTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="coBrandedURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dateAdded" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="defaultWebLeadRecruiterID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="enabled" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="footerHTML" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="headerHTML" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="keyWords" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="noLookAndFeel" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="onLoadScript" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="parentPrivateLabelID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="privateLabelID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="splashPage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="styleHTML" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="url" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="userTypeID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "privateLabelDtoBase", propOrder = {
    "applicationID",
    "attributeList",
    "coBrandedTitle",
    "coBrandedURL",
    "dateAdded",
    "defaultWebLeadRecruiterID",
    "description",
    "enabled",
    "footerHTML",
    "headerHTML",
    "keyWords",
    "name",
    "noLookAndFeel",
    "onLoadScript",
    "parentPrivateLabelID",
    "privateLabelID",
    "splashPage",
    "styleHTML",
    "title",
    "type",
    "url",
    "userTypeID"
})
@XmlSeeAlso({
    PrivateLabelDto.class
})
public abstract class PrivateLabelDtoBase
    extends AbstractDto
{

    protected Integer applicationID;
    protected String attributeList;
    protected String coBrandedTitle;
    protected String coBrandedURL;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateAdded;
    protected Integer defaultWebLeadRecruiterID;
    protected String description;
    protected Integer enabled;
    protected String footerHTML;
    protected String headerHTML;
    protected String keyWords;
    protected String name;
    protected Integer noLookAndFeel;
    protected String onLoadScript;
    protected Integer parentPrivateLabelID;
    protected Integer privateLabelID;
    protected String splashPage;
    protected String styleHTML;
    protected String title;
    protected String type;
    protected String url;
    protected Integer userTypeID;

    /**
     * Gets the value of the applicationID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getApplicationID() {
        return applicationID;
    }

    /**
     * Sets the value of the applicationID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setApplicationID(Integer value) {
        this.applicationID = value;
    }

    /**
     * Gets the value of the attributeList property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttributeList() {
        return attributeList;
    }

    /**
     * Sets the value of the attributeList property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttributeList(String value) {
        this.attributeList = value;
    }

    /**
     * Gets the value of the coBrandedTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCoBrandedTitle() {
        return coBrandedTitle;
    }

    /**
     * Sets the value of the coBrandedTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCoBrandedTitle(String value) {
        this.coBrandedTitle = value;
    }

    /**
     * Gets the value of the coBrandedURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCoBrandedURL() {
        return coBrandedURL;
    }

    /**
     * Sets the value of the coBrandedURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCoBrandedURL(String value) {
        this.coBrandedURL = value;
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
     * Gets the value of the defaultWebLeadRecruiterID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDefaultWebLeadRecruiterID() {
        return defaultWebLeadRecruiterID;
    }

    /**
     * Sets the value of the defaultWebLeadRecruiterID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDefaultWebLeadRecruiterID(Integer value) {
        this.defaultWebLeadRecruiterID = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the enabled property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getEnabled() {
        return enabled;
    }

    /**
     * Sets the value of the enabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setEnabled(Integer value) {
        this.enabled = value;
    }

    /**
     * Gets the value of the footerHTML property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFooterHTML() {
        return footerHTML;
    }

    /**
     * Sets the value of the footerHTML property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFooterHTML(String value) {
        this.footerHTML = value;
    }

    /**
     * Gets the value of the headerHTML property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHeaderHTML() {
        return headerHTML;
    }

    /**
     * Sets the value of the headerHTML property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHeaderHTML(String value) {
        this.headerHTML = value;
    }

    /**
     * Gets the value of the keyWords property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKeyWords() {
        return keyWords;
    }

    /**
     * Sets the value of the keyWords property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKeyWords(String value) {
        this.keyWords = value;
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
     * Gets the value of the noLookAndFeel property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNoLookAndFeel() {
        return noLookAndFeel;
    }

    /**
     * Sets the value of the noLookAndFeel property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNoLookAndFeel(Integer value) {
        this.noLookAndFeel = value;
    }

    /**
     * Gets the value of the onLoadScript property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOnLoadScript() {
        return onLoadScript;
    }

    /**
     * Sets the value of the onLoadScript property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOnLoadScript(String value) {
        this.onLoadScript = value;
    }

    /**
     * Gets the value of the parentPrivateLabelID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getParentPrivateLabelID() {
        return parentPrivateLabelID;
    }

    /**
     * Sets the value of the parentPrivateLabelID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setParentPrivateLabelID(Integer value) {
        this.parentPrivateLabelID = value;
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
     * Gets the value of the splashPage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSplashPage() {
        return splashPage;
    }

    /**
     * Sets the value of the splashPage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSplashPage(String value) {
        this.splashPage = value;
    }

    /**
     * Gets the value of the styleHTML property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStyleHTML() {
        return styleHTML;
    }

    /**
     * Sets the value of the styleHTML property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStyleHTML(String value) {
        this.styleHTML = value;
    }

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the url property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrl() {
        return url;
    }

    /**
     * Sets the value of the url property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrl(String value) {
        this.url = value;
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

}
