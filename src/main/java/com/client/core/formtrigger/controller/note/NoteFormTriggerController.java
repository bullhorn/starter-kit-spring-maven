package com.client.core.formtrigger.controller.note;

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
import com.bullhornsdk.data.model.entity.core.standard.Note;
import com.client.core.formtrigger.controller.AbstractFormTriggerController;
import com.client.core.formtrigger.workflow.traversing.impl.NoteValidationTraverser;
import com.client.core.base.tools.web.MediaTypes;
import com.client.core.formtrigger.model.form.impl.FormNoteDto;
import com.client.core.base.workflow.node.Node;

/**
 * Entry point for Job submission Validations.
 * 
 * The validate method instantiates a Traverser that will get passed through the workflow. The workflow is wired in formtrigger-workflow.xml
 * 
 * Actual logic is handled in Service class (see Service folder: com/client/core/service/formtrigger).
 */

@Controller
@RequestMapping("/formtrigger/note/*")
public class NoteFormTriggerController extends AbstractFormTriggerController<Note, NoteValidationTraverser> {

	@Autowired
	public NoteFormTriggerController(@Qualifier("noteValidationWorkflow") Node<NoteValidationTraverser> noteValidationWorkflow,
			BullhornData bullhornData) {
		super(bullhornData, Note.class, noteValidationWorkflow);
	}

	/**
	 * Both note add and note edit call the form trigger url setup for "Add Note"
	 * 
	 * @param formNoteDto
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
	public String addEntity(@ModelAttribute FormNoteDto formNoteDto, @RequestParam("ft.userId") Integer updatingUserID,
			@RequestParam("ft.corpId") Integer corporationID, HttpServletResponse response, HttpServletRequest request) {
		log.info("---------------------------- Starting Note Validation Process----------------------------------------");

		NoteValidationTraverser traverser = new NoteValidationTraverser(formNoteDto, updatingUserID, corporationID, isEdit(formNoteDto),
				bullhornData);

		return handleRequest(traverser);

	}

	/**
	 * Checks is the form post is adding or editing a note
	 * 
	 * @param formNoteDto
	 * @return false if userCommentID is null or -1, true otherwise.
	 */
	private boolean isEdit(FormNoteDto formNoteDto) {
		Integer userCommentID = formNoteDto.getUserCommentID();

		if (userCommentID == null || userCommentID == -1) {
			return false;
		}

		return true;
	}

}