package com.example.pawssenger.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.pawssenger.Repositories.UserRepository;
import com.example.pawssenger.entity.DTO.User;

@Service
public class UserService {

    @Autowired
    UserRepository userrepo;

    public int addUser(User user) {
        if (userrepo.existsByUsername(user.getUsername())) {
            return -1;
        } else {
            userrepo.save(user);
            return 1;
        }
    }

    public Optional<User> findUser(String username){
            return userrepo.findById(username);
    }

}
