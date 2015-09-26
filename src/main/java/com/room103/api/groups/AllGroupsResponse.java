package com.room103.api.groups;

import com.room103.api.BaseResponse;

import java.util.List;

/**
 * Created by kolyan on 9/26/15.
 */
public class AllGroupsResponse extends BaseResponse {

    private int statusCode;
    private int timeStamp;
    private String message;
    private String debugInfo;
    private Meta meta;
    private List<GroupInfoResponse> data;

    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    public int getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(int timeStamp) {
        this.timeStamp = timeStamp;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getDebugInfo() {
        return debugInfo;
    }

    public void setDebugInfo(String debugInfo) {
        this.debugInfo = debugInfo;
    }

    public Meta getMeta() {
        return meta;
    }

    public void setMeta(Meta meta) {
        this.meta = meta;
    }

    public List<GroupInfoResponse> getData() {
        return data;
    }

    public void setData(List<GroupInfoResponse> data) {
        this.data = data;
    }
}
