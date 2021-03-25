package com.client.core.resttrigger.controller.candidatereference;

import com.bullhornsdk.data.model.entity.core.standard.CandidateReference;
import com.client.core.base.model.relatedentity.CandidateReferenceRelatedEntity;
import com.client.core.base.workflow.node.TriggerValidator;
import com.client.core.resttrigger.controller.AbstractRestTriggerController;
import com.client.core.resttrigger.model.api.RestTriggerRequest;
import com.client.core.resttrigger.model.api.RestTriggerResponse;
import com.client.core.resttrigger.model.helper.impl.CandidateReferenceRestTriggerHelper;
import com.client.core.resttrigger.workflow.traversing.CandidateReferenceRestTriggerTraverser;
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
@RequestMapping("/resttrigger/candidatereference/*")
public class CandidateReferenceRestTriggerController extends AbstractRestTriggerController<CandidateReference, CandidateReferenceRestTriggerHelper, CandidateReferenceRestTriggerTraverser> {

    private final Logger log = Logger.getLogger(CandidateReferenceRestTriggerController.class);

    @Autowired
    public CandidateReferenceRestTriggerController(Optional<List<TriggerValidator<CandidateReference, CandidateReferenceRestTriggerHelper, CandidateReferenceRestTriggerTraverser>>> triggerValidators) {
        super(CandidateReference.class, triggerValidators, CandidateReferenceRelatedEntity.values());
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
        log.info("---------------------------- Starting Candidate Reference Add Validation Process From Rest Trigger ----------------------------------------");

	    Map<String, Object> valuesChanges = (Map<String, Object>) convertToMap(body).get("data");

	    RestTriggerRequest<CandidateReference> restTriggerRequest = convertToObject(body);

	    Integer entityID = restTriggerRequest.getMeta().getEntityId();
	    Integer updatingUserID = restTriggerRequest.getMeta().getUserId();

	    CandidateReferenceRestTriggerTraverser traverser = new CandidateReferenceRestTriggerTraverser(entityID, valuesChanges, updatingUserID, false, getRelatedEntityFields());

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
        log.info("---------------------------- Starting Candidate Reference Edit Validation Process From Rest Trigger ----------------------------------------");

	    Map<String, Object> valuesChanges = (Map<String, Object>) convertToMap(body).get("data");

	    RestTriggerRequest<CandidateReference> restTriggerRequest = convertToObject(body);

	    Integer entityID = restTriggerRequest.getMeta().getEntityId();
	    Integer updatingUserID = restTriggerRequest.getMeta().getUserId();

	    CandidateReferenceRestTriggerTraverser traverser = new CandidateReferenceRestTriggerTraverser(entityID, valuesChanges, updatingUserID, true, getRelatedEntityFields());

	    return handleRequest(traverser, valuesChanges);
    }

}
