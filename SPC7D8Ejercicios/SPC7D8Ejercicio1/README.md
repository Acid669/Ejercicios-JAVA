# Ejercicio Nº 1: Venta de Autos

## Descripción

Una concesionaria de automóviles desea realizar un API REST para gestionar la carga de autos usados. Se requiere
desarrollar varios endpoints para manejar diferentes operaciones.

## Endpoints a Desarrollar

| N° | Endpoint              | Método | Descripción                                              |
|----|-----------------------|--------|----------------------------------------------------------|
| 1  | `api/vehicles/`       | POST   | Agrega un nuevo automóvil.                               |
| 2  | `api/vehicles/`       | GET    | Retorna un listado de todos los autos seleccionados.     |
| 3  | `api/vehicles/prices` | GET    | Muestra el listado de vehículos por precio (ascendente). |
| 4  | `api/vehicles/{id}`   | GET    | Muestra toda la información de un auto en particular.    |

## Recomendaciones

- **Buenas Prácticas de Programación:** Se sugiere seguir buenas prácticas como la separación del proyecto según la
  Arquitectura Multicapas.
- **Manejo de Datos:** Aunque no se trabaje con bases de datos, se pueden usar colecciones (listas, arraylists, etc.)
  para manejar los CRUD de manera lógica. Los datos deben ser cargados desde la capa REPOSITORY.

## Ejemplo de Payload para POST

```json
{
  
"brand":"Peugeot",
"model":"206",
"kilometers":"150000",
"doors":5,
"price":7500,

}
