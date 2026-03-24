package com.caio.smartaccessapi.controller;


import com.caio.smartaccessapi.entity.Door;
import com.caio.smartaccessapi.service.DoorService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/doors")
public class DoorController {

    private final DoorService service;

    public DoorController(DoorService service) {
        this.service = service;
    }
    @PostMapping
    public ResponseEntity<Door> create(@RequestBody Door door){
        Door savedDoor = service.save(door);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedDoor);
    }

    @GetMapping
    public ResponseEntity<List<Door>> getAll(){
        return ResponseEntity.ok(service.findAll());
    }
}
