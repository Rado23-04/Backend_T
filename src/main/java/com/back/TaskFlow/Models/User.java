package com.back.TaskFlow.Models;


import com.back.TaskFlow.enumm.Role;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.util.Set;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String username;
    private String email;
    private String password;

    @Enumerated(EnumType.STRING)
    private Role role;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable (
            name = "user_permissions",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "permission_id")
    )
    private Set<Permissions> permissionsSet;
}
