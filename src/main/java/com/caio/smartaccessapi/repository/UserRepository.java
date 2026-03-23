package com.caio.smartaccessapi.repository;

import com.caio.smartaccessapi.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
