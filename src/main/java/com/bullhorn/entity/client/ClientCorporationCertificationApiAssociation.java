
package com.bullhorn.entity.client;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for clientCorporationCertificationApiAssociation.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="clientCorporationCertificationApiAssociation">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="alternateCertifications"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "clientCorporationCertificationApiAssociation")
@XmlEnum
public enum ClientCorporationCertificationApiAssociation {

    @XmlEnumValue("alternateCertifications")
    ALTERNATE_CERTIFICATIONS("alternateCertifications");
    private final String value;

    ClientCorporationCertificationApiAssociation(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ClientCorporationCertificationApiAssociation fromValue(String v) {
        for (ClientCorporationCertificationApiAssociation c: ClientCorporationCertificationApiAssociation.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
