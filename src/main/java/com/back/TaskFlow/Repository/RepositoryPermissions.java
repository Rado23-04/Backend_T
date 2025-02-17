package com.back.TaskFlow.Repository;

import com.back.TaskFlow.Models.Permissions;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositoryPermissions extends JpaRepository<Permissions,Long> {
}
