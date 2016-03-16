
package com.bullhorn.entity.ratecard;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for rateCardApiProperty.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="rateCardApiProperty">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="rateCardID"/>
 *     &lt;enumeration value="businessSector"/>
 *     &lt;enumeration value="categoryID"/>
 *     &lt;enumeration value="corporationID"/>
 *     &lt;enumeration value="customRate1"/>
 *     &lt;enumeration value="customRate10"/>
 *     &lt;enumeration value="customRate2"/>
 *     &lt;enumeration value="customRate3"/>
 *     &lt;enumeration value="customRate4"/>
 *     &lt;enumeration value="customRate5"/>
 *     &lt;enumeration value="customRate6"/>
 *     &lt;enumeration value="customRate7"/>
 *     &lt;enumeration value="customRate8"/>
 *     &lt;enumeration value="customRate9"/>
 *     &lt;enumeration value="dateEffective"/>
 *     &lt;enumeration value="dateLastModified"/>
 *     &lt;enumeration value="isDefault"/>
 *     &lt;enumeration value="isDeleted"/>
 *     &lt;enumeration value="lastModifyingUserID"/>
 *     &lt;enumeration value="migrateGUID"/>
 *     &lt;enumeration value="name"/>
 *     &lt;enumeration value="overtimeRate"/>
 *     &lt;enumeration value="rate"/>
 *     &lt;enumeration value="rateCardCategory"/>
 *     &lt;enumeration value="shiftID"/>
 *     &lt;enumeration value="shortName"/>
 *     &lt;enumeration value="skillID"/>
 *     &lt;enumeration value="type"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "rateCardApiProperty")
@XmlEnum
public enum RateCardApiProperty {

    @XmlEnumValue("rateCardID")
    RATE_CARD_ID("rateCardID"),
    @XmlEnumValue("businessSector")
    BUSINESS_SECTOR("businessSector"),
    @XmlEnumValue("categoryID")
    CATEGORY_ID("categoryID"),
    @XmlEnumValue("corporationID")
    CORPORATION_ID("corporationID"),
    @XmlEnumValue("customRate1")
    CUSTOM_RATE_1("customRate1"),
    @XmlEnumValue("customRate10")
    CUSTOM_RATE_10("customRate10"),
    @XmlEnumValue("customRate2")
    CUSTOM_RATE_2("customRate2"),
    @XmlEnumValue("customRate3")
    CUSTOM_RATE_3("customRate3"),
    @XmlEnumValue("customRate4")
    CUSTOM_RATE_4("customRate4"),
    @XmlEnumValue("customRate5")
    CUSTOM_RATE_5("customRate5"),
    @XmlEnumValue("customRate6")
    CUSTOM_RATE_6("customRate6"),
    @XmlEnumValue("customRate7")
    CUSTOM_RATE_7("customRate7"),
    @XmlEnumValue("customRate8")
    CUSTOM_RATE_8("customRate8"),
    @XmlEnumValue("customRate9")
    CUSTOM_RATE_9("customRate9"),
    @XmlEnumValue("dateEffective")
    DATE_EFFECTIVE("dateEffective"),
    @XmlEnumValue("dateLastModified")
    DATE_LAST_MODIFIED("dateLastModified"),
    @XmlEnumValue("isDefault")
    IS_DEFAULT("isDefault"),
    @XmlEnumValue("isDeleted")
    IS_DELETED("isDeleted"),
    @XmlEnumValue("lastModifyingUserID")
    LAST_MODIFYING_USER_ID("lastModifyingUserID"),
    @XmlEnumValue("migrateGUID")
    MIGRATE_GUID("migrateGUID"),
    @XmlEnumValue("name")
    NAME("name"),
    @XmlEnumValue("overtimeRate")
    OVERTIME_RATE("overtimeRate"),
    @XmlEnumValue("rate")
    RATE("rate"),
    @XmlEnumValue("rateCardCategory")
    RATE_CARD_CATEGORY("rateCardCategory"),
    @XmlEnumValue("shiftID")
    SHIFT_ID("shiftID"),
    @XmlEnumValue("shortName")
    SHORT_NAME("shortName"),
    @XmlEnumValue("skillID")
    SKILL_ID("skillID"),
    @XmlEnumValue("type")
    TYPE("type");
    private final String value;

    RateCardApiProperty(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RateCardApiProperty fromValue(String v) {
        for (RateCardApiProperty c: RateCardApiProperty.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
