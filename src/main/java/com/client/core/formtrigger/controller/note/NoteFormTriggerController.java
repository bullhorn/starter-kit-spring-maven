package com.client.core.formtrigger.controller.note;

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

import com.bullhornsdk.data.model.entity.core.standard.Note;
import com.client.core.base.workflow.node.Node;
import com.client.core.formtrigger.controller.AbstractFormTriggerController;
import com.client.core.formtrigger.model.form.impl.FormNoteDto;
import com.client.core.formtrigger.workflow.traversing.NoteFormTriggerTraverser;

/**
 * Entry point for Job submission Validations.
 * 
 * The validate method instantiates a Traverser that will get passed through the workflow. The workflow is wired in formtrigger-workflow.xml
 * 
 * Actual logic is handled in Service class (see Service folder: com/client/core/service/formtrigger).
 */

@Controller
@RequestMapping("/formtrigger/note/*")
public class NoteFormTriggerController extends AbstractFormTriggerController<Note, NoteFormTriggerTraverser> {

	private final Logger log = Logger.getLogger(NoteFormTriggerController.class);

	@Autowired
	public NoteFormTriggerController(@Qualifier("noteValidationWorkflow") Node<NoteFormTriggerTraverser> noteValidationWorkflow) {
		super(Note.class, noteValidationWorkflow);

	}

	/**
	 * Both note add and note edit call the form trigger url setup for "Add Note"
	 * 
	 * @param formNoteDto
	 *            contains all the relevant data from the form
	 * @param updatingUserID
	 *            id of corporate user who saved the form
	 * @param response
	 * @param request
	 * @return the json parsed form response message
	 */
	@RequestMapping(value = { "add" }, method = RequestMethod.POST, produces = { MediaType.APPLICATION_JSON_UTF8_VALUE })
	@ResponseBody
	public String addEntity(@ModelAttribute FormNoteDto formNoteDto, @RequestParam("ft.userId") Integer updatingUserID,
                            HttpServletResponse response, HttpServletRequest request) {
		log.info("---------------------------- Starting Note Validation Process----------------------------------------");

		NoteFormTriggerTraverser traverser = new NoteFormTriggerTraverser(formNoteDto, updatingUserID, isEdit(formNoteDto),
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
