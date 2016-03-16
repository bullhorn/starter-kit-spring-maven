
package com.bullhorn.entity.privatelabel;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for privateLabelApiProperty.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="privateLabelApiProperty">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="privateLabelID"/>
 *     &lt;enumeration value="applicationID"/>
 *     &lt;enumeration value="attributeList"/>
 *     &lt;enumeration value="coBrandedTitle"/>
 *     &lt;enumeration value="coBrandedURL"/>
 *     &lt;enumeration value="dateAdded"/>
 *     &lt;enumeration value="defaultWebLeadRecruiterID"/>
 *     &lt;enumeration value="description"/>
 *     &lt;enumeration value="enabled"/>
 *     &lt;enumeration value="footerHTML"/>
 *     &lt;enumeration value="headerHTML"/>
 *     &lt;enumeration value="keyWords"/>
 *     &lt;enumeration value="name"/>
 *     &lt;enumeration value="noLookAndFeel"/>
 *     &lt;enumeration value="onLoadScript"/>
 *     &lt;enumeration value="parentPrivateLabelID"/>
 *     &lt;enumeration value="splashPage"/>
 *     &lt;enumeration value="styleHTML"/>
 *     &lt;enumeration value="title"/>
 *     &lt;enumeration value="type"/>
 *     &lt;enumeration value="url"/>
 *     &lt;enumeration value="userTypeID"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "privateLabelApiProperty")
@XmlEnum
public enum PrivateLabelApiProperty {

    @XmlEnumValue("privateLabelID")
    PRIVATE_LABEL_ID("privateLabelID"),
    @XmlEnumValue("applicationID")
    APPLICATION_ID("applicationID"),
    @XmlEnumValue("attributeList")
    ATTRIBUTE_LIST("attributeList"),
    @XmlEnumValue("coBrandedTitle")
    CO_BRANDED_TITLE("coBrandedTitle"),
    @XmlEnumValue("coBrandedURL")
    CO_BRANDED_URL("coBrandedURL"),
    @XmlEnumValue("dateAdded")
    DATE_ADDED("dateAdded"),
    @XmlEnumValue("defaultWebLeadRecruiterID")
    DEFAULT_WEB_LEAD_RECRUITER_ID("defaultWebLeadRecruiterID"),
    @XmlEnumValue("description")
    DESCRIPTION("description"),
    @XmlEnumValue("enabled")
    ENABLED("enabled"),
    @XmlEnumValue("footerHTML")
    FOOTER_HTML("footerHTML"),
    @XmlEnumValue("headerHTML")
    HEADER_HTML("headerHTML"),
    @XmlEnumValue("keyWords")
    KEY_WORDS("keyWords"),
    @XmlEnumValue("name")
    NAME("name"),
    @XmlEnumValue("noLookAndFeel")
    NO_LOOK_AND_FEEL("noLookAndFeel"),
    @XmlEnumValue("onLoadScript")
    ON_LOAD_SCRIPT("onLoadScript"),
    @XmlEnumValue("parentPrivateLabelID")
    PARENT_PRIVATE_LABEL_ID("parentPrivateLabelID"),
    @XmlEnumValue("splashPage")
    SPLASH_PAGE("splashPage"),
    @XmlEnumValue("styleHTML")
    STYLE_HTML("styleHTML"),
    @XmlEnumValue("title")
    TITLE("title"),
    @XmlEnumValue("type")
    TYPE("type"),
    @XmlEnumValue("url")
    URL("url"),
    @XmlEnumValue("userTypeID")
    USER_TYPE_ID("userTypeID");
    private final String value;

    PrivateLabelApiProperty(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PrivateLabelApiProperty fromValue(String v) {
        for (PrivateLabelApiProperty c: PrivateLabelApiProperty.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
