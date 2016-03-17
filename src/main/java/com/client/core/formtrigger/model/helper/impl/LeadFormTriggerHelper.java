package com.client.core.formtrigger.model.helper.impl;

import com.bullhornsdk.data.api.BullhornData;
import com.bullhornsdk.data.model.entity.core.standard.ClientContact;
import com.bullhornsdk.data.model.entity.core.standard.ClientCorporation;
import com.bullhornsdk.data.model.entity.core.standard.CorporateUser;
import com.bullhornsdk.data.model.entity.core.standard.Lead;
import com.client.core.formtrigger.model.form.impl.FormLeadDto;
import com.client.core.formtrigger.model.helper.AbstractFormTriggerHelper;

/**
 * Created by hiqbal on 12/23/2015.
 */
public class LeadFormTriggerHelper extends AbstractFormTriggerHelper<FormLeadDto, Lead> {

    private CorporateUser jobOwner;
    private ClientCorporation clientCorporation;
    private ClientContact clientContact;

    public LeadFormTriggerHelper(FormLeadDto formLeadDto, Integer updatingUserID, BullhornData bullhornData) {
        super(formLeadDto, updatingUserID, bullhornData);
    }
    public LeadFormTriggerHelper(Lead lead, Integer updatingUserID, BullhornData bullhornData) {
        super(FormLeadDto.instantiateFromLead(lead), updatingUserID, bullhornData);
        this.newEntity = lead;
    }

    @Override
    public Integer getUpdatingUserID() {
        return updatingUserID;
    }

    @Override
    public Lead getNewEntity() {
        if (newEntity == null) {
            setNewEntity(getFormValues().instantiateEntity());
        }
        return newEntity;
    }

    @Override
    public void setNewEntity(Lead newDto) {
        this.newEntity = newDto;
    }

    @Override
    public Lead getOldEntity() {
        if (oldEntity == null) {

            setOldEntity(super.findLead(Integer.parseInt(getFormValues().getLeadID())));
        }
        return oldEntity;
    }

    @Override
    public void setOldEntity(Lead oldDto) {
        this.oldEntity = oldDto;
    }

    /**
     * Gets the owner of the job
     *
     * @return a CorporateUserDto
     */
    public CorporateUser getJobOwner() {
        if (jobOwner == null) {
            setJobOwner(findCorporateUser(Integer.parseInt(getFormValues().getUserID())));
        }

        return jobOwner;
    }

    public void setJobOwner(CorporateUser jobOwner) {
        this.jobOwner = jobOwner;
    }

    /**
     * Gets the client corporation connected to the job
     *
     * @return a ClientCorporationDto
     */
    public ClientCorporation getClientCorpration() {
        if (clientCorporation == null) {
            setClientCorporation(findClientCorporation(Integer.parseInt(getFormValues().getClientCorporationID())));
        }

        return clientCorporation;
    }

    public void setClientCorporation(ClientCorporation clientCorporation) {
        this.clientCorporation = clientCorporation;
    }
    /**
     * Gets the client corporation connected to the job
     *
     * @return a ClientCorporationDto
     */
    public ClientContact getClientContact() {
        if (clientContact == null) {
            setClientContact(findClientContact(Integer.parseInt(getFormValues().getClientContactID())));
        }

        return clientContact;
    }

    public void setClientContact(ClientContact clientContact) {
        this.clientContact = clientContact;
    }
}
