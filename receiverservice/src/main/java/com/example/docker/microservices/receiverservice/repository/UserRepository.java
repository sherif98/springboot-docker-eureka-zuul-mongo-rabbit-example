package com.example.docker.microservices.receiverservice.repository;

import com.example.docker.microservices.receiverservice.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

}
