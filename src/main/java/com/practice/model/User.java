package com.practice.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity // This annotation is used to mark the class as an entity class
@Table(name="users") // This annotation is used to specify the table name
@Data // This annotation is used to generate getters and setters
@NoArgsConstructor // This annotation is used to generate a no-args constructor
@AllArgsConstructor // This annotation is used to generate an all-args constructor
@Builder // This annotation is used to generate a builder pattern
// Using the builder to create a User object
//User user = User.builder()
//        .firstName("John")
//        .lastName("Doe")
//       .age(30)
//       .build();

public class User {
    @Id // This annotation is used to specify the primary key of the entity
    @GeneratedValue(strategy = GenerationType.IDENTITY) // This annotation is used to specify the generation strategy for the primary key
    @Column(name = "user_id" ) // This annotation is used to specify the column name
    private Long userId;

    @Column(nullable = false, unique = true, length = 5)
    private String username;


}
