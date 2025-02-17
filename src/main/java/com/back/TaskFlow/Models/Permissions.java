package com.back.TaskFlow.Models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "permissions")
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Permissions {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;
}
