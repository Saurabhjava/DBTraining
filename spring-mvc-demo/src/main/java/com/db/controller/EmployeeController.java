package com.db.controller;

import com.db.bean.Employee;
import com.db.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("api")
public class EmployeeController {
    @Autowired
    private EmployeeService eservice;

    @GetMapping("/employees")
    public List<Employee> allEmps(){
        return eservice.getAllEmployees();
    }

    @GetMapping("/employees/{empid}")
    public Employee getEmployeeById(@PathVariable int empid){
        return eservice.getEmpByID(empid);
    }
}
