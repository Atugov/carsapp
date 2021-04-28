package com.myproject.cars.controller;

import com.myproject.cars.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.myproject.cars.service.UserService;

import java.util.List;

@Controller
@RequestMapping("/")
public class UserController {
    @Autowired
    private UserService userService;

    public @ResponseBody
    List<User> getAllUsers(){
        return userService.getAllUsers();
    }
}
