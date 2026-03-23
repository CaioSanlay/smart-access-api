package com.caio.smartaccessapi.service;

import com.caio.smartaccessapi.entity.Access;
import com.caio.smartaccessapi.entity.Door;
import com.caio.smartaccessapi.entity.User;
import com.caio.smartaccessapi.repository.AccessRepository;
import com.caio.smartaccessapi.repository.DoorRepository;
import com.caio.smartaccessapi.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class AccessService {

    private final AccessRepository accessRepository;
    private final UserRepository userRepository;
    private final DoorRepository doorRepository;

    public AccessService(AccessRepository accessRepository, UserRepository userRepository, DoorRepository doorRepository) {
        this.accessRepository = accessRepository;
        this.userRepository = userRepository;
        this.doorRepository = doorRepository;
    }

    public Access register (Long userId, Long doorId){
        User user = userRepository.findById(userId)
                .orElseThrow(() -> new RuntimeException("Door not found"));

        Door door = doorRepository.findById(doorId)
                .orElseThrow(() -> new RuntimeException("Door not found"));

        Access access = new Access();
        access.setUser(user);
        access.setDoor(door);
        access.setAccessTime(LocalDateTime.now());

        return accessRepository.save(access);
    }
}
