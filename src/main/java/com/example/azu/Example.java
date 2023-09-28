package com.example.azu;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("any")
@CrossOrigin("*")
public class Example {

    @GetMapping
    public String re() {
        return "Hello world";
    }
}
