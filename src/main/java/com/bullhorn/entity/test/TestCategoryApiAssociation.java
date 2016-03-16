
package com.bullhorn.entity.test;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for testCategoryApiAssociation.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="testCategoryApiAssociation">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="jobs"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "testCategoryApiAssociation")
@XmlEnum
public enum TestCategoryApiAssociation {

    @XmlEnumValue("jobs")
    JOBS("jobs");
    private final String value;

    TestCategoryApiAssociation(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TestCategoryApiAssociation fromValue(String v) {
        for (TestCategoryApiAssociation c: TestCategoryApiAssociation.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
