# Ejercicio 1: Exploración de Directorios
Crea un programa que simule la exploración recursiva de directorios en el sistema de archivos de un sistema operativo utilizando una estructura de datos propia.

Emplea una estructura donde cada nodo representa un directorio y contiene referencias a sus subdirectorios.

El programa debe realizar una exploración simulada para mostrar la jerarquía de directorios y archivos.



Pistas:

Puedes utilizar una clase Directorio para cada una de las carpetas/directorios que contenga como datos: id, nombre, listaSubdirectorios, listaArchivos





*     class Directorio {
*     String nombre;
*     List<Directorio> subdirectorios;
*     List<String> archivos;


 

*   Puedes utilizar una clase "ExploradorDirectorios" con un método "explorarDirectorio" que sirva para la recursividad.