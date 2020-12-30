package com.project.demo.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Entity @Data @NoArgsConstructor @ToString @Table(name="users")
public class User {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;

}
