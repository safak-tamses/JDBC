package com.jdbc.repository;

import com.jdbc.model.User;

import java.util.List;

public interface UserRepository {

    List<User> findAll();
    User findById(Long id);
    User save(User user);
    User update(User user);
    void deleteById(Long id);

}