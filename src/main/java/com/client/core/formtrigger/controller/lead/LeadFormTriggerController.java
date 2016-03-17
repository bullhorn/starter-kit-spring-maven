package com.client.core.formtrigger.controller.lead;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bullhornsdk.data.api.BullhornData;
import com.bullhornsdk.data.model.entity.core.standard.Lead;
import com.client.core.base.tools.web.MediaTypes;
import com.client.core.base.workflow.node.Node;
import com.client.core.formtrigger.controller.AbstractFormTriggerController;
import com.client.core.formtrigger.model.form.impl.FormLeadDto;
import com.client.core.formtrigger.workflow.traversing.impl.LeadValidationTraverser;

/**
 * Created by hiqbal on 12/23/2015.
 */
@Controller
@RequestMapping("/formtrigger/lead/*")
public class LeadFormTriggerController extends AbstractFormTriggerController<Lead, LeadValidationTraverser> {

    private final Logger log = Logger.getLogger(LeadFormTriggerController.class);

    @Autowired
    public LeadFormTriggerController(@Qualifier("leadValidationWorkflow") Node<LeadValidationTraverser> leadValidationWorkflow,
                                     BullhornData bullhornData) {
        super(bullhornData, Lead.class, leadValidationWorkflow);
    }

    /**
     * Called when lead is added.
     *
     * @param formLeadDto
     *            contains all the relevant data from the form
     * @param updatingUserID
     *            id of corporate user who saved the form
     * @return the json parsed form response message
     */
    @RequestMapping(value = { "add" }, method = RequestMethod.POST, produces = { MediaTypes.JSON })
    @ResponseBody
    public String addEntity(@ModelAttribute FormLeadDto formLeadDto, @RequestParam("ft.userId") Integer updatingUserID) {
        log.info("---------------------------- Starting Lead Validation Process----------------------------------------");

        LeadValidationTraverser traverser = new LeadValidationTraverser(formLeadDto, updatingUserID, false, bullhornData);

        return handleRequest(traverser);

    }

    /**
     * Called when lead is edited.
     *
     * @param formLeadDto
     *            contains all the relevant data from the form
     * @param updatingUserID
     *            id of corporate user who saved the form
     * @return the json parsed form response message
     */
    @RequestMapping(value = { "edit" }, method = RequestMethod.POST, produces = { MediaTypes.JSON })
    @ResponseBody
    public String editEntity(@ModelAttribute FormLeadDto formLeadDto, @RequestParam("ft.userId") Integer updatingUserID) {

        log.info("---------------------------- Starting Lead Validation Process----------------------------------------");

        LeadValidationTraverser traverser = new LeadValidationTraverser(formLeadDto, updatingUserID, true, bullhornData);

        return handleRequest(traverser);
    }
}
