package com.client.core.resttrigger.controller.opportunity;

import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bullhornsdk.data.model.entity.core.standard.Opportunity;
import com.client.core.base.workflow.node.TriggerValidator;
import com.client.core.resttrigger.controller.AbstractRestTriggerController;
import com.client.core.resttrigger.model.api.RestTriggerRequest;
import com.client.core.resttrigger.model.api.RestTriggerResponse;
import com.client.core.resttrigger.model.helper.impl.OpportunityRestTriggerHelper;
import com.client.core.resttrigger.workflow.traversing.OpportunityRestTriggerTraverser;

/**
 * Created by hiqbal on 12/21/2015.
 */
@Controller
@RequestMapping("/resttrigger/opportunity/*")
public class OpportunityRestTriggerController extends AbstractRestTriggerController<Opportunity, OpportunityRestTriggerHelper, OpportunityRestTriggerTraverser> {

    private final Logger log = Logger.getLogger(OpportunityRestTriggerController.class);

    @Autowired(required = false)
    public OpportunityRestTriggerController(List<TriggerValidator<Opportunity, OpportunityRestTriggerHelper, OpportunityRestTriggerTraverser>> triggerValidators) {
        super(Opportunity.class, triggerValidators);
    }

    /**
     * Called when opportunity is added.
     *
     * @param body
     *
     * @return the json parsed form response message
     */
    @RequestMapping(value = { "add" }, method = RequestMethod.POST, produces = { MediaType.APPLICATION_JSON_UTF8_VALUE })
    @ResponseBody
    public RestTriggerResponse addEntity(@RequestBody String body) {
        log.info("---------------------------- Starting Opp Add Validation Process From Rest Trigger ----------------------------------------");

	    Map<String, Object> valuesChanges = (Map<String, Object>) convertToMap(body).get("data");

	    RestTriggerRequest<Opportunity> restTriggerRequest = convertToObject(body);

	    Integer entityID = restTriggerRequest.getMeta().getEntityId();
	    Integer updatingUserID = restTriggerRequest.getMeta().getUserId();

	    OpportunityRestTriggerTraverser traverser = new OpportunityRestTriggerTraverser(entityID, valuesChanges, updatingUserID, false, bullhornData);

	    return handleRequest(traverser, valuesChanges);
    }

    /**
     * Called when opportunity is edited.
     *
     * @param body
     *
     * @return the json parsed form response message
     */
    @RequestMapping(value = { "edit" }, method = RequestMethod.POST, produces = { MediaType.APPLICATION_JSON_UTF8_VALUE })
    @ResponseBody
    public RestTriggerResponse editEntity(@RequestBody String body) {
        log.info("---------------------------- Starting Opp Edit Validation Process From Rest Trigger ----------------------------------------");

	    Map<String, Object> valuesChanges = (Map<String, Object>) convertToMap(body).get("data");

	    RestTriggerRequest<Opportunity> restTriggerRequest = convertToObject(body);

	    Integer entityID = restTriggerRequest.getMeta().getEntityId();
	    Integer updatingUserID = restTriggerRequest.getMeta().getUserId();

	    OpportunityRestTriggerTraverser traverser = new OpportunityRestTriggerTraverser(entityID, valuesChanges, updatingUserID, true, bullhornData);

	    return handleRequest(traverser, valuesChanges);
    }

}
