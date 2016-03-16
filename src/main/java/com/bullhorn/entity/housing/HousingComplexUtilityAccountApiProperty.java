
package com.bullhorn.entity.housing;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for housingComplexUtilityAccountApiProperty.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="housingComplexUtilityAccountApiProperty">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="housingComplexUtilityAccountID"/>
 *     &lt;enumeration value="accountNumber"/>
 *     &lt;enumeration value="address"/>
 *     &lt;enumeration value="billingContactID"/>
 *     &lt;enumeration value="comments"/>
 *     &lt;enumeration value="customContactID1"/>
 *     &lt;enumeration value="customContactID2"/>
 *     &lt;enumeration value="customDate1"/>
 *     &lt;enumeration value="customDate2"/>
 *     &lt;enumeration value="customDate3"/>
 *     &lt;enumeration value="customFloat1"/>
 *     &lt;enumeration value="customFloat2"/>
 *     &lt;enumeration value="customFloat3"/>
 *     &lt;enumeration value="customInt1"/>
 *     &lt;enumeration value="customInt2"/>
 *     &lt;enumeration value="customInt3"/>
 *     &lt;enumeration value="customText1"/>
 *     &lt;enumeration value="customText2"/>
 *     &lt;enumeration value="customText3"/>
 *     &lt;enumeration value="customText4"/>
 *     &lt;enumeration value="customText5"/>
 *     &lt;enumeration value="customTextBlock1"/>
 *     &lt;enumeration value="customTextBlock2"/>
 *     &lt;enumeration value="customTextBlock3"/>
 *     &lt;enumeration value="customTextBlock4"/>
 *     &lt;enumeration value="customTextBlock5"/>
 *     &lt;enumeration value="dateAdded"/>
 *     &lt;enumeration value="dateConnected"/>
 *     &lt;enumeration value="dateDisconnected"/>
 *     &lt;enumeration value="deposit"/>
 *     &lt;enumeration value="fax"/>
 *     &lt;enumeration value="isDeleted"/>
 *     &lt;enumeration value="migrateGUID"/>
 *     &lt;enumeration value="name"/>
 *     &lt;enumeration value="phone"/>
 *     &lt;enumeration value="type"/>
 *     &lt;enumeration value="unitID"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "housingComplexUtilityAccountApiProperty")
@XmlEnum
public enum HousingComplexUtilityAccountApiProperty {

    @XmlEnumValue("housingComplexUtilityAccountID")
    HOUSING_COMPLEX_UTILITY_ACCOUNT_ID("housingComplexUtilityAccountID"),
    @XmlEnumValue("accountNumber")
    ACCOUNT_NUMBER("accountNumber"),
    @XmlEnumValue("address")
    ADDRESS("address"),
    @XmlEnumValue("billingContactID")
    BILLING_CONTACT_ID("billingContactID"),
    @XmlEnumValue("comments")
    COMMENTS("comments"),
    @XmlEnumValue("customContactID1")
    CUSTOM_CONTACT_ID_1("customContactID1"),
    @XmlEnumValue("customContactID2")
    CUSTOM_CONTACT_ID_2("customContactID2"),
    @XmlEnumValue("customDate1")
    CUSTOM_DATE_1("customDate1"),
    @XmlEnumValue("customDate2")
    CUSTOM_DATE_2("customDate2"),
    @XmlEnumValue("customDate3")
    CUSTOM_DATE_3("customDate3"),
    @XmlEnumValue("customFloat1")
    CUSTOM_FLOAT_1("customFloat1"),
    @XmlEnumValue("customFloat2")
    CUSTOM_FLOAT_2("customFloat2"),
    @XmlEnumValue("customFloat3")
    CUSTOM_FLOAT_3("customFloat3"),
    @XmlEnumValue("customInt1")
    CUSTOM_INT_1("customInt1"),
    @XmlEnumValue("customInt2")
    CUSTOM_INT_2("customInt2"),
    @XmlEnumValue("customInt3")
    CUSTOM_INT_3("customInt3"),
    @XmlEnumValue("customText1")
    CUSTOM_TEXT_1("customText1"),
    @XmlEnumValue("customText2")
    CUSTOM_TEXT_2("customText2"),
    @XmlEnumValue("customText3")
    CUSTOM_TEXT_3("customText3"),
    @XmlEnumValue("customText4")
    CUSTOM_TEXT_4("customText4"),
    @XmlEnumValue("customText5")
    CUSTOM_TEXT_5("customText5"),
    @XmlEnumValue("customTextBlock1")
    CUSTOM_TEXT_BLOCK_1("customTextBlock1"),
    @XmlEnumValue("customTextBlock2")
    CUSTOM_TEXT_BLOCK_2("customTextBlock2"),
    @XmlEnumValue("customTextBlock3")
    CUSTOM_TEXT_BLOCK_3("customTextBlock3"),
    @XmlEnumValue("customTextBlock4")
    CUSTOM_TEXT_BLOCK_4("customTextBlock4"),
    @XmlEnumValue("customTextBlock5")
    CUSTOM_TEXT_BLOCK_5("customTextBlock5"),
    @XmlEnumValue("dateAdded")
    DATE_ADDED("dateAdded"),
    @XmlEnumValue("dateConnected")
    DATE_CONNECTED("dateConnected"),
    @XmlEnumValue("dateDisconnected")
    DATE_DISCONNECTED("dateDisconnected"),
    @XmlEnumValue("deposit")
    DEPOSIT("deposit"),
    @XmlEnumValue("fax")
    FAX("fax"),
    @XmlEnumValue("isDeleted")
    IS_DELETED("isDeleted"),
    @XmlEnumValue("migrateGUID")
    MIGRATE_GUID("migrateGUID"),
    @XmlEnumValue("name")
    NAME("name"),
    @XmlEnumValue("phone")
    PHONE("phone"),
    @XmlEnumValue("type")
    TYPE("type"),
    @XmlEnumValue("unitID")
    UNIT_ID("unitID");
    private final String value;

    HousingComplexUtilityAccountApiProperty(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static HousingComplexUtilityAccountApiProperty fromValue(String v) {
        for (HousingComplexUtilityAccountApiProperty c: HousingComplexUtilityAccountApiProperty.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
