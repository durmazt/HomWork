package com.godoro.education;

import java.util.List;

public class Student {

    private int studentId;
    private String StudentName;
    private double averageMark;
    private Classroom classroom;

    public Student() {
    }

    public Student(int studentId, String studentName, double averageMark) {
        this.studentId = studentId;
        StudentName = studentName;
        this.averageMark = averageMark;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return StudentName;
    }

    public void setStudentName(String studentName) {
        StudentName = studentName;
    }

    public double getAverageMark() {
        return averageMark;
    }

    public void setAverageMark(double averageMark) {
        this.averageMark = averageMark;
    }

    public Classroom getClassroom() {
        return classroom;
    }

    public void setClassroom(Classroom classroom) {
        this.classroom = classroom;
    }
}
