import java.time.LocalDate;
import java.time.Period;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;


public class Main {
    public static void main(String[] args) {

        //Creación de una lista de eventos
        List<Eventos> eventos = Arrays.asList(new Eventos("Reunión de Equipo", LocalDate.of(2023, 11, 13), "Reunión"),
                new Eventos("Tech Summit", LocalDate.of(2023, 12, 5), "Conferencia"),
                new Eventos("Crecimiento Interior", LocalDate.of(2023, 12, 8), "Taller"),
                new Eventos("Mejorando Ventas", LocalDate.of(2023, 11, 13), "Reunión"),
                new Eventos("Lanzamiento Nuevo Producto", LocalDate.of(2023, 12, 10), "Conferencia"),
                new Eventos("Planificación Anual", LocalDate.of(2023, 12, 15), "Reunión"),
                new Eventos("Estrategias Digitales", LocalDate.of(2023, 12, 8), "Conferencia"),
                new Eventos("Creatividad en Acción", LocalDate.of(2023, 11, 13), "Taller"),
                new Eventos("Revisión Q4", LocalDate.of(2023, 12, 18), "Reunión"),
                new Eventos("RVida Saludable", LocalDate.of(2023, 11, 27), "Reunión"));


        System.out.println("-------------EVENTOS EN LA FECHA 08/12/2023---------------");

        //Filtrar eventos por fecha específica
        List<Eventos> eventosEnFecha = eventos.stream()
                .filter(e -> e.getFecha().isEqual(LocalDate.of(2023, 12, 8)))
                .toList();

        eventosEnFecha.forEach(System.out::println);

        //Contar eventos por categoría
        long numeroEventosConferencia = eventos.stream()
                .filter(e -> e.getCategoria().equalsIgnoreCase("Conferencia"))
                .count();

        long numeroEventosTaller = eventos.stream()
                .filter(e -> e.getCategoria().equalsIgnoreCase("Taller"))
                .count();

        long numeroEventosReunion = eventos.stream()
                .filter(e -> e.getCategoria().equalsIgnoreCase("Reunión"))
                .count();

        System.out.println("-------------CONTABILIZACION DE EVENTOS POR CATEGORIA---------------");
        System.out.println("El numero total de eventos de categoria Conferencia es: " + numeroEventosConferencia);
        System.out.println("El numero total de eventos de categoria Taller es: " + numeroEventosTaller);
        System.out.println("El numero total de eventos de categoria Reunión es: " + numeroEventosReunion);

        //Encontrar el evento más cercano
        Optional<Eventos> eventosProximos = eventos.stream()

                //Se utiliza el mínimo con un comparador que calcula la diferencia en días entre la fecha actual y la fecha del evento
                .min(Comparator.comparing(e -> Period.between(LocalDate.now(), e.getFecha()).getDays()));

        System.out.println("-------------EVENTO PROXIMO---------------");
        System.out.println(eventosProximos.get());

    }
}