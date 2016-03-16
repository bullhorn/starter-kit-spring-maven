
package com.bullhorn.entity.survey;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for surveyQuestionApiProperty.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="surveyQuestionApiProperty">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="surveyQuestionID"/>
 *     &lt;enumeration value="defaultScore"/>
 *     &lt;enumeration value="displayList"/>
 *     &lt;enumeration value="editType"/>
 *     &lt;enumeration value="hint"/>
 *     &lt;enumeration value="isDeleted"/>
 *     &lt;enumeration value="isRequired"/>
 *     &lt;enumeration value="question"/>
 *     &lt;enumeration value="sortOrder"/>
 *     &lt;enumeration value="templateID"/>
 *     &lt;enumeration value="valueList"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "surveyQuestionApiProperty")
@XmlEnum
public enum SurveyQuestionApiProperty {

    @XmlEnumValue("surveyQuestionID")
    SURVEY_QUESTION_ID("surveyQuestionID"),
    @XmlEnumValue("defaultScore")
    DEFAULT_SCORE("defaultScore"),
    @XmlEnumValue("displayList")
    DISPLAY_LIST("displayList"),
    @XmlEnumValue("editType")
    EDIT_TYPE("editType"),
    @XmlEnumValue("hint")
    HINT("hint"),
    @XmlEnumValue("isDeleted")
    IS_DELETED("isDeleted"),
    @XmlEnumValue("isRequired")
    IS_REQUIRED("isRequired"),
    @XmlEnumValue("question")
    QUESTION("question"),
    @XmlEnumValue("sortOrder")
    SORT_ORDER("sortOrder"),
    @XmlEnumValue("templateID")
    TEMPLATE_ID("templateID"),
    @XmlEnumValue("valueList")
    VALUE_LIST("valueList");
    private final String value;

    SurveyQuestionApiProperty(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SurveyQuestionApiProperty fromValue(String v) {
        for (SurveyQuestionApiProperty c: SurveyQuestionApiProperty.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
