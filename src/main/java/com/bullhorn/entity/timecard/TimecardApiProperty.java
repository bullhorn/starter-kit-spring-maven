
package com.bullhorn.entity.timecard;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for timecardApiProperty.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="timecardApiProperty">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="timecardID"/>
 *     &lt;enumeration value="comments"/>
 *     &lt;enumeration value="dateAdded"/>
 *     &lt;enumeration value="dateBegin"/>
 *     &lt;enumeration value="dateEnd"/>
 *     &lt;enumeration value="externalID"/>
 *     &lt;enumeration value="invoiceID"/>
 *     &lt;enumeration value="migrateGUID"/>
 *     &lt;enumeration value="placementID"/>
 *     &lt;enumeration value="status"/>
 *     &lt;enumeration value="timecardBatchID"/>
 *     &lt;enumeration value="type"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "timecardApiProperty")
@XmlEnum
public enum TimecardApiProperty {

    @XmlEnumValue("timecardID")
    TIMECARD_ID("timecardID"),
    @XmlEnumValue("comments")
    COMMENTS("comments"),
    @XmlEnumValue("dateAdded")
    DATE_ADDED("dateAdded"),
    @XmlEnumValue("dateBegin")
    DATE_BEGIN("dateBegin"),
    @XmlEnumValue("dateEnd")
    DATE_END("dateEnd"),
    @XmlEnumValue("externalID")
    EXTERNAL_ID("externalID"),
    @XmlEnumValue("invoiceID")
    INVOICE_ID("invoiceID"),
    @XmlEnumValue("migrateGUID")
    MIGRATE_GUID("migrateGUID"),
    @XmlEnumValue("placementID")
    PLACEMENT_ID("placementID"),
    @XmlEnumValue("status")
    STATUS("status"),
    @XmlEnumValue("timecardBatchID")
    TIMECARD_BATCH_ID("timecardBatchID"),
    @XmlEnumValue("type")
    TYPE("type");
    private final String value;

    TimecardApiProperty(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TimecardApiProperty fromValue(String v) {
        for (TimecardApiProperty c: TimecardApiProperty.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
