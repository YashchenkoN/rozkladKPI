package com.room103.api.groups;

import com.room103.api.BaseResponse;

/**
 * Created by kolyan on 9/26/15.
 */
public class GroupInfoResponse extends BaseResponse {

    private int group_id;
    private String group_full_name;
    private String group_prefix;
    private GroupOkr group_okr;
    private GroupType group_type;
    private String group_url;

    public int getGroup_id() {
        return group_id;
    }

    public void setGroup_id(int group_id) {
        this.group_id = group_id;
    }

    public String getGroup_full_name() {
        return group_full_name;
    }

    public void setGroup_full_name(String group_full_name) {
        this.group_full_name = group_full_name;
    }

    public String getGroup_prefix() {
        return group_prefix;
    }

    public void setGroup_prefix(String group_prefix) {
        this.group_prefix = group_prefix;
    }

    public GroupOkr getGroup_okr() {
        return group_okr;
    }

    public void setGroup_okr(GroupOkr group_okr) {
        this.group_okr = group_okr;
    }

    public GroupType getGroup_type() {
        return group_type;
    }

    public void setGroup_type(GroupType group_type) {
        this.group_type = group_type;
    }

    public String getGroup_url() {
        return group_url;
    }

    public void setGroup_url(String group_url) {
        this.group_url = group_url;
    }
}
