
package com.bullhorn.entity.report;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for reportCategoryApiProperty.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="reportCategoryApiProperty">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="reportCategoryID"/>
 *     &lt;enumeration value="corporationID"/>
 *     &lt;enumeration value="name"/>
 *     &lt;enumeration value="sortOrder"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "reportCategoryApiProperty")
@XmlEnum
public enum ReportCategoryApiProperty {

    @XmlEnumValue("reportCategoryID")
    REPORT_CATEGORY_ID("reportCategoryID"),
    @XmlEnumValue("corporationID")
    CORPORATION_ID("corporationID"),
    @XmlEnumValue("name")
    NAME("name"),
    @XmlEnumValue("sortOrder")
    SORT_ORDER("sortOrder");
    private final String value;

    ReportCategoryApiProperty(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ReportCategoryApiProperty fromValue(String v) {
        for (ReportCategoryApiProperty c: ReportCategoryApiProperty.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
