package com.back.TaskFlow.Controller;

import com.back.TaskFlow.JWT.JwtUtils;
import com.back.TaskFlow.Models.User;
import com.back.TaskFlow.Services.ServiceRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;
@RequestMapping("/auth")
@RestController
public class ControllerRequestAuth {

    @Autowired
    private ServiceRequest serviceRequest;

    @Autowired
    private JwtUtils jwtUtils;

    @PostMapping("/login")
    public ResponseEntity<?> AuthenticateUser(@RequestBody User user){
        boolean isAuthenticate = serviceRequest.chechAuthenticate(user.getEmail(),user.getPassword());

        if(isAuthenticate){
            String token = jwtUtils.generateToken(user.getEmail());
            return ResponseEntity.ok().body(Map.of("succes",true,"token",token));
        }
        return ResponseEntity.ok().body(Map.of("failed",true,"message","Authentication failed"));
    }
}
