
package com.bullhorn.entity.lists;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for specialtyApiProperty.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="specialtyApiProperty">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="specialtyID"/>
 *     &lt;enumeration value="dateAdded"/>
 *     &lt;enumeration value="enabled"/>
 *     &lt;enumeration value="name"/>
 *     &lt;enumeration value="parentCategoryID"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "specialtyApiProperty")
@XmlEnum
public enum SpecialtyApiProperty {

    @XmlEnumValue("specialtyID")
    SPECIALTY_ID("specialtyID"),
    @XmlEnumValue("dateAdded")
    DATE_ADDED("dateAdded"),
    @XmlEnumValue("enabled")
    ENABLED("enabled"),
    @XmlEnumValue("name")
    NAME("name"),
    @XmlEnumValue("parentCategoryID")
    PARENT_CATEGORY_ID("parentCategoryID");
    private final String value;

    SpecialtyApiProperty(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SpecialtyApiProperty fromValue(String v) {
        for (SpecialtyApiProperty c: SpecialtyApiProperty.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
