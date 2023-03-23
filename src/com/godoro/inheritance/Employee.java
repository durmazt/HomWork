package com.godoro.inheritance;

public class Employee extends Person {

    private long employeeId;
    private double mothlySalary;

    public Employee(String firstName, String lastName,long employeeId,double monthlySalary) {
        super(firstName, lastName);
        this.employeeId=employeeId;
        this.mothlySalary=monthlySalary;
    }

    @Override
    public void sendmail(Employee e) {
        System.out.println("address: "+e.getMail()+"\n message: xyz");
    }

    public long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(long employeeId) {
        this.employeeId = employeeId;
    }

    public double getMothlySalary() {
        return mothlySalary;
    }

    public void setMothlySalary(double mothlySalary) {
        this.mothlySalary = mothlySalary;
    }
}
