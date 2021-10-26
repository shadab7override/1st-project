package com.shadab.Ecommerce;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.jdbc.DataJdbcTest;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.annotation.Rollback;

import static org.assertj.core.api.Assertions.assertThat;

@DataJdbcTest
@AutoConfigureTestDatabase(replace= AutoConfigureTestDatabase.Replace.NONE)
@Rollback(value = false)
public class UserRepositoryTest {
    @Autowired
    private  UserRepository userRepository;
    @Autowired
    private TestEntityManager entityManager;


    @Test
    public  void UserRepositoryTest() {
    }
/*
 @Test
    public void testCreateUser(){
        User user= new User();
        user.setFirstName("Md");
        user.setMiddleName("shadab");
        user.setLastName("shiekh");
        user.setEmail("shadab@gmail.com");
        user.setPassword("abcd");
        User savedUser=userRepository.save(user);

       User existUser= entityManager.find(User.class,savedUser.getUid());
        assertThat(existUser.getEmail()).isEqualTo(user.getEmail());

    }*/


    @Test
    public void testFindByEmail(){
        String email="shadab@gmail.com";
        User user= userRepository.findByEmail(email);
        assertThat(user).isNotNull();

    }
}
