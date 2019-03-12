package com.sye.k8s.microservices.department;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

import com.sye.k8s.microservices.department.domain.Department;
import com.sye.k8s.microservices.department.repository.DepartmentRepository;

@SpringBootApplication
@EnableFeignClients
public class DepartmentK8sServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(DepartmentK8sServiceApplication.class, args);
	}
	
	@Bean
	DepartmentRepository repository() {
		DepartmentRepository repository = new DepartmentRepository();
		repository.add(new Department(1L, "Development"));
		repository.add(new Department(1L, "Operations"));
		repository.add(new Department(2L, "Development"));
		repository.add(new Department(2L, "Operations"));		
		return repository;
	}

	

}

