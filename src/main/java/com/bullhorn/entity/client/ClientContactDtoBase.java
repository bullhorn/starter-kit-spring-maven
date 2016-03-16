
package com.bullhorn.entity.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.bullhorn.entity.emb.Address;
import com.bullhorn.entity.user.PersonDto;


/**
 * <p>Java class for clientContactDtoBase complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="clientContactDtoBase">
 *   &lt;complexContent>
 *     &lt;extension base="{http://user.entity.bullhorn.com/}personDto">
 *       &lt;sequence>
 *         &lt;element name="categoryID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="certifications" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="clientCorporationID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="comments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customTextBlock1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customTextBlock2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customTextBlock3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customTextBlock4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customTextBlock5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dateAdded" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="dateLastVisit" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="deleteMe" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="desiredCategories" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="desiredSkills" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="desiredSpecialties" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="division" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="externalID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="linkedPersonID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="migrateGUID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numEmployees" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="office" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ownerID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="password" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="preferredContact" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="referredByPersonID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="reportToPersonID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="secondaryAddress" type="{http://emb.entity.bullhorn.com/}address" minOccurs="0"/>
 *         &lt;element name="source" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "clientContactDtoBase", propOrder = {
    "categoryID",
    "certifications",
    "clientCorporationID",
    "comments",
    "customTextBlock1",
    "customTextBlock2",
    "customTextBlock3",
    "customTextBlock4",
    "customTextBlock5",
    "dateAdded",
    "dateLastVisit",
    "deleteMe",
    "description",
    "desiredCategories",
    "desiredSkills",
    "desiredSpecialties",
    "division",
    "externalID",
    "linkedPersonID",
    "migrateGUID",
    "numEmployees",
    "office",
    "ownerID",
    "password",
    "preferredContact",
    "referredByPersonID",
    "reportToPersonID",
    "secondaryAddress",
    "source",
    "status",
    "type"
})
@XmlSeeAlso({
    ClientContactDto.class
})
public abstract class ClientContactDtoBase
    extends PersonDto
{

    protected Integer categoryID;
    protected String certifications;
    protected Integer clientCorporationID;
    protected String comments;
    protected String customTextBlock1;
    protected String customTextBlock2;
    protected String customTextBlock3;
    protected String customTextBlock4;
    protected String customTextBlock5;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateAdded;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateLastVisit;
    protected String deleteMe;
    protected String description;
    protected String desiredCategories;
    protected String desiredSkills;
    protected String desiredSpecialties;
    protected String division;
    protected String externalID;
    protected Integer linkedPersonID;
    protected String migrateGUID;
    protected Integer numEmployees;
    protected String office;
    protected Integer ownerID;
    protected String password;
    protected String preferredContact;
    protected Integer referredByPersonID;
    protected Integer reportToPersonID;
    protected Address secondaryAddress;
    protected String source;
    protected String status;
    protected String type;

    /**
     * Gets the value of the categoryID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCategoryID() {
        return categoryID;
    }

    /**
     * Sets the value of the categoryID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCategoryID(Integer value) {
        this.categoryID = value;
    }

    /**
     * Gets the value of the certifications property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCertifications() {
        return certifications;
    }

    /**
     * Sets the value of the certifications property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCertifications(String value) {
        this.certifications = value;
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
     * Gets the value of the dateLastVisit property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateLastVisit() {
        return dateLastVisit;
    }

    /**
     * Sets the value of the dateLastVisit property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateLastVisit(XMLGregorianCalendar value) {
        this.dateLastVisit = value;
    }

    /**
     * Gets the value of the deleteMe property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeleteMe() {
        return deleteMe;
    }

    /**
     * Sets the value of the deleteMe property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeleteMe(String value) {
        this.deleteMe = value;
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
     * Gets the value of the desiredCategories property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDesiredCategories() {
        return desiredCategories;
    }

    /**
     * Sets the value of the desiredCategories property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDesiredCategories(String value) {
        this.desiredCategories = value;
    }

    /**
     * Gets the value of the desiredSkills property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDesiredSkills() {
        return desiredSkills;
    }

    /**
     * Sets the value of the desiredSkills property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDesiredSkills(String value) {
        this.desiredSkills = value;
    }

    /**
     * Gets the value of the desiredSpecialties property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDesiredSpecialties() {
        return desiredSpecialties;
    }

    /**
     * Sets the value of the desiredSpecialties property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDesiredSpecialties(String value) {
        this.desiredSpecialties = value;
    }

    /**
     * Gets the value of the division property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDivision() {
        return division;
    }

    /**
     * Sets the value of the division property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDivision(String value) {
        this.division = value;
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
     * Gets the value of the linkedPersonID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLinkedPersonID() {
        return linkedPersonID;
    }

    /**
     * Sets the value of the linkedPersonID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLinkedPersonID(Integer value) {
        this.linkedPersonID = value;
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
     * Gets the value of the office property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOffice() {
        return office;
    }

    /**
     * Sets the value of the office property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOffice(String value) {
        this.office = value;
    }

    /**
     * Gets the value of the ownerID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOwnerID() {
        return ownerID;
    }

    /**
     * Sets the value of the ownerID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOwnerID(Integer value) {
        this.ownerID = value;
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
     * Gets the value of the preferredContact property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreferredContact() {
        return preferredContact;
    }

    /**
     * Sets the value of the preferredContact property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreferredContact(String value) {
        this.preferredContact = value;
    }

    /**
     * Gets the value of the referredByPersonID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getReferredByPersonID() {
        return referredByPersonID;
    }

    /**
     * Sets the value of the referredByPersonID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setReferredByPersonID(Integer value) {
        this.referredByPersonID = value;
    }

    /**
     * Gets the value of the reportToPersonID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getReportToPersonID() {
        return reportToPersonID;
    }

    /**
     * Sets the value of the reportToPersonID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setReportToPersonID(Integer value) {
        this.reportToPersonID = value;
    }

    /**
     * Gets the value of the secondaryAddress property.
     * 
     * @return
     *     possible object is
     *     {@link Address }
     *     
     */
    public Address getSecondaryAddress() {
        return secondaryAddress;
    }

    /**
     * Sets the value of the secondaryAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link Address }
     *     
     */
    public void setSecondaryAddress(Address value) {
        this.secondaryAddress = value;
    }

    /**
     * Gets the value of the source property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSource() {
        return source;
    }

    /**
     * Sets the value of the source property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSource(String value) {
        this.source = value;
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

}
