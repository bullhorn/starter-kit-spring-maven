
package com.bullhorn.entity.job;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for placementApiAssociation.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="placementApiAssociation">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="appointments"/>
 *     &lt;enumeration value="changeRequests"/>
 *     &lt;enumeration value="commissions"/>
 *     &lt;enumeration value="housingAmenities"/>
 *     &lt;enumeration value="invoiceItems"/>
 *     &lt;enumeration value="jobSubmission"/>
 *     &lt;enumeration value="surveys"/>
 *     &lt;enumeration value="tasks"/>
 *     &lt;enumeration value="timeUnits"/>
 *     &lt;enumeration value="timecardExpenses"/>
 *     &lt;enumeration value="timecardTimes"/>
 *     &lt;enumeration value="timecards"/>
 *     &lt;enumeration value="userWorks"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "placementApiAssociation")
@XmlEnum
public enum PlacementApiAssociation {

    @XmlEnumValue("appointments")
    APPOINTMENTS("appointments"),
    @XmlEnumValue("changeRequests")
    CHANGE_REQUESTS("changeRequests"),
    @XmlEnumValue("commissions")
    COMMISSIONS("commissions"),
    @XmlEnumValue("housingAmenities")
    HOUSING_AMENITIES("housingAmenities"),
    @XmlEnumValue("invoiceItems")
    INVOICE_ITEMS("invoiceItems"),
    @XmlEnumValue("jobSubmission")
    JOB_SUBMISSION("jobSubmission"),
    @XmlEnumValue("surveys")
    SURVEYS("surveys"),
    @XmlEnumValue("tasks")
    TASKS("tasks"),
    @XmlEnumValue("timeUnits")
    TIME_UNITS("timeUnits"),
    @XmlEnumValue("timecardExpenses")
    TIMECARD_EXPENSES("timecardExpenses"),
    @XmlEnumValue("timecardTimes")
    TIMECARD_TIMES("timecardTimes"),
    @XmlEnumValue("timecards")
    TIMECARDS("timecards"),
    @XmlEnumValue("userWorks")
    USER_WORKS("userWorks");
    private final String value;

    PlacementApiAssociation(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PlacementApiAssociation fromValue(String v) {
        for (PlacementApiAssociation c: PlacementApiAssociation.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
