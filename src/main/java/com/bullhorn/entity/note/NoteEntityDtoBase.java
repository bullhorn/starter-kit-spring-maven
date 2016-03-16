
package com.bullhorn.entity.note;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.bullhorn.entity.AbstractDto;


/**
 * <p>Java class for noteEntityDtoBase complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="noteEntityDtoBase">
 *   &lt;complexContent>
 *     &lt;extension base="{http://entity.bullhorn.com/}abstractDto">
 *       &lt;sequence>
 *         &lt;element name="noteEntityID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="noteID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="targetEntityID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="targetEntityName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "noteEntityDtoBase", propOrder = {
    "noteEntityID",
    "noteID",
    "targetEntityID",
    "targetEntityName"
})
@XmlSeeAlso({
    NoteEntityDto.class
})
public abstract class NoteEntityDtoBase
    extends AbstractDto
{

    protected Integer noteEntityID;
    protected Integer noteID;
    protected Integer targetEntityID;
    protected String targetEntityName;

    /**
     * Gets the value of the noteEntityID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNoteEntityID() {
        return noteEntityID;
    }

    /**
     * Sets the value of the noteEntityID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNoteEntityID(Integer value) {
        this.noteEntityID = value;
    }

    /**
     * Gets the value of the noteID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNoteID() {
        return noteID;
    }

    /**
     * Sets the value of the noteID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNoteID(Integer value) {
        this.noteID = value;
    }

    /**
     * Gets the value of the targetEntityID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTargetEntityID() {
        return targetEntityID;
    }

    /**
     * Sets the value of the targetEntityID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTargetEntityID(Integer value) {
        this.targetEntityID = value;
    }

    /**
     * Gets the value of the targetEntityName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTargetEntityName() {
        return targetEntityName;
    }

    /**
     * Sets the value of the targetEntityName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTargetEntityName(String value) {
        this.targetEntityName = value;
    }

}
