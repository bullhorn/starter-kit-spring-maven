
package com.bullhorn.entity.candidate;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for sendoutApiProperty.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="sendoutApiProperty">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="sendoutID"/>
 *     &lt;enumeration value="candidateID"/>
 *     &lt;enumeration value="clientContactID"/>
 *     &lt;enumeration value="clientCorporationID"/>
 *     &lt;enumeration value="dateAdded"/>
 *     &lt;enumeration value="email"/>
 *     &lt;enumeration value="isRead"/>
 *     &lt;enumeration value="jobOrderID"/>
 *     &lt;enumeration value="migrateGUID"/>
 *     &lt;enumeration value="userID"/>
 *     &lt;enumeration value="userMessageID"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "sendoutApiProperty")
@XmlEnum
public enum SendoutApiProperty {

    @XmlEnumValue("sendoutID")
    SENDOUT_ID("sendoutID"),
    @XmlEnumValue("candidateID")
    CANDIDATE_ID("candidateID"),
    @XmlEnumValue("clientContactID")
    CLIENT_CONTACT_ID("clientContactID"),
    @XmlEnumValue("clientCorporationID")
    CLIENT_CORPORATION_ID("clientCorporationID"),
    @XmlEnumValue("dateAdded")
    DATE_ADDED("dateAdded"),
    @XmlEnumValue("email")
    EMAIL("email"),
    @XmlEnumValue("isRead")
    IS_READ("isRead"),
    @XmlEnumValue("jobOrderID")
    JOB_ORDER_ID("jobOrderID"),
    @XmlEnumValue("migrateGUID")
    MIGRATE_GUID("migrateGUID"),
    @XmlEnumValue("userID")
    USER_ID("userID"),
    @XmlEnumValue("userMessageID")
    USER_MESSAGE_ID("userMessageID");
    private final String value;

    SendoutApiProperty(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SendoutApiProperty fromValue(String v) {
        for (SendoutApiProperty c: SendoutApiProperty.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
