
package com.bullhorn.dataevent.event;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for entityEvent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="entityEvent">
 *   &lt;complexContent>
 *     &lt;extension base="{http://event.dataevent.bullhorn.com/}dataEvent">
 *       &lt;sequence>
 *         &lt;element name="entityEventType" type="{http://event.dataevent.bullhorn.com/}entityEventType" minOccurs="0"/>
 *         &lt;element name="entityId" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *         &lt;element name="entityName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "entityEvent", propOrder = {
    "entityEventType",
    "entityId",
    "entityName"
})
@XmlSeeAlso({
    EntityInsertedEvent.class,
    EntityUpdatedEvent.class,
    EntityDeletedEvent.class
})
public abstract class EntityEvent
    extends DataEvent
{

    protected EntityEventType entityEventType;
    protected Object entityId;
    protected String entityName;

    /**
     * Gets the value of the entityEventType property.
     * 
     * @return
     *     possible object is
     *     {@link EntityEventType }
     *     
     */
    public EntityEventType getEntityEventType() {
        return entityEventType;
    }

    /**
     * Sets the value of the entityEventType property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityEventType }
     *     
     */
    public void setEntityEventType(EntityEventType value) {
        this.entityEventType = value;
    }

    /**
     * Gets the value of the entityId property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getEntityId() {
        return entityId;
    }

    /**
     * Sets the value of the entityId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setEntityId(Object value) {
        this.entityId = value;
    }

    /**
     * Gets the value of the entityName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntityName() {
        return entityName;
    }

    /**
     * Sets the value of the entityName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntityName(String value) {
        this.entityName = value;
    }

}
