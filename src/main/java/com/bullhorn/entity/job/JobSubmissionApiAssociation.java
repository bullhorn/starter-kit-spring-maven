
package com.bullhorn.entity.job;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for jobSubmissionApiAssociation.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="jobSubmissionApiAssociation">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="appointments"/>
 *     &lt;enumeration value="tasks"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "jobSubmissionApiAssociation")
@XmlEnum
public enum JobSubmissionApiAssociation {

    @XmlEnumValue("appointments")
    APPOINTMENTS("appointments"),
    @XmlEnumValue("tasks")
    TASKS("tasks");
    private final String value;

    JobSubmissionApiAssociation(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static JobSubmissionApiAssociation fromValue(String v) {
        for (JobSubmissionApiAssociation c: JobSubmissionApiAssociation.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
