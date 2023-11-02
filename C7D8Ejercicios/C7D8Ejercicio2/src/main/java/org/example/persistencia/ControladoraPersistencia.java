package org.example.persistencia;

import org.example.logica.Platillos;

import java.util.List;

public class ControladoraPersistencia {


    PlatilloJpaController platilloJpa = new PlatilloJpaController();

    //Metodo de crear platillo
    public void crearPlatillo(Platillos platillo){
        platilloJpa.create(platillo);
    }

    //Metodo de eliminar platillo
    public void  eliminarPlatillo(Long id){
        platilloJpa.destroy(id);
    }

    //Metodo de modificar platillo
    public void editarPlatillo(Platillos platillo){
        platilloJpa.edit(platillo);
    }

    //Metodo de listar platillos
    public List<Platillos> listaPlatillos(){
        return platilloJpa.findPlatilloEntities();
    }
}
