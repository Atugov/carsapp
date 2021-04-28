package com.myproject.cars.service;

import com.myproject.cars.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public List getAllUsers(){
        return userRepository.getAllUsers();
    }
}
