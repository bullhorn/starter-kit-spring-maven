
package com.bullhorn.entity.corp;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for corporationDepartmentApiProperty.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="corporationDepartmentApiProperty">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="departmentID"/>
 *     &lt;enumeration value="costCenterID"/>
 *     &lt;enumeration value="dateAdded"/>
 *     &lt;enumeration value="description"/>
 *     &lt;enumeration value="enabled"/>
 *     &lt;enumeration value="name"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "corporationDepartmentApiProperty")
@XmlEnum
public enum CorporationDepartmentApiProperty {

    @XmlEnumValue("departmentID")
    DEPARTMENT_ID("departmentID"),
    @XmlEnumValue("costCenterID")
    COST_CENTER_ID("costCenterID"),
    @XmlEnumValue("dateAdded")
    DATE_ADDED("dateAdded"),
    @XmlEnumValue("description")
    DESCRIPTION("description"),
    @XmlEnumValue("enabled")
    ENABLED("enabled"),
    @XmlEnumValue("name")
    NAME("name");
    private final String value;

    CorporationDepartmentApiProperty(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CorporationDepartmentApiProperty fromValue(String v) {
        for (CorporationDepartmentApiProperty c: CorporationDepartmentApiProperty.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
