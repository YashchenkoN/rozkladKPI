package com.room103.api.groups;

/**
 * Created by kolyan on 9/27/15.
 */
public enum GroupOkr {
    MAGISTER("magister");

    private String value;

    private GroupOkr(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
