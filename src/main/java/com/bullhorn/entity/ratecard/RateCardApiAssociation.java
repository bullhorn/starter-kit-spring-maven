
package com.bullhorn.entity.ratecard;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for rateCardApiAssociation.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="rateCardApiAssociation">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="clientCorporations"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "rateCardApiAssociation")
@XmlEnum
public enum RateCardApiAssociation {

    @XmlEnumValue("clientCorporations")
    CLIENT_CORPORATIONS("clientCorporations");
    private final String value;

    RateCardApiAssociation(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RateCardApiAssociation fromValue(String v) {
        for (RateCardApiAssociation c: RateCardApiAssociation.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
