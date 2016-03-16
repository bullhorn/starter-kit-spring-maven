
package com.bullhorn.entity.userwork;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for userWorkApiProperty.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="userWorkApiProperty">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="userWorkID"/>
 *     &lt;enumeration value="appointmentID"/>
 *     &lt;enumeration value="assessmentID"/>
 *     &lt;enumeration value="bhTimestamp"/>
 *     &lt;enumeration value="client"/>
 *     &lt;enumeration value="dateAdded"/>
 *     &lt;enumeration value="description"/>
 *     &lt;enumeration value="externalID"/>
 *     &lt;enumeration value="isAuction"/>
 *     &lt;enumeration value="isDeleted"/>
 *     &lt;enumeration value="isOpen"/>
 *     &lt;enumeration value="isSendOut"/>
 *     &lt;enumeration value="jobOrderID"/>
 *     &lt;enumeration value="migrateGUID"/>
 *     &lt;enumeration value="name"/>
 *     &lt;enumeration value="ownerID"/>
 *     &lt;enumeration value="placementID"/>
 *     &lt;enumeration value="price"/>
 *     &lt;enumeration value="published"/>
 *     &lt;enumeration value="quantity"/>
 *     &lt;enumeration value="saleTerms"/>
 *     &lt;enumeration value="saleType"/>
 *     &lt;enumeration value="sortOrder"/>
 *     &lt;enumeration value="timecardID"/>
 *     &lt;enumeration value="type"/>
 *     &lt;enumeration value="userFolderID"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "userWorkApiProperty")
@XmlEnum
public enum UserWorkApiProperty {

    @XmlEnumValue("userWorkID")
    USER_WORK_ID("userWorkID"),
    @XmlEnumValue("appointmentID")
    APPOINTMENT_ID("appointmentID"),
    @XmlEnumValue("assessmentID")
    ASSESSMENT_ID("assessmentID"),
    @XmlEnumValue("bhTimestamp")
    BH_TIMESTAMP("bhTimestamp"),
    @XmlEnumValue("client")
    CLIENT("client"),
    @XmlEnumValue("dateAdded")
    DATE_ADDED("dateAdded"),
    @XmlEnumValue("description")
    DESCRIPTION("description"),
    @XmlEnumValue("externalID")
    EXTERNAL_ID("externalID"),
    @XmlEnumValue("isAuction")
    IS_AUCTION("isAuction"),
    @XmlEnumValue("isDeleted")
    IS_DELETED("isDeleted"),
    @XmlEnumValue("isOpen")
    IS_OPEN("isOpen"),
    @XmlEnumValue("isSendOut")
    IS_SEND_OUT("isSendOut"),
    @XmlEnumValue("jobOrderID")
    JOB_ORDER_ID("jobOrderID"),
    @XmlEnumValue("migrateGUID")
    MIGRATE_GUID("migrateGUID"),
    @XmlEnumValue("name")
    NAME("name"),
    @XmlEnumValue("ownerID")
    OWNER_ID("ownerID"),
    @XmlEnumValue("placementID")
    PLACEMENT_ID("placementID"),
    @XmlEnumValue("price")
    PRICE("price"),
    @XmlEnumValue("published")
    PUBLISHED("published"),
    @XmlEnumValue("quantity")
    QUANTITY("quantity"),
    @XmlEnumValue("saleTerms")
    SALE_TERMS("saleTerms"),
    @XmlEnumValue("saleType")
    SALE_TYPE("saleType"),
    @XmlEnumValue("sortOrder")
    SORT_ORDER("sortOrder"),
    @XmlEnumValue("timecardID")
    TIMECARD_ID("timecardID"),
    @XmlEnumValue("type")
    TYPE("type"),
    @XmlEnumValue("userFolderID")
    USER_FOLDER_ID("userFolderID");
    private final String value;

    UserWorkApiProperty(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static UserWorkApiProperty fromValue(String v) {
        for (UserWorkApiProperty c: UserWorkApiProperty.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
