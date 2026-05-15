package com.example.cabwale.Service;

import com.example.cabwale.Entity.User;
import com.example.cabwale.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service


public class UserService {


    @Autowired
    UserRepository UserRepository;


    public String addUser(User user) {
        return UserRepository.addUser(user);
    }
}
