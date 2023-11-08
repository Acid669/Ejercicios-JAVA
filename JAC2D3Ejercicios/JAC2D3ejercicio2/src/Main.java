public class Main {
    public static void main(String[] args) {

        CadenaProduccion cadena = new CadenaProduccion();

        Thread trabajador1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 3000; i++) {
                    cadena.ensamblajeProducto();
                }
                System.out.println("Trabajador ha realizado: " + cadena.getContadorEnsamblaje() + " Ensamblajes");
            }
        });

        Thread trabajador2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 3000; i++) {
                    cadena.controlCalidad();
                }
                System.out.println("Trabajador ha realizado: " + cadena.getContadorControlCalidad() + " Controles de calidad");
            }
        });

        Thread trabajador3 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 3000; i++) {
                    cadena.embalarProducto();
                }
                System.out.println("Trabajador ha realizado: " + cadena.getContadorEmbalaje() + " Enbalajes");
            }
        });

        trabajador1.start();
        trabajador2.start();
        trabajador3.start();

        try {
            trabajador1.join();
            trabajador2.join();
            trabajador3.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}