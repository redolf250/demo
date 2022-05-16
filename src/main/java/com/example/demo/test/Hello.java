package com.example.demo.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {

    @GetMapping("/home")
    public String home(){
        return "Hello your are welcome!";
    }

    @GetMapping("/about")
    public String About(){
        return "This is my about page!";
    }
}
