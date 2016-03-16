
package com.bullhorn.entity.candidate;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for candidateAssessmentSystemApiProperty.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="candidateAssessmentSystemApiProperty">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="assessmentSystemID"/>
 *     &lt;enumeration value="name"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "candidateAssessmentSystemApiProperty")
@XmlEnum
public enum CandidateAssessmentSystemApiProperty {

    @XmlEnumValue("assessmentSystemID")
    ASSESSMENT_SYSTEM_ID("assessmentSystemID"),
    @XmlEnumValue("name")
    NAME("name");
    private final String value;

    CandidateAssessmentSystemApiProperty(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CandidateAssessmentSystemApiProperty fromValue(String v) {
        for (CandidateAssessmentSystemApiProperty c: CandidateAssessmentSystemApiProperty.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
