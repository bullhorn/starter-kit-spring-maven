
package com.bullhorn.entity.invoice;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for invoiceApiProperty.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="invoiceApiProperty">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="invoiceID"/>
 *     &lt;enumeration value="amountPaid"/>
 *     &lt;enumeration value="clientCorporationID"/>
 *     &lt;enumeration value="comments"/>
 *     &lt;enumeration value="costCenter"/>
 *     &lt;enumeration value="dateAdded"/>
 *     &lt;enumeration value="dateBegin"/>
 *     &lt;enumeration value="dateDue"/>
 *     &lt;enumeration value="dateEnd"/>
 *     &lt;enumeration value="dateExported"/>
 *     &lt;enumeration value="dateInvoice"/>
 *     &lt;enumeration value="dateLastModified"/>
 *     &lt;enumeration value="fileExportID"/>
 *     &lt;enumeration value="invoiceBatchID"/>
 *     &lt;enumeration value="isDeleted"/>
 *     &lt;enumeration value="isExported"/>
 *     &lt;enumeration value="migrateGUID"/>
 *     &lt;enumeration value="outstandingBalance"/>
 *     &lt;enumeration value="recipientUserID"/>
 *     &lt;enumeration value="status"/>
 *     &lt;enumeration value="terms"/>
 *     &lt;enumeration value="userID"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "invoiceApiProperty")
@XmlEnum
public enum InvoiceApiProperty {

    @XmlEnumValue("invoiceID")
    INVOICE_ID("invoiceID"),
    @XmlEnumValue("amountPaid")
    AMOUNT_PAID("amountPaid"),
    @XmlEnumValue("clientCorporationID")
    CLIENT_CORPORATION_ID("clientCorporationID"),
    @XmlEnumValue("comments")
    COMMENTS("comments"),
    @XmlEnumValue("costCenter")
    COST_CENTER("costCenter"),
    @XmlEnumValue("dateAdded")
    DATE_ADDED("dateAdded"),
    @XmlEnumValue("dateBegin")
    DATE_BEGIN("dateBegin"),
    @XmlEnumValue("dateDue")
    DATE_DUE("dateDue"),
    @XmlEnumValue("dateEnd")
    DATE_END("dateEnd"),
    @XmlEnumValue("dateExported")
    DATE_EXPORTED("dateExported"),
    @XmlEnumValue("dateInvoice")
    DATE_INVOICE("dateInvoice"),
    @XmlEnumValue("dateLastModified")
    DATE_LAST_MODIFIED("dateLastModified"),
    @XmlEnumValue("fileExportID")
    FILE_EXPORT_ID("fileExportID"),
    @XmlEnumValue("invoiceBatchID")
    INVOICE_BATCH_ID("invoiceBatchID"),
    @XmlEnumValue("isDeleted")
    IS_DELETED("isDeleted"),
    @XmlEnumValue("isExported")
    IS_EXPORTED("isExported"),
    @XmlEnumValue("migrateGUID")
    MIGRATE_GUID("migrateGUID"),
    @XmlEnumValue("outstandingBalance")
    OUTSTANDING_BALANCE("outstandingBalance"),
    @XmlEnumValue("recipientUserID")
    RECIPIENT_USER_ID("recipientUserID"),
    @XmlEnumValue("status")
    STATUS("status"),
    @XmlEnumValue("terms")
    TERMS("terms"),
    @XmlEnumValue("userID")
    USER_ID("userID");
    private final String value;

    InvoiceApiProperty(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static InvoiceApiProperty fromValue(String v) {
        for (InvoiceApiProperty c: InvoiceApiProperty.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
