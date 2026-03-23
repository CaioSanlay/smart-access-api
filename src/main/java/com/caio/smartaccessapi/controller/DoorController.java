package com.caio.smartaccessapi.controller;


import com.caio.smartaccessapi.entity.Door;
import com.caio.smartaccessapi.service.DoorService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/doors")
public class DoorController {

    private final DoorService service;

    public DoorController(DoorService service) {
        this.service = service;
    }

    public Door create(@RequestBody Door door){
        return service.save(door);
    }

    @GetMapping
    public List<Door> getAll(){
        return service.findAll();
    }
}
