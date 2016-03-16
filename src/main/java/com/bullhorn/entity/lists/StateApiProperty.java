
package com.bullhorn.entity.lists;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for stateApiProperty.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="stateApiProperty">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="stateID"/>
 *     &lt;enumeration value="code"/>
 *     &lt;enumeration value="countryID"/>
 *     &lt;enumeration value="name"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "stateApiProperty")
@XmlEnum
public enum StateApiProperty {

    @XmlEnumValue("stateID")
    STATE_ID("stateID"),
    @XmlEnumValue("code")
    CODE("code"),
    @XmlEnumValue("countryID")
    COUNTRY_ID("countryID"),
    @XmlEnumValue("name")
    NAME("name");
    private final String value;

    StateApiProperty(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static StateApiProperty fromValue(String v) {
        for (StateApiProperty c: StateApiProperty.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
