package com.room103.api.groups;

import com.room103.api.BaseResponse;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

/**
 * Created by kolyan on 9/26/15.
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class AllGroupsResponse extends BaseResponse {

    private List<GroupInfoResponse> data;

    public List<GroupInfoResponse> getData() {
        return data;
    }

    public void setData(List<GroupInfoResponse> data) {
        this.data = data;
    }
}
