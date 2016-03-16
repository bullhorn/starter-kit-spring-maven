
package com.bullhorn.apiservice.result;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for apiEventsGetLastRequestIdResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="apiEventsGetLastRequestIdResult">
 *   &lt;complexContent>
 *     &lt;extension base="{http://result.apiservice.bullhorn.com/}apiResult">
 *       &lt;sequence>
 *         &lt;element name="lastRequestId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "apiEventsGetLastRequestIdResult", propOrder = {
    "lastRequestId"
})
public class ApiEventsGetLastRequestIdResult
    extends ApiResult
{

    protected long lastRequestId;

    /**
     * Gets the value of the lastRequestId property.
     * 
     */
    public long getLastRequestId() {
        return lastRequestId;
    }

    /**
     * Sets the value of the lastRequestId property.
     * 
     */
    public void setLastRequestId(long value) {
        this.lastRequestId = value;
    }

}
