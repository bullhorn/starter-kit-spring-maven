
package com.bullhorn.dataevent.event;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dataEventType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dataEventType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ENTITY"/>
 *     &lt;enumeration value="JOB_MATCH_SEARCH"/>
 *     &lt;enumeration value="FIELDMAP_CHANGE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dataEventType")
@XmlEnum
public enum DataEventType {

    ENTITY,
    JOB_MATCH_SEARCH,
    FIELDMAP_CHANGE;

    public String value() {
        return name();
    }

    public static DataEventType fromValue(String v) {
        return valueOf(v);
    }

}
