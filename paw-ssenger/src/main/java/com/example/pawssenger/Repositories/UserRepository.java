package com.example.pawssenger.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.pawssenger.entity.DTO.User;

public interface UserRepository extends JpaRepository<User,String>{
    User findByUsername(String username);  

    boolean existsByUsername(String username);
}