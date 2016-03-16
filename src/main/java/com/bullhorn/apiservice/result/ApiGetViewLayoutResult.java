
package com.bullhorn.apiservice.result;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.bullhorn.apiservice.meta.ViewLayout;


/**
 * <p>Java class for apiGetViewLayoutResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="apiGetViewLayoutResult">
 *   &lt;complexContent>
 *     &lt;extension base="{http://result.apiservice.bullhorn.com/}apiResult">
 *       &lt;sequence>
 *         &lt;element name="viewLayout" type="{http://meta.apiservice.bullhorn.com/}viewLayout" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "apiGetViewLayoutResult", propOrder = {
    "viewLayout"
})
public class ApiGetViewLayoutResult
    extends ApiResult
{

    protected ViewLayout viewLayout;

    /**
     * Gets the value of the viewLayout property.
     * 
     * @return
     *     possible object is
     *     {@link ViewLayout }
     *     
     */
    public ViewLayout getViewLayout() {
        return viewLayout;
    }

    /**
     * Sets the value of the viewLayout property.
     * 
     * @param value
     *     allowed object is
     *     {@link ViewLayout }
     *     
     */
    public void setViewLayout(ViewLayout value) {
        this.viewLayout = value;
    }

}
