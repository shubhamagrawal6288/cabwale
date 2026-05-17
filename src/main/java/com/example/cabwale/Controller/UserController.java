package com.example.cabwale.Controller;

import com.example.cabwale.Entity.User;
import com.example.cabwale.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/user")

public class UserController {
    // add a user
    // delete a user
    //find user by id
    //get all user

    @Autowired
    UserService UserService;
    @PostMapping("/addUser")
    public ResponseEntity<User> addUser(@RequestBody User user) {

        User savedUser = UserService.addUser(user);
        return new ResponseEntity<>(savedUser, HttpStatus.CREATED);
    }

    // get all user
    @GetMapping("/getalluser")
    public ResponseEntity<List<User>> getAllUser() {
        List<User> users = UserService.getAllUser();
        return new ResponseEntity<>(users, HttpStatus.FOUND);
    }

    @GetMapping("/finduserbyid/{id}")
    public ResponseEntity<User> findUserById(@PathVariable int id) {
        User user = UserService.findUserById(id);
        return new ResponseEntity<>(user, HttpStatus.FOUND);
    }

}
