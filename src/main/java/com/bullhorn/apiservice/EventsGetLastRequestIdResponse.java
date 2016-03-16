
package com.bullhorn.apiservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.bullhorn.apiservice.result.ApiEventsGetLastRequestIdResult;


/**
 * <p>Java class for eventsGetLastRequestIdResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="eventsGetLastRequestIdResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" type="{http://result.apiservice.bullhorn.com/}apiEventsGetLastRequestIdResult" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "eventsGetLastRequestIdResponse", propOrder = {
    "_return"
})
public class EventsGetLastRequestIdResponse {

    @XmlElement(name = "return")
    protected ApiEventsGetLastRequestIdResult _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link ApiEventsGetLastRequestIdResult }
     *     
     */
    public ApiEventsGetLastRequestIdResult getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiEventsGetLastRequestIdResult }
     *     
     */
    public void setReturn(ApiEventsGetLastRequestIdResult value) {
        this._return = value;
    }

}
