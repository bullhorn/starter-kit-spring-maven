
package com.bullhorn.entity.template.user;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for userTemplateApiProperty.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="userTemplateApiProperty">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="templateId"/>
 *     &lt;enumeration value="categoryID"/>
 *     &lt;enumeration value="dateAdded"/>
 *     &lt;enumeration value="description"/>
 *     &lt;enumeration value="displayType"/>
 *     &lt;enumeration value="enabled"/>
 *     &lt;enumeration value="groupName"/>
 *     &lt;enumeration value="isPublic"/>
 *     &lt;enumeration value="isSearchable"/>
 *     &lt;enumeration value="name"/>
 *     &lt;enumeration value="reportID"/>
 *     &lt;enumeration value="staticTemplateName"/>
 *     &lt;enumeration value="tabName"/>
 *     &lt;enumeration value="type"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "userTemplateApiProperty")
@XmlEnum
public enum UserTemplateApiProperty {

    @XmlEnumValue("templateId")
    TEMPLATE_ID("templateId"),
    @XmlEnumValue("categoryID")
    CATEGORY_ID("categoryID"),
    @XmlEnumValue("dateAdded")
    DATE_ADDED("dateAdded"),
    @XmlEnumValue("description")
    DESCRIPTION("description"),
    @XmlEnumValue("displayType")
    DISPLAY_TYPE("displayType"),
    @XmlEnumValue("enabled")
    ENABLED("enabled"),
    @XmlEnumValue("groupName")
    GROUP_NAME("groupName"),
    @XmlEnumValue("isPublic")
    IS_PUBLIC("isPublic"),
    @XmlEnumValue("isSearchable")
    IS_SEARCHABLE("isSearchable"),
    @XmlEnumValue("name")
    NAME("name"),
    @XmlEnumValue("reportID")
    REPORT_ID("reportID"),
    @XmlEnumValue("staticTemplateName")
    STATIC_TEMPLATE_NAME("staticTemplateName"),
    @XmlEnumValue("tabName")
    TAB_NAME("tabName"),
    @XmlEnumValue("type")
    TYPE("type");
    private final String value;

    UserTemplateApiProperty(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static UserTemplateApiProperty fromValue(String v) {
        for (UserTemplateApiProperty c: UserTemplateApiProperty.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
