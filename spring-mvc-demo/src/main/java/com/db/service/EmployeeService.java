package com.db.service;

import com.db.bean.Employee;
import com.db.repo.IEmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {

    @Autowired
    private IEmployeeRepository eRepo;

    public List<Employee> getAllEmployees() {
        return eRepo.findAll();
    }

    public Employee getEmpByID(int empid) {
        Optional<Employee> op=eRepo.findById(empid);
        if(op.isPresent())
            return op.get();
        else
            return null;
    }
}
