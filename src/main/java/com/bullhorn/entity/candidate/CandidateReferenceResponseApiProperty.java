
package com.bullhorn.entity.candidate;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for candidateReferenceResponseApiProperty.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="candidateReferenceResponseApiProperty">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="userReferenceResponseID"/>
 *     &lt;enumeration value="migrateGUID"/>
 *     &lt;enumeration value="questionID"/>
 *     &lt;enumeration value="referenceID"/>
 *     &lt;enumeration value="responseText"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "candidateReferenceResponseApiProperty")
@XmlEnum
public enum CandidateReferenceResponseApiProperty {

    @XmlEnumValue("userReferenceResponseID")
    USER_REFERENCE_RESPONSE_ID("userReferenceResponseID"),
    @XmlEnumValue("migrateGUID")
    MIGRATE_GUID("migrateGUID"),
    @XmlEnumValue("questionID")
    QUESTION_ID("questionID"),
    @XmlEnumValue("referenceID")
    REFERENCE_ID("referenceID"),
    @XmlEnumValue("responseText")
    RESPONSE_TEXT("responseText");
    private final String value;

    CandidateReferenceResponseApiProperty(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CandidateReferenceResponseApiProperty fromValue(String v) {
        for (CandidateReferenceResponseApiProperty c: CandidateReferenceResponseApiProperty.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
