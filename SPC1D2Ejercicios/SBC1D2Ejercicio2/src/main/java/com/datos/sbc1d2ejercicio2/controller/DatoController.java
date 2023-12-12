package com.datos.sbc1d2ejercicio2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

@RestController
public class DatoController {


    private List<String> datos = Arrays.asList(
            "En términos de distancia, la Tierra y la Luna podrían alinearse exactamente entre sí con espacio de sobra, creando el fenómeno llamado 'superluna', que ocurre cuando la Luna está en su punto más cercano a la Tierra.",
            "Las abejas pueden reconocer rostros humanos.",
            "El corazón de una ballena azul es tan grande que una persona podría nadar a través de sus arterias.",
            "Las vacas tienen mejores amigos y pueden experimentar estrés cuando se separan de ellos.",
            "El olfato de un perro es tan agudo que puede detectar algunas enfermedades, como el cáncer, en los humanos.",
            "La miel nunca se echa a perder. Se han encontrado frascos de miel en tumbas egipcias que datan de más de 3,000 años y aún son comestibles.",
            "Los flamencos rosados no nacen con ese color; obtienen su color rosado de la dieta de alimentos ricos en betacarotenos.",
            "La Gran Muralla China no es visible desde la Luna a simple vista, a pesar de una creencia popular. Sin embargo, las luces de las ciudades sí son visibles.",
            "Cada vez que mezclas agua y aceite, obtienes un arco iris de colores llamado el 'efecto Tyndall'.",
            "Los pulpos tienen tres corazones: dos bombean sangre a los órganos y uno a ..."
    );

    @GetMapping()
    public String obtenerDatoAleatorio(){
        Random random = new Random();
        int indiceAleatorio = random.nextInt(datos.size());
        return datos.get(indiceAleatorio);
    }
}
