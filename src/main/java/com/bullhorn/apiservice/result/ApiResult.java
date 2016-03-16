
package com.bullhorn.apiservice.result;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for apiResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="apiResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="session" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "apiResult", propOrder = {
    "session"
})
@XmlSeeAlso({
    ApiAssociateResult.class,
    ApiGetUserTypesResult.class,
    ApiGetUserPrimaryDepartmentIdResult.class,
    ApiGetEditHistoryResult.class,
    ApiUnassociateResult.class,
    ApiEventsSubscribeResult.class,
    ApiEventsGetEventsResult.class,
    ApiGetUserDepartmentIdsResult.class,
    ApiGetJobOrderTemplateMetadataResult.class,
    ApiParseResumeResult.class,
    ApiFindMultipleResult.class,
    ApiGetEntityMetadataResult.class,
    ApiEventsGetLastRequestIdResult.class,
    ApiGetEntityTemplateIdsResult.class,
    ApiFindResult.class,
    ApiEventsCountResult.class,
    ApiGetEntityFilesResult.class,
    ApiAddFileResult.class,
    ApiEventsUnsubscribeResult.class,
    ApiGetEntityFieldMapsResult.class,
    ApiGetViewLayoutResult.class,
    ApiGetUserTemplateMetadataResult.class,
    ApiDeleteFileResult.class,
    ApiSaveResult.class,
    ApiGetAssociationIdsResult.class,
    ApiGetEntityNotesResult.class,
    ApiGetEntityTemplateDataIdsResult.class,
    ApiGetEntityTemplateDataResult.class,
    ApiQueryResult.class,
    ApiGetFileResult.class,
    ApiStartSessionResult.class,
    ApiUpdateFileResult.class,
    ApiRemoveNoteReferenceResult.class,
    ApiGetNoteReferencesResult.class,
    ApiGetDepartmentUserIdsResult.class,
    ApiAddNoteReferenceResult.class,
    ApiGetClientCorporationTemplateMetadataResult.class
})
public class ApiResult {

    protected String session;

    /**
     * Gets the value of the session property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSession() {
        return session;
    }

    /**
     * Sets the value of the session property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSession(String value) {
        this.session = value;
    }

}
