package com.client.custom.service.formtrigger.standard;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.client.core.formtrigger.service.AbstractFormTriggerService;
import com.client.core.formtrigger.workflow.traversing.impl.CandidateValidationTraverser;
import com.client.custom.CustomSettings;
import com.client.custom.service.formtrigger.CandidateFormTriggerService;

/**
 * Created by john.sullivan on 6/6/2016.
 */
@Service
public class StandardCandidateFormTriggerService extends AbstractFormTriggerService implements CandidateFormTriggerService {

    private final CustomSettings customSettings;

    @Autowired
    public StandardCandidateFormTriggerService(CustomSettings customSettings) {
        this.customSettings = customSettings;
    }

    @Override
    public boolean isCandidateActive(CandidateValidationTraverser tasks) {
        Boolean candidateStatusIsActive = customSettings.getCandidateStatusActive().equals(tasks.getFormTriggerHelper().getNewEntity().getStatus());

        if(tasks.isEdit()) {
            return candidateStatusIsActive
                && !customSettings.getCandidateStatusActive().equals(tasks.getFormTriggerHelper().getOldEntity().getStatus());
        }

        return candidateStatusIsActive;
    }

    @Override
    public void validateActiveCandidate(CandidateValidationTraverser tasks) {
        String phoneNumber = tasks.getFormTriggerHelper().getNewEntity().getPhone();

        if(StringUtils.isBlank(phoneNumber)) {
            tasks.addFormResponse("error:candidate.active.phonenumber", getMessageUsingKey("candidate.active.phonenumber"));
        }
    }
}
