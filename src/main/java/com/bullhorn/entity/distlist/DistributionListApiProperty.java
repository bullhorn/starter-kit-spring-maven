
package com.bullhorn.entity.distlist;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for distributionListApiProperty.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="distributionListApiProperty">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="distributionListID"/>
 *     &lt;enumeration value="dateAdded"/>
 *     &lt;enumeration value="description"/>
 *     &lt;enumeration value="groupName"/>
 *     &lt;enumeration value="isPrivate"/>
 *     &lt;enumeration value="isReadOnly"/>
 *     &lt;enumeration value="migrateGUID"/>
 *     &lt;enumeration value="name"/>
 *     &lt;enumeration value="ownerID"/>
 *     &lt;enumeration value="searchURL"/>
 *     &lt;enumeration value="type"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "distributionListApiProperty")
@XmlEnum
public enum DistributionListApiProperty {

    @XmlEnumValue("distributionListID")
    DISTRIBUTION_LIST_ID("distributionListID"),
    @XmlEnumValue("dateAdded")
    DATE_ADDED("dateAdded"),
    @XmlEnumValue("description")
    DESCRIPTION("description"),
    @XmlEnumValue("groupName")
    GROUP_NAME("groupName"),
    @XmlEnumValue("isPrivate")
    IS_PRIVATE("isPrivate"),
    @XmlEnumValue("isReadOnly")
    IS_READ_ONLY("isReadOnly"),
    @XmlEnumValue("migrateGUID")
    MIGRATE_GUID("migrateGUID"),
    @XmlEnumValue("name")
    NAME("name"),
    @XmlEnumValue("ownerID")
    OWNER_ID("ownerID"),
    @XmlEnumValue("searchURL")
    SEARCH_URL("searchURL"),
    @XmlEnumValue("type")
    TYPE("type");
    private final String value;

    DistributionListApiProperty(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DistributionListApiProperty fromValue(String v) {
        for (DistributionListApiProperty c: DistributionListApiProperty.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
