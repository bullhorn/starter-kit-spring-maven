
package com.bullhorn.entity.invoice;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for invoiceItemApiProperty.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="invoiceItemApiProperty">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="invoiceItemID"/>
 *     &lt;enumeration value="dateAdded"/>
 *     &lt;enumeration value="description"/>
 *     &lt;enumeration value="invoiceID"/>
 *     &lt;enumeration value="migrateGUID"/>
 *     &lt;enumeration value="payPeriod"/>
 *     &lt;enumeration value="placementID"/>
 *     &lt;enumeration value="quantity"/>
 *     &lt;enumeration value="rate"/>
 *     &lt;enumeration value="taxRate"/>
 *     &lt;enumeration value="unit"/>
 *     &lt;enumeration value="unitOld"/>
 *     &lt;enumeration value="wasManuallyCreated"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "invoiceItemApiProperty")
@XmlEnum
public enum InvoiceItemApiProperty {

    @XmlEnumValue("invoiceItemID")
    INVOICE_ITEM_ID("invoiceItemID"),
    @XmlEnumValue("dateAdded")
    DATE_ADDED("dateAdded"),
    @XmlEnumValue("description")
    DESCRIPTION("description"),
    @XmlEnumValue("invoiceID")
    INVOICE_ID("invoiceID"),
    @XmlEnumValue("migrateGUID")
    MIGRATE_GUID("migrateGUID"),
    @XmlEnumValue("payPeriod")
    PAY_PERIOD("payPeriod"),
    @XmlEnumValue("placementID")
    PLACEMENT_ID("placementID"),
    @XmlEnumValue("quantity")
    QUANTITY("quantity"),
    @XmlEnumValue("rate")
    RATE("rate"),
    @XmlEnumValue("taxRate")
    TAX_RATE("taxRate"),
    @XmlEnumValue("unit")
    UNIT("unit"),
    @XmlEnumValue("unitOld")
    UNIT_OLD("unitOld"),
    @XmlEnumValue("wasManuallyCreated")
    WAS_MANUALLY_CREATED("wasManuallyCreated");
    private final String value;

    InvoiceItemApiProperty(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static InvoiceItemApiProperty fromValue(String v) {
        for (InvoiceItemApiProperty c: InvoiceItemApiProperty.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
