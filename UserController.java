package com.portfolio.controller;

import com.portfolio.model.User;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {
    private List<User> users = new ArrayList<>();
    private Long nextId = 1L;

    @GetMapping
    public List<User> getAllUsers() {
        return users;
    }

    @GetMapping("/{id}")
    public User getUserById(@PathVariable Long id) {
        return users.stream()
                .filter(user -> user.getId().equals(id))
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Usuário não encontrado"));
    }

    @PostMapping
    public User createUser(@RequestBody User user) {
        user.setId(nextId++);
        users.add(user);
        return user;
    }

    @DeleteMapping("/{id}")
    public String deleteUser(@PathVariable Long id) {
        users.removeIf(user -> user.getId().equals(id));
        return "Usuário removido com sucesso";
    }
}