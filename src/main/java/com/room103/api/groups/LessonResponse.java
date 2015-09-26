package com.room103.api.groups;

import com.room103.api.BaseRequest;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.Date;

/**
 * Created by hamsternik on 9/27/15.
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class LessonResponse extends BaseRequest {

    private int lesson_id;
    private int group_id;
    private int day_number;
    private String day_name;
    private String lesson_name;
    private int lesson_number;
    private String lesson_room;
    private String lesson_type;
    private String teacher_name;
    private int lesson_week;
    private String time_start;
    private String time_end;
    private int rate;
    private Teacher teachers;
    private Room rooms;

    public int getLessonId() { return lesson_id; }
    public void setLessonId(int lesson_id) {this.lesson_id = lesson_id; }

    public int getGroupId() {return group_id; }
    public void setGroupId(int groupId) { this.group_id = groupId; }

    public int getDayNumber() { return day_number; }
    public void setDayNumber(int day_number) { this.day_number = day_number; }

    public String getDayName() { return  day_name; }
    public void setDayName(String day_name) { this.day_name = day_name; }

    public String getLessonName() { return lesson_name; }
    public void setLessonName(String lesson_name) { this.lesson_name = lesson_name; }

    public int getLessonNumber() { return lesson_number; }
    public void setLessonNumber(int lesson_number) { this.lesson_number = lesson_number; }

    public String getLessonRoom() { return lesson_room; }
    public void setLessonRoom(String lesson_room) { this.lesson_room = lesson_room; }

    public String getLessonType() { return lesson_type; }
    public void setLessonType(String lesson_type) { this.lesson_type = lesson_type; }

    public String getTeacherName() { return teacher_name; }
    public void setTeacherName(String teacher_name) { this.teacher_name = teacher_name; }

    public int getLessonWeek() { return lesson_week; }
    public void setLesson_week(int lesson_week) { this.lesson_week = lesson_week; }

    public String getTimeStart() { return time_start; }
    public void setTimeStart(String time_start) { this.time_start = time_start; }

    public String getTimeEnd() { return  time_end; }
    public void setTimeEnd(String time_end) { this.time_end = time_end; }

    public int getRate() { return rate; }
    public void setRate(int rate) { this.rate = rate; }

    public Teacher getTeacher() { return teachers; }
    public void setTeacher(Teacher teachers) {this.teachers = teachers; }

    public Room getRoom() { return rooms; }
    public void setRooms(Room rooms) { this.rooms = rooms; }

}
