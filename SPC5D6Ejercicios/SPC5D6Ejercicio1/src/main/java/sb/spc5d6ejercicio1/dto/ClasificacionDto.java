package sb.spc5d6ejercicio1.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ClasificacionDto {
    private Long id;
    private Double mediaClasificacion;
    private String nombre;
}
