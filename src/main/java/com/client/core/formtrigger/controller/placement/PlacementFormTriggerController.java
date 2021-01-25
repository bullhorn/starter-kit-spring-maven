package com.client.core.formtrigger.controller.placement;

import com.bullhornsdk.data.model.entity.core.standard.Placement;
import com.client.core.base.model.relatedentity.PlacementRelatedEntity;
import com.client.core.base.workflow.node.TriggerValidator;
import com.client.core.formtrigger.controller.AbstractFormTriggerController;
import com.client.core.formtrigger.model.form.impl.FormPlacementDto;
import com.client.core.formtrigger.model.helper.impl.PlacementFormTriggerHelper;
import com.client.core.formtrigger.workflow.traversing.PlacementFormTriggerTraverser;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

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
public class PlacementFormTriggerController extends AbstractFormTriggerController<Placement, PlacementFormTriggerHelper, PlacementFormTriggerTraverser> {

	private final Logger log = Logger.getLogger(PlacementFormTriggerController.class);

    @Autowired
    public PlacementFormTriggerController(Optional<List<TriggerValidator<Placement, PlacementFormTriggerHelper, PlacementFormTriggerTraverser>>> triggerValidators) {
        super(Placement.class, triggerValidators, PlacementRelatedEntity.values());
    }

	/**
	 * Called when placement is added.
	 * 
	 * @param formPlacementDto
	 *            contains all the relevant data from the form
	 * @param updatingUserID
	 *            id of corporate user who saved the form
	 * @return the json parsed form response message
	 */
	@RequestMapping(value = { "add" }, method = RequestMethod.POST, produces = { MediaType.APPLICATION_JSON_UTF8_VALUE })
	@ResponseBody
	public String addEntity(@ModelAttribute FormPlacementDto formPlacementDto, @RequestParam("ft.userId") Integer updatingUserID) {
		log.info("---------------------------- Starting Placement Validation Add Process----------------------------------------");

		PlacementFormTriggerTraverser traverser = new PlacementFormTriggerTraverser(formPlacementDto, updatingUserID, false,
				getRelatedEntityFields());

		return handleRequest(traverser);
	}

	/**
	 * Called when placement is edited
	 * 
	 * @param formPlacementDto
	 *            contains all the relevant data from the form
	 * @param updatingUserID
	 *            id of corporate user who saved the form
	 * @return the json parsed form response message
	 */
	@RequestMapping(value = { "edit" }, method = RequestMethod.POST, produces = { MediaType.APPLICATION_JSON_UTF8_VALUE })
	@ResponseBody
	public String editEntity(@ModelAttribute FormPlacementDto formPlacementDto, @RequestParam("ft.userId") Integer updatingUserID) {
		log.info("---------------------------- Starting Placement Validation Edit Process----------------------------------------");

		PlacementFormTriggerTraverser traverser = new PlacementFormTriggerTraverser(formPlacementDto, updatingUserID, true,
				getRelatedEntityFields());

		return handleRequest(traverser);
	}

}
