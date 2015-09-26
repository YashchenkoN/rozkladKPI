package com.room103.api.groups;

/**
 * Created by hamsternik on 9/27/15.
 */
public class Teacher {

    private int teacher_id;
    private String teacher_name;
    private String teacher_full_name;
    private String teacher_short_name;
    private String teacher_url;
    private double teacher_rating;

    public int getTeacherId() { return teacher_id; }
    public void setTeacherId(int teacher_id) { this.teacher_id = teacher_id; }

    public String getTeacherName() { return teacher_name; }
    public void setTeacherName(String teacher_name) { this.teacher_name = teacher_name; }

    public String getTeacherFullName() { return teacher_full_name; }
    public void setTeacherFullName(String teacher_full_name) { this.teacher_full_name = teacher_full_name; }

    public String getTeacherShortName() { return teacher_short_name; }
    public void setTeacherShortName(String teacher_short_name) { this.teacher_short_name = teacher_short_name; }

    public String getTeacherUrl() { return teacher_url; }
    public void setTeacherUrl(String teacherUrl) { this.teacher_url = teacher_url; }

    public double getTeacherRating() { return teacher_rating; }
    public void setTeacher_rating(double teacher_rating) { this.teacher_rating = teacher_rating; }
}
