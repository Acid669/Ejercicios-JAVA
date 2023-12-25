package sb.spc6d7ejercicio1.Dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import sb.spc6d7ejercicio1.model.Ingrediente;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PlatoDTO {
    private Long id;
    private String nombre;
    private List<Ingrediente> ingredientes;
    private Double caloriaMax;
    private Double caloriasTotales;
}
