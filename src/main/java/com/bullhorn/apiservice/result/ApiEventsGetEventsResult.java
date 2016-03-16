
package com.bullhorn.apiservice.result;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.bullhorn.dataevent.result.GetEventsResults;


/**
 * <p>Java class for apiEventsGetEventsResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="apiEventsGetEventsResult">
 *   &lt;complexContent>
 *     &lt;extension base="{http://result.apiservice.bullhorn.com/}apiResult">
 *       &lt;sequence>
 *         &lt;element name="results" type="{http://result.dataevent.bullhorn.com/}getEventsResults" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "apiEventsGetEventsResult", propOrder = {
    "results"
})
public class ApiEventsGetEventsResult
    extends ApiResult
{

    protected GetEventsResults results;

    /**
     * Gets the value of the results property.
     * 
     * @return
     *     possible object is
     *     {@link GetEventsResults }
     *     
     */
    public GetEventsResults getResults() {
        return results;
    }

    /**
     * Sets the value of the results property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetEventsResults }
     *     
     */
    public void setResults(GetEventsResults value) {
        this.results = value;
    }

}
