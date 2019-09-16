package com.smagin.skolteckint.skolteckint;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/hello")
    private String hello(){
        return "Hello";
    }
}
