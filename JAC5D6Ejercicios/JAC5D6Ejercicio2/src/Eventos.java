import java.time.LocalDate;

public class Eventos {

    //Atributos
    private String nombre;
    private LocalDate fecha;
    private String categoria;

    //Constructor

    public Eventos(String nombre, LocalDate fecha, String categoria) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.categoria = categoria;
    }

    //Getter
    public String getNombre() {
        return nombre;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public String getCategoria() {
        return categoria;
    }

    //toString

    @Override
    public String toString() {
        return "Eventos:\t" +
                nombre + "|\t" + fecha +"|\t"+ categoria;
    }
}
