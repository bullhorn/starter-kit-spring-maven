
package com.bullhorn.entity.invoice;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for invoiceGroupApiAssociation.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="invoiceGroupApiAssociation">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="clientCorporationInvoiceGroups"/>
 *     &lt;enumeration value="placements"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "invoiceGroupApiAssociation")
@XmlEnum
public enum InvoiceGroupApiAssociation {

    @XmlEnumValue("clientCorporationInvoiceGroups")
    CLIENT_CORPORATION_INVOICE_GROUPS("clientCorporationInvoiceGroups"),
    @XmlEnumValue("placements")
    PLACEMENTS("placements");
    private final String value;

    InvoiceGroupApiAssociation(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static InvoiceGroupApiAssociation fromValue(String v) {
        for (InvoiceGroupApiAssociation c: InvoiceGroupApiAssociation.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
