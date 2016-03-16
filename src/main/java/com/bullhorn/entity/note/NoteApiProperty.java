
package com.bullhorn.entity.note;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for noteApiProperty.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="noteApiProperty">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="noteID"/>
 *     &lt;enumeration value="action"/>
 *     &lt;enumeration value="bhTimeStamp"/>
 *     &lt;enumeration value="commentingPersonID"/>
 *     &lt;enumeration value="comments"/>
 *     &lt;enumeration value="dateAdded"/>
 *     &lt;enumeration value="isDeleted"/>
 *     &lt;enumeration value="jobOrderID"/>
 *     &lt;enumeration value="migrateGUID"/>
 *     &lt;enumeration value="minutesSpent"/>
 *     &lt;enumeration value="personReferenceID"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "noteApiProperty")
@XmlEnum
public enum NoteApiProperty {

    @XmlEnumValue("noteID")
    NOTE_ID("noteID"),
    @XmlEnumValue("action")
    ACTION("action"),
    @XmlEnumValue("bhTimeStamp")
    BH_TIME_STAMP("bhTimeStamp"),
    @XmlEnumValue("commentingPersonID")
    COMMENTING_PERSON_ID("commentingPersonID"),
    @XmlEnumValue("comments")
    COMMENTS("comments"),
    @XmlEnumValue("dateAdded")
    DATE_ADDED("dateAdded"),
    @XmlEnumValue("isDeleted")
    IS_DELETED("isDeleted"),
    @XmlEnumValue("jobOrderID")
    JOB_ORDER_ID("jobOrderID"),
    @XmlEnumValue("migrateGUID")
    MIGRATE_GUID("migrateGUID"),
    @XmlEnumValue("minutesSpent")
    MINUTES_SPENT("minutesSpent"),
    @XmlEnumValue("personReferenceID")
    PERSON_REFERENCE_ID("personReferenceID");
    private final String value;

    NoteApiProperty(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static NoteApiProperty fromValue(String v) {
        for (NoteApiProperty c: NoteApiProperty.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
