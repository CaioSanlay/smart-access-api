package com.caio.smartaccessapi.service;

import com.caio.smartaccessapi.entity.Door;
import com.caio.smartaccessapi.repository.DoorRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DoorService {

    private final DoorRepository repository;

    public DoorService(DoorRepository repository) {
        this.repository = repository;
    }
    public Door save(Door door) {
        return repository.save(door);
    }

    public List<Door> findAll() {
        return  repository.findAll();
    }
}
