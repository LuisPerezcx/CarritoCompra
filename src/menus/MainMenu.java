package menus;

import carrito.Compra;
import productos.OperacionesProducto;

import java.util.Comparator;
import java.util.Scanner;

public class MainMenu {
    OperacionesProducto operacionesProducto = new OperacionesProducto();
    Compra compra = new Compra();
    public void menu(Scanner scanner){
        int opc=1;
        while (opc!=0){
            opc = menuSelect(scanner);
            switch (opc){
                case 1 -> operacionesProducto.ingresarProducto(scanner);
                case 2 -> operacionesProducto.showList();
                case 3 -> compra.llenarCarrito(operacionesProducto,scanner);
            }
        }
    }
    private int menuSelect(Scanner scanner){
        System.out.println("""
                ---------------------------------------------\s
                Seleccione una opcion:\s
                1.- Ingresar Producto \s
                2.- Mostrar Productos\s
                3.- Comprar Producto\s
                pulsa 0 para salir
                """);
        int n=scanner.nextInt();
        scanner.nextLine();
        return n;
    }
}
