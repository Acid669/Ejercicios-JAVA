public class Auto {


    //Atributos
    public String modelo;
    public String marca;
    public double precio;
    public int anyo;

    //Cosntructor
    public Auto(String modelo, String marca, double precio, int anyo) {
        this.modelo = modelo;
        this.marca = marca;
        this.precio = precio;
        this.anyo = anyo;
    }

    public String getModelo() {
        return modelo;
    }

    public String getMarca() {
        return marca;
    }

    public double getPrecio() {
        return precio;
    }

    public int getAnyo() {
        return anyo;
    }

    @Override
    public String toString() {
        return marca + " " + modelo + " (" + anyo + ") - $" + precio;
    }
}
