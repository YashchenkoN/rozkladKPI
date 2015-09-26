package com.room103.api.groups;

import com.room103.api.BaseRequest;

/**
 * Created by kolyan on 9/26/15.
 */
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
