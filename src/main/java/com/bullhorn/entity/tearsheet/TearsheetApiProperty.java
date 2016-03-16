
package com.bullhorn.entity.tearsheet;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tearsheetApiProperty.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="tearsheetApiProperty">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="tearsheetID"/>
 *     &lt;enumeration value="dateAdded"/>
 *     &lt;enumeration value="description"/>
 *     &lt;enumeration value="isDeleted"/>
 *     &lt;enumeration value="isPrivate"/>
 *     &lt;enumeration value="name"/>
 *     &lt;enumeration value="ownerID"/>
 *     &lt;enumeration value="password"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "tearsheetApiProperty")
@XmlEnum
public enum TearsheetApiProperty {

    @XmlEnumValue("tearsheetID")
    TEARSHEET_ID("tearsheetID"),
    @XmlEnumValue("dateAdded")
    DATE_ADDED("dateAdded"),
    @XmlEnumValue("description")
    DESCRIPTION("description"),
    @XmlEnumValue("isDeleted")
    IS_DELETED("isDeleted"),
    @XmlEnumValue("isPrivate")
    IS_PRIVATE("isPrivate"),
    @XmlEnumValue("name")
    NAME("name"),
    @XmlEnumValue("ownerID")
    OWNER_ID("ownerID"),
    @XmlEnumValue("password")
    PASSWORD("password");
    private final String value;

    TearsheetApiProperty(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TearsheetApiProperty fromValue(String v) {
        for (TearsheetApiProperty c: TearsheetApiProperty.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
