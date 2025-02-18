package com.back.TaskFlow.Controller;

import com.back.TaskFlow.Models.User;
import com.back.TaskFlow.Services.ServiceUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class ControllerUser {

    @Autowired
    private ServiceUser serviceUser;

    @PostMapping("/save")
    public User save (@RequestBody User user){
        return serviceUser.saveUser(user);
    }
}
