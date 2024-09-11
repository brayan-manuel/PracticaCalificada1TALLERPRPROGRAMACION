package BrayanCuivin;
import java.util.Scanner;
public class Ejercisio03PC1 {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner lectura = new Scanner(System.in);

        // Declaración de variables
        double sueldo1, sueldo2, sueldo3, sueldo4, sueldo5;
        double totalSueldos, promedioSueldos, sueldoMenor;

        // Entrada de datos: Ingresar los sueldos de los empleados
        System.out.print("Ingrese el sueldo del empleado 1: ");
        sueldo1 = lectura.nextDouble();
        
        System.out.print("Ingrese el sueldo del empleado 2: ");
        sueldo2 = lectura.nextDouble();
        
        System.out.print("Ingrese el sueldo del empleado 3: ");
        sueldo3 = lectura.nextDouble();
        
        System.out.print("Ingrese el sueldo del empleado 4: ");
        sueldo4 = lectura.nextDouble();
        
        System.out.print("Ingrese el sueldo del empleado 5: ");
        sueldo5 = lectura.nextDouble();

        // Proceso: Calcular el total de sueldos
        totalSueldos = sueldo1 + sueldo2 + sueldo3 + sueldo4 + sueldo5;

        // Proceso: Calcular el promedio de los sueldos
        promedioSueldos = totalSueldos / 5;

        // Proceso: Determinar el sueldo menor
        sueldoMenor = sueldo1; // Suponer que el primer sueldo es el menor inicialmente
        if (sueldo2 < sueldoMenor) {
            sueldoMenor = sueldo2;
        }
        if (sueldo3 < sueldoMenor) {
            sueldoMenor = sueldo3;
        }
        if (sueldo4 < sueldoMenor) {
            sueldoMenor = sueldo4;
        }
        if (sueldo5 < sueldoMenor) {
            sueldoMenor = sueldo5;
        }

        // Salida de datos: Mostrar el total, promedio y el sueldo menor
        System.out.printf("El total de sueldos es: %.2f%n", totalSueldos);
        System.out.printf("El promedio de sueldos es: %.2f%n", promedioSueldos);
        System.out.printf("El sueldo menor es: %.2f%n", sueldoMenor);
    }
}
