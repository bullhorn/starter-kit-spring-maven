
package com.bullhorn.apiservice.result;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.bullhorn.entity.AbstractDto;


/**
 * <p>Java class for apiFindMultipleResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="apiFindMultipleResult">
 *   &lt;complexContent>
 *     &lt;extension base="{http://result.apiservice.bullhorn.com/}apiResult">
 *       &lt;sequence>
 *         &lt;element name="dtos" type="{http://entity.bullhorn.com/}abstractDto" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "apiFindMultipleResult", propOrder = {
    "dtos"
})
public class ApiFindMultipleResult
    extends ApiResult
{

    @XmlElement(nillable = true)
    protected List<AbstractDto> dtos;

    /**
     * Gets the value of the dtos property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dtos property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDtos().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AbstractDto }
     * 
     * 
     */
    public List<AbstractDto> getDtos() {
        if (dtos == null) {
            dtos = new ArrayList<AbstractDto>();
        }
        return this.dtos;
    }

}
