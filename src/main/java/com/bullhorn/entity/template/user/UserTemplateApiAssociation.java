
package com.bullhorn.entity.template.user;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for userTemplateApiAssociation.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="userTemplateApiAssociation">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="templateAttributes"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "userTemplateApiAssociation")
@XmlEnum
public enum UserTemplateApiAssociation {

    @XmlEnumValue("templateAttributes")
    TEMPLATE_ATTRIBUTES("templateAttributes");
    private final String value;

    UserTemplateApiAssociation(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static UserTemplateApiAssociation fromValue(String v) {
        for (UserTemplateApiAssociation c: UserTemplateApiAssociation.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
