
package com.bullhorn.entity.report;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for reportOutputApiAssociation.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="reportOutputApiAssociation">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="reports"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "reportOutputApiAssociation")
@XmlEnum
public enum ReportOutputApiAssociation {

    @XmlEnumValue("reports")
    REPORTS("reports");
    private final String value;

    ReportOutputApiAssociation(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ReportOutputApiAssociation fromValue(String v) {
        for (ReportOutputApiAssociation c: ReportOutputApiAssociation.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
