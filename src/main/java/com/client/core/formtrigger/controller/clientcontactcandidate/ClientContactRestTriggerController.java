package com.client.core.formtrigger.controller.clientcontactcandidate;

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
import com.bullhornsdk.data.model.entity.core.standard.ClientContact;
import com.client.core.base.tools.entitychanger.EntityChanger;
import com.client.core.base.tools.web.MediaTypes;
import com.client.core.base.workflow.node.Node;
import com.client.core.formtrigger.controller.AbstractRestTriggerController;
import com.client.core.formtrigger.model.api.RestTriggerRequest;
import com.client.core.formtrigger.model.api.RestTriggerResponse;
import com.client.core.formtrigger.workflow.traversing.impl.ClientContactValidationTraverser;

/**
 * Created by hiqbal on 12/16/2015.
 */
@Controller
@RequestMapping("/resttrigger/clientcontact/*")
public class ClientContactRestTriggerController extends AbstractRestTriggerController<ClientContact, ClientContactValidationTraverser> {

    private final Logger log = Logger.getLogger(ClientContactRestTriggerController.class);

    @Autowired
    public ClientContactRestTriggerController(
            @Qualifier("clientContactRestValidationWorkflow") Node<ClientContactValidationTraverser> clientContactValidationWorkflow,
            BullhornData bullhornData, EntityChanger entityChanger) {
        super(bullhornData, ClientContact.class, clientContactValidationWorkflow, entityChanger);

    }

    /**
     * Called when client contact is added
     *
     * @param clientContactRestTriggerRequest
     *            contains all the relevant data from the request body
     * @param response
     * @param request
     * @return the json parsed form response message
     */
    @RequestMapping(value = { "add" }, method = RequestMethod.POST, produces = { MediaTypes.JSON })
    @ResponseBody
    public RestTriggerResponse<ClientContact> addEntity(@RequestBody RestTriggerRequest<ClientContact> clientContactRestTriggerRequest,
                                                        HttpServletResponse response, HttpServletRequest request) {
        // Start the validation process.
        log.info("---------------------------- Starting Client Contact Add Validation Process From Rest Trigger ----------------------------------------");

        ClientContact clientContact = clientContactRestTriggerRequest.getData();
        Integer updatingUserID = clientContactRestTriggerRequest.getMeta().getUserId();

        ClientContactValidationTraverser traverser = new ClientContactValidationTraverser(clientContact, updatingUserID,
                false, true, bullhornData);

        return handleRequest(traverser);

    }

    /**
     * Called when client corporation is edited
     *
     * @param clientContactRestTriggerRequest
     *            contains all the relevant data from the form
     * @param response
     * @param request
     * @return the json parsed form response message
     */
    @RequestMapping(value = { "edit" }, method = RequestMethod.POST, produces = { MediaTypes.JSON })
    @ResponseBody
    public RestTriggerResponse<ClientContact> editEntity(@RequestBody RestTriggerRequest<ClientContact> clientContactRestTriggerRequest,
                                                         HttpServletResponse response, HttpServletRequest request) {
        // Start the validation process.
        log.info("---------------------------- Starting Client Contact Edit Validation Process From Rest Trigger ----------------------------------------");

        ClientContact clientContact = clientContactRestTriggerRequest.getData();
        Integer updatingUserID = clientContactRestTriggerRequest.getMeta().getUserId();

        ClientContactValidationTraverser traverser = new ClientContactValidationTraverser(clientContact, updatingUserID,
                true, true, bullhornData);

        return handleRequest(traverser);
    }
}
