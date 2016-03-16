
package com.bullhorn.entity.client;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for clientContactApiProperty.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="clientContactApiProperty">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="userID"/>
 *     &lt;enumeration value="categoryID"/>
 *     &lt;enumeration value="certifications"/>
 *     &lt;enumeration value="clientCorporationID"/>
 *     &lt;enumeration value="comments"/>
 *     &lt;enumeration value="customTextBlock1"/>
 *     &lt;enumeration value="customTextBlock2"/>
 *     &lt;enumeration value="customTextBlock3"/>
 *     &lt;enumeration value="customTextBlock4"/>
 *     &lt;enumeration value="customTextBlock5"/>
 *     &lt;enumeration value="dateAdded"/>
 *     &lt;enumeration value="dateLastVisit"/>
 *     &lt;enumeration value="deleteMe"/>
 *     &lt;enumeration value="description"/>
 *     &lt;enumeration value="desiredCategories"/>
 *     &lt;enumeration value="desiredSkills"/>
 *     &lt;enumeration value="desiredSpecialties"/>
 *     &lt;enumeration value="division"/>
 *     &lt;enumeration value="externalID"/>
 *     &lt;enumeration value="isDeleted"/>
 *     &lt;enumeration value="linkedPersonID"/>
 *     &lt;enumeration value="migrateGUID"/>
 *     &lt;enumeration value="numEmployees"/>
 *     &lt;enumeration value="office"/>
 *     &lt;enumeration value="ownerID"/>
 *     &lt;enumeration value="password"/>
 *     &lt;enumeration value="preferredContact"/>
 *     &lt;enumeration value="referredByPersonID"/>
 *     &lt;enumeration value="reportToPersonID"/>
 *     &lt;enumeration value="secondaryAddress"/>
 *     &lt;enumeration value="source"/>
 *     &lt;enumeration value="status"/>
 *     &lt;enumeration value="type"/>
 *     &lt;enumeration value="address"/>
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
 *     &lt;enumeration value="customText10"/>
 *     &lt;enumeration value="customText11"/>
 *     &lt;enumeration value="customText12"/>
 *     &lt;enumeration value="customText13"/>
 *     &lt;enumeration value="customText14"/>
 *     &lt;enumeration value="customText15"/>
 *     &lt;enumeration value="customText16"/>
 *     &lt;enumeration value="customText17"/>
 *     &lt;enumeration value="customText18"/>
 *     &lt;enumeration value="customText19"/>
 *     &lt;enumeration value="customText2"/>
 *     &lt;enumeration value="customText20"/>
 *     &lt;enumeration value="customText3"/>
 *     &lt;enumeration value="customText4"/>
 *     &lt;enumeration value="customText5"/>
 *     &lt;enumeration value="customText6"/>
 *     &lt;enumeration value="customText7"/>
 *     &lt;enumeration value="customText8"/>
 *     &lt;enumeration value="customText9"/>
 *     &lt;enumeration value="dateLastComment"/>
 *     &lt;enumeration value="email"/>
 *     &lt;enumeration value="email2"/>
 *     &lt;enumeration value="email3"/>
 *     &lt;enumeration value="fax"/>
 *     &lt;enumeration value="fax2"/>
 *     &lt;enumeration value="fax3"/>
 *     &lt;enumeration value="firstName"/>
 *     &lt;enumeration value="isDayLightSavings"/>
 *     &lt;enumeration value="isLockedOut"/>
 *     &lt;enumeration value="lastName"/>
 *     &lt;enumeration value="massMailOptOut"/>
 *     &lt;enumeration value="middleName"/>
 *     &lt;enumeration value="mobile"/>
 *     &lt;enumeration value="name"/>
 *     &lt;enumeration value="namePrefix"/>
 *     &lt;enumeration value="nameSuffix"/>
 *     &lt;enumeration value="nickName"/>
 *     &lt;enumeration value="occupation"/>
 *     &lt;enumeration value="pager"/>
 *     &lt;enumeration value="phone"/>
 *     &lt;enumeration value="phone2"/>
 *     &lt;enumeration value="phone3"/>
 *     &lt;enumeration value="smsOptIn"/>
 *     &lt;enumeration value="timeZoneOffsetEST"/>
 *     &lt;enumeration value="userTypeID"/>
 *     &lt;enumeration value="username"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "clientContactApiProperty")
@XmlEnum
public enum ClientContactApiProperty {

