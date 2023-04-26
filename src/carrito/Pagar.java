package carrito;

import java.util.Scanner;

public class Pagar {
    double iva = 1.16;
    double comision=0.5;
    public void opPagar(Scanner scanner,double subtotal){
        int op = menuPagar(scanner);
        switch (op){
            case 1 -> efectivo(subtotal);
            case 2 -> System.out.println("a");
        }

    }
    private void efectivo(double subtotal){
        double total = iva*subtotal;
        System.out.println("Subtotal: " + subtotal);
        System.out.println("Total (+ iva):"+total);
    }
    private void tarjeta(double subtotal){
        if(subtotal<80){
            efectivo(subtotal);
        }else{
            double totaliva = iva*subtotal;
            double total = (totaliva*comision)/100;
            System.out.println("Total (+ iva + comision):"+total);
        }
    }
    private int menuPagar(Scanner scanner){
        System.out.println("""
                Seleccione una opcion de pago :\s
                1.- Efectivo \s
                2.- Tarjeta\s
                """);
        int n=scanner.nextInt();
        scanner.nextLine();
        return n;
    }
}
