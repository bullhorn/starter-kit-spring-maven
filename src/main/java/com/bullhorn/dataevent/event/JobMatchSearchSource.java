
package com.bullhorn.dataevent.event;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for jobMatchSearchSource.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="jobMatchSearchSource">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="BULLHORN"/>
 *     &lt;enumeration value="MONSTER"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "jobMatchSearchSource")
@XmlEnum
public enum JobMatchSearchSource {

    BULLHORN,
    MONSTER;

    public String value() {
        return name();
    }

    public static JobMatchSearchSource fromValue(String v) {
        return valueOf(v);
    }

}
