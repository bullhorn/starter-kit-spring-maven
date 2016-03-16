
package com.bullhorn.entity.job;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for workersCompensationApiProperty.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="workersCompensationApiProperty">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="workersCompensationID"/>
 *     &lt;enumeration value="code"/>
 *     &lt;enumeration value="description"/>
 *     &lt;enumeration value="name"/>
 *     &lt;enumeration value="state"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "workersCompensationApiProperty")
@XmlEnum
public enum WorkersCompensationApiProperty {

    @XmlEnumValue("workersCompensationID")
    WORKERS_COMPENSATION_ID("workersCompensationID"),
    @XmlEnumValue("code")
    CODE("code"),
    @XmlEnumValue("description")
    DESCRIPTION("description"),
    @XmlEnumValue("name")
    NAME("name"),
    @XmlEnumValue("state")
    STATE("state");
    private final String value;

    WorkersCompensationApiProperty(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static WorkersCompensationApiProperty fromValue(String v) {
        for (WorkersCompensationApiProperty c: WorkersCompensationApiProperty.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
