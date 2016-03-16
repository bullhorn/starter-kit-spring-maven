
package com.bullhorn.entity.lists;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for skillApiProperty.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="skillApiProperty">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="skillID"/>
 *     &lt;enumeration value="enabled"/>
 *     &lt;enumeration value="name"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "skillApiProperty")
@XmlEnum
public enum SkillApiProperty {

    @XmlEnumValue("skillID")
    SKILL_ID("skillID"),
    @XmlEnumValue("enabled")
    ENABLED("enabled"),
    @XmlEnumValue("name")
    NAME("name");
    private final String value;

    SkillApiProperty(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SkillApiProperty fromValue(String v) {
        for (SkillApiProperty c: SkillApiProperty.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
