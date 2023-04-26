package productos;

import java.util.Scanner;

public abstract class Producto {
    String nombreProducto;
    int cantidadEnExistencia;
    double precio;

    public Producto(){

    }
    public Producto(String nombreProducto, int cantidadEnExistencia, double precio) {
        this.nombreProducto = nombreProducto;
        this.cantidadEnExistencia = cantidadEnExistencia;
        this.precio = precio;
    }
    @Override
    public String toString(){
        return "Nombre producto: " + nombreProducto + "\nCantidad en existecia: " + cantidadEnExistencia
                + "\nPrecio: $" + precio;
    }
    abstract int numRegistros(Scanner scanner);

    public String getNombreProducto() {
        return nombreProducto;
    }

    public double getPrecio() {
        return precio;
    }

    public int getCantidadEnExistencia() {
        return cantidadEnExistencia;
    }

    public void setCantidadEnExistencia(int cantidadEnExistencia) {
        this.cantidadEnExistencia = cantidadEnExistencia;
    }
}
