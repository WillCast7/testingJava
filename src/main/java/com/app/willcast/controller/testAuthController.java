package com.app.willcast.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class testAuthController {

    @GetMapping("/hello")
    public String hello(){
        return  "Hello world";
    }

    @GetMapping("/hello-secured")
    public String helloSecured(){
        return  "Hello world-secured";
    }
}