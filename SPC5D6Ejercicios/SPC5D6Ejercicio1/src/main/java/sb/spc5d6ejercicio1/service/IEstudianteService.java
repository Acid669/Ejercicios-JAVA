package sb.spc5d6ejercicio1.service;

import sb.spc5d6ejercicio1.model.Calificacion;
import sb.spc5d6ejercicio1.model.Estudiante;

import java.util.List;

public interface IEstudianteService {
    public List<Estudiante> obtenerTodosEstudiantes();
    public Calificacion obtenerEstudianteCalificacion(Long estudianteId);

}
