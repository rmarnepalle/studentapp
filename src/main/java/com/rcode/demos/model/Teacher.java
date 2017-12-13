package com.rcode.demos.model;

import org.springframework.data.annotation.Id;

import javax.persistence.*;

@Entity
public class Teacher {
    @javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long teacherId;
    private String teacherName;
    private String teacherDept;

    public Teacher(){ }

    public Teacher( String teacherName, String teacherDept) {
        this.teacherName = teacherName;
        this.teacherDept = teacherDept;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public Long getTeacherId() {
        return teacherId;
    }

    public void setTeacherId (Long teacherId) {
        this.teacherId = teacherId;
    }

    public String getTeacherDept() {
        return teacherDept;
    }

    public void setTeacherDept(String teacherDept) {
        this.teacherDept = teacherDept;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "teacherId=" + teacherId +
                ", teacherName='" + teacherName + '\'' +
                ", teacherDept='" + teacherDept + '\'' +
                '}';
    }
}
