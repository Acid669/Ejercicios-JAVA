/*Ejercicio Nº 1 - Sintaxis básica - Individual

a) Escribir un programa en Java que muestre por pantalla un mensaje de Bienvenida a un usuario. Por ejemplo: “Hola, bienvenido al sistema”.

b) Una vez logrado esta primera parte, permitir que se almacene el nombre del usuario en una variable y se muestre el mismo en el mensaje. Por ejemplo: “Hola Eduardo, bienvenida al sistema”.
* */


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        //DECLARACIÓN DE VARIABLE
        String nombre;

        //HABILITAR ENTRADA DE DATOS POR SISTEMA
        Scanner scanner = new Scanner(System.in);

        //A)
        //SALUDO DEL SISTEMA
        System.out.println("Hola, bienvenido al sistema");

        //B)
        //PREGUNTAR AL USUARIO Y ASIGNACIÓN DE VARIABLES
        System.out.println("Por favor, Ingrese un nombre");
        nombre = scanner.nextLine();

        //SALIDA POR PANTALLA
        System.out.println("Hola " + nombre + " , bienvenido al sistema");

    }
}