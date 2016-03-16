
package com.bullhorn.apiservice.result;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.bullhorn.apiservice.struct.EntityNameIdPair;


/**
 * <p>Java class for apiGetNoteReferencesResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="apiGetNoteReferencesResult">
 *   &lt;complexContent>
 *     &lt;extension base="{http://result.apiservice.bullhorn.com/}apiResult">
 *       &lt;sequence>
 *         &lt;element name="entityList" type="{http://struct.apiservice.bullhorn.com/}entityNameIdPair" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "apiGetNoteReferencesResult", propOrder = {
    "entityList"
})
public class ApiGetNoteReferencesResult
    extends ApiResult
{

    @XmlElement(nillable = true)
    protected List<EntityNameIdPair> entityList;

    /**
     * Gets the value of the entityList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the entityList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEntityList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EntityNameIdPair }
     * 
     * 
     */
    public List<EntityNameIdPair> getEntityList() {
        if (entityList == null) {
            entityList = new ArrayList<EntityNameIdPair>();
        }
        return this.entityList;
    }

}
