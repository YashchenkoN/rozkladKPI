package com.room103.service;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.room103.api.groups.AllGroupsRequest;
import com.room103.api.groups.AllGroupsResponse;
import com.room103.utils.FullURLName;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by kolyan on 9/27/15.
 */
@Service
public class SendRequestServiceImpl implements SendRequestService {

    @Autowired
    private ConnectionFactoryService connectionFactoryService;

    private static Logger logger = Logger.getLogger(SendRequestServiceImpl.class);
    private Gson gson = new GsonBuilder().create();

    @Override
    public AllGroupsResponse sendAllGroupRequest(AllGroupsRequest allGroupsRequest) {
        String json = gson.toJson(allGroupsRequest);
        String response = connectionFactoryService.send(json, FullURLName.GROUPS);
        AllGroupsResponse allGroupsResponse = gson.fromJson(response, AllGroupsResponse.class);
        return allGroupsResponse;
    }

}
