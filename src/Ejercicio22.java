//Ejercicio No. 22: 
//Escribir un programa que solicite al usuario una frase y verifique si es un palíndromo (se lee igual de izquierda a derecha que de derecha a izquierda) 

import java.util.Scanner;

public class Ejercicio22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            System.out.print("Ingrese una frase: ");
            String frase = scanner.nextLine();
            
            if (esPalindromo(frase)) {
                System.out.println("La frase es un palíndromo.");
            } else {
                System.out.println("La frase no es un palíndromo.");
            }
        } catch (Exception e) {
            System.out.println("Error: Ingrese una frase válida.");
        }
        
        scanner.close();
    }
    
    public static boolean esPalindromo(String frase) {
        String fraseFormateada = frase.toLowerCase().replaceAll("[^a-z]", "");
        StringBuilder cadenaInvertida = new StringBuilder(fraseFormateada).reverse();
        return fraseFormateada.equals(cadenaInvertida.toString());
    }
}
