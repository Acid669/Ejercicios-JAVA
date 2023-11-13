
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {

        //Se crea una lista de empleados con nombres, categorías y salarios
        List<Empleado> empleados = Arrays.asList(new Empleado("Juan", 3000.0, "Desarrollador"),
                new Empleado("María", 3500.0, "Analista"),
                new Empleado("Pedro", 4000.0, "Gerente"),
                new Empleado("Luisa", 3200.0, "Desarrollador"),
                new Empleado("Ana", 3800.0, "Analista"),
                new Empleado("Carlos", 4200.0, "Gerente"),
                new Empleado("Sofía", 3100.0, "Desarrollador"),
                new Empleado("Javier", 3600.0, "Analista"),
                new Empleado("Laura", 4100.0, "Gerente"));

        //Filtra los empleados cuyo salario sea mayor a 4000
        List<Empleado> salarioMayor = empleados.stream()
                .filter(empleado -> empleado.getSalario() > 4000)
                .toList();

        //Calcula el promedio del salario de los Analistas
        double promedioAnalista = empleados.stream()
                .filter(empleado -> empleado.getCategoria().equalsIgnoreCase("Analista"))
                .mapToDouble(s -> s.getSalario())
                .average()
                .orElse(0.0);

        // Calcula el promedio del salario de los Gerentes
        double promedioGerente = empleados.stream()
                .filter(empleado -> empleado.getCategoria().equalsIgnoreCase("Gerente"))
                .mapToDouble(s -> s.getSalario())
                .average()
                .orElse(0.0);

        // Calcula el promedio del salario de los Desarrolladores
        double promedioDesarrollador = empleados.stream()
                .filter(empleado -> empleado.getCategoria().equalsIgnoreCase("Desarrollador"))
                .mapToDouble(s -> s.getSalario())
                .average()
                .orElse(0.0);

        //Encuentra al empleado con el salario más alto
        Optional<Empleado> empleadoMayorSueldo = empleados.stream()
                .max((o1, o2) -> Double.compare(o1.getSalario(), o2.getSalario()));

        //Salida de resultados por pantalla
        System.out.println("--------EMPLEADOS CUYO SALARIO SEA MAYOR A 4000------------");
        salarioMayor.forEach(empleado -> System.out.println("Los empleados con un sueldo mayor a 4000 son : " + empleado.getNombre() + " - " + empleado.getSalario() + "€"));
        System.out.println("------------PROMEDIO DE SALDO POR CATEGORIAS-------------- ");
        System.out.println("El promedio de el saldo de los analistas es: " + promedioAnalista + "€");
        System.out.println("El promedio de el saldo de los gerentes es: " + promedioGerente + "€");
        System.out.println("El promedio de el saldo de los desarrolladores es: " + promedioDesarrollador + "€");
        System.out.println("------------EMPLEADO CON MAYOR SALDO-------------- ");
        empleadoMayorSueldo.ifPresent(empleado -> System.out.println("El empleado con mayor salario es :" + empleado.getNombre() + " Salario: " + empleado.getSalario() + "€"));

    }
}