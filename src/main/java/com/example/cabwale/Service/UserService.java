package com.example.cabwale.Service;

import com.example.cabwale.Dto.Request.UserRequest;
import com.example.cabwale.Dto.Response.UserResponse;
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


    public UserResponse addUser(UserRequest userRequest) {
        // dto to entity conversion
        User user = new User();
        user.setName(userRequest.getName());
        user.setEmail(userRequest.getEmail());
        user.setGender(userRequest.getGender());
        user.setPhone(userRequest.getPhone());



        User savedUser = UserRepository.save(user);

        UserResponse userResponse = new UserResponse();
        userResponse.setName(user.getName());
        userResponse.setEmail(user.getEmail());
        userResponse.setPhone(user.getPhone());
        return userResponse;
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
