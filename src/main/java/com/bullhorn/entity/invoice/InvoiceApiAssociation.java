
package com.bullhorn.entity.invoice;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for invoiceApiAssociation.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="invoiceApiAssociation">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="invoiceItems"/>
 *     &lt;enumeration value="placements"/>
 *     &lt;enumeration value="timecardBatches"/>
 *     &lt;enumeration value="timecardExpenses"/>
 *     &lt;enumeration value="timecardTimes"/>
 *     &lt;enumeration value="timecards"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "invoiceApiAssociation")
@XmlEnum
public enum InvoiceApiAssociation {

    @XmlEnumValue("invoiceItems")
    INVOICE_ITEMS("invoiceItems"),
    @XmlEnumValue("placements")
    PLACEMENTS("placements"),
    @XmlEnumValue("timecardBatches")
    TIMECARD_BATCHES("timecardBatches"),
    @XmlEnumValue("timecardExpenses")
    TIMECARD_EXPENSES("timecardExpenses"),
    @XmlEnumValue("timecardTimes")
    TIMECARD_TIMES("timecardTimes"),
    @XmlEnumValue("timecards")
    TIMECARDS("timecards");
    private final String value;

    InvoiceApiAssociation(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static InvoiceApiAssociation fromValue(String v) {
        for (InvoiceApiAssociation c: InvoiceApiAssociation.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
