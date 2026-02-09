package com.day13.nsbm_student_hub.repository;

import com.day13.nsbm_student_hub.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Long> {
    // Required for the DataInitializer to setup default roles
    Optional<Role> findByName(String name);
}