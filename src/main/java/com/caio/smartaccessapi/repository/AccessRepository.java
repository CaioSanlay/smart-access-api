package com.caio.smartaccessapi.repository;

import com.caio.smartaccessapi.entity.Access;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccessRepository extends JpaRepository<Access, Long> {

    boolean existsByUserId(Long userId);
}
