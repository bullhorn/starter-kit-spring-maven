
package com.bullhorn.entity.distlist;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for distributionListApiAssociation.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="distributionListApiAssociation">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="members"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "distributionListApiAssociation")
@XmlEnum
public enum DistributionListApiAssociation {

    @XmlEnumValue("members")
    MEMBERS("members");
    private final String value;

    DistributionListApiAssociation(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DistributionListApiAssociation fromValue(String v) {
        for (DistributionListApiAssociation c: DistributionListApiAssociation.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
