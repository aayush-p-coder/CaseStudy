package com.casestudy.carwash.car.model;

import javax.validation.constraints.Size;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@AllArgsConstructor
@Builder
@Getter
@Setter
@Document(collection ="car")
public class Car {
	
	@Id
	private Long carId;
	@Size(max = 20)
	
	private String carRegistrationNumber;
	@Size(max = 20)
	
	@Size(max = 40)
	private String carModelName;	

}
