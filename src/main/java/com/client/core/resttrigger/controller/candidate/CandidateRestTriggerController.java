package com.client.core.resttrigger.controller.candidate;

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

import com.bullhornsdk.data.model.entity.core.standard.Candidate;
import com.client.core.base.workflow.node.Node;
import com.client.core.resttrigger.controller.AbstractRestTriggerController;
import com.client.core.resttrigger.model.api.RestTriggerRequest;
import com.client.core.resttrigger.model.api.RestTriggerResponse;
import com.client.core.resttrigger.workflow.traversing.CandidateRestTriggerTraverser;

/**
 * Created by hiqbal on 12/21/2015.
 */
@Controller
@RequestMapping("/resttrigger/candidate/*")
public class CandidateRestTriggerController extends AbstractRestTriggerController<Candidate, CandidateRestTriggerTraverser> {

    private final Logger log = Logger.getLogger(CandidateRestTriggerController.class);

    @Autowired
    public CandidateRestTriggerController(@Qualifier("candidateRestValidationWorkflow") Node<CandidateRestTriggerTraverser> candidateValidationWorkflow) {
        super(Candidate.class, candidateValidationWorkflow);
    }

    /**
     * Called when candidate is added
     *
     * @param body
     *
     * @return the json parsed form response message
     */
    @RequestMapping(value = { "add" }, method = RequestMethod.POST, produces = { MediaType.APPLICATION_JSON_UTF8_VALUE })
    @ResponseBody
    public RestTriggerResponse addEntity(@RequestBody String body) {
        log.info("---------------------------- Starting Candidate Add Validation Process From Rest Trigger ----------------------------------------");

	    Map<String, Object> valuesChanges = (Map<String, Object>) convertToMap(body).get("data");

	    RestTriggerRequest<Candidate> restTriggerRequest = convertToObject(body);

	    Integer entityID = restTriggerRequest.getMeta().getEntityId();
	    Integer updatingUserID = restTriggerRequest.getMeta().getUserId();

	    CandidateRestTriggerTraverser traverser = new CandidateRestTriggerTraverser(entityID, valuesChanges, updatingUserID, false, bullhornData);

	    return handleRequest(traverser, valuesChanges);
    }

    /**
     * Called when candidate is edited
     *
     * @param body
     *
     * @return the json parsed form response message
     */
    @RequestMapping(value = { "edit" }, method = RequestMethod.POST, produces = { MediaType.APPLICATION_JSON_UTF8_VALUE })
    @ResponseBody
    public RestTriggerResponse editEntity(@RequestBody String body) {
        log.info("---------------------------- Starting Candidate Edit Validation Process From Rest Trigger ----------------------------------------");

	    Map<String, Object> valuesChanges = (Map<String, Object>) convertToMap(body).get("data");

	    RestTriggerRequest<Candidate> restTriggerRequest = convertToObject(body);

	    Integer entityID = restTriggerRequest.getMeta().getEntityId();
	    Integer updatingUserID = restTriggerRequest.getMeta().getUserId();

	    CandidateRestTriggerTraverser traverser = new CandidateRestTriggerTraverser(entityID, valuesChanges, updatingUserID, true, bullhornData);

	    return handleRequest(traverser, valuesChanges);
    }

}
