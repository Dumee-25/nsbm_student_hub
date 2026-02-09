package com.day13.nsbm_student_hub.repository;

import com.day13.nsbm_student_hub.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    // Required for Spring Security to find a user during login
    Optional<User> findByUsername(String username);
}