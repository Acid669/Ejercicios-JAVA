import java.util.Scanner;

/*
Ejercicio 1 - Estructuras Condicionales - Individual

a) Un recital permite únicamente el ingreso de mayores de 18 años. Para ello necesita un programa que, a partir de que un usuario ingrese su edad, determine mediante un mensaje en pantalla si la persona puede o no ingresar al evento. El programa debe mostrar (según cada caso) un mensaje informando la situación.

* */public class Main {
    public static void main(String[] args) {
        //DECLARACION DE VARIABLES
        int edad;

        //HABILITAR ENTRADA DE DATOS POR TECLADO
        Scanner scanner = new Scanner(System.in);

        //PREGUNTAR AL USUARIO Y ASIGNAR VALOR A LA VARIABLE
        System.out.println("Por favor ingres su edad, para verificar la entrada al recital");
        edad = scanner.nextInt();

        //ESTRUCTURA CONDICIONAL IF Y SALIDA POR PANTALLA
        if (edad < 18){
            System.out.println("El usuario tiene menos de 18 años, no puede pasar.");
        } else {
            System.out.println("El usuario tiene mas de 18 años, puede pasar.");
        }

    }
}