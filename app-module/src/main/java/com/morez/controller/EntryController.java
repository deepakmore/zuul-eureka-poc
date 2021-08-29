package com.morez.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("api/v1")
public class EntryController {

    @GetMapping("/app")
    public String getMessage() {
        return "Ping from App-Module";
    }
}
