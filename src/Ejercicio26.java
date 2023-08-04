//Ejercicio No. 26: 
//Escribe un programa que pida al usuario una cadena y muestre cuántos caracteres tiene sin contar los espacios en blanco.

import java.util.Scanner;

public class Ejercicio26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            System.out.print("Ingrese una cadena: ");
            String cadena = scanner.nextLine();
            
            int cantidadCaracteres = contarCaracteresSinEspacios(cadena);
            
            System.out.println("La cadena tiene " + cantidadCaracteres + " caracteres (sin contar espacios).");
        } catch (Exception e) {
            System.out.println("Error: Ingrese una cadena válida.");
        }
        
        scanner.close();
    }
    
    public static int contarCaracteresSinEspacios(String cadena) {
        return cadena.replaceAll("\\s+", "").length();
    }
}
