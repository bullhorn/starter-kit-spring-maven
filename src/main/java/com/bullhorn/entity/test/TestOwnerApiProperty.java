
package com.bullhorn.entity.test;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for testOwnerApiProperty.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="testOwnerApiProperty">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ownerID"/>
 *     &lt;enumeration value="corporationID"/>
 *     &lt;enumeration value="name"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "testOwnerApiProperty")
@XmlEnum
public enum TestOwnerApiProperty {

    @XmlEnumValue("ownerID")
    OWNER_ID("ownerID"),
    @XmlEnumValue("corporationID")
    CORPORATION_ID("corporationID"),
    @XmlEnumValue("name")
    NAME("name");
    private final String value;

    TestOwnerApiProperty(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TestOwnerApiProperty fromValue(String v) {
        for (TestOwnerApiProperty c: TestOwnerApiProperty.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
