package com.godoro.education;

import java.util.List;

public class School {

    private int schoolId;
    private String SchoolName;
    private List<Classroom> classes;

    public School() {
    }

    public School(int schoolId, String schoolName) {
        this.schoolId = schoolId;
        SchoolName = schoolName;
    }

    public int getSchoolId() {
        return schoolId;
    }

    public void setSchoolId(int schoolId) {
        this.schoolId = schoolId;
    }

    public String getSchoolName() {
        return SchoolName;
    }

    public void setSchoolName(String schoolName) {
        SchoolName = schoolName;
    }

    public List<Classroom> getClasses() {
        return classes;
    }

    public void setClasses(List<Classroom> classes) {
        this.classes = classes;
    }
}
