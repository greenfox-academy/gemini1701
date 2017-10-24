package com.greenfoxacademy.springstart.controllers;
import com.greenfoxacademy.springstart.Greeting;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRestController {

    Greeting greeting = new Greeting(1,"Hello World","");

    @RequestMapping(value = "/greetings")
    public Greeting greeting(){
        return greeting;
    }
}
