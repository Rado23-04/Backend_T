package com.back.TaskFlow.Repository;

import com.back.TaskFlow.Models.Task;
import com.back.TaskFlow.Repository.Interface.TaskProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface RepositoryTaskProjection extends JpaRepository<Task,Long> {
    @Query(value = """
       select email, date, priority ,status,title from task inner join "users" on user_id= "users".id
    """, nativeQuery = true)
    List<TaskProjection> findAllTasksWithUserDetails();
}
