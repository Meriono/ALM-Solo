package com.example.springdocker.service;

import com.example.springdocker.model.Food;
import com.example.springdocker.repository.FoodRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Arrays;

import static org.mockito.Mockito.*;

/**
 * Created by Hanna Edlund
 * Date: 2021-05-14
 * Time: 10:26
 * Project: spring-docker-demo
 */
@ExtendWith(MockitoExtension.class)
class FoodServiceTest {

    @Mock
    FoodRepository repositoryMock;

    FoodService foodService;

    @BeforeEach
    public void init(){
        foodService = new FoodService(repositoryMock);
    }

    @Test
    void getFoods() {
        foodService.getFoods();
        verify(repositoryMock).findAll();
    }

    @Test
    void saveNewFood() {
        Food mockFood = new Food("1","svamp", true, true);
        foodService.saveNewFood(mockFood);
        verify(repositoryMock).save(mockFood);
    }

    @Test
    void getCookableFoods() {
        foodService.getCookableFoods();
        verify(repositoryMock).findFoodByCanICookIt(true);
    }
}