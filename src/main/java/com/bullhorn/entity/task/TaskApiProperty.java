
package com.bullhorn.entity.task;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for taskApiProperty.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="taskApiProperty">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="taskID"/>
 *     &lt;enumeration value="candidateID"/>
 *     &lt;enumeration value="clientContactID"/>
 *     &lt;enumeration value="dateAdded"/>
 *     &lt;enumeration value="dateBegin"/>
 *     &lt;enumeration value="dateCompleted"/>
 *     &lt;enumeration value="dateEnd"/>
 *     &lt;enumeration value="dateLastModified"/>
 *     &lt;enumeration value="description"/>
 *     &lt;enumeration value="isCompleted"/>
 *     &lt;enumeration value="isDeleted"/>
 *     &lt;enumeration value="isPrivate"/>
 *     &lt;enumeration value="isSystemTask"/>
 *     &lt;enumeration value="jobOrderID"/>
 *     &lt;enumeration value="jobSubmissionID"/>
 *     &lt;enumeration value="migrateGUID"/>
 *     &lt;enumeration value="notificationMinutes"/>
 *     &lt;enumeration value="ownerID"/>
 *     &lt;enumeration value="parentTaskID"/>
 *     &lt;enumeration value="placementID"/>
 *     &lt;enumeration value="recurrenceDayBits"/>
 *     &lt;enumeration value="recurrenceFrequency"/>
 *     &lt;enumeration value="recurrenceMax"/>
 *     &lt;enumeration value="recurrenceMonthBits"/>
 *     &lt;enumeration value="recurrenceStyle"/>
 *     &lt;enumeration value="recurrenceType"/>
 *     &lt;enumeration value="subject"/>
 *     &lt;enumeration value="taskUUID"/>
 *     &lt;enumeration value="timeZoneID"/>
 *     &lt;enumeration value="type"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "taskApiProperty")
@XmlEnum
public enum TaskApiProperty {

    @XmlEnumValue("taskID")
    TASK_ID("taskID"),
    @XmlEnumValue("candidateID")
    CANDIDATE_ID("candidateID"),
    @XmlEnumValue("clientContactID")
    CLIENT_CONTACT_ID("clientContactID"),
    @XmlEnumValue("dateAdded")
    DATE_ADDED("dateAdded"),
    @XmlEnumValue("dateBegin")
    DATE_BEGIN("dateBegin"),
    @XmlEnumValue("dateCompleted")
    DATE_COMPLETED("dateCompleted"),
    @XmlEnumValue("dateEnd")
    DATE_END("dateEnd"),
    @XmlEnumValue("dateLastModified")
    DATE_LAST_MODIFIED("dateLastModified"),
    @XmlEnumValue("description")
    DESCRIPTION("description"),
    @XmlEnumValue("isCompleted")
    IS_COMPLETED("isCompleted"),
    @XmlEnumValue("isDeleted")
    IS_DELETED("isDeleted"),
    @XmlEnumValue("isPrivate")
    IS_PRIVATE("isPrivate"),
    @XmlEnumValue("isSystemTask")
    IS_SYSTEM_TASK("isSystemTask"),
    @XmlEnumValue("jobOrderID")
    JOB_ORDER_ID("jobOrderID"),
    @XmlEnumValue("jobSubmissionID")
    JOB_SUBMISSION_ID("jobSubmissionID"),
    @XmlEnumValue("migrateGUID")
    MIGRATE_GUID("migrateGUID"),
    @XmlEnumValue("notificationMinutes")
    NOTIFICATION_MINUTES("notificationMinutes"),
    @XmlEnumValue("ownerID")
    OWNER_ID("ownerID"),
    @XmlEnumValue("parentTaskID")
    PARENT_TASK_ID("parentTaskID"),
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
    @XmlEnumValue("subject")
    SUBJECT("subject"),
    @XmlEnumValue("taskUUID")
    TASK_UUID("taskUUID"),
    @XmlEnumValue("timeZoneID")
    TIME_ZONE_ID("timeZoneID"),
    @XmlEnumValue("type")
    TYPE("type");
    private final String value;

    TaskApiProperty(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TaskApiProperty fromValue(String v) {
        for (TaskApiProperty c: TaskApiProperty.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
