
package com.bullhorn.entity.note;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for noteEntityApiProperty.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="noteEntityApiProperty">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="noteEntityID"/>
 *     &lt;enumeration value="noteID"/>
 *     &lt;enumeration value="targetEntityID"/>
 *     &lt;enumeration value="targetEntityName"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "noteEntityApiProperty")
@XmlEnum
public enum NoteEntityApiProperty {

    @XmlEnumValue("noteEntityID")
    NOTE_ENTITY_ID("noteEntityID"),
    @XmlEnumValue("noteID")
    NOTE_ID("noteID"),
    @XmlEnumValue("targetEntityID")
    TARGET_ENTITY_ID("targetEntityID"),
    @XmlEnumValue("targetEntityName")
    TARGET_ENTITY_NAME("targetEntityName");
    private final String value;

    NoteEntityApiProperty(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static NoteEntityApiProperty fromValue(String v) {
        for (NoteEntityApiProperty c: NoteEntityApiProperty.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
