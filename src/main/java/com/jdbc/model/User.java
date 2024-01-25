package com.jdbc.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

import lombok.Setter;
import org.springframework.data.relational.core.mapping.Table;

@Getter
@Setter
@AllArgsConstructor
@Table("users")
public class User {
    private Long id;
    private String username;
    private String email;
}