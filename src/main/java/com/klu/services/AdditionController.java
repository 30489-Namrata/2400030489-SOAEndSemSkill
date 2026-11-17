package com.klu.services;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdditionController {

    @GetMapping("/MS1")
    public String add(
            @RequestParam int a,
            @RequestParam int b) {

        int sum = a + b;

        return "MS1.1 addition equals " + sum;
    }
}