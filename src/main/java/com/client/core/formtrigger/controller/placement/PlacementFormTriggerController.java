package com.client.core.formtrigger.controller.placement;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bullhornsdk.data.model.entity.core.standard.Placement;
import com.client.core.base.tools.web.MediaTypes;
import com.client.core.base.workflow.node.Node;
import com.client.core.formtrigger.controller.AbstractFormTriggerController;
import com.client.core.formtrigger.model.form.impl.FormPlacementDto;
import com.client.core.formtrigger.workflow.traversing.impl.PlacementFormTriggerTraverser;

/**
 * Entry point for Placement formtrigger Validations.
 * 
 * The validate method instantiates a Traverser that will get passed through the workflow. The workflow is wired in formtrigger-workflow.xml
 * 
 * Actual logic is handled in Service class (see Service folder: com/client/core/service/formtrigger).
 * 
 */

@Controller
@RequestMapping("/formtrigger/placement/*")
public class PlacementFormTriggerController extends AbstractFormTriggerController<Placement, PlacementFormTriggerTraverser> {

	private final Logger log = Logger.getLogger(PlacementFormTriggerController.class);

	@Autowired
	public PlacementFormTriggerController(@Qualifier("placementValidationWorkFlow") Node<PlacementFormTriggerTraverser> placementValidationWorkflow) {
		super(Placement.class, placementValidationWorkflow);
	}

	/**
	 * Called when placement is added.
	 * 
	 * @param formPlacementDto
	 *            contains all the relevant data from the form
	 * @param updatingUserID
	 *            id of corporate user who saved the form
	 * @param response
	 * @param request
	 * @return the json parsed form response message
	 */
	@RequestMapping(value = { "add" }, method = RequestMethod.POST, produces = { MediaTypes.JSON })
	@ResponseBody
	public String addEntity(@ModelAttribute FormPlacementDto formPlacementDto, @RequestParam("ft.userId") Integer updatingUserID,
                            HttpServletResponse response, HttpServletRequest request) {
		log.info("---------------------------- Starting Validation Add Process----------------------------------------");

		PlacementFormTriggerTraverser traverser = new PlacementFormTriggerTraverser(formPlacementDto, updatingUserID, false,
				bullhornData);
		return handleRequest(traverser);
	}

	/**
	 * Called when placement is edited
	 * 
	 * @param formPlacementDto
	 *            contains all the relevant data from the form
	 * @param updatingUserID
	 *            id of corporate user who saved the form
	 * @param response
	 * @param request
	 * @return the json parsed form response message
	 */
	@RequestMapping(value = { "edit" }, method = RequestMethod.POST, produces = { MediaTypes.JSON })
	@ResponseBody
	public String editEntity(@ModelAttribute FormPlacementDto formPlacementDto, @RequestParam("ft.userId") Integer updatingUserID,
                             HttpServletResponse response, HttpServletRequest request) {

		log.info("---------------------------- Starting Validation Edit Process----------------------------------------");

		PlacementFormTriggerTraverser traverser = new PlacementFormTriggerTraverser(formPlacementDto, updatingUserID, true,
				bullhornData);

		return handleRequest(traverser);
	}

}
