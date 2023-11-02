public class Pantalon extends Vestimenta {

    //Atributos
    private String estilo;
    private String tipoTejido;

    //Constructor
    public Pantalon(int codigo, String nombre, double precio, String marca, String talla, String color, String estilo, String tipoTejido) {
        super(codigo, nombre, precio, marca, talla, color);
        this.estilo = estilo;
        this.tipoTejido = tipoTejido;
    }

    //Metodo que sobreescribe al de la clase Vestimenta
    @Override
    public void mostrarAtributo() {
        System.out.println("Este pantalon es de estilo: " + estilo);
    }
}
