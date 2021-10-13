package com.shadab.springjpa2;


import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;


import java.util.List;

public interface EmployeeRepo extends CrudRepository<Employee,Integer> {

@Query("SELECT e FROM Employee e where  e.salary < (SELECT AVG(e2.salary) FROM Employee e2")
    List<Employee> findByName(Integer salary);

    @Query("SELECT e FROM Employee e WHERE e.salary > ?1 ORDER BY e.age ASEC ?2 ORDER BY e.salary DESC")
    List<Employee> findBySalaryGreaterThanJPQL(Integer salary);

    @Query("SELECT e FROM Employee e where  e.salary < (SELECT AVG(e2.salary) FROM Employee e2)")
    List<Employee> findBySalary(Integer salary);

    @Query("delete from Employee where firstName=:firstName")
    void deleteStudentsbyFirstName(@Param("firstName") String firstName);

    @Query(value = "SELECT * FROM Employee e WHERE e.lastName = :lastName LIKE %singh",
            nativeQuery = true)
    List<Employee> findByLastNameNativeSQL(@Param("firstName") String lastName);

    @Query(value = "delete from Employee where age>:45",
    nativeQuery = true)
    List<Object[]> deleteStudentsbyAge(@Param("age") Integer age);
}
