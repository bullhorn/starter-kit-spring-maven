
package com.bullhorn.entity.candidate;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for candidateReferenceApiAssociation.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="candidateReferenceApiAssociation">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="responses"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "candidateReferenceApiAssociation")
@XmlEnum
public enum CandidateReferenceApiAssociation {

    @XmlEnumValue("responses")
    RESPONSES("responses");
    private final String value;

    CandidateReferenceApiAssociation(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CandidateReferenceApiAssociation fromValue(String v) {
        for (CandidateReferenceApiAssociation c: CandidateReferenceApiAssociation.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
