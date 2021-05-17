package com.example.springdocker.repository;

import com.example.springdocker.model.Food;
import com.example.springdocker.model.Friend;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FriendRepository extends MongoRepository<Friend, String> {

    List<Friend> findFriendByLikeable(boolean likeable);
}
