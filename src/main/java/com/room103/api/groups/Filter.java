package com.room103.api.groups;

import com.room103.api.BaseRequest;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by hamsternik on 9/27/15.
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Filter extends BaseRequest {

    private int day_number;
    private String day_name;
    private int lesson_number;
    private int lesson_week;
    private String lesson_type;
    private double rate;

    public int getDayNumber() {
        return day_number;
    }
    public String getDayName() {
        return day_name;
    }
    public int getLessonNumber() {
        return lesson_number;
    }
    public int getLessonWeek() {
        return lesson_week;
    }
    public String getLessonType() {
        return lesson_type;
    }
    public double getRate() {
        return rate;
    }


    public void setDayNumber(int day_number) {
        this.day_number = day_number;
    }
    public void setDayName(String day_name) {
        this.day_name = day_name;
    }
    public void setLessonNumber(int lesson_number) {
        this.lesson_number = lesson_number;
    }
    public void settLessonWeek(int lesson_week) {
        this.lesson_week = lesson_week;
    }
    public void setLessonType(String lesson_type) {
        this.lesson_type = lesson_type;
    }
    public void setRate(double rate) {
        this.rate = rate;
    }
}
