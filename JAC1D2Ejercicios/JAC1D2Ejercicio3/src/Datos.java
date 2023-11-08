import java.sql.SQLOutput;

public class Datos {

    //Atributos
    private String[] vector;
    private int tamanyo;

    //Constructor
    public Datos(int tamanyo) {
        this.tamanyo = tamanyo;
        vector = new String[tamanyo];
    }

    //Metodo para almacenar un dato en una posición específica del vector
    public void almacenarDato(int indice, String dato) throws DatosException {
        if (indice > tamanyo && indice <= 0){
            //Si el índice está fuera de los límites establecidos, lanzará una excepcion.
            throw new DatosException("Indice fuera del vector");
        }else{
            //Si no lo guardara en la posición especificada
            vector[indice] = dato;
        }
    }

    //Metodo para obtener un dato de una posición específica del vector
    public String obtenerDato(int indice) throws DatosException {
        //Si el índice está fuera de los límites establecidos, lanzará una excepcion.
        if (indice < 0 || indice == tamanyo){
            throw new DatosException("Intentando acceder a una posición inválida en el vector.");
        }
        //Si no retornara el dato de la posición especificada
        return vector[indice];
    }
}
