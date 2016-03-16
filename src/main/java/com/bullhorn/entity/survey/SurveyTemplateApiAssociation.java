
package com.bullhorn.entity.survey;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for surveyTemplateApiAssociation.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="surveyTemplateApiAssociation">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="questions"/>
 *     &lt;enumeration value="surveys"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "surveyTemplateApiAssociation")
@XmlEnum
public enum SurveyTemplateApiAssociation {

    @XmlEnumValue("questions")
    QUESTIONS("questions"),
    @XmlEnumValue("surveys")
    SURVEYS("surveys");
    private final String value;

    SurveyTemplateApiAssociation(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SurveyTemplateApiAssociation fromValue(String v) {
        for (SurveyTemplateApiAssociation c: SurveyTemplateApiAssociation.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
