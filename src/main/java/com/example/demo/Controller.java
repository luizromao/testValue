package com.example.demo;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Component
@RestController
@RequestMapping("/test")
@RequiredArgsConstructor
public class Controller {

    private final Test test;

    @GetMapping
    public String useValue() {
        return test.getTest();
    }

}
