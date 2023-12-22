package sb.spc5d6ejercicio1.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Estudiante {
    private Long numMatricula;
    private String nombre;
    private String apellido;
    private LocalDate fechaNacimiento;
}
