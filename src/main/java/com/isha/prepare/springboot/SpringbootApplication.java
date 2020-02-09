package com.isha.prepare.springboot;

import com.isha.prepare.springboot.model.Department;
import com.isha.prepare.springboot.model.Employee;
import com.isha.prepare.springboot.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;
import java.util.Collections;

@SpringBootApplication
public class SpringbootApplication implements CommandLineRunner {

	@Autowired
	private DepartmentRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(SpringbootApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Department department = new Department();
		department.setDescription("D1Desc");
		department.setId("D1Id");
		department.setName("D1Name");
		Employee employee = new Employee();
		employee.setAge(34);
		employee.setEmpId("1234");
		employee.setName("Isha Saini");
		employee.setSalary(400000.0d);
		department.setEmployees(Collections.singletonList(employee));
		repository.save(department);

		System.out.println("Departments found with findAll():");
		System.out.println("-------------------------------");
		for (Department dept : repository.findAll()) {
			System.out.println(dept.getName());
		}
		System.out.println();
	}
}
