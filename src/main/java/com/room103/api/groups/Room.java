package com.room103.api.groups;

/**
 * Created by hamsternik on 9/27/15.
 */
public class Room {
    private int room_id;
    private String room_name;
    private double room_latitude;
    private double room_longitude;

    public int getRoom_id() {
        return room_id;
    }

    public void setRoom_id(int room_id) {
        this.room_id = room_id;
    }

    public String getRoom_name() {
        return room_name;
    }

    public void setRoom_name(String room_name) {
        this.room_name = room_name;
    }

    public double getRoom_latitude() {
        return room_latitude;
    }

    public void setRoom_latitude(double room_latitude) {
        this.room_latitude = room_latitude;
    }

    public double getRoom_longitude() {
        return room_longitude;
    }

    public void setRoom_longitude(double room_longitude) {
        this.room_longitude = room_longitude;
    }
}
