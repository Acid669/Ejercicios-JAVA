package sb.spc6d7ejercicio1.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sb.spc6d7ejercicio1.Dto.PlatoDTO;
import sb.spc6d7ejercicio1.model.Ingrediente;
import sb.spc6d7ejercicio1.model.Plato;
import sb.spc6d7ejercicio1.repository.PlatosRepository;

import java.util.ArrayList;
import java.util.List;


@Service
public class PlatoService implements IPlatoService {

    @Autowired
    private PlatosRepository platosRepository;

    @Override
    public PlatoDTO obtenerPlatosNombre(String name) {
        PlatoDTO platoDTO = new PlatoDTO();
        platoDTO.setId(buscarPlato(name).getId());
        platoDTO.setNombre(name);
        platoDTO.setIngredientes(buscarIngredientes(name));
        platoDTO.setCaloriaMax(buscarMaximaCalorias(name));
        platoDTO.setCaloriasTotales(buscarTotalCalorias(name));

        return platoDTO;
    }



    private List<Ingrediente> buscarIngredientes(String name) {
        Long[] ingredients = platosRepository.loadDataBasePlato()
                .stream()
                .filter(plato -> plato.getNombre().equalsIgnoreCase(name))
                .map(p -> p.getIngredientes()).findFirst().orElse(null);

        List<Ingrediente> ingredientsList = new ArrayList<>();
        platosRepository.loadDataBaseIngediente().forEach(p -> {
            for (Long i : ingredients) {
                if (i.equals(p.getId())) {
                    ingredientsList.add(p);
                }
            }
        });

        return ingredientsList;
    }


    private Plato buscarPlato(String name){
        return platosRepository.loadDataBasePlato().stream()
                .filter( p-> p.getNombre().equalsIgnoreCase(name))
                .findFirst()
                .orElse(null);
    }

    private Double buscarMaximaCalorias(String name) {

        return buscarIngredientes(name).stream()
                .mapToDouble(Ingrediente::getCalories)
                .max().orElse(0);
    }

    private Double buscarTotalCalorias(String name){
        return buscarIngredientes(name).stream()
                .mapToDouble(Ingrediente::getCalories)
                .reduce(0.0, Double::sum);
    }
}
