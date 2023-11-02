public class Zapato extends Vestimenta{

    //Atributos
    private String material;
    private String tipoCierre;

    //Constructor
    public Zapato(int codigo, String nombre, double precio, String marca, String talla, String color, String material, String tipoCierre) {
        super(codigo, nombre, precio, marca, talla, color);
        this.material = material;
        this.tipoCierre = tipoCierre;
    }

    //Metodo que sobreescribe al de la clase Vestimenta
    @Override
    public void mostrarAtributo(){
        System.out.println("Estos zapatos son de marca: " + super.getMarca());
    }
}
