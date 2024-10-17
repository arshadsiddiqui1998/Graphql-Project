package com.practice.graphql.service;

import com.practice.graphql.Dto.UserDto;
import com.practice.graphql.entity.User;
import com.practice.graphql.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public User createUser(User user) {
        return userRepository.save(user);
    }

    public User getUserById(int id) {
        return userRepository.findById(id).orElseThrow(() -> new RuntimeException("User with id " + id + " not found"));

    }

    public List<User> getAllUsers() {
        return userRepository.findAll();

    }

    public String deleteUserById(int id) {
        User user = userRepository.findById(id).orElseThrow(() -> new RuntimeException("User with id " + id + " not found"));
        userRepository.delete(user);
        return "User with id " + id + " deleted";
    }

    public User updateUserById(int id, UserDto userDto) {
        User user1 = userRepository.findById(id).orElseThrow(() -> new RuntimeException("User with id " + id + " not found"));
        user1.setName(userDto.getName());
        user1.setEmail(userDto.getEmail());
        user1.setPhoneNumber(userDto.getPhoneNumber());
        return userRepository.save(user1);

    }
}
