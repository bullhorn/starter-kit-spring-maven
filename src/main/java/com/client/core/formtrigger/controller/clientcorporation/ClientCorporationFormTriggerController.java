package com.client.core.formtrigger.controller.clientcorporation;

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

import com.bullhornsdk.data.model.entity.core.standard.ClientCorporation;
import com.client.core.base.workflow.node.Node;
import com.client.core.formtrigger.controller.AbstractFormTriggerController;
import com.client.core.formtrigger.model.form.impl.FormClientCorporationDto;
import com.client.core.formtrigger.workflow.traversing.ClientCorporationFormTriggerTraverser;

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
        AbstractFormTriggerController<ClientCorporation, ClientCorporationFormTriggerTraverser> {

	private final Logger log = Logger.getLogger(ClientCorporationFormTriggerController.class);

	@Autowired
	public ClientCorporationFormTriggerController(@Qualifier("clientCorporationValidationWorkflow") Node<ClientCorporationFormTriggerTraverser> clientCorporationValidationWorkflow) {
		super(ClientCorporation.class, clientCorporationValidationWorkflow);

	}

	/**
	 * Called when client corporation is added
	 * 
	 * @param formClientCorporationDto
	 *            contains all the relevant data from the form
	 * @param updatingUserID
	 *            id of corporate user who saved the form
	 * @param response
	 * @param request
	 * @return the json parsed form response message
	 */
	@RequestMapping(value = { "add" }, method = RequestMethod.POST, produces = { MediaType.APPLICATION_JSON_UTF8_VALUE })
	@ResponseBody
	public String addEntity(@ModelAttribute FormClientCorporationDto formClientCorporationDto,
                            @RequestParam("ft.userId") Integer updatingUserID, HttpServletResponse response, HttpServletRequest request) {
		// Start the validation process.
		log.info("---------------------------- Starting Client Corporation Validation Process----------------------------------------");

		ClientCorporationFormTriggerTraverser traverser = new ClientCorporationFormTriggerTraverser(formClientCorporationDto, updatingUserID,
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
	 * @param response
	 * @param request
	 * @return the json parsed form response message
	 */
	@RequestMapping(value = { "edit" }, method = RequestMethod.POST, produces = { MediaType.APPLICATION_JSON_UTF8_VALUE })
	@ResponseBody
	public String editEntity(@ModelAttribute FormClientCorporationDto formClientCorporationDto,
                             @RequestParam("ft.userId") Integer updatingUserID, HttpServletResponse response, HttpServletRequest request) {
		// Start the validation process.
		log.info("---------------------------- Starting Client Corporation Validation Process----------------------------------------");

		ClientCorporationFormTriggerTraverser traverser = new ClientCorporationFormTriggerTraverser(formClientCorporationDto, updatingUserID,
				true, bullhornData);

		return handleRequest(traverser);
	}

}
