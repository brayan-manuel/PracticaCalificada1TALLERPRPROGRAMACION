package BrayanCuivin;
import java.util.Scanner;
public class Ejercisio04PC1 {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner lectura = new Scanner(System.in);

        // Declaración de variables
        int numero, idioma;
        String traducido = "";

        // Entrada de datos
        System.out.print("Ingrese un numero (1-6): ");
        numero = lectura.nextInt();
        
        System.out.print("Ingrese el tipo de idioma (1: Español, 2: Ingles, 3: Portugues, 4: Frances): ");
        idioma = lectura.nextInt();

        // Proceso: Traducir el número al idioma seleccionado
        if (numero >= 1 && numero <= 6) {
            switch (idioma) {
                case 1: // Español
                    switch (numero) {
                        case 1: traducido = "uno"; break;
                        case 2: traducido = "dos"; break;
                        case 3: traducido = "tres"; break;
                        case 4: traducido = "cuatro"; break;
                        case 5: traducido = "cinco"; break;
                        case 6: traducido = "seis"; break;
                    }
                    break;
                case 2: // Inglés
                    switch (numero) {
                        case 1: traducido = "one"; break;
                        case 2: traducido = "two"; break;
                        case 3: traducido = "three"; break;
                        case 4: traducido = "four"; break;
                        case 5: traducido = "five"; break;
                        case 6: traducido = "six"; break;
                    }
                    break;
                case 3: // Portugués
                    switch (numero) {
                        case 1: traducido = "um"; break;
                        case 2: traducido = "dois"; break;
                        case 3: traducido = "três"; break;
                        case 4: traducido = "quatro"; break;
                        case 5: traducido = "cinco"; break;
                        case 6: traducido = "seis"; break;
                    }
                    break;
                case 4: // Francés
                    switch (numero) {
                        case 1: traducido = "un"; break;
                        case 2: traducido = "deux"; break;
                        case 3: traducido = "trois"; break;
                        case 4: traducido = "quatre"; break;
                        case 5: traducido = "cinq"; break;
                        case 6: traducido = "six"; break;
                    }
                    break;
            }
            // Salida de datos
            System.out.println("El numero traducido es: " + traducido);
        }
    }
}
