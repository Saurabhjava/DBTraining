package org.example;


import org.example.bean.Employee;
import org.example.dao.EmployeeDao;

import java.sql.*;


public class Main {
    public static void main(String[] args) {
        EmployeeDao edao=new EmployeeDao();
        edao.createEmployee(new Employee(1011,"Arjun",250000,"arjun@gmail.com"));
        edao.printAllEmployee();
    }
}