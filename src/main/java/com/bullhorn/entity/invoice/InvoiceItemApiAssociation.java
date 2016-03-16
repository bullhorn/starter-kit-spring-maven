
package com.bullhorn.entity.invoice;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for invoiceItemApiAssociation.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="invoiceItemApiAssociation">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="timecardExpenses"/>
 *     &lt;enumeration value="timecardTimes"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "invoiceItemApiAssociation")
@XmlEnum
public enum InvoiceItemApiAssociation {

    @XmlEnumValue("timecardExpenses")
    TIMECARD_EXPENSES("timecardExpenses"),
    @XmlEnumValue("timecardTimes")
    TIMECARD_TIMES("timecardTimes");
    private final String value;

    InvoiceItemApiAssociation(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static InvoiceItemApiAssociation fromValue(String v) {
        for (InvoiceItemApiAssociation c: InvoiceItemApiAssociation.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
