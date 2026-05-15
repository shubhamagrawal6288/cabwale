package com.example.cabwale.Controller;

import com.example.cabwale.Entity.User;
import com.example.cabwale.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("Customer")

public class UserController {
    // add a user
    // delete a user
    //find user by id
    //get all user

    @Autowired
    UserService UserService;


    @PostMapping("/addUser/id")
    public ResponseEntity<String> addUser(@RequestBody User user) {

        String message = UserService.addUser(user);
        return new ResponseEntity<>(message, HttpStatus.CREATED);
    }

}
