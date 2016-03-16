
package com.bullhorn.entity.timecard;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for timecardExpenseApiProperty.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="timecardExpenseApiProperty">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="timecardExpenseID"/>
 *     &lt;enumeration value="amount"/>
 *     &lt;enumeration value="comments"/>
 *     &lt;enumeration value="dateAdded"/>
 *     &lt;enumeration value="dateExpensed"/>
 *     &lt;enumeration value="fileExportID"/>
 *     &lt;enumeration value="invoiceID"/>
 *     &lt;enumeration value="invoiceItemID"/>
 *     &lt;enumeration value="lastModifyingPersonID"/>
 *     &lt;enumeration value="migrateGUID"/>
 *     &lt;enumeration value="payClassID"/>
 *     &lt;enumeration value="placementID"/>
 *     &lt;enumeration value="projectID"/>
 *     &lt;enumeration value="status"/>
 *     &lt;enumeration value="timecardID"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "timecardExpenseApiProperty")
@XmlEnum
public enum TimecardExpenseApiProperty {

    @XmlEnumValue("timecardExpenseID")
    TIMECARD_EXPENSE_ID("timecardExpenseID"),
    @XmlEnumValue("amount")
    AMOUNT("amount"),
    @XmlEnumValue("comments")
    COMMENTS("comments"),
    @XmlEnumValue("dateAdded")
    DATE_ADDED("dateAdded"),
    @XmlEnumValue("dateExpensed")
    DATE_EXPENSED("dateExpensed"),
    @XmlEnumValue("fileExportID")
    FILE_EXPORT_ID("fileExportID"),
    @XmlEnumValue("invoiceID")
    INVOICE_ID("invoiceID"),
    @XmlEnumValue("invoiceItemID")
    INVOICE_ITEM_ID("invoiceItemID"),
    @XmlEnumValue("lastModifyingPersonID")
    LAST_MODIFYING_PERSON_ID("lastModifyingPersonID"),
    @XmlEnumValue("migrateGUID")
    MIGRATE_GUID("migrateGUID"),
    @XmlEnumValue("payClassID")
    PAY_CLASS_ID("payClassID"),
    @XmlEnumValue("placementID")
    PLACEMENT_ID("placementID"),
    @XmlEnumValue("projectID")
    PROJECT_ID("projectID"),
    @XmlEnumValue("status")
    STATUS("status"),
    @XmlEnumValue("timecardID")
    TIMECARD_ID("timecardID");
    private final String value;

    TimecardExpenseApiProperty(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TimecardExpenseApiProperty fromValue(String v) {
        for (TimecardExpenseApiProperty c: TimecardExpenseApiProperty.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
