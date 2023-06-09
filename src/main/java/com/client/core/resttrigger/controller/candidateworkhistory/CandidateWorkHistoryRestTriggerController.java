package com.client.core.resttrigger.controller.candidateworkhistory;

import com.bullhornsdk.data.model.entity.core.standard.CandidateWorkHistory;
import com.client.core.base.model.relatedentity.CandidateWorkHistoryRelatedEntity;
import com.client.core.base.workflow.node.TriggerValidator;
import com.client.core.resttrigger.controller.AbstractRestTriggerController;
import com.client.core.resttrigger.model.api.RestTriggerRequest;
import com.client.core.resttrigger.model.api.RestTriggerResponse;
import com.client.core.resttrigger.model.helper.impl.CandidateWorkHistoryRestTriggerHelper;
import com.client.core.resttrigger.workflow.traversing.CandidateWorkHistoryRestTriggerTraverser;
import lombok.extern.log4j.Log4j2;
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

@Log4j2
@Controller
@RequestMapping("${rest.prefix.core}/candidateworkhistory/*")
public class CandidateWorkHistoryRestTriggerController extends AbstractRestTriggerController<CandidateWorkHistory, CandidateWorkHistoryRestTriggerHelper, CandidateWorkHistoryRestTriggerTraverser> {

    @Autowired
    public CandidateWorkHistoryRestTriggerController(Optional<List<TriggerValidator<CandidateWorkHistory, CandidateWorkHistoryRestTriggerHelper, CandidateWorkHistoryRestTriggerTraverser>>> triggerValidators) {
        super(CandidateWorkHistory.class, triggerValidators, CandidateWorkHistoryRelatedEntity.values());
    }

    /**
     * Called when candidate is added
     *
     * @param body
     *
     * @return the json parsed form response message
     */
    @RequestMapping(value = { "add" }, method = RequestMethod.POST, produces = { MediaType.APPLICATION_JSON_VALUE })
    @ResponseBody
    public RestTriggerResponse addEntity(@RequestBody String body) {
        log.info("---------------------------- Starting Candidate Work History Add Validation Process From Rest Trigger ----------------------------------------");

	    Map<String, Object> valuesChanges = (Map<String, Object>) convertToMap(body).get("data");

	    RestTriggerRequest<CandidateWorkHistory> restTriggerRequest = convertToObject(body);

	    Integer entityID = restTriggerRequest.getMeta().getEntityId();
	    Integer updatingUserID = restTriggerRequest.getMeta().getUserId();

	    CandidateWorkHistoryRestTriggerTraverser traverser = new CandidateWorkHistoryRestTriggerTraverser(entityID, valuesChanges, updatingUserID, false, getRelatedEntityFields());

	    return handleRequest(traverser, valuesChanges);
    }

    /**
     * Called when candidate is edited
     *
     * @param body
     *
     * @return the json parsed form response message
     */
    @RequestMapping(value = { "edit" }, method = RequestMethod.POST, produces = { MediaType.APPLICATION_JSON_VALUE })
    @ResponseBody
    public RestTriggerResponse editEntity(@RequestBody String body) {
        log.info("---------------------------- Starting Candidate Work History Edit Validation Process From Rest Trigger ----------------------------------------");

	    Map<String, Object> valuesChanges = (Map<String, Object>) convertToMap(body).get("data");

	    RestTriggerRequest<CandidateWorkHistory> restTriggerRequest = convertToObject(body);

	    Integer entityID = restTriggerRequest.getMeta().getEntityId();
	    Integer updatingUserID = restTriggerRequest.getMeta().getUserId();

	    CandidateWorkHistoryRestTriggerTraverser traverser = new CandidateWorkHistoryRestTriggerTraverser(entityID, valuesChanges, updatingUserID, true, getRelatedEntityFields());

	    return handleRequest(traverser, valuesChanges);
    }

}
