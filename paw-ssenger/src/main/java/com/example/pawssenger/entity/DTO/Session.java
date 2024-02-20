package com.example.pawssenger.entity.DTO;

import jakarta.persistence.Column;
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
@Table(name = "Sessions")
public class Session {
    @Id
    private String session;
    //@Column(name="DESC", nullable=false, length=512)
    @Column(name = "")
    private String username;
}
