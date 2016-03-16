
package com.bullhorn.entity.appointment;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for recurringAppointmentDeleteApiProperty.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="recurringAppointmentDeleteApiProperty">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="deletionID"/>
 *     &lt;enumeration value="appointmentID"/>
 *     &lt;enumeration value="dateBegin"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "recurringAppointmentDeleteApiProperty")
@XmlEnum
public enum RecurringAppointmentDeleteApiProperty {

    @XmlEnumValue("deletionID")
    DELETION_ID("deletionID"),
    @XmlEnumValue("appointmentID")
    APPOINTMENT_ID("appointmentID"),
    @XmlEnumValue("dateBegin")
    DATE_BEGIN("dateBegin");
    private final String value;

    RecurringAppointmentDeleteApiProperty(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RecurringAppointmentDeleteApiProperty fromValue(String v) {
        for (RecurringAppointmentDeleteApiProperty c: RecurringAppointmentDeleteApiProperty.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
