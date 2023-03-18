package com.godoro.education;

import com.godoro.sports.Player;

import java.util.ArrayList;

public class EducationTest {

    public static void main(String[] args) {

        School school = new School(901,"Godoro Üniversitesi");
        school.setClasses(new ArrayList<>());


        Classroom class0 = new Classroom(701,"Mühendislik");
        class0.setSchool(school);
        class0.setStudents(new ArrayList<>());
        school.getClasses().add(class0);

        Classroom class1 = new Classroom(702,"Ekonomi");
        class1.setSchool(school);
        class1.setStudents(new ArrayList<>());
        school.getClasses().add(class1);

        Student student0= new Student(301,"Neşet Ertaş",45.2);
        student0.setClassroom(class0);
        class0.getStudents().add(student0);

        Student student1= new Student(303,"Mahsuni Şerif",36.5);
        student1.setClassroom(class0);
        class0.getStudents().add(student1);

        Student student2= new Student(304,"Celal Güzelses",61.2);
        student2.setClassroom(class0);
        class0.getStudents().add(student2);

        Student student3= new Student(302,"Erkan Ocaklı",71.3);
        student3.setClassroom(class1);
        class1.getStudents().add(student3);

        Student student4= new Student(305,"Mustafa Topaloğlu",42.2);
        student4.setClassroom(class1);
        class1.getStudents().add(student4);

        System.out.println(school.getSchoolId()+" "+school.getSchoolName());

        for (Classroom classroom: school.getClasses())
        {
            System.out.println("\t"+classroom.getClassroomId()+" "+classroom.getClassroomName() );
            for(Student student: classroom.getStudents())
            {
                System.out.println("\t\t"+student.getStudentId()+" \""+student.getStudentName()+"\" "+student.getAverageMark());
            }
        }


    }
}
