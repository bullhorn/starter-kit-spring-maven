
package com.bullhorn.apiservice.result;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.bullhorn.apiservice.meta.ApiFieldMap;


/**
 * <p>Java class for apiGetEntityFieldMapsResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="apiGetEntityFieldMapsResult">
 *   &lt;complexContent>
 *     &lt;extension base="{http://result.apiservice.bullhorn.com/}apiResult">
 *       &lt;sequence>
 *         &lt;element name="fieldMaps" type="{http://meta.apiservice.bullhorn.com/}apiFieldMap" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "apiGetEntityFieldMapsResult", propOrder = {
    "fieldMaps"
})
public class ApiGetEntityFieldMapsResult
    extends ApiResult
{

    @XmlElement(nillable = true)
    protected List<ApiFieldMap> fieldMaps;

    /**
     * Gets the value of the fieldMaps property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fieldMaps property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFieldMaps().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ApiFieldMap }
     * 
     * 
     */
    public List<ApiFieldMap> getFieldMaps() {
        if (fieldMaps == null) {
            fieldMaps = new ArrayList<ApiFieldMap>();
        }
        return this.fieldMaps;
    }

}
