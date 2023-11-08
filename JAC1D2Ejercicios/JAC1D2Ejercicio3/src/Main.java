public class Main {
    public static void main(String[] args) {

        Datos datos = new Datos(5);
        try {
            //almacenar datos en posiciones específicas del arreglo
            datos.almacenarDato(0,"Perro");
            datos.almacenarDato(1,"Gato");
            datos.almacenarDato(2,"Ave");
            datos.almacenarDato(3,"Reptil");
            datos.almacenarDato(4,"Pez");
            //datos.almacenarDato(5,"Delfin"); daria fallo si se ingresa mas de lo indicado

            // Intentamos obtener datos de posiciones inválidas
            System.out.println(datos.obtenerDato(3)); //Este dera la el dato del vector porque está dentro de los límites
            System.out.println(datos.obtenerDato(5)); //Este dra una excepción

        }catch (ArrayIndexOutOfBoundsException | DatosException ex){
            System.out.println("Error: " + ex.getMessage());
        }


    }
}