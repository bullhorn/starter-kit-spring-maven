
package com.bullhorn.entity.template.client;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for clientCorporationTemplateApiAssociation.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="clientCorporationTemplateApiAssociation">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="templateAttributes"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "clientCorporationTemplateApiAssociation")
@XmlEnum
public enum ClientCorporationTemplateApiAssociation {

    @XmlEnumValue("templateAttributes")
    TEMPLATE_ATTRIBUTES("templateAttributes");
    private final String value;

    ClientCorporationTemplateApiAssociation(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ClientCorporationTemplateApiAssociation fromValue(String v) {
        for (ClientCorporationTemplateApiAssociation c: ClientCorporationTemplateApiAssociation.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
