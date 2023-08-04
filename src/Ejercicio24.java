//Ejercicio No. 24: 
//Realizar un programa que solicite al usuario una cadena y reemplace todas las apariciones de una letra específica por otra.

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            System.out.print("Ingrese una cadena: ");
            String cadena = scanner.nextLine();
            
            System.out.print("Ingrese la letra a reemplazar: ");
            char letraAntigua = obtenerLetra(scanner);
            
            System.out.print("Ingrese la nueva letra: ");
            char letraNueva = obtenerLetra(scanner);
            
            String cadenaReemplazada = reemplazarLetra(cadena, letraAntigua, letraNueva);
            
            System.out.println("Cadena con reemplazo: " + cadenaReemplazada);
        } catch (Exception e) {
            System.out.println("Error: Ingrese valores válidos");
        }
        
        scanner.close();
    }
    
    public static char obtenerLetra(Scanner scanner) {
        char letra = ' ';
        boolean entradaValida = false;
        
        while (!entradaValida) {
            try {
                letra = scanner.next().charAt(0);
                entradaValida = true;
            } catch (InputMismatchException e) {
                System.out.println("Error: Ingrese un valor válido");
                scanner.nextLine(); // Limpiar el búfer del scanner
            }
        }
        
        return letra;
    }
    
    public static String reemplazarLetra(String cadena, char letraAntigua, char letraNueva) {
        return cadena.replace(letraAntigua, letraNueva);
    }
}
