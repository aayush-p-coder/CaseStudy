package com.casestudy.carwash.car.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.casestudy.carwash.car.model.Car;
import com.casestudy.carwash.car.repository.CarRepository;




@Service
public class CarService {

	final Logger logger = LoggerFactory.getLogger(CarService.class);
	
	@Autowired
	private CarRepository carRepository;
	
	public Car saveCar(Car car) {
        logger.info("Inside saveDepartment of DepartmentService");
        return carRepository.save(car);
    }

    public Car findCarById(Long carId) {
        logger.info("Inside saveDepartment of DepartmentService");
        return carRepository.findByCarId(carId);
    }
}
