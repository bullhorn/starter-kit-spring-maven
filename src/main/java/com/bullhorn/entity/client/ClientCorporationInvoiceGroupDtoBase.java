
package com.bullhorn.entity.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.bullhorn.entity.AbstractDto;


/**
 * <p>Java class for clientCorporationInvoiceGroupDtoBase complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="clientCorporationInvoiceGroupDtoBase">
 *   &lt;complexContent>
 *     &lt;extension base="{http://entity.bullhorn.com/}abstractDto">
 *       &lt;sequence>
 *         &lt;element name="clientCorporationID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="clientCorporationInvoiceGroup" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="invoiceGroupID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "clientCorporationInvoiceGroupDtoBase", propOrder = {
    "clientCorporationID",
    "clientCorporationInvoiceGroup",
    "invoiceGroupID"
})
@XmlSeeAlso({
    ClientCorporationInvoiceGroupDto.class
})
public abstract class ClientCorporationInvoiceGroupDtoBase
    extends AbstractDto
{

    protected Integer clientCorporationID;
    protected Integer clientCorporationInvoiceGroup;
    protected Integer invoiceGroupID;

    /**
     * Gets the value of the clientCorporationID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getClientCorporationID() {
        return clientCorporationID;
    }

    /**
     * Sets the value of the clientCorporationID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setClientCorporationID(Integer value) {
        this.clientCorporationID = value;
    }

    /**
     * Gets the value of the clientCorporationInvoiceGroup property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getClientCorporationInvoiceGroup() {
        return clientCorporationInvoiceGroup;
    }

    /**
     * Sets the value of the clientCorporationInvoiceGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setClientCorporationInvoiceGroup(Integer value) {
        this.clientCorporationInvoiceGroup = value;
    }

    /**
     * Gets the value of the invoiceGroupID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getInvoiceGroupID() {
        return invoiceGroupID;
    }

    /**
     * Sets the value of the invoiceGroupID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setInvoiceGroupID(Integer value) {
        this.invoiceGroupID = value;
    }

}
