package com.pavan.careercompass;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")   // ✅ ADD THIS LINE
@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserRepository repo;

    @PostMapping
    public User addUser(@RequestBody User user) {
        return repo.save(user);
    }

    @GetMapping
    public List<User> getUsers() {
        return repo.findAll();
    }
}