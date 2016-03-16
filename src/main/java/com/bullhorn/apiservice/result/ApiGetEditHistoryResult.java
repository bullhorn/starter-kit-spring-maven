
package com.bullhorn.apiservice.result;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.bullhorn.apiservice.edithistory.ApiEditHistory;


/**
 * <p>Java class for apiGetEditHistoryResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="apiGetEditHistoryResult">
 *   &lt;complexContent>
 *     &lt;extension base="{http://result.apiservice.bullhorn.com/}apiResult">
 *       &lt;sequence>
 *         &lt;element name="editHistories" type="{http://edithistory.apiservice.bullhorn.com/}apiEditHistory" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "apiGetEditHistoryResult", propOrder = {
    "editHistories"
})
public class ApiGetEditHistoryResult
    extends ApiResult
{

    @XmlElement(nillable = true)
    protected List<ApiEditHistory> editHistories;

    /**
     * Gets the value of the editHistories property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the editHistories property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEditHistories().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ApiEditHistory }
     * 
     * 
     */
    public List<ApiEditHistory> getEditHistories() {
        if (editHistories == null) {
            editHistories = new ArrayList<ApiEditHistory>();
        }
        return this.editHistories;
    }

}
