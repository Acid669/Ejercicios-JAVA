package sb.spc5d6ejercicio1.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Calificacion {

    private Long id;
    private double calificacion1;
    private double calificacion2;
    private double calificacion3;
    private double promedio;
    private List<Estudiante> estudiantes = new ArrayList<>();

}
