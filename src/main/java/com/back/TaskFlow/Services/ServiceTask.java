package com.back.TaskFlow.Services;

import com.back.TaskFlow.Models.Task;
import com.back.TaskFlow.Repository.RepositoryTask;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ServiceTask {

    @Autowired
    private RepositoryTask repositoryTask;

    public List<Task> getAllTask(){
         return repositoryTask.findAll();
    }

    public Optional<Task> getTask(String title){
        return repositoryTask.findByTitle(title);
    }

    public String DeleteTask (Long id){
         if(!repositoryTask.existsById(id)){
             return "Id doesn't exist"+id;
         }
         repositoryTask.deleteById(id);
         return "Task delete";
    }
}
