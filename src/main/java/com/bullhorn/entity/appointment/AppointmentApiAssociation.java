
package com.bullhorn.entity.appointment;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for appointmentApiAssociation.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="appointmentApiAssociation">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="attendees"/>
 *     &lt;enumeration value="childAppointments"/>
 *     &lt;enumeration value="recurringDeletes"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "appointmentApiAssociation")
@XmlEnum
public enum AppointmentApiAssociation {

    @XmlEnumValue("attendees")
    ATTENDEES("attendees"),
    @XmlEnumValue("childAppointments")
    CHILD_APPOINTMENTS("childAppointments"),
    @XmlEnumValue("recurringDeletes")
    RECURRING_DELETES("recurringDeletes");
    private final String value;

    AppointmentApiAssociation(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AppointmentApiAssociation fromValue(String v) {
        for (AppointmentApiAssociation c: AppointmentApiAssociation.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
