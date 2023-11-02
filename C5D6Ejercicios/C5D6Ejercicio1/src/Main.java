public class Main {
    public static void main(String[] args) {

        Animal animal1 = new Mamifero(01,"Tigre",20,"Pelo Corto","Carnivora",4,"Viviparo","Rayado","Selva");

        Animal animal2 = new Ave(02,"Aguila",10,"Plumaje", "Omnivora", 22, "Altura", "Marron", "Gancho");

        Animal animal3 = new Reptil(03, "Vibora", 3, "Escamas", "Carnivora", 30, "Escamas lisas","Hemotóxico","Bosque");
        Animal animal4 = animal1;


        System.out.println("**********Saludos**********");
        animal1.saludar();
        animal2.saludar();
        animal3.saludar();


        animal4.saludar();
        System.out.println("***************************");


    }
}