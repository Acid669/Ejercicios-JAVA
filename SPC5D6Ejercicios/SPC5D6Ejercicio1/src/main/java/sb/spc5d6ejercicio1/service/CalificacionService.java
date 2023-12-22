package sb.spc5d6ejercicio1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sb.spc5d6ejercicio1.dto.ClasificacionDto;
import sb.spc5d6ejercicio1.model.Calificacion;
import sb.spc5d6ejercicio1.model.Estudiante;

import java.util.*;

@Service
public class CalificacionService implements ICalificacionService {

    @Autowired
    private EstudianteService estudianteService;
    private List<Calificacion> calificaciones;

    @Autowired
    public CalificacionService(EstudianteService estudianteService) {
        this.estudianteService = estudianteService;
        initializeRatings();
    }

    private void initializeRatings() {
        calificaciones = Arrays.asList(
                new Calificacion(1L, 6.5, 5.5, 7.3, generarPromedio(6.5, 5.5, 7.3), estudianteService.obtenerTodosEstudiantes().stream().filter(estudiante -> estudiante.getNumMatricula().equals(1L)).toList()),
                new Calificacion(2L, 4.75, 6.45, 8.5, generarPromedio(4.75, 6.5, 8.5),  estudianteService.obtenerTodosEstudiantes().stream().filter(estudiante -> estudiante.getNumMatricula().equals(2L)).toList()),
                new Calificacion(3L, 7.75, 8.0, 10.0, generarPromedio(7.75, 8.0, 10), estudianteService.obtenerTodosEstudiantes().stream().filter(estudiante -> estudiante.getNumMatricula().equals(3L)).toList()),
                new Calificacion(4L, 9.45, 7.75, 10.0, generarPromedio(9.45, 7.75, 10.0),  estudianteService.obtenerTodosEstudiantes().stream().filter(estudiante -> estudiante.getNumMatricula().equals(4L)).toList())
        );
    }


    @Override

    public List<Calificacion> obtenerCalificacionesMatricula(Long numMatricula) {
        return calificaciones.stream()
                .filter(rating -> rating.getEstudiantes().stream()
                        .anyMatch(student -> student.getNumMatricula().equals(numMatricula)))
                .map(rating -> {
                    Calificacion calificacionFiltrada = new Calificacion();
                    calificacionFiltrada.setId(rating.getId());
                    calificacionFiltrada.setCalificacion1(rating.getCalificacion1());
                    calificacionFiltrada.setCalificacion2(rating.getCalificacion2());
                    calificacionFiltrada.setCalificacion3(rating.getCalificacion3());
                    calificacionFiltrada.setPromedio(rating.getPromedio()); // Mantenemos el promedio de la calificación
                    calificacionFiltrada.setEstudiantes(rating.getEstudiantes().stream()
                            .filter(student -> student.getNumMatricula().equals(numMatricula))
                            .toList());
                    return calificacionFiltrada;
                })
                .toList();
    }

    @Override
    public List<ClasificacionDto> obtenerListaDescendiente() {
        return calificaciones.stream()
                .map(rating -> {
                    ClasificacionDto clasificacionDto = new ClasificacionDto();
                    clasificacionDto.setId(rating.getId());
                    clasificacionDto.setNombre(estudianteService.obtenerTodosEstudiantes().stream().findFirst().map(Estudiante::getNombre).orElse(null));
                    clasificacionDto.setMediaClasificacion(rating.getPromedio()); // Mantenemos el promedio de la calificación
                    return clasificacionDto;
                }).sorted(Comparator.comparing(ClasificacionDto::getMediaClasificacion).reversed())//Ordenamos de manera descendente
                .toList();
    }

    //creamos el promedio de nota
    public Double generarPromedio(double num1, double num2, double num3) {
        double average = (num1 + num2 + num3) / 3;
        return Math.round(average * 100.0) / 100.0; // Redondear a dos decimales
    }
}
