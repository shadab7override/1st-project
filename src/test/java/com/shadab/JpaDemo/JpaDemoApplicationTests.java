package com.shadab.JpaDemo;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;


@RunWith(SpringRunner.class)
@SpringBootTest
public class JpaDemoApplicationTests {
	@Autowired
	EmployRepo er;
	@Test
	public void contextLoads(){

	}

	@Test
	public void testCreateEmploy() {
		Employ employ = new Employ();
		//employ.setId(7);
		employ.setName("Arjun");
		employ.setAge(30);
		employ.setLocation("Delhi");
		er.save(employ);
	}
	@Test
	public void testRead(){

		Employ emp=er.findById(1l).get();
	}
	@Test
	public void testUpdate(){
		Employ emp=new Employ();
		er.findById(1l).get();
		emp.setName("srk");

	}
	@Test
	public void testdelete(){
		er.deleteById(1l);
	}

	@Test
	public void testCount(){
		System.out.println(er.count());
	}

	@Test
	public void testFindByName(){
		List<Employ> emp=er.FindByName("srk");
		emp.forEach(p -> System.out.print(p.getName()));

	}
	@Test
	public void FindByFDescLike(){
		List<Employ> emp=er.FindByName("%A%");
		emp.forEach(p -> System.out.print(p.getName()));

	}
	@Test
	public void FindByFDescAge(){
		List<Employ> emp=er.FindByName(28,32);
		emp.forEach(p -> System.out.print(p.getName()));

	}

	@Test
	public void testFindAllpagingAndSorting(){
		//Pageable pageable =new PageRequest(0,1, Sort.Direction.DESC,"name");
		//er.findAll(pageable).forEach(p -> System.out.println(p.getName()));

	}
}
