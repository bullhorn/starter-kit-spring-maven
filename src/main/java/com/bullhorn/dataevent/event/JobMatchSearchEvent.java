
package com.bullhorn.dataevent.event;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for jobMatchSearchEvent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="jobMatchSearchEvent">
 *   &lt;complexContent>
 *     &lt;extension base="{http://event.dataevent.bullhorn.com/}dataEvent">
 *       &lt;sequence>
 *         &lt;element name="candidateIds" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="criteria" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="jobPostingId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="source" type="{http://event.dataevent.bullhorn.com/}jobMatchSearchSource" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "jobMatchSearchEvent", propOrder = {
    "candidateIds",
    "criteria",
    "jobPostingId",
    "source"
})
public class JobMatchSearchEvent
    extends DataEvent
{

    @XmlElement(nillable = true)
    protected List<Integer> candidateIds;
    protected String criteria;
    protected int jobPostingId;
    protected JobMatchSearchSource source;

    /**
     * Gets the value of the candidateIds property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the candidateIds property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCandidateIds().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Integer }
     * 
     * 
     */
    public List<Integer> getCandidateIds() {
        if (candidateIds == null) {
            candidateIds = new ArrayList<Integer>();
        }
        return this.candidateIds;
    }

    /**
     * Gets the value of the criteria property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCriteria() {
        return criteria;
    }

    /**
     * Sets the value of the criteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCriteria(String value) {
        this.criteria = value;
    }

    /**
     * Gets the value of the jobPostingId property.
     * 
     */
    public int getJobPostingId() {
        return jobPostingId;
    }

    /**
     * Sets the value of the jobPostingId property.
     * 
     */
    public void setJobPostingId(int value) {
        this.jobPostingId = value;
    }

    /**
     * Gets the value of the source property.
     * 
     * @return
     *     possible object is
     *     {@link JobMatchSearchSource }
     *     
     */
    public JobMatchSearchSource getSource() {
        return source;
    }

    /**
     * Sets the value of the source property.
     * 
     * @param value
     *     allowed object is
     *     {@link JobMatchSearchSource }
     *     
     */
    public void setSource(JobMatchSearchSource value) {
        this.source = value;
    }

}
