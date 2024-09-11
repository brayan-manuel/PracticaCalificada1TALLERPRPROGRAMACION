package BrayanCuivin;
import java.util.Scanner;
public class Ejercisio01PC1 {
     public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        
        // Declaración de variables
        int venta1, venta2, venta3, venta4, venta5, venta6;
        int totalVentas;
        double promedioVentas;

        // Entrada de datos
        System.out.print("Ingresa la venta 1: ");
        venta1 = lectura.nextInt();
        
        System.out.print("Ingresa la venta 2: ");
        venta2 = lectura.nextInt();
        
        System.out.print("Ingresa la venta 3: ");
        venta3 = lectura.nextInt();
        
        System.out.print("Ingresa la venta 4: ");
        venta4 = lectura.nextInt();
        
        System.out.print("Ingresa la venta 5: ");
        venta5 = lectura.nextInt();
        
        System.out.print("Ingresa la venta 6: ");
        venta6 = lectura.nextInt();

        // Proceso: Calcular el total y el promedio de las ventas
        totalVentas = venta1 + venta2 + venta3 + venta4 + venta5 + venta6;
        promedioVentas = totalVentas / 6.0;

        // Salida de datos
        System.out.println("Total de ventas: " + totalVentas);
        System.out.println("Promedio de ventas: " + promedioVentas);
    }
}
