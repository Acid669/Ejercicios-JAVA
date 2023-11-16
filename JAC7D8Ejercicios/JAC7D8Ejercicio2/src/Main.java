public class Main {
    public static void main(String[] args) {


        //Creamos las tareas principales
        Tarea tareaDisenyo = new Tarea("Diseño aplicacion");
        Tarea tareaImplementacion = new Tarea("Implementación codigo");
        Tarea tareaPruebas = new Tarea("Pruebas y depuración");

        //Agregamos subtareas a las tareas de Diseño
        tareaDisenyo.agregarSubtarea(new Tarea("Crear Prototipo"));
        tareaDisenyo.agregarSubtarea(new Tarea("Documentar Requisitos"));
        //Creamos una subtarea (nueva tarea) que contendra una sub subtarea
        Tarea tareaDisenyarInterfaz = new Tarea("Diseñar Interfaz");
        //La agregamos a las subtareas
        tareaDisenyo.agregarSubtarea(tareaDisenyarInterfaz);
        //Definimos las sub sub tareas de la subtarea tareaDisenyarInterfaz
        tareaDisenyarInterfaz.agregarSubtarea(new Tarea("Definir Esquema de Colores"));
        tareaDisenyarInterfaz.agregarSubtarea(new Tarea("Diseñar Diseño Responsivo"));


        //Agregamos subtareas a la tarea de Implementación
        Tarea tareaDesarrollarBackend = new Tarea("Desarrollar Backend");
        tareaDesarrollarBackend.agregarSubtarea(new Tarea("Configurar Base de Datos"));
        tareaDesarrollarBackend.agregarSubtarea(new Tarea("Crear Lógica de Negocios"));

        Tarea tareaDesarrollarFrontend = new Tarea("Desarrollar Frontend");
        tareaDesarrollarFrontend.agregarSubtarea(new Tarea("Codificar Interfaz de Usuario"));
        tareaDesarrollarFrontend.agregarSubtarea(new Tarea("Integrar con Backend"));

        tareaImplementacion.agregarSubtarea(tareaDesarrollarBackend);
        tareaImplementacion.agregarSubtarea(tareaDesarrollarFrontend);

        // Agregamos subtareas a la tarea de Pruebas
        tareaPruebas.agregarSubtarea(new Tarea("Ejecutar Pruebas de Integración"));
        tareaPruebas.agregarSubtarea(new Tarea("Solucionar Errores"));

        // Mostramos la estructura de tareas
        System.out.println("\nEstructura de Tareas:");

        // Mostramos la estructura de cada tarea principal
        tareaDisenyo.mostrarEstructura(0);
        tareaImplementacion.mostrarEstructura(0);
        tareaPruebas.mostrarEstructura(0);

    }
}