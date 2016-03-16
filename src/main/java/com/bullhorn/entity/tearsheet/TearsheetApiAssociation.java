
package com.bullhorn.entity.tearsheet;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tearsheetApiAssociation.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="tearsheetApiAssociation">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="candidates"/>
 *     &lt;enumeration value="clientContacts"/>
 *     &lt;enumeration value="jobOrders"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "tearsheetApiAssociation")
@XmlEnum
public enum TearsheetApiAssociation {

    @XmlEnumValue("candidates")
    CANDIDATES("candidates"),
    @XmlEnumValue("clientContacts")
    CLIENT_CONTACTS("clientContacts"),
    @XmlEnumValue("jobOrders")
    JOB_ORDERS("jobOrders");
    private final String value;

    TearsheetApiAssociation(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TearsheetApiAssociation fromValue(String v) {
        for (TearsheetApiAssociation c: TearsheetApiAssociation.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
