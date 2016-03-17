package com.client.core.formtrigger.controller.opportunity;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bullhornsdk.data.api.BullhornData;
import com.bullhornsdk.data.model.entity.core.standard.Opportunity;
import com.client.core.base.tools.web.MediaTypes;
import com.client.core.base.workflow.node.Node;
import com.client.core.formtrigger.controller.AbstractFormTriggerController;
import com.client.core.formtrigger.model.form.impl.FormOpportunityDto;
import com.client.core.formtrigger.workflow.traversing.impl.OpportunityValidationTraverser;

/**
 * Entry point for Opportunity Validations.
 * 
 * The validate method instantiates a Traverser that will get passed through the workflow. The workflow is wired in formtrigger-workflow.xml
 * 
 * Actual logic is handled in Service class (see Service folder: com/client/core/service/formtrigger).
 */
@Controller
@RequestMapping("/formtrigger/opportunity/*")
public class OpportunityFormTriggerController extends AbstractFormTriggerController<Opportunity, OpportunityValidationTraverser> {

	private final Logger log = Logger.getLogger(OpportunityFormTriggerController.class);

	@Autowired
	public OpportunityFormTriggerController(@Qualifier("opportunityValidationWorkflow") Node<OpportunityValidationTraverser> opportunityValidationWorkflow,
                                            BullhornData bullhornData) {
		super(bullhornData, Opportunity.class, opportunityValidationWorkflow);
	}

	/**
	 * Called when opportunity is added.
	 * 
	 * @param formOpportunityDto
	 *            contains all the relevant data from the form
	 * @param updatingUserID
	 *            id of corporate user who saved the form
	 * @return the json parsed form response message
	 */
	@RequestMapping(value = { "add" }, method = RequestMethod.POST, produces = { MediaTypes.JSON })
	@ResponseBody
	public String addEntity(@ModelAttribute FormOpportunityDto formOpportunityDto, @RequestParam("ft.userId") Integer updatingUserID) {
		log.info("---------------------------- Starting Opp Validation Process----------------------------------------");
		
		OpportunityValidationTraverser traverser = new OpportunityValidationTraverser(formOpportunityDto, updatingUserID, false, bullhornData);

		return handleRequest(traverser);

	}

	/**
	 * Called when job is edited.
	 * 
	 * @param formOpportunityDto
	 *            contains all the relevant data from the form
	 * @param updatingUserID
	 *            id of corporate user who saved the form
	 * @return the json parsed form response message
	 */
	@RequestMapping(value = { "edit" }, method = RequestMethod.POST, produces = { MediaTypes.JSON })
	@ResponseBody
	public String editEntity(@ModelAttribute FormOpportunityDto formOpportunityDto, @RequestParam("ft.userId") Integer updatingUserID) {

		log.info("---------------------------- Starting Opp Validation Process----------------------------------------");
		
		OpportunityValidationTraverser traverser = new OpportunityValidationTraverser(formOpportunityDto, updatingUserID, true, bullhornData);

		return handleRequest(traverser);
	}

}
