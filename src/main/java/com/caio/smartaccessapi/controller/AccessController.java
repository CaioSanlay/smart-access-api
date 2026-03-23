package com.caio.smartaccessapi.controller;

import com.caio.smartaccessapi.entity.Access;
import com.caio.smartaccessapi.service.AccessService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/access")
public class AccessController {

    private final AccessService service;

    public AccessController(AccessService service) {
        this.service = service;
    }

    @PostMapping
    public Access register(@RequestParam Long userId, @RequestParam Long doorId){
        return  service.register(userId, doorId);
    }
}
