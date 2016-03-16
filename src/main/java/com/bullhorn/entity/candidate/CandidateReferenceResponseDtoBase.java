
package com.bullhorn.entity.candidate;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.bullhorn.entity.AbstractDto;


/**
 * <p>Java class for candidateReferenceResponseDtoBase complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="candidateReferenceResponseDtoBase">
 *   &lt;complexContent>
 *     &lt;extension base="{http://entity.bullhorn.com/}abstractDto">
 *       &lt;sequence>
 *         &lt;element name="migrateGUID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="questionID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="referenceID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="responseText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="userReferenceResponseID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "candidateReferenceResponseDtoBase", propOrder = {
    "migrateGUID",
    "questionID",
    "referenceID",
    "responseText",
    "userReferenceResponseID"
})
@XmlSeeAlso({
    CandidateReferenceResponseDto.class
})
public abstract class CandidateReferenceResponseDtoBase
    extends AbstractDto
{

    protected String migrateGUID;
    protected Integer questionID;
    protected Integer referenceID;
    protected String responseText;
    protected Integer userReferenceResponseID;

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
     * Gets the value of the questionID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getQuestionID() {
        return questionID;
    }

    /**
     * Sets the value of the questionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setQuestionID(Integer value) {
        this.questionID = value;
    }

    /**
     * Gets the value of the referenceID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getReferenceID() {
        return referenceID;
    }

    /**
     * Sets the value of the referenceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setReferenceID(Integer value) {
        this.referenceID = value;
    }

    /**
     * Gets the value of the responseText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResponseText() {
        return responseText;
    }

    /**
     * Sets the value of the responseText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResponseText(String value) {
        this.responseText = value;
    }

    /**
     * Gets the value of the userReferenceResponseID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getUserReferenceResponseID() {
        return userReferenceResponseID;
    }

    /**
     * Sets the value of the userReferenceResponseID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setUserReferenceResponseID(Integer value) {
        this.userReferenceResponseID = value;
    }

}
