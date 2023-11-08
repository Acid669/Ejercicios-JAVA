public class Main {
    public static void main(String[] args) {

        try {
            //Intentamos crear instancias de la clase Producto
            Producto producto1 = new Producto("Kilo Patatas", 4.36, 36);
            Producto producto2 = new Producto("", 3.36, 50);
            Producto producto3 = new Producto("Kilo Acelgas", 0, 60);
            Producto producto4 = new Producto("Kilo Puerros", 2.36, 0); // Esta línea está comentada

        } catch (ProductoException e) {

            //En caso de que se lance una excepción de tipo ProductoException, la capturamos aquí
            System.out.println("Error al crear el producto: " + e.getMessage());
        }
    }
}