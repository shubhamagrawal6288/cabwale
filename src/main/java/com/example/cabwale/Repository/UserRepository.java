package com.example.cabwale.Repository;

import com.example.cabwale.Entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Repository;

@Repository


public class UserRepository {

    public String addUser(User user) {
        return "user added";
    }
}
