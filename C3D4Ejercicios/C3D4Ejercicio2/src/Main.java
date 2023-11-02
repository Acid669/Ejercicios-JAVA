public class Main {
    public static void main(String[] args) {

//A)
        //Creamos el vector de tipo persona
        Persona[] personas = new Persona[5];

        personas[0] = new Persona(01, "Alberto", 28, " C/ Holanda 5", "64656565");
        personas[1] = new Persona(02, "Julia", 35, "C/ Alemania 10", "63261564");
        personas[2] = new Persona(03, "Antonio", 12, "C/ Suiza 32", "63685232");
        personas[3] = new Persona(04, "Lola", 46, "Av/ Europa 1", "65465482");
        personas[4] = new Persona(05, "Angel", 18, "C/ Londres 64", "63216354");

        System.out.println("**********************************");
        System.out.println("\t Lista de personas");
        System.out.println("**********************************");
//B
        //Recorremos el Vector persona con un for para mostrar la lista de objetos
        for (int i = 0; i < personas.length; i++) {
            System.out.println("Nombre: " + personas[i].getNombre() + "\t\t Edad: " + personas[i].getEdad());
        }

//C
        //Cambiamos dos nombres de dos objetos

        personas[0].setNombre("Tomas");
        personas[4].setNombre("Alex");
        System.out.println("**********************************");
        System.out.println("\t Lista actualizada");
        System.out.println("**********************************");
        //Recorremos el Vector persona con un for para mostrar la lista de objetos
        for (int i = 0; i < personas.length; i++) {
            System.out.println("Nombre: " + personas[i].getNombre() + "\t\t Edad: " + personas[i].getEdad());
        }

//D
        System.out.println("**********************************");
        System.out.println("\t Mayores de 30 años");
        System.out.println("**********************************");

        //Creamos un controlador de tipo boolean
        boolean perMayores30 = false;
        //Recorremos el Vector persona con un for para mostrar la lista de objetos
        for (int i = 0; i < personas.length; i++) {
            //Condicionamos que solo queremos los mayores de 30 años
            if (personas[i].getEdad() >= 30) {
                System.out.println("Nombre: " + personas[i].getNombre() + "\t\t Edad: " + personas[i].getEdad());
                perMayores30 = true;
            }
        }
        if (!perMayores30){
            System.out.println("No hay personas mayores de 30 años");
        }
    }
}