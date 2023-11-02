/*Ejercicio Nº 3 - Variables y Operadores - Individual

Escribe un programa que permita calcular el área de un triángulo y luego mostrar el resultado por pantalla.. Recuerda que la fórmula para calcular esto es: (base * altura) / 2 (base por altura dividido dos).

Pista: Debes declarar variables para la base y la altura del triángulo, asignarles valores y luego calcular el área utilizando la fórmula.
* */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //ASIGNACIÓN DE VARIABLES
        double altura = 4.5;
        double base = 7.9;
        double resultado;

        //CALCULOS
        resultado = (base * altura) / 2;

        System.out.println("El area del triángulo con base " + base + " y altura de " + altura + " es: " + resultado);
        System.out.printf("El area del triángulo con base " + base + " y altura de " + altura + " es: %.2f ", resultado);
    }
}