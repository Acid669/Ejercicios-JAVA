# Plataforma de Gestión de Eventos Académicos

Estoy desarrollando una plataforma para la gestión de eventos académicos en una universidad. El objetivo es crear una API RESTful utilizando Java con Spring Boot que permita a los usuarios ver eventos próximos, registrar nuevos eventos, inscribir participantes en eventos y obtener detalles específicos de un evento.

## Endpoints

### GET /eventos
Devuelve una lista de todos los eventos académicos próximos.

### GET /evento/{id}
Obtiene información detallada de un evento específico mediante su ID.

### POST /evento
Permite a los usuarios crear un nuevo evento académico y almacenarlo en una lista.

💡 **Nota:** Utilizar como base de datos una Collection a elección para evitar todavía la configuración de Bases de Datos.

## Pruebas con Postman

Realiza las pruebas utilizando Postman para verificar que cada uno de los endpoints funcione correctamente.

Al finalizar, exporta la colección de Postman que contiene las pruebas realizadas.