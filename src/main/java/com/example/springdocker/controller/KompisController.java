package com.example.springdocker.controller;

import com.example.springdocker.model.Food;
import com.example.springdocker.model.Kompis;
import com.example.springdocker.service.FoodService;
import com.example.springdocker.service.KompisService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class KompisController {
    private final KompisService service;

    @GetMapping("/kompis")
    public List<Kompis> getKompisar() {
        return service.getKompisar();
    }

    @PostMapping("/kompis")
    public void saveNewKompis(@RequestBody Kompis kompis) {
        service.saveNewKompis(kompis);
    }

    @GetMapping("/kompis/cookable")
    public List<String> getNiceKompisar() {
        return service.getNiceKompisar();
    }
}
