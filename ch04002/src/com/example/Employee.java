package com.example;

import java.util.Objects;

public class Employee {
    private int empId;
    private String name;
    private String ssn;
    private double salary;

    public Employee() {
    }

    public Employee(int empId, String name, String ssn, double salary) {
        this.empId = empId;
        this.name = name;
        this.ssn = ssn;
        this.salary = salary;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void raiseSalary(double increase){
        this.salary+=increase;
    }

    public String getDetails()
    {
        return  "ID:" +empId+" Name: "+name;
    }

    public double calcBonus(){
        return this.getSalary() * GoodBonus.getBonusPercent(this);
    }

    public String toString()
    {
        return  "Employee id :"+empId+"\n"+"Employee name: "+ name;
    }

    @Override
    public  boolean equals(Object o){
        boolean result=false;

        if((o!=null) && (o instanceof Employee))
        {
            Employee e= (Employee) o;

            if ((e.empId == this.empId) && (e.name.equals(this.name)) && (e.ssn.equals(this.ssn)) && (e.salary == this.salary)) {
                result = true;
            }
        }
         return result;
    }

    @Override
    public  int hashCode()
    {
        int hash=7;
        hash=83*hash+this.empId;

        hash=83*hash+ Objects.hashCode(this.name);
        hash=83*hash+Objects.hashCode(this.ssn);

        hash = 83 * hash + (int)(Double.doubleToLongBits(this.salary) ^ (Double.doubleToLongBits(this.salary) >>> 32));
        return hash;
    }
}
