package sb.spc6d7ejercicio1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sb.spc6d7ejercicio1.Dto.PlatoDTO;
import sb.spc6d7ejercicio1.service.IPlatoService;

@RestController
@RequestMapping("/platos")
public class platoController {

    @Autowired
     private IPlatoService platoService;

    @GetMapping("/{name}")
    public PlatoDTO obtenerPlatosNombre(@PathVariable String name){
        return platoService.obtenerPlatosNombre(name);
    }

}
