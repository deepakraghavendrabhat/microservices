package com.demo.test.springdockerdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @GetMapping("/test-demo")
    public String getData()
    {
        return "demo tests working";
    }
}