    @XmlEnumValue("userID")
    USER_ID("userID"),
    @XmlEnumValue("categoryID")
    CATEGORY_ID("categoryID"),
    @XmlEnumValue("certifications")
    CERTIFICATIONS("certifications"),
    @XmlEnumValue("clientCorporationID")
    CLIENT_CORPORATION_ID("clientCorporationID"),
    @XmlEnumValue("comments")
    COMMENTS("comments"),
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
    @XmlEnumValue("dateLastVisit")
    DATE_LAST_VISIT("dateLastVisit"),
    @XmlEnumValue("deleteMe")
    DELETE_ME("deleteMe"),
    @XmlEnumValue("description")
    DESCRIPTION("description"),
    @XmlEnumValue("desiredCategories")
    DESIRED_CATEGORIES("desiredCategories"),
    @XmlEnumValue("desiredSkills")
    DESIRED_SKILLS("desiredSkills"),
    @XmlEnumValue("desiredSpecialties")
    DESIRED_SPECIALTIES("desiredSpecialties"),
    @XmlEnumValue("division")
    DIVISION("division"),
    @XmlEnumValue("externalID")
    EXTERNAL_ID("externalID"),
    @XmlEnumValue("isDeleted")
    IS_DELETED("isDeleted"),
    @XmlEnumValue("linkedPersonID")
    LINKED_PERSON_ID("linkedPersonID"),
    @XmlEnumValue("migrateGUID")
    MIGRATE_GUID("migrateGUID"),
    @XmlEnumValue("numEmployees")
    NUM_EMPLOYEES("numEmployees"),
    @XmlEnumValue("office")
    OFFICE("office"),
    @XmlEnumValue("ownerID")
    OWNER_ID("ownerID"),
    @XmlEnumValue("password")
    PASSWORD("password"),
    @XmlEnumValue("preferredContact")
    PREFERRED_CONTACT("preferredContact"),
    @XmlEnumValue("referredByPersonID")
    REFERRED_BY_PERSON_ID("referredByPersonID"),
    @XmlEnumValue("reportToPersonID")
    REPORT_TO_PERSON_ID("reportToPersonID"),
    @XmlEnumValue("secondaryAddress")
    SECONDARY_ADDRESS("secondaryAddress"),
    @XmlEnumValue("source")
    SOURCE("source"),
    @XmlEnumValue("status")
    STATUS("status"),
    @XmlEnumValue("type")
    TYPE("type"),
    @XmlEnumValue("address")
    ADDRESS("address"),
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
    @XmlEnumValue("customText10")
    CUSTOM_TEXT_10("customText10"),
    @XmlEnumValue("customText11")
    CUSTOM_TEXT_11("customText11"),
    @XmlEnumValue("customText12")
    CUSTOM_TEXT_12("customText12"),
    @XmlEnumValue("customText13")
    CUSTOM_TEXT_13("customText13"),
    @XmlEnumValue("customText14")
    CUSTOM_TEXT_14("customText14"),
    @XmlEnumValue("customText15")
    CUSTOM_TEXT_15("customText15"),
    @XmlEnumValue("customText16")
    CUSTOM_TEXT_16("customText16"),
    @XmlEnumValue("customText17")
    CUSTOM_TEXT_17("customText17"),
    @XmlEnumValue("customText18")
    CUSTOM_TEXT_18("customText18"),
    @XmlEnumValue("customText19")
    CUSTOM_TEXT_19("customText19"),
    @XmlEnumValue("customText2")
    CUSTOM_TEXT_2("customText2"),
    @XmlEnumValue("customText20")
    CUSTOM_TEXT_20("customText20"),
    @XmlEnumValue("customText3")
    CUSTOM_TEXT_3("customText3"),
    @XmlEnumValue("customText4")
    CUSTOM_TEXT_4("customText4"),
    @XmlEnumValue("customText5")
    CUSTOM_TEXT_5("customText5"),
    @XmlEnumValue("customText6")
    CUSTOM_TEXT_6("customText6"),
    @XmlEnumValue("customText7")
    CUSTOM_TEXT_7("customText7"),
    @XmlEnumValue("customText8")
    CUSTOM_TEXT_8("customText8"),
    @XmlEnumValue("customText9")
    CUSTOM_TEXT_9("customText9"),
    @XmlEnumValue("dateLastComment")
    DATE_LAST_COMMENT("dateLastComment"),
    @XmlEnumValue("email")
    EMAIL("email"),
    @XmlEnumValue("email2")
    EMAIL_2("email2"),
    @XmlEnumValue("email3")
    EMAIL_3("email3"),
    @XmlEnumValue("fax")
    FAX("fax"),
    @XmlEnumValue("fax2")
    FAX_2("fax2"),
    @XmlEnumValue("fax3")
    FAX_3("fax3"),
    @XmlEnumValue("firstName")
    FIRST_NAME("firstName"),
    @XmlEnumValue("isDayLightSavings")
    IS_DAY_LIGHT_SAVINGS("isDayLightSavings"),
    @XmlEnumValue("isLockedOut")
    IS_LOCKED_OUT("isLockedOut"),
    @XmlEnumValue("lastName")
    LAST_NAME("lastName"),
    @XmlEnumValue("massMailOptOut")
    MASS_MAIL_OPT_OUT("massMailOptOut"),
    @XmlEnumValue("middleName")
    MIDDLE_NAME("middleName"),
    @XmlEnumValue("mobile")
    MOBILE("mobile"),
    @XmlEnumValue("name")
    NAME("name"),
    @XmlEnumValue("namePrefix")
    NAME_PREFIX("namePrefix"),
    @XmlEnumValue("nameSuffix")
    NAME_SUFFIX("nameSuffix"),
    @XmlEnumValue("nickName")
    NICK_NAME("nickName"),
    @XmlEnumValue("occupation")
    OCCUPATION("occupation"),
    @XmlEnumValue("pager")
    PAGER("pager"),
    @XmlEnumValue("phone")
    PHONE("phone"),
    @XmlEnumValue("phone2")
    PHONE_2("phone2"),
    @XmlEnumValue("phone3")
    PHONE_3("phone3"),
    @XmlEnumValue("smsOptIn")
    SMS_OPT_IN("smsOptIn"),
    @XmlEnumValue("timeZoneOffsetEST")
    TIME_ZONE_OFFSET_EST("timeZoneOffsetEST"),
    @XmlEnumValue("userTypeID")
    USER_TYPE_ID("userTypeID"),
    @XmlEnumValue("username")
    USERNAME("username");
    private final String value;

    ClientContactApiProperty(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ClientContactApiProperty fromValue(String v) {
        for (ClientContactApiProperty c: ClientContactApiProperty.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
