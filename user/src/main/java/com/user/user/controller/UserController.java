package com.user.user.controller;

import java.util.List;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.user.user.model.User;
import com.user.user.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    private final Logger logger =
            LoggerFactory.getLogger(UserController.class);

    @PostMapping("/")
    public User saveUser(@Valid @RequestBody User user) {
        logger.info("Inside saveDepartment of Room Controller");
        return userService.saveUser(user);
    }

    @GetMapping("/{id}")
    public User findUserById(@PathVariable("id") Long userId) {
        logger.info("Inside findDepartmentById method of DepartmentController");
        return userService.findUserById(userId);
    }

}