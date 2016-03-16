
package com.bullhorn.entity.cert;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for certificationApiAssociation.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="certificationApiAssociation">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="privateLabels"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "certificationApiAssociation")
@XmlEnum
public enum CertificationApiAssociation {

    @XmlEnumValue("privateLabels")
    PRIVATE_LABELS("privateLabels");
    private final String value;

    CertificationApiAssociation(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CertificationApiAssociation fromValue(String v) {
        for (CertificationApiAssociation c: CertificationApiAssociation.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
