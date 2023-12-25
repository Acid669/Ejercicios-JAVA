package sb.spc6d7ejercicio1.repository;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Repository;
import org.springframework.util.ResourceUtils;
import sb.spc6d7ejercicio1.model.Ingrediente;
import sb.spc6d7ejercicio1.model.Plato;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

@Repository
public class PlatosRepository {

    public List<Plato> loadDataBasePlato() {
        File file = null;
        try {
            //aquí colocamos la url de nuestro archivo json que queremos cargar
            file = ResourceUtils.getFile("dishes.json");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        ObjectMapper objectMapper = new ObjectMapper();
        TypeReference<List<Plato>> typeRef = new TypeReference<>() {
        };
        List<Plato> platoList = null;
        try {
            platoList = objectMapper.readValue(file, typeRef);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return platoList;
    }

    public List<Ingrediente> loadDataBaseIngediente() {
        File file = null;
        try {
            file = ResourceUtils.getFile("ingredients.json");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        ObjectMapper objectMapper = new ObjectMapper();
        TypeReference<List<Ingrediente>> typeRef = new TypeReference<>() {
        };
        List<Ingrediente> ingredienteList = null;
        try {
            ingredienteList = objectMapper.readValue(file, typeRef);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return ingredienteList;
    }


}

