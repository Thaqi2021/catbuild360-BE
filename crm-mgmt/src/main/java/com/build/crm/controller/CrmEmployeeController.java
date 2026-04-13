package com.build.crm.controller;

import com.build.crm.client.EmployeeClient;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/crm/employees")
@RequiredArgsConstructor
public class CrmEmployeeController {

    private final EmployeeClient employeeClient;

    @GetMapping("/{id}")
    public EmployeeClient.EmployeeResponse getEmployeeFromCrm(@PathVariable Long id) {
        // Calling employee-service via Feign
        return employeeClient.getEmployee(id);
    }
}
