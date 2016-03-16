
package com.bullhorn.entity.lists;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for categoryApiProperty.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="categoryApiProperty">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="categoryID"/>
 *     &lt;enumeration value="dateAdded"/>
 *     &lt;enumeration value="description"/>
 *     &lt;enumeration value="enabled"/>
 *     &lt;enumeration value="externalID"/>
 *     &lt;enumeration value="name"/>
 *     &lt;enumeration value="occupation"/>
 *     &lt;enumeration value="type"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "categoryApiProperty")
@XmlEnum
public enum CategoryApiProperty {

    @XmlEnumValue("categoryID")
    CATEGORY_ID("categoryID"),
    @XmlEnumValue("dateAdded")
    DATE_ADDED("dateAdded"),
    @XmlEnumValue("description")
    DESCRIPTION("description"),
    @XmlEnumValue("enabled")
    ENABLED("enabled"),
    @XmlEnumValue("externalID")
    EXTERNAL_ID("externalID"),
    @XmlEnumValue("name")
    NAME("name"),
    @XmlEnumValue("occupation")
    OCCUPATION("occupation"),
    @XmlEnumValue("type")
    TYPE("type");
    private final String value;

    CategoryApiProperty(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CategoryApiProperty fromValue(String v) {
        for (CategoryApiProperty c: CategoryApiProperty.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
