public class Empleado {

    //Atributos
    private String nombre;
    private double salario;
    private String categoria;

    //Constructor
    public Empleado(String nombre, double salario, String categoria) {
        this.nombre = nombre;
        this.salario = salario;
        this.categoria = categoria;
    }

    //Getters
    public String getNombre() {
        return nombre;
    }


    public double getSalario() {
        return salario;
    }


    public String getCategoria() {
        return categoria;
    }


    //toString
    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", salario=" + salario +
                ", categoria='" + categoria + '\'' +
                '}';
    }
}
