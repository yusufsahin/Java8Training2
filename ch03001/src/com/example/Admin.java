package com.example;

public class Admin extends Employee{
    private String system;

    public Admin() {
    }

    public Admin(int empId, String name, String ssn, double salary, String system) {
        super(empId, name, ssn, salary);
        this.system = system;
    }

    public String getSystem() {
        return system;
    }

    public void setSystem(String system) {
        this.system = system;
    }
}
