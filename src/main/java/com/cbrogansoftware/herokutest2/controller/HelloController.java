package com.cbrogansoftware.herokutest2.controller;

import com.cbrogansoftware.herokutest2.service.People;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class HelloController
{
    @RequestMapping("/hello")
    public String hello()
    {
        return "Hello Heroku World!";
    }

    @GetMapping("/helloName")
    public String sayHello(@RequestParam(value = "myName", defaultValue = "World") String name) {
        return String.format("Hello %s!", name);
    }

    @GetMapping("/getPeople")
    public People getPerson() {
        People people = new People(1, "Versing", "26");

        return people;
    }

}
