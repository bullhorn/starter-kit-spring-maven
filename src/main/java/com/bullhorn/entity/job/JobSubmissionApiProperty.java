
package com.bullhorn.entity.job;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for jobSubmissionApiProperty.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="jobSubmissionApiProperty">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="jobSubmissionID"/>
 *     &lt;enumeration value="candidateID"/>
 *     &lt;enumeration value="dateAdded"/>
 *     &lt;enumeration value="dateWebResponse"/>
 *     &lt;enumeration value="isDeleted"/>
 *     &lt;enumeration value="isHidden"/>
 *     &lt;enumeration value="jobOrderID"/>
 *     &lt;enumeration value="migrateGUID"/>
 *     &lt;enumeration value="sendingUserID"/>
 *     &lt;enumeration value="source"/>
 *     &lt;enumeration value="status"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "jobSubmissionApiProperty")
@XmlEnum
public enum JobSubmissionApiProperty {

    @XmlEnumValue("jobSubmissionID")
    JOB_SUBMISSION_ID("jobSubmissionID"),
    @XmlEnumValue("candidateID")
    CANDIDATE_ID("candidateID"),
    @XmlEnumValue("dateAdded")
    DATE_ADDED("dateAdded"),
    @XmlEnumValue("dateWebResponse")
    DATE_WEB_RESPONSE("dateWebResponse"),
    @XmlEnumValue("isDeleted")
    IS_DELETED("isDeleted"),
    @XmlEnumValue("isHidden")
    IS_HIDDEN("isHidden"),
    @XmlEnumValue("jobOrderID")
    JOB_ORDER_ID("jobOrderID"),
    @XmlEnumValue("migrateGUID")
    MIGRATE_GUID("migrateGUID"),
    @XmlEnumValue("sendingUserID")
    SENDING_USER_ID("sendingUserID"),
    @XmlEnumValue("source")
    SOURCE("source"),
    @XmlEnumValue("status")
    STATUS("status");
    private final String value;

    JobSubmissionApiProperty(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static JobSubmissionApiProperty fromValue(String v) {
        for (JobSubmissionApiProperty c: JobSubmissionApiProperty.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
