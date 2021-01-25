package com.client.core.formtrigger.controller.jobsubmission;

import com.bullhornsdk.data.model.entity.core.standard.JobSubmission;
import com.client.core.base.model.relatedentity.JobOrderRelatedEntity;
import com.client.core.base.workflow.node.TriggerValidator;
import com.client.core.formtrigger.controller.AbstractFormTriggerController;
import com.client.core.formtrigger.model.form.impl.FormJobSubmissionDto;
import com.client.core.formtrigger.model.helper.impl.JobSubmissionFormTriggerHelper;
import com.client.core.formtrigger.workflow.traversing.JobSubmissionFormTriggerTraverser;
import com.google.common.collect.Maps;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * Entry point for Job submission Validations.
 * 
 * The validate method instantiates a Traverser that will get passed through the workflow. The workflow is wired in formtrigger-workflow.xml
 * 
 * Actual logic is handled in Service class (see Service folder: com/client/core/service/formtrigger).
 */

@Controller
@RequestMapping("/formtrigger/jobsubmission/*")
public class JobSubmissionFormTriggerController extends AbstractFormTriggerController<JobSubmission, JobSubmissionFormTriggerHelper, JobSubmissionFormTriggerTraverser> {

	private final Logger log = Logger.getLogger(JobSubmissionFormTriggerController.class);

    @Autowired
    public JobSubmissionFormTriggerController(Optional<List<TriggerValidator<JobSubmission, JobSubmissionFormTriggerHelper, JobSubmissionFormTriggerTraverser>>> triggerValidators) {
        super(JobSubmission.class, triggerValidators, JobOrderRelatedEntity.values());
    }

	/**
	 * Called when job submission is added
	 * 
	 * @param formJobSubmissionDto
	 *            contains all the relevant data from the form
	 * @param updatingUserID
	 *            id of corporate user who saved the form
	 * @return the json parsed form response message
	 */
	@RequestMapping(value = { "add" }, method = RequestMethod.POST, produces = { MediaType.APPLICATION_JSON_UTF8_VALUE })
	@ResponseBody
	public String addEntity(@ModelAttribute FormJobSubmissionDto formJobSubmissionDto, @RequestParam("ft.userId") Integer updatingUserID) {
		log.info("---------------------------- Starting Job Submission Validation Process----------------------------------------");

        List<JobSubmissionFormTriggerTraverser> traversers = getTraversers(formJobSubmissionDto, updatingUserID, false);

        return handleRequests(traversers);
	}

	/**
	 * Called when job submission is edited
	 * 
	 * @param formJobSubmissionDto
	 *            contains all the relevant data from the form
	 * @param updatingUserID
	 *            id of corporate user who saved the form
	 * @return the json parsed form response message
	 */
	@RequestMapping(value = { "edit" }, method = RequestMethod.POST, produces = { MediaType.APPLICATION_JSON_UTF8_VALUE })
	@ResponseBody
	public String editEntity(@ModelAttribute FormJobSubmissionDto formJobSubmissionDto, @RequestParam("ft.userId") Integer updatingUserID) {
		log.info("---------------------------- Starting Job Submission Validation Process----------------------------------------");

        List<JobSubmissionFormTriggerTraverser> traversers = getTraversers(formJobSubmissionDto, updatingUserID, true);

        return handleRequests(traversers);
	}

    private List<JobSubmissionFormTriggerTraverser> getTraversers(FormJobSubmissionDto formJobSubmissionDto, Integer updatingUserID, Boolean edit) {
        List<FormJobSubmissionDto> submissions = formJobSubmissionDto.instantiateEntities();

        return submissions.parallelStream().map( submission -> {
            return new JobSubmissionFormTriggerTraverser(submission, updatingUserID, edit, getRelatedEntityFields());
        }).collect(Collectors.toList());
    }

    protected String handleRequests(List<JobSubmissionFormTriggerTraverser> traversers) {
        Map<String, Object> response = traversers.parallelStream().collect(Maps::<String, Object>newLinkedHashMap, (map, traverser ) -> {
            map.putAll(handleSingleRequest(traverser));
        }, Map::putAll);

        return prepareReturnValue(response);
    }

    protected Map<String, Object> handleSingleRequest(JobSubmissionFormTriggerTraverser traverser) {
        try {
            getTriggerValidators().stream().forEach( (triggerValidator) -> {
                triggerValidator.validate(traverser);
            });
        } catch (Exception e) {
            log.error("Error validating placement", e);
        }

        return traverser.getFormResponse();
    }

}
