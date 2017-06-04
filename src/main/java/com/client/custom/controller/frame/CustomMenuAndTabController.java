package com.client.custom.controller.frame;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.client.custom.model.frame.FrameData;
import com.client.custom.service.frame.FrameService;
import com.google.common.collect.Sets;

/**
 * Created by john.sullivan on 25/5/2017.
 */
@Controller
@RequestMapping("/frames/*")
public class CustomMenuAndTabController {

    private final FrameService frameService;

    @Autowired
    public CustomMenuAndTabController(FrameService frameService) {
        this.frameService = frameService;
    }

    @RequestMapping(value = "init", method = {RequestMethod.GET, RequestMethod.POST})
    public String init(@RequestParam("UserID") Integer corporateUserID, @RequestParam("EntityType") String entityType,
                       @RequestParam("EntityID") Integer[] entityIDs, Model model) {
        FrameData frameData = frameService.getFrameData(corporateUserID, entityType, Sets.newHashSet(entityIDs));

        model.addAttribute("data", frameData);

        return "custom-menu-and-tabs";
    }

}
