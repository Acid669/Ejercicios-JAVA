import java.util.Locale;
import java.util.Scanner;

/*Ejercicio Nº 2 - Estructuras Repetitivas - Individual

a) Imagina que eres un cajero en un supermercado. Crea un programa en Java que permita ingresar el precio de varios productos comprados por un cliente.


Utiliza una estructura repetitiva (la que quieras) para continuar pidiendo precios hasta que el usuario decida finalizar. Luego, muestra el total de la compra que debe abonar.

Pista: Recuerda que existen dos tipos de bucles, los controlador por un contador (cuando sabemos un número exacto de productos por ejemplo) u por centinela (cuando no sabemos cuántos productos va a comprar el cliente). En este caso debes aplicar un “centinela”. Un ejemplo podría ser, si se ingresa un número negativo o un 0 como monto de un producto.
* */
public class Main {
    public static void main(String[] args) {

        //DECLARACIÓN DE VARIABLES
        double precio = 0;
        double resultado = 0;

        //HABILITAR ENTRADA DE DATOS
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        //PREGUNTAR AL USUARIO Y ASIGNAR EL VALOR
        System.out.println("Introduzca el valor del primer producto");
        precio = scanner.nextDouble();

        //ESTRUCTURA CONDICIONAL WHILE
        while (precio > 0) {
            //MIENTRAS LA CANTIDAD SEA MAYOR QUE 0 ENTRA EN EL BUCLE Y SE ACUMULA
            resultado += precio;
            //SE VUELVE A PREGUNTAR PARA QUE SIGA EL BUCLE
            System.out.println("Introduzca el valor producto o un negativo para terminar");
            precio = scanner.nextDouble();
        }
        //SE MUESTRA RESULTADO POR PANTALLA
        System.out.println("El total de la compra es: " + resultado + "€");
    }
}