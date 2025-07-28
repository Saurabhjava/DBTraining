package com.db.bean;

import java.util.*;

public class EmployeeMain {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter choice to sort employee by name or salary");
        String ch=sc.next();

        List<Employee> emps=new LinkedList<Employee>();

        emps.add(new Employee(101,"Saurabh",25000.00));
        emps.add(new Employee(102,"Amit",98000.00));
        emps.add(new Employee(103,"Shriya",225000.00));
        emps.add(new Employee(104,"Avnish",250000.00));

        Comparator<Employee> byName=(e,e1)->e.getName().compareTo(e1.getName());
        Comparator<Employee> bySalary=(e,e1)->e.getSalary().compareTo(e1.getSalary());
        if(ch.equals("name"))
            Collections.sort(emps, byName);
        else
            Collections.sort(emps, bySalary);
        for(Employee e:emps) {
           // System.out.println(e.getName()+"\t"+e.getSalary());
            // if(e.getSalary()<100000)
            System.out.println(e);
        }
    }
}
