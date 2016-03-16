
package com.bullhorn.apiservice.result;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.bullhorn.apiservice.meta.ApiEntityMeta;


/**
 * <p>Java class for apiGetEntityMetadataResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="apiGetEntityMetadataResult">
 *   &lt;complexContent>
 *     &lt;extension base="{http://result.apiservice.bullhorn.com/}apiResult">
 *       &lt;sequence>
 *         &lt;element name="apiEntityMeta" type="{http://meta.apiservice.bullhorn.com/}apiEntityMeta" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "apiGetEntityMetadataResult", propOrder = {
    "apiEntityMeta"
})
public class ApiGetEntityMetadataResult
    extends ApiResult
{

    protected ApiEntityMeta apiEntityMeta;

    /**
     * Gets the value of the apiEntityMeta property.
     * 
     * @return
     *     possible object is
     *     {@link ApiEntityMeta }
     *     
     */
    public ApiEntityMeta getApiEntityMeta() {
        return apiEntityMeta;
    }

    /**
     * Sets the value of the apiEntityMeta property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiEntityMeta }
     *     
     */
    public void setApiEntityMeta(ApiEntityMeta value) {
        this.apiEntityMeta = value;
    }

}
