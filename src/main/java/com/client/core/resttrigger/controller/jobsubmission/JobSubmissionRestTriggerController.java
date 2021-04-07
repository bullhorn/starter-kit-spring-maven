package com.client.core.resttrigger.controller.jobsubmission;

import com.bullhornsdk.data.model.entity.core.standard.Candidate;
import com.bullhornsdk.data.model.entity.core.standard.JobOrder;
import com.bullhornsdk.data.model.entity.core.standard.JobSubmission;
import com.client.core.AppContext;
import com.client.core.base.model.relatedentity.JobSubmissionRelatedEntity;
import com.client.core.base.tools.web.JsonConverter;
import com.client.core.base.workflow.node.TriggerValidator;
import com.client.core.resttrigger.controller.AbstractRestTriggerController;
import com.client.core.resttrigger.model.api.RestTriggerRequest;
import com.client.core.resttrigger.model.api.RestTriggerResponse;
import com.client.core.resttrigger.model.helper.impl.JobSubmissionRestTriggerHelper;
import com.client.core.resttrigger.workflow.traversing.JobSubmissionRestTriggerTraverser;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

@Controller
@RequestMapping("/resttrigger/jobsubmission/*")
public class JobSubmissionRestTriggerController extends AbstractRestTriggerController<JobSubmission, JobSubmissionRestTriggerHelper, JobSubmissionRestTriggerTraverser> {

    private final Logger log = Logger.getLogger(JobSubmissionRestTriggerController.class);
    private final JsonConverter jsonConverter;

    @Autowired
    public JobSubmissionRestTriggerController(Optional<List<TriggerValidator<JobSubmission, JobSubmissionRestTriggerHelper, JobSubmissionRestTriggerTraverser>>> triggerValidators, JsonConverter jsonConverter) {
        super(JobSubmission.class, triggerValidators, JobSubmissionRelatedEntity.values());
        this.jsonConverter = AppContext.getApplicationContext().getBean(JsonConverter.class);
    }

    /**
     * Called when job is added.
     *
     * @param body
     * @return the json parsed form response message
     */
    @RequestMapping(value = {"add"}, method = RequestMethod.POST, produces = {MediaType.APPLICATION_JSON_UTF8_VALUE})
    @ResponseBody
    public RestTriggerResponse addEntity(@RequestBody String body) {
        log.info("---------------------------- Starting Job Submission Validation Add Process From Rest Trigger ----------------------------------------");

        Map<String, Object> valuesChanges = (Map<String, Object>) convertToMap(body).get("data");

        RestTriggerRequest<JobSubmission> restTriggerRequest = convertToObject(body);

        Integer entityID = restTriggerRequest.getMeta().getEntityId();
        Integer updatingUserID = restTriggerRequest.getMeta().getUserId();


        String jobOrdersString = jsonConverter.convertEntityToJsonString(valuesChanges.get("jobOrder"));

        if (!jobOrdersString.contains("[")) {
            jobOrdersString = "[" + jobOrdersString + "]";
        }

        String candidatesString = jsonConverter.convertEntityToJsonString(valuesChanges.get("candidate"));

        List<JobOrder> jobOrderList = Arrays.asList(jsonConverter.convertJsonStringToEntity(jobOrdersString, JobOrder[].class));
        List<Candidate> candidateList = Arrays.asList(jsonConverter.convertJsonStringToEntity(candidatesString, Candidate[].class));

        Map<String, Object> new_valuesChanges = valuesChanges.entrySet().stream().filter(entry -> {
            return !entry.getKey().equals("jobOrder") && !entry.getKey().equals("candidate");
        }).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));


        List<JobSubmissionRestTriggerTraverser> traversers = jobOrderList.stream().flatMap(jobOrder -> {
            return candidateList.stream().map(candidate -> {
                JobSubmissionRestTriggerTraverser traverser = new JobSubmissionRestTriggerTraverser(entityID, new_valuesChanges, updatingUserID, false, getRelatedEntityFields());

                traverser.getTriggerHelper().getNewEntity().setCandidate(candidate);
                traverser.getTriggerHelper().getNewEntity().setJobOrder(jobOrder);
                return traverser;
            });
        }).collect(Collectors.toList());

        return handleRequests(traversers, valuesChanges);

    }

    /**
     * Called when job is edited.
     *
     * @param body contains all the relevant data from the call
     * @return the json parsed form response message
     */
    @RequestMapping(value = {"edit"}, method = RequestMethod.POST, produces = {MediaType.APPLICATION_JSON_UTF8_VALUE})
    @ResponseBody
    public RestTriggerResponse editEntity(@RequestBody String body) {
        log.info("---------------------------- Starting Job Submission Validation Edit Process From Rest Trigger ----------------------------------------");

        Map<String, Object> valuesChanges = (Map<String, Object>) convertToMap(body).get("data");

        RestTriggerRequest<JobSubmission> restTriggerRequest = convertToObject(body);

        Integer entityID = restTriggerRequest.getMeta().getEntityId();
        Integer updatingUserID = restTriggerRequest.getMeta().getUserId();

        JobSubmissionRestTriggerTraverser traverser = new JobSubmissionRestTriggerTraverser(entityID, valuesChanges, updatingUserID, true, getRelatedEntityFields());

        return handleRequest(traverser, valuesChanges);
    }

}
