public class Reptil extends Animal{

    //Atributos
    private int longitud;
    private String tipoEscamas;
    private String tipoVeneno;
    private String habitat;

    //Constructor
    public Reptil(int id, String nombre, int edad, String tipoPiel, String tipoAlimentacion, int longitud, String tipoEscamas, String tipoVeneno, String habitat) {
        super(id, nombre, edad, tipoPiel, tipoAlimentacion);
        this.longitud = longitud;
        this.tipoEscamas = tipoEscamas;
        this.tipoVeneno = tipoVeneno;
        this.habitat = habitat;
    }

    //Metodos
    //Sobreescribir metodo saludar() de la clase principal
    @Override
    public void saludar() {

        System.out.println("Hola, soy un reptil");
    }
}
