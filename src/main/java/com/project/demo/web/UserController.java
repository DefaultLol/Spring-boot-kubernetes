package com.project.demo.web;

import com.project.demo.entity.User;
import com.project.demo.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    IUserService userService;

    @GetMapping("/")
    public List<User> getUsers(){
        return userService.getUsers();
    }

    @GetMapping("/get")
    public String testing(){
        return "Hello World";
    }

    @PostMapping("/add")
    public String addUser(@RequestBody User user){
        userService.saveUser(user);
        return "User addedd";
    }
}
