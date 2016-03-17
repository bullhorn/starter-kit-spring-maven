package com.client.core.formtrigger.controller.placement;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bullhornsdk.data.api.BullhornData;
import com.bullhornsdk.data.model.entity.core.standard.Placement;
import com.client.core.base.tools.entitychanger.EntityChanger;
import com.client.core.base.tools.web.MediaTypes;
import com.client.core.base.workflow.node.Node;
import com.client.core.formtrigger.controller.AbstractRestTriggerController;
import com.client.core.formtrigger.model.api.RestTriggerRequest;
import com.client.core.formtrigger.model.api.RestTriggerResponse;
import com.client.core.formtrigger.workflow.traversing.impl.PlacementValidationTraverser;

/**
 * Created by hiqbal on 12/16/2015.
 */
@Controller
@RequestMapping("/resttrigger/placement/*")
public class PlacementRestTriggerController extends AbstractRestTriggerController<Placement, PlacementValidationTraverser> {

    private final Logger log = Logger.getLogger(PlacementRestTriggerController.class);

    @Autowired
    public PlacementRestTriggerController(
            @Qualifier("placementValidationWorkFlow") Node<PlacementValidationTraverser> placementValidationWorkflow,
            BullhornData bullhornData, EntityChanger entityChanger) {
        super(bullhornData, Placement.class, placementValidationWorkflow, entityChanger);

    }

    /**
     * Called when placement is added.
     *
     * @param placementRequest
     *            contains all the relevant data from the form
     * @param response
     * @param request
     * @return the json parsed form response message
     */
    @RequestMapping(value = { "add" }, method = RequestMethod.POST, produces = { MediaTypes.JSON })
    @ResponseBody
    public RestTriggerResponse<Placement> addEntity(@RequestBody RestTriggerRequest<Placement> placementRequest, HttpServletResponse response, HttpServletRequest request) {
        log.info("---------------------------- Starting Placement Validation Add Process From Rest Trigger ----------------------------------------");

        Placement placement = placementRequest.getData();
        Integer updatingUserID = placementRequest.getMeta().getUserId();

        PlacementValidationTraverser traverser = new PlacementValidationTraverser(placement, updatingUserID, false,
                true, bullhornData);

        return handleRequest(traverser);
    }

    /**
     * Called when placement is edited
     *
     * @param placementRequest
     *            contains all the relevant data from the form

     * @param response
     * @param request
     * @return the json parsed form response message
     */
    @RequestMapping(value = { "edit" }, method = RequestMethod.POST, produces = { MediaTypes.JSON })
    @ResponseBody
    public RestTriggerResponse<Placement> editEntity(@RequestBody RestTriggerRequest<Placement> placementRequest, HttpServletResponse response, HttpServletRequest request) {

        log.info("----------------------------Starting Placement Validation Edit Process From Rest Trigger ----------------------------------------");

        Placement placement = placementRequest.getData();
        Integer updatingUserID = placementRequest.getMeta().getUserId();

        PlacementValidationTraverser traverser = new PlacementValidationTraverser(placement, updatingUserID, true,
                true, bullhornData);

        return handleRequest(traverser);
    }
}
