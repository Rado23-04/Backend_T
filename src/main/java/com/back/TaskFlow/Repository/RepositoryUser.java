package com.back.TaskFlow.Repository;

import com.back.TaskFlow.Models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryUser extends JpaRepository<User,Long> {
}
