
package com.bullhorn.entity.job;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for placementChangeRequestApiAssociation.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="placementChangeRequestApiAssociation">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="housingAmenities"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "placementChangeRequestApiAssociation")
@XmlEnum
public enum PlacementChangeRequestApiAssociation {

    @XmlEnumValue("housingAmenities")
    HOUSING_AMENITIES("housingAmenities");
    private final String value;

    PlacementChangeRequestApiAssociation(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PlacementChangeRequestApiAssociation fromValue(String v) {
        for (PlacementChangeRequestApiAssociation c: PlacementChangeRequestApiAssociation.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
