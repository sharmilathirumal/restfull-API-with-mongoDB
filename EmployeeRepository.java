package com.employee.employeeproject.repository;

import com.employee.employeeproject.dto.Employee;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface EmployeeRepository extends MongoRepository<Employee,String> {
}
