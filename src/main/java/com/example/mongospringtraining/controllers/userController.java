package com.example.mongospringtraining.controllers;

import com.example.mongospringtraining.Entity.User;
import com.example.mongospringtraining.response.MessageResponse;
import com.example.mongospringtraining.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/api/v1")
public class userController {

    @Autowired
    private UserService service;

    @GetMapping("/welcome")
    public String helloWorld(){
        return "<h1>Welcome to challenge 1</h1>";
    }

    @PostMapping("/new")
    public User addUser(@RequestBody User user){
        return service.addNewUser(user);
    }

    @GetMapping("/all")
    public List<User> getAllUsers(){
        return service.getAllUsers();
    }

    @GetMapping("/{id}")
    public User getUserById(@PathVariable String id){
        return service.getUserById(id);
    }

    @PutMapping("/{id}")
    public User updateUser(@RequestBody User user, @PathVariable String id){
        return service.updateUserById(user,id);
    }

    @DeleteMapping("/{id}")
    public MessageResponse deleteUser(@PathVariable String id){
        return service.deleteUserById(id);
    }
}
