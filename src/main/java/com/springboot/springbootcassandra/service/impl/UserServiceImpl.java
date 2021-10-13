package com.springboot.springbootcassandra.service.impl;

import com.springboot.springbootcassandra.entity.User;
import com.springboot.springbootcassandra.repository.UserRepository;
import com.springboot.springbootcassandra.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User saveUser(User user) {
        User userData = new User();
        userData.setName(user.getName());
        userData.setAge(user.getAge());
        userData.setAddress(user.getAddress());
        User userResponse = userRepository.save(user);
        return userResponse;
    }

    @Override
    public List<User> getUsers() {
        return userRepository.findAll();
    }

    @Override
    public Optional<User> getUser(int id) {
        return userRepository.findById(id);
    }

    @Override
    public User updateUser(User user, int id) {
        Optional<User> userOptional = userRepository.findById(id);
        userOptional.get().setName(user.getName());
        userOptional.get().setAddress(user.getAddress());
        userOptional.get().setAge(user.getAge());
        return userRepository.save(userOptional.get());
    }

    @Override
    public User deleteUser(int id) {
        Optional<User> user = userRepository.findById(id);
        userRepository.delete(user.get());
        return user.get();
    }
}
