package com.back.TaskFlow.Controller;

import com.back.TaskFlow.Models.Task;
import com.back.TaskFlow.Services.ServiceTask;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping ("/task")
public class ControllerTask {

    @Autowired
    private ServiceTask serviceTask;

    @GetMapping("/ping")
    private String ping(){
        return "pong";
    }

    @GetMapping("/all_tasks")
    private List<Task> allTask(){
        return serviceTask.getAllTask();
    }
}
