package com.example.springdocker.controller;

import com.example.springdocker.model.Food;
import com.example.springdocker.model.Friend;
import com.example.springdocker.service.FoodService;
import com.example.springdocker.service.FriendService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class FriendController {
    private final FriendService service;

    @GetMapping("/friends")
    public List<Friend> getFoods() {
        return service.getFriends();
    }

    @PostMapping("/friends")
    public void saveNewFood(@RequestBody Friend friend) {
        service.saveNewFriend(friend);
    }

    @GetMapping("/friends/likeable")
    public List<String> getLikeableFriends() {
        return service.getLikeableFriends();
    }
}
