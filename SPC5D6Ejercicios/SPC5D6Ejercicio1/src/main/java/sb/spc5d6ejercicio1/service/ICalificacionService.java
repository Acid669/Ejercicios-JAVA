package sb.spc5d6ejercicio1.service;

import sb.spc5d6ejercicio1.dto.ClasificacionDto;
import sb.spc5d6ejercicio1.model.Calificacion;

import java.util.List;

public interface ICalificacionService {
    public List<Calificacion> obtenerCalificacionesMatricula(Long numMatricula);

    public List<ClasificacionDto> obtenerListaDescendiente();

}
