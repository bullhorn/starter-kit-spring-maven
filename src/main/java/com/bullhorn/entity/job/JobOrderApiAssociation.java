
package com.bullhorn.entity.job;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for jobOrderApiAssociation.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="jobOrderApiAssociation">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="appointments"/>
 *     &lt;enumeration value="assignedUsers"/>
 *     &lt;enumeration value="businessSectors"/>
 *     &lt;enumeration value="categories"/>
 *     &lt;enumeration value="certifications"/>
 *     &lt;enumeration value="notes"/>
 *     &lt;enumeration value="placements"/>
 *     &lt;enumeration value="skills"/>
 *     &lt;enumeration value="specialties"/>
 *     &lt;enumeration value="submissions"/>
 *     &lt;enumeration value="tasks"/>
 *     &lt;enumeration value="timeUnits"/>
 *     &lt;enumeration value="userWorks"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "jobOrderApiAssociation")
@XmlEnum
public enum JobOrderApiAssociation {

    @XmlEnumValue("appointments")
    APPOINTMENTS("appointments"),
    @XmlEnumValue("assignedUsers")
    ASSIGNED_USERS("assignedUsers"),
    @XmlEnumValue("businessSectors")
    BUSINESS_SECTORS("businessSectors"),
    @XmlEnumValue("categories")
    CATEGORIES("categories"),
    @XmlEnumValue("certifications")
    CERTIFICATIONS("certifications"),
    @XmlEnumValue("notes")
    NOTES("notes"),
    @XmlEnumValue("placements")
    PLACEMENTS("placements"),
    @XmlEnumValue("skills")
    SKILLS("skills"),
    @XmlEnumValue("specialties")
    SPECIALTIES("specialties"),
    @XmlEnumValue("submissions")
    SUBMISSIONS("submissions"),
    @XmlEnumValue("tasks")
    TASKS("tasks"),
    @XmlEnumValue("timeUnits")
    TIME_UNITS("timeUnits"),
    @XmlEnumValue("userWorks")
    USER_WORKS("userWorks");
    private final String value;

    JobOrderApiAssociation(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static JobOrderApiAssociation fromValue(String v) {
        for (JobOrderApiAssociation c: JobOrderApiAssociation.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
