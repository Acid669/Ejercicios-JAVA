package sb.spc5d6ejercicio1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sb.spc5d6ejercicio1.model.Calificacion;
import sb.spc5d6ejercicio1.model.Estudiante;

import java.time.LocalDate;
import java.util.*;

@Service
public class EstudianteService implements IEstudianteService {

    List<Estudiante> estudiantes = Arrays.asList(
            new Estudiante(1L, "Maria", "Gutierrez", LocalDate.of(1990, 1, 2)),
            new Estudiante(2L, "Juan", "De arco", LocalDate.of(1989, 12, 24)),
            new Estudiante(3L, "Tomas", "Cafetero", LocalDate.of(1999, 10, 15))
    );

    @Override
    public List<Estudiante> obtenerTodosEstudiantes() {
        return estudiantes;
    }

    @Override
    public Calificacion obtenerEstudianteCalificacion(Long estudianteId) {
        return null;
    }
}
