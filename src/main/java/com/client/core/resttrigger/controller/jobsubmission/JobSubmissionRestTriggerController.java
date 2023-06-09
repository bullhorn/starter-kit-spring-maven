package com.client.core.resttrigger.controller.jobsubmission;

import com.bullhornsdk.data.model.entity.core.standard.Candidate;
import com.bullhornsdk.data.model.entity.core.standard.JobOrder;
import com.bullhornsdk.data.model.entity.core.standard.JobSubmission;
import com.client.core.base.model.relatedentity.JobSubmissionRelatedEntity;
import com.client.core.base.tools.web.JsonConverter;
import com.client.core.base.workflow.node.TriggerValidator;
import com.client.core.resttrigger.controller.AbstractRestTriggerController;
import com.client.core.resttrigger.model.api.RestTriggerRequest;
import com.client.core.resttrigger.model.api.RestTriggerResponse;
import com.client.core.resttrigger.model.helper.impl.JobSubmissionRestTriggerHelper;
import com.client.core.resttrigger.workflow.traversing.JobSubmissionRestTriggerTraverser;
import lombok.extern.log4j.Log4j2;
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
import java.util.stream.Stream;

@Log4j2
@Controller
@RequestMapping("${rest.prefix.core}/jobsubmission/*")
public class JobSubmissionRestTriggerController extends AbstractRestTriggerController<JobSubmission, JobSubmissionRestTriggerHelper, JobSubmissionRestTriggerTraverser> {
    private final JsonConverter jsonConverter;

    @Autowired
    public JobSubmissionRestTriggerController(Optional<List<TriggerValidator<JobSubmission, JobSubmissionRestTriggerHelper, JobSubmissionRestTriggerTraverser>>> triggerValidators, JsonConverter jsonConverter) {
        super(JobSubmission.class, triggerValidators, JobSubmissionRelatedEntity.values());
        this.jsonConverter = jsonConverter;
    }

    /**
     * Called when job is added.
     *
     * @param body
     * @return the json parsed form response message
     */
    @RequestMapping(value = {"add"}, method = RequestMethod.POST, produces = {MediaType.APPLICATION_JSON_VALUE})
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

        Map<String, Object> newValueChanges = valuesChanges.entrySet().stream().filter(entry -> {
            return !entry.getKey().equals("jobOrder") && !entry.getKey().equals("candidate");
        }).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));


        List<JobSubmissionRestTriggerTraverser> traversers = jobOrderList.stream().flatMap(jobOrder -> {
            Stream<JobSubmissionRestTriggerTraverser> stream = candidateList.stream().map(candidate -> {
                JobSubmissionRestTriggerTraverser traverser = new JobSubmissionRestTriggerTraverser(entityID, newValueChanges, updatingUserID, false, getRelatedEntityFields());
                traverser.getTriggerHelper().getNewEntity().setCandidate(candidate);
                traverser.getTriggerHelper().getNewEntity().setJobOrder(jobOrder);
                return traverser;
            });
            return stream;
        }).collect(Collectors.toList());

        return handleRequests(traversers, valuesChanges);

    }

    /**
     * Called when job is edited.
     *
     * @param body contains all the relevant data from the call
     * @return the json parsed form response message
     */
    @RequestMapping(value = {"edit"}, method = RequestMethod.POST, produces = {MediaType.APPLICATION_JSON_VALUE})
    @ResponseBody
    public RestTriggerResponse editEntity(@RequestBody String body) {
        log.info("---------------------------- Starting Job Submission Validation Edit Process From Rest Trigger ----------------------------------------");

        Map<String, Object> valuesChanges = (Map<String, Object>) convertToMap(body).get("data");

        RestTriggerRequest<JobSubmission> restTriggerRequest = convertToObject(body);

        Integer entityID = restTriggerRequest.getMeta().getEntityId();
        Integer updatingUserID = restTriggerRequest.getMeta().getUserId();

        if (entityID.equals(-1) && valuesChanges.containsKey("ids")) {

            String idsString = jsonConverter.convertEntityToJsonString(valuesChanges.get("ids"));
            List<Integer> ids = Arrays.asList(jsonConverter.convertJsonStringToEntity(idsString, Integer[].class));

            List<JobSubmissionRestTriggerTraverser> traversers =
                    ids.stream().map(entityId -> new JobSubmissionRestTriggerTraverser(entityId, valuesChanges, updatingUserID, true, getRelatedEntityFields()))
                            .collect(Collectors.toList());

            return handleRequests(traversers, valuesChanges);

        } else {
            JobSubmissionRestTriggerTraverser traverser = new JobSubmissionRestTriggerTraverser(entityID, valuesChanges, updatingUserID, true, getRelatedEntityFields());

            return handleRequest(traverser, valuesChanges);
        }
    }

}
