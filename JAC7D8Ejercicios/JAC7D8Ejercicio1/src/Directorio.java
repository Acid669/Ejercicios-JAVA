import java.util.ArrayList;
import java.util.List;

public class Directorio {

    //Atributos
    private String nombre;
    private List<Directorio> subdirectorios;
    private List<String> archivos;

    //Constructor
    public Directorio(String nombre) {
        this.nombre = nombre;
        this.subdirectorios = new ArrayList<>();
        this.archivos = new ArrayList<>();
    }

    //Metodos
    //Agregar Directorio/Subdirectorio
    public void agregarSubdirectorio(Directorio subdirectorio) {
        subdirectorios.add(subdirectorio);
    }

    //Agregar Archivo
    public void agregarArchivo(String archivo) {
        archivos.add(archivo);
    }

    //Explorar archivos
    public static void explorarDirectorio(Directorio directorio) {
        //Imprimir el nombre del directorio
        System.out.println("  |----> " + directorio.nombre);

        //Explorar directorios recursivamente
        for (int i = 0; i < directorio.subdirectorios.size() - 1; i++) {
            System.out.println("  |");
            explorarDirectorio(directorio.subdirectorios.get(i));
        }

        //Explorar el último subdirectorio (si hay más de uno)
        if (directorio.subdirectorios.size() > 0) {
            System.out.println("  |");
            explorarDirectorio(directorio.subdirectorios.get(directorio.subdirectorios.size() - 1));
        }

        //Imprimir archivos en el directorio
        for (String archivo : directorio.archivos) {
            System.out.println("  |---------->   " + archivo);
        }
    }
}
