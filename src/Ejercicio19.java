//Ejercicio No. 19: 
//Escribir un programa que solicite al usuario su nombre y luego lo imprima en mayúsculas y minúsculas 

import java.util.Scanner;

public class Ejercicio19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese su nombre: ");
        String nombre = scanner.nextLine();
        
        String nombreMayusculas = nombre.toUpperCase();
        String nombreMinusculas = nombre.toLowerCase();
        
        System.out.println("Nombre en mayúsculas: " + nombreMayusculas);
        System.out.println("Nombre en minúsculas: " + nombreMinusculas);
        
        scanner.close();
    }
}
