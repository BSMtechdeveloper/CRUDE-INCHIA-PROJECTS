package com.example.FACULTY.Entity;
import jakarta.persistence.*;

import lombok.AllArgsConstructor;

import lombok.Getter;

import lombok.NoArgsConstructor;

import lombok.Setter;

@Getter

@Setter

@NoArgsConstructor

@AllArgsConstructor

@Entity

@Table(name = "FACULTY")

public class FACULTY {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;

    @Column(nullable = false)

    private String firstName;

    @Column(nullable = false)

    private String lastName;

    @Column(nullable = false, unique = true)

    private String email;

    public static String getFirstFACULTY() {
        return null;
    }
}
