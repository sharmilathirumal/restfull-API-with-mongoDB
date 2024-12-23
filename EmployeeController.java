package com.employee.employeeproject.controller;

import com.employee.employeeproject.dto.Employee;
import com.employee.employeeproject.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/addEmployee")
    public String saveEmployee(@RequestBody Employee employee){
         employeeService.saveEmployee(employee);
        return "employee detail added successfully";
    }

    @PostMapping("/addAllEmployee")
    public String saveAllEmployees(@RequestBody List<Employee> employees){
        employeeService.saveAllEmployee(employees);
        return "employees details added successfully";
    }

    @GetMapping("/displayAll")
    public List<Employee> getAllEmployee(){

        return employeeService.getEmployees();
    }

    @GetMapping("/display/{id}")
    public Employee getEmployeeById(@PathVariable String id){
        return employeeService.getEmployeeById(id);
    }

    @DeleteMapping("/deleteEmployeeBy/{id}")
    public String deleteByEmployeeId(@PathVariable String id){
        employeeService.deleteEmployee(id);
        return "employee deleted successfully";
    }
}
