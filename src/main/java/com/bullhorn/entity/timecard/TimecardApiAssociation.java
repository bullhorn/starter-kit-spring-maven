
package com.bullhorn.entity.timecard;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for timecardApiAssociation.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="timecardApiAssociation">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="expenses"/>
 *     &lt;enumeration value="timecardTimes"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "timecardApiAssociation")
@XmlEnum
public enum TimecardApiAssociation {

    @XmlEnumValue("expenses")
    EXPENSES("expenses"),
    @XmlEnumValue("timecardTimes")
    TIMECARD_TIMES("timecardTimes");
    private final String value;

    TimecardApiAssociation(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TimecardApiAssociation fromValue(String v) {
        for (TimecardApiAssociation c: TimecardApiAssociation.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
