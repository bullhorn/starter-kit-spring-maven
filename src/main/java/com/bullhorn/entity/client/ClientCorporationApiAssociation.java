
package com.bullhorn.entity.client;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for clientCorporationApiAssociation.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="clientCorporationApiAssociation">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="certifications"/>
 *     &lt;enumeration value="childClientCorporations"/>
 *     &lt;enumeration value="clientContacts"/>
 *     &lt;enumeration value="invoiceGroups"/>
 *     &lt;enumeration value="invoices"/>
 *     &lt;enumeration value="rateCards"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "clientCorporationApiAssociation")
@XmlEnum
public enum ClientCorporationApiAssociation {

    @XmlEnumValue("certifications")
    CERTIFICATIONS("certifications"),
    @XmlEnumValue("childClientCorporations")
    CHILD_CLIENT_CORPORATIONS("childClientCorporations"),
    @XmlEnumValue("clientContacts")
    CLIENT_CONTACTS("clientContacts"),
    @XmlEnumValue("invoiceGroups")
    INVOICE_GROUPS("invoiceGroups"),
    @XmlEnumValue("invoices")
    INVOICES("invoices"),
    @XmlEnumValue("rateCards")
    RATE_CARDS("rateCards");
    private final String value;

    ClientCorporationApiAssociation(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ClientCorporationApiAssociation fromValue(String v) {
        for (ClientCorporationApiAssociation c: ClientCorporationApiAssociation.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
