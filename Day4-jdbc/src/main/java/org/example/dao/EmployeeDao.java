package org.example.dao;

import org.example.bean.Employee;

import java.sql.*;

public class EmployeeDao {
    Connection con;
    public EmployeeDao() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con= DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","Passw0rd!");
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void printAllEmployee() {
        try {
            Statement stat=con.createStatement();
            ResultSet rs=stat.executeQuery("select * from Employee");
            while(rs.next()) {
                System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getInt(3)+"\t"+rs.getString(4));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    public void createEmployee(Employee emp) {
        try {
           PreparedStatement ps=con.prepareStatement("insert into employee values(?,?,?,?)");
           ps.setInt(1,emp.getEmpid());
           ps.setString(2,emp.getName());
           ps.setInt(3,emp.getSalary());
           ps.setString(4,emp.getEmail());
           int rows= ps.executeUpdate();//DML operation
            if(rows>0)
                System.out.println("Employee Created....");

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
