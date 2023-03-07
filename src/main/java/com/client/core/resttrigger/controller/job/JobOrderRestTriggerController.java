package com.client.core.resttrigger.controller.job;

import com.bullhornsdk.data.model.entity.core.standard.JobOrder;
import com.client.core.base.model.relatedentity.JobOrderRelatedEntity;
import com.client.core.base.workflow.node.TriggerValidator;
import com.client.core.resttrigger.controller.AbstractRestTriggerController;
import com.client.core.resttrigger.model.api.RestTriggerRequest;
import com.client.core.resttrigger.model.api.RestTriggerResponse;
import com.client.core.resttrigger.model.helper.impl.JobOrderRestTriggerHelper;
import com.client.core.resttrigger.workflow.traversing.JobOrderRestTriggerTraverser;
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
@RequestMapping("${rest.prefix.core}/job/*")
public class JobOrderRestTriggerController extends AbstractRestTriggerController<JobOrder, JobOrderRestTriggerHelper, JobOrderRestTriggerTraverser> {

    @Autowired
    public JobOrderRestTriggerController(Optional<List<TriggerValidator<JobOrder, JobOrderRestTriggerHelper, JobOrderRestTriggerTraverser>>> triggerValidators) {
        super(JobOrder.class, triggerValidators, JobOrderRelatedEntity.values());
    }

    /**
     * Called when job is added.
     *
     * @param body
     *
     * @return the json parsed form response message
     */
    @RequestMapping(value = { "add" }, method = RequestMethod.POST, produces = { MediaType.APPLICATION_JSON_VALUE })
    @ResponseBody
    public RestTriggerResponse addEntity(@RequestBody String body) {
        log.info("---------------------------- Starting Job Validation Add Process From Rest Trigger ----------------------------------------");

	    Map<String, Object> valuesChanges = (Map<String, Object>) convertToMap(body).get("data");

	    RestTriggerRequest<JobOrder> restTriggerRequest = convertToObject(body);

	    Integer entityID = restTriggerRequest.getMeta().getEntityId();
	    Integer updatingUserID = restTriggerRequest.getMeta().getUserId();

        JobOrderRestTriggerTraverser traverser = new JobOrderRestTriggerTraverser(entityID, valuesChanges, updatingUserID, false, getRelatedEntityFields());

	    return handleRequest(traverser, valuesChanges);
    }

    /**
     * Called when job is edited.
     *
     * @param body contains all the relevant data from the call
     *
     * @return the json parsed form response message
     */
    @RequestMapping(value = { "edit" }, method = RequestMethod.POST, produces = { MediaType.APPLICATION_JSON_VALUE })
    @ResponseBody
    public RestTriggerResponse editEntity(@RequestBody String body) {
        log.info("---------------------------- Starting Job Validation Edit Process From Rest Trigger ----------------------------------------");

	    Map<String, Object> valuesChanges = (Map<String, Object>) convertToMap(body).get("data");

	    RestTriggerRequest<JobOrder> restTriggerRequest = convertToObject(body);

	    Integer entityID = restTriggerRequest.getMeta().getEntityId();
	    Integer updatingUserID = restTriggerRequest.getMeta().getUserId();

        JobOrderRestTriggerTraverser traverser = new JobOrderRestTriggerTraverser(entityID, valuesChanges, updatingUserID, true, getRelatedEntityFields());

	    return handleRequest(traverser, valuesChanges);
    }

}
