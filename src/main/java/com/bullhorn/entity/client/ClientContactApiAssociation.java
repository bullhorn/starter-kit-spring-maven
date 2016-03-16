
package com.bullhorn.entity.client;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for clientContactApiAssociation.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="clientContactApiAssociation">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="businessSectors"/>
 *     &lt;enumeration value="categories"/>
 *     &lt;enumeration value="secondaryOwners"/>
 *     &lt;enumeration value="skills"/>
 *     &lt;enumeration value="specialties"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "clientContactApiAssociation")
@XmlEnum
public enum ClientContactApiAssociation {

    @XmlEnumValue("businessSectors")
    BUSINESS_SECTORS("businessSectors"),
    @XmlEnumValue("categories")
    CATEGORIES("categories"),
    @XmlEnumValue("secondaryOwners")
    SECONDARY_OWNERS("secondaryOwners"),
    @XmlEnumValue("skills")
    SKILLS("skills"),
    @XmlEnumValue("specialties")
    SPECIALTIES("specialties");
    private final String value;

    ClientContactApiAssociation(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ClientContactApiAssociation fromValue(String v) {
        for (ClientContactApiAssociation c: ClientContactApiAssociation.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
