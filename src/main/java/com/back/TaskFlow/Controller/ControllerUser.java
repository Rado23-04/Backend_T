package com.back.TaskFlow.Controller;

import com.back.TaskFlow.Models.User;
import com.back.TaskFlow.Repository.RepositoryUser;
import com.back.TaskFlow.Services.ServiceUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class ControllerUser {

    @Autowired
    private ServiceUser serviceUser;

    @Autowired
    private RepositoryUser repositoryUser;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @PostMapping("/save")
    public ResponseEntity<String> register(@RequestBody User user) {
        if (repositoryUser.findByEmail(user.getEmail()).isPresent()) {
            return ResponseEntity.badRequest().body("This email is already use !");
        }
        serviceUser.saveUser(user);

        return ResponseEntity.ok("Utilisateur créé avec succès !");
    }

    @GetMapping("/ping")
    public String pong(){
        return "pong";
    }
}
