package com.db.repo;

import com.db.bean.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IEmployeeRepository extends JpaRepository<Employee,Integer> {
}
