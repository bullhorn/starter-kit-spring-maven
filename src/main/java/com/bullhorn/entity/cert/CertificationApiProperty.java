
package com.bullhorn.entity.cert;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for certificationApiProperty.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="certificationApiProperty">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="certificationID"/>
 *     &lt;enumeration value="description"/>
 *     &lt;enumeration value="name"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "certificationApiProperty")
@XmlEnum
public enum CertificationApiProperty {

    @XmlEnumValue("certificationID")
    CERTIFICATION_ID("certificationID"),
    @XmlEnumValue("description")
    DESCRIPTION("description"),
    @XmlEnumValue("name")
    NAME("name");
    private final String value;

    CertificationApiProperty(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CertificationApiProperty fromValue(String v) {
        for (CertificationApiProperty c: CertificationApiProperty.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
