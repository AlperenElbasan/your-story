package com.alel.yourstory.api;

import com.alel.yourstory.model.User;
import com.alel.yourstory.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RequestMapping("api/v1/users")
@RestController
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    public int insertUser(@RequestBody User user) {
        return userService.insertUser(user);
    }

    @GetMapping
    public List<User> listUsers() {
        return userService.getAllUsers();
    }

    @GetMapping(path = "{id}")
    public User getUser(@PathVariable("id") UUID id) {
        return userService.getUser(id).orElse(null);
    }
}
