
package com.bullhorn.entity.report;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for reportApiProperty.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="reportApiProperty">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="reportID"/>
 *     &lt;enumeration value="categoryID"/>
 *     &lt;enumeration value="cognosType"/>
 *     &lt;enumeration value="dashboard"/>
 *     &lt;enumeration value="dateAdded"/>
 *     &lt;enumeration value="dateLastModified"/>
 *     &lt;enumeration value="description"/>
 *     &lt;enumeration value="name"/>
 *     &lt;enumeration value="oldReportID"/>
 *     &lt;enumeration value="ownerID"/>
 *     &lt;enumeration value="packageName"/>
 *     &lt;enumeration value="path"/>
 *     &lt;enumeration value="reportJar"/>
 *     &lt;enumeration value="reportRTF"/>
 *     &lt;enumeration value="reportXML"/>
 *     &lt;enumeration value="sqlData"/>
 *     &lt;enumeration value="type"/>
 *     &lt;enumeration value="version"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "reportApiProperty")
@XmlEnum
public enum ReportApiProperty {

    @XmlEnumValue("reportID")
    REPORT_ID("reportID"),
    @XmlEnumValue("categoryID")
    CATEGORY_ID("categoryID"),
    @XmlEnumValue("cognosType")
    COGNOS_TYPE("cognosType"),
    @XmlEnumValue("dashboard")
    DASHBOARD("dashboard"),
    @XmlEnumValue("dateAdded")
    DATE_ADDED("dateAdded"),
    @XmlEnumValue("dateLastModified")
    DATE_LAST_MODIFIED("dateLastModified"),
    @XmlEnumValue("description")
    DESCRIPTION("description"),
    @XmlEnumValue("name")
    NAME("name"),
    @XmlEnumValue("oldReportID")
    OLD_REPORT_ID("oldReportID"),
    @XmlEnumValue("ownerID")
    OWNER_ID("ownerID"),
    @XmlEnumValue("packageName")
    PACKAGE_NAME("packageName"),
    @XmlEnumValue("path")
    PATH("path"),
    @XmlEnumValue("reportJar")
    REPORT_JAR("reportJar"),
    @XmlEnumValue("reportRTF")
    REPORT_RTF("reportRTF"),
    @XmlEnumValue("reportXML")
    REPORT_XML("reportXML"),
    @XmlEnumValue("sqlData")
    SQL_DATA("sqlData"),
    @XmlEnumValue("type")
    TYPE("type"),
    @XmlEnumValue("version")
    VERSION("version");
    private final String value;

    ReportApiProperty(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ReportApiProperty fromValue(String v) {
        for (ReportApiProperty c: ReportApiProperty.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
