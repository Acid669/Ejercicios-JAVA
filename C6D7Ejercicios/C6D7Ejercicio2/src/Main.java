import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        double precioMasAlto = Double.MIN_VALUE;
        double precioMasBajo = Double.MAX_VALUE;
        int stockMasAlto = 0;
        int cantidad;
        Producto productoMayorStock = null;

        List<Producto> listaProductos = new ArrayList<>();
        listaProductos.add(new Producto("P001", "Teléfono", "Samsung", "Smartphone", 250, 399, 50));
        listaProductos.add(new Producto("P002", "Laptop", "HP", "Portátil", 600, 899, 30));
        listaProductos.add(new Producto("P003", "Auriculares", "Sony", "Inalámbricos", 50, 89, 100));
        listaProductos.add(new Producto("P004", "Cargador", "Anker", "USB-C", 10, 19, 200));
        listaProductos.add(new Producto("P005", "Tablet", "Apple", "iPad", 300, 499, 40));
        listaProductos.add(new Producto("P006", "Televisor", "Samsung", "Smart TV", 500, 799, 25));
        listaProductos.add(new Producto("P007", "Impresora", "Canon", "Inyección de tinta", 80, 129, 60));
        listaProductos.add(new Producto("P008", "Mouse", "Logitech", "Inalámbrico", 15, 29, 150));
        listaProductos.add(new Producto("P009", "Altavoces", "Bose", "Bluetooth", 70, 129, 75));
        listaProductos.add(new Producto("P010", "Teclado", "Microsoft", "USB", 20, 39, 100));


        for (Producto producto : listaProductos) {

            //Producto con mayor precio venta
            if (producto.getPrecioVenta() > precioMasAlto) {
                precioMasAlto = producto.getPrecioVenta();
            }
            //El producto con el menor precio de venta
            if (producto.getPrecioVenta() < precioMasBajo) {
                precioMasBajo = producto.getPrecioVenta();
            }
            //El producto con el mayor stock
            if (producto.getStock() > stockMasAlto){
                stockMasAlto = producto.getStock();
            }

        }

        if (precioMasAlto > Double.MIN_VALUE) {
            System.out.println("El producto con el mayor precio de venta es: " + precioMasAlto);
        } else {
            System.out.println("No hay productos en la lista.");
        }

        if (precioMasBajo < Double.MAX_VALUE) {
            System.out.println("El producto con el menor precio de venta es: " + precioMasBajo);
        } else {
            System.out.println("No hay productos en la lista.");
        }

        listaProductos.remove(5);

        if (stockMasAlto > 0) {
            System.out.println("El producto con el mayor stock de producto es: " + stockMasAlto);
            int nuevostock = stockMasAlto -3;
            System.out.println("Producto Actualizado");
            System.out.println("El producto con el mayor stock de producto es: " + nuevostock);
        } else {
            System.out.println("No hay stock del producto.");
        }
    }
}
