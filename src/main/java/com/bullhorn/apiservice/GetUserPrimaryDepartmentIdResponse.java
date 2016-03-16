
package com.bullhorn.apiservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.bullhorn.apiservice.result.ApiGetUserPrimaryDepartmentIdResult;


/**
 * <p>Java class for getUserPrimaryDepartmentIdResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getUserPrimaryDepartmentIdResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" type="{http://result.apiservice.bullhorn.com/}apiGetUserPrimaryDepartmentIdResult" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getUserPrimaryDepartmentIdResponse", propOrder = {
    "_return"
})
public class GetUserPrimaryDepartmentIdResponse {

    @XmlElement(name = "return")
    protected ApiGetUserPrimaryDepartmentIdResult _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link ApiGetUserPrimaryDepartmentIdResult }
     *     
     */
    public ApiGetUserPrimaryDepartmentIdResult getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiGetUserPrimaryDepartmentIdResult }
     *     
     */
    public void setReturn(ApiGetUserPrimaryDepartmentIdResult value) {
        this._return = value;
    }

}
