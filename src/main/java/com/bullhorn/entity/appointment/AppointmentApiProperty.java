
package com.bullhorn.entity.appointment;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for appointmentApiProperty.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="appointmentApiProperty">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="appointmentID"/>
 *     &lt;enumeration value="appointmentUUID"/>
 *     &lt;enumeration value="candidateReferenceID"/>
 *     &lt;enumeration value="clientContactReferenceID"/>
 *     &lt;enumeration value="communicationMethod"/>
 *     &lt;enumeration value="dateAdded"/>
 *     &lt;enumeration value="dateBegin"/>
 *     &lt;enumeration value="dateEnd"/>
 *     &lt;enumeration value="dateLastModified"/>
 *     &lt;enumeration value="description"/>
 *     &lt;enumeration value="isAllDay"/>
 *     &lt;enumeration value="isDeleted"/>
 *     &lt;enumeration value="isPrivate"/>
 *     &lt;enumeration value="jobOrderID"/>
 *     &lt;enumeration value="location"/>
 *     &lt;enumeration value="migrateGUID"/>
 *     &lt;enumeration value="notificationMinutes"/>
 *     &lt;enumeration value="ownerID"/>
 *     &lt;enumeration value="parentAppointmentID"/>
 *     &lt;enumeration value="placementID"/>
 *     &lt;enumeration value="recurrenceDayBits"/>
 *     &lt;enumeration value="recurrenceFrequency"/>
 *     &lt;enumeration value="recurrenceMax"/>
 *     &lt;enumeration value="recurrenceMonthBits"/>
 *     &lt;enumeration value="recurrenceStyle"/>
 *     &lt;enumeration value="recurrenceType"/>
 *     &lt;enumeration value="showTimeAs"/>
 *     &lt;enumeration value="subject"/>
 *     &lt;enumeration value="timeZoneID"/>
 *     &lt;enumeration value="type"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "appointmentApiProperty")
@XmlEnum
public enum AppointmentApiProperty {

    @XmlEnumValue("appointmentID")
    APPOINTMENT_ID("appointmentID"),
    @XmlEnumValue("appointmentUUID")
    APPOINTMENT_UUID("appointmentUUID"),
    @XmlEnumValue("candidateReferenceID")
    CANDIDATE_REFERENCE_ID("candidateReferenceID"),
    @XmlEnumValue("clientContactReferenceID")
    CLIENT_CONTACT_REFERENCE_ID("clientContactReferenceID"),
    @XmlEnumValue("communicationMethod")
    COMMUNICATION_METHOD("communicationMethod"),
    @XmlEnumValue("dateAdded")
    DATE_ADDED("dateAdded"),
    @XmlEnumValue("dateBegin")
    DATE_BEGIN("dateBegin"),
    @XmlEnumValue("dateEnd")
    DATE_END("dateEnd"),
    @XmlEnumValue("dateLastModified")
    DATE_LAST_MODIFIED("dateLastModified"),
    @XmlEnumValue("description")
    DESCRIPTION("description"),
    @XmlEnumValue("isAllDay")
    IS_ALL_DAY("isAllDay"),
    @XmlEnumValue("isDeleted")
    IS_DELETED("isDeleted"),
    @XmlEnumValue("isPrivate")
    IS_PRIVATE("isPrivate"),
    @XmlEnumValue("jobOrderID")
    JOB_ORDER_ID("jobOrderID"),
    @XmlEnumValue("location")
    LOCATION("location"),
    @XmlEnumValue("migrateGUID")
    MIGRATE_GUID("migrateGUID"),
    @XmlEnumValue("notificationMinutes")
    NOTIFICATION_MINUTES("notificationMinutes"),
    @XmlEnumValue("ownerID")
    OWNER_ID("ownerID"),
    @XmlEnumValue("parentAppointmentID")
    PARENT_APPOINTMENT_ID("parentAppointmentID"),
    @XmlEnumValue("placementID")
    PLACEMENT_ID("placementID"),
    @XmlEnumValue("recurrenceDayBits")
    RECURRENCE_DAY_BITS("recurrenceDayBits"),
    @XmlEnumValue("recurrenceFrequency")
    RECURRENCE_FREQUENCY("recurrenceFrequency"),
    @XmlEnumValue("recurrenceMax")
    RECURRENCE_MAX("recurrenceMax"),
    @XmlEnumValue("recurrenceMonthBits")
    RECURRENCE_MONTH_BITS("recurrenceMonthBits"),
    @XmlEnumValue("recurrenceStyle")
    RECURRENCE_STYLE("recurrenceStyle"),
    @XmlEnumValue("recurrenceType")
    RECURRENCE_TYPE("recurrenceType"),
    @XmlEnumValue("showTimeAs")
    SHOW_TIME_AS("showTimeAs"),
    @XmlEnumValue("subject")
    SUBJECT("subject"),
    @XmlEnumValue("timeZoneID")
    TIME_ZONE_ID("timeZoneID"),
    @XmlEnumValue("type")
    TYPE("type");
    private final String value;

    AppointmentApiProperty(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AppointmentApiProperty fromValue(String v) {
        for (AppointmentApiProperty c: AppointmentApiProperty.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
