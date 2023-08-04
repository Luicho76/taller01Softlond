//Ejercicio No. 23: 
//Crear un programa que pida al usuario una oración y muestre cuántas palabras contiene

import java.util.Scanner;

public class Ejercicio23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            System.out.print("Ingrese una oración: ");
            String oracion = scanner.nextLine();
            
            int cantidadPalabras = contarPalabras(oracion);
            
            System.out.println("La oración contiene " + cantidadPalabras + " palabra(s).");
        } catch (Exception e) {
            System.out.println("Error: Ingrese una oración válida.");
        }
        
        scanner.close();
    }
    
    public static int contarPalabras(String oracion) {
        String[] palabras = oracion.split("\\s+");
        return palabras.length;
    }
}
