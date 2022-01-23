package FactoryYSingleton2;

public class ProductoFactory {

    private static ProductoFactory instance = null;

    private ProductoFactory() {

    }

    public static ProductoFactory getInstance() {
        if (instance == null) {
            instance = new ProductoFactory();
        }
        return instance;
    }

    public Producto crearProducto(String tipo):


}
