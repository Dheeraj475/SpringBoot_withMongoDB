package com.mongo.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.mongo.document.Drink;

public interface DrinkRepository extends MongoRepository<Drink, Integer>{
	List<Drink> findByName(String name);
	
	List<Drink> findByPrice(int id);
}
