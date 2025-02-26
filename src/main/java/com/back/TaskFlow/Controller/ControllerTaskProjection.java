package com.back.TaskFlow.Controller;

import com.back.TaskFlow.Repository.Interface.TaskProjection;
import com.back.TaskFlow.Services.ServiceTaskProjection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RequestMapping("/task")
@RestController
public class ControllerTaskProjection {

    @Autowired
    private ServiceTaskProjection serviceTaskProjection;

    @GetMapping("/task_projections")
    public List<TaskProjection> task(){
        return serviceTaskProjection.getTaskProjection();
    }
}
