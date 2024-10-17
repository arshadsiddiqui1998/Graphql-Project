package com.practice.graphql.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "USER")
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Data
public class User {

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true, mappedBy = "user")
    List<Orders> orders = new ArrayList<>();

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int userId;
    private String name;
    private String email;
    private String phoneNumber;
    private String password;

}
