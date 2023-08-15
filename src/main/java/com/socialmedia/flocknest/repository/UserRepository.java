package com.socialmedia.flocknest.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.socialmedia.flocknest.model.User;

public interface UserRepository extends MongoRepository<User, String> {
    User findByUsername(String username);

}
