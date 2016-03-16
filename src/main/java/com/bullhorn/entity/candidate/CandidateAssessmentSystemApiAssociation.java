
package com.bullhorn.entity.candidate;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for candidateAssessmentSystemApiAssociation.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="candidateAssessmentSystemApiAssociation">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="assessments"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "candidateAssessmentSystemApiAssociation")
@XmlEnum
public enum CandidateAssessmentSystemApiAssociation {

    @XmlEnumValue("assessments")
    ASSESSMENTS("assessments");
    private final String value;

    CandidateAssessmentSystemApiAssociation(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CandidateAssessmentSystemApiAssociation fromValue(String v) {
        for (CandidateAssessmentSystemApiAssociation c: CandidateAssessmentSystemApiAssociation.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
