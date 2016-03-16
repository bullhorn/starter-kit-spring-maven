
package com.bullhorn.entity.candidate;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for candidateAssessmentApiProperty.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="candidateAssessmentApiProperty">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="assessmentID"/>
 *     &lt;enumeration value="addingUserID"/>
 *     &lt;enumeration value="assessmentCode"/>
 *     &lt;enumeration value="assessmentName"/>
 *     &lt;enumeration value="assessmentSystemID"/>
 *     &lt;enumeration value="candidateID"/>
 *     &lt;enumeration value="comments"/>
 *     &lt;enumeration value="dateAdded"/>
 *     &lt;enumeration value="isDeleted"/>
 *     &lt;enumeration value="migrateGUID"/>
 *     &lt;enumeration value="resultCode"/>
 *     &lt;enumeration value="resultDate"/>
 *     &lt;enumeration value="scoreValue"/>
 *     &lt;enumeration value="sessionCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "candidateAssessmentApiProperty")
@XmlEnum
public enum CandidateAssessmentApiProperty {

    @XmlEnumValue("assessmentID")
    ASSESSMENT_ID("assessmentID"),
    @XmlEnumValue("addingUserID")
    ADDING_USER_ID("addingUserID"),
    @XmlEnumValue("assessmentCode")
    ASSESSMENT_CODE("assessmentCode"),
    @XmlEnumValue("assessmentName")
    ASSESSMENT_NAME("assessmentName"),
    @XmlEnumValue("assessmentSystemID")
    ASSESSMENT_SYSTEM_ID("assessmentSystemID"),
    @XmlEnumValue("candidateID")
    CANDIDATE_ID("candidateID"),
    @XmlEnumValue("comments")
    COMMENTS("comments"),
    @XmlEnumValue("dateAdded")
    DATE_ADDED("dateAdded"),
    @XmlEnumValue("isDeleted")
    IS_DELETED("isDeleted"),
    @XmlEnumValue("migrateGUID")
    MIGRATE_GUID("migrateGUID"),
    @XmlEnumValue("resultCode")
    RESULT_CODE("resultCode"),
    @XmlEnumValue("resultDate")
    RESULT_DATE("resultDate"),
    @XmlEnumValue("scoreValue")
    SCORE_VALUE("scoreValue"),
    @XmlEnumValue("sessionCode")
    SESSION_CODE("sessionCode");
    private final String value;

    CandidateAssessmentApiProperty(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CandidateAssessmentApiProperty fromValue(String v) {
        for (CandidateAssessmentApiProperty c: CandidateAssessmentApiProperty.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
