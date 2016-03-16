
package com.bullhorn.entity.candidate;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for candidateSourceApiProperty.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="candidateSourceApiProperty">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="candidateSourceID"/>
 *     &lt;enumeration value="accountNumber"/>
 *     &lt;enumeration value="address"/>
 *     &lt;enumeration value="candidateID"/>
 *     &lt;enumeration value="corporationID"/>
 *     &lt;enumeration value="fax"/>
 *     &lt;enumeration value="fee"/>
 *     &lt;enumeration value="feeType"/>
 *     &lt;enumeration value="migrateGUID"/>
 *     &lt;enumeration value="name"/>
 *     &lt;enumeration value="phone"/>
 *     &lt;enumeration value="type"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "candidateSourceApiProperty")
@XmlEnum
public enum CandidateSourceApiProperty {

    @XmlEnumValue("candidateSourceID")
    CANDIDATE_SOURCE_ID("candidateSourceID"),
    @XmlEnumValue("accountNumber")
    ACCOUNT_NUMBER("accountNumber"),
    @XmlEnumValue("address")
    ADDRESS("address"),
    @XmlEnumValue("candidateID")
    CANDIDATE_ID("candidateID"),
    @XmlEnumValue("corporationID")
    CORPORATION_ID("corporationID"),
    @XmlEnumValue("fax")
    FAX("fax"),
    @XmlEnumValue("fee")
    FEE("fee"),
    @XmlEnumValue("feeType")
    FEE_TYPE("feeType"),
    @XmlEnumValue("migrateGUID")
    MIGRATE_GUID("migrateGUID"),
    @XmlEnumValue("name")
    NAME("name"),
    @XmlEnumValue("phone")
    PHONE("phone"),
    @XmlEnumValue("type")
    TYPE("type");
    private final String value;

    CandidateSourceApiProperty(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CandidateSourceApiProperty fromValue(String v) {
        for (CandidateSourceApiProperty c: CandidateSourceApiProperty.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
