package com.mongo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mongo.document.Drink;
import com.mongo.repository.DrinkRepository;

@RestController
@RequestMapping("/drink")
public class DrinkController {
	
	@Autowired
	private DrinkRepository drinkRepo;
	
	@GetMapping("/all")
	public List<Drink> getAllDrink() {
		return drinkRepo.findAll();
	}
	
	@PostMapping("/create")
	public Drink addDrink(@RequestBody Drink drink) {
		return drinkRepo.save(drink);
	}
	
	@PostMapping("/create-many")
	public List<Drink> addDrinks(@RequestBody List<Drink> drink){
		return drinkRepo.saveAll(drink);
	}
	
	@PutMapping("/update/{id}")
	public Drink updateDrink(@PathVariable int id, @RequestBody Drink drink) {
		drink.setId(id);
		return drinkRepo.save(drink);
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteDrink(@PathVariable int id) {
		drinkRepo.deleteById(id);
		return "Drink is deleted with id : "+id;
	}
	
	@GetMapping("/name/{drinkName}")
	public List<Drink> findByName(@PathVariable String drinkName){
		return drinkRepo.findByName(drinkName);
	}
	
	@GetMapping("/{id}")
	public Optional<Drink> findById(@PathVariable int id){
		return drinkRepo.findById(id);
	}
	
	@GetMapping("/price/{drinkPrice}")
	public List<Drink> findByPrice(@PathVariable int drinkPrice){
		return drinkRepo.findByPrice(drinkPrice);
	}
	
	
	

}
