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

		e.setFirstname("md");
		e.setLasttname("shadab");
		e.setSalary(100000);
		e.setAge(19);


		Employee e1 = new Employee();

		e1.setFirstname("Sam");
		e1.setLasttname("Aryan");
		e1.setSalary(10000);
		e1.setAge(10);

		Repo.save(e);
		Repo.save(e1);
	}
	@Test
	public void findBySalAvgTest(){
		System.out.println(Repo.findBySalaryGreaterThanJPQL());
	}
	@Test
	public void findingAllEmployeeTest(){
		System.out.println(Repo.findAllEmployee());
	}
/*	@Test
	public void updateSalaryTest(){
		System.out.println(Repo.updateSalary(1000));
	}*/

	@Test
	public void findBylastAgeTest() {
		System.out.println(Repo.deleteStudentsbyAge(20));



	}
	@Test
	public void deleteMinSalaryTest(){
		System.out.println(Repo.deleteMinSalary());
	}

	@Test
	public void findBylastNameTest() {
		List<Employee> emp = Repo.findByLastNameNativeSQL("shadab singh");
		emp.forEach(e -> {
			System.out.print(e);
		});

	}


}