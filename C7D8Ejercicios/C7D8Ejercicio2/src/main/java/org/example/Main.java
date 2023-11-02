package org.example;

import org.example.logica.Platillos;
import org.example.persistencia.ControladoraPersistencia;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        ControladoraPersistencia controladora = new ControladoraPersistencia();

        //Creo un objeto de la clase Platillos
        Platillos platillo1 = new Platillos(1L,"Espagueti a la boloñesa","Espagueti con salsa de carne, tomate y especias.",12.99);
        Platillos platillo2 = new Platillos(1L,"Salmón a la parrilla","Chuletón a la parrilla con hierbas.",16.50);
        Platillos platillo3 = new Platillos(1L,"Ensalada César","Ensalada fresca con pollo a la parrilla y aderezo César.",9.75);
        Platillos platillo4 = new Platillos(1L,"Tarta de Chocolate","Tarta de chocolate casera con helado de vainilla.",7.99);

        System.out.println("Se he creado un platillo");
        //Persisto (ALTA) el objeto creado por JPA
        controladora.crearPlatillo(platillo1);


        System.out.println("Se he creado tres platillos");


        //Persisto (ALTA) el objeto creado por JPA

        controladora.crearPlatillo(platillo2);
        controladora.crearPlatillo(platillo3);
        controladora.crearPlatillo(platillo4);


        System.out.println("Se he modificado un platillo");


        //EDITAR un registro creado y persistido

        platillo2.setNombre("Chuletón a la parrilla");
        platillo2.setReceta("Chuletón a la parrilla con hierbas.");
        platillo2.setPrecio(18.50);


        System.out.println("Se he modificado un platillo");


        //ELIMINO(BAJA) un registro creado y persistido
        controladora.eliminarPlatillo(platillo3.getId());

        //LISTAR
        List<Platillos> listPlatillos = controladora.listaPlatillos();
        for (Platillos platillos: listPlatillos) {
            System.out.println("ID del plato: " + platillos.getId() + ", Nombre: " +platillos.getNombre()+ ", Receta: " +platillos.getReceta()+ ", Precio: " +platillos.getPrecio()+ "€");
        }

    }
}