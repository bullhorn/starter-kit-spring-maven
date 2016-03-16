
package com.bullhorn.entity.housing;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for housingComplexAmenityApiAssociation.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="housingComplexAmenityApiAssociation">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="housingComplexUnits"/>
 *     &lt;enumeration value="housingComplexes"/>
 *     &lt;enumeration value="placementChangeRequests"/>
 *     &lt;enumeration value="placements"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "housingComplexAmenityApiAssociation")
@XmlEnum
public enum HousingComplexAmenityApiAssociation {

    @XmlEnumValue("housingComplexUnits")
    HOUSING_COMPLEX_UNITS("housingComplexUnits"),
    @XmlEnumValue("housingComplexes")
    HOUSING_COMPLEXES("housingComplexes"),
    @XmlEnumValue("placementChangeRequests")
    PLACEMENT_CHANGE_REQUESTS("placementChangeRequests"),
    @XmlEnumValue("placements")
    PLACEMENTS("placements");
    private final String value;

    HousingComplexAmenityApiAssociation(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static HousingComplexAmenityApiAssociation fromValue(String v) {
        for (HousingComplexAmenityApiAssociation c: HousingComplexAmenityApiAssociation.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
