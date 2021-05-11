package com.example.springdocker.repository;

import com.example.springdocker.model.Food;
import com.example.springdocker.model.Kompis;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface KompisRepository extends MongoRepository<Kompis, String> {

    List<Kompis> findIfKompisIsNice(boolean isNice);
}
