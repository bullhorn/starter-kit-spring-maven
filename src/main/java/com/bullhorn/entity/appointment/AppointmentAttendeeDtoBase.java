
package com.bullhorn.entity.appointment;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.bullhorn.entity.AbstractDto;


/**
 * <p>Java class for appointmentAttendeeDtoBase complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="appointmentAttendeeDtoBase">
 *   &lt;complexContent>
 *     &lt;extension base="{http://entity.bullhorn.com/}abstractDto">
 *       &lt;sequence>
 *         &lt;element name="acceptanceStatus" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="appointmentAttendeeID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="appointmentID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="attendeeID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="migrateGUID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "appointmentAttendeeDtoBase", propOrder = {
    "acceptanceStatus",
    "appointmentAttendeeID",
    "appointmentID",
    "attendeeID",
    "migrateGUID"
})
@XmlSeeAlso({
    AppointmentAttendeeDto.class
})
public abstract class AppointmentAttendeeDtoBase
    extends AbstractDto
{

    protected Integer acceptanceStatus;
    protected Integer appointmentAttendeeID;
    protected Integer appointmentID;
    protected Integer attendeeID;
    protected String migrateGUID;

    /**
     * Gets the value of the acceptanceStatus property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAcceptanceStatus() {
        return acceptanceStatus;
    }

    /**
     * Sets the value of the acceptanceStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAcceptanceStatus(Integer value) {
        this.acceptanceStatus = value;
    }

    /**
     * Gets the value of the appointmentAttendeeID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAppointmentAttendeeID() {
        return appointmentAttendeeID;
    }

    /**
     * Sets the value of the appointmentAttendeeID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAppointmentAttendeeID(Integer value) {
        this.appointmentAttendeeID = value;
    }

    /**
     * Gets the value of the appointmentID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAppointmentID() {
        return appointmentID;
    }

    /**
     * Sets the value of the appointmentID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAppointmentID(Integer value) {
        this.appointmentID = value;
    }

    /**
     * Gets the value of the attendeeID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAttendeeID() {
        return attendeeID;
    }

    /**
     * Sets the value of the attendeeID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAttendeeID(Integer value) {
        this.attendeeID = value;
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

}
