package com.refranes.sbc1d2ejercicio1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

@RestController
public class RefranesController {
    private List<String> refranes = Arrays.asList("Más vale tarde que nunca.",
            "A quien madruga, Dios le ayuda.",
            "No hay mal que por bien no venga.",
            "Más vale prevenir que lamentar.",
            "En boca cerrada no entran moscas.",
            "A caballo regalado no se le mira el dentado.",
            "Camarón que se duerme, se lo lleva la corriente.",
            "Del dicho al hecho, hay mucho trecho.",
            "No por mucho madrugar amanece más temprano.",
            "A mal tiempo, buena cara.");

    @GetMapping()
    public String refranAleatorio() {
        Random random = new Random();
        int indiceALeatorio = random.nextInt(refranes.size());
        return refranes.get(indiceALeatorio);
    }
}











