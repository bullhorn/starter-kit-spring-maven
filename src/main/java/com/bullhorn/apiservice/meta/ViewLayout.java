
package com.bullhorn.apiservice.meta;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for viewLayout complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="viewLayout">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="available" type="{http://meta.apiservice.bullhorn.com/}apiFieldMap" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="selected" type="{http://meta.apiservice.bullhorn.com/}apiFieldMap" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "viewLayout", propOrder = {
    "available",
    "selected"
})
public class ViewLayout {

    @XmlElement(nillable = true)
    protected List<ApiFieldMap> available;
    @XmlElement(nillable = true)
    protected List<ApiFieldMap> selected;

    /**
     * Gets the value of the available property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the available property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAvailable().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ApiFieldMap }
     * 
     * 
     */
    public List<ApiFieldMap> getAvailable() {
        if (available == null) {
            available = new ArrayList<ApiFieldMap>();
        }
        return this.available;
    }

    /**
     * Gets the value of the selected property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the selected property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSelected().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ApiFieldMap }
     * 
     * 
     */
    public List<ApiFieldMap> getSelected() {
        if (selected == null) {
            selected = new ArrayList<ApiFieldMap>();
        }
        return this.selected;
    }

}
