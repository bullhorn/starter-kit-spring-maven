
package com.bullhorn.apiservice.result;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.bullhorn.apiservice.meta.FileMeta;


/**
 * <p>Java class for apiGetEntityFilesResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="apiGetEntityFilesResult">
 *   &lt;complexContent>
 *     &lt;extension base="{http://result.apiservice.bullhorn.com/}apiResult">
 *       &lt;sequence>
 *         &lt;element name="apiEntityMetas" type="{http://meta.apiservice.bullhorn.com/}fileMeta" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "apiGetEntityFilesResult", propOrder = {
    "apiEntityMetas"
})
public class ApiGetEntityFilesResult
    extends ApiResult
{

    @XmlElement(nillable = true)
    protected List<FileMeta> apiEntityMetas;

    /**
     * Gets the value of the apiEntityMetas property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the apiEntityMetas property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getApiEntityMetas().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FileMeta }
     * 
     * 
     */
    public List<FileMeta> getApiEntityMetas() {
        if (apiEntityMetas == null) {
            apiEntityMetas = new ArrayList<FileMeta>();
        }
        return this.apiEntityMetas;
    }

}
