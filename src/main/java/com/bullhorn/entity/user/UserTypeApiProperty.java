
package com.bullhorn.entity.user;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for userTypeApiProperty.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="userTypeApiProperty">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="userTypeID"/>
 *     &lt;enumeration value="dateAdded"/>
 *     &lt;enumeration value="description"/>
 *     &lt;enumeration value="enabled"/>
 *     &lt;enumeration value="isHidden"/>
 *     &lt;enumeration value="name"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "userTypeApiProperty")
@XmlEnum
public enum UserTypeApiProperty {

    @XmlEnumValue("userTypeID")
    USER_TYPE_ID("userTypeID"),
    @XmlEnumValue("dateAdded")
    DATE_ADDED("dateAdded"),
    @XmlEnumValue("description")
    DESCRIPTION("description"),
    @XmlEnumValue("enabled")
    ENABLED("enabled"),
    @XmlEnumValue("isHidden")
    IS_HIDDEN("isHidden"),
    @XmlEnumValue("name")
    NAME("name");
    private final String value;

    UserTypeApiProperty(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static UserTypeApiProperty fromValue(String v) {
        for (UserTypeApiProperty c: UserTypeApiProperty.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
