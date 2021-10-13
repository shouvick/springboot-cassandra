package com.springboot.springbootcassandra.service;

import com.springboot.springbootcassandra.entity.User;

import java.util.List;
import java.util.Optional;


public interface UserService {
    User saveUser(User user);

    List<User> getUsers();

    Optional<User> getUser(int id);

    User updateUser(User user, int id);

    User deleteUser(int id);
}
