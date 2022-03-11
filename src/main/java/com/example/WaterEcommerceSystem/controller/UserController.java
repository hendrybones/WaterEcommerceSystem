package com.example.WaterEcommerceSystem.controller;

import com.example.WaterEcommerceSystem.module.User;
import com.example.WaterEcommerceSystem.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @PostConstruct
    public void initRoleAndUsers(){
        userService.initRoleAndUser();
    }

    @PostMapping({"/registerNewUser"})
    public User registerNewUser(@RequestBody User user){
        return userService.registerNewUser(user);

    }
    @GetMapping({"/forAdmin"})
    public String forAdmin(){
        return "This URL is only accessible to admin";
    }
    @GetMapping({"forUser"})
    public String forUser(){
        return "This URL is only accessible to the user";
    }

}
