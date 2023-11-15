
public class Mascota <T>{

    private long id;
    private String nombre;
    private int edad;
    private T especie;

    public Mascota(long id, String nombre, int edad, T especie) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.especie = especie;
    }

    public long getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public T getEspecie() {
        return especie;
    }
}
