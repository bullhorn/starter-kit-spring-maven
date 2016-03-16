
package com.bullhorn.entity.housing;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for housingComplexUnitApiAssociation.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="housingComplexUnitApiAssociation">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="amenities"/>
 *     &lt;enumeration value="furnitureDeliveries"/>
 *     &lt;enumeration value="utilityAccounts"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "housingComplexUnitApiAssociation")
@XmlEnum
public enum HousingComplexUnitApiAssociation {

    @XmlEnumValue("amenities")
    AMENITIES("amenities"),
    @XmlEnumValue("furnitureDeliveries")
    FURNITURE_DELIVERIES("furnitureDeliveries"),
    @XmlEnumValue("utilityAccounts")
    UTILITY_ACCOUNTS("utilityAccounts");
    private final String value;

    HousingComplexUnitApiAssociation(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static HousingComplexUnitApiAssociation fromValue(String v) {
        for (HousingComplexUnitApiAssociation c: HousingComplexUnitApiAssociation.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
