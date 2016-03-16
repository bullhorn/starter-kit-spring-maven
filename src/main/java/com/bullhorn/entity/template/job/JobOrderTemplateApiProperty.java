
package com.bullhorn.entity.template.job;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for jobOrderTemplateApiProperty.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="jobOrderTemplateApiProperty">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="templateId"/>
 *     &lt;enumeration value="dateAdded"/>
 *     &lt;enumeration value="description"/>
 *     &lt;enumeration value="displayType"/>
 *     &lt;enumeration value="enabled"/>
 *     &lt;enumeration value="entityList"/>
 *     &lt;enumeration value="groupName"/>
 *     &lt;enumeration value="isSearchable"/>
 *     &lt;enumeration value="name"/>
 *     &lt;enumeration value="reportID"/>
 *     &lt;enumeration value="staticTemplateName"/>
 *     &lt;enumeration value="tabName"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "jobOrderTemplateApiProperty")
@XmlEnum
public enum JobOrderTemplateApiProperty {

    @XmlEnumValue("templateId")
    TEMPLATE_ID("templateId"),
    @XmlEnumValue("dateAdded")
    DATE_ADDED("dateAdded"),
    @XmlEnumValue("description")
    DESCRIPTION("description"),
    @XmlEnumValue("displayType")
    DISPLAY_TYPE("displayType"),
    @XmlEnumValue("enabled")
    ENABLED("enabled"),
    @XmlEnumValue("entityList")
    ENTITY_LIST("entityList"),
    @XmlEnumValue("groupName")
    GROUP_NAME("groupName"),
    @XmlEnumValue("isSearchable")
    IS_SEARCHABLE("isSearchable"),
    @XmlEnumValue("name")
    NAME("name"),
    @XmlEnumValue("reportID")
    REPORT_ID("reportID"),
    @XmlEnumValue("staticTemplateName")
    STATIC_TEMPLATE_NAME("staticTemplateName"),
    @XmlEnumValue("tabName")
    TAB_NAME("tabName");
    private final String value;

    JobOrderTemplateApiProperty(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static JobOrderTemplateApiProperty fromValue(String v) {
        for (JobOrderTemplateApiProperty c: JobOrderTemplateApiProperty.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
