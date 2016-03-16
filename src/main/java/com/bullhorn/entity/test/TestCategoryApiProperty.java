
package com.bullhorn.entity.test;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for testCategoryApiProperty.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="testCategoryApiProperty">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="categoryID"/>
 *     &lt;enumeration value="name"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "testCategoryApiProperty")
@XmlEnum
public enum TestCategoryApiProperty {

    @XmlEnumValue("categoryID")
    CATEGORY_ID("categoryID"),
    @XmlEnumValue("name")
    NAME("name");
    private final String value;

    TestCategoryApiProperty(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TestCategoryApiProperty fromValue(String v) {
        for (TestCategoryApiProperty c: TestCategoryApiProperty.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
