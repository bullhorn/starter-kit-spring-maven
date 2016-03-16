
package com.bullhorn.entity.appointment;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for appointmentAttendeeApiProperty.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="appointmentAttendeeApiProperty">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="appointmentAttendeeID"/>
 *     &lt;enumeration value="acceptanceStatus"/>
 *     &lt;enumeration value="appointmentID"/>
 *     &lt;enumeration value="attendeeID"/>
 *     &lt;enumeration value="migrateGUID"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "appointmentAttendeeApiProperty")
@XmlEnum
public enum AppointmentAttendeeApiProperty {

    @XmlEnumValue("appointmentAttendeeID")
    APPOINTMENT_ATTENDEE_ID("appointmentAttendeeID"),
    @XmlEnumValue("acceptanceStatus")
    ACCEPTANCE_STATUS("acceptanceStatus"),
    @XmlEnumValue("appointmentID")
    APPOINTMENT_ID("appointmentID"),
    @XmlEnumValue("attendeeID")
    ATTENDEE_ID("attendeeID"),
    @XmlEnumValue("migrateGUID")
    MIGRATE_GUID("migrateGUID");
    private final String value;

    AppointmentAttendeeApiProperty(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AppointmentAttendeeApiProperty fromValue(String v) {
        for (AppointmentAttendeeApiProperty c: AppointmentAttendeeApiProperty.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
