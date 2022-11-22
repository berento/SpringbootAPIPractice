package org.dream.firstAPI.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {
    @GetMapping(value = "/")
    public String getPage() {
        return "Hello from our API";
    }
}
