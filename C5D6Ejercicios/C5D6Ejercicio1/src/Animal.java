public class Animal {

    //Atributos
    private int id;
    private String nombre;
    private  int edad;
    private String tipoPiel;
    private String tipoAlimentacion;

    //Constructores

    //Constructor null
    public Animal() {
    }

    //Constructor con atributos
    public Animal(int id, String nombre, int edad, String tipoPiel, String tipoAlimentacion) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.tipoPiel = tipoPiel;
        this.tipoAlimentacion = tipoAlimentacion;
    }

    //Metodos
    public void saludar(){
        System.out.println("Hola, soy un animal");
    }

}
