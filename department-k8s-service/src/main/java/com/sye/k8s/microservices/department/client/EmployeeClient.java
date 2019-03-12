package com.sye.k8s.microservices.department.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.sye.k8s.microservices.department.domain.Employee;

//@FeignClient(name = "employee-service")
@FeignClient(name = "employee-svc",url="http://employee-svc:8080")
public interface EmployeeClient {

	@GetMapping("/department/{departmentId}")
	List<Employee> findByDepartment(@PathVariable("departmentId") Long departmentId);
	
}