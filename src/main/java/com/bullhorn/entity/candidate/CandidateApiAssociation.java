
package com.bullhorn.entity.candidate;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for candidateApiAssociation.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="candidateApiAssociation">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="businessSectors"/>
 *     &lt;enumeration value="categories"/>
 *     &lt;enumeration value="certificationList"/>
 *     &lt;enumeration value="primarySkills"/>
 *     &lt;enumeration value="secondaryOwners"/>
 *     &lt;enumeration value="secondarySkills"/>
 *     &lt;enumeration value="specialties"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "candidateApiAssociation")
@XmlEnum
public enum CandidateApiAssociation {

    @XmlEnumValue("businessSectors")
    BUSINESS_SECTORS("businessSectors"),
    @XmlEnumValue("categories")
    CATEGORIES("categories"),
    @XmlEnumValue("certificationList")
    CERTIFICATION_LIST("certificationList"),
    @XmlEnumValue("primarySkills")
    PRIMARY_SKILLS("primarySkills"),
    @XmlEnumValue("secondaryOwners")
    SECONDARY_OWNERS("secondaryOwners"),
    @XmlEnumValue("secondarySkills")
    SECONDARY_SKILLS("secondarySkills"),
    @XmlEnumValue("specialties")
    SPECIALTIES("specialties");
    private final String value;

    CandidateApiAssociation(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CandidateApiAssociation fromValue(String v) {
        for (CandidateApiAssociation c: CandidateApiAssociation.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
