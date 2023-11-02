public class Ave extends Animal{

    //Atributos
    private int envergaduraAlas;
    private String tipoVuelo;
    private String colorPlumaje;
    private String tipoPico;

    //Constructor

    public Ave(int id, String nombre, int edad, String tipoPiel, String tipoAlimentacion, int envergaduraAlas, String tipoVuelo, String colorPlumaje, String tipoPico) {
        super(id, nombre, edad, tipoPiel, tipoAlimentacion);
        this.envergaduraAlas = envergaduraAlas;
        this.tipoVuelo = tipoVuelo;
        this.colorPlumaje = colorPlumaje;
        this.tipoPico = tipoPico;
    }

    //Metodos
    //Sobreescribir metodo saludar() de la clase principal
    @Override
    public void saludar() {

        System.out.println("Hola, soy un ave");
    }
}
