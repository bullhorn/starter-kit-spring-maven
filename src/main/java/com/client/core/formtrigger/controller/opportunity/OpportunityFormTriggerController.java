package com.client.core.formtrigger.controller.opportunity;

import com.bullhornsdk.data.model.entity.core.standard.Opportunity;
import com.client.core.base.model.relatedentity.OpportunityRelatedEntity;
import com.client.core.base.workflow.node.TriggerValidator;
import com.client.core.formtrigger.controller.AbstractFormTriggerController;
import com.client.core.formtrigger.model.form.impl.FormOpportunityDto;
import com.client.core.formtrigger.model.helper.impl.OpportunityFormTriggerHelper;
import com.client.core.formtrigger.workflow.traversing.OpportunityFormTriggerTraverser;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/formtrigger/opportunity/*")
public class OpportunityFormTriggerController extends AbstractFormTriggerController<Opportunity, OpportunityFormTriggerHelper, OpportunityFormTriggerTraverser> {

    private final Logger log = Logger.getLogger(OpportunityFormTriggerController.class);

    @Autowired
    public OpportunityFormTriggerController(Optional<List<TriggerValidator<Opportunity, OpportunityFormTriggerHelper, OpportunityFormTriggerTraverser>>> triggerValidators) {
        super(Opportunity.class, triggerValidators, OpportunityRelatedEntity.values());
    }

    /**
     * Called when lead is added.
     *
     * @param formOpportunityDEto
     *            contains all the relevant data from the form
     * @param updatingUserID
     *            id of corporate user who saved the form
     * @return the json parsed form response message
     */
    @RequestMapping(value = { "add" }, method = RequestMethod.POST, produces = { MediaType.APPLICATION_JSON_UTF8_VALUE })
    @ResponseBody
    public String addEntity(@ModelAttribute FormOpportunityDto formOpportunityDEto, @RequestParam("ft.userId") Integer updatingUserID) {
        log.info("---------------------------- Starting Opportunity Validation Process----------------------------------------");

        OpportunityFormTriggerTraverser traverser = new OpportunityFormTriggerTraverser(formOpportunityDEto, updatingUserID, false, getRelatedEntityFields());

        return handleRequest(traverser);
    }

    /**
     * Called when lead is edited.
     *
     * @param formOpportunityDEto
     *            contains all the relevant data from the form
     * @param updatingUserID
     *            id of corporate user who saved the form
     * @return the json parsed form response message
     */
    @RequestMapping(value = { "edit" }, method = RequestMethod.POST, produces = { MediaType.APPLICATION_JSON_UTF8_VALUE })
    @ResponseBody
    public String editEntity(@ModelAttribute FormOpportunityDto formOpportunityDEto, @RequestParam("ft.userId") Integer updatingUserID) {
        log.info("---------------------------- Starting Opportunity Validation Process----------------------------------------");

        OpportunityFormTriggerTraverser traverser = new OpportunityFormTriggerTraverser(formOpportunityDEto, updatingUserID, true, getRelatedEntityFields());

        return handleRequest(traverser);
    }
}
