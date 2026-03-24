package com.caio.smartaccessapi.service;

import com.caio.smartaccessapi.entity.Door;
import com.caio.smartaccessapi.exception.DuplicateResourceException;
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
        if (repository.existsByName(door.getName())){
            throw new DuplicateResourceException("O nome da porta já existe");
        }
        return repository.save(door);
    }

    public List<Door> findAll() {
        return  repository.findAll();
    }
}
