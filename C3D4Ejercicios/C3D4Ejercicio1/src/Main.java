public class Main {
    public static void main(String[] args) {


        //Creamos los objetos
        //A)
        Electrodomestico electrodomestico1 = new Electrodomestico("M023", "Balay", "M203", "20,5 kWh", "Blanco");
        Electrodomestico electrodomestico2 = new Electrodomestico("M012", "Fagor", "C892", "21,25 kWh", "Plata");
        Electrodomestico electrodomestico3 = new Electrodomestico("M122", "Bosch", "B059", "12 kWh", "Negro");
        //B)
        Electrodomestico electrodomestico4 = new Electrodomestico();

        //C)
        System.out.println("Codigo: " + electrodomestico1.getCod() + " , Marca:" + electrodomestico1.getModelo() + " , Consumo: " + electrodomestico1.getConsumo());
        System.out.println(electrodomestico2.toString());
        System.out.println(electrodomestico3.toString());

        //D)
        System.out.println(electrodomestico4.getModelo());
    }
}