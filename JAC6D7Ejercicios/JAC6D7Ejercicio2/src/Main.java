import java.util.List;

public class Main {
    public static void main(String[] args) {

        RegistroMascotas registroMascotas = new RegistroMascotas<>();

        registroMascotas.agregarMascota(new Mascota<>(1, "Logan", 11, "Gato"));
        registroMascotas.agregarMascota(new Mascota<>(2, "Oni", 5, "Reptil"));
        registroMascotas.agregarMascota(new Mascota<>(3, "Bella", 3, "Perro"));
        registroMascotas.agregarMascota(new Mascota<>(4, "Tomás", 1, "Gato"));
        registroMascotas.agregarMascota(new Mascota<>(5, "Pepita", 5, "Ave"));
        registroMascotas.agregarMascota(new Mascota<>(6, "Rocky", 2, "Perro"));
        registroMascotas.agregarMascota(new Mascota<>(7, "Serpi", 4, "Reptil"));
        registroMascotas.agregarMascota(new Mascota<>(8, "Miau", 6, "Gato"));
        registroMascotas.agregarMascota(new Mascota<>(9, "Toby", 3, "Perro"));
        registroMascotas.agregarMascota(new Mascota<>(10, "Piolín", 1, "Ave"));



        System.out.println("------------LISTADO MASCOTAS------------");
        List<Mascota<String>> mascotaList = registroMascotas.getRegistro();
        mascotaList.forEach(p -> System.out.println("ID: " + p.getId() + ", Nombre: " + p.getNombre()
                + ", Edad: " + p.getEdad() + ", Especie: " + p.getEspecie()));

        System.out.println("------------MASCOTA GENERADA ALEATORIA------------");
        Mascota nuevaMascota = registroMascotas.generarDatosAleatorios();
        registroMascotas.agregarMascota(nuevaMascota);

        System.out.println("ID: " + nuevaMascota.getId() + ", Nombre: " + nuevaMascota.getNombre()
                + ", Edad: " + nuevaMascota.getEdad() + ", Especie: " + nuevaMascota.getEspecie());

        System.out.println("------------BUSQUEDA MASCOTA POR NOMBRE 'LOGAN'------------");
        List<Mascota<String>> busquedaPorNombre = mascotaList.stream()
                .filter(m -> m.getNombre().equalsIgnoreCase("Logan"))
                .toList();

        busquedaPorNombre.forEach(p -> System.out.println("ID: " + p.getId() + ", Nombre: " + p.getNombre()
                + ", Edad: " + p.getEdad() + ", Especie: " + p.getEspecie()));

        System.out.println("------------BUSQUEDA MASCOTA POR ESPECIE 'REPTIL'------------");
        List<Mascota<String>> busquedaPorEspecie = mascotaList.stream()
                .filter(p->p.getEspecie().equalsIgnoreCase("Reptil"))
                .toList();

        busquedaPorEspecie.forEach(p-> System.out.println("ID: " + p.getId() + ", Nombre: " + p.getNombre()
                + ", Edad: " + p.getEdad() + ", Especie: " + p.getEspecie()));


        System.out.println("------------TOTAL MASCOTAS REGISTRADAS------------");
        System.out.println(registroMascotas.contarMascotas());
    }
}
