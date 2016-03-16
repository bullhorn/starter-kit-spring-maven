
package com.bullhorn.entity.candidate;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for candidateReferenceApiProperty.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="candidateReferenceApiProperty">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="candidateReferenceID"/>
 *     &lt;enumeration value="candidateID"/>
 *     &lt;enumeration value="candidateTitle"/>
 *     &lt;enumeration value="clientCorporationID"/>
 *     &lt;enumeration value="companyName"/>
 *     &lt;enumeration value="customDate1"/>
 *     &lt;enumeration value="customDate2"/>
 *     &lt;enumeration value="customDate3"/>
 *     &lt;enumeration value="customDate4"/>
 *     &lt;enumeration value="customDate5"/>
 *     &lt;enumeration value="customFloat1"/>
 *     &lt;enumeration value="customFloat2"/>
 *     &lt;enumeration value="customFloat3"/>
 *     &lt;enumeration value="customFloat4"/>
 *     &lt;enumeration value="customFloat5"/>
 *     &lt;enumeration value="customInt1"/>
 *     &lt;enumeration value="customInt2"/>
 *     &lt;enumeration value="customInt3"/>
 *     &lt;enumeration value="customInt4"/>
 *     &lt;enumeration value="customInt5"/>
 *     &lt;enumeration value="customMigrateGUID"/>
 *     &lt;enumeration value="customText1"/>
 *     &lt;enumeration value="customText2"/>
 *     &lt;enumeration value="customText3"/>
 *     &lt;enumeration value="customText4"/>
 *     &lt;enumeration value="customText5"/>
 *     &lt;enumeration value="customTextBlock1"/>
 *     &lt;enumeration value="customTextBlock2"/>
 *     &lt;enumeration value="customTextBlock3"/>
 *     &lt;enumeration value="dateAdded"/>
 *     &lt;enumeration value="employmentEnd"/>
 *     &lt;enumeration value="employmentStart"/>
 *     &lt;enumeration value="isDeleted"/>
 *     &lt;enumeration value="jobOrderID"/>
 *     &lt;enumeration value="migrateGUID"/>
 *     &lt;enumeration value="referenceClientContactID"/>
 *     &lt;enumeration value="referenceEmail"/>
 *     &lt;enumeration value="referenceFirstName"/>
 *     &lt;enumeration value="referenceLastName"/>
 *     &lt;enumeration value="referencePhone"/>
 *     &lt;enumeration value="referenceTitle"/>
 *     &lt;enumeration value="status"/>
 *     &lt;enumeration value="yearsKnown"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "candidateReferenceApiProperty")
@XmlEnum
public enum CandidateReferenceApiProperty {

    @XmlEnumValue("candidateReferenceID")
    CANDIDATE_REFERENCE_ID("candidateReferenceID"),
    @XmlEnumValue("candidateID")
    CANDIDATE_ID("candidateID"),
    @XmlEnumValue("candidateTitle")
    CANDIDATE_TITLE("candidateTitle"),
    @XmlEnumValue("clientCorporationID")
    CLIENT_CORPORATION_ID("clientCorporationID"),
    @XmlEnumValue("companyName")
    COMPANY_NAME("companyName"),
    @XmlEnumValue("customDate1")
    CUSTOM_DATE_1("customDate1"),
    @XmlEnumValue("customDate2")
    CUSTOM_DATE_2("customDate2"),
    @XmlEnumValue("customDate3")
    CUSTOM_DATE_3("customDate3"),
    @XmlEnumValue("customDate4")
    CUSTOM_DATE_4("customDate4"),
    @XmlEnumValue("customDate5")
    CUSTOM_DATE_5("customDate5"),
    @XmlEnumValue("customFloat1")
    CUSTOM_FLOAT_1("customFloat1"),
    @XmlEnumValue("customFloat2")
    CUSTOM_FLOAT_2("customFloat2"),
    @XmlEnumValue("customFloat3")
    CUSTOM_FLOAT_3("customFloat3"),
    @XmlEnumValue("customFloat4")
    CUSTOM_FLOAT_4("customFloat4"),
    @XmlEnumValue("customFloat5")
    CUSTOM_FLOAT_5("customFloat5"),
    @XmlEnumValue("customInt1")
    CUSTOM_INT_1("customInt1"),
    @XmlEnumValue("customInt2")
    CUSTOM_INT_2("customInt2"),
    @XmlEnumValue("customInt3")
    CUSTOM_INT_3("customInt3"),
    @XmlEnumValue("customInt4")
    CUSTOM_INT_4("customInt4"),
    @XmlEnumValue("customInt5")
    CUSTOM_INT_5("customInt5"),
    @XmlEnumValue("customMigrateGUID")
    CUSTOM_MIGRATE_GUID("customMigrateGUID"),
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
    @XmlEnumValue("dateAdded")
    DATE_ADDED("dateAdded"),
    @XmlEnumValue("employmentEnd")
    EMPLOYMENT_END("employmentEnd"),
    @XmlEnumValue("employmentStart")
    EMPLOYMENT_START("employmentStart"),
    @XmlEnumValue("isDeleted")
    IS_DELETED("isDeleted"),
    @XmlEnumValue("jobOrderID")
    JOB_ORDER_ID("jobOrderID"),
    @XmlEnumValue("migrateGUID")
    MIGRATE_GUID("migrateGUID"),
    @XmlEnumValue("referenceClientContactID")
    REFERENCE_CLIENT_CONTACT_ID("referenceClientContactID"),
    @XmlEnumValue("referenceEmail")
    REFERENCE_EMAIL("referenceEmail"),
    @XmlEnumValue("referenceFirstName")
    REFERENCE_FIRST_NAME("referenceFirstName"),
    @XmlEnumValue("referenceLastName")
    REFERENCE_LAST_NAME("referenceLastName"),
    @XmlEnumValue("referencePhone")
    REFERENCE_PHONE("referencePhone"),
    @XmlEnumValue("referenceTitle")
    REFERENCE_TITLE("referenceTitle"),
    @XmlEnumValue("status")
    STATUS("status"),
    @XmlEnumValue("yearsKnown")
    YEARS_KNOWN("yearsKnown");
    private final String value;

    CandidateReferenceApiProperty(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CandidateReferenceApiProperty fromValue(String v) {
        for (CandidateReferenceApiProperty c: CandidateReferenceApiProperty.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
