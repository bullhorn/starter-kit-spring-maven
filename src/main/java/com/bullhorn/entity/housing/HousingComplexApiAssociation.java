
package com.bullhorn.entity.housing;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for housingComplexApiAssociation.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="housingComplexApiAssociation">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="amenities"/>
 *     &lt;enumeration value="units"/>
 *     &lt;enumeration value="whitelistClientCorporations"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "housingComplexApiAssociation")
@XmlEnum
public enum HousingComplexApiAssociation {

    @XmlEnumValue("amenities")
    AMENITIES("amenities"),
    @XmlEnumValue("units")
    UNITS("units"),
    @XmlEnumValue("whitelistClientCorporations")
    WHITELIST_CLIENT_CORPORATIONS("whitelistClientCorporations");
    private final String value;

    HousingComplexApiAssociation(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static HousingComplexApiAssociation fromValue(String v) {
        for (HousingComplexApiAssociation c: HousingComplexApiAssociation.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
