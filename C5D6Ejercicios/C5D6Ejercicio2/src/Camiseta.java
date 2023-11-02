public class Camiseta extends Vestimenta {

    //Atributos
    private String manga;
    private String cuello;

    //Constructor
    public Camiseta(int codigo, String nombre, double precio, String marca, String talla, String color, String manga, String cuello) {
        super(codigo, nombre, precio, marca, talla, color);
        this.manga = manga;
        this.cuello = cuello;
    }

    //Metodo que sobreescribe al de la clase Vestimenta
    @Override
    public void mostrarAtributo() {
        System.out.println("Esta camiseta es de manga: " + manga);
    }
}
