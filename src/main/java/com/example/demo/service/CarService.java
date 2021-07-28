package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.domain.Car;

public interface CarService {

	List<Car> findAll();
	
	Optional<Car> findOne(Long id);
}
