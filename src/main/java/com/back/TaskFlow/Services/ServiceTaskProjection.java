package com.back.TaskFlow.Services;

import com.back.TaskFlow.Repository.Interface.TaskProjection;
import com.back.TaskFlow.Repository.RepositoryTaskProjection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceTaskProjection {

    @Autowired
    private RepositoryTaskProjection repositoryTaskProjection;

    public List<TaskProjection> getTaskProjection(){
        return repositoryTaskProjection.findAllTasksWithUserDetails();
    }
}
