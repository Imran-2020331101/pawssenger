package com.example.pawssenger.entity.DTO;

import org.springframework.lang.NonNull;

import jakarta.persistence.Entity;

import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Users")
public class User {
    @Id
    @NonNull
    private String username;
    @NonNull
    private String passkey;

    @Override
    public String toString() {
        String ans = username;
        return ans;
    }
}
