

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RegistroMascotas<T extends Mascota> {

    //Lista de mascotas del registro
    private List<Mascota<T>> registro;

    //Constructor que inicializa la lista de mascotas
    public RegistroMascotas() {
        this.registro = new ArrayList<>();
    }

    public List<Mascota<T>> getRegistro() {
        return registro;
    }

    //Metodo de agregar mascota
    public void agregarMascota(Mascota<T> mascota) {
        registro.add(mascota);
    }

    //metodo para buscar por nombre mascota
    public List<Mascota<T>> buscarPornombre(String nombre) {
        List<Mascota<T>> mascotaEncontrada = new ArrayList<>();
        for (Mascota<T> mascota : registro) {
            if (mascota.getNombre().equalsIgnoreCase(nombre)) {
                mascotaEncontrada.add(mascota);
            }
        }
        return mascotaEncontrada;
    }

    //metodo para buscar por especie mascota
    public List<Mascota<T>> buscarPorEspecie(String especie) {
        List<Mascota<T>> mascotaEncontrada = new ArrayList<>();
        for (Mascota<T> mascota : registro) {
            if (mascota.getEspecie().equals(especie)) {
                mascotaEncontrada.add(mascota);
            }
        }
        return mascotaEncontrada;
    }

    //metodo para contar la cantidad de mascotas
    public int contarMascotas() {
        return registro.size();
    }

    //Metodo para insertar datos Random

    public Mascota<String> generarDatosAleatorios() {
        Random ramdom = new Random();
        long idAleatorio = ramdom.nextLong(1000) + 1;
        String[] nombres = {"Pelusa", "Chispa", "Nacho", "Lola", "Pancho", "Mochi", "Frida", "Bruno", "Nala", "Simba"};
        String nombreAleatorio = nombres[ramdom.nextInt(nombres.length)];
        String[] especie = {"Perro", "Gato", "Reptil", "Ave"};
        String especieAleatorio = especie[ramdom.nextInt(especie.length)];
        int edadAleatorio = ramdom.nextInt(1) + 1;

        return new Mascota<String>(idAleatorio, nombreAleatorio, edadAleatorio, especieAleatorio);
    }
}
