//Ejercicio No. 20: 
//Realizar un programa que solicite al usuario una cadena y luego inviertir su orden

import java.util.Scanner;

public class Ejercicio20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese una cadena: ");
        String cadena = scanner.nextLine();
        
        String cadenaInvertida = invertirCadena(cadena);
        
        System.out.println("Cadena invertida: " + cadenaInvertida);
        
        scanner.close();
    }
    
    public static String invertirCadena(String cadena) {
        StringBuilder cadenaInvertida = new StringBuilder(cadena);
        cadenaInvertida.reverse();
        return cadenaInvertida.toString();
    }
}
