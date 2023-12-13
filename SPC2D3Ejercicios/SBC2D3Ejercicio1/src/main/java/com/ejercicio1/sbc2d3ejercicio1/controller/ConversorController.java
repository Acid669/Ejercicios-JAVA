package com.ejercicio1.sbc2d3ejercicio1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConversorController {

    @GetMapping("/conversorCm")
    public String conversorCm(@RequestParam int cm) {
        double convertido = cm / 100.0;
        return String.format("El equivalente a %d cm es de %.2f metros", cm, convertido);   }
}

//Ruta para comprobar si funciona
//http://localhost:8080/conversorCm?cm=163