package com.room103.api.groups;

import com.room103.api.BaseRequest;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by kolyan on 9/26/15.
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class AllGroupsRequest extends BaseRequest {

    private static int groupNumbers = 1755;

    private int limit;
    private int offset;

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    public int getOffset() {
        return offset;
    }

    public void setOffset(int offset) {
        this.offset = offset;
    }
}
