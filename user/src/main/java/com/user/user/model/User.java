package com.user.user.model;

import javax.validation.constraints.Size;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;



@AllArgsConstructor
@Builder
@Getter
@Setter
@Document(collection = "user")
public class User {
    @Id
    
    
    private Long userId;
    @Size(max = 20)
    private String username;

    @Size(max = 20)   
    private String email;

    @Size(max = 20)
    private String name;

   

    @Size(max = 120)
    private String password;

    @Size(max = 120)
    private String mobilePhone;

    @Size(max = 120)
    private String address;

  
   // @Size(max = 120)
   // private String identificationNumber;
  
}