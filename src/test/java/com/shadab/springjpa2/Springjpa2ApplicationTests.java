package com.shadab.springjpa2;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import java.util.List;

@SpringBootTest
public class Springjpa2ApplicationTests {
	@Autowired
	EmployeeRepo Repo;

	@Test
	public void contextLoads() {

	}

	@Test
	public void Ecreate() {
		Employee e = new Employee();
		e.setId(6);
		e.setFirstname("md");
		e.setLasttname("shadab");
		e.setSalary(100000);
		e.setAge(19);
	}

	@Test
	public void findByNameTest() {
		List<Employee> emp = Repo.findByName(1000);
		emp.forEach(e -> {
			System.out.print(e);
		});
	}

	@Test
	public void updateBySalaryTest() {
		List<Employee> emp = Repo.findBySalary(1000);
		emp.forEach(e -> {
			System.out.println(e);
		});
	}

	@Test
	public String deleteEmployee() {
		Repo.deleteStudentsbyFirstName("A1");
		return "Deleted";
	}

	@Test
	public void findBylastNameTest() {
		List<Employee> emp = Repo.findByLastNameNativeSQL("shadab singh");
		emp.forEach(e -> {
			System.out.print(e);
		});

	}

	@Test
	public void findBylastAgeTest() {
		System.out.println(Repo.deleteStudentsbyAge(20));



	}
}