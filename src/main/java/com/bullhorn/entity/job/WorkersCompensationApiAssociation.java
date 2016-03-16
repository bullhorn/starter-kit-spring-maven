
package com.bullhorn.entity.job;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for workersCompensationApiAssociation.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="workersCompensationApiAssociation">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="rates"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "workersCompensationApiAssociation")
@XmlEnum
public enum WorkersCompensationApiAssociation {

    @XmlEnumValue("rates")
    RATES("rates");
    private final String value;

    WorkersCompensationApiAssociation(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static WorkersCompensationApiAssociation fromValue(String v) {
        for (WorkersCompensationApiAssociation c: WorkersCompensationApiAssociation.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
