package com.springrest.springrest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @GetMapping("/")
    String getHelloWorld(){
        return "<h1>My fancy first web page</h1>";
    }
}
