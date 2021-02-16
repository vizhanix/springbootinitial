package com.example.second.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.second.entities.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{
    User findByUsername(String username);
}
