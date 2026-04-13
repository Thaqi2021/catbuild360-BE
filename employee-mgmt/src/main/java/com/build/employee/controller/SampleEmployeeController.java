package com.build.employee.controller;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/employees")
public class SampleEmployeeController {

    @GetMapping("/{id}")
    public EmployeeResponse getEmployeeById(@PathVariable Long id) {
        // Dummy data for demonstration
        return new EmployeeResponse(id, "John Doe", "Engineering", "Software Engineer");
    }

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    public static class EmployeeResponse {
        private Long id;
        private String name;
        private String department;
        private String designation;
    }
}
