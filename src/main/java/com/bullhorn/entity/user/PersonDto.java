
package com.bullhorn.entity.user;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.bullhorn.entity.candidate.CandidateDtoBase;
import com.bullhorn.entity.client.ClientContactDtoBase;


/**
 * <p>Java class for personDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="personDto">
 *   &lt;complexContent>
 *     &lt;extension base="{http://user.entity.bullhorn.com/}personDtoBase">
 *       &lt;sequence>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "personDto")
@XmlSeeAlso({
    CorporateUserDtoBase.class,
    CandidateDtoBase.class,
    ClientContactDtoBase.class
})
public abstract class PersonDto
    extends PersonDtoBase
{


}
