package com.example.pawssenger.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.pawssenger.Repositories.ProfileRepository;
import com.example.pawssenger.Service.SessionService;
import com.example.pawssenger.entity.DTO.Profile;

@Controller
public class ProfileReq {

    @Autowired
    SessionService sservice;
    @Autowired
    ProfileRepository profileRepo;

    

    @PostMapping("/profile")
    public ResponseEntity<String> postMethodName(@RequestParam String session) {
        
        String username=sservice.findUserBySession(session);

        if(username.equals("Session Expired")){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Session Expired");
        }

        Profile pr=profileRepo.findByUsername(username);

        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Session Expired");
        //To do: profile returning work
    }

}
