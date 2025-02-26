package com.back.TaskFlow.Repository.Interface;

import java.time.LocalDate;

public interface TaskProjection {
    String getEmail();
    LocalDate getDate();
    String getPriority();
    String getStatus();
    String getTitle();
}
