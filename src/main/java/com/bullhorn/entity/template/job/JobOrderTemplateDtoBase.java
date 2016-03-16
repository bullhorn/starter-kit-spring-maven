
package com.bullhorn.entity.template.job;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.bullhorn.entity.template.EntityTemplateDto;


/**
 * <p>Java class for jobOrderTemplateDtoBase complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="jobOrderTemplateDtoBase">
 *   &lt;complexContent>
 *     &lt;extension base="{http://template.entity.bullhorn.com/}entityTemplateDto">
 *       &lt;sequence>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="entityList" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "jobOrderTemplateDtoBase", propOrder = {
    "description",
    "entityList"
})
@XmlSeeAlso({
    JobOrderTemplateDto.class
})
public abstract class JobOrderTemplateDtoBase
    extends EntityTemplateDto
{

    protected String description;
    protected String entityList;

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the entityList property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntityList() {
        return entityList;
    }

    /**
     * Sets the value of the entityList property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntityList(String value) {
        this.entityList = value;
    }

}
