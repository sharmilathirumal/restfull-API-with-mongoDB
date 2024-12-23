package com.employee.employeeproject.service;

import com.employee.employeeproject.dto.Employee;
import com.employee.employeeproject.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    public void saveEmployee(Employee employee){
        employeeRepository.save(employee);
    }

    public void saveAllEmployee(List<Employee> employees){
        employeeRepository.saveAll(employees);
    }

    public List<Employee> getEmployees(){

        return employeeRepository.findAll();
    }

    public Employee getEmployeeById(String id){
        return employeeRepository.findById(id).orElse(null);
    }

    public void deleteEmployee(String id){
        employeeRepository.deleteById(id);
    }
}
