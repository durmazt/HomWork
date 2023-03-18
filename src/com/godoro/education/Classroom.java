package com.godoro.education;

import java.util.List;

public class Classroom {

    private int classroomId;
    private String ClassroomName;
    private List<Student> students;
    private School school;

    public Classroom() {
    }

    public Classroom(int classroomId, String classroomName) {
        this.classroomId = classroomId;
        this.ClassroomName = classroomName;
    }

    public int getClassroomId() {
        return classroomId;
    }

    public void setClassroomId(int classroomId) {
        this.classroomId = classroomId;
    }

    public String getClassroomName() {
        return ClassroomName;
    }

    public void setClassroomName(String classroomName) {
        ClassroomName = classroomName;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public School getSchool() {
        return school;
    }

    public void setSchool(School school) {
        this.school = school;
    }
}
