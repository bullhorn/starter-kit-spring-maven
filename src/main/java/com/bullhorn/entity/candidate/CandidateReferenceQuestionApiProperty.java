
package com.bullhorn.entity.candidate;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for candidateReferenceQuestionApiProperty.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="candidateReferenceQuestionApiProperty">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="candidateReferenceQuestionID"/>
 *     &lt;enumeration value="categoryID"/>
 *     &lt;enumeration value="corporationID"/>
 *     &lt;enumeration value="enabled"/>
 *     &lt;enumeration value="migrateGUID"/>
 *     &lt;enumeration value="questionText"/>
 *     &lt;enumeration value="sortOrder"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "candidateReferenceQuestionApiProperty")
@XmlEnum
public enum CandidateReferenceQuestionApiProperty {

    @XmlEnumValue("candidateReferenceQuestionID")
    CANDIDATE_REFERENCE_QUESTION_ID("candidateReferenceQuestionID"),
    @XmlEnumValue("categoryID")
    CATEGORY_ID("categoryID"),
    @XmlEnumValue("corporationID")
    CORPORATION_ID("corporationID"),
    @XmlEnumValue("enabled")
    ENABLED("enabled"),
    @XmlEnumValue("migrateGUID")
    MIGRATE_GUID("migrateGUID"),
    @XmlEnumValue("questionText")
    QUESTION_TEXT("questionText"),
    @XmlEnumValue("sortOrder")
    SORT_ORDER("sortOrder");
    private final String value;

    CandidateReferenceQuestionApiProperty(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CandidateReferenceQuestionApiProperty fromValue(String v) {
        for (CandidateReferenceQuestionApiProperty c: CandidateReferenceQuestionApiProperty.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
