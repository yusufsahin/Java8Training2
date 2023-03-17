package com.example;

public class Manager extends Employee{

    //Employee employee;
    private String deptName;


    public Manager() {
    }

    public Manager(String deptName) {
        this.deptName = deptName;
    }

    public Manager(int empId, String name, String ssn, double salary) {
        super(empId, name, ssn, salary);

    }



    public Manager(int empId, String name, String ssn, double salary, String deptName) {
        super(empId, name, ssn, salary);
        this.deptName = deptName;
    }



    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }
}
