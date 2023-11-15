import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        InventarioAutos<Auto> inventarioAutos = new InventarioAutos<>();

        inventarioAutos.agregarAuto(new Auto("Civic", "Honda", 22000, 2022));
        inventarioAutos.agregarAuto(new Auto("Camry", "Toyota", 25500, 2021));
        inventarioAutos.agregarAuto(new Auto("Accord",  "Honda" , 24800,  2022 ));
        inventarioAutos.agregarAuto(new Auto("Corolla", "Toyota", 21500, 2021));
        inventarioAutos.agregarAuto(new Auto("Fusion", "Ford", 23000, 2022));

        inventarioAutos.buscarAutoMarca("Honda");
        inventarioAutos.calcularTotal();

        System.out.println("\nHonda:");
        List <Auto> honda = inventarioAutos.buscarAutoMarca("Honda");
        honda.forEach(System.out::println);

        System.out.println("\n2021:");
        List <Auto> anyo = inventarioAutos.buscarAutoAnyo(2021);
        anyo.forEach(System.out::println);

        System.out.println("\nTOTAL:");
        double total = inventarioAutos.calcularTotal();
        System.out.println(total);

    }
}