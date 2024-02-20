package com.example.pawssenger.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.pawssenger.Service.UserService;
import com.example.pawssenger.entity.DTO.User;

@Controller
public class UserRegistration {
    @Autowired
    UserService userservice;

    @PostMapping("/register")
    public ResponseEntity<String> postMethodName(@RequestParam String username) {
        Optional<User> usr = userservice.findUser(username);
        String abc = usr.toString();
        return new ResponseEntity<>(
                "Your username is " + abc,
                HttpStatus.OK);
    }

}
