# Ejercicio Nº 1 - JDBC - Individual

Crear una aplicación para gestionar una lista de estudiantes en una base de datos. Los estudiantes tendrán atributos como id, nombre, edad y calificación.

* El sistema debe ser capaz de permitir agregar nuevos estudiantes, recuperar la lista de todos y mostrar su información.


* Crear una base de datos mediante MySQL llamada universidad y una tabla llamada estudiantes cuyas columnas coincidan con los atributos de la clase estudiante.


* Utilizar JDBC (Java Database Connectivity) para interactuar con la base de datos.


*   BBDD universidad


  *   Tabla


      CREATE TABLE `estudiantes` (
      `id` int(11) NOT NULL AUTO_INCREMENT,
      `nombre` varchar(45) DEFAULT NULL,
      `edad` int(11) DEFAULT NULL,
      `calificacion` int(11) DEFAULT NULL,
      PRIMARY KEY (`id`)) ;