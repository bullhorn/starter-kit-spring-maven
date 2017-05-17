package com.client.core.resttrigger.controller.clientcontact;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bullhornsdk.data.model.entity.core.standard.ClientContact;
import com.client.core.base.workflow.node.TriggerValidator;
import com.client.core.resttrigger.controller.AbstractRestTriggerController;
import com.client.core.resttrigger.model.api.RestTriggerRequest;
import com.client.core.resttrigger.model.api.RestTriggerResponse;
import com.client.core.resttrigger.model.helper.impl.ClientContactRestTriggerHelper;
import com.client.core.resttrigger.workflow.traversing.ClientContactRestTriggerTraverser;

/**
 * Created by hiqbal on 12/16/2015.
 */
@Controller
@RequestMapping("/resttrigger/clientcontact/*")
public class ClientContactRestTriggerController extends AbstractRestTriggerController<ClientContact, ClientContactRestTriggerHelper, ClientContactRestTriggerTraverser> {

    private final Logger log = Logger.getLogger(ClientContactRestTriggerController.class);

    @Autowired
    public ClientContactRestTriggerController(Optional<List<TriggerValidator<ClientContact, ClientContactRestTriggerHelper, ClientContactRestTriggerTraverser>>> triggerValidators) {
        super(ClientContact.class, triggerValidators);
    }

    /**
     * Called when client contact is added
     *
     * @param body
     *
     * @return the json parsed form response message
     */
    @RequestMapping(value = { "add" }, method = RequestMethod.POST, produces = { MediaType.APPLICATION_JSON_UTF8_VALUE })
    @ResponseBody
    public RestTriggerResponse addEntity(@RequestBody String body) {
        log.info("---------------------------- Starting Client Contact Add Validation Process From Rest Trigger ----------------------------------------");

	    Map<String, Object> valuesChanges = (Map<String, Object>) convertToMap(body).get("data");

	    RestTriggerRequest<ClientContact> restTriggerRequest = convertToObject(body);

	    Integer entityID = restTriggerRequest.getMeta().getEntityId();
	    Integer updatingUserID = restTriggerRequest.getMeta().getUserId();

	    ClientContactRestTriggerTraverser traverser = new ClientContactRestTriggerTraverser(entityID, valuesChanges, updatingUserID, false, bullhornData);

	    return handleRequest(traverser, valuesChanges);
    }

    /**
     * Called when client contact is edited
     *
     * @param body
     *
     * @return the json parsed form response message
     */
    @RequestMapping(value = { "edit" }, method = RequestMethod.POST, produces = { MediaType.APPLICATION_JSON_UTF8_VALUE })
    @ResponseBody
    public RestTriggerResponse editEntity(@RequestBody String body) {
        log.info("---------------------------- Starting Client Contact Edit Validation Process From Rest Trigger ----------------------------------------");

        Map<String, Object> valuesChanges = (Map<String, Object>) convertToMap(body).get("data");

        RestTriggerRequest<ClientContact> restTriggerRequest = convertToObject(body);

	    Integer entityID = restTriggerRequest.getMeta().getEntityId();
        Integer updatingUserID = restTriggerRequest.getMeta().getUserId();

	    ClientContactRestTriggerTraverser traverser = new ClientContactRestTriggerTraverser(entityID, valuesChanges, updatingUserID, true, bullhornData);

        return handleRequest(traverser, valuesChanges);
    }

}
