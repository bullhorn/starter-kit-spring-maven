
package com.bullhorn.entity.corp;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for costCenterApiAssociation.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="costCenterApiAssociation">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="departments"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "costCenterApiAssociation")
@XmlEnum
public enum CostCenterApiAssociation {

    @XmlEnumValue("departments")
    DEPARTMENTS("departments");
    private final String value;

    CostCenterApiAssociation(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CostCenterApiAssociation fromValue(String v) {
        for (CostCenterApiAssociation c: CostCenterApiAssociation.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
