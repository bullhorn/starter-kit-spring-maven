package com.client.custom.service.formtrigger.standard;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.client.core.base.tools.enums.YesNo;
import com.client.core.formtrigger.service.AbstractFormTriggerService;
import com.client.core.formtrigger.workflow.traversing.impl.PlacementValidationTraverser;
import com.client.custom.CustomSettings;
import com.client.custom.service.formtrigger.PlacementFormTriggerService;

/**
 * Created by john.sullivan on 6/6/2016.
 */
@Service
public class StandardPlacementFormTriggerService extends AbstractFormTriggerService implements PlacementFormTriggerService {

    private final CustomSettings customSettings;

    @Autowired
    public StandardPlacementFormTriggerService(CustomSettings customSettings) {
        this.customSettings = customSettings;
    }

    @Override
    public boolean isPlacementApproved(PlacementValidationTraverser tasks) {
        Boolean placementStatusIsApproved = customSettings.getPlacementStatusApproved().equals(tasks.getFormTriggerHelper().getNewEntity().getStatus());

        if(tasks.isEdit()) {
            return placementStatusIsApproved
                && !customSettings.getPlacementStatusApproved().equals(tasks.getFormTriggerHelper().getOldEntity().getStatus());
        }

        return placementStatusIsApproved;
    }

    @Override
    public void validateApprovedPlacement(PlacementValidationTraverser tasks) {
        if(!YesNo.isYes(tasks.getFormTriggerHelper().getClientCorpration().getCustomText2())) {
            tasks.addFormResponse("error:placement.approved.client.creditcheck", getMessageUsingKey("placement.approved.client.creditcheck"));
        }
    }
}
