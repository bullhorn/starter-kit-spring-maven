
package com.bullhorn.entity.candidate;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for candidateCertificationApiProperty.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="candidateCertificationApiProperty">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="candidateCertificationID"/>
 *     &lt;enumeration value="boardCertification"/>
 *     &lt;enumeration value="candidateID"/>
 *     &lt;enumeration value="certificationID"/>
 *     &lt;enumeration value="comments"/>
 *     &lt;enumeration value="compact"/>
 *     &lt;enumeration value="copyOnFile"/>
 *     &lt;enumeration value="dateCertified"/>
 *     &lt;enumeration value="dateExpiration"/>
 *     &lt;enumeration value="dateLastModified"/>
 *     &lt;enumeration value="issuedBy"/>
 *     &lt;enumeration value="licenseNumber"/>
 *     &lt;enumeration value="licenseType"/>
 *     &lt;enumeration value="location"/>
 *     &lt;enumeration value="modifyingUserID"/>
 *     &lt;enumeration value="results"/>
 *     &lt;enumeration value="status"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "candidateCertificationApiProperty")
@XmlEnum
public enum CandidateCertificationApiProperty {

    @XmlEnumValue("candidateCertificationID")
    CANDIDATE_CERTIFICATION_ID("candidateCertificationID"),
    @XmlEnumValue("boardCertification")
    BOARD_CERTIFICATION("boardCertification"),
    @XmlEnumValue("candidateID")
    CANDIDATE_ID("candidateID"),
    @XmlEnumValue("certificationID")
    CERTIFICATION_ID("certificationID"),
    @XmlEnumValue("comments")
    COMMENTS("comments"),
    @XmlEnumValue("compact")
    COMPACT("compact"),
    @XmlEnumValue("copyOnFile")
    COPY_ON_FILE("copyOnFile"),
    @XmlEnumValue("dateCertified")
    DATE_CERTIFIED("dateCertified"),
    @XmlEnumValue("dateExpiration")
    DATE_EXPIRATION("dateExpiration"),
    @XmlEnumValue("dateLastModified")
    DATE_LAST_MODIFIED("dateLastModified"),
    @XmlEnumValue("issuedBy")
    ISSUED_BY("issuedBy"),
    @XmlEnumValue("licenseNumber")
    LICENSE_NUMBER("licenseNumber"),
    @XmlEnumValue("licenseType")
    LICENSE_TYPE("licenseType"),
    @XmlEnumValue("location")
    LOCATION("location"),
    @XmlEnumValue("modifyingUserID")
    MODIFYING_USER_ID("modifyingUserID"),
    @XmlEnumValue("results")
    RESULTS("results"),
    @XmlEnumValue("status")
    STATUS("status");
    private final String value;

    CandidateCertificationApiProperty(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CandidateCertificationApiProperty fromValue(String v) {
        for (CandidateCertificationApiProperty c: CandidateCertificationApiProperty.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
