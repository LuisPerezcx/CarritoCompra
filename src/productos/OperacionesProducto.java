package productos;

import java.util.ArrayList;
import java.util.Scanner;

public class OperacionesProducto extends Producto{

    ArrayList<OperacionesProducto> productoArrayList;
    public void ingresarProducto(Scanner scanner){
        int n = numRegistros(scanner);
        productoArrayList = new java.util.ArrayList<>();
        for (int i = 0; i < n; i++) {
            System.out.println("ingresa Nombre Producto:");
            String nombre = scanner.nextLine();
            System.out.println("ingresa Precio:");
            double precio = scanner.nextDouble();
            scanner.nextLine();
            System.out.println("ingresa cantidad en existencia:");
            int existecia = scanner.nextInt();
            OperacionesProducto producto = new OperacionesProducto(nombre,existecia,precio);
            productoArrayList.add(producto);
        }
    }
    public void showList(){
        if (productoArrayList==null){
            System.out.println("nada ingresado");
            return;
        }
        for (OperacionesProducto producto : productoArrayList) {
            System.out.println(producto);
        }
    }
    public ArrayList<OperacionesProducto> requestList(){
        if(productoArrayList==null)
            return null;
        return productoArrayList;
    }
    public OperacionesProducto(){

    }
    public OperacionesProducto(String nombreProducto, int cantidadEnExistencia, double precio) {
        super(nombreProducto, cantidadEnExistencia, precio);
    }
    @Override
    int numRegistros(Scanner scanner) {
        System.out.println("Cantos productos deseas registrar");
        int n = scanner.nextInt();
        scanner.nextLine();
        return n;
    }
}
