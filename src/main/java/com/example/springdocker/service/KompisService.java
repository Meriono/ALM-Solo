package com.example.springdocker.service;

import com.example.springdocker.model.Food;
import com.example.springdocker.model.Kompis;
import com.example.springdocker.repository.FoodRepository;
import com.example.springdocker.repository.KompisRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class KompisService {
    private final KompisRepository repository;

    public List<Kompis> getKompisar() {
        return repository.findAll();
    }

    public void saveNewKompis(Kompis kompis) {
        repository.save(kompis);
    }

    public List<String> getNiceKompisar() {
        // hämtar alla Foods som vi kan laga
        List<Kompis> niceKompis = repository.findIfKompisIsNice(true);

        // returnerar endast Food namnen i en lista
        return niceKompis.stream()
                .map(kompis -> kompis.getName())
                .collect(Collectors.toList());
    }
}
