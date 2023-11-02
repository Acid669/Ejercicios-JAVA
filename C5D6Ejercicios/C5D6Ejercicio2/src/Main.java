public class Main {
    public static void main(String[] args) {

        //Creamos un vector de tipo Vestimenta
        Vestimenta[] vestimentas = new Vestimenta[9];

        //Asignamos los objetos al cada hueco del vector
        vestimentas[0] = new Zapato(1, "Summits-brisbane", 54.99, "Skechers", "42-44", "Negro", "Tela", "Cordones");
        vestimentas[1] = new Zapato(2, "Urban Hiker Boots", 64.99, "Timberland", "41-43", "Marrón", "Cuero", "Hebilla");
        vestimentas[2] = new Zapato(3, "Running Light Sneakers", 49.99, "Nike", "39-45", "Azul", "Malla", "Cordones");
        vestimentas[3] = new Pantalon(4, "Jeans Clásicos", 29.99, "Levi's", "M", "Azul", "Jeans", "Denim");
        vestimentas[4] = new Pantalon(5, "Pantalón Deportivo", 39.99, "Adidas", "L", "Negro", "Deportivo", "Poliéster");
        vestimentas[5] = new Pantalon(6, "Pantalones Casuales", 24.99, "H&M", "XL", "Gris", "Casual", "Algodón");
        vestimentas[6] = new Camiseta(7, "Camiseta Rayas", 14.99, "H&M", "S", "Blanco", "Corta", "Redondo");
        vestimentas[7] = new Camiseta(8, "Camiseta Deportiva", 19.99, "Nike", "M", "Negro", "Manga larga", "Cuello en V");
        vestimentas[8] = new Sombrero(9, "Sombrero Playa", 19.99, "Brixton", "XL", "Beige", "Sombrero de ala ancha", "L");

        //Recorrer el vector con for y utilizar el metodo para mostrar la info
        for (int i = 0; i < vestimentas.length; i++) {
            vestimentas[i].mostrarAtributo();
        }
    }
}