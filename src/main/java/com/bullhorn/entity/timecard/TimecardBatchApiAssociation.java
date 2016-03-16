
package com.bullhorn.entity.timecard;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for timecardBatchApiAssociation.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="timecardBatchApiAssociation">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="invoices"/>
 *     &lt;enumeration value="timecards"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "timecardBatchApiAssociation")
@XmlEnum
public enum TimecardBatchApiAssociation {

    @XmlEnumValue("invoices")
    INVOICES("invoices"),
    @XmlEnumValue("timecards")
    TIMECARDS("timecards");
    private final String value;

    TimecardBatchApiAssociation(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TimecardBatchApiAssociation fromValue(String v) {
        for (TimecardBatchApiAssociation c: TimecardBatchApiAssociation.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
