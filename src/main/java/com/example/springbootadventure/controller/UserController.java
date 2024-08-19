package com.example.springbootadventure.controller;

import com.example.springbootadventure.service.UserService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.springbootadventure.entity.User;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("add")
    public User add(User user) {
        userService.addUser(user);
        return user;
    }

    @GetMapping("list")
    public List<User> list() {
        return userService.list();
    }
}
