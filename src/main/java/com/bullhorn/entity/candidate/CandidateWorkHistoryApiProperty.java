
package com.bullhorn.entity.candidate;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for candidateWorkHistoryApiProperty.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="candidateWorkHistoryApiProperty">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="candidateWorkHistoryID"/>
 *     &lt;enumeration value="bonus"/>
 *     &lt;enumeration value="candidateID"/>
 *     &lt;enumeration value="clientCorporationID"/>
 *     &lt;enumeration value="comments"/>
 *     &lt;enumeration value="commission"/>
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
 *     &lt;enumeration value="customText1"/>
 *     &lt;enumeration value="customText2"/>
 *     &lt;enumeration value="customText3"/>
 *     &lt;enumeration value="customText4"/>
 *     &lt;enumeration value="customText5"/>
 *     &lt;enumeration value="customTextBlock1"/>
 *     &lt;enumeration value="customTextBlock2"/>
 *     &lt;enumeration value="customTextBlock3"/>
 *     &lt;enumeration value="dateAdded"/>
 *     &lt;enumeration value="endDate"/>
 *     &lt;enumeration value="isDeleted"/>
 *     &lt;enumeration value="isLastJob"/>
 *     &lt;enumeration value="jobOrderID"/>
 *     &lt;enumeration value="migrateGUID"/>
 *     &lt;enumeration value="placementID"/>
 *     &lt;enumeration value="salary1"/>
 *     &lt;enumeration value="salary2"/>
 *     &lt;enumeration value="salaryType"/>
 *     &lt;enumeration value="startDate"/>
 *     &lt;enumeration value="terminationReason"/>
 *     &lt;enumeration value="title"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "candidateWorkHistoryApiProperty")
@XmlEnum
public enum CandidateWorkHistoryApiProperty {

    @XmlEnumValue("candidateWorkHistoryID")
    CANDIDATE_WORK_HISTORY_ID("candidateWorkHistoryID"),
    @XmlEnumValue("bonus")
    BONUS("bonus"),
    @XmlEnumValue("candidateID")
    CANDIDATE_ID("candidateID"),
    @XmlEnumValue("clientCorporationID")
    CLIENT_CORPORATION_ID("clientCorporationID"),
    @XmlEnumValue("comments")
    COMMENTS("comments"),
    @XmlEnumValue("commission")
    COMMISSION("commission"),
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
    @XmlEnumValue("endDate")
    END_DATE("endDate"),
    @XmlEnumValue("isDeleted")
    IS_DELETED("isDeleted"),
    @XmlEnumValue("isLastJob")
    IS_LAST_JOB("isLastJob"),
    @XmlEnumValue("jobOrderID")
    JOB_ORDER_ID("jobOrderID"),
    @XmlEnumValue("migrateGUID")
    MIGRATE_GUID("migrateGUID"),
    @XmlEnumValue("placementID")
    PLACEMENT_ID("placementID"),
    @XmlEnumValue("salary1")
    SALARY_1("salary1"),
    @XmlEnumValue("salary2")
    SALARY_2("salary2"),
    @XmlEnumValue("salaryType")
    SALARY_TYPE("salaryType"),
    @XmlEnumValue("startDate")
    START_DATE("startDate"),
    @XmlEnumValue("terminationReason")
    TERMINATION_REASON("terminationReason"),
    @XmlEnumValue("title")
    TITLE("title");
    private final String value;

    CandidateWorkHistoryApiProperty(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CandidateWorkHistoryApiProperty fromValue(String v) {
        for (CandidateWorkHistoryApiProperty c: CandidateWorkHistoryApiProperty.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
