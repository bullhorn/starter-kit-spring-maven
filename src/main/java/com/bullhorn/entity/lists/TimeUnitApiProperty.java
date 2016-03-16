
package com.bullhorn.entity.lists;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for timeUnitApiProperty.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="timeUnitApiProperty">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="timeUnitID"/>
 *     &lt;enumeration value="name"/>
 *     &lt;enumeration value="timeMarker"/>
 *     &lt;enumeration value="weekDay"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "timeUnitApiProperty")
@XmlEnum
public enum TimeUnitApiProperty {

    @XmlEnumValue("timeUnitID")
    TIME_UNIT_ID("timeUnitID"),
    @XmlEnumValue("name")
    NAME("name"),
    @XmlEnumValue("timeMarker")
    TIME_MARKER("timeMarker"),
    @XmlEnumValue("weekDay")
    WEEK_DAY("weekDay");
    private final String value;

    TimeUnitApiProperty(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TimeUnitApiProperty fromValue(String v) {
        for (TimeUnitApiProperty c: TimeUnitApiProperty.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
