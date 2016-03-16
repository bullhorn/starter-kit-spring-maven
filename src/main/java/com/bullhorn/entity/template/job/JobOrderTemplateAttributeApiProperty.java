
package com.bullhorn.entity.template.job;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for jobOrderTemplateAttributeApiProperty.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="jobOrderTemplateAttributeApiProperty">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="templateAttributeId"/>
 *     &lt;enumeration value="attributeType"/>
 *     &lt;enumeration value="description"/>
 *     &lt;enumeration value="enabled"/>
 *     &lt;enumeration value="hint"/>
 *     &lt;enumeration value="isRequired"/>
 *     &lt;enumeration value="isSearchable"/>
 *     &lt;enumeration value="name"/>
 *     &lt;enumeration value="optionList"/>
 *     &lt;enumeration value="sortOrder"/>
 *     &lt;enumeration value="staticFieldName"/>
 *     &lt;enumeration value="templateID"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "jobOrderTemplateAttributeApiProperty")
@XmlEnum
public enum JobOrderTemplateAttributeApiProperty {

    @XmlEnumValue("templateAttributeId")
    TEMPLATE_ATTRIBUTE_ID("templateAttributeId"),
    @XmlEnumValue("attributeType")
    ATTRIBUTE_TYPE("attributeType"),
    @XmlEnumValue("description")
    DESCRIPTION("description"),
    @XmlEnumValue("enabled")
    ENABLED("enabled"),
    @XmlEnumValue("hint")
    HINT("hint"),
    @XmlEnumValue("isRequired")
    IS_REQUIRED("isRequired"),
    @XmlEnumValue("isSearchable")
    IS_SEARCHABLE("isSearchable"),
    @XmlEnumValue("name")
    NAME("name"),
    @XmlEnumValue("optionList")
    OPTION_LIST("optionList"),
    @XmlEnumValue("sortOrder")
    SORT_ORDER("sortOrder"),
    @XmlEnumValue("staticFieldName")
    STATIC_FIELD_NAME("staticFieldName"),
    @XmlEnumValue("templateID")
    TEMPLATE_ID("templateID");
    private final String value;

    JobOrderTemplateAttributeApiProperty(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static JobOrderTemplateAttributeApiProperty fromValue(String v) {
        for (JobOrderTemplateAttributeApiProperty c: JobOrderTemplateAttributeApiProperty.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
