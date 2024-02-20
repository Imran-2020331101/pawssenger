package com.example.pawssenger.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.pawssenger.entity.DTO.Profile;

public interface ProfileRepository extends JpaRepository<Profile,String>{
    Profile findByUsername(String username);

    boolean existsByUsername(String username);
}