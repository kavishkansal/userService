package com.scaler.userservice.controllers;

import com.scaler.userservice.models.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {
    public User login(){
        return null;
    }
    public User register(){
        return null;
    }

    public ResponseEntity<Void> logout(){
        return null;
    }
}
