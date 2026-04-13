package com.build.crm.client;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "employee-service")
public interface EmployeeClient {

    @GetMapping("/api/employees/{id}")
    EmployeeResponse getEmployee(@PathVariable("id") Long id);

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    class EmployeeResponse {
        private Long id;
        private String name;
        private String department;
        private String designation;
    }
}
