package com.client.custom.controller.formscript.joborder;


import org.apache.log4j.Logger;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.client.core.base.tools.web.MediaTypes;
import com.client.custom.controller.formscript.AbstractFormScriptController;
import com.client.custom.service.formscript.joborder.JobOrderFormScriptService;

/**
 * Created by john.sullivan on 25/5/2017.
 */
@RestController
public class JobOrderFormScriptController extends AbstractFormScriptController {

    private final Logger log = Logger.getLogger(getClass());

    private final JobOrderFormScriptService jobOrderFormScriptService;

    @Autowired
    public JobOrderFormScriptController(JobOrderFormScriptService jobOrderFormScriptService) {
        this.jobOrderFormScriptService = jobOrderFormScriptService;
    }

    @RequestMapping(value = "jobHasApprovedPlacement", method = RequestMethod.GET, produces = MediaTypes.JSONP)
    public String jobHasApprovedPlacement(@RequestParam("jobOrderID") Integer jobOrderID, @RequestParam("callback") String callback) {
        JSONObject result = new JSONObject();

        try {
            Boolean jobHasApprovedPlacement = jobOrderFormScriptService.jobHasApprovedPlacement(jobOrderID);

            result.put("success", true);
            result.put("jobHasApprovedPlacement", jobHasApprovedPlacement);
        } catch(RuntimeException e) {
            log.error("Error checking if job #"+jobOrderID+" has approved placements", e);

            result.put("success", false);
            result.put("error", e.getMessage());
        }

        return response(callback, result);
    }

}
