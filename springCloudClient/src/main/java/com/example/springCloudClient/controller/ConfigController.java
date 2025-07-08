package com.example.springCloudClient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/config")
public class ConfigController {

    @Value("${active-profiles:Default message}")
    private String message;

    @GetMapping
    public String getMessage() {
        return message;
    }
}
