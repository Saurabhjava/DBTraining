package com.db.bean;

public class Employee { //implements  Comparable<Employee>{
    private int empid;
    private String name;
    private Double salary;

    public Employee(int empid, String name, Double salary) {
        this.empid = empid;
        this.name = name;
        this.salary = salary;
    }

    public int getEmpid() {
        return empid;
    }

    public void setEmpid(int empid) {
        this.empid = empid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return empid+"\t"+name+"\t"+salary;
    }

//    @Override
//    public int compareTo(Employee o) {
//        return this.salary.compareTo(o.salary);
//    }
}
