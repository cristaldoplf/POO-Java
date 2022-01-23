package FactoryYSingleton2;

import java.util.ArrayList;
import java.util.List;

public class Almacen {
    List<Producto> productos = new ArrayList<>();

    public double calcularEspacioNecesario(){
        return 0.0;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }
}
