package com.casestudy.carwash.car.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.casestudy.carwash.car.model.Car;

@Repository
public interface CarRepository extends MongoRepository<Car, Long> {

	Car findByCarId(Long carId);

}
