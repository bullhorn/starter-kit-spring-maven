
package com.bullhorn.entity.invoice;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for invoiceGroupApiProperty.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="invoiceGroupApiProperty">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="invoiceGroupID"/>
 *     &lt;enumeration value="corporationID"/>
 *     &lt;enumeration value="dateAdded"/>
 *     &lt;enumeration value="dateLastModified"/>
 *     &lt;enumeration value="description"/>
 *     &lt;enumeration value="lastModifyingUserID"/>
 *     &lt;enumeration value="migrateGUID"/>
 *     &lt;enumeration value="name"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "invoiceGroupApiProperty")
@XmlEnum
public enum InvoiceGroupApiProperty {

    @XmlEnumValue("invoiceGroupID")
    INVOICE_GROUP_ID("invoiceGroupID"),
    @XmlEnumValue("corporationID")
    CORPORATION_ID("corporationID"),
    @XmlEnumValue("dateAdded")
    DATE_ADDED("dateAdded"),
    @XmlEnumValue("dateLastModified")
    DATE_LAST_MODIFIED("dateLastModified"),
    @XmlEnumValue("description")
    DESCRIPTION("description"),
    @XmlEnumValue("lastModifyingUserID")
    LAST_MODIFYING_USER_ID("lastModifyingUserID"),
    @XmlEnumValue("migrateGUID")
    MIGRATE_GUID("migrateGUID"),
    @XmlEnumValue("name")
    NAME("name");
    private final String value;

    InvoiceGroupApiProperty(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static InvoiceGroupApiProperty fromValue(String v) {
        for (InvoiceGroupApiProperty c: InvoiceGroupApiProperty.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
