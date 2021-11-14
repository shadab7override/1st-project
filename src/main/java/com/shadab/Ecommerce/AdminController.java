package com.shadab.Ecommerce;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Controller
public class AdminController {
    @Autowired
    private UserRepository userRepository;



    @Autowired
    private StudentRepository studentRepository;


    @GetMapping("/customer")
    public List<User> getCustomer() {
        return  userRepository.findAll();
    }

    @DeleteMapping("/customer/{id}")
    public void deleteCustomer(@PathVariable long id) {
        userRepository.deleteById(id);
    }


}
