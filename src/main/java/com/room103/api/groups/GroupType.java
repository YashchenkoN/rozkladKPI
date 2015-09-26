package com.room103.api.groups;

/**
 * Created by kolyan on 9/27/15.
 */
public enum GroupType {
    DAILY("daily"),
    EXTRAMURAL("extramural");

    private String value;

    private GroupType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
