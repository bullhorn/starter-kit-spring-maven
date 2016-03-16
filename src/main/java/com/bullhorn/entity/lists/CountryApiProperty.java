
package com.bullhorn.entity.lists;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for countryApiProperty.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="countryApiProperty">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="countryID"/>
 *     &lt;enumeration value="code"/>
 *     &lt;enumeration value="name"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "countryApiProperty")
@XmlEnum
public enum CountryApiProperty {

    @XmlEnumValue("countryID")
    COUNTRY_ID("countryID"),
    @XmlEnumValue("code")
    CODE("code"),
    @XmlEnumValue("name")
    NAME("name");
    private final String value;

    CountryApiProperty(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CountryApiProperty fromValue(String v) {
        for (CountryApiProperty c: CountryApiProperty.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
