import java.sql.SQLOutput;
import java.util.Scanner;

/*Ejercicio 2 - Tipos de Datos - Grupal

a) Crea un programa que declare una variable para cada uno de los siguientes tipos de datos: int, double, boolean y String. Asigna un valor a cada variable y muestra su contenido en la consola.

b) Ahora, asigna valores que no correspondan al tipo de dato. Por ejemplo, un int en un String o un String en un double… ¿Qué sucede con el programa? ¿Se produce algún error? ¿En qué situaciones se genera error y en cuáles no? Justificar el por qué de cada caso. Debatir con otros compañeros.*/
public class Main {
    public static void main(String[] args) {
//A)
        //DECLARACIÓN DE VARIABLES
        int num1;
        double num2;
        String palabra;
        boolean bandera;

        //HABILITAR ENTRADA DE DATOS
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce un numero entero");
        num1 = scanner.nextInt();

        System.out.println("Introduce un numero décimal");
        num2 = scanner.nextDouble();

        System.out.println("Introduce una palabra");
        palabra = scanner.next();

        System.out.println("Introduce una valor para la bandera");
        bandera = scanner.nextBoolean();


        System.out.println("Valor de num1: " + num1);
        System.out.println("Valor de num2: " + num2);
        System.out.println("Valor de palabra: " + palabra);
        System.out.println("Valor de banderas: " + bandera);

/*B)
        System.out.println("Introduce un numero entero");
        num1 = scanner.nextBoolean();

        System.out.println("Introduce un numero décimal");
        num2 = scanner.next();

        System.out.println("Introduce una palabra");
        palabra = scanner.nextInt();

        System.out.println("Introduce una valor para la bandera");
        bandera = scanner.nextDouble();
*/
    }
}
