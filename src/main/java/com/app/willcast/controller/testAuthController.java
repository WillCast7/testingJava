package com.app.willcast.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usuario-contrasena")
@PreAuthorize("denyAll()")
public class testAuthController {

    @GetMapping("/todos")
    @PreAuthorize("permitAll()")
    public String hello(){
        return  "funciona con usuario y contraseña - Valor retornado para todos";
    }

    @GetMapping("/permiso-lectura")
    @PreAuthorize("hasAuthority('READ')")
    public String permisoLectura(){
        return  "funciona con usuario y contraseña  - Valor retornado si el usuario tiene permiso de lectura";
    }

    @GetMapping("/permiso-escritura")
    @PreAuthorize("hasAuthority('CREATE')")
    public String permisoEscritura(){
        return  "funciona con usuario y contraseña  - Valor retornado si el usuario tiene permiso de escritura";
    }
}
