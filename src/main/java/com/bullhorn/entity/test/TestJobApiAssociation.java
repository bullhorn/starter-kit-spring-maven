
package com.bullhorn.entity.test;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for testJobApiAssociation.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="testJobApiAssociation">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="categories"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "testJobApiAssociation")
@XmlEnum
public enum TestJobApiAssociation {

    @XmlEnumValue("categories")
    CATEGORIES("categories");
    private final String value;

    TestJobApiAssociation(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TestJobApiAssociation fromValue(String v) {
        for (TestJobApiAssociation c: TestJobApiAssociation.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
