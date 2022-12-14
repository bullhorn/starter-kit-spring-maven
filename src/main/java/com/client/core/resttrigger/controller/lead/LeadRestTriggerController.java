package com.client.core.resttrigger.controller.lead;

import com.bullhornsdk.data.model.entity.core.standard.Lead;
import com.client.core.base.model.relatedentity.LeadRelatedEntity;
import com.client.core.base.workflow.node.TriggerValidator;
import com.client.core.resttrigger.controller.AbstractRestTriggerController;
import com.client.core.resttrigger.model.api.RestTriggerRequest;
import com.client.core.resttrigger.model.api.RestTriggerResponse;
import com.client.core.resttrigger.model.helper.impl.LeadRestTriggerHelper;
import com.client.core.resttrigger.workflow.traversing.LeadRestTriggerTraverser;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;
import java.util.Optional;

@Controller
@RequestMapping("${rest.prefix.core}/lead/*")
public class LeadRestTriggerController extends AbstractRestTriggerController<Lead, LeadRestTriggerHelper, LeadRestTriggerTraverser> {

    private final Logger log = Logger.getLogger(LeadRestTriggerController.class);

    @Autowired
    public LeadRestTriggerController(Optional<List<TriggerValidator<Lead, LeadRestTriggerHelper, LeadRestTriggerTraverser>>> triggerValidators) {
        super(Lead.class, triggerValidators, LeadRelatedEntity.values());
    }

    /**
     * Called when lead is added.
     *
     * @param body
     *
     * @return the json parsed form response message
     */
    @RequestMapping(value = { "add" }, method = RequestMethod.POST, produces = { MediaType.APPLICATION_JSON_VALUE })
    @ResponseBody
    public RestTriggerResponse addEntity(@RequestBody String body) {
        log.info("---------------------------- Starting Lead Add Validation Process From Rest Trigger ----------------------------------------");

	    Map<String, Object> valuesChanges = (Map<String, Object>) convertToMap(body).get("data");

	    RestTriggerRequest<Lead> restTriggerRequest = convertToObject(body);

	    Integer entityID = restTriggerRequest.getMeta().getEntityId();
	    Integer updatingUserID = restTriggerRequest.getMeta().getUserId();

	    LeadRestTriggerTraverser traverser = new LeadRestTriggerTraverser(entityID, valuesChanges, updatingUserID, false, getRelatedEntityFields());

	    return handleRequest(traverser, valuesChanges);
    }

    /**
     * Called when lead is edited.
     *
     * @param body
     *
     * @return the json parsed form response message
     */
    @RequestMapping(value = { "edit" }, method = RequestMethod.POST, produces = { MediaType.APPLICATION_JSON_VALUE })
    @ResponseBody
    public RestTriggerResponse editEntity(@RequestBody String body) {
        log.info("---------------------------- Starting Lead Edit Validation Process From Rest Trigger ----------------------------------------");

	    Map<String, Object> valuesChanges = (Map<String, Object>) convertToMap(body).get("data");

	    RestTriggerRequest<Lead> restTriggerRequest = convertToObject(body);

	    Integer entityID = restTriggerRequest.getMeta().getEntityId();
	    Integer updatingUserID = restTriggerRequest.getMeta().getUserId();

	    LeadRestTriggerTraverser traverser = new LeadRestTriggerTraverser(entityID, valuesChanges, updatingUserID, true, getRelatedEntityFields());

	    return handleRequest(traverser, valuesChanges);
    }

}
