
package com.bullhorn.entity.report;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for reportCriteriaApiProperty.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="reportCriteriaApiProperty">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="reportCriteriaID"/>
 *     &lt;enumeration value="allowMultiple"/>
 *     &lt;enumeration value="columnName"/>
 *     &lt;enumeration value="dataFormat"/>
 *     &lt;enumeration value="description"/>
 *     &lt;enumeration value="display"/>
 *     &lt;enumeration value="editType"/>
 *     &lt;enumeration value="hint"/>
 *     &lt;enumeration value="isHidden"/>
 *     &lt;enumeration value="isRequired"/>
 *     &lt;enumeration value="limit"/>
 *     &lt;enumeration value="lineDelimiter"/>
 *     &lt;enumeration value="reportID"/>
 *     &lt;enumeration value="sortOrder"/>
 *     &lt;enumeration value="valueList"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "reportCriteriaApiProperty")
@XmlEnum
public enum ReportCriteriaApiProperty {

    @XmlEnumValue("reportCriteriaID")
    REPORT_CRITERIA_ID("reportCriteriaID"),
    @XmlEnumValue("allowMultiple")
    ALLOW_MULTIPLE("allowMultiple"),
    @XmlEnumValue("columnName")
    COLUMN_NAME("columnName"),
    @XmlEnumValue("dataFormat")
    DATA_FORMAT("dataFormat"),
    @XmlEnumValue("description")
    DESCRIPTION("description"),
    @XmlEnumValue("display")
    DISPLAY("display"),
    @XmlEnumValue("editType")
    EDIT_TYPE("editType"),
    @XmlEnumValue("hint")
    HINT("hint"),
    @XmlEnumValue("isHidden")
    IS_HIDDEN("isHidden"),
    @XmlEnumValue("isRequired")
    IS_REQUIRED("isRequired"),
    @XmlEnumValue("limit")
    LIMIT("limit"),
    @XmlEnumValue("lineDelimiter")
    LINE_DELIMITER("lineDelimiter"),
    @XmlEnumValue("reportID")
    REPORT_ID("reportID"),
    @XmlEnumValue("sortOrder")
    SORT_ORDER("sortOrder"),
    @XmlEnumValue("valueList")
    VALUE_LIST("valueList");
    private final String value;

    ReportCriteriaApiProperty(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ReportCriteriaApiProperty fromValue(String v) {
        for (ReportCriteriaApiProperty c: ReportCriteriaApiProperty.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
