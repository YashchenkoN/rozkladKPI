package com.room103.utils;

/**
 * Created by kolyan on 9/27/15.
 */
public enum ConnectionURL {

    GROUPS("http://api.rozklad.org.ua/v2/groups/"),
    FILTER("?filter=");

    private String value;

    private ConnectionURL(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}