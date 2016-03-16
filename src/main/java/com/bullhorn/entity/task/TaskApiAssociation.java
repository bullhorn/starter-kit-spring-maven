
package com.bullhorn.entity.task;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for taskApiAssociation.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="taskApiAssociation">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="childTasks"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "taskApiAssociation")
@XmlEnum
public enum TaskApiAssociation {

    @XmlEnumValue("childTasks")
    CHILD_TASKS("childTasks");
    private final String value;

    TaskApiAssociation(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TaskApiAssociation fromValue(String v) {
        for (TaskApiAssociation c: TaskApiAssociation.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
