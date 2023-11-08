public class Main {
    public static void main(String[] args) {

        //Creamos una instancia del recurso compartido
        LLamadasEspera lLamada = new LLamadasEspera(10);

        //Indicamos el numero de llamadas en espera
        System.out.println("LLamadas en espera: " + lLamada.getListaEspera());

        //Creamos los hilos que será cada agente.
        Thread agente1 = new Thread(new Agente(lLamada,"Martin"));
        Thread agente2 = new Thread(new Agente(lLamada,"Alberto"));
        Thread agente3 = new Thread(new Agente(lLamada,"Maria"));

        //Ejecutamos los hilos
        agente1.start();
        agente2.start();
        agente3.start();
    }
}