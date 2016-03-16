
package com.bullhorn.entity.client;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for clientCorporationInvoiceGroupApiProperty.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="clientCorporationInvoiceGroupApiProperty">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="clientCorporationInvoiceGroup"/>
 *     &lt;enumeration value="clientCorporationID"/>
 *     &lt;enumeration value="invoiceGroupID"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "clientCorporationInvoiceGroupApiProperty")
@XmlEnum
public enum ClientCorporationInvoiceGroupApiProperty {

    @XmlEnumValue("clientCorporationInvoiceGroup")
    CLIENT_CORPORATION_INVOICE_GROUP("clientCorporationInvoiceGroup"),
    @XmlEnumValue("clientCorporationID")
    CLIENT_CORPORATION_ID("clientCorporationID"),
    @XmlEnumValue("invoiceGroupID")
    INVOICE_GROUP_ID("invoiceGroupID");
    private final String value;

    ClientCorporationInvoiceGroupApiProperty(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ClientCorporationInvoiceGroupApiProperty fromValue(String v) {
        for (ClientCorporationInvoiceGroupApiProperty c: ClientCorporationInvoiceGroupApiProperty.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
