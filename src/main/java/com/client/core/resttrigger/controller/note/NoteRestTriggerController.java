package com.client.core.resttrigger.controller.note;

import com.bullhornsdk.data.model.entity.core.standard.Note;
import com.client.core.base.model.relatedentity.NoteRelatedEntity;
import com.client.core.base.workflow.node.TriggerValidator;
import com.client.core.resttrigger.controller.AbstractRestTriggerController;
import com.client.core.resttrigger.model.api.RestTriggerRequest;
import com.client.core.resttrigger.model.api.RestTriggerResponse;
import com.client.core.resttrigger.model.helper.impl.NoteRestTriggerHelper;
import com.client.core.resttrigger.workflow.traversing.NoteRestTriggerTraverser;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;
import java.util.Optional;

@Log4j2
@Controller
@RequestMapping("${rest.prefix.core}/note/*")
public class NoteRestTriggerController extends AbstractRestTriggerController<Note, NoteRestTriggerHelper, NoteRestTriggerTraverser> {

    @Autowired
    public NoteRestTriggerController(Optional<List<TriggerValidator<Note, NoteRestTriggerHelper, NoteRestTriggerTraverser>>> triggerValidators) {
        super(Note.class, triggerValidators, NoteRelatedEntity.values());
    }

    /**
     * Called when lead is added.
     *
     * @param body
     *
     * @return the json parsed form response message
     */
    @RequestMapping(value = { "add" }, method = RequestMethod.POST, produces = { MediaType.APPLICATION_JSON_VALUE })
    @ResponseBody
    public RestTriggerResponse addEntity(@RequestBody String body) {
        log.info("---------------------------- Starting Note Add Validation Process From Rest Trigger ----------------------------------------");

	    Map<String, Object> valuesChanges = (Map<String, Object>) convertToMap(body).get("data");

	    RestTriggerRequest<Note> restTriggerRequest = convertToObject(body);

	    Integer entityID = restTriggerRequest.getMeta().getEntityId();
	    Integer updatingUserID = restTriggerRequest.getMeta().getUserId();

	    NoteRestTriggerTraverser traverser = new NoteRestTriggerTraverser(entityID, valuesChanges, updatingUserID, false, getRelatedEntityFields());

	    return handleRequest(traverser, valuesChanges);
    }

    /**
     * Called when lead is edited.
     *
     * @param body
     *
     * @return the json parsed form response message
     */
    @RequestMapping(value = { "edit" }, method = RequestMethod.POST, produces = { MediaType.APPLICATION_JSON_VALUE })
    @ResponseBody
    public RestTriggerResponse editEntity(@RequestBody String body) {
        log.info("---------------------------- Starting Note Edit Validation Process From Rest Trigger ----------------------------------------");

	    Map<String, Object> valuesChanges = (Map<String, Object>) convertToMap(body).get("data");

	    RestTriggerRequest<Note> restTriggerRequest = convertToObject(body);

	    Integer entityID = restTriggerRequest.getMeta().getEntityId();
	    Integer updatingUserID = restTriggerRequest.getMeta().getUserId();

	    NoteRestTriggerTraverser traverser = new NoteRestTriggerTraverser(entityID, valuesChanges, updatingUserID, true, getRelatedEntityFields());

	    return handleRequest(traverser, valuesChanges);
    }

}
