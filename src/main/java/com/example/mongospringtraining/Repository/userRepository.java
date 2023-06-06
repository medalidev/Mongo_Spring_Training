package com.example.mongospringtraining.Repository;

import com.example.mongospringtraining.Entity.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface userRepository extends MongoRepository<User,String> {
}
