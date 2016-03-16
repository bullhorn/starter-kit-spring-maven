
package com.bullhorn.entity.survey;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for surveyTemplateApiProperty.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="surveyTemplateApiProperty">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="surveyTemplateID"/>
 *     &lt;enumeration value="dateAdded"/>
 *     &lt;enumeration value="description"/>
 *     &lt;enumeration value="migrateGUID"/>
 *     &lt;enumeration value="name"/>
 *     &lt;enumeration value="ownerID"/>
 *     &lt;enumeration value="publicDescription"/>
 *     &lt;enumeration value="type"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "surveyTemplateApiProperty")
@XmlEnum
public enum SurveyTemplateApiProperty {

    @XmlEnumValue("surveyTemplateID")
    SURVEY_TEMPLATE_ID("surveyTemplateID"),
    @XmlEnumValue("dateAdded")
    DATE_ADDED("dateAdded"),
    @XmlEnumValue("description")
    DESCRIPTION("description"),
    @XmlEnumValue("migrateGUID")
    MIGRATE_GUID("migrateGUID"),
    @XmlEnumValue("name")
    NAME("name"),
    @XmlEnumValue("ownerID")
    OWNER_ID("ownerID"),
    @XmlEnumValue("publicDescription")
    PUBLIC_DESCRIPTION("publicDescription"),
    @XmlEnumValue("type")
    TYPE("type");
    private final String value;

    SurveyTemplateApiProperty(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SurveyTemplateApiProperty fromValue(String v) {
        for (SurveyTemplateApiProperty c: SurveyTemplateApiProperty.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
