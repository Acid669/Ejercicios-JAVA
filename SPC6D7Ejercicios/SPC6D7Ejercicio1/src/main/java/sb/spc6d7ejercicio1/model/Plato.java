package sb.spc6d7ejercicio1.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Plato {
    private Long id;
    private String nombre;
    private Double precio;
    private Long[] ingredientes;
}
