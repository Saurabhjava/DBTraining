package com;

public class Employee {
    private int empid;
    private String name;
    private int age;

    public Employee(int empid, String name, int age) {
        this.empid = empid;
        this.name = name;
        this.age = age;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0 || age > 100)
            System.out.println("Invalid Age");
        else
            this.age = age;
    }
}
