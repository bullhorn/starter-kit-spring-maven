
package com.bullhorn.dataevent.subscription;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.bullhorn.dataevent.event.EntityEventType;


/**
 * <p>Java class for entityEventSubscriptionCriteria complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="entityEventSubscriptionCriteria">
 *   &lt;complexContent>
 *     &lt;extension base="{http://subscription.dataevent.bullhorn.com/}subscriptionCriteria">
 *       &lt;sequence>
 *         &lt;element name="entityEventTypes" type="{http://event.dataevent.bullhorn.com/}entityEventType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="entityNames" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "entityEventSubscriptionCriteria", propOrder = {
    "entityEventTypes",
    "entityNames"
})
public class EntityEventSubscriptionCriteria
    extends SubscriptionCriteria
{

    @XmlElement(nillable = true)
    protected List<EntityEventType> entityEventTypes;
    @XmlElement(nillable = true)
    protected List<String> entityNames;

    /**
     * Gets the value of the entityEventTypes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the entityEventTypes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEntityEventTypes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EntityEventType }
     * 
     * 
     */
    public List<EntityEventType> getEntityEventTypes() {
        if (entityEventTypes == null) {
            entityEventTypes = new ArrayList<EntityEventType>();
        }
        return this.entityEventTypes;
    }

    /**
     * Gets the value of the entityNames property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the entityNames property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEntityNames().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getEntityNames() {
        if (entityNames == null) {
            entityNames = new ArrayList<String>();
        }
        return this.entityNames;
    }

}
