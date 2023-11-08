public class CadenaProduccion {

    //Atributos
    private int contadorEnsamblaje = 0;
    private int contadorControlCalidad = 0;
    private int contadorEmbalaje = 0;

    //Constructor
    public CadenaProduccion() {

    }

    //Metodos
    public int getContadorEnsamblaje() {
        return contadorEnsamblaje;
    }

    public int getContadorControlCalidad() {
        return contadorControlCalidad;
    }

    public int getContadorEmbalaje() {
        return contadorEmbalaje;
    }

    public synchronized void ensamblajeProducto() {
        contadorEnsamblaje++;
    }

    public synchronized void controlCalidad() {
        contadorControlCalidad++;
    }

    public synchronized void embalarProducto() {
        contadorEmbalaje++;
    }
}
