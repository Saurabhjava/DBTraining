package com.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Department {
    private int deptid;
    private String deptName;
    @Autowired
    private Employee employee;

    public int getDeptid() {
        return deptid;
    }

    public void setDeptid(int deptid) {
        this.deptid = deptid;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
    public void printDept() {
        System.out.println("Dept Id: "+deptid);
        System.out.println("Dept Name: "+deptName);
        System.out.println("Employee of Dept");
        System.out.println("Employee ID: "+employee.getEmpid());
        System.out.println("Name: "+employee.getName());
        System.out.println("Email: "+employee.getEmail());
    }
}
