package com.pavan.careercompass;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserRepository repo;

    // 🔹 CREATE
    @PostMapping
    public User addUser(@RequestBody User user) {
        return repo.save(user);
    }

    // 🔹 READ
    @GetMapping
    public List<User> getUsers() {
        return repo.findAll();
    }

    // 🔹 DELETE
    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable Long id) {
        repo.deleteById(id);
    }
}