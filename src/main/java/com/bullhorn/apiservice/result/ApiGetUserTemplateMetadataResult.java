
package com.bullhorn.apiservice.result;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.bullhorn.entity.template.user.UserTemplateAttributeDto;
import com.bullhorn.entity.template.user.UserTemplateDto;


/**
 * <p>Java class for apiGetUserTemplateMetadataResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="apiGetUserTemplateMetadataResult">
 *   &lt;complexContent>
 *     &lt;extension base="{http://result.apiservice.bullhorn.com/}apiResult">
 *       &lt;sequence>
 *         &lt;element name="attributes" type="{http://user.template.entity.bullhorn.com/}userTemplateAttributeDto" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="template" type="{http://user.template.entity.bullhorn.com/}userTemplateDto" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "apiGetUserTemplateMetadataResult", propOrder = {
    "attributes",
    "template"
})
public class ApiGetUserTemplateMetadataResult
    extends ApiResult
{

    @XmlElement(nillable = true)
    protected List<UserTemplateAttributeDto> attributes;
    protected UserTemplateDto template;

    /**
     * Gets the value of the attributes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the attributes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAttributes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UserTemplateAttributeDto }
     * 
     * 
     */
    public List<UserTemplateAttributeDto> getAttributes() {
        if (attributes == null) {
            attributes = new ArrayList<UserTemplateAttributeDto>();
        }
        return this.attributes;
    }

    /**
     * Gets the value of the template property.
     * 
     * @return
     *     possible object is
     *     {@link UserTemplateDto }
     *     
     */
    public UserTemplateDto getTemplate() {
        return template;
    }

    /**
     * Sets the value of the template property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserTemplateDto }
     *     
     */
    public void setTemplate(UserTemplateDto value) {
        this.template = value;
    }

}
