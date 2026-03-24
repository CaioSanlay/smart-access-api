package com.caio.smartaccessapi.controller;

import com.caio.smartaccessapi.dto.AccessRequestDTO;
import com.caio.smartaccessapi.entity.Access;
import com.caio.smartaccessapi.service.AccessService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/access")
public class AccessController {

    private final AccessService service;

    public AccessController(AccessService service) {
        this.service = service;
    }

    @PostMapping
    public Access register(@RequestBody AccessRequestDTO dto){
        return  service.register(dto.getUserId(), dto.getDoorId());
    }
}
