
package com.bullhorn.entity.timecard;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for timecardTimeApiProperty.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="timecardTimeApiProperty">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="timecardTimeID"/>
 *     &lt;enumeration value="breakEnd"/>
 *     &lt;enumeration value="breakStart"/>
 *     &lt;enumeration value="clientBillRate"/>
 *     &lt;enumeration value="comments"/>
 *     &lt;enumeration value="dateAdded"/>
 *     &lt;enumeration value="dateWorked"/>
 *     &lt;enumeration value="fileExportID"/>
 *     &lt;enumeration value="hours"/>
 *     &lt;enumeration value="invoiceID"/>
 *     &lt;enumeration value="invoiceItemID"/>
 *     &lt;enumeration value="lastModifyingPersonID"/>
 *     &lt;enumeration value="migrateGUID"/>
 *     &lt;enumeration value="minutesBreak"/>
 *     &lt;enumeration value="payClassID"/>
 *     &lt;enumeration value="payRate"/>
 *     &lt;enumeration value="placementID"/>
 *     &lt;enumeration value="projectCode"/>
 *     &lt;enumeration value="projectID"/>
 *     &lt;enumeration value="status"/>
 *     &lt;enumeration value="timeIn"/>
 *     &lt;enumeration value="timeOut"/>
 *     &lt;enumeration value="timecardID"/>
 *     &lt;enumeration value="workersCompensationRate"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "timecardTimeApiProperty")
@XmlEnum
public enum TimecardTimeApiProperty {

    @XmlEnumValue("timecardTimeID")
    TIMECARD_TIME_ID("timecardTimeID"),
    @XmlEnumValue("breakEnd")
    BREAK_END("breakEnd"),
    @XmlEnumValue("breakStart")
    BREAK_START("breakStart"),
    @XmlEnumValue("clientBillRate")
    CLIENT_BILL_RATE("clientBillRate"),
    @XmlEnumValue("comments")
    COMMENTS("comments"),
    @XmlEnumValue("dateAdded")
    DATE_ADDED("dateAdded"),
    @XmlEnumValue("dateWorked")
    DATE_WORKED("dateWorked"),
    @XmlEnumValue("fileExportID")
    FILE_EXPORT_ID("fileExportID"),
    @XmlEnumValue("hours")
    HOURS("hours"),
    @XmlEnumValue("invoiceID")
    INVOICE_ID("invoiceID"),
    @XmlEnumValue("invoiceItemID")
    INVOICE_ITEM_ID("invoiceItemID"),
    @XmlEnumValue("lastModifyingPersonID")
    LAST_MODIFYING_PERSON_ID("lastModifyingPersonID"),
    @XmlEnumValue("migrateGUID")
    MIGRATE_GUID("migrateGUID"),
    @XmlEnumValue("minutesBreak")
    MINUTES_BREAK("minutesBreak"),
    @XmlEnumValue("payClassID")
    PAY_CLASS_ID("payClassID"),
    @XmlEnumValue("payRate")
    PAY_RATE("payRate"),
    @XmlEnumValue("placementID")
    PLACEMENT_ID("placementID"),
    @XmlEnumValue("projectCode")
    PROJECT_CODE("projectCode"),
    @XmlEnumValue("projectID")
    PROJECT_ID("projectID"),
    @XmlEnumValue("status")
    STATUS("status"),
    @XmlEnumValue("timeIn")
    TIME_IN("timeIn"),
    @XmlEnumValue("timeOut")
    TIME_OUT("timeOut"),
    @XmlEnumValue("timecardID")
    TIMECARD_ID("timecardID"),
    @XmlEnumValue("workersCompensationRate")
    WORKERS_COMPENSATION_RATE("workersCompensationRate");
    private final String value;

    TimecardTimeApiProperty(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TimecardTimeApiProperty fromValue(String v) {
        for (TimecardTimeApiProperty c: TimecardTimeApiProperty.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
