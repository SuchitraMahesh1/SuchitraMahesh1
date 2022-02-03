package com.springrest.springrest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @GetMapping("/")
    String getHelloWorld(){
        return "<h1>Thank you.. :) Thank you :) </h1>";
    }
}
