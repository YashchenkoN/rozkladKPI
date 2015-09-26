package com.room103.api.groups;

/**
 * Created by hamsternik on 9/27/15.
 */
public class Room {
    private int room_id;
    private String room_name;
    private double room_latitude;
    private double room_longitude;

    public int getRoomId() { return room_id; }
    public void setRoomId(int room_id) { this.room_id = room_id; }

    public String getRoomName() { return room_name; }
    public void setRoomName(String room_name) { this.room_name = room_name; }

    public double getRoomLatitude() { return room_latitude; }
    public void setRoomLatitude(double room_latitude) { this.room_latitude = room_latitude; }

    public double getRoomLongtitude() { return room_longitude; }
    public void setRoomLongitude(double room_longitude) { this.room_longitude= room_longitude; }
}
