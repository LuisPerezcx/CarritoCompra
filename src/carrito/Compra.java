package carrito;

import productos.OperacionesProducto;

import java.util.ArrayList;
import java.util.Scanner;

public class Compra {
    Pagar pagar = new Pagar();
    double cuenta = 0 ;
    public void llenarCarrito(OperacionesProducto productos,Scanner scanner){
        productos.showList();
        ArrayList<OperacionesProducto> carrito = new java.util.ArrayList<>();
        checkProduct(scanner,productos,carrito);

    }

    private void checkProduct(Scanner scanner,OperacionesProducto productos,ArrayList<OperacionesProducto> carrito){
        int x=0;
        ArrayList<OperacionesProducto> item = productos.requestList();
        String nombre="1";
        while(!nombre.equals("Pagar")){
            System.out.println("escribe 'Pagar' para proceder al pago o Escribe el nombre del producto a comprar");
            nombre = scanner.nextLine();
            while (!nombre.equals(item.get(x).getNombreProducto()) && !nombre.equals("Pagar")){
                x++;
                if(x>=item.size()){
                    System.out.println("--NO SE ENCONTRO EL PRODUCTO--");
                    break;
                }
            }
            if(item.get(x).getCantidadEnExistencia()>0 && !nombre.equals("Pagar")){
                carrito.add(item.get(x));
                System.out.println(nombre + " agregado al carrito");
                OperacionesProducto actual = item.get(x);
                int existencia = item.get(x).getCantidadEnExistencia();
                actual.setCantidadEnExistencia(existencia-1);
                cuenta+=actual.getPrecio();
            }else if (!nombre.equals("Pagar")){
                System.out.println("No hay stock de ese productop");
            }
        }
        pagar.opPagar(scanner,cuenta);
    }
}
