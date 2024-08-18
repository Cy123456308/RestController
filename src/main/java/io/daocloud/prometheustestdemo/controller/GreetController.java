package io.daocloud.prometheustestdemo.controller;

import io.daocloud.prometheustestdemo.service.GreetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetController {
    @Autowired
    private GreetService greetService;

    @GetMapping("/greeting")
    @RequestLimit(count=100)
    public Object greeting() {
        return greetService.greeting();
    }
}
