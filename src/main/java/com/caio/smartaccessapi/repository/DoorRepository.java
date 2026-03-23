package com.caio.smartaccessapi.repository;

import com.caio.smartaccessapi.entity.Door;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DoorRepository extends JpaRepository<Door, Long> {
}
