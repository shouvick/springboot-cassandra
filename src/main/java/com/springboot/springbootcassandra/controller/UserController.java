package com.springboot.springbootcassandra.controller;

import com.springboot.springbootcassandra.entity.User;
import com.springboot.springbootcassandra.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("user")
    public User saveUser(@RequestBody User user) {
        return userService.saveUser(user);
    }

    @GetMapping("users")
    public List<User> getUsers() {
        return userService.getUsers();
    }

    @GetMapping("users/{id}")
    public Optional<User> getUser(@PathVariable int id) {
        return userService.getUser(id);
    }

    @PutMapping("users/{id}")
    public User updateUser(@RequestBody User user, @PathVariable int id) {
        return userService.updateUser(user,id);
    }

    @DeleteMapping("users/{id}")
    public User deleteUser(@PathVariable int id) {
        return userService.deleteUser(id);
    }
}
