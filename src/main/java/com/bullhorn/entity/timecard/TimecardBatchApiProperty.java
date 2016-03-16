
package com.bullhorn.entity.timecard;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for timecardBatchApiProperty.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="timecardBatchApiProperty">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="timecardBatchID"/>
 *     &lt;enumeration value="batchName"/>
 *     &lt;enumeration value="dateAdded"/>
 *     &lt;enumeration value="isDeleted"/>
 *     &lt;enumeration value="isInvoiced"/>
 *     &lt;enumeration value="isLocked"/>
 *     &lt;enumeration value="isOpen"/>
 *     &lt;enumeration value="ownerID"/>
 *     &lt;enumeration value="status"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "timecardBatchApiProperty")
@XmlEnum
public enum TimecardBatchApiProperty {

    @XmlEnumValue("timecardBatchID")
    TIMECARD_BATCH_ID("timecardBatchID"),
    @XmlEnumValue("batchName")
    BATCH_NAME("batchName"),
    @XmlEnumValue("dateAdded")
    DATE_ADDED("dateAdded"),
    @XmlEnumValue("isDeleted")
    IS_DELETED("isDeleted"),
    @XmlEnumValue("isInvoiced")
    IS_INVOICED("isInvoiced"),
    @XmlEnumValue("isLocked")
    IS_LOCKED("isLocked"),
    @XmlEnumValue("isOpen")
    IS_OPEN("isOpen"),
    @XmlEnumValue("ownerID")
    OWNER_ID("ownerID"),
    @XmlEnumValue("status")
    STATUS("status");
    private final String value;

    TimecardBatchApiProperty(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TimecardBatchApiProperty fromValue(String v) {
        for (TimecardBatchApiProperty c: TimecardBatchApiProperty.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
