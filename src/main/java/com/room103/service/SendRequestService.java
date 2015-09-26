package com.room103.service;

import com.room103.api.groups.AllGroupsRequest;
import com.room103.api.groups.AllGroupsResponse;

/**
 * Created by kolyan on 9/26/15.
 */
public interface SendRequestService {

    AllGroupsResponse sendAllGroupRequest(AllGroupsRequest allGroupsRequest);

}
