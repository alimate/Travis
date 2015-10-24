package com.alimate.service;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
@RequestMapping("/greeting")
public class GreetingService {
    @RequestMapping(method = GET)
    public String greetToTravis() {
        return "Hello Travis";
    }
}