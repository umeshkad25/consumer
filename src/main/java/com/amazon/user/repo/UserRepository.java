package com.amazon.user.repo;
import com.amazon.user.model.Manager;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Manager, Long> {

    
}