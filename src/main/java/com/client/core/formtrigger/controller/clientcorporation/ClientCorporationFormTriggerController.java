package com.client.core.formtrigger.controller.clientcorporation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bullhornsdk.data.api.BullhornData;
import com.bullhornsdk.data.model.entity.core.standard.ClientCorporation;
import com.client.core.base.tools.web.MediaTypes;
import com.client.core.base.workflow.node.Node;
import com.client.core.formtrigger.controller.AbstractFormTriggerController;
import com.client.core.formtrigger.model.form.impl.FormClientCorporationDto;
import com.client.core.formtrigger.workflow.traversing.impl.ClientCorporationValidationTraverser;

/**
 * Entry point for Client Corporation Validations.
 * 
 * The validate method instantiates a Traverser that will get passed through the workflow. The workflow is wired in formtrigger-workflow.xml
 * 
 * Actual logic is handled in Service class (see Service folder: com/client/core/service/formtrigger).
 */

@Controller
@RequestMapping("/formtrigger/clientcorporation/*")
public class ClientCorporationFormTriggerController extends
		AbstractFormTriggerController<ClientCorporation, ClientCorporationValidationTraverser> {

	@Autowired
	public ClientCorporationFormTriggerController(
			@Qualifier("clientCorporationValidationWorkflow") Node<ClientCorporationValidationTraverser> clientCorporationValidationWorkflow,
			BullhornData bullhornData) {
		super(bullhornData, ClientCorporation.class, clientCorporationValidationWorkflow);
	}

	/**
	 * Called when client corporation is added
	 * 
	 * @param formClientCorporationDto
	 *            contains all the relevant data from the form
	 * @param updatingUserID
	 *            id of corporate user who saved the form
	 * @return the json parsed form response message
	 */
	@RequestMapping(value = { "add" }, method = RequestMethod.POST, produces = { MediaTypes.JSON })
	@ResponseBody
	public String addEntity(@ModelAttribute FormClientCorporationDto formClientCorporationDto,
			@RequestParam("ft.userId") Integer updatingUserID) {
		log.info("---------------------------- Starting Client Corporation Validation Process----------------------------------------");

		ClientCorporationValidationTraverser traverser = new ClientCorporationValidationTraverser(formClientCorporationDto, updatingUserID,
				false, bullhornData);

		return handleRequest(traverser);
	}

	/**
	 * Called when client corporation is edited
	 * 
	 * @param formClientCorporationDto
	 *            contains all the relevant data from the form
	 * @param updatingUserID
	 *            id of corporate user who saved the form
	 * @return the json parsed form response message
	 */
	@RequestMapping(value = { "edit" }, method = RequestMethod.POST, produces = { MediaTypes.JSON })
	@ResponseBody
	public String editEntity(@ModelAttribute FormClientCorporationDto formClientCorporationDto,
			@RequestParam("ft.userId") Integer updatingUserID) {
		log.info("---------------------------- Starting Client Corporation Validation Process----------------------------------------");

		ClientCorporationValidationTraverser traverser = new ClientCorporationValidationTraverser(formClientCorporationDto, updatingUserID,
				true, bullhornData);

		return handleRequest(traverser);
	}

}
