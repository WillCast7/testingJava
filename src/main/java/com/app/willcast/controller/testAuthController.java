package com.app.willcast.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/test")
@PreAuthorize("denyAll()")
public class testAuthController {

    @GetMapping("/get")
    //@PreAuthorize("permitAll()") //Permite todos los permisos
    @PreAuthorize("hasAuthority('READ')") //solo permite el permiso read
    public String helloGet(){
        return  "Hello World - Get";
    }

    @PostMapping("/post")
    @PreAuthorize("hasAuthority('CREATE')")
    public String helloPost(){
        return  "Hello World - Post";
    }

    @PutMapping("/put")
    @PreAuthorize("hasAuthority('UPDATE')")
    public String helloPut(){
        return  "Hello World - Put";
    }

    @DeleteMapping("/delete")
    @PreAuthorize("hasAuthority('REFACTOR')")
    public String helloDelete(){
        return  "Hello World - Delete";
    }

    @PatchMapping("/patch")
    @PreAuthorize("hasAuthority('REFACTOR')") //solo permite el permiso refactor
    public String helloPatch(){
        return  "Hello World - Patch";
    }
}
