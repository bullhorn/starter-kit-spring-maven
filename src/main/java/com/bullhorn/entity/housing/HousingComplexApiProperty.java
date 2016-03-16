
package com.bullhorn.entity.housing;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for housingComplexApiProperty.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="housingComplexApiProperty">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="housingComplexID"/>
 *     &lt;enumeration value="address"/>
 *     &lt;enumeration value="billingContactID"/>
 *     &lt;enumeration value="comments"/>
 *     &lt;enumeration value="complexManagerID"/>
 *     &lt;enumeration value="complexOwnerID"/>
 *     &lt;enumeration value="contactName"/>
 *     &lt;enumeration value="customContactID1"/>
 *     &lt;enumeration value="customContactID2"/>
 *     &lt;enumeration value="customContactID3"/>
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
 *     &lt;enumeration value="fax"/>
 *     &lt;enumeration value="isDeleted"/>
 *     &lt;enumeration value="migrateGUID"/>
 *     &lt;enumeration value="name"/>
 *     &lt;enumeration value="ownerID"/>
 *     &lt;enumeration value="phone"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "housingComplexApiProperty")
@XmlEnum
public enum HousingComplexApiProperty {

    @XmlEnumValue("housingComplexID")
    HOUSING_COMPLEX_ID("housingComplexID"),
    @XmlEnumValue("address")
    ADDRESS("address"),
    @XmlEnumValue("billingContactID")
    BILLING_CONTACT_ID("billingContactID"),
    @XmlEnumValue("comments")
    COMMENTS("comments"),
    @XmlEnumValue("complexManagerID")
    COMPLEX_MANAGER_ID("complexManagerID"),
    @XmlEnumValue("complexOwnerID")
    COMPLEX_OWNER_ID("complexOwnerID"),
    @XmlEnumValue("contactName")
    CONTACT_NAME("contactName"),
    @XmlEnumValue("customContactID1")
    CUSTOM_CONTACT_ID_1("customContactID1"),
    @XmlEnumValue("customContactID2")
    CUSTOM_CONTACT_ID_2("customContactID2"),
    @XmlEnumValue("customContactID3")
    CUSTOM_CONTACT_ID_3("customContactID3"),
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
    @XmlEnumValue("fax")
    FAX("fax"),
    @XmlEnumValue("isDeleted")
    IS_DELETED("isDeleted"),
    @XmlEnumValue("migrateGUID")
    MIGRATE_GUID("migrateGUID"),
    @XmlEnumValue("name")
    NAME("name"),
    @XmlEnumValue("ownerID")
    OWNER_ID("ownerID"),
    @XmlEnumValue("phone")
    PHONE("phone");
    private final String value;

    HousingComplexApiProperty(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static HousingComplexApiProperty fromValue(String v) {
        for (HousingComplexApiProperty c: HousingComplexApiProperty.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
