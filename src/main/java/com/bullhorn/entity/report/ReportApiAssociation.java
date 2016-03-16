
package com.bullhorn.entity.report;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for reportApiAssociation.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="reportApiAssociation">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="criteria"/>
 *     &lt;enumeration value="entitlements"/>
 *     &lt;enumeration value="outputs"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "reportApiAssociation")
@XmlEnum
public enum ReportApiAssociation {

    @XmlEnumValue("criteria")
    CRITERIA("criteria"),
    @XmlEnumValue("entitlements")
    ENTITLEMENTS("entitlements"),
    @XmlEnumValue("outputs")
    OUTPUTS("outputs");
    private final String value;

    ReportApiAssociation(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ReportApiAssociation fromValue(String v) {
        for (ReportApiAssociation c: ReportApiAssociation.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
