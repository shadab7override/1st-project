package com.shadab.Ecommerce;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.Optional;

@Repository("userRepository")
public interface UserRepository extends JpaRepository<User,Long> {
    @Query(value = "SELECT * FROM users  WHERE email =:email",nativeQuery = true)
    User findByEmail(String email);

    @Transactional
    @Modifying
    @Query(value="update users set is_enabled=true where email =:email",nativeQuery = true)
    public void activateUser(String email);


    
    Optional<User> findByResetToken(String resetToken);

    @Query("SELECT u from User u Where u.username = :username")
    public User getUserByUsername(@Param("username") String username);




}
