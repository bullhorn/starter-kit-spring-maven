package com.client.core.formtrigger.controller.job;

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
import com.bullhornsdk.data.model.entity.core.standard.JobOrder;
import com.client.core.base.tools.entitychanger.EntityChanger;
import com.client.core.base.tools.web.MediaTypes;
import com.client.core.base.workflow.node.Node;
import com.client.core.formtrigger.controller.AbstractRestTriggerController;
import com.client.core.formtrigger.model.api.RestTriggerRequest;
import com.client.core.formtrigger.model.api.RestTriggerResponse;
import com.client.core.formtrigger.workflow.traversing.impl.JobValidationTraverser;


/**
 * Created by hiqbal on 12/15/2015.
 */
@Controller
@RequestMapping("/resttrigger/job/*")
public class JobRestTriggerController extends AbstractRestTriggerController<JobOrder, JobValidationTraverser> {

    private final Logger log = Logger.getLogger(JobRestTriggerController.class);


    @Autowired
    public JobRestTriggerController(@Qualifier("jobRestValidationWorkflow") Node<JobValidationTraverser> jobValidationWorkflow,
                                    BullhornData bullhornData, EntityChanger entityChanger) {
        super(bullhornData, JobOrder.class, jobValidationWorkflow, entityChanger);
    }

    /**
     * Called when job is added.
     *
     * @param jobRequest
     *           contains all the relevant data from the call

     * @param response
     * @param request
     * @return the json parsed form response message
     */
    @RequestMapping(value = { "add" }, method = RequestMethod.POST, produces = { MediaTypes.JSON })
    @ResponseBody
    public RestTriggerResponse<JobOrder> addEntity(@RequestBody RestTriggerRequest<JobOrder> jobRequest, HttpServletResponse response, HttpServletRequest request) {
        log.info("---------------------------- Starting Job Validation Add Process From Rest Trigger ----------------------------------------");

        JobOrder jobOrder = jobRequest.getData();
        Integer updatingUserID = jobRequest.getMeta().getUserId();

        JobValidationTraverser traverser = new JobValidationTraverser(jobOrder, updatingUserID, false, true, bullhornData);

        return handleRequest(traverser);

    }

    /**
     * Called when job is edited.
     *
     * @param jobRequest
     *            contains all the relevant data from the call

     * @param response
     * @param request
     * @return the json parsed form response message
     */
    @RequestMapping(value = { "edit" }, method = RequestMethod.POST, produces = { MediaTypes.JSON })
    @ResponseBody
    public RestTriggerResponse<JobOrder> editEntity(@RequestBody RestTriggerRequest<JobOrder> jobRequest, HttpServletResponse response, HttpServletRequest request) {

        log.info("---------------------------- Starting Job Validation Edit Process From Rest Trigger ----------------------------------------");

        JobOrder jobOrder = jobRequest.getData();
        Integer updatingUserID = jobRequest.getMeta().getUserId();

        JobValidationTraverser traverser = new JobValidationTraverser(jobOrder, updatingUserID, true, true, bullhornData);

        return handleRequest(traverser);
    }


}
