package com.back.TaskFlow.Services;

import com.back.TaskFlow.Models.User;
import com.back.TaskFlow.Repository.RepositoryUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceUser {
    @Autowired
    private RepositoryUser repositoryUser;

    public User saveUser(User user){
        return repositoryUser.save(user);
    }
}
