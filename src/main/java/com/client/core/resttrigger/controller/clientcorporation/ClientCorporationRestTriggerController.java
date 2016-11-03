package com.client.core.resttrigger.controller.clientcorporation;

import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bullhornsdk.data.model.entity.core.standard.ClientCorporation;
import com.client.core.base.workflow.node.Node;
import com.client.core.resttrigger.controller.AbstractRestTriggerController;
import com.client.core.resttrigger.model.api.RestTriggerRequest;
import com.client.core.resttrigger.model.api.RestTriggerResponse;
import com.client.core.resttrigger.workflow.traversing.ClientCorporationRestTriggerTraverser;

/**
 * Created by hiqbal on 12/16/2015.
 */
@Controller
@RequestMapping("/resttrigger/clientcorporation/*")
public class ClientCorporationRestTriggerController extends AbstractRestTriggerController<ClientCorporation, ClientCorporationRestTriggerTraverser> {

    private final Logger log = Logger.getLogger(ClientCorporationRestTriggerController.class);

    @Autowired
    public ClientCorporationRestTriggerController(@Qualifier("clientCorporationRestValidationWorkflow") Node<ClientCorporationRestTriggerTraverser> clientCorporationValidationWorkflow) {
        super(ClientCorporation.class, clientCorporationValidationWorkflow);

    }

    /**
     * Called when client corporation is added
     *
     * @param body
     *
     * @return the json parsed form response message
     */
    @RequestMapping(value = { "add" }, method = RequestMethod.POST, produces = { MediaType.APPLICATION_JSON_UTF8_VALUE })
    @ResponseBody
    public RestTriggerResponse addEntity(@RequestBody String body) {
        log.info("---------------------------- Starting Client Corporation Add Validation Process From Rest Trigger ----------------------------------------");

	    Map<String, Object> valuesChanges = (Map<String, Object>) convertToMap(body).get("data");

	    RestTriggerRequest<ClientCorporation> restTriggerRequest = convertToObject(body);

	    Integer entityID = restTriggerRequest.getMeta().getEntityId();
	    Integer updatingUserID = restTriggerRequest.getMeta().getUserId();

	    ClientCorporationRestTriggerTraverser traverser = new ClientCorporationRestTriggerTraverser(entityID, valuesChanges, updatingUserID, false, bullhornData);

	    return handleRequest(traverser, valuesChanges);
    }

    /**
     * Called when client corporation is edited
     *
     * @param body
     *
     * @return the json parsed form response message
     */
    @RequestMapping(value = { "edit" }, method = RequestMethod.POST, produces = { MediaType.APPLICATION_JSON_UTF8_VALUE })
    @ResponseBody
    public RestTriggerResponse editEntity(@RequestBody String body) {
        log.info("---------------------------- Starting Client Corporation Edit Validation Process From Rest Trigger ----------------------------------------");

	    Map<String, Object> valuesChanges = (Map<String, Object>) convertToMap(body).get("data");

	    RestTriggerRequest<ClientCorporation> restTriggerRequest = convertToObject(body);

	    Integer entityID = restTriggerRequest.getMeta().getEntityId();
	    Integer updatingUserID = restTriggerRequest.getMeta().getUserId();

	    ClientCorporationRestTriggerTraverser traverser = new ClientCorporationRestTriggerTraverser(entityID, valuesChanges, updatingUserID, true, bullhornData);

	    return handleRequest(traverser, valuesChanges);
    }

}
