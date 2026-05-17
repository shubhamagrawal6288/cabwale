package com.example.cabwale.Service;

import com.example.cabwale.Entity.User;
import com.example.cabwale.Exception.UserNotFoundException;
import com.example.cabwale.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service


public class UserService {


    @Autowired
    UserRepository UserRepository;


    public User addUser(User user) {
        User savedUser = UserRepository.save(user);
        return savedUser;
    }

    public List<User> getAllUser() {
        List<User> users = UserRepository.findAll();
        return users;
    }

    public User findUserById(int id) {

        Optional<User> user = UserRepository.findById(id);

        if(user.isEmpty()) {
            throw new UserNotFoundException("user not found");
        }

        return user.get();
    }
}
