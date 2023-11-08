public class LLamadasEspera {

    //Atributos
    private int  listaEspera;

    //Constructor
    public LLamadasEspera(int listaEspera) {
        this.listaEspera = listaEspera;
    }

    public int getListaEspera() {
        return listaEspera;
    }

    public synchronized void aceptarLLamada(int llamada){
        listaEspera -= llamada;
    }

    public synchronized void resolver(){
        try {
            wait(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public synchronized void registrar(){
        try {
            wait(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }


}
