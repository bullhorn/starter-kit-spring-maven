package com.client.core.formtrigger.controller.jobsubmission;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bullhornsdk.data.api.BullhornData;
import com.bullhornsdk.data.model.entity.core.standard.JobSubmission;
import com.client.core.formtrigger.controller.AbstractFormTriggerController;
import com.client.core.formtrigger.workflow.traversing.impl.JobSubmissionValidationTraverser;
import com.client.core.base.tools.web.MediaTypes;
import com.client.core.formtrigger.model.form.impl.FormJobSubmissionDto;
import com.client.core.base.workflow.node.Node;

/**
 * Entry point for Job submission Validations.
 * 
 * The validate method instantiates a Traverser that will get passed through the workflow. The workflow is wired in formtrigger-workflow.xml
 * 
 * Actual logic is handled in Service class (see Service folder: com/client/core/service/formtrigger).
 */

@Controller
@RequestMapping("/formtrigger/jobsubmission/*")
public class JobSubmissionFormTriggerController extends AbstractFormTriggerController<JobSubmission, JobSubmissionValidationTraverser> {

	@Autowired
	public JobSubmissionFormTriggerController(
			@Qualifier("jobSubmissionValidationWorkflow") Node<JobSubmissionValidationTraverser> jobSubmissionValidationWorkflow,
			BullhornData bullhornData) {
		super(bullhornData, JobSubmission.class, jobSubmissionValidationWorkflow);
	}

	/**
	 * Called when job submission is added
	 * 
	 * @param formJobSubmissionDto
	 *            contains all the relevant data from the form
	 * @param updatingUserID
	 *            id of corporate user who saved the form
	 * @param corporationID
	 * @param response
	 * @param request
	 * @return the json parsed form response message
	 */
	@RequestMapping(value = { "add" }, method = RequestMethod.POST, produces = { MediaTypes.JSON })
	@ResponseBody
	public String addEntity(@ModelAttribute FormJobSubmissionDto formJobSubmissionDto, @RequestParam("ft.userId") Integer updatingUserID,
			@RequestParam("ft.corpId") Integer corporationID, HttpServletResponse response, HttpServletRequest request) {
		log.info("---------------------------- Starting Job Submission Validation Process----------------------------------------");

		JobSubmissionValidationTraverser traverser = new JobSubmissionValidationTraverser(formJobSubmissionDto, updatingUserID,
				corporationID, false, bullhornData);

		return handleRequest(traverser);

	}

	/**
	 * Called when job submission is edited
	 * 
	 * @param formJobSubmissionDto
	 *            contains all the relevant data from the form
	 * @param updatingUserID
	 *            id of corporate user who saved the form
	 * @param corporationID
	 * @param response
	 * @param request
	 * @return the json parsed form response message
	 */
	@RequestMapping(value = { "edit" }, method = RequestMethod.POST, produces = { MediaTypes.JSON })
	@ResponseBody
	public String editEntity(@ModelAttribute FormJobSubmissionDto formJobSubmissionDto, @RequestParam("ft.userId") Integer updatingUserID,
			@RequestParam("ft.corpId") Integer corporationID, HttpServletResponse response, HttpServletRequest request) {
		log.info("---------------------------- Starting Job Submission Validation Process----------------------------------------");

		JobSubmissionValidationTraverser traverser = new JobSubmissionValidationTraverser(formJobSubmissionDto, updatingUserID,
				corporationID, true, bullhornData);

		return handleRequest(traverser);
	}

}
