
package com.bullhorn.entity.privatelabel;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for privateLabelApiAssociation.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="privateLabelApiAssociation">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="businessSectors"/>
 *     &lt;enumeration value="certifications"/>
 *     &lt;enumeration value="childPrivateLabels"/>
 *     &lt;enumeration value="corporateUsers"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "privateLabelApiAssociation")
@XmlEnum
public enum PrivateLabelApiAssociation {

    @XmlEnumValue("businessSectors")
    BUSINESS_SECTORS("businessSectors"),
    @XmlEnumValue("certifications")
    CERTIFICATIONS("certifications"),
    @XmlEnumValue("childPrivateLabels")
    CHILD_PRIVATE_LABELS("childPrivateLabels"),
    @XmlEnumValue("corporateUsers")
    CORPORATE_USERS("corporateUsers");
    private final String value;

    PrivateLabelApiAssociation(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PrivateLabelApiAssociation fromValue(String v) {
        for (PrivateLabelApiAssociation c: PrivateLabelApiAssociation.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
