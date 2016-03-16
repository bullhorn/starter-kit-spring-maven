
package com.bullhorn.apiservice.result;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.bullhorn.entity.user.UserTypeDto;


/**
 * <p>Java class for apiGetUserTypesResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="apiGetUserTypesResult">
 *   &lt;complexContent>
 *     &lt;extension base="{http://result.apiservice.bullhorn.com/}apiResult">
 *       &lt;sequence>
 *         &lt;element name="userTypeDtos" type="{http://user.entity.bullhorn.com/}userTypeDto" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "apiGetUserTypesResult", propOrder = {
    "userTypeDtos"
})
public class ApiGetUserTypesResult
    extends ApiResult
{

    @XmlElement(nillable = true)
    protected List<UserTypeDto> userTypeDtos;

    /**
     * Gets the value of the userTypeDtos property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the userTypeDtos property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUserTypeDtos().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UserTypeDto }
     * 
     * 
     */
    public List<UserTypeDto> getUserTypeDtos() {
        if (userTypeDtos == null) {
            userTypeDtos = new ArrayList<UserTypeDto>();
        }
        return this.userTypeDtos;
    }

}
