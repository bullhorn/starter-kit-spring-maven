
package com.bullhorn.entity.lists;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for skillApiAssociation.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="skillApiAssociation">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="categories"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "skillApiAssociation")
@XmlEnum
public enum SkillApiAssociation {

    @XmlEnumValue("categories")
    CATEGORIES("categories");
    private final String value;

    SkillApiAssociation(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SkillApiAssociation fromValue(String v) {
        for (SkillApiAssociation c: SkillApiAssociation.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
