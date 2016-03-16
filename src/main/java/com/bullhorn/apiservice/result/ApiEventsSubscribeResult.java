
package com.bullhorn.apiservice.result;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.bullhorn.dataevent.subscription.SubscriptionMetaData;


/**
 * <p>Java class for apiEventsSubscribeResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="apiEventsSubscribeResult">
 *   &lt;complexContent>
 *     &lt;extension base="{http://result.apiservice.bullhorn.com/}apiResult">
 *       &lt;sequence>
 *         &lt;element name="subscriptionMetaData" type="{http://subscription.dataevent.bullhorn.com/}subscriptionMetaData" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "apiEventsSubscribeResult", propOrder = {
    "subscriptionMetaData"
})
public class ApiEventsSubscribeResult
    extends ApiResult
{

    protected SubscriptionMetaData subscriptionMetaData;

    /**
     * Gets the value of the subscriptionMetaData property.
     * 
     * @return
     *     possible object is
     *     {@link SubscriptionMetaData }
     *     
     */
    public SubscriptionMetaData getSubscriptionMetaData() {
        return subscriptionMetaData;
    }

    /**
     * Sets the value of the subscriptionMetaData property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubscriptionMetaData }
     *     
     */
    public void setSubscriptionMetaData(SubscriptionMetaData value) {
        this.subscriptionMetaData = value;
    }

}
