
package com.bullhorn.entity.job;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for placementCommissionApiProperty.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="placementCommissionApiProperty">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="commissionID"/>
 *     &lt;enumeration value="comments"/>
 *     &lt;enumeration value="commissionPercentage"/>
 *     &lt;enumeration value="dateAdded"/>
 *     &lt;enumeration value="externalRecipient"/>
 *     &lt;enumeration value="flatPayout"/>
 *     &lt;enumeration value="grossMarginPercentage"/>
 *     &lt;enumeration value="hourlyPayout"/>
 *     &lt;enumeration value="migrateGUID"/>
 *     &lt;enumeration value="placementID"/>
 *     &lt;enumeration value="role"/>
 *     &lt;enumeration value="status"/>
 *     &lt;enumeration value="userID"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "placementCommissionApiProperty")
@XmlEnum
public enum PlacementCommissionApiProperty {

    @XmlEnumValue("commissionID")
    COMMISSION_ID("commissionID"),
    @XmlEnumValue("comments")
    COMMENTS("comments"),
    @XmlEnumValue("commissionPercentage")
    COMMISSION_PERCENTAGE("commissionPercentage"),
    @XmlEnumValue("dateAdded")
    DATE_ADDED("dateAdded"),
    @XmlEnumValue("externalRecipient")
    EXTERNAL_RECIPIENT("externalRecipient"),
    @XmlEnumValue("flatPayout")
    FLAT_PAYOUT("flatPayout"),
    @XmlEnumValue("grossMarginPercentage")
    GROSS_MARGIN_PERCENTAGE("grossMarginPercentage"),
    @XmlEnumValue("hourlyPayout")
    HOURLY_PAYOUT("hourlyPayout"),
    @XmlEnumValue("migrateGUID")
    MIGRATE_GUID("migrateGUID"),
    @XmlEnumValue("placementID")
    PLACEMENT_ID("placementID"),
    @XmlEnumValue("role")
    ROLE("role"),
    @XmlEnumValue("status")
    STATUS("status"),
    @XmlEnumValue("userID")
    USER_ID("userID");
    private final String value;

    PlacementCommissionApiProperty(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PlacementCommissionApiProperty fromValue(String v) {
        for (PlacementCommissionApiProperty c: PlacementCommissionApiProperty.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
