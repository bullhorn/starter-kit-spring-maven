
package com.bullhorn.entity.lists;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for businessSectorApiAssociation.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="businessSectorApiAssociation">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="privateLabels"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "businessSectorApiAssociation")
@XmlEnum
public enum BusinessSectorApiAssociation {

    @XmlEnumValue("privateLabels")
    PRIVATE_LABELS("privateLabels");
    private final String value;

    BusinessSectorApiAssociation(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BusinessSectorApiAssociation fromValue(String v) {
        for (BusinessSectorApiAssociation c: BusinessSectorApiAssociation.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
