public class Agente extends Thread{

    //atributos
    private LLamadasEspera llamada;
    private String nombre;


    //cosntructor
    public Agente(LLamadasEspera llamada, String nombre) {
        this.llamada = llamada;
        this.nombre = nombre;
    }

    //Metodo que emula aceptar una llamada de un recurso compartido Llamadas y ejecucion de las demas opciones
    @Override
    public void run() {
        for (int i = 0; i < llamada.getListaEspera(); i++) {
            System.out.println(nombre+": Aceptando llamada...");
            llamada.aceptarLLamada(i);
            System.out.println(nombre+": Resolviendo consulta...");
            llamada.resolver();
            System.out.println(nombre+": Registrando información...");
            llamada.registrar();
        }
    }
}
