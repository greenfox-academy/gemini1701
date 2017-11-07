package com.greenfoxacademy.restfirst.controller;
import com.greenfoxacademy.restfirst.model.DoubleObject;
import com.greenfoxacademy.restfirst.model.Error;
import org.springframework.web.bind.annotation.*;

@RestController
public class RequestController {


    @RequestMapping(value = "/doubling", method = RequestMethod.GET)
    public Object doublingProvider(@RequestParam(required = false) Integer input){
        Error error = new Error("Error", "Please provide an input!");
        System.out.println(input);

        if(input == null){
            return error;
        }else {
            DoubleObject doub = new DoubleObject(input);
            return doub;
        }
    }

    @RequestMapping(value = "/greeter", method = RequestMethod.GET)
    public String greeter(@RequestParam(required = false) String input){
        return input;
    }
}
