
package com.bullhorn.entity.lists;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for categoryApiAssociation.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="categoryApiAssociation">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="privateLabels"/>
 *     &lt;enumeration value="skills"/>
 *     &lt;enumeration value="specialties"/>
 *     &lt;enumeration value="userTemplates"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "categoryApiAssociation")
@XmlEnum
public enum CategoryApiAssociation {

    @XmlEnumValue("privateLabels")
    PRIVATE_LABELS("privateLabels"),
    @XmlEnumValue("skills")
    SKILLS("skills"),
    @XmlEnumValue("specialties")
    SPECIALTIES("specialties"),
    @XmlEnumValue("userTemplates")
    USER_TEMPLATES("userTemplates");
    private final String value;

    CategoryApiAssociation(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CategoryApiAssociation fromValue(String v) {
        for (CategoryApiAssociation c: CategoryApiAssociation.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
