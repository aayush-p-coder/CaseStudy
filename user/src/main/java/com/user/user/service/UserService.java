package com.user.user.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


import com.user.user.model.User;
import com.user.user.repository.UserRepository;
import com.user.user.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class UserService {
	
final Logger logger = LoggerFactory.getLogger(UserService.class);

	
	

    @Autowired
    private UserRepository userRepository;

    public User saveUser(User user) {
        logger.info("Inside saveDepartment of DepartmentService");
        return userRepository.save(user);
    }

    public User findUserById(Long userId) {
        logger.info("Inside saveDepartment of DepartmentService");
        return userRepository.findByUserId(userId);
    }
}
	


