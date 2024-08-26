package com.jwt.jwt.controller;

import com.jwt.jwt.model.Users;
import com.jwt.jwt.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/home")
public class HomeController {
    @Autowired
    public UserService userService;
    //http:localhost:8081/HOME/USER
    @GetMapping("/users")
   // public String getUser(){ // here i am returning  list of users change string to list<users>
        public List<Users> getUsers(){
        System.out.println("getting users");
        return this.userService.getUsers();

    }
}
