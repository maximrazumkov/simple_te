package ru.example.git.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @GetMapping
    public String getList() {
        System.out.println("Hello");
        return "{}";
    }
}
