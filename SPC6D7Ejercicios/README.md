# Ejercicio Nº 1: API de Restaurante con Patrón DTO

## Descripción del Ejercicio
Un restaurante necesita una API que proporcione información detallada sobre las calorías de los platos de su menú.

### Datos Almacenados
El restaurante almacena en una base de datos lógica los siguientes datos:

- **Platos**:
    - `codigo_plato`
    - `nombre`
    - `precio`
    - `lista_Ingredientes`

- **Ingredientes**:
    - `codigo_ingrediente`
    - `nombre`
    - `cantidad_calorias`

### Funcionalidad de la API
La API debe recibir el nombre de un plato como parámetro y devolver:

- La cantidad total de calorías del plato completo.
- Una lista de ingredientes que componen el plato, junto con la cantidad de calorías de cada uno. La sumatoria de estas calorías debería dar la cantidad total de calorías del plato.
- El ingrediente con la mayor cantidad de calorías en el plato.

### Uso del Patrón DTO
Utilizar el patrón DTO para las respuestas de la API.

### Datos Adicionales
El dueño del restaurante proporcionó dos archivos `.json` con datos de los platos del menú y la lista completa de ingredientes. Utilizar ambos archivos como base de datos lógica del sistema. Cargar los datos del JSON a la aplicación y almacenar los datos en colecciones.
