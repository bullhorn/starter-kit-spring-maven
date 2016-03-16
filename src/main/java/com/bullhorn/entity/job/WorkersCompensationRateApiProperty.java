
package com.bullhorn.entity.job;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for workersCompensationRateApiProperty.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="workersCompensationRateApiProperty">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="workersCompensationRateID"/>
 *     &lt;enumeration value="compensationID"/>
 *     &lt;enumeration value="endDate"/>
 *     &lt;enumeration value="privateLabelID"/>
 *     &lt;enumeration value="rate"/>
 *     &lt;enumeration value="startDate"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "workersCompensationRateApiProperty")
@XmlEnum
public enum WorkersCompensationRateApiProperty {

    @XmlEnumValue("workersCompensationRateID")
    WORKERS_COMPENSATION_RATE_ID("workersCompensationRateID"),
    @XmlEnumValue("compensationID")
    COMPENSATION_ID("compensationID"),
    @XmlEnumValue("endDate")
    END_DATE("endDate"),
    @XmlEnumValue("privateLabelID")
    PRIVATE_LABEL_ID("privateLabelID"),
    @XmlEnumValue("rate")
    RATE("rate"),
    @XmlEnumValue("startDate")
    START_DATE("startDate");
    private final String value;

    WorkersCompensationRateApiProperty(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static WorkersCompensationRateApiProperty fromValue(String v) {
        for (WorkersCompensationRateApiProperty c: WorkersCompensationRateApiProperty.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
