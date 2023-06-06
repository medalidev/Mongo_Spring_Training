package com.example.mongospringtraining.service;

import com.example.mongospringtraining.Entity.User;
import com.example.mongospringtraining.Repository.userRepository;
import com.example.mongospringtraining.response.MessageResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserService {

    @Autowired
    private userRepository repository;

    public List<User> getAllUsers(){
        return repository.findAll();
    }

    public User  getUserById(String id){
        return repository.findById(id).orElse(null);
    }

    public User addNewUser(User user){
        return repository.save(user);
    }

    public User updateUserById(User user,String id){
        user.setId(id);
        return repository.save(user);
    }

    public MessageResponse deleteUserById(String id){
        repository.deleteById(id);
        return new MessageResponse("User deleted successfully!");
    }
}
