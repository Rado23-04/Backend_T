package com.back.TaskFlow.Services;

import com.back.TaskFlow.Models.User;
import com.back.TaskFlow.Repository.RepositoryUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class ServiceUser {
    @Autowired
    private RepositoryUser repositoryUser;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public User saveUser(User user){
        String hashedPassword = passwordEncoder.encode(user.getPassword());
        user.setPassword(hashedPassword);
        return repositoryUser.save(user);
    }
}
