
package com.bullhorn.entity.survey;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for surveyApiProperty.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="surveyApiProperty">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="surveyID"/>
 *     &lt;enumeration value="comments"/>
 *     &lt;enumeration value="dateAdded"/>
 *     &lt;enumeration value="dateCompleted"/>
 *     &lt;enumeration value="jobOrderID"/>
 *     &lt;enumeration value="migrateGUID"/>
 *     &lt;enumeration value="placementID"/>
 *     &lt;enumeration value="placementIDOld"/>
 *     &lt;enumeration value="reviewingClientContactID"/>
 *     &lt;enumeration value="templateID"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "surveyApiProperty")
@XmlEnum
public enum SurveyApiProperty {

    @XmlEnumValue("surveyID")
    SURVEY_ID("surveyID"),
    @XmlEnumValue("comments")
    COMMENTS("comments"),
    @XmlEnumValue("dateAdded")
    DATE_ADDED("dateAdded"),
    @XmlEnumValue("dateCompleted")
    DATE_COMPLETED("dateCompleted"),
    @XmlEnumValue("jobOrderID")
    JOB_ORDER_ID("jobOrderID"),
    @XmlEnumValue("migrateGUID")
    MIGRATE_GUID("migrateGUID"),
    @XmlEnumValue("placementID")
    PLACEMENT_ID("placementID"),
    @XmlEnumValue("placementIDOld")
    PLACEMENT_ID_OLD("placementIDOld"),
    @XmlEnumValue("reviewingClientContactID")
    REVIEWING_CLIENT_CONTACT_ID("reviewingClientContactID"),
    @XmlEnumValue("templateID")
    TEMPLATE_ID("templateID");
    private final String value;

    SurveyApiProperty(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SurveyApiProperty fromValue(String v) {
        for (SurveyApiProperty c: SurveyApiProperty.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
