package com.example.sesion456.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/saludo")
    public String HelloController(){
        return "Hola desde Hello Controller";
    }

}
