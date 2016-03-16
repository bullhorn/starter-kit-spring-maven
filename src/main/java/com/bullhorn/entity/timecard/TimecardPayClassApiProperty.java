
package com.bullhorn.entity.timecard;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for timecardPayClassApiProperty.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="timecardPayClassApiProperty">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="payClassID"/>
 *     &lt;enumeration value="billRateField"/>
 *     &lt;enumeration value="classType"/>
 *     &lt;enumeration value="clientMarkupFactor"/>
 *     &lt;enumeration value="display"/>
 *     &lt;enumeration value="enabled"/>
 *     &lt;enumeration value="excludeFromInvoicing"/>
 *     &lt;enumeration value="excludeFromPayrolling"/>
 *     &lt;enumeration value="isRegularHoursClass"/>
 *     &lt;enumeration value="markupFactor"/>
 *     &lt;enumeration value="name"/>
 *     &lt;enumeration value="payRateField"/>
 *     &lt;enumeration value="privateLabelID"/>
 *     &lt;enumeration value="sortOrder"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "timecardPayClassApiProperty")
@XmlEnum
public enum TimecardPayClassApiProperty {

    @XmlEnumValue("payClassID")
    PAY_CLASS_ID("payClassID"),
    @XmlEnumValue("billRateField")
    BILL_RATE_FIELD("billRateField"),
    @XmlEnumValue("classType")
    CLASS_TYPE("classType"),
    @XmlEnumValue("clientMarkupFactor")
    CLIENT_MARKUP_FACTOR("clientMarkupFactor"),
    @XmlEnumValue("display")
    DISPLAY("display"),
    @XmlEnumValue("enabled")
    ENABLED("enabled"),
    @XmlEnumValue("excludeFromInvoicing")
    EXCLUDE_FROM_INVOICING("excludeFromInvoicing"),
    @XmlEnumValue("excludeFromPayrolling")
    EXCLUDE_FROM_PAYROLLING("excludeFromPayrolling"),
    @XmlEnumValue("isRegularHoursClass")
    IS_REGULAR_HOURS_CLASS("isRegularHoursClass"),
    @XmlEnumValue("markupFactor")
    MARKUP_FACTOR("markupFactor"),
    @XmlEnumValue("name")
    NAME("name"),
    @XmlEnumValue("payRateField")
    PAY_RATE_FIELD("payRateField"),
    @XmlEnumValue("privateLabelID")
    PRIVATE_LABEL_ID("privateLabelID"),
    @XmlEnumValue("sortOrder")
    SORT_ORDER("sortOrder");
    private final String value;

    TimecardPayClassApiProperty(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TimecardPayClassApiProperty fromValue(String v) {
        for (TimecardPayClassApiProperty c: TimecardPayClassApiProperty.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
