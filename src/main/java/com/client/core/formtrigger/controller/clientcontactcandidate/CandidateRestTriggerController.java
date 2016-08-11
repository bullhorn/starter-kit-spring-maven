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
import com.bullhornsdk.data.model.entity.core.standard.Candidate;
import com.client.core.base.tools.entitychanger.EntityChanger;
import com.client.core.base.tools.web.MediaTypes;
import com.client.core.base.workflow.node.Node;
import com.client.core.formtrigger.controller.AbstractRestTriggerController;
import com.client.core.formtrigger.model.api.RestTriggerRequest;
import com.client.core.formtrigger.model.api.RestTriggerResponse;
import com.client.core.formtrigger.workflow.traversing.impl.CandidateValidationTraverser;

/**
 * Created by hiqbal on 12/21/2015.
 */
@Controller
@RequestMapping("/resttrigger/candidate/*")
public class CandidateRestTriggerController extends AbstractRestTriggerController<Candidate, CandidateValidationTraverser> {

    private final Logger log = Logger.getLogger(CandidateRestTriggerController.class);

    @Autowired
    public CandidateRestTriggerController(
            @Qualifier("candidateRestValidationWorkflow") Node<CandidateValidationTraverser> candidateValidationWorkflow,
            BullhornData bullhornData, EntityChanger entityChanger) {
        super(bullhornData, Candidate.class, candidateValidationWorkflow, entityChanger);

    }

    /**
     * Called when candidate is added
     *
     * @param candidateRestTriggerRequest
     *            contains all the relevant data from the request body
     * @param response
     * @param request
     * @return the json parsed form response message
     */
    @RequestMapping(value = { "add" }, method = RequestMethod.POST, produces = { MediaTypes.JSON })
    @ResponseBody
    public RestTriggerResponse<Candidate> addEntity(@RequestBody RestTriggerRequest<Candidate> candidateRestTriggerRequest,
                                                    HttpServletResponse response, HttpServletRequest request) {
        // Start the validation process.
        log.info("---------------------------- Starting Candidate Add Validation Process From Rest Trigger ----------------------------------------");

        Candidate candidate = candidateRestTriggerRequest.getData();
        Integer updatingUserID = candidateRestTriggerRequest.getMeta().getUserId();

        CandidateValidationTraverser traverser = new CandidateValidationTraverser(candidate, updatingUserID,
                false, true, bullhornData);

        return handleRequest(traverser);
    }

    /**
     * Called when client corporation is edited
     *
     * @param candidateRestTriggerRequest
     *            contains all the relevant data from the form
     * @param response
     * @param request
     * @return the json parsed form response message
     */
    @RequestMapping(value = { "edit" }, method = RequestMethod.POST, produces = { MediaTypes.JSON })
    @ResponseBody
    public RestTriggerResponse<Candidate> editEntity(@RequestBody RestTriggerRequest<Candidate> candidateRestTriggerRequest,
                                                     HttpServletResponse response, HttpServletRequest request) {
        // Start the validation process.
        log.info("---------------------------- Starting Candidate Edit Validation Process From Rest Trigger ----------------------------------------");

        Candidate candidate = candidateRestTriggerRequest.getData();
        Integer updatingUserID = candidateRestTriggerRequest.getMeta().getUserId();

        CandidateValidationTraverser traverser = new CandidateValidationTraverser(candidate, updatingUserID,
                true, true, bullhornData);

        return handleRequest(traverser);
    }

}
