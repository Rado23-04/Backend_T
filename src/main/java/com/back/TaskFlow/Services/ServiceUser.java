package com.back.TaskFlow.Services;

import com.back.TaskFlow.Models.User;
import com.back.TaskFlow.Repository.RepositoryUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ServiceUser {

    @Autowired
    private RepositoryUser repositoryUser;

    public boolean CheckAuthenticate (String email,String password){
        Optional<User> optionalUser = repositoryUser.findByEmail(email);

        if(optionalUser.isPresent()){
            User user = optionalUser.get();

        }
    }
}
