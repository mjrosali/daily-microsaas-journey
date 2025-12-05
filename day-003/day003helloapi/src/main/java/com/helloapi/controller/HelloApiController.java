package com.helloapi.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api2")
public class HelloApiController {

    @GetMapping("hello")
    public Map<String, String> hello() {
        Map<String, String> helloapi = new HashMap<>();
        helloapi.put("message", "hello from api!");
        return helloapi;
    }
}
