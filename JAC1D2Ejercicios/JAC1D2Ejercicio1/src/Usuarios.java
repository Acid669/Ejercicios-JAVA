import java.time.LocalDate;

public class Usuarios {


    //Atributos
    private String nombre;
    private String destino;
    private LocalDate fecha;
    private int asientos;

    //Constructores
    //Cosntructor vacio
    public Usuarios() {
    }

    //Constructor con parámetros que puede lanzar una excepción
    public Usuarios(String nombre, String destino, LocalDate fecha, int asientos) throws ReservaInvalidaException {

        LocalDate fechaActual = LocalDate.now();
        int asientosDisponibles = 3;
        if (nombre == null || nombre.isEmpty() || destino == null || destino.isEmpty() || fecha == null || fecha.isBefore(fechaActual)) {

            //Si los datos no son válidos, lanzar una excepción
            throw new ReservaInvalidaException("Los datos estan vacios o son invalidos");
        }
        if (asientos > asientosDisponibles) {
            //Si la cantidad de asientos solicitados es mayor que los disponibles, mostrar un mensaje
            System.out.println("No hay suficientes asientos disponibles");
        } else {
            // Si todos los datos son correctos y hay suficientes asientos, mostrar un mensaje de reserva realizada
            System.out.println("Reserva Realizada");
        }
        this.asientos = asientos;
        this.nombre = nombre;
        this.destino = destino;
        this.fecha = fecha;
    }

}
