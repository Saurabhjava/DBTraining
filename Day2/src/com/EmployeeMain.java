package com;

public class EmployeeMain {
    public static void main(String[] args) {
        Employee emp = new Employee(101,"Ayush",22);
        /*emp.setEmpid(1001);
        emp.setName("Saurabh");
        emp.setAge(37);*/
        System.out.println("Employee id="+emp.getEmpid());
        System.out.println("Employee name="+emp.getName());
        System.out.println("Employee Age="+emp.getAge());
        emp.setName("Aarin");
        System.out.println("Employee name="+emp.getName());
    }
}
