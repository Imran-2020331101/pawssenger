package com.example.pawssenger.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.pawssenger.Repositories.SessionRepository;
import com.example.pawssenger.entity.DTO.Session;


@Service
public class SessionService {
    
    @Autowired
    SessionRepository sessionrepo;

    public String findUserBySession(String session){
        if(sessionrepo.existsBysession(session)){
            Session ss= sessionrepo.findBysession(session);
            return ss.getUsername();
        }
        return "Session Expired";        
    }

}
