import java.util.Locale;
import java.util.Scanner;

/*Ejercicio Nº 3 - Arreglos: Vectores - Individual

Una web de meteorología necesita de un programa que, al ingresar las 7 temperaturas máximas de la última semana, calcule la temperatura máxima promedio que hubo.

Para ello, deberá manejar un vector donde en cada posición se almacene la correspondiente temperatura máxima de cada día. Una vez almacenadas las temperaturas, deberá calcular el promedio de las mismas recorriendo el vector y mostrando el resultado por pantalla.
* */public class Main {
    public static void main(String[] args) {

        //DECLARACIÓN DE VARIABLES
        double[] temp = new double[3];
        double resultado = 0;


        //HABILITAR ENTRADA DE DATOS POR TECLADO
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        //ESTRUCTURA CONDICIONAL POR UN FOR
        for (int i = 0; i < temp.length; i++) {

            //PEDIMOS AL USUARIO QUE INTRODUZCA TEMPERATURAS Y GUARDAMOS CADA VALOR EN UN HUECO DEL VECTOR
            System.out.println("Por favor introduzca temperatura maxima");
            temp[i] = scanner.nextDouble();
        }

        //RECORREMOS EL VECTOR ACUMULANDO DATOS
        for (int i = 0; i < temp.length; i++) {
            resultado += temp[i];
        }
        //DIVIDIMOS POR LA LONGITUD DEL VECTOR
        resultado /= temp.length;
        //MOSTRAMOS EL RESULTADO POR PANTALLA
        System.out.printf("El promedio de las 7 temperaturas máximas de la última semana es: %.1fºC", resultado);
    }
}