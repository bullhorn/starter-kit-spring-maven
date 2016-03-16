
package com.bullhorn.entity.test;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for testOwnerApiAssociation.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="testOwnerApiAssociation">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="jobs"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "testOwnerApiAssociation")
@XmlEnum
public enum TestOwnerApiAssociation {

    @XmlEnumValue("jobs")
    JOBS("jobs");
    private final String value;

    TestOwnerApiAssociation(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TestOwnerApiAssociation fromValue(String v) {
        for (TestOwnerApiAssociation c: TestOwnerApiAssociation.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
