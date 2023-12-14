package com.gestioneventos.sbc3d4ejercicio1.controller;

import com.gestioneventos.sbc3d4ejercicio1.model.Evento;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

import static java.util.stream.Collectors.toList;


@RestController
@RequestMapping("/generador")
public class EventoController {

    private List<Evento> eventoList = new ArrayList<>();

    @PostMapping("/evento")
    public Evento agregarEvento(@RequestBody Evento nuevoEvento) {
        nuevoEvento.setId((long) (eventoList.size() + 1));
        eventoList.add(nuevoEvento);
        return nuevoEvento;
    }

    @GetMapping("/eventos")
    public List<Evento>listaEventos(){
        return eventoList;
    }

    @GetMapping("/evento/{id}")
    public List<Evento>listaEventos(@PathVariable Long id){
        List<Evento>filtrado = eventoList.stream()
                .filter(evento -> evento.getId() == id)
                .toList();
        return filtrado;
    }
}
