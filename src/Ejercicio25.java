//Ejercicio No. 25: 
//Pedir al usuario una frase y muestra cada palabra por separado. 

import java.util.Scanner;

public class Ejercicio25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            System.out.print("Ingrese una frase: ");
            String frase = scanner.nextLine();
            
            String[] palabras = obtenerPalabras(frase);
            
            System.out.println("Palabras en la frase:");
            for (String palabra : palabras) {
                System.out.println(palabra);
            }
        } catch (Exception e) {
            System.out.println("Error: Ingrese una frase válida.");
        }
        
        scanner.close();
    }
    
    public static String[] obtenerPalabras(String frase) {
        return frase.split("\\s+");
    }
}
