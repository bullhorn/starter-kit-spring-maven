package com.client.core.formtrigger.controller.clientcontactcandidate;

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

import com.bullhornsdk.data.model.entity.core.standard.ClientContact;
import com.client.core.base.workflow.node.Node;
import com.client.core.formtrigger.controller.AbstractFormTriggerController;
import com.client.core.formtrigger.model.form.impl.FormCandidateDto;
import com.client.core.formtrigger.model.form.impl.FormClientContactDto;
import com.client.core.formtrigger.workflow.traversing.impl.CandidateFormTriggerTraverser;
import com.client.core.formtrigger.workflow.traversing.impl.ClientContactFormTriggerTraverser;

/**
 * Entry point for Client Contact and Candidate Validations.
 * 
 * The validate method instantiates a Traverser that will get passed through the workflow. The workflow is wired in formtrigger-workflow.xml
 * 
 * Actual logic is handled in Service class (see Service folder: com/client/core/service/formtrigger).
 */

@Controller
public class ClientContactCandidateFormTriggerController extends
        AbstractFormTriggerController<ClientContact, ClientContactFormTriggerTraverser> {

	private final Logger log = Logger.getLogger(ClientContactCandidateFormTriggerController.class);
	private final Node<ClientContactFormTriggerTraverser> clientContactValidationWorkflow;
	private final Node<CandidateFormTriggerTraverser> candidateValidationWorkflow;

	@Autowired
	public ClientContactCandidateFormTriggerController(
			@Qualifier("clientContactValidationWorkflow") Node<ClientContactFormTriggerTraverser> clientContactValidationWorkflow,
			@Qualifier("candidateValidationWorkflow") Node<CandidateFormTriggerTraverser> candidateValidationWorkflow) {
		super(ClientContact.class, null);
		this.clientContactValidationWorkflow = clientContactValidationWorkflow;
		this.candidateValidationWorkflow = candidateValidationWorkflow;
	}

	/**
	 * Handle client contact add
	 * 
	 * @param formClientContactDto
	 *            contains all the relevant data from the form
	 * @param updatingUserID
	 *            id of corporate user who saved the form
	 * @param response
	 * @param request
	 * @return the json parsed validation message
	 */
	@RequestMapping(value = { "/formtrigger/clientcontact/add" }, method = RequestMethod.POST, produces = { MediaType.APPLICATION_JSON_UTF8_VALUE })
	@ResponseBody
	public String addEntity(@ModelAttribute FormClientContactDto formClientContactDto, @RequestParam("ft.userId") Integer updatingUserID,
                            HttpServletResponse response, HttpServletRequest request) {
		// Start the validation process.
		log.info("---------------------------- Starting Client Contact Validation Process----------------------------------------");

		ClientContactFormTriggerTraverser traverser = new ClientContactFormTriggerTraverser(formClientContactDto, updatingUserID,
				false, bullhornData);

		return handleClientContactRequest(traverser);

	}

	/**
	 * Handle either client contact or candidate edit
	 * 
	 * @param formClientContactDto
	 *            contains all the relevant data from the form
	 * @param formCandidateDto
	 *            contains all the relevant data from the form
	 * @param updatingUserID
	 *            id of corporate user who saved the form
	 * @param response
	 * @param request
	 * @return the json parsed form response message
	 */
	@RequestMapping(value = { "/formtrigger/clientcontactcandidate/edit" }, method = RequestMethod.POST, produces = { MediaType.APPLICATION_JSON_UTF8_VALUE })
	@ResponseBody
	public String editEntity(@ModelAttribute FormClientContactDto formClientContactDto, @ModelAttribute FormCandidateDto formCandidateDto,
                             @RequestParam("ft.userId") Integer updatingUserID, HttpServletResponse response, HttpServletRequest request) {
		// Start the validation process.

		if (isClientContactSave(formClientContactDto)) {
			log.info("---------------------------- Starting Client Contact Validation Process----------------------------------------");
			ClientContactFormTriggerTraverser traverser = new ClientContactFormTriggerTraverser(formClientContactDto, updatingUserID,
					true,bullhornData);

			return handleClientContactRequest(traverser);
		}

		if (isCandidateSave(formCandidateDto)) {
			log.info("---------------------------- Starting Candidate Validation Process----------------------------------------");
			CandidateFormTriggerTraverser traverser = new CandidateFormTriggerTraverser(formCandidateDto, updatingUserID,
					true, bullhornData);

			return handleCandidateRequest(traverser);
		}
		return "{\"result\":\"false\",\"error\":\"Incorrect form trigger setup.\"}";

	}

	/**
	 * Handle candidate add
	 * 
	 * @param formCandidateDto
	 *            contains all the relevant data from the form
	 * @param updatingUserID
	 *            id of corporate user who saved the form
	 * @param response
	 * @param request
	 * @return the json parsed form response message
	 */
	@RequestMapping(value = { "/formtrigger/candidate/add" }, method = RequestMethod.POST, produces = { MediaType.APPLICATION_JSON_UTF8_VALUE })
	@ResponseBody
	public String addEntity(@ModelAttribute FormCandidateDto formCandidateDto, @RequestParam("ft.userId") Integer updatingUserID,
                            HttpServletResponse response, HttpServletRequest request) {
		// Start the validation process.
		log.info("---------------------------- Starting Candidate Validation Process----------------------------------------");

		CandidateFormTriggerTraverser traverser = new CandidateFormTriggerTraverser(formCandidateDto, updatingUserID, false,
				bullhornData);

		return handleCandidateRequest(traverser);
	}

	/**
	 * Helper method for candidate requests
	 * 
	 * @param traverser
	 * @return the json parsed validation message
	 */
	private String handleCandidateRequest(CandidateFormTriggerTraverser traverser) {

		try {
			candidateValidationWorkflow.start(traverser);
		} catch (Exception e) {
			log.error("Error validating candidate", e);
			return prepareErrorReturnValue("candidate");
		}

		return prepareReturnValue(traverser.getFormResponse());
	}

	/**
	 * Helper method for client contact requests
	 * 
	 * @param traverser
	 * @return the json parsed validation message
	 */
	private String handleClientContactRequest(ClientContactFormTriggerTraverser traverser) {

		try {
			clientContactValidationWorkflow.start(traverser);
		} catch (Exception e) {
			log.error("Error validating client contact", e);
			return prepareErrorReturnValue("client contact");
		}

		return prepareReturnValue(traverser.getFormResponse());
	}

	/**
	 * Added since the there is only one form trigger for both candidate and client contact edit
	 * 
	 * @param formClientContactDto
	 * 
	 * @return true if candidateRestrictionBits != null
	 */
	private boolean isClientContactSave(FormClientContactDto formClientContactDto) {

		if (formClientContactDto.getCandidateRestrictionBits() != null) {
			return true;
		}
		return false;

	}

	/**
	 * Added since the there is only one form trigger for both candidate and client contact edit
	 * 
	 * @param formCandidateDto
	 * 
	 * @return true if clientRestrictionBits != null
	 */
	private boolean isCandidateSave(FormCandidateDto formCandidateDto) {

		if (formCandidateDto.getClientRestrictionBits() != null) {
			return true;
		}
		return false;

	}

}
