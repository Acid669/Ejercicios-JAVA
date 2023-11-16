import java.util.ArrayList;
import java.util.List;

public class Tarea {

    //Atributos
    private String nombre;
    private List<Tarea> subtareas;

    //Constructor
    public Tarea(String nombre) {
        this.nombre = nombre;
        this.subtareas = new ArrayList<>();
    }

    //Metodo para agregar subtareas a tareas
    public void agregarSubtarea(Tarea subtarea) {
        subtareas.add(subtarea);
    }

    //Metodo mostrar estructura
    public void mostrarEstructura(int nivel) {
        //Imprimir espacios para representar la estructura
        for (int i = 0; i < nivel; i++) {
            System.out.print("          ");
        }
        //Imprimir el nombre de la tarea con el carácter ascii
        System.out.println("\u2514\u2500\u2500> " + nombre);

        //Recorrer las subtareas recursivamente
        for (Tarea subtarea : subtareas) {
            subtarea.mostrarEstructura(nivel + 1);
        }

    }
}
