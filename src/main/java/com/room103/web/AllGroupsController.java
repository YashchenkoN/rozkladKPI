package com.room103.web;

import com.room103.api.groups.AllGroupsRequest;
import com.room103.api.groups.AllGroupsResponse;
import com.room103.service.SendRequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by kolyan on 9/27/15.
 */
@Controller
public class AllGroupsController {

    @Autowired
    private SendRequestService sendRequestService;

    @RequestMapping(value = "xml/allGroups/{limit}/{offset}")
    @ResponseBody
    public AllGroupsResponse getAllGroupsRest(@PathVariable("limit") String limit,
                                              @PathVariable("offset") String offset) {
        AllGroupsRequest allGroupsRequest = new AllGroupsRequest();
        try {
            int limitInt = Integer.parseInt(limit);
            int offsetInt = Integer.parseInt(offset);
            allGroupsRequest.setLimit(limitInt);
            allGroupsRequest.setOffset(offsetInt);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return sendRequestService.sendAllGroupRequest(allGroupsRequest);
    }

    @RequestMapping(value = "allGroups/{limit}/{offset}")
    public ModelAndView getAllGroups(@PathVariable("limit") String limit,
                                     @PathVariable("offset") String offset) {
        ModelAndView mav = new ModelAndView("groups/all-groups");
        AllGroupsRequest allGroupsRequest = new AllGroupsRequest();
        try {
            int limitInt = Integer.parseInt(limit);
            int offsetInt = Integer.parseInt(offset);
            allGroupsRequest.setLimit(limitInt);
            allGroupsRequest.setOffset(offsetInt);
        } catch (Exception e) {
            e.printStackTrace();
        }

        AllGroupsResponse allGroupsResponse = sendRequestService.sendAllGroupRequest(allGroupsRequest);
        mav.addObject("groupsResponse", allGroupsResponse);
        return mav;
    }
}
