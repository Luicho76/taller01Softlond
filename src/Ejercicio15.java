//Ejercicico No. 15: 
//Crea un programa que pida al usuario un número entero y determine si es un número capicúa. Un número capicúa es aquel que se lee igual de izquierda a derecha que de derecha a izquierda.

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            System.out.print("Ingrese un número entero: ");
            int numero = scanner.nextInt();
            
            if (esCapicua(numero)) {
                System.out.println(numero + " es un número capicúa.");
            } else {
                System.out.println(numero + " no es un número capicúa.");
            }
        } catch (InputMismatchException e) {
            System.out.println("Error: Ingrese un número entero válido.");
        }
        
        scanner.close();
    }
    
    public static boolean esCapicua(int numero) {
        String numeroStr = Integer.toString(numero);
        String numeroInvertido = new StringBuilder(numeroStr).reverse().toString();
        
        return numeroStr.equals(numeroInvertido);
    }
}
