package dev.wfrsilva.first_spring_app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.wfrsilva.first_spring_app.domain.User;
import dev.wfrsilva.first_spring_app.services.HelloWorldService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/hello-world")
public class HelloWorldController {

    @Autowired
    private HelloWorldService helloWorldService;

    @GetMapping
    public String helloWorld() {
        return helloWorldService.helloWorld("Silva");
    }// String

    @PostMapping("")
    public String helloWorldPost(@RequestBody User body) {
        return "Hello Codorna Post " + body.getEmail();
    }// helloWorldPost

}// HelloWorldController
