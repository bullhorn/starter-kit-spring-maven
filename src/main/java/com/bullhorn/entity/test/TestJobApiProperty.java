
package com.bullhorn.entity.test;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for testJobApiProperty.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="testJobApiProperty">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="jobID"/>
 *     &lt;enumeration value="address"/>
 *     &lt;enumeration value="isPublic"/>
 *     &lt;enumeration value="ownerID"/>
 *     &lt;enumeration value="title"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "testJobApiProperty")
@XmlEnum
public enum TestJobApiProperty {

    @XmlEnumValue("jobID")
    JOB_ID("jobID"),
    @XmlEnumValue("address")
    ADDRESS("address"),
    @XmlEnumValue("isPublic")
    IS_PUBLIC("isPublic"),
    @XmlEnumValue("ownerID")
    OWNER_ID("ownerID"),
    @XmlEnumValue("title")
    TITLE("title");
    private final String value;

    TestJobApiProperty(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TestJobApiProperty fromValue(String v) {
        for (TestJobApiProperty c: TestJobApiProperty.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
