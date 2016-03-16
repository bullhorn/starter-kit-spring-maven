
package com.bullhorn.entity.housing;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for housingComplexAmenityApiProperty.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="housingComplexAmenityApiProperty">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="housingComplexAmenityID"/>
 *     &lt;enumeration value="amenityName"/>
 *     &lt;enumeration value="corporationID"/>
 *     &lt;enumeration value="dateAdded"/>
 *     &lt;enumeration value="isDeleted"/>
 *     &lt;enumeration value="migrateGUID"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "housingComplexAmenityApiProperty")
@XmlEnum
public enum HousingComplexAmenityApiProperty {

    @XmlEnumValue("housingComplexAmenityID")
    HOUSING_COMPLEX_AMENITY_ID("housingComplexAmenityID"),
    @XmlEnumValue("amenityName")
    AMENITY_NAME("amenityName"),
    @XmlEnumValue("corporationID")
    CORPORATION_ID("corporationID"),
    @XmlEnumValue("dateAdded")
    DATE_ADDED("dateAdded"),
    @XmlEnumValue("isDeleted")
    IS_DELETED("isDeleted"),
    @XmlEnumValue("migrateGUID")
    MIGRATE_GUID("migrateGUID");
    private final String value;

    HousingComplexAmenityApiProperty(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static HousingComplexAmenityApiProperty fromValue(String v) {
        for (HousingComplexAmenityApiProperty c: HousingComplexAmenityApiProperty.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
