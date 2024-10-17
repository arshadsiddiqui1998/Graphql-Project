package com.practice.graphql.Api;

import com.practice.graphql.Dto.UserDto;
import com.practice.graphql.entity.User;
import com.practice.graphql.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @MutationMapping
    public User createUser(@Argument String name, @Argument String password, @Argument String email, @Argument String phone) {
        User user = new User();
        user.setName(name);
        user.setPassword(password);
        user.setEmail(email);
        user.setPhoneNumber(phone);
        return userService.createUser(user);

    }

    @QueryMapping
    public User getUserById(@Argument int id) {
        return userService.getUserById(id);
    }

    @QueryMapping
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    //this is delete api
    @MutationMapping
    public String deleteUserById(@Argument int id) {
        return userService.deleteUserById(id);

    }

    @MutationMapping
    public User updateUserById(@Argument int id, @Argument UserDto userDto) {
        return userService.updateUserById(id, userDto);

    }
}
