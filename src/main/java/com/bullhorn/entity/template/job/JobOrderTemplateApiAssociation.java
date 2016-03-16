
package com.bullhorn.entity.template.job;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for jobOrderTemplateApiAssociation.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="jobOrderTemplateApiAssociation">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="templateAttributes"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "jobOrderTemplateApiAssociation")
@XmlEnum
public enum JobOrderTemplateApiAssociation {

    @XmlEnumValue("templateAttributes")
    TEMPLATE_ATTRIBUTES("templateAttributes");
    private final String value;

    JobOrderTemplateApiAssociation(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static JobOrderTemplateApiAssociation fromValue(String v) {
        for (JobOrderTemplateApiAssociation c: JobOrderTemplateApiAssociation.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
