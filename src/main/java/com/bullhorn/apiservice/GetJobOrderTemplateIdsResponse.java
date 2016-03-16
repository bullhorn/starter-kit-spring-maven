
package com.bullhorn.apiservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.bullhorn.apiservice.result.ApiGetEntityTemplateIdsResult;


/**
 * <p>Java class for getJobOrderTemplateIdsResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getJobOrderTemplateIdsResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" type="{http://result.apiservice.bullhorn.com/}apiGetEntityTemplateIdsResult" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getJobOrderTemplateIdsResponse", propOrder = {
    "_return"
})
public class GetJobOrderTemplateIdsResponse {

    @XmlElement(name = "return")
    protected ApiGetEntityTemplateIdsResult _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link ApiGetEntityTemplateIdsResult }
     *     
     */
    public ApiGetEntityTemplateIdsResult getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiGetEntityTemplateIdsResult }
     *     
     */
    public void setReturn(ApiGetEntityTemplateIdsResult value) {
        this._return = value;
    }

}
