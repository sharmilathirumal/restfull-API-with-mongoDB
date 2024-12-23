package com.employee.employeeproject.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "employee")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
    @Id
    private String id;

    @JsonProperty("employee_Id")
    private Integer employee_Id;

    @JsonProperty("employee_Name")
    private String employee_Name;

    @JsonProperty("employee_Email")
    private String employee_Email;

    @JsonProperty("employee_Location")
    private String employee_Location;

}
