package com.casestudy.carwash.car.controller;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.casestudy.carwash.car.model.Car;
import com.casestudy.carwash.car.service.CarService;



@RestController
@RequestMapping("/cars")
public class CarController {

	@Autowired
	private CarService carService;
	
	private final Logger logger =
            LoggerFactory.getLogger(CarController.class);

    @PostMapping("/")
    public Car saveCar(@Valid @RequestBody Car car) {
        logger.info("Inside saveDepartment of Room Controller");
        return carService.saveCar(car);
    }

    @GetMapping("/{id}")
    public Car findCarById(@PathVariable("id") Long carId) {
        logger.info("Inside findDepartmentById method of DepartmentController");
        return carService.findCarById(carId);
}
}