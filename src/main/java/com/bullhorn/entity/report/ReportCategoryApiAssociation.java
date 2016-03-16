
package com.bullhorn.entity.report;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for reportCategoryApiAssociation.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="reportCategoryApiAssociation">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="reports"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "reportCategoryApiAssociation")
@XmlEnum
public enum ReportCategoryApiAssociation {

    @XmlEnumValue("reports")
    REPORTS("reports");
    private final String value;

    ReportCategoryApiAssociation(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ReportCategoryApiAssociation fromValue(String v) {
        for (ReportCategoryApiAssociation c: ReportCategoryApiAssociation.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
