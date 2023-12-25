package sb.spc6d7ejercicio1.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Ingrediente {
    private Long id;
    private String name;
    private Integer calories;

}
