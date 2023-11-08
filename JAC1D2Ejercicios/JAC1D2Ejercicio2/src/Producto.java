public class Producto {

    //Atributos
    private String nombreProducto;
    private double precioProducto;
    private int stockProducto;

    //Constructor vacio
    public Producto() {
    }

    //Cosntrucrtor con atributos que puede lanzar una exception
    public Producto(String nombreProducto, double precioProducto, int stockProducto) throws ProductoException {

        //Si al ingresar el producto; el nombre del producto es null o esta vacio saldría este mensaje
        if (nombreProducto  == null || nombreProducto.isEmpty()){
            throw new ProductoException("El nombre del producto no puede estar vacío");
        }

        //Si al ingresar el producto; El precio del producto es 0 o menor saldría este mensaje
        if (precioProducto <= 0){
            throw new ProductoException("El precio del producto debe ser mayor que cero");
        }

        //Si al ingresar el producto; El stock es 0 saldría este mensaje
        if (stockProducto <= 0){
            throw new ProductoException("La cantidad de productos debe ser mayor que cero");
        }
        this.nombreProducto = nombreProducto;
        this.precioProducto = precioProducto;
        this.stockProducto = stockProducto;
    }

}
