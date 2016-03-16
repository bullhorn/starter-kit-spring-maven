
package com.bullhorn.entity.client;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for clientCorporationCertificationApiProperty.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="clientCorporationCertificationApiProperty">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="clientCorporationCertificationID"/>
 *     &lt;enumeration value="certificationID"/>
 *     &lt;enumeration value="clientCorporationID"/>
 *     &lt;enumeration value="comments"/>
 *     &lt;enumeration value="dateLastModified"/>
 *     &lt;enumeration value="location"/>
 *     &lt;enumeration value="migrateGUID"/>
 *     &lt;enumeration value="modifyingUserID"/>
 *     &lt;enumeration value="offsetDays"/>
 *     &lt;enumeration value="quantity"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "clientCorporationCertificationApiProperty")
@XmlEnum
public enum ClientCorporationCertificationApiProperty {

    @XmlEnumValue("clientCorporationCertificationID")
    CLIENT_CORPORATION_CERTIFICATION_ID("clientCorporationCertificationID"),
    @XmlEnumValue("certificationID")
    CERTIFICATION_ID("certificationID"),
    @XmlEnumValue("clientCorporationID")
    CLIENT_CORPORATION_ID("clientCorporationID"),
    @XmlEnumValue("comments")
    COMMENTS("comments"),
    @XmlEnumValue("dateLastModified")
    DATE_LAST_MODIFIED("dateLastModified"),
    @XmlEnumValue("location")
    LOCATION("location"),
    @XmlEnumValue("migrateGUID")
    MIGRATE_GUID("migrateGUID"),
    @XmlEnumValue("modifyingUserID")
    MODIFYING_USER_ID("modifyingUserID"),
    @XmlEnumValue("offsetDays")
    OFFSET_DAYS("offsetDays"),
    @XmlEnumValue("quantity")
    QUANTITY("quantity");
    private final String value;

    ClientCorporationCertificationApiProperty(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ClientCorporationCertificationApiProperty fromValue(String v) {
        for (ClientCorporationCertificationApiProperty c: ClientCorporationCertificationApiProperty.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
