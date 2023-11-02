public class Electrodomestico {

    //Atributos
    private String cod;
    private String marca;
    private String modelo;
    private String consumo;
    private String color;

    //Contructores
    //Constructor vacio sin atributos
    public Electrodomestico() {
    }

    //Constructor con atributos
    public Electrodomestico(String cod, String marca, String modelo, String consumo, String color) {
        this.cod = cod;
        this.marca = marca;
        this.modelo = modelo;
        this.consumo = consumo;
        this.color = color;
    }

    //Getters y Setters
    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getConsumo() {
        return consumo;
    }

    public void setConsumo(String consumo) {
        this.consumo = consumo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    //Metodo to String para que imprima los datos

    @Override
    public String toString() {
        return "Electrodomestico {" +
                "cod=" + cod +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", consumo='" + consumo + '\'' +
                '}';
    }
}
