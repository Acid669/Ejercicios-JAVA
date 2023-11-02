public class Sombrero extends Vestimenta {

    //Atributos
    private String tipo;
    private String tamano;

    //Constructor
    public Sombrero(int codigo, String nombre, double precio, String marca, String talla, String color, String tipo, String tamano) {
        super(codigo, nombre, precio, marca, talla, color);
        this.tipo = tipo;
        this.tamano = tamano;
    }

    //Metodo que sobreescribe al de la clase Vestimenta
    @Override
    public void mostrarAtributo() {
        System.out.println("Esta sombrero es de tipo: " + tipo);
    }
}
