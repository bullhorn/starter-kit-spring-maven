package com.client.core.formtrigger.controller.job;

import com.bullhornsdk.data.model.entity.core.standard.JobOrder;
import com.client.core.base.model.relatedentity.JobOrderRelatedEntity;
import com.client.core.base.workflow.node.TriggerValidator;
import com.client.core.formtrigger.controller.AbstractFormTriggerController;
import com.client.core.formtrigger.model.form.impl.FormJobOrderDto;
import com.client.core.formtrigger.model.helper.impl.JobOrderFormTriggerHelper;
import com.client.core.formtrigger.workflow.traversing.JobOrderFormTriggerTraverser;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

/**
 * Entry point for Job Validations.
 * 
 * The validate method instantiates a Traverser that will get passed through the workflow. The workflow is wired in formtrigger-workflow.xml
 * 
 * Actual logic is handled in Service class (see Service folder: com/client/core/service/formtrigger).
 */

@Controller
@RequestMapping("/formtrigger/job/*")
public class JobOrderFormTriggerController extends AbstractFormTriggerController<JobOrder, JobOrderFormTriggerHelper, JobOrderFormTriggerTraverser> {

	private final Logger log = Logger.getLogger(JobOrderFormTriggerController.class);
    
    @Autowired
    public JobOrderFormTriggerController(Optional<List<TriggerValidator<JobOrder, JobOrderFormTriggerHelper, JobOrderFormTriggerTraverser>>> triggerValidators) {
        super(JobOrder.class, triggerValidators, JobOrderRelatedEntity.values());
    }

	/**
	 * Called when job is added.
	 * 
	 * @param formJobOrderDto
	 *            contains all the relevant data from the form
	 * @param updatingUserID
	 *            id of corporate user who saved the form
	 * @return the json parsed form response message
	 */
	@RequestMapping(value = { "add" }, method = RequestMethod.POST, produces = { MediaType.APPLICATION_JSON_UTF8_VALUE })
	@ResponseBody
	public String addEntity(@ModelAttribute FormJobOrderDto formJobOrderDto, @RequestParam("ft.userId") Integer updatingUserID) {
		log.info("---------------------------- Starting Job Order Validation Process----------------------------------------");

		JobOrderFormTriggerTraverser traverser = new JobOrderFormTriggerTraverser(formJobOrderDto, updatingUserID, false, getRelatedEntityFields());

		return handleRequest(traverser);
	}

	/**
	 * Called when job is edited.
	 * 
	 * @param formJobOrderDto
	 *            contains all the relevant data from the form
	 * @param updatingUserID
	 *            id of corporate user who saved the form
	 * @return the json parsed form response message
	 */
	@RequestMapping(value = { "edit" }, method = RequestMethod.POST, produces = { MediaType.APPLICATION_JSON_UTF8_VALUE })
	@ResponseBody
	public String editEntity(@ModelAttribute FormJobOrderDto formJobOrderDto, @RequestParam("ft.userId") Integer updatingUserID) {
		log.info("---------------------------- Starting Job Order Validation Process----------------------------------------");

		JobOrderFormTriggerTraverser traverser = new JobOrderFormTriggerTraverser(formJobOrderDto, updatingUserID, true, getRelatedEntityFields());

		return handleRequest(traverser);
	}

}
