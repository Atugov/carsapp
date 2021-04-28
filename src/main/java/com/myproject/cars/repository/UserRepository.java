package com.myproject.cars.repository;


import com.myproject.cars.model.User;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

@Component
public class UserRepository {
    private List<User> users = Arrays.asList(new User("1", "user1", "user1", "ALEX", "user1@email"),
            new User("2", "user2", "user2", "MAX", "user2@email"),
            new User("3", "user3", "user3", "JASON", "user3@email"),
            new User("4", "user4", "user4", "JACK", "user4@email"));

    public List<User> getAllUsers(){
        return users;
    }
}

