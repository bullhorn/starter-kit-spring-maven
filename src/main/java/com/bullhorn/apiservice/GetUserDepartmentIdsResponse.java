
package com.bullhorn.apiservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.bullhorn.apiservice.result.ApiGetUserDepartmentIdsResult;


/**
 * <p>Java class for getUserDepartmentIdsResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getUserDepartmentIdsResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" type="{http://result.apiservice.bullhorn.com/}apiGetUserDepartmentIdsResult" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getUserDepartmentIdsResponse", propOrder = {
    "_return"
})
public class GetUserDepartmentIdsResponse {

    @XmlElement(name = "return")
    protected ApiGetUserDepartmentIdsResult _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link ApiGetUserDepartmentIdsResult }
     *     
     */
    public ApiGetUserDepartmentIdsResult getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiGetUserDepartmentIdsResult }
     *     
     */
    public void setReturn(ApiGetUserDepartmentIdsResult value) {
        this._return = value;
    }

}
