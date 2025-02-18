package com.back.TaskFlow.Services;

import com.back.TaskFlow.Models.User;
import com.back.TaskFlow.Repository.RepositoryUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ServiceRequest {

    @Autowired
    private RepositoryUser repositoryUser;

    @Autowired
    private PasswordEncoder passwordEncoder;

   public boolean chechAuthenticate (String email,String password){
       Optional<User> optionalUser = repositoryUser.findByEmail(email);

       if(optionalUser.isPresent()){
            User user = optionalUser.get();
                if(passwordEncoder.matches(password,user.getPassword())){
                    return true;
                }
       }
       return false;
   }
}
