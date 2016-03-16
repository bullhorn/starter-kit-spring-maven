
package com.bullhorn.entity.report;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for reportOutputApiProperty.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="reportOutputApiProperty">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="reportOutputID"/>
 *     &lt;enumeration value="name"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "reportOutputApiProperty")
@XmlEnum
public enum ReportOutputApiProperty {

    @XmlEnumValue("reportOutputID")
    REPORT_OUTPUT_ID("reportOutputID"),
    @XmlEnumValue("name")
    NAME("name");
    private final String value;

    ReportOutputApiProperty(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ReportOutputApiProperty fromValue(String v) {
        for (ReportOutputApiProperty c: ReportOutputApiProperty.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
