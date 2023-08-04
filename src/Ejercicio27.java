//Ejercicio No. 27: 
//Crear un programa que solicite al usuario una frase y luego muestre las palabras ordenadas alfabéticamente. 

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            System.out.print("Ingrese una frase: ");
            String frase = scanner.nextLine();
            
            String[] palabrasOrdenadas = ordenarPalabrasAlfabeticamente(frase);
            
            System.out.println("Palabras ordenadas alfabéticamente:");
            for (String palabra : palabrasOrdenadas) {
                System.out.println(palabra);
            }
        } catch (Exception e) {
            System.out.println("Error: Ingrese una frase válida.");
        }
        
        scanner.close();
    }
    
    public static String[] ordenarPalabrasAlfabeticamente(String frase) {
        String[] palabras = frase.split("\\s+");
        Arrays.sort(palabras);
        return palabras;
    }
}
