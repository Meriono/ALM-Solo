package com.example.springdocker.service;

import com.example.springdocker.model.Food;
import com.example.springdocker.model.Friend;
import com.example.springdocker.repository.FoodRepository;
import com.example.springdocker.repository.FriendRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class FriendService {
    private final FriendRepository repository;

    public List<Friend> getFriends() {
        return repository.findAll();
    }

    public void saveNewFriend(Friend friend) {
        repository.save(friend);
    }

    public List<String> getLikeableFriends() {
        // hämtar alla Foods som vi kan laga
        List<Friend> likeableFriends = repository.findFriendByLikeable(true);

        // returnerar endast Food namnen i en lista
        return likeableFriends.stream()
                .map(friend -> friend.getName())
                .collect(Collectors.toList());
    }
}
