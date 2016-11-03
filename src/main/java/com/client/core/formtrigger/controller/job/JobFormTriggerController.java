package com.client.core.formtrigger.controller.job;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bullhornsdk.data.model.entity.core.standard.JobOrder;
import com.client.core.base.workflow.node.Node;
import com.client.core.formtrigger.controller.AbstractFormTriggerController;
import com.client.core.formtrigger.model.form.impl.FormJobOrderDto;
import com.client.core.formtrigger.workflow.traversing.impl.JobFormTriggerTraverser;

/**
 * Entry point for Job Validations.
 * 
 * The validate method instantiates a Traverser that will get passed through the workflow. The workflow is wired in formtrigger-workflow.xml
 * 
 * Actual logic is handled in Service class (see Service folder: com/client/core/service/formtrigger).
 */

@Controller
@RequestMapping("/formtrigger/job/*")
public class JobFormTriggerController extends AbstractFormTriggerController<JobOrder, JobFormTriggerTraverser> {

	private final Logger log = Logger.getLogger(JobFormTriggerController.class);

	@Autowired
	public JobFormTriggerController(@Qualifier("jobValidationWorkflow") Node<JobFormTriggerTraverser> jobValidationWorkflow) {
		super(JobOrder.class, jobValidationWorkflow);
	}

	/**
	 * Called when job is added.
	 * 
	 * @param formJobOrderDto
	 *            contains all the relevant data from the form
	 * @param updatingUserID
	 *            id of corporate user who saved the form
	 * @param response
	 * @param request
	 * @return the json parsed form response message
	 */
	@RequestMapping(value = { "add" }, method = RequestMethod.POST, produces = { MediaType.APPLICATION_JSON_UTF8_VALUE })
	@ResponseBody
	public String addEntity(@ModelAttribute FormJobOrderDto formJobOrderDto, @RequestParam("ft.userId") Integer updatingUserID,
                            HttpServletResponse response, HttpServletRequest request) {
		log.info("---------------------------- Starting Job Validation Process----------------------------------------");

		JobFormTriggerTraverser traverser = new JobFormTriggerTraverser(formJobOrderDto, updatingUserID, false,bullhornData);

		return handleRequest(traverser);

	}

	/**
	 * Called when job is edited.
	 * 
	 * @param formJobOrderDto
	 *            contains all the relevant data from the form
	 * @param updatingUserID
	 *            id of corporate user who saved the form
	 * @param response
	 * @param request
	 * @return the json parsed form response message
	 */
	@RequestMapping(value = { "edit" }, method = RequestMethod.POST, produces = { MediaType.APPLICATION_JSON_UTF8_VALUE })
	@ResponseBody
	public String editEntity(@ModelAttribute FormJobOrderDto formJobOrderDto, @RequestParam("ft.userId") Integer updatingUserID,
                             HttpServletResponse response, HttpServletRequest request) {

		log.info("---------------------------- Starting Client Corporation Validation Process----------------------------------------");

		JobFormTriggerTraverser traverser = new JobFormTriggerTraverser(formJobOrderDto, updatingUserID, true,bullhornData);

		return handleRequest(traverser);
	}

}
