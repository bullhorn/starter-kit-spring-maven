
package com.bullhorn.entity.corp;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for costCenterApiProperty.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="costCenterApiProperty">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="costCenterID"/>
 *     &lt;enumeration value="corporationID"/>
 *     &lt;enumeration value="dateAdded"/>
 *     &lt;enumeration value="description"/>
 *     &lt;enumeration value="enabled"/>
 *     &lt;enumeration value="name"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "costCenterApiProperty")
@XmlEnum
public enum CostCenterApiProperty {

    @XmlEnumValue("costCenterID")
    COST_CENTER_ID("costCenterID"),
    @XmlEnumValue("corporationID")
    CORPORATION_ID("corporationID"),
    @XmlEnumValue("dateAdded")
    DATE_ADDED("dateAdded"),
    @XmlEnumValue("description")
    DESCRIPTION("description"),
    @XmlEnumValue("enabled")
    ENABLED("enabled"),
    @XmlEnumValue("name")
    NAME("name");
    private final String value;

    CostCenterApiProperty(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CostCenterApiProperty fromValue(String v) {
        for (CostCenterApiProperty c: CostCenterApiProperty.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
