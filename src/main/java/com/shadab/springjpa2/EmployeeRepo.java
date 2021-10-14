package com.shadab.springjpa2;


import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;


import java.util.List;

public interface EmployeeRepo extends CrudRepository<Employee,Integer> {


    @Query("from Employee")
    List<Employee> findAllEmployee();

    @Query("FROM Employee  WHERE salary> (SELECT AVG(salary) FROM Employee ) ORDER BY age Desc,salary")
    List<Employee> findBySalaryGreaterThanJPQL();

  /*  @Modifying
    @Query("update Employee set salary=:salary where salary <(select avg(salary) from Employee")
    List<Employee> updateSalary(@Param("salary") Integer salary);*/

    @Query("delete from Employee where salary =(SELECT MIN(salary) FROM employees")
    List<Employee> deleteMinSalary();


    @Query(value = "delete from Employee where age>:45",
            nativeQuery = true)
    List<Employee> deleteStudentsbyAge(@Param("age") Integer age);

    @Query(value = "SELECT * FROM Employee e WHERE e.lastName = :lastName LIKE %singh",
            nativeQuery = true)
    List<Employee> findByLastNameNativeSQL(@Param("firstName") String lastName);

}
