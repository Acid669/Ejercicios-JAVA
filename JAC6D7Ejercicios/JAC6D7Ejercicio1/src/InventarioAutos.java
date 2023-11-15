import java.util.ArrayList;
import java.util.List;

//Clase Utilitaria con un tipo T que extiende la clase Auto
public class InventarioAutos<T extends Auto> {

    //Lista de autos del inventario
    private List<T> inventario;

    //Constructor
    public InventarioAutos() {
        this.inventario = new ArrayList<>();
    }

    //Método para agregar autos al inventario
    public void agregarAuto(T auto) {
        inventario.add(auto);
        System.out.println("Auto agregado al inventario: " + auto);
    }

    //Método para buscar autos por marca
    public List<T> buscarAutoMarca(String marca) {
        List<T> buscarMarca = new ArrayList<>();
        for ( T autoBuscado: inventario) {
            if (autoBuscado.getMarca().equalsIgnoreCase(marca)){
                buscarMarca.add(autoBuscado);
            }
        }
        return buscarMarca;
    }

    //Método para buscar autos por año
    public List<T> buscarAutoAnyo(int anyo) {
        List<T> buscarAnyo = new ArrayList<>();
        for (T autoBuscado: inventario){
            if (autoBuscado.getAnyo() == anyo){
                buscarAnyo.add(autoBuscado);
            }
        }
        return buscarAnyo;
    }

    //Método para calcular el valor total del inventario
    public double calcularTotal() {
        double resultado = 0;
        for (T auto : inventario) {
            resultado += auto.getPrecio();
        }
        return resultado;
    }
}
