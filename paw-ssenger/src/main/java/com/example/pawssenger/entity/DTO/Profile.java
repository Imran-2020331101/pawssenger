package com.example.pawssenger.entity.DTO;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class Profile {
    @Id
    private String username;
    private String name;
    private String email;

    @Override
    public String toString() {
        return "username"
    }
}
