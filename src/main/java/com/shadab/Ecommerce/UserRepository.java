package com.shadab.Ecommerce;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserRepository extends JpaRepository<User,Long> {
    @Query(value = "SELECT * FROM user  WHERE email =:email",nativeQuery = true)
    User findByEmail(String email);


}
