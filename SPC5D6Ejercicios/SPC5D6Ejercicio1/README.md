# Ejercicio Nº 1: API de Gestión de Estudiantes

## Descripción del Ejercicio

Crear una API que gestione los datos de estudiantes de una universidad y devuelva una lista ordenada según su rendimiento académico en la materia "Programación I", calculado como el promedio de sus calificaciones. Implementar una arquitectura de múltiples capas, destacando la capa de servicio para procesar y analizar los datos de los estudiantes.

## Datos del Estudiante

Cada estudiante tiene los siguientes datos:

- `num_matricula`: Número de matrícula del estudiante.
- `nombre`: Nombre del estudiante.
- `apellido`: Apellido del estudiante.
- `fecha_nacimiento`: Fecha de nacimiento del estudiante.

## Clase Calificacion

La clase `Calificacion` almacena las calificaciones de un estudiante en la materia "Programación I" y su promedio. Cada estudiante tiene un único registro de calificaciones asociado. Los datos que se almacenan son:

- `id`: Identificador único de la calificación.
- `calificacion1`, `calificacion2`, `calificacion3`: Calificaciones obtenidas en los exámenes de la materia "Programación I".
- `promedio`: Promedio de las calificaciones.
- `alumno`: Referencia al estudiante asociado.

## Endpoints de la Capa Controller

- `GET /estudiantes`: Devuelve una lista de todos los estudiantes sin un orden particular.
- `GET /calificaciones/{num_matricula}`: Devuelve las calificaciones de un determinado estudiante.
- `GET /calificaciones/ordendesc`: Devuelve las calificaciones de todos los estudiantes, junto con el nombre de cada uno de ellos ordenados de forma descendente (mayor calificación primero, menor a lo último).