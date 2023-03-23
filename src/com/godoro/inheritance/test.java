package com.godoro.inheritance;

public class test {

    public static void main(String[] args) {

        Employee e= new Employee("Edip", "Akbayram",401,56544.9);
        e.setMail("ed@hotmail.com");
        e.setEmployeeId(401);

        System.out.println("employee "+e.getEmployeeId()+" "+e.getFirstName()+" "+ e.getLastName());

    }
}
