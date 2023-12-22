package sb.spc5d6ejercicio1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sb.spc5d6ejercicio1.dto.ClasificacionDto;
import sb.spc5d6ejercicio1.model.Calificacion;
import sb.spc5d6ejercicio1.service.CalificacionService;

import java.util.List;

@RestController
@RequestMapping("/calificaciones")

public class CalificacionController {

    @Autowired
    CalificacionService calificacionService;

    @GetMapping("/{numMatricula}")
    public List<Calificacion> obtenerCalificacionesMatricula(@PathVariable Long numMatricula) {
            return calificacionService.obtenerCalificacionesMatricula(numMatricula);
        }

        @GetMapping("/ordendesc")
        public List<ClasificacionDto> obtenerListaDescendiente () {
            return calificacionService.obtenerListaDescendiente();
        }

    }

