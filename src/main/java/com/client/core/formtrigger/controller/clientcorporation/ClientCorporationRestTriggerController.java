package com.client.core.formtrigger.controller.clientcorporation;

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
import com.bullhornsdk.data.model.entity.core.standard.ClientCorporation;
import com.client.core.base.tools.entitychanger.EntityChanger;
import com.client.core.base.tools.web.MediaTypes;
import com.client.core.base.workflow.node.Node;
import com.client.core.formtrigger.controller.AbstractRestTriggerController;
import com.client.core.formtrigger.model.api.RestTriggerRequest;
import com.client.core.formtrigger.model.api.RestTriggerResponse;
import com.client.core.formtrigger.workflow.traversing.impl.ClientCorporationValidationTraverser;

/**
 * Created by hiqbal on 12/16/2015.
 */
@Controller
@RequestMapping("/resttrigger/clientcorporation/*")
public class ClientCorporationRestTriggerController extends AbstractRestTriggerController<ClientCorporation, ClientCorporationValidationTraverser> {

    private final Logger log = Logger.getLogger(ClientCorporationRestTriggerController.class);

    @Autowired
    public ClientCorporationRestTriggerController(
            @Qualifier("clientCorporationValidationWorkflow") Node<ClientCorporationValidationTraverser> clientCorporationValidationWorkflow,
            BullhornData bullhornData, EntityChanger entityChanger) {
        super(bullhornData, ClientCorporation.class, clientCorporationValidationWorkflow, entityChanger);

    }

    /**
     * Called when client corporation is added
     *
     * @param clientCorporationRestTriggerRequest
     *            contains all the relevant data from the request body
     * @param response
     * @param request
     * @return the json parsed form response message
     */
    @RequestMapping(value = { "add" }, method = RequestMethod.POST, produces = { MediaTypes.JSON })
    @ResponseBody
    public RestTriggerResponse<ClientCorporation> addEntity(@RequestBody RestTriggerRequest<ClientCorporation> clientCorporationRestTriggerRequest,
                                                            HttpServletResponse response, HttpServletRequest request) {
        // Start the validation process.
        log.info("---------------------------- Starting Client Corporation Add Validation Process From Rest Trigger ----------------------------------------");

        ClientCorporation clientCorporation = clientCorporationRestTriggerRequest.getData();
        Integer updatingUserID = clientCorporationRestTriggerRequest.getMeta().getUserId();

        ClientCorporationValidationTraverser traverser = new ClientCorporationValidationTraverser(clientCorporation, updatingUserID,
                false, true, bullhornData);

        return handleRequest(traverser);

    }

    /**
     * Called when client corporation is edited
     *
     * @param clientCorporationRestTriggerRequest
     *            contains all the relevant data from the form
     * @param response
     * @param request
     * @return the json parsed form response message
     */
    @RequestMapping(value = { "edit" }, method = RequestMethod.POST, produces = { MediaTypes.JSON })
    @ResponseBody
    public RestTriggerResponse<ClientCorporation> editEntity(@RequestBody RestTriggerRequest<ClientCorporation> clientCorporationRestTriggerRequest,
                                                             HttpServletResponse response, HttpServletRequest request) {
        // Start the validation process.
        log.info("---------------------------- Starting Client Corporation Edit Validation Process From Rest Trigger ----------------------------------------");

        ClientCorporation clientCorporation = clientCorporationRestTriggerRequest.getData();
        Integer updatingUserID = clientCorporationRestTriggerRequest.getMeta().getUserId();

        ClientCorporationValidationTraverser traverser = new ClientCorporationValidationTraverser(clientCorporation, updatingUserID,
                true, true, bullhornData);

        return handleRequest(traverser);
    }

}
