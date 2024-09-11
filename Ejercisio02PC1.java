package BrayanCuivin;
import java.util.Scanner;
public class Ejercisio02PC1 {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        
        // Declaración de variables
        double va, i, vf, I;
        int n;

        // Entrada de datos
        System.out.print("Ingresa el capital inicial: ");
        va = lectura.nextDouble();
        
        System.out.print("Ingresa la tasa de interes (%): ");
        i = lectura.nextDouble();
        
        System.out.print("Ingresa el tiempo en meses: ");
        n = lectura.nextInt();

        // Proceso
        vf = va * Math.pow((1 + i / 100), n);
        I = vf - va;

        // Salida de datos
        System.out.printf("El valor futuro es: %.2f%n", vf);
        System.out.printf("El interés generado es: %.2f%n", I);
    }
}
