package com.back.TaskFlow.Repository;

import com.back.TaskFlow.Models.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RepositoryTask extends JpaRepository<Task,Long> {
    Optional<Task> findByName (String title);
}
