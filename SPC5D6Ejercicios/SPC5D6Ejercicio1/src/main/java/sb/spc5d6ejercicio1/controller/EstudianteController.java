package sb.spc5d6ejercicio1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sb.spc5d6ejercicio1.model.Calificacion;
import sb.spc5d6ejercicio1.model.Estudiante;
import sb.spc5d6ejercicio1.service.CalificacionService;
import sb.spc5d6ejercicio1.service.EstudianteService;

import java.util.List;
@RestController
@RequestMapping("/estudiante")
public class EstudianteController {

    @Autowired
    private EstudianteService estudianteService;

    @GetMapping("/estudiantes")
    public List<Estudiante> mostrarListado() {
        return estudianteService.obtenerTodosEstudiantes();
    }


}