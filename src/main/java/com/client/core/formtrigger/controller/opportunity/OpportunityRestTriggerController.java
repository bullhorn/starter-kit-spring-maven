package com.client.core.formtrigger.controller.opportunity;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bullhornsdk.data.api.BullhornData;
import com.bullhornsdk.data.model.entity.core.standard.Opportunity;
import com.client.core.base.tools.entitychanger.EntityChanger;
import com.client.core.base.tools.web.MediaTypes;
import com.client.core.base.workflow.node.Node;
import com.client.core.formtrigger.controller.AbstractRestTriggerController;
import com.client.core.formtrigger.model.api.RestTriggerRequest;
import com.client.core.formtrigger.model.api.RestTriggerResponse;
import com.client.core.formtrigger.workflow.traversing.impl.OpportunityValidationTraverser;

/**
 * Created by hiqbal on 12/21/2015.
 */
@Controller
@RequestMapping("/resttrigger/opportunity/*")
public class OpportunityRestTriggerController extends AbstractRestTriggerController<Opportunity, OpportunityValidationTraverser> {

    private final Logger log = Logger.getLogger(OpportunityRestTriggerController.class);

    @Autowired
    public OpportunityRestTriggerController(@Qualifier("opportunityValidationWorkflow") Node<OpportunityValidationTraverser> opportunityValidationWorkflow,
                                            BullhornData bullhornData, EntityChanger entityChanger) {
        super(bullhornData, Opportunity.class, opportunityValidationWorkflow, entityChanger);
    }

    /**
     * Called when opportunity is added.
     *
     * @param restTriggerRequest
     *            contains all the relevant data from the form
     * @param response
     * @param request
     * @return the json parsed form response message
     */
    @RequestMapping(value = { "add" }, method = RequestMethod.POST, produces = { MediaTypes.JSON })
    @ResponseBody
    public RestTriggerResponse<Opportunity> addEntity(@RequestBody RestTriggerRequest<Opportunity> restTriggerRequest, HttpServletResponse response, HttpServletRequest request) {
        log.info("---------------------------- Starting Opp Validation Process From Rest Trigger ----------------------------------------");

        Opportunity opportunity = restTriggerRequest.getData();
        Integer updatingUserID = restTriggerRequest.getMeta().getUserId();

        OpportunityValidationTraverser traverser = new OpportunityValidationTraverser(opportunity, updatingUserID, false, true, bullhornData);

        return handleRequest(traverser);

    }

    /**
     * Called when job is edited.
     *
     * @param restTriggerRequest
     *            contains all the relevant data from the form
     * @return the json parsed form response message
     */
    @RequestMapping(value = { "edit" }, method = RequestMethod.POST, produces = { MediaTypes.JSON })
    @ResponseBody
    public RestTriggerResponse<Opportunity> editEntity(@RequestBody RestTriggerRequest<Opportunity> restTriggerRequest, HttpServletResponse response, HttpServletRequest request) {

        log.info("---------------------------- Starting Opp Validation Process From Rest Trigger ----------------------------------------");

        Opportunity opportunity = restTriggerRequest.getData();
        Integer updatingUserID = restTriggerRequest.getMeta().getUserId();

        OpportunityValidationTraverser traverser = new OpportunityValidationTraverser(opportunity, updatingUserID, true, true, bullhornData);

        return handleRequest(traverser);
    }

}
