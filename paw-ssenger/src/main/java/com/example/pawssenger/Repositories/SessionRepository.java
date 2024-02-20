package com.example.pawssenger.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.pawssenger.entity.DTO.Session;

public interface SessionRepository extends JpaRepository<Session,String>{
    Session findBysession(String session);  

    boolean existsBysession(String session);
}